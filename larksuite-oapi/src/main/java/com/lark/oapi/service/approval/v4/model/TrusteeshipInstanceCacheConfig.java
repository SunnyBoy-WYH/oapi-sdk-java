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

package com.lark.oapi.service.approval.v4.model;

import com.google.gson.annotations.SerializedName;

public class TrusteeshipInstanceCacheConfig {
    /**
     * 托管预缓存策略
     * <p> 示例值：DISABLE
     */
    @SerializedName("form_policy")
    private String formPolicy;
    /**
     * 表单是否随国际化改变
     * <p> 示例值：false
     */
    @SerializedName("form_vary_with_locale")
    private Boolean formVaryWithLocale;
    /**
     * 当前使用的表单版本号，保证表单改变后，版本号增加，实际值为int64整数
     * <p> 示例值："1"
     */
    @SerializedName("form_version")
    private String formVersion;

    // builder 开始
    public TrusteeshipInstanceCacheConfig() {
    }

    public TrusteeshipInstanceCacheConfig(Builder builder) {
        /**
         * 托管预缓存策略
         * <p> 示例值：DISABLE
         */
        this.formPolicy = builder.formPolicy;
        /**
         * 表单是否随国际化改变
         * <p> 示例值：false
         */
        this.formVaryWithLocale = builder.formVaryWithLocale;
        /**
         * 当前使用的表单版本号，保证表单改变后，版本号增加，实际值为int64整数
         * <p> 示例值："1"
         */
        this.formVersion = builder.formVersion;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFormPolicy() {
        return this.formPolicy;
    }

    public void setFormPolicy(String formPolicy) {
        this.formPolicy = formPolicy;
    }

    public Boolean getFormVaryWithLocale() {
        return this.formVaryWithLocale;
    }

    public void setFormVaryWithLocale(Boolean formVaryWithLocale) {
        this.formVaryWithLocale = formVaryWithLocale;
    }

    public String getFormVersion() {
        return this.formVersion;
    }

    public void setFormVersion(String formVersion) {
        this.formVersion = formVersion;
    }

    public static class Builder {
        /**
         * 托管预缓存策略
         * <p> 示例值：DISABLE
         */
        private String formPolicy;
        /**
         * 表单是否随国际化改变
         * <p> 示例值：false
         */
        private Boolean formVaryWithLocale;
        /**
         * 当前使用的表单版本号，保证表单改变后，版本号增加，实际值为int64整数
         * <p> 示例值："1"
         */
        private String formVersion;

        /**
         * 托管预缓存策略
         * <p> 示例值：DISABLE
         *
         * @param formPolicy
         * @return
         */
        public Builder formPolicy(String formPolicy) {
            this.formPolicy = formPolicy;
            return this;
        }

        /**
         * 托管预缓存策略
         * <p> 示例值：DISABLE
         *
         * @param formPolicy {@link com.lark.oapi.service.approval.v4.enums.TrusteeshipInstanceCacheConfigFormPolicyEnum}
         * @return
         */
        public Builder formPolicy(com.lark.oapi.service.approval.v4.enums.TrusteeshipInstanceCacheConfigFormPolicyEnum formPolicy) {
            this.formPolicy = formPolicy.getValue();
            return this;
        }


        /**
         * 表单是否随国际化改变
         * <p> 示例值：false
         *
         * @param formVaryWithLocale
         * @return
         */
        public Builder formVaryWithLocale(Boolean formVaryWithLocale) {
            this.formVaryWithLocale = formVaryWithLocale;
            return this;
        }


        /**
         * 当前使用的表单版本号，保证表单改变后，版本号增加，实际值为int64整数
         * <p> 示例值："1"
         *
         * @param formVersion
         * @return
         */
        public Builder formVersion(String formVersion) {
            this.formVersion = formVersion;
            return this;
        }


        public TrusteeshipInstanceCacheConfig build() {
            return new TrusteeshipInstanceCacheConfig(this);
        }
    }
}
