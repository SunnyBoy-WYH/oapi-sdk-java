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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class WebsiteJobPostCustomizedTimeRange {
    /**
     * 开始时间
     * <p> 示例值：AA
     */
    @SerializedName("start_time")
    private String startTime;
    /**
     * 结束时间
     * <p> 示例值：AA
     */
    @SerializedName("end_time")
    private String endTime;

    // builder 开始
    public WebsiteJobPostCustomizedTimeRange() {
    }

    public WebsiteJobPostCustomizedTimeRange(Builder builder) {
        /**
         * 开始时间
         * <p> 示例值：AA
         */
        this.startTime = builder.startTime;
        /**
         * 结束时间
         * <p> 示例值：AA
         */
        this.endTime = builder.endTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public static class Builder {
        /**
         * 开始时间
         * <p> 示例值：AA
         */
        private String startTime;
        /**
         * 结束时间
         * <p> 示例值：AA
         */
        private String endTime;

        /**
         * 开始时间
         * <p> 示例值：AA
         *
         * @param startTime
         * @return
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 结束时间
         * <p> 示例值：AA
         *
         * @param endTime
         * @return
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }


        public WebsiteJobPostCustomizedTimeRange build() {
            return new WebsiteJobPostCustomizedTimeRange(this);
        }
    }
}
