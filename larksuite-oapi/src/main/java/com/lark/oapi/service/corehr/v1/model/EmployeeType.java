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

public class EmployeeType {
    /**
     * 雇员类型ID
     * <p> 示例值：6919732473504990727
     */
    @SerializedName("id")
    private String id;
    /**
     * 名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n[] name;
    /**
     * 是否为默认人员类型，每个租户只能定义一个默认人员类型
     * <p> 示例值：true
     */
    @SerializedName("default_employee_type")
    private Boolean defaultEmployeeType;
    /**
     * 启用
     * <p> 示例值：true
     */
    @SerializedName("active")
    private Boolean active;
    /**
     * 编码
     * <p> 示例值：1245
     */
    @SerializedName("code")
    private String code;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private ObjectFieldData[] customFields;

    // builder 开始
    public EmployeeType() {
    }

    public EmployeeType(Builder builder) {
        /**
         * 雇员类型ID
         * <p> 示例值：6919732473504990727
         */
        this.id = builder.id;
        /**
         * 名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 是否为默认人员类型，每个租户只能定义一个默认人员类型
         * <p> 示例值：true
         */
        this.defaultEmployeeType = builder.defaultEmployeeType;
        /**
         * 启用
         * <p> 示例值：true
         */
        this.active = builder.active;
        /**
         * 编码
         * <p> 示例值：1245
         */
        this.code = builder.code;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        this.customFields = builder.customFields;
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

    public I18n[] getName() {
        return this.name;
    }

    public void setName(I18n[] name) {
        this.name = name;
    }

    public Boolean getDefaultEmployeeType() {
        return this.defaultEmployeeType;
    }

    public void setDefaultEmployeeType(Boolean defaultEmployeeType) {
        this.defaultEmployeeType = defaultEmployeeType;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ObjectFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(ObjectFieldData[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 雇员类型ID
         * <p> 示例值：6919732473504990727
         */
        private String id;
        /**
         * 名称
         * <p> 示例值：
         */
        private I18n[] name;
        /**
         * 是否为默认人员类型，每个租户只能定义一个默认人员类型
         * <p> 示例值：true
         */
        private Boolean defaultEmployeeType;
        /**
         * 启用
         * <p> 示例值：true
         */
        private Boolean active;
        /**
         * 编码
         * <p> 示例值：1245
         */
        private String code;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private ObjectFieldData[] customFields;

        /**
         * 雇员类型ID
         * <p> 示例值：6919732473504990727
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(I18n[] name) {
            this.name = name;
            return this;
        }


        /**
         * 是否为默认人员类型，每个租户只能定义一个默认人员类型
         * <p> 示例值：true
         *
         * @param defaultEmployeeType
         * @return
         */
        public Builder defaultEmployeeType(Boolean defaultEmployeeType) {
            this.defaultEmployeeType = defaultEmployeeType;
            return this;
        }


        /**
         * 启用
         * <p> 示例值：true
         *
         * @param active
         * @return
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }


        /**
         * 编码
         * <p> 示例值：1245
         *
         * @param code
         * @return
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }


        /**
         * 自定义字段
         * <p> 示例值：
         *
         * @param customFields
         * @return
         */
        public Builder customFields(ObjectFieldData[] customFields) {
            this.customFields = customFields;
            return this;
        }


        public EmployeeType build() {
            return new EmployeeType(this);
        }
    }
}
