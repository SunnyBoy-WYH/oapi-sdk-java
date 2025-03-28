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

package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;

public class AppTableForm {
    /**
     * 表单名称
     * <p> 示例值：表单
     */
    @SerializedName("name")
    private String name;
    /**
     * 表单描述
     * <p> 示例值：表单描述
     */
    @SerializedName("description")
    private String description;
    /**
     * 是否开启共享
     * <p> 示例值：true
     */
    @SerializedName("shared")
    private Boolean shared;
    /**
     * 分享 URL
     * <p> 示例值：https://bytedance.feishu.cn/share/base/shrcnCy1KAlpahNotmhRn1abcde
     */
    @SerializedName("shared_url")
    private String sharedUrl;
    /**
     * 分享范围限制
     * <p> 示例值：tenant_editable
     */
    @SerializedName("shared_limit")
    private String sharedLimit;
    /**
     * 填写次数限制一次
     * <p> 示例值：true
     */
    @SerializedName("submit_limit_once")
    private Boolean submitLimitOnce;

    // builder 开始
    public AppTableForm() {
    }

    public AppTableForm(Builder builder) {
        /**
         * 表单名称
         * <p> 示例值：表单
         */
        this.name = builder.name;
        /**
         * 表单描述
         * <p> 示例值：表单描述
         */
        this.description = builder.description;
        /**
         * 是否开启共享
         * <p> 示例值：true
         */
        this.shared = builder.shared;
        /**
         * 分享 URL
         * <p> 示例值：https://bytedance.feishu.cn/share/base/shrcnCy1KAlpahNotmhRn1abcde
         */
        this.sharedUrl = builder.sharedUrl;
        /**
         * 分享范围限制
         * <p> 示例值：tenant_editable
         */
        this.sharedLimit = builder.sharedLimit;
        /**
         * 填写次数限制一次
         * <p> 示例值：true
         */
        this.submitLimitOnce = builder.submitLimitOnce;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getShared() {
        return this.shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public String getSharedUrl() {
        return this.sharedUrl;
    }

    public void setSharedUrl(String sharedUrl) {
        this.sharedUrl = sharedUrl;
    }

    public String getSharedLimit() {
        return this.sharedLimit;
    }

    public void setSharedLimit(String sharedLimit) {
        this.sharedLimit = sharedLimit;
    }

    public Boolean getSubmitLimitOnce() {
        return this.submitLimitOnce;
    }

    public void setSubmitLimitOnce(Boolean submitLimitOnce) {
        this.submitLimitOnce = submitLimitOnce;
    }

    public static class Builder {
        /**
         * 表单名称
         * <p> 示例值：表单
         */
        private String name;
        /**
         * 表单描述
         * <p> 示例值：表单描述
         */
        private String description;
        /**
         * 是否开启共享
         * <p> 示例值：true
         */
        private Boolean shared;
        /**
         * 分享 URL
         * <p> 示例值：https://bytedance.feishu.cn/share/base/shrcnCy1KAlpahNotmhRn1abcde
         */
        private String sharedUrl;
        /**
         * 分享范围限制
         * <p> 示例值：tenant_editable
         */
        private String sharedLimit;
        /**
         * 填写次数限制一次
         * <p> 示例值：true
         */
        private Boolean submitLimitOnce;

        /**
         * 表单名称
         * <p> 示例值：表单
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 表单描述
         * <p> 示例值：表单描述
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 是否开启共享
         * <p> 示例值：true
         *
         * @param shared
         * @return
         */
        public Builder shared(Boolean shared) {
            this.shared = shared;
            return this;
        }


        /**
         * 分享 URL
         * <p> 示例值：https://bytedance.feishu.cn/share/base/shrcnCy1KAlpahNotmhRn1abcde
         *
         * @param sharedUrl
         * @return
         */
        public Builder sharedUrl(String sharedUrl) {
            this.sharedUrl = sharedUrl;
            return this;
        }


        /**
         * 分享范围限制
         * <p> 示例值：tenant_editable
         *
         * @param sharedLimit
         * @return
         */
        public Builder sharedLimit(String sharedLimit) {
            this.sharedLimit = sharedLimit;
            return this;
        }

        /**
         * 分享范围限制
         * <p> 示例值：tenant_editable
         *
         * @param sharedLimit {@link com.lark.oapi.service.bitable.v1.enums.AppTableFormSharedLimitEnum}
         * @return
         */
        public Builder sharedLimit(com.lark.oapi.service.bitable.v1.enums.AppTableFormSharedLimitEnum sharedLimit) {
            this.sharedLimit = sharedLimit.getValue();
            return this;
        }


        /**
         * 填写次数限制一次
         * <p> 示例值：true
         *
         * @param submitLimitOnce
         * @return
         */
        public Builder submitLimitOnce(Boolean submitLimitOnce) {
            this.submitLimitOnce = submitLimitOnce;
            return this;
        }


        public AppTableForm build() {
            return new AppTableForm(this);
        }
    }
}
