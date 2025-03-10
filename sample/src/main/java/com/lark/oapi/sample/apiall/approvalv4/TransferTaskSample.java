package com.lark.oapi.sample.apiall.approvalv4;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.approval.v4.model.TaskTransfer;
import com.lark.oapi.service.approval.v4.model.TransferTaskReq;
import com.lark.oapi.service.approval.v4.model.TransferTaskResp;

// POST /open-apis/approval/v4/tasks/transfer
public class TransferTaskSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        TransferTaskReq req = TransferTaskReq.newBuilder()
                .userIdType("user_id")
                .taskTransfer(TaskTransfer.newBuilder()
                        .approvalCode("7C468A54-8745-2245-9675-08B7C63E7A85")
                        .instanceCode("81D31358-93AF-92D6-7425-01A5D67C4E71")
                        .userId("f7cb567e")
                        .comment("OK")
                        .transferUserId("f4ip317q")
                        .taskId("12345")
                        .build())
                .build();

        // 发起请求
        TransferTaskResp resp = client.approval().task().transfer(req);

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
