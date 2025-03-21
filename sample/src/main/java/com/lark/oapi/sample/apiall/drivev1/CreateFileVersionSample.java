package com.lark.oapi.sample.apiall.drivev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.drive.v1.model.CreateFileVersionReq;
import com.lark.oapi.service.drive.v1.model.CreateFileVersionResp;
import com.lark.oapi.service.drive.v1.model.Version;

// POST /open-apis/drive/v1/files/:file_token/versions
public class CreateFileVersionSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        CreateFileVersionReq req = CreateFileVersionReq.newBuilder()
                .fileToken("doxbcyvqZlSc9WlHvQMlSJwUrsb")
                .userIdType("user_id")
                .version(Version.newBuilder()
                        .name("文档标题")
                        .version("version1")
                        .parentToken("doxcnMycg4ryxQofSeoKkJuXYOb")
                        .ownerId("694699009591869450")
                        .creatorId("694699009591869451")
                        .createTime("1660708537")
                        .updateTime("1660708537")
                        .status("0，1，2")
                        .objType("docx")
                        .parentType("docx")
                        .build())
                .build();

        // 发起请求
        CreateFileVersionResp resp = client.drive().fileVersion().create(req);

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
