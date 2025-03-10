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

package com.lark.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;

public class DeletePublicMailboxAliasReq {
    /**
     * 公共邮箱id或公共邮箱地址
     * <p> 示例值：xxxxxx 或 xxx@xx.xxx
     */
    @Path
    @SerializedName("public_mailbox_id")
    private String publicMailboxId;
    /**
     * 公共邮箱别名
     * <p> 示例值：xxx@xx.xxx
     */
    @Path
    @SerializedName("alias_id")
    private String aliasId;

    // builder 开始
    public DeletePublicMailboxAliasReq() {
    }

    public DeletePublicMailboxAliasReq(Builder builder) {
        /**
         * 公共邮箱id或公共邮箱地址
         * <p> 示例值：xxxxxx 或 xxx@xx.xxx
         */
        this.publicMailboxId = builder.publicMailboxId;
        /**
         * 公共邮箱别名
         * <p> 示例值：xxx@xx.xxx
         */
        this.aliasId = builder.aliasId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getPublicMailboxId() {
        return this.publicMailboxId;
    }

    public void setPublicMailboxId(String publicMailboxId) {
        this.publicMailboxId = publicMailboxId;
    }

    public String getAliasId() {
        return this.aliasId;
    }

    public void setAliasId(String aliasId) {
        this.aliasId = aliasId;
    }

    public static class Builder {

        private String publicMailboxId; // 公共邮箱id或公共邮箱地址
        private String aliasId; // 公共邮箱别名

        /**
         * 公共邮箱id或公共邮箱地址
         * <p> 示例值：xxxxxx 或 xxx@xx.xxx
         *
         * @param publicMailboxId
         * @return
         */
        public Builder publicMailboxId(String publicMailboxId) {
            this.publicMailboxId = publicMailboxId;
            return this;
        }


        /**
         * 公共邮箱别名
         * <p> 示例值：xxx@xx.xxx
         *
         * @param aliasId
         * @return
         */
        public Builder aliasId(String aliasId) {
            this.aliasId = aliasId;
            return this;
        }

        public DeletePublicMailboxAliasReq build() {
            return new DeletePublicMailboxAliasReq(this);
        }
    }
}
