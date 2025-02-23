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

package com.lark.oapi.service.human_authentication.v1.model;

import com.google.gson.annotations.SerializedName;

public class Identity {
    /**
     * user identity name
     * <p> 示例值：
     */
    @SerializedName("identity_name")
    private String identityName;
    /**
     * user identity code
     * <p> 示例值：
     */
    @SerializedName("identity_code")
    private String identityCode;
    /**
     * user mobile
     * <p> 示例值：
     */
    @SerializedName("mobile")
    private String mobile;

    // builder 开始
    public Identity() {
    }

    public Identity(Builder builder) {
        /**
         * user identity name
         * <p> 示例值：
         */
        this.identityName = builder.identityName;
        /**
         * user identity code
         * <p> 示例值：
         */
        this.identityCode = builder.identityCode;
        /**
         * user mobile
         * <p> 示例值：
         */
        this.mobile = builder.mobile;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getIdentityName() {
        return this.identityName;
    }

    public void setIdentityName(String identityName) {
        this.identityName = identityName;
    }

    public String getIdentityCode() {
        return this.identityCode;
    }

    public void setIdentityCode(String identityCode) {
        this.identityCode = identityCode;
    }

    public String getMobile() {
        return this.mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public static class Builder {
        /**
         * user identity name
         * <p> 示例值：
         */
        private String identityName;
        /**
         * user identity code
         * <p> 示例值：
         */
        private String identityCode;
        /**
         * user mobile
         * <p> 示例值：
         */
        private String mobile;

        /**
         * user identity name
         * <p> 示例值：
         *
         * @param identityName
         * @return
         */
        public Builder identityName(String identityName) {
            this.identityName = identityName;
            return this;
        }


        /**
         * user identity code
         * <p> 示例值：
         *
         * @param identityCode
         * @return
         */
        public Builder identityCode(String identityCode) {
            this.identityCode = identityCode;
            return this;
        }


        /**
         * user mobile
         * <p> 示例值：
         *
         * @param mobile
         * @return
         */
        public Builder mobile(String mobile) {
            this.mobile = mobile;
            return this;
        }


        public Identity build() {
            return new Identity(this);
        }
    }
}
