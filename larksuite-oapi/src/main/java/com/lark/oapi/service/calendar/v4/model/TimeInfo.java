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

package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class TimeInfo {
    /**
     * 仅全天日程使用该字段，如2018-09-01。需满足 RFC3339 格式。不能与 timestamp 同时指定
     * <p> 示例值：2018-09-01
     */
    @SerializedName("date")
    private String date;
    /**
     * 秒级时间戳，如1602504000(表示2020/10/12 20:0:00 +8时区)
     * <p> 示例值：1602504000
     */
    @SerializedName("timestamp")
    private String timestamp;
    /**
     * 时区名称，使用IANA Time Zone Database标准，如Asia/Shanghai；全天日程时区固定为UTC，非全天日程时区默认为Asia/Shanghai
     * <p> 示例值：Asia/Shanghai
     */
    @SerializedName("timezone")
    private String timezone;

    // builder 开始
    public TimeInfo() {
    }

    public TimeInfo(Builder builder) {
        /**
         * 仅全天日程使用该字段，如2018-09-01。需满足 RFC3339 格式。不能与 timestamp 同时指定
         * <p> 示例值：2018-09-01
         */
        this.date = builder.date;
        /**
         * 秒级时间戳，如1602504000(表示2020/10/12 20:0:00 +8时区)
         * <p> 示例值：1602504000
         */
        this.timestamp = builder.timestamp;
        /**
         * 时区名称，使用IANA Time Zone Database标准，如Asia/Shanghai；全天日程时区固定为UTC，非全天日程时区默认为Asia/Shanghai
         * <p> 示例值：Asia/Shanghai
         */
        this.timezone = builder.timezone;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTimestamp() {
        return this.timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getTimezone() {
        return this.timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public static class Builder {
        /**
         * 仅全天日程使用该字段，如2018-09-01。需满足 RFC3339 格式。不能与 timestamp 同时指定
         * <p> 示例值：2018-09-01
         */
        private String date;
        /**
         * 秒级时间戳，如1602504000(表示2020/10/12 20:0:00 +8时区)
         * <p> 示例值：1602504000
         */
        private String timestamp;
        /**
         * 时区名称，使用IANA Time Zone Database标准，如Asia/Shanghai；全天日程时区固定为UTC，非全天日程时区默认为Asia/Shanghai
         * <p> 示例值：Asia/Shanghai
         */
        private String timezone;

        /**
         * 仅全天日程使用该字段，如2018-09-01。需满足 RFC3339 格式。不能与 timestamp 同时指定
         * <p> 示例值：2018-09-01
         *
         * @param date
         * @return
         */
        public Builder date(String date) {
            this.date = date;
            return this;
        }


        /**
         * 秒级时间戳，如1602504000(表示2020/10/12 20:0:00 +8时区)
         * <p> 示例值：1602504000
         *
         * @param timestamp
         * @return
         */
        public Builder timestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }


        /**
         * 时区名称，使用IANA Time Zone Database标准，如Asia/Shanghai；全天日程时区固定为UTC，非全天日程时区默认为Asia/Shanghai
         * <p> 示例值：Asia/Shanghai
         *
         * @param timezone
         * @return
         */
        public Builder timezone(String timezone) {
            this.timezone = timezone;
            return this;
        }


        public TimeInfo build() {
            return new TimeInfo(this);
        }
    }
}
