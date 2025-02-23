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

package com.lark.oapi.service.corehr.v1.model;

import com.google.gson.annotations.SerializedName;

public class CreateLeaveGrantingRecordReqBody {
    /**
     * 假期类型 ID，枚举值可通过【获取假期类型列表】接口获取（若假期类型下存在假期子类，此处仅支持传入假期子类的 ID）
     * <p> 示例值：7111688079785723436
     */
    @SerializedName("leave_type_id")
    private String leaveTypeId;
    /**
     * 员工 ID
     * <p> 示例值：6982509313466189342
     */
    @SerializedName("employment_id")
    private String employmentId;
    /**
     * 授予数量
     * <p> 示例值：0.5
     */
    @SerializedName("granting_quantity")
    private String grantingQuantity;
    /**
     * 授予时长单位;;可选值有：;;- 1: 天;- 2: 小时
     * <p> 示例值：1
     */
    @SerializedName("granting_unit")
    private Integer grantingUnit;
    /**
     * 生效时间
     * <p> 示例值：2022-01-01
     */
    @SerializedName("effective_date")
    private String effectiveDate;
    /**
     * 失效时间
     * <p> 示例值：2022-01-01
     */
    @SerializedName("expiration_date")
    private String expirationDate;
    /**
     * 授予原因
     * <p> 示例值：
     */
    @SerializedName("reason")
    private I18n[] reason;
    /**
     * 自定义外部 ID，可用于避免数据重复写入（不能超过 64 字符）
     * <p> 示例值：111
     */
    @SerializedName("external_id")
    private String externalId;

    // builder 开始
    public CreateLeaveGrantingRecordReqBody() {
    }

    public CreateLeaveGrantingRecordReqBody(Builder builder) {
        /**
         * 假期类型 ID，枚举值可通过【获取假期类型列表】接口获取（若假期类型下存在假期子类，此处仅支持传入假期子类的 ID）
         * <p> 示例值：7111688079785723436
         */
        this.leaveTypeId = builder.leaveTypeId;
        /**
         * 员工 ID
         * <p> 示例值：6982509313466189342
         */
        this.employmentId = builder.employmentId;
        /**
         * 授予数量
         * <p> 示例值：0.5
         */
        this.grantingQuantity = builder.grantingQuantity;
        /**
         * 授予时长单位;;可选值有：;;- 1: 天;- 2: 小时
         * <p> 示例值：1
         */
        this.grantingUnit = builder.grantingUnit;
        /**
         * 生效时间
         * <p> 示例值：2022-01-01
         */
        this.effectiveDate = builder.effectiveDate;
        /**
         * 失效时间
         * <p> 示例值：2022-01-01
         */
        this.expirationDate = builder.expirationDate;
        /**
         * 授予原因
         * <p> 示例值：
         */
        this.reason = builder.reason;
        /**
         * 自定义外部 ID，可用于避免数据重复写入（不能超过 64 字符）
         * <p> 示例值：111
         */
        this.externalId = builder.externalId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getLeaveTypeId() {
        return this.leaveTypeId;
    }

    public void setLeaveTypeId(String leaveTypeId) {
        this.leaveTypeId = leaveTypeId;
    }

    public String getEmploymentId() {
        return this.employmentId;
    }

    public void setEmploymentId(String employmentId) {
        this.employmentId = employmentId;
    }

    public String getGrantingQuantity() {
        return this.grantingQuantity;
    }

    public void setGrantingQuantity(String grantingQuantity) {
        this.grantingQuantity = grantingQuantity;
    }

    public Integer getGrantingUnit() {
        return this.grantingUnit;
    }

    public void setGrantingUnit(Integer grantingUnit) {
        this.grantingUnit = grantingUnit;
    }

    public String getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public String getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public I18n[] getReason() {
        return this.reason;
    }

    public void setReason(I18n[] reason) {
        this.reason = reason;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public static class Builder {
        /**
         * 假期类型 ID，枚举值可通过【获取假期类型列表】接口获取（若假期类型下存在假期子类，此处仅支持传入假期子类的 ID）
         * <p> 示例值：7111688079785723436
         */
        private String leaveTypeId;
        /**
         * 员工 ID
         * <p> 示例值：6982509313466189342
         */
        private String employmentId;
        /**
         * 授予数量
         * <p> 示例值：0.5
         */
        private String grantingQuantity;
        /**
         * 授予时长单位;;可选值有：;;- 1: 天;- 2: 小时
         * <p> 示例值：1
         */
        private Integer grantingUnit;
        /**
         * 生效时间
         * <p> 示例值：2022-01-01
         */
        private String effectiveDate;
        /**
         * 失效时间
         * <p> 示例值：2022-01-01
         */
        private String expirationDate;
        /**
         * 授予原因
         * <p> 示例值：
         */
        private I18n[] reason;
        /**
         * 自定义外部 ID，可用于避免数据重复写入（不能超过 64 字符）
         * <p> 示例值：111
         */
        private String externalId;

        /**
         * 假期类型 ID，枚举值可通过【获取假期类型列表】接口获取（若假期类型下存在假期子类，此处仅支持传入假期子类的 ID）
         * <p> 示例值：7111688079785723436
         *
         * @param leaveTypeId
         * @return
         */
        public Builder leaveTypeId(String leaveTypeId) {
            this.leaveTypeId = leaveTypeId;
            return this;
        }


        /**
         * 员工 ID
         * <p> 示例值：6982509313466189342
         *
         * @param employmentId
         * @return
         */
        public Builder employmentId(String employmentId) {
            this.employmentId = employmentId;
            return this;
        }


        /**
         * 授予数量
         * <p> 示例值：0.5
         *
         * @param grantingQuantity
         * @return
         */
        public Builder grantingQuantity(String grantingQuantity) {
            this.grantingQuantity = grantingQuantity;
            return this;
        }


        /**
         * 授予时长单位;;可选值有：;;- 1: 天;- 2: 小时
         * <p> 示例值：1
         *
         * @param grantingUnit
         * @return
         */
        public Builder grantingUnit(Integer grantingUnit) {
            this.grantingUnit = grantingUnit;
            return this;
        }


        /**
         * 生效时间
         * <p> 示例值：2022-01-01
         *
         * @param effectiveDate
         * @return
         */
        public Builder effectiveDate(String effectiveDate) {
            this.effectiveDate = effectiveDate;
            return this;
        }


        /**
         * 失效时间
         * <p> 示例值：2022-01-01
         *
         * @param expirationDate
         * @return
         */
        public Builder expirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }


        /**
         * 授予原因
         * <p> 示例值：
         *
         * @param reason
         * @return
         */
        public Builder reason(I18n[] reason) {
            this.reason = reason;
            return this;
        }


        /**
         * 自定义外部 ID，可用于避免数据重复写入（不能超过 64 字符）
         * <p> 示例值：111
         *
         * @param externalId
         * @return
         */
        public Builder externalId(String externalId) {
            this.externalId = externalId;
            return this;
        }


        public CreateLeaveGrantingRecordReqBody build() {
            return new CreateLeaveGrantingRecordReqBody(this);
        }
    }
}
