package com.lark.oapi.sample.apiall.sheetsv3;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.sheets.v3.model.GetSpreadsheetReq;
import com.lark.oapi.service.sheets.v3.model.GetSpreadsheetResp;

// GET /open-apis/sheets/v3/spreadsheets/:spreadsheet_token
public class GetSpreadsheetSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        GetSpreadsheetReq req = GetSpreadsheetReq.newBuilder()
                .spreadsheetToken("shtxxxxxxxxxxxxxxx")
                .userIdType("user_id")
                .build();

        // 发起请求
        GetSpreadsheetResp resp = client.sheets().spreadsheet().get(req);

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
