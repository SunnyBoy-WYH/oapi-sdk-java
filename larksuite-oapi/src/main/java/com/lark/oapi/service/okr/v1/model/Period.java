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

package com.lark.oapi.service.okr.v1.model;

import com.google.gson.annotations.SerializedName;

public class Period {
    /**
     * id
     * <p> 示例值：635782378412311
     */
    @SerializedName("id")
    private String id;
    /**
     * 中文名称
     * <p> 示例值：中文周期
     */
    @SerializedName("zh_name")
    private String zhName;
    /**
     * 英文名称
     * <p> 示例值：english period
     */
    @SerializedName("en_name")
    private String enName;
    /**
     * 启用状态
     * <p> 示例值：0
     */
    @SerializedName("status")
    private Integer status;
    /**
     * 周期开始时间
     * <p> 示例值：1686740948123
     */
    @SerializedName("period_start_time")
    private String periodStartTime;
    /**
     * 周期结束时间
     * <p> 示例值：1686740948123
     */
    @SerializedName("period_end_time")
    private String periodEndTime;

    // builder 开始
    public Period() {
    }

    public Period(Builder builder) {
        /**
         * id
         * <p> 示例值：635782378412311
         */
        this.id = builder.id;
        /**
         * 中文名称
         * <p> 示例值：中文周期
         */
        this.zhName = builder.zhName;
        /**
         * 英文名称
         * <p> 示例值：english period
         */
        this.enName = builder.enName;
        /**
         * 启用状态
         * <p> 示例值：0
         */
        this.status = builder.status;
        /**
         * 周期开始时间
         * <p> 示例值：1686740948123
         */
        this.periodStartTime = builder.periodStartTime;
        /**
         * 周期结束时间
         * <p> 示例值：1686740948123
         */
        this.periodEndTime = builder.periodEndTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getZhName() {
        return this.zhName;
    }

    public void setZhName(String zhName) {
        this.zhName = zhName;
    }

    public String getEnName() {
        return this.enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public Integer getStatus() {
        return this.status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPeriodStartTime() {
        return this.periodStartTime;
    }

    public void setPeriodStartTime(String periodStartTime) {
        this.periodStartTime = periodStartTime;
    }

    public String getPeriodEndTime() {
        return this.periodEndTime;
    }

    public void setPeriodEndTime(String periodEndTime) {
        this.periodEndTime = periodEndTime;
    }

    public static class Builder {
        /**
         * id
         * <p> 示例值：635782378412311
         */
        private String id;
        /**
         * 中文名称
         * <p> 示例值：中文周期
         */
        private String zhName;
        /**
         * 英文名称
         * <p> 示例值：english period
         */
        private String enName;
        /**
         * 启用状态
         * <p> 示例值：0
         */
        private Integer status;
        /**
         * 周期开始时间
         * <p> 示例值：1686740948123
         */
        private String periodStartTime;
        /**
         * 周期结束时间
         * <p> 示例值：1686740948123
         */
        private String periodEndTime;

        /**
         * id
         * <p> 示例值：635782378412311
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 中文名称
         * <p> 示例值：中文周期
         *
         * @param zhName
         * @return
         */
        public Builder zhName(String zhName) {
            this.zhName = zhName;
            return this;
        }


        /**
         * 英文名称
         * <p> 示例值：english period
         *
         * @param enName
         * @return
         */
        public Builder enName(String enName) {
            this.enName = enName;
            return this;
        }


        /**
         * 启用状态
         * <p> 示例值：0
         *
         * @param status
         * @return
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * 启用状态
         * <p> 示例值：0
         *
         * @param status {@link com.lark.oapi.service.okr.v1.enums.PeriodPeriodStatusEnum}
         * @return
         */
        public Builder status(com.lark.oapi.service.okr.v1.enums.PeriodPeriodStatusEnum status) {
            this.status = status.getValue();
            return this;
        }


        /**
         * 周期开始时间
         * <p> 示例值：1686740948123
         *
         * @param periodStartTime
         * @return
         */
        public Builder periodStartTime(String periodStartTime) {
            this.periodStartTime = periodStartTime;
            return this;
        }


        /**
         * 周期结束时间
         * <p> 示例值：1686740948123
         *
         * @param periodEndTime
         * @return
         */
        public Builder periodEndTime(String periodEndTime) {
            this.periodEndTime = periodEndTime;
            return this;
        }


        public Period build() {
            return new Period(this);
        }
    }
}
