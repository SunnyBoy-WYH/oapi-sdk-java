package com.lark.oapi.sample.apiall.hirev1;

import com.lark.oapi.Client;
import com.lark.oapi.core.utils.Jsons;
import com.lark.oapi.service.hire.v1.model.ListReferralWebsiteJobPostReq;
import com.lark.oapi.service.hire.v1.model.ListReferralWebsiteJobPostResp;

// GET /open-apis/hire/v1/referral_websites/job_posts
public class ListReferralWebsiteJobPostSample {

    public static void main(String arg[]) throws Exception {
        // 构建client
        Client client = Client.newBuilder("appId", "appSecret").build();

        // 创建请求对象
        ListReferralWebsiteJobPostReq req = ListReferralWebsiteJobPostReq.newBuilder()
                .processType(1)
                .pageToken("eyJvZmZzZXQiOjEwLCJ0aW1lc3RhbXAiOjE2Mjc1NTUyMjM2NzIsImlkIjpudWxsfQ==")
                .pageSize(10)
                .userIdType("open_id")
                .departmentIdType("open_department_id")
                .build();

        // 发起请求
        ListReferralWebsiteJobPostResp resp = client.hire().referralWebsiteJobPost().list(req);

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
