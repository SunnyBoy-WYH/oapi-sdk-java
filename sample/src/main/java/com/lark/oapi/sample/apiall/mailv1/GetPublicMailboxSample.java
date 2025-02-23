package com.lark.oapi.sample.apiall.mailv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.mail.v1.model.GetPublicMailboxReq;
import com.lark.oapi.service.mail.v1.model.GetPublicMailboxResp;

// GET /open-apis/mail/v1/public_mailboxes/:public_mailbox_id
public class GetPublicMailboxSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        GetPublicMailboxReq req = GetPublicMailboxReq.newBuilder()
                .publicMailboxId("xxxxxxxxxxxxxxx 或 test_public_mailbox@xxx.xx")
                .build();

        // 发起请求
        GetPublicMailboxResp resp = client.mail().publicMailbox().get(req);

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
