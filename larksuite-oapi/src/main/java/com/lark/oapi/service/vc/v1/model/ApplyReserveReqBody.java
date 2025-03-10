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

package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class ApplyReserveReqBody {
    /**
     * 预约到期时间（unix时间，单位sec），多人会议必填
     * <p> 示例值：1608888867
     */
    @SerializedName("end_time")
    private String endTime;
    /**
     * 指定会议归属人，使用tenant_access_token时生效且必传，使用user_access_token时不生效，必须指定为同租户下的合法lark用户
     * <p> 示例值：ou_3ec3f6a28a0d08c45d895276e8e5e19b
     */
    @SerializedName("owner_id")
    private String ownerId;
    /**
     * 会议设置
     * <p> 示例值：
     */
    @SerializedName("meeting_settings")
    private ReserveMeetingSetting meetingSettings;

    // builder 开始
    public ApplyReserveReqBody() {
    }

    public ApplyReserveReqBody(Builder builder) {
        /**
         * 预约到期时间（unix时间，单位sec），多人会议必填
         * <p> 示例值：1608888867
         */
        this.endTime = builder.endTime;
        /**
         * 指定会议归属人，使用tenant_access_token时生效且必传，使用user_access_token时不生效，必须指定为同租户下的合法lark用户
         * <p> 示例值：ou_3ec3f6a28a0d08c45d895276e8e5e19b
         */
        this.ownerId = builder.ownerId;
        /**
         * 会议设置
         * <p> 示例值：
         */
        this.meetingSettings = builder.meetingSettings;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public ReserveMeetingSetting getMeetingSettings() {
        return this.meetingSettings;
    }

    public void setMeetingSettings(ReserveMeetingSetting meetingSettings) {
        this.meetingSettings = meetingSettings;
    }

    public static class Builder {
        /**
         * 预约到期时间（unix时间，单位sec），多人会议必填
         * <p> 示例值：1608888867
         */
        private String endTime;
        /**
         * 指定会议归属人，使用tenant_access_token时生效且必传，使用user_access_token时不生效，必须指定为同租户下的合法lark用户
         * <p> 示例值：ou_3ec3f6a28a0d08c45d895276e8e5e19b
         */
        private String ownerId;
        /**
         * 会议设置
         * <p> 示例值：
         */
        private ReserveMeetingSetting meetingSettings;

        /**
         * 预约到期时间（unix时间，单位sec），多人会议必填
         * <p> 示例值：1608888867
         *
         * @param endTime
         * @return
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }


        /**
         * 指定会议归属人，使用tenant_access_token时生效且必传，使用user_access_token时不生效，必须指定为同租户下的合法lark用户
         * <p> 示例值：ou_3ec3f6a28a0d08c45d895276e8e5e19b
         *
         * @param ownerId
         * @return
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }


        /**
         * 会议设置
         * <p> 示例值：
         *
         * @param meetingSettings
         * @return
         */
        public Builder meetingSettings(ReserveMeetingSetting meetingSettings) {
            this.meetingSettings = meetingSettings;
            return this;
        }


        public ApplyReserveReqBody build() {
            return new ApplyReserveReqBody(this);
        }
    }
}
