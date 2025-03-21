// Code generated by lark suite oapi sdk gen
/*
 * MIT License
 *
 * Copyright (c) 2022 Lark Technologies Pte. Ltd.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice, shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

package com.lark.oapi.service.workplace.v1;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.service.workplace.v1.model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

public class WorkplaceService {
    private static final Logger log = LoggerFactory.getLogger(WorkplaceService.class);
    private final CustomWorkplaceAccessData customWorkplaceAccessData; // custom_workplace_access_data
    private final WorkplaceAccessData workplaceAccessData; // workplace_access_data
    private final WorkplaceBlockAccessData workplaceBlockAccessData; // workplace_block_access_data

    public WorkplaceService(Config config) {
        this.customWorkplaceAccessData = new CustomWorkplaceAccessData(config);
        this.workplaceAccessData = new WorkplaceAccessData(config);
        this.workplaceBlockAccessData = new WorkplaceBlockAccessData(config);
    }

    /**
     * custom_workplace_access_data
     *
     * @return
     */
    public CustomWorkplaceAccessData customWorkplaceAccessData() {
        return customWorkplaceAccessData;
    }

    /**
     * workplace_access_data
     *
     * @return
     */
    public WorkplaceAccessData workplaceAccessData() {
        return workplaceAccessData;
    }

    /**
     * workplace_block_access_data
     *
     * @return
     */
    public WorkplaceBlockAccessData workplaceBlockAccessData() {
        return workplaceBlockAccessData;
    }

    public static class CustomWorkplaceAccessData {
        private final Config config;

        public CustomWorkplaceAccessData(Config config) {
            this.config = config;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=search&project=workplace&resource=custom_workplace_access_data&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=search&project=workplace&resource=custom_workplace_access_data&version=v1</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/workplacev1/SearchCustomWorkplaceAccessDataSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/workplacev1/SearchCustomWorkplaceAccessDataSample.java</a> ;
         */
        public SearchCustomWorkplaceAccessDataResp search(SearchCustomWorkplaceAccessDataReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/workplace/v1/custom_workplace_access_data/search"
                    , Sets.newHashSet(AccessTokenType.Tenant)
                    , req);

            // 反序列化
            SearchCustomWorkplaceAccessDataResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SearchCustomWorkplaceAccessDataResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/workplace/v1/custom_workplace_access_data/search"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=search&project=workplace&resource=custom_workplace_access_data&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=search&project=workplace&resource=custom_workplace_access_data&version=v1</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/workplacev1/SearchCustomWorkplaceAccessDataSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/workplacev1/SearchCustomWorkplaceAccessDataSample.java</a> ;
         */
        public SearchCustomWorkplaceAccessDataResp search(SearchCustomWorkplaceAccessDataReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/workplace/v1/custom_workplace_access_data/search"
                    , Sets.newHashSet(AccessTokenType.Tenant)
                    , req);

            // 反序列化
            SearchCustomWorkplaceAccessDataResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SearchCustomWorkplaceAccessDataResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/workplace/v1/custom_workplace_access_data/search"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }
    }

    public static class WorkplaceAccessData {
        private final Config config;

        public WorkplaceAccessData(Config config) {
            this.config = config;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=search&project=workplace&resource=workplace_access_data&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=search&project=workplace&resource=workplace_access_data&version=v1</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/workplacev1/SearchWorkplaceAccessDataSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/workplacev1/SearchWorkplaceAccessDataSample.java</a> ;
         */
        public SearchWorkplaceAccessDataResp search(SearchWorkplaceAccessDataReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/workplace/v1/workplace_access_data/search"
                    , Sets.newHashSet(AccessTokenType.Tenant)
                    , req);

            // 反序列化
            SearchWorkplaceAccessDataResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SearchWorkplaceAccessDataResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/workplace/v1/workplace_access_data/search"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=search&project=workplace&resource=workplace_access_data&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=search&project=workplace&resource=workplace_access_data&version=v1</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/workplacev1/SearchWorkplaceAccessDataSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/workplacev1/SearchWorkplaceAccessDataSample.java</a> ;
         */
        public SearchWorkplaceAccessDataResp search(SearchWorkplaceAccessDataReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/workplace/v1/workplace_access_data/search"
                    , Sets.newHashSet(AccessTokenType.Tenant)
                    , req);

            // 反序列化
            SearchWorkplaceAccessDataResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SearchWorkplaceAccessDataResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/workplace/v1/workplace_access_data/search"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }
    }

    public static class WorkplaceBlockAccessData {
        private final Config config;

        public WorkplaceBlockAccessData(Config config) {
            this.config = config;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=search&project=workplace&resource=workplace_block_access_data&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=search&project=workplace&resource=workplace_block_access_data&version=v1</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/workplacev1/SearchWorkplaceBlockAccessDataSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/workplacev1/SearchWorkplaceBlockAccessDataSample.java</a> ;
         */
        public SearchWorkplaceBlockAccessDataResp search(SearchWorkplaceBlockAccessDataReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/workplace/v1/workplace_block_access_data/search"
                    , Sets.newHashSet(AccessTokenType.Tenant)
                    , req);

            // 反序列化
            SearchWorkplaceBlockAccessDataResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SearchWorkplaceBlockAccessDataResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/workplace/v1/workplace_block_access_data/search"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }

        /**
         * ，
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=search&project=workplace&resource=workplace_block_access_data&version=v1">https://open.feishu.cn/api-explorer?from=op_doc_tab&apiName=search&project=workplace&resource=workplace_block_access_data&version=v1</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/workplacev1/SearchWorkplaceBlockAccessDataSample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/workplacev1/SearchWorkplaceBlockAccessDataSample.java</a> ;
         */
        public SearchWorkplaceBlockAccessDataResp search(SearchWorkplaceBlockAccessDataReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/workplace/v1/workplace_block_access_data/search"
                    , Sets.newHashSet(AccessTokenType.Tenant)
                    , req);

            // 反序列化
            SearchWorkplaceBlockAccessDataResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, SearchWorkplaceBlockAccessDataResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/workplace/v1/workplace_block_access_data/search"
                        , Jsons.DEFAULT.toJson(req), Jsons.DEFAULT.toJson(httpResponse.getHeaders()),
                        httpResponse.getStatusCode(), new String(httpResponse.getBody(),
                                StandardCharsets.UTF_8)));
                throw new IllegalArgumentException("The result returned by the server is illegal");
            }

            resp.setRawResponse(httpResponse);
            resp.setRequest(req);

            return resp;
        }
    }

}