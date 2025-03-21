/*
 *
 *  * Copyright (C) 2015 Square, Inc.
 *  *
 *  * Licensed under the Apache License, Version 2.0 (the "License");
 *  * you may not use this file except in compliance with the License.
 *  * You may obtain a copy of the License at
 *  *
 *  *      http://www.apache.org/licenses/LICENSE-2.0
 *  *
 *  * Unless required by applicable law or agreed to in writing, software
 *  * distributed under the License is distributed on an "AS IS" BASIS,
 *  * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  * See the License for the specific language governing permissions and
 *  * limitations under the License.
 *
 */
package com.lark.oapi.okhttp;

import com.lark.oapi.okhttp.internal.Internal;
import com.lark.oapi.okhttp.internal.Util;
import com.lark.oapi.okhttp.internal.cache.InternalCache;
import com.lark.oapi.okhttp.internal.connection.Exchange;
import com.lark.oapi.okhttp.internal.connection.RealConnectionPool;
import com.lark.oapi.okhttp.internal.platform.Platform;
import com.lark.oapi.okhttp.internal.proxy.NullProxySelector;
import com.lark.oapi.okhttp.internal.tls.CertificateChainCleaner;
import com.lark.oapi.okhttp.internal.tls.OkHostnameVerifier;
import com.lark.oapi.okhttp.internal.ws.RealWebSocket;
import com.lark.oapi.okio.Sink;
import com.lark.oapi.okio.Source;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.*;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * Factory for {@linkplain Call calls}, which can be used to send HTTP requests and read their
 * responses.
 *
 * <h3>OkHttpClients should be shared</h3>
 *
 * <p>OkHttp performs best when you create a single {@code OkHttpClient} instance and reuse it for
 * all of your HTTP calls. This is because each client holds its own connection pool and thread
 * pools. Reusing connections and threads reduces latency and saves memory. Conversely, creating a
 * client for each request wastes resources on idle pools.
 *
 * <p>Use {@code new OkHttpClient()} to create a shared instance with the default settings:
 * <pre>   {@code
 *
 *   // The singleton HTTP client.
 *   public final OkHttpClient client = new OkHttpClient();
 * }</pre>
 *
 * <p>Or use {@code new OkHttpClient.Builder()} to create a shared instance with custom settings:
 * <pre>   {@code
 *
 *   // The singleton HTTP client.
 *   public final OkHttpClient client = new OkHttpClient.Builder()
 *       .addInterceptor(new HttpLoggingInterceptor())
 *       .cache(new Cache(cacheDir, cacheSize))
 *       .build();
 * }</pre>
 *
 * <h3>Customize your client with newBuilder()</h3>
 *
 * <p>You can customize a shared OkHttpClient instance with {@link #newBuilder()}. This builds a
 * client that shares the same connection pool, thread pools, and configuration. Use the builder
 * methods to configure the derived client for a specific purpose.
 *
 * <p>This example shows a call with a short 500 millisecond timeout: <pre>   {@code
 *
 *   OkHttpClient eagerClient = client.newBuilder()
 *       .readTimeout(500, TimeUnit.MILLISECONDS)
 *       .build();
 *   Response response = eagerClient.newCall(request).execute();
 * }</pre>
 *
 * <h3>Shutdown isn't necessary</h3>
 *
 * <p>The threads and connections that are held will be released automatically if they remain idle.
 * But if you are writing a application that needs to aggressively release unused resources you may
 * do so.
 *
 * <p>Shutdown the dispatcher's executor service with {@link ExecutorService#shutdown shutdown()}.
 * This will also cause future calls to the client to be rejected. <pre>   {@code
 *
 *     client.dispatcher().executorService().shutdown();
 * }</pre>
 *
 * <p>Clear the connection pool with {@link ConnectionPool#evictAll() evictAll()}. Note that the
 * connection pool's daemon thread may not exit immediately. <pre>   {@code
 *
 *     client.connectionPool().evictAll();
 * }</pre>
 *
 * <p>If your client has a cache, call {@link Cache#close close()}. Note that it is an error to
 * create calls against a cache that is closed, and doing so will cause the call to crash.
 * <pre>   {@code
 *
 *     client.cache().close();
 * }</pre>
 *
 * <p>OkHttp also uses daemon threads for HTTP/2 connections. These will exit automatically if they
 * remain idle.
 */
public class OkHttpClient implements Cloneable, Call.Factory, WebSocket.Factory {

    static final List<Protocol> DEFAULT_PROTOCOLS = Util.immutableList(
            Protocol.HTTP_2, Protocol.HTTP_1_1);

    static final List<ConnectionSpec> DEFAULT_CONNECTION_SPECS = Util.immutableList(
            ConnectionSpec.MODERN_TLS, ConnectionSpec.CLEARTEXT);

    static {
        Internal.instance = new Internal() {
            @Override
            public void addLenient(Headers.Builder builder, String line) {
                builder.addLenient(line);
            }

            @Override
            public void addLenient(Headers.Builder builder, String name, String value) {
                builder.addLenient(name, value);
            }

            @Override
            public RealConnectionPool realConnectionPool(ConnectionPool connectionPool) {
                return connectionPool.delegate;
            }

            @Override
            public boolean equalsNonHost(Address a, Address b) {
                return a.equalsNonHost(b);
            }

            @Override
            public int code(Response.Builder responseBuilder) {
                return responseBuilder.code;
            }

            @Override
            public void apply(ConnectionSpec tlsConfiguration, SSLSocket sslSocket, boolean isFallback) {
                tlsConfiguration.apply(sslSocket, isFallback);
            }

            @Override
            public Call newWebSocketCall(OkHttpClient client, Request originalRequest) {
                return RealCall.newRealCall(client, originalRequest, true);
            }

            @Override
            public void initExchange(
                    Response.Builder responseBuilder, Exchange exchange) {
                responseBuilder.initExchange(exchange);
            }

            @Override
            public @Nullable
            Exchange exchange(Response response) {
                return response.exchange;
            }
        };
    }

    final Dispatcher dispatcher;
    final @Nullable
    Proxy proxy;
    final List<Protocol> protocols;
    final List<ConnectionSpec> connectionSpecs;
    final List<Interceptor> interceptors;
    final List<Interceptor> networkInterceptors;
    final EventListener.Factory eventListenerFactory;
    final ProxySelector proxySelector;
    final CookieJar cookieJar;
    final @Nullable
    Cache cache;
    final @Nullable
    InternalCache internalCache;
    final SocketFactory socketFactory;
    final SSLSocketFactory sslSocketFactory;
    final CertificateChainCleaner certificateChainCleaner;
    final HostnameVerifier hostnameVerifier;
    final CertificatePinner certificatePinner;
    final Authenticator proxyAuthenticator;
    final Authenticator authenticator;
    final ConnectionPool connectionPool;
    final Dns dns;
    final boolean followSslRedirects;
    final boolean followRedirects;
    final boolean retryOnConnectionFailure;
    final int callTimeout;
    final int connectTimeout;
    final int readTimeout;
    final int writeTimeout;
    final int pingInterval;

    public OkHttpClient() {
        this(new Builder());
    }

    OkHttpClient(Builder builder) {
        this.dispatcher = builder.dispatcher;
        this.proxy = builder.proxy;
        this.protocols = builder.protocols;
        this.connectionSpecs = builder.connectionSpecs;
        this.interceptors = Util.immutableList(builder.interceptors);
        this.networkInterceptors = Util.immutableList(builder.networkInterceptors);
        this.eventListenerFactory = builder.eventListenerFactory;
        this.proxySelector = builder.proxySelector;
        this.cookieJar = builder.cookieJar;
        this.cache = builder.cache;
        this.internalCache = builder.internalCache;
        this.socketFactory = builder.socketFactory;

        boolean isTLS = false;
        for (ConnectionSpec spec : connectionSpecs) {
            isTLS = isTLS || spec.isTls();
        }

        if (builder.sslSocketFactory != null || !isTLS) {
            this.sslSocketFactory = builder.sslSocketFactory;
            this.certificateChainCleaner = builder.certificateChainCleaner;
        } else {
            X509TrustManager trustManager = Util.platformTrustManager();
            this.sslSocketFactory = newSslSocketFactory(trustManager);
            this.certificateChainCleaner = CertificateChainCleaner.get(trustManager);
        }

        if (sslSocketFactory != null) {
            Platform.get().configureSslSocketFactory(sslSocketFactory);
        }

        this.hostnameVerifier = builder.hostnameVerifier;
        this.certificatePinner = builder.certificatePinner.withCertificateChainCleaner(
                certificateChainCleaner);
        this.proxyAuthenticator = builder.proxyAuthenticator;
        this.authenticator = builder.authenticator;
        this.connectionPool = builder.connectionPool;
        this.dns = builder.dns;
        this.followSslRedirects = builder.followSslRedirects;
        this.followRedirects = builder.followRedirects;
        this.retryOnConnectionFailure = builder.retryOnConnectionFailure;
        this.callTimeout = builder.callTimeout;
        this.connectTimeout = builder.connectTimeout;
        this.readTimeout = builder.readTimeout;
        this.writeTimeout = builder.writeTimeout;
        this.pingInterval = builder.pingInterval;

        if (interceptors.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + interceptors);
        }
        if (networkInterceptors.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + networkInterceptors);
        }
    }

    private static SSLSocketFactory newSslSocketFactory(X509TrustManager trustManager) {
        try {
            SSLContext sslContext = Platform.get().getSSLContext();
            sslContext.init(null, new TrustManager[]{trustManager}, null);
            return sslContext.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw new AssertionError("No System TLS", e); // The system has no TLS. Just give up.
        }
    }

    /**
     * Default call timeout (in milliseconds). By default there is no timeout for complete calls, but
     * there is for the connect, write, and read actions within a call.
     */
    public int callTimeoutMillis() {
        return callTimeout;
    }

    /**
     * Default connect timeout (in milliseconds). The default is 10 seconds.
     */
    public int connectTimeoutMillis() {
        return connectTimeout;
    }

    /**
     * Default read timeout (in milliseconds). The default is 10 seconds.
     */
    public int readTimeoutMillis() {
        return readTimeout;
    }

    /**
     * Default write timeout (in milliseconds). The default is 10 seconds.
     */
    public int writeTimeoutMillis() {
        return writeTimeout;
    }

    /**
     * Web socket and HTTP/2 ping interval (in milliseconds). By default pings are not sent.
     */
    public int pingIntervalMillis() {
        return pingInterval;
    }

    public @Nullable
    Proxy proxy() {
        return proxy;
    }

    public ProxySelector proxySelector() {
        return proxySelector;
    }

    public CookieJar cookieJar() {
        return cookieJar;
    }

    public @Nullable
    Cache cache() {
        return cache;
    }

    @Nullable
    InternalCache internalCache() {
        return cache != null ? cache.internalCache : internalCache;
    }

    public Dns dns() {
        return dns;
    }

    public SocketFactory socketFactory() {
        return socketFactory;
    }

    public SSLSocketFactory sslSocketFactory() {
        return sslSocketFactory;
    }

    public HostnameVerifier hostnameVerifier() {
        return hostnameVerifier;
    }

    public CertificatePinner certificatePinner() {
        return certificatePinner;
    }

    public Authenticator authenticator() {
        return authenticator;
    }

    public Authenticator proxyAuthenticator() {
        return proxyAuthenticator;
    }

    public ConnectionPool connectionPool() {
        return connectionPool;
    }

    public boolean followSslRedirects() {
        return followSslRedirects;
    }

    public boolean followRedirects() {
        return followRedirects;
    }

    public boolean retryOnConnectionFailure() {
        return retryOnConnectionFailure;
    }

    public Dispatcher dispatcher() {
        return dispatcher;
    }

    public List<Protocol> protocols() {
        return protocols;
    }

    public List<ConnectionSpec> connectionSpecs() {
        return connectionSpecs;
    }

    /**
     * Returns an immutable list of interceptors that observe the full span of each call: from before
     * the connection is established (if any) until after the response source is selected (either the
     * origin server, cache, or both).
     */
    public List<Interceptor> interceptors() {
        return interceptors;
    }

    /**
     * Returns an immutable list of interceptors that observe a single network request and response.
     * These interceptors must call {@link Interceptor.Chain#proceed} exactly once: it is an error for
     * a network interceptor to short-circuit or repeat a network request.
     */
    public List<Interceptor> networkInterceptors() {
        return networkInterceptors;
    }

    public EventListener.Factory eventListenerFactory() {
        return eventListenerFactory;
    }

    /**
     * Prepares the {@code request} to be executed at some point in the future.
     */
    @Override
    public Call newCall(Request request) {
        return RealCall.newRealCall(this, request, false /* for web socket */);
    }

    /**
     * Uses {@code request} to connect a new web socket.
     */
    @Override
    public WebSocket newWebSocket(Request request, WebSocketListener listener) {
        RealWebSocket webSocket = new RealWebSocket(request, listener, new Random(), pingInterval);
        webSocket.connect(this);
        return webSocket;
    }

    public Builder newBuilder() {
        return new Builder(this);
    }

    public static final class Builder {

        final List<Interceptor> interceptors = new ArrayList<>();
        final List<Interceptor> networkInterceptors = new ArrayList<>();
        Dispatcher dispatcher;
        @Nullable
        Proxy proxy;
        List<Protocol> protocols;
        List<ConnectionSpec> connectionSpecs;
        EventListener.Factory eventListenerFactory;
        ProxySelector proxySelector;
        CookieJar cookieJar;
        @Nullable
        Cache cache;
        @Nullable
        InternalCache internalCache;
        SocketFactory socketFactory;
        @Nullable
        SSLSocketFactory sslSocketFactory;
        @Nullable
        CertificateChainCleaner certificateChainCleaner;
        HostnameVerifier hostnameVerifier;
        CertificatePinner certificatePinner;
        Authenticator proxyAuthenticator;
        Authenticator authenticator;
        ConnectionPool connectionPool;
        Dns dns;
        boolean followSslRedirects;
        boolean followRedirects;
        boolean retryOnConnectionFailure;
        int callTimeout;
        int connectTimeout;
        int readTimeout;
        int writeTimeout;
        int pingInterval;

        public Builder() {
            dispatcher = new Dispatcher();
            protocols = DEFAULT_PROTOCOLS;
            connectionSpecs = DEFAULT_CONNECTION_SPECS;
            eventListenerFactory = EventListener.factory(EventListener.NONE);
            proxySelector = ProxySelector.getDefault();
            if (proxySelector == null) {
                proxySelector = new NullProxySelector();
            }
            cookieJar = CookieJar.NO_COOKIES;
            socketFactory = SocketFactory.getDefault();
            hostnameVerifier = OkHostnameVerifier.INSTANCE;
            certificatePinner = CertificatePinner.DEFAULT;
            proxyAuthenticator = Authenticator.NONE;
            authenticator = Authenticator.NONE;
            connectionPool = new ConnectionPool();
            dns = Dns.SYSTEM;
            followSslRedirects = true;
            followRedirects = true;
            retryOnConnectionFailure = true;
            callTimeout = 0;
            connectTimeout = 10_000;
            readTimeout = 10_000;
            writeTimeout = 10_000;
            pingInterval = 0;
        }

        Builder(OkHttpClient okHttpClient) {
            this.dispatcher = okHttpClient.dispatcher;
            this.proxy = okHttpClient.proxy;
            this.protocols = okHttpClient.protocols;
            this.connectionSpecs = okHttpClient.connectionSpecs;
            this.interceptors.addAll(okHttpClient.interceptors);
            this.networkInterceptors.addAll(okHttpClient.networkInterceptors);
            this.eventListenerFactory = okHttpClient.eventListenerFactory;
            this.proxySelector = okHttpClient.proxySelector;
            this.cookieJar = okHttpClient.cookieJar;
            this.internalCache = okHttpClient.internalCache;
            this.cache = okHttpClient.cache;
            this.socketFactory = okHttpClient.socketFactory;
            this.sslSocketFactory = okHttpClient.sslSocketFactory;
            this.certificateChainCleaner = okHttpClient.certificateChainCleaner;
            this.hostnameVerifier = okHttpClient.hostnameVerifier;
            this.certificatePinner = okHttpClient.certificatePinner;
            this.proxyAuthenticator = okHttpClient.proxyAuthenticator;
            this.authenticator = okHttpClient.authenticator;
            this.connectionPool = okHttpClient.connectionPool;
            this.dns = okHttpClient.dns;
            this.followSslRedirects = okHttpClient.followSslRedirects;
            this.followRedirects = okHttpClient.followRedirects;
            this.retryOnConnectionFailure = okHttpClient.retryOnConnectionFailure;
            this.callTimeout = okHttpClient.callTimeout;
            this.connectTimeout = okHttpClient.connectTimeout;
            this.readTimeout = okHttpClient.readTimeout;
            this.writeTimeout = okHttpClient.writeTimeout;
            this.pingInterval = okHttpClient.pingInterval;
        }

        /**
         * Sets the default timeout for complete calls. A value of 0 means no timeout, otherwise values
         * must be between 1 and {@link Integer#MAX_VALUE} when converted to milliseconds.
         *
         * <p>The call timeout spans the entire call: resolving DNS, connecting, writing the request
         * body, server processing, and reading the response body. If the call requires redirects or
         * retries all must complete within one timeout period.
         *
         * <p>The default value is 0 which imposes no timeout.
         */
        public Builder callTimeout(long timeout, TimeUnit unit) {
            callTimeout = Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        /**
         * Sets the default timeout for complete calls. A value of 0 means no timeout, otherwise values
         * must be between 1 and {@link Integer#MAX_VALUE} when converted to milliseconds.
         *
         * <p>The call timeout spans the entire call: resolving DNS, connecting, writing the request
         * body, server processing, and reading the response body. If the call requires redirects or
         * retries all must complete within one timeout period.
         *
         * <p>The default value is 0 which imposes no timeout.
         */
        @IgnoreJRERequirement
        public Builder callTimeout(Duration duration) {
            callTimeout = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /**
         * Sets the default connect timeout for new connections. A value of 0 means no timeout,
         * otherwise values must be between 1 and {@link Integer#MAX_VALUE} when converted to
         * milliseconds.
         *
         * <p>The connect timeout is applied when connecting a TCP socket to the target host.
         * The default value is 10 seconds.
         */
        public Builder connectTimeout(long timeout, TimeUnit unit) {
            connectTimeout = Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        /**
         * Sets the default connect timeout for new connections. A value of 0 means no timeout,
         * otherwise values must be between 1 and {@link Integer#MAX_VALUE} when converted to
         * milliseconds.
         *
         * <p>The connect timeout is applied when connecting a TCP socket to the target host.
         * The default value is 10 seconds.
         */
        @IgnoreJRERequirement
        public Builder connectTimeout(Duration duration) {
            connectTimeout = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /**
         * Sets the default read timeout for new connections. A value of 0 means no timeout, otherwise
         * values must be between 1 and {@link Integer#MAX_VALUE} when converted to milliseconds.
         *
         * <p>The read timeout is applied to both the TCP socket and for individual read IO operations
         * including on {@link Source} of the {@link Response}. The default value is 10 seconds.
         *
         * @see Socket#setSoTimeout(int)
         * @see Source#timeout()
         */
        public Builder readTimeout(long timeout, TimeUnit unit) {
            readTimeout = Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        /**
         * Sets the default read timeout for new connections. A value of 0 means no timeout, otherwise
         * values must be between 1 and {@link Integer#MAX_VALUE} when converted to milliseconds.
         *
         * <p>The read timeout is applied to both the TCP socket and for individual read IO operations
         * including on {@link Source} of the {@link Response}. The default value is 10 seconds.
         *
         * @see Socket#setSoTimeout(int)
         * @see Source#timeout()
         */
        @IgnoreJRERequirement
        public Builder readTimeout(Duration duration) {
            readTimeout = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /**
         * Sets the default write timeout for new connections. A value of 0 means no timeout, otherwise
         * values must be between 1 and {@link Integer#MAX_VALUE} when converted to milliseconds.
         *
         * <p>The write timeout is applied for individual write IO operations.
         * The default value is 10 seconds.
         *
         * @see Sink#timeout()
         */
        public Builder writeTimeout(long timeout, TimeUnit unit) {
            writeTimeout = Util.checkDuration("timeout", timeout, unit);
            return this;
        }

        /**
         * Sets the default write timeout for new connections. A value of 0 means no timeout, otherwise
         * values must be between 1 and {@link Integer#MAX_VALUE} when converted to milliseconds.
         *
         * <p>The write timeout is applied for individual write IO operations.
         * The default value is 10 seconds.
         *
         * @see Sink#timeout()
         */
        @IgnoreJRERequirement
        public Builder writeTimeout(Duration duration) {
            writeTimeout = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /**
         * Sets the interval between HTTP/2 and web socket pings initiated by this client. Use this to
         * automatically send ping frames until either the connection fails or it is closed. This keeps
         * the connection alive and may detect connectivity failures.
         *
         * <p>If the server does not respond to each ping with a pong within {@code interval}, this
         * client will assume that connectivity has been lost. When this happens on a web socket the
         * connection is canceled and its listener is {@linkplain WebSocketListener#onFailure notified
         * of the failure}. When it happens on an HTTP/2 connection the connection is closed and any
         * calls it is carrying {@linkplain java.io.IOException will fail with an IOException}.
         *
         * <p>The default value of 0 disables client-initiated pings.
         */
        public Builder pingInterval(long interval, TimeUnit unit) {
            pingInterval = Util.checkDuration("interval", interval, unit);
            return this;
        }

        /**
         * Sets the interval between HTTP/2 and web socket pings initiated by this client. Use this to
         * automatically send ping frames until either the connection fails or it is closed. This keeps
         * the connection alive and may detect connectivity failures.
         *
         * <p>If the server does not respond to each ping with a pong within {@code interval}, this
         * client will assume that connectivity has been lost. When this happens on a web socket the
         * connection is canceled and its listener is {@linkplain WebSocketListener#onFailure notified
         * of the failure}. When it happens on an HTTP/2 connection the connection is closed and any
         * calls it is carrying {@linkplain java.io.IOException will fail with an IOException}.
         *
         * <p>The default value of 0 disables client-initiated pings.
         */
        @IgnoreJRERequirement
        public Builder pingInterval(Duration duration) {
            pingInterval = Util.checkDuration("timeout", duration.toMillis(), TimeUnit.MILLISECONDS);
            return this;
        }

        /**
         * Sets the HTTP proxy that will be used by connections created by this client. This takes
         * precedence over {@link #proxySelector}, which is only honored when this proxy is null (which
         * it is by default). To disable proxy use completely, call {@code proxy(Proxy.NO_PROXY)}.
         */
        public Builder proxy(@Nullable Proxy proxy) {
            this.proxy = proxy;
            return this;
        }

        /**
         * Sets the proxy selection policy to be used if no {@link #proxy proxy} is specified
         * explicitly. The proxy selector may return multiple proxies; in that case they will be tried
         * in sequence until a successful connection is established.
         *
         * <p>If unset, the {@link ProxySelector#getDefault() system-wide default} proxy selector will
         * be used.
         */
        public Builder proxySelector(ProxySelector proxySelector) {
            if (proxySelector == null) {
                throw new NullPointerException("proxySelector == null");
            }
            this.proxySelector = proxySelector;
            return this;
        }

        /**
         * Sets the handler that can accept cookies from incoming HTTP responses and provides cookies to
         * outgoing HTTP requests.
         *
         * <p>If unset, {@linkplain CookieJar#NO_COOKIES no cookies} will be accepted nor provided.
         */
        public Builder cookieJar(CookieJar cookieJar) {
            if (cookieJar == null) {
                throw new NullPointerException("cookieJar == null");
            }
            this.cookieJar = cookieJar;
            return this;
        }

        /**
         * Sets the response cache to be used to read and write cached responses.
         */
        public Builder cache(@Nullable Cache cache) {
            this.cache = cache;
            this.internalCache = null;
            return this;
        }

        /**
         * Sets the DNS service used to lookup IP addresses for hostnames.
         *
         * <p>If unset, the {@link Dns#SYSTEM system-wide default} DNS will be used.
         */
        public Builder dns(Dns dns) {
            if (dns == null) {
                throw new NullPointerException("dns == null");
            }
            this.dns = dns;
            return this;
        }

        /**
         * Sets the socket factory used to create connections. OkHttp only uses the parameterless {@link
         * SocketFactory#createSocket() createSocket()} method to create unconnected sockets. Overriding
         * this method, e. g., allows the socket to be bound to a specific local address.
         *
         * <p>If unset, the {@link SocketFactory#getDefault() system-wide default} socket factory will
         * be used.
         */
        public Builder socketFactory(SocketFactory socketFactory) {
            if (socketFactory == null) {
                throw new NullPointerException("socketFactory == null");
            }
            if (socketFactory instanceof SSLSocketFactory) {
                throw new IllegalArgumentException("socketFactory instanceof SSLSocketFactory");
            }
            this.socketFactory = socketFactory;
            return this;
        }

        /**
         * Sets the socket factory used to secure HTTPS connections. If unset, the system default will
         * be used.
         *
         * @deprecated {@code SSLSocketFactory} does not expose its {@link X509TrustManager}, which is a
         * field that OkHttp needs to build a clean certificate chain. This method instead must use
         * reflection to extract the trust manager. Applications should prefer to call {@link
         * #sslSocketFactory(SSLSocketFactory, X509TrustManager)}, which avoids such reflection.
         */
        public Builder sslSocketFactory(SSLSocketFactory sslSocketFactory) {
            if (sslSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            }
            this.sslSocketFactory = sslSocketFactory;
            this.certificateChainCleaner = Platform.get().buildCertificateChainCleaner(sslSocketFactory);
            return this;
        }

        /**
         * Sets the socket factory and trust manager used to secure HTTPS connections. If unset, the
         * system defaults will be used.
         *
         * <p>Most applications should not call this method, and instead use the system defaults. Those
         * classes include special optimizations that can be lost if the implementations are decorated.
         *
         * <p>If necessary, you can create and configure the defaults yourself with the following code:
         *
         * <pre>   {@code
         *
         *   TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(
         *       TrustManagerFactory.getDefaultAlgorithm());
         *   trustManagerFactory.init((KeyStore) null);
         *   TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
         *   if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
         *     throw new IllegalStateException("Unexpected default trust managers:"
         *         + Arrays.toString(trustManagers));
         *   }
         *   X509TrustManager trustManager = (X509TrustManager) trustManagers[0];
         *
         *   SSLContext sslContext = SSLContext.getInstance("TLS");
         *   sslContext.init(null, new TrustManager[] { trustManager }, null);
         *   SSLSocketFactory sslSocketFactory = sslContext.getSocketFactory();
         *
         *   OkHttpClient client = new OkHttpClient.Builder()
         *       .sslSocketFactory(sslSocketFactory, trustManager)
         *       .build();
         * }</pre>
         */
        public Builder sslSocketFactory(
                SSLSocketFactory sslSocketFactory, X509TrustManager trustManager) {
            if (sslSocketFactory == null) {
                throw new NullPointerException("sslSocketFactory == null");
            }
            if (trustManager == null) {
                throw new NullPointerException("trustManager == null");
            }
            this.sslSocketFactory = sslSocketFactory;
            this.certificateChainCleaner = CertificateChainCleaner.get(trustManager);
            return this;
        }

        /**
         * Sets the verifier used to confirm that response certificates apply to requested hostnames for
         * HTTPS connections.
         *
         * <p>If unset, a default hostname verifier will be used.
         */
        public Builder hostnameVerifier(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier == null) {
                throw new NullPointerException("hostnameVerifier == null");
            }
            this.hostnameVerifier = hostnameVerifier;
            return this;
        }

        /**
         * Sets the certificate pinner that constrains which certificates are trusted. By default HTTPS
         * connections rely on only the {@link #sslSocketFactory SSL socket factory} to establish trust.
         * Pinning certificates avoids the need to trust certificate authorities.
         */
        public Builder certificatePinner(CertificatePinner certificatePinner) {
            if (certificatePinner == null) {
                throw new NullPointerException("certificatePinner == null");
            }
            this.certificatePinner = certificatePinner;
            return this;
        }

        /**
         * Sets the authenticator used to respond to challenges from origin servers. Use {@link
         * #proxyAuthenticator} to set the authenticator for proxy servers.
         *
         * <p>If unset, the {@linkplain Authenticator#NONE no authentication will be attempted}.
         */
        public Builder authenticator(Authenticator authenticator) {
            if (authenticator == null) {
                throw new NullPointerException("authenticator == null");
            }
            this.authenticator = authenticator;
            return this;
        }

        /**
         * Sets the authenticator used to respond to challenges from proxy servers. Use {@link
         * #authenticator} to set the authenticator for origin servers.
         *
         * <p>If unset, the {@linkplain Authenticator#NONE no authentication will be attempted}.
         */
        public Builder proxyAuthenticator(Authenticator proxyAuthenticator) {
            if (proxyAuthenticator == null) {
                throw new NullPointerException("proxyAuthenticator == null");
            }
            this.proxyAuthenticator = proxyAuthenticator;
            return this;
        }

        /**
         * Sets the connection pool used to recycle HTTP and HTTPS connections.
         *
         * <p>If unset, a new connection pool will be used.
         */
        public Builder connectionPool(ConnectionPool connectionPool) {
            if (connectionPool == null) {
                throw new NullPointerException("connectionPool == null");
            }
            this.connectionPool = connectionPool;
            return this;
        }

        /**
         * Configure this client to follow redirects from HTTPS to HTTP and from HTTP to HTTPS.
         *
         * <p>If unset, protocol redirects will be followed. This is different than the built-in {@code
         * HttpURLConnection}'s default.
         */
        public Builder followSslRedirects(boolean followProtocolRedirects) {
            this.followSslRedirects = followProtocolRedirects;
            return this;
        }

        /**
         * Configure this client to follow redirects. If unset, redirects will be followed.
         */
        public Builder followRedirects(boolean followRedirects) {
            this.followRedirects = followRedirects;
            return this;
        }

        /**
         * Configure this client to retry or not when a connectivity problem is encountered. By default,
         * this client silently recovers from the following problems:
         *
         * <ul>
         *   <li><strong>Unreachable IP addresses.</strong> If the URL's host has multiple IP addresses,
         *       failure to reach any individual IP address doesn't fail the overall request. This can
         *       increase availability of multi-homed services.
         *   <li><strong>Stale pooled connections.</strong> The {@link ConnectionPool} reuses sockets
         *       to decrease request latency, but these connections will occasionally time out.
         *   <li><strong>Unreachable proxy servers.</strong> A {@link ProxySelector} can be used to
         *       attempt multiple proxy servers in sequence, eventually falling back to a direct
         *       connection.
         * </ul>
         * <p>
         * Set this to false to avoid retrying requests when doing so is destructive. In this case the
         * calling application should do its own recovery of connectivity failures.
         */
        public Builder retryOnConnectionFailure(boolean retryOnConnectionFailure) {
            this.retryOnConnectionFailure = retryOnConnectionFailure;
            return this;
        }

        /**
         * Sets the dispatcher used to set policy and execute asynchronous requests. Must not be null.
         */
        public Builder dispatcher(Dispatcher dispatcher) {
            if (dispatcher == null) {
                throw new IllegalArgumentException("dispatcher == null");
            }
            this.dispatcher = dispatcher;
            return this;
        }

        /**
         * Configure the protocols used by this client to communicate with remote servers. By default
         * this client will prefer the most efficient transport available, falling back to more
         * ubiquitous protocols. Applications should only call this method to avoid specific
         * compatibility problems, such as web servers that behave incorrectly when HTTP/2 is enabled.
         *
         * <p>The following protocols are currently supported:
         *
         * <ul>
         *     <li><a href="http://www.w3.org/Protocols/rfc2616/rfc2616.html">http/1.1</a>
         *     <li><a href="https://tools.ietf.org/html/rfc7540">h2</a>
         *     <li><a href="https://tools.ietf.org/html/rfc7540#section-3.4">h2 with prior knowledge
         *         (cleartext only)</a>
         * </ul>
         *
         * <p><strong>This is an evolving set.</strong> Future releases include support for transitional
         * protocols. The http/1.1 transport will never be dropped.
         *
         * <p>If multiple protocols are specified, <a
         * href="http://tools.ietf.org/html/draft-ietf-tls-applayerprotoneg">ALPN</a> will be used to
         * negotiate a transport. Protocol negotiation is only attempted for HTTPS URLs.
         *
         * <p>{@link Protocol#HTTP_1_0} is not supported in this set. Requests are initiated with {@code
         * HTTP/1.1}. If the server responds with {@code HTTP/1.0}, that will be exposed by {@link
         * Response#protocol()}.
         *
         * @param protocols the protocols to use, in order of preference. If the list contains {@link
         *                  Protocol#H2_PRIOR_KNOWLEDGE} then that must be the only protocol and HTTPS
         *                  URLs will not be supported. Otherwise the list must contain {@link
         *                  Protocol#HTTP_1_1}. The list must not contain null or {@link
         *                  Protocol#HTTP_1_0}.
         */
        public Builder protocols(List<Protocol> protocols) {
            // Create a private copy of the list.
            protocols = new ArrayList<>(protocols);

            // Validate that the list has everything we require and nothing we forbid.
            if (!protocols.contains(Protocol.H2_PRIOR_KNOWLEDGE)
                    && !protocols.contains(Protocol.HTTP_1_1)) {
                throw new IllegalArgumentException(
                        "protocols must contain h2_prior_knowledge or http/1.1: " + protocols);
            }
            if (protocols.contains(Protocol.H2_PRIOR_KNOWLEDGE) && protocols.size() > 1) {
                throw new IllegalArgumentException(
                        "protocols containing h2_prior_knowledge cannot use other protocols: " + protocols);
            }
            if (protocols.contains(Protocol.HTTP_1_0)) {
                throw new IllegalArgumentException("protocols must not contain http/1.0: " + protocols);
            }
            if (protocols.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }

            // Remove protocols that we no longer support.
            protocols.remove(Protocol.SPDY_3);

            // Assign as an unmodifiable list. This is effectively immutable.
            this.protocols = Collections.unmodifiableList(protocols);
            return this;
        }

        public Builder connectionSpecs(List<ConnectionSpec> connectionSpecs) {
            this.connectionSpecs = Util.immutableList(connectionSpecs);
            return this;
        }

        /**
         * Returns a modifiable list of interceptors that observe the full span of each call: from
         * before the connection is established (if any) until after the response source is selected
         * (either the origin server, cache, or both).
         */
        public List<Interceptor> interceptors() {
            return interceptors;
        }

        public Builder addInterceptor(Interceptor interceptor) {
            if (interceptor == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            interceptors.add(interceptor);
            return this;
        }

        /**
         * Returns a modifiable list of interceptors that observe a single network request and response.
         * These interceptors must call {@link Interceptor.Chain#proceed} exactly once: it is an error
         * for a network interceptor to short-circuit or repeat a network request.
         */
        public List<Interceptor> networkInterceptors() {
            return networkInterceptors;
        }

        public Builder addNetworkInterceptor(Interceptor interceptor) {
            if (interceptor == null) {
                throw new IllegalArgumentException("interceptor == null");
            }
            networkInterceptors.add(interceptor);
            return this;
        }

        /**
         * Configure a single client scoped listener that will receive all analytic events for this
         * client.
         *
         * @see EventListener for semantics and restrictions on listener implementations.
         */
        public Builder eventListener(EventListener eventListener) {
            if (eventListener == null) {
                throw new NullPointerException("eventListener == null");
            }
            this.eventListenerFactory = EventListener.factory(eventListener);
            return this;
        }

        /**
         * Configure a factory to provide per-call scoped listeners that will receive analytic events
         * for this client.
         *
         * @see EventListener for semantics and restrictions on listener implementations.
         */
        public Builder eventListenerFactory(EventListener.Factory eventListenerFactory) {
            if (eventListenerFactory == null) {
                throw new NullPointerException("eventListenerFactory == null");
            }
            this.eventListenerFactory = eventListenerFactory;
            return this;
        }

        public OkHttpClient build() {
            return new OkHttpClient(this);
        }
    }
}
