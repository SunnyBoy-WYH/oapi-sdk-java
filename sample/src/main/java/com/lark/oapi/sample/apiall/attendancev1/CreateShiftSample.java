package com.lark.oapi.sample.apiall.attendancev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.attendance.v1.model.*;

// POST /open-apis/attendance/v1/shifts
public class CreateShiftSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        CreateShiftReq req = CreateShiftReq.newBuilder()
                .shift(Shift.newBuilder()
                        .shiftName("早班")
                        .punchTimes(1)
                        .subShiftLeaderIds(new String[]{})
                        .isFlexible(false)
                        .flexibleMinutes(60)
                        .flexibleRule(new FlexibleRule[]{})
                        .noNeedOff(true)
                        .punchTimeRule(new PunchTimeRule[]{})
                        .lateOffLateOnRule(new LateOffLateOnRule[]{})
                        .restTimeRule(new RestRule[]{})
                        .overtimeRule(new OvertimeRule[]{})
                        .allowPunchApproval(false)
                        .build())
                .build();

        // 发起请求
        CreateShiftResp resp = client.attendance().shift().create(req);

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
