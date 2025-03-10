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

public class PatchMetricSourceTableItemReqBody {
    /**
     * 指标起始值
     * <p> 示例值：1.0
     */
    @SerializedName("metric_initial_value")
    private Double metricInitialValue;
    /**
     * 指标目标值
     * <p> 示例值：3.0
     */
    @SerializedName("metric_target_value")
    private Double metricTargetValue;
    /**
     * 指标进度值
     * <p> 示例值：2.0
     */
    @SerializedName("metric_current_value")
    private Double metricCurrentValue;
    /**
     * 指标支撑的上级人员 id
     * <p> 示例值：7041857032248410131
     */
    @SerializedName("supported_user_id")
    private String supportedUserId;

    // builder 开始
    public PatchMetricSourceTableItemReqBody() {
    }

    public PatchMetricSourceTableItemReqBody(Builder builder) {
        /**
         * 指标起始值
         * <p> 示例值：1.0
         */
        this.metricInitialValue = builder.metricInitialValue;
        /**
         * 指标目标值
         * <p> 示例值：3.0
         */
        this.metricTargetValue = builder.metricTargetValue;
        /**
         * 指标进度值
         * <p> 示例值：2.0
         */
        this.metricCurrentValue = builder.metricCurrentValue;
        /**
         * 指标支撑的上级人员 id
         * <p> 示例值：7041857032248410131
         */
        this.supportedUserId = builder.supportedUserId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Double getMetricInitialValue() {
        return this.metricInitialValue;
    }

    public void setMetricInitialValue(Double metricInitialValue) {
        this.metricInitialValue = metricInitialValue;
    }

    public Double getMetricTargetValue() {
        return this.metricTargetValue;
    }

    public void setMetricTargetValue(Double metricTargetValue) {
        this.metricTargetValue = metricTargetValue;
    }

    public Double getMetricCurrentValue() {
        return this.metricCurrentValue;
    }

    public void setMetricCurrentValue(Double metricCurrentValue) {
        this.metricCurrentValue = metricCurrentValue;
    }

    public String getSupportedUserId() {
        return this.supportedUserId;
    }

    public void setSupportedUserId(String supportedUserId) {
        this.supportedUserId = supportedUserId;
    }

    public static class Builder {
        /**
         * 指标起始值
         * <p> 示例值：1.0
         */
        private Double metricInitialValue;
        /**
         * 指标目标值
         * <p> 示例值：3.0
         */
        private Double metricTargetValue;
        /**
         * 指标进度值
         * <p> 示例值：2.0
         */
        private Double metricCurrentValue;
        /**
         * 指标支撑的上级人员 id
         * <p> 示例值：7041857032248410131
         */
        private String supportedUserId;

        /**
         * 指标起始值
         * <p> 示例值：1.0
         *
         * @param metricInitialValue
         * @return
         */
        public Builder metricInitialValue(Double metricInitialValue) {
            this.metricInitialValue = metricInitialValue;
            return this;
        }


        /**
         * 指标目标值
         * <p> 示例值：3.0
         *
         * @param metricTargetValue
         * @return
         */
        public Builder metricTargetValue(Double metricTargetValue) {
            this.metricTargetValue = metricTargetValue;
            return this;
        }


        /**
         * 指标进度值
         * <p> 示例值：2.0
         *
         * @param metricCurrentValue
         * @return
         */
        public Builder metricCurrentValue(Double metricCurrentValue) {
            this.metricCurrentValue = metricCurrentValue;
            return this;
        }


        /**
         * 指标支撑的上级人员 id
         * <p> 示例值：7041857032248410131
         *
         * @param supportedUserId
         * @return
         */
        public Builder supportedUserId(String supportedUserId) {
            this.supportedUserId = supportedUserId;
            return this;
        }


        public PatchMetricSourceTableItemReqBody build() {
            return new PatchMetricSourceTableItemReqBody(this);
        }
    }
}
