package com.lark.oapi.sample.apiall.drivev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.drive.v1.model.UpdatePermissionPublicPasswordReq;
import com.lark.oapi.service.drive.v1.model.UpdatePermissionPublicPasswordResp;

// PUT /open-apis/drive/v1/permissions/:token/public/password
public class UpdatePermissionPublicPasswordSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        UpdatePermissionPublicPasswordReq req = UpdatePermissionPublicPasswordReq.newBuilder()
                .token("doccnBKgoMyY5OMbUG6FioTXuBe")
                .type("doc")
                .build();

        // 发起请求
        UpdatePermissionPublicPasswordResp resp = client.drive().permissionPublicPassword().update(req);

        // 处理服务端错误
        if (!resp.success()) {
            System.out.println(String.format("code:%s,msg:%s,reqId:%s"
                    , resp.getCode(), resp.getMsg(), resp.getRequestId()));
            return;
        }

        // 业务数据处理
        System.out.println(Jsons.DEFAULT.toJson(resp.getData()));
    }
}
