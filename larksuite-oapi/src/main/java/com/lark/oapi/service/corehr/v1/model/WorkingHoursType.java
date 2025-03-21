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

public class WorkingHoursType {
    /**
     * 工时制度 ID
     * <p> 示例值：6890452208593372679
     */
    @SerializedName("id")
    private String id;
    /**
     * 编码
     * <p> 示例值：1
     */
    @SerializedName("code")
    private String code;
    /**
     * 名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n[] name;
    /**
     * 国家/地区 ID 列表
     * <p> 示例值：创建成功的工时制度信息
     */
    @SerializedName("country_region_id_list")
    private String[] countryRegionIdList;
    /**
     * 职务默认值
     * <p> 示例值：true
     */
    @SerializedName("default_for_job")
    private Boolean defaultForJob;
    /**
     * 是否启用
     * <p> 示例值：true
     */
    @SerializedName("active")
    private Boolean active;
    /**
     * 自定义字段
     * <p> 示例值：
     */
    @SerializedName("custom_fields")
    private ObjectFieldData[] customFields;

    // builder 开始
    public WorkingHoursType() {
    }

    public WorkingHoursType(Builder builder) {
        /**
         * 工时制度 ID
         * <p> 示例值：6890452208593372679
         */
        this.id = builder.id;
        /**
         * 编码
         * <p> 示例值：1
         */
        this.code = builder.code;
        /**
         * 名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 国家/地区 ID 列表
         * <p> 示例值：创建成功的工时制度信息
         */
        this.countryRegionIdList = builder.countryRegionIdList;
        /**
         * 职务默认值
         * <p> 示例值：true
         */
        this.defaultForJob = builder.defaultForJob;
        /**
         * 是否启用
         * <p> 示例值：true
         */
        this.active = builder.active;
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

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public I18n[] getName() {
        return this.name;
    }

    public void setName(I18n[] name) {
        this.name = name;
    }

    public String[] getCountryRegionIdList() {
        return this.countryRegionIdList;
    }

    public void setCountryRegionIdList(String[] countryRegionIdList) {
        this.countryRegionIdList = countryRegionIdList;
    }

    public Boolean getDefaultForJob() {
        return this.defaultForJob;
    }

    public void setDefaultForJob(Boolean defaultForJob) {
        this.defaultForJob = defaultForJob;
    }

    public Boolean getActive() {
        return this.active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public ObjectFieldData[] getCustomFields() {
        return this.customFields;
    }

    public void setCustomFields(ObjectFieldData[] customFields) {
        this.customFields = customFields;
    }

    public static class Builder {
        /**
         * 工时制度 ID
         * <p> 示例值：6890452208593372679
         */
        private String id;
        /**
         * 编码
         * <p> 示例值：1
         */
        private String code;
        /**
         * 名称
         * <p> 示例值：
         */
        private I18n[] name;
        /**
         * 国家/地区 ID 列表
         * <p> 示例值：创建成功的工时制度信息
         */
        private String[] countryRegionIdList;
        /**
         * 职务默认值
         * <p> 示例值：true
         */
        private Boolean defaultForJob;
        /**
         * 是否启用
         * <p> 示例值：true
         */
        private Boolean active;
        /**
         * 自定义字段
         * <p> 示例值：
         */
        private ObjectFieldData[] customFields;

        /**
         * 工时制度 ID
         * <p> 示例值：6890452208593372679
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 编码
         * <p> 示例值：1
         *
         * @param code
         * @return
         */
        public Builder code(String code) {
            this.code = code;
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
         * 国家/地区 ID 列表
         * <p> 示例值：创建成功的工时制度信息
         *
         * @param countryRegionIdList
         * @return
         */
        public Builder countryRegionIdList(String[] countryRegionIdList) {
            this.countryRegionIdList = countryRegionIdList;
            return this;
        }


        /**
         * 职务默认值
         * <p> 示例值：true
         *
         * @param defaultForJob
         * @return
         */
        public Builder defaultForJob(Boolean defaultForJob) {
            this.defaultForJob = defaultForJob;
            return this;
        }


        /**
         * 是否启用
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


        public WorkingHoursType build() {
            return new WorkingHoursType(this);
        }
    }
}
