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

package com.lark.oapi.service.human_authentication.v1;

import com.lark.oapi.core.Config;
import com.lark.oapi.core.Transport;
import com.lark.oapi.core.request.RequestOptions;
import com.lark.oapi.core.response.RawResponse;
import com.lark.oapi.core.token.AccessTokenType;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.core.utils.Sets;
import com.lark.oapi.core.utils.UnmarshalRespUtil;
import com.lark.oapi.service.human_authentication.v1.model.CreateIdentityReq;
import com.lark.oapi.service.human_authentication.v1.model.CreateIdentityResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.nio.charset.StandardCharsets;

public class HumanAuthenticationService {
    private static final Logger log = LoggerFactory.getLogger(HumanAuthenticationService.class);
    private final Identity identity; // 实名认证

    public HumanAuthenticationService(Config config) {
        this.identity = new Identity(config);
    }

    /**
     * 实名认证
     *
     * @return
     */
    public Identity identity() {
        return identity;
    }

    public static class Identity {
        private final Config config;

        public Identity(Config config) {
            this.config = config;
        }

        /**
         * 录入身份信息，该接口用于录入实名认证的身份信息，在唤起有源活体认证前，需要使用该接口进行实名认证。
         * <p> 实名认证接口会有计费管理，接入前请联系飞书开放平台工作人员，邮箱：openplatform@bytedance.com。;;仅通过计费申请的应用，才能在[开发者后台](https://open.feishu.cn/app)查找并申请该接口的权限。 ;
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/human_authentication-v1/identity/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/human_authentication-v1/identity/create</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/human_authenticationv1/CreateIdentitySample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/human_authenticationv1/CreateIdentitySample.java</a> ;
         */
        public CreateIdentityResp create(CreateIdentityReq req, RequestOptions reqOptions) throws Exception {
            // 请求参数选项
            if (reqOptions == null) {
                reqOptions = new RequestOptions();
            }

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/human_authentication/v1/identities"
                    , Sets.newHashSet(AccessTokenType.Tenant)
                    , req);

            // 反序列化
            CreateIdentityResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateIdentityResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/human_authentication/v1/identities"
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
         * 录入身份信息，该接口用于录入实名认证的身份信息，在唤起有源活体认证前，需要使用该接口进行实名认证。
         * <p> 实名认证接口会有计费管理，接入前请联系飞书开放平台工作人员，邮箱：openplatform@bytedance.com。;;仅通过计费申请的应用，才能在[开发者后台](https://open.feishu.cn/app)查找并申请该接口的权限。 ;
         * <p> 官网API文档链接:<a href="https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/human_authentication-v1/identity/create">https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/human_authentication-v1/identity/create</a> ;
         * <p> 使用Demo链接: <a href="https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/human_authenticationv1/CreateIdentitySample.java">https://github.com/larksuite/oapi-sdk-java/tree/v2_main/sample/src/main/java/com/lark/oapi/sample/apiall/human_authenticationv1/CreateIdentitySample.java</a> ;
         */
        public CreateIdentityResp create(CreateIdentityReq req) throws Exception {
            // 请求参数选项
            RequestOptions reqOptions = new RequestOptions();

            // 发起请求
            RawResponse httpResponse = Transport.send(config, reqOptions, "POST"
                    , "/open-apis/human_authentication/v1/identities"
                    , Sets.newHashSet(AccessTokenType.Tenant)
                    , req);

            // 反序列化
            CreateIdentityResp resp = UnmarshalRespUtil.unmarshalResp(httpResponse, CreateIdentityResp.class);
            if (resp == null) {
                log.error(String.format(
                        "%s,callError,req=%s,respHeader=%s,respStatusCode=%s,respBody=%s,", "/open-apis/human_authentication/v1/identities"
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