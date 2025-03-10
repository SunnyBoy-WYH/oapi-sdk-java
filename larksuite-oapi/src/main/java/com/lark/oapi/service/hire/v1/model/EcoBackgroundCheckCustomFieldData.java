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

public class EcoBackgroundCheckCustomFieldData {
    /**
     * 自定义字段类型
     * <p> 示例值：text
     */
    @SerializedName("type")
    private String type;
    /**
     * 自定义字段的标识，在同一账号内唯一
     * <p> 示例值：candidate_resume
     */
    @SerializedName("key")
    private String key;
    /**
     * 自定义字段的名称，用户在安排背调表单看到的控件标题
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n name;
    /**
     * 是否必填
     * <p> 示例值：true
     */
    @SerializedName("is_required")
    private Boolean isRequired;
    /**
     * 自定义字段的描述，如果是输入控件，为用户在安排背调表单看到的 placeholder 或 提示文字
     * <p> 示例值：
     */
    @SerializedName("description")
    private I18n description;
    /**
     * type 为 select 或 multiselect 时必填，单选或多选的选项
     * <p> 示例值：
     */
    @SerializedName("options")
    private EcoBackgroundCheckCustomFieldDataOption[] options;

    // builder 开始
    public EcoBackgroundCheckCustomFieldData() {
    }

    public EcoBackgroundCheckCustomFieldData(Builder builder) {
        /**
         * 自定义字段类型
         * <p> 示例值：text
         */
        this.type = builder.type;
        /**
         * 自定义字段的标识，在同一账号内唯一
         * <p> 示例值：candidate_resume
         */
        this.key = builder.key;
        /**
         * 自定义字段的名称，用户在安排背调表单看到的控件标题
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 是否必填
         * <p> 示例值：true
         */
        this.isRequired = builder.isRequired;
        /**
         * 自定义字段的描述，如果是输入控件，为用户在安排背调表单看到的 placeholder 或 提示文字
         * <p> 示例值：
         */
        this.description = builder.description;
        /**
         * type 为 select 或 multiselect 时必填，单选或多选的选项
         * <p> 示例值：
         */
        this.options = builder.options;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public I18n getName() {
        return this.name;
    }

    public void setName(I18n name) {
        this.name = name;
    }

    public Boolean getIsRequired() {
        return this.isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public I18n getDescription() {
        return this.description;
    }

    public void setDescription(I18n description) {
        this.description = description;
    }

    public EcoBackgroundCheckCustomFieldDataOption[] getOptions() {
        return this.options;
    }

    public void setOptions(EcoBackgroundCheckCustomFieldDataOption[] options) {
        this.options = options;
    }

    public static class Builder {
        /**
         * 自定义字段类型
         * <p> 示例值：text
         */
        private String type;
        /**
         * 自定义字段的标识，在同一账号内唯一
         * <p> 示例值：candidate_resume
         */
        private String key;
        /**
         * 自定义字段的名称，用户在安排背调表单看到的控件标题
         * <p> 示例值：
         */
        private I18n name;
        /**
         * 是否必填
         * <p> 示例值：true
         */
        private Boolean isRequired;
        /**
         * 自定义字段的描述，如果是输入控件，为用户在安排背调表单看到的 placeholder 或 提示文字
         * <p> 示例值：
         */
        private I18n description;
        /**
         * type 为 select 或 multiselect 时必填，单选或多选的选项
         * <p> 示例值：
         */
        private EcoBackgroundCheckCustomFieldDataOption[] options;

        /**
         * 自定义字段类型
         * <p> 示例值：text
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }


        /**
         * 自定义字段的标识，在同一账号内唯一
         * <p> 示例值：candidate_resume
         *
         * @param key
         * @return
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }


        /**
         * 自定义字段的名称，用户在安排背调表单看到的控件标题
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(I18n name) {
            this.name = name;
            return this;
        }


        /**
         * 是否必填
         * <p> 示例值：true
         *
         * @param isRequired
         * @return
         */
        public Builder isRequired(Boolean isRequired) {
            this.isRequired = isRequired;
            return this;
        }


        /**
         * 自定义字段的描述，如果是输入控件，为用户在安排背调表单看到的 placeholder 或 提示文字
         * <p> 示例值：
         *
         * @param description
         * @return
         */
        public Builder description(I18n description) {
            this.description = description;
            return this;
        }


        /**
         * type 为 select 或 multiselect 时必填，单选或多选的选项
         * <p> 示例值：
         *
         * @param options
         * @return
         */
        public Builder options(EcoBackgroundCheckCustomFieldDataOption[] options) {
            this.options = options;
            return this;
        }


        public EcoBackgroundCheckCustomFieldData build() {
            return new EcoBackgroundCheckCustomFieldData(this);
        }
    }
}
