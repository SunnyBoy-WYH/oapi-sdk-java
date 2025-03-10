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

public class FreeTime {
    /**
     * 空闲开始时间
     * <p> 示例值：none
     */
    @SerializedName("free_time_start")
    private String freeTimeStart;
    /**
     * 空闲结束时间
     * <p> 示例值：none
     */
    @SerializedName("free_time_end")
    private String freeTimeEnd;
    /**
     * 空闲时间列表
     * <p> 示例值：none
     */
    @SerializedName("free_time_list")
    private String freeTimeList;

    // builder 开始
    public FreeTime() {
    }

    public FreeTime(Builder builder) {
        /**
         * 空闲开始时间
         * <p> 示例值：none
         */
        this.freeTimeStart = builder.freeTimeStart;
        /**
         * 空闲结束时间
         * <p> 示例值：none
         */
        this.freeTimeEnd = builder.freeTimeEnd;
        /**
         * 空闲时间列表
         * <p> 示例值：none
         */
        this.freeTimeList = builder.freeTimeList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFreeTimeStart() {
        return this.freeTimeStart;
    }

    public void setFreeTimeStart(String freeTimeStart) {
        this.freeTimeStart = freeTimeStart;
    }

    public String getFreeTimeEnd() {
        return this.freeTimeEnd;
    }

    public void setFreeTimeEnd(String freeTimeEnd) {
        this.freeTimeEnd = freeTimeEnd;
    }

    public String getFreeTimeList() {
        return this.freeTimeList;
    }

    public void setFreeTimeList(String freeTimeList) {
        this.freeTimeList = freeTimeList;
    }

    public static class Builder {
        /**
         * 空闲开始时间
         * <p> 示例值：none
         */
        private String freeTimeStart;
        /**
         * 空闲结束时间
         * <p> 示例值：none
         */
        private String freeTimeEnd;
        /**
         * 空闲时间列表
         * <p> 示例值：none
         */
        private String freeTimeList;

        /**
         * 空闲开始时间
         * <p> 示例值：none
         *
         * @param freeTimeStart
         * @return
         */
        public Builder freeTimeStart(String freeTimeStart) {
            this.freeTimeStart = freeTimeStart;
            return this;
        }


        /**
         * 空闲结束时间
         * <p> 示例值：none
         *
         * @param freeTimeEnd
         * @return
         */
        public Builder freeTimeEnd(String freeTimeEnd) {
            this.freeTimeEnd = freeTimeEnd;
            return this;
        }


        /**
         * 空闲时间列表
         * <p> 示例值：none
         *
         * @param freeTimeList
         * @return
         */
        public Builder freeTimeList(String freeTimeList) {
            this.freeTimeList = freeTimeList;
            return this;
        }


        public FreeTime build() {
            return new FreeTime(this);
        }
    }
}
