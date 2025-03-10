package com.lark.oapi.sample.apiall.vcv1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.vc.v1.model.GetReserveConfigDisableInformReq;
import com.lark.oapi.service.vc.v1.model.GetReserveConfigDisableInformResp;

// GET /open-apis/vc/v1/reserve_configs/:reserve_config_id/disable_inform
public class GetReserveConfigDisableInformSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        GetReserveConfigDisableInformReq req = GetReserveConfigDisableInformReq.newBuilder()
                .reserveConfigId("omm_3c5dd7e09bac0c1758fcf9511bd1a771")
                .scopeType(2)
                .userIdType("user_id")
                .build();

        // 发起请求
        GetReserveConfigDisableInformResp resp = client.vc().reserveConfigDisableInform().get(req);

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
