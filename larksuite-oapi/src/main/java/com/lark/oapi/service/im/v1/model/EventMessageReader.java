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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class EventMessageReader {
    /**
     * 用户 ID
     * <p> 示例值：ou_5ad573a6411d72b8305fda3a9c15c70e
     */
    @SerializedName("reader_id")
    private UserId readerId;
    /**
     * 阅读时间
     * <p> 示例值：1609484183000
     */
    @SerializedName("read_time")
    private String readTime;
    /**
     * 租户key，为租户在飞书上的唯一标识，用来换取对应的tenant_access_token，也可以用作租户在应用里面的唯一标识
     * <p> 示例值：736588c9260f175e
     */
    @SerializedName("tenant_key")
    private String tenantKey;

    // builder 开始
    public EventMessageReader() {
    }

    public EventMessageReader(Builder builder) {
        /**
         * 用户 ID
         * <p> 示例值：ou_5ad573a6411d72b8305fda3a9c15c70e
         */
        this.readerId = builder.readerId;
        /**
         * 阅读时间
         * <p> 示例值：1609484183000
         */
        this.readTime = builder.readTime;
        /**
         * 租户key，为租户在飞书上的唯一标识，用来换取对应的tenant_access_token，也可以用作租户在应用里面的唯一标识
         * <p> 示例值：736588c9260f175e
         */
        this.tenantKey = builder.tenantKey;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public UserId getReaderId() {
        return this.readerId;
    }

    public void setReaderId(UserId readerId) {
        this.readerId = readerId;
    }

    public String getReadTime() {
        return this.readTime;
    }

    public void setReadTime(String readTime) {
        this.readTime = readTime;
    }

    public String getTenantKey() {
        return this.tenantKey;
    }

    public void setTenantKey(String tenantKey) {
        this.tenantKey = tenantKey;
    }

    public static class Builder {
        /**
         * 用户 ID
         * <p> 示例值：ou_5ad573a6411d72b8305fda3a9c15c70e
         */
        private UserId readerId;
        /**
         * 阅读时间
         * <p> 示例值：1609484183000
         */
        private String readTime;
        /**
         * 租户key，为租户在飞书上的唯一标识，用来换取对应的tenant_access_token，也可以用作租户在应用里面的唯一标识
         * <p> 示例值：736588c9260f175e
         */
        private String tenantKey;

        /**
         * 用户 ID
         * <p> 示例值：ou_5ad573a6411d72b8305fda3a9c15c70e
         *
         * @param readerId
         * @return
         */
        public Builder readerId(UserId readerId) {
            this.readerId = readerId;
            return this;
        }


        /**
         * 阅读时间
         * <p> 示例值：1609484183000
         *
         * @param readTime
         * @return
         */
        public Builder readTime(String readTime) {
            this.readTime = readTime;
            return this;
        }


        /**
         * 租户key，为租户在飞书上的唯一标识，用来换取对应的tenant_access_token，也可以用作租户在应用里面的唯一标识
         * <p> 示例值：736588c9260f175e
         *
         * @param tenantKey
         * @return
         */
        public Builder tenantKey(String tenantKey) {
            this.tenantKey = tenantKey;
            return this;
        }


        public EventMessageReader build() {
            return new EventMessageReader(this);
        }
    }
}
