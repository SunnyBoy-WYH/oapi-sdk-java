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

package com.lark.oapi.service.wiki.v2.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Query;

public class GetNodeSpaceReq {
    /**
     * 文档的节点token
     * <p> 示例值：wikcnKQ1k3p******8Vabcef
     */
    @Query
    @SerializedName("token")
    private String token;
    /**
     * 文档类型
     * <p> 示例值：docx
     */
    @Query
    @SerializedName("obj_type")
    private String objType;

    // builder 开始
    public GetNodeSpaceReq() {
    }

    public GetNodeSpaceReq(Builder builder) {
        /**
         * 文档的节点token
         * <p> 示例值：wikcnKQ1k3p******8Vabcef
         */
        this.token = builder.token;
        /**
         * 文档类型
         * <p> 示例值：docx
         */
        this.objType = builder.objType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getObjType() {
        return this.objType;
    }

    public void setObjType(String objType) {
        this.objType = objType;
    }

    public static class Builder {
        private String token; // 文档的节点token
        private String objType; // 文档类型


        /**
         * 文档的节点token
         * <p> 示例值：wikcnKQ1k3p******8Vabcef
         *
         * @param token
         * @return
         */
        public Builder token(String token) {
            this.token = token;
            return this;
        }


        /**
         * 文档类型
         * <p> 示例值：docx
         *
         * @param objType
         * @return
         */
        public Builder objType(String objType) {
            this.objType = objType;
            return this;
        }

        /**
         * 文档类型
         * <p> 示例值：docx
         *
         * @param objType {@link com.lark.oapi.service.wiki.v2.enums.GetNodeSpaceObjTypeForQueryEnum}
         * @return
         */
        public Builder objType(com.lark.oapi.service.wiki.v2.enums.GetNodeSpaceObjTypeForQueryEnum objType) {
            this.objType = objType.getValue();
            return this;
        }

        public GetNodeSpaceReq build() {
            return new GetNodeSpaceReq(this);
        }
    }
}
