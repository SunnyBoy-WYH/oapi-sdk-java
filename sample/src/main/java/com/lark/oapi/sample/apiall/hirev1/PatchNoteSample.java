package com.lark.oapi.sample.apiall.hirev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.hire.v1.model.PatchNoteReq;
import com.lark.oapi.service.hire.v1.model.PatchNoteReqBody;
import com.lark.oapi.service.hire.v1.model.PatchNoteResp;

// PATCH /open-apis/hire/v1/notes/:note_id
public class PatchNoteSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        PatchNoteReq req = PatchNoteReq.newBuilder()
                .noteId("6960663240925956401")
                .userIdType("open_id")
                .patchNoteReqBody(PatchNoteReqBody.newBuilder()
                        .content("111")
                        .build())
                .build();

        // 发起请求
        PatchNoteResp resp = client.hire().note().patch(req);

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
