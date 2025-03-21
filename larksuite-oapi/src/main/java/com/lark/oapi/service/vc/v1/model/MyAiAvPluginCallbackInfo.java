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

package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class MyAiAvPluginCallbackInfo {
    /**
     * biz id info
     * <p> 示例值：file_3e042213
     */
    @SerializedName("biz_id")
    private String bizId;
    /**
     * biz type
     * <p> 示例值：1
     */
    @SerializedName("biz_type")
    private Integer bizType;
    /**
     * object_id info
     * <p> 示例值：1695036250478
     */
    @SerializedName("object_id")
    private String objectId;
    /**
     * type
     * <p> 示例值：Media
     */
    @SerializedName("type")
    private String type;

    // builder 开始
    public MyAiAvPluginCallbackInfo() {
    }

    public MyAiAvPluginCallbackInfo(Builder builder) {
        /**
         * biz id info
         * <p> 示例值：file_3e042213
         */
        this.bizId = builder.bizId;
        /**
         * biz type
         * <p> 示例值：1
         */
        this.bizType = builder.bizType;
        /**
         * object_id info
         * <p> 示例值：1695036250478
         */
        this.objectId = builder.objectId;
        /**
         * type
         * <p> 示例值：Media
         */
        this.type = builder.type;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getBizId() {
        return this.bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public Integer getBizType() {
        return this.bizType;
    }

    public void setBizType(Integer bizType) {
        this.bizType = bizType;
    }

    public String getObjectId() {
        return this.objectId;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class Builder {
        /**
         * biz id info
         * <p> 示例值：file_3e042213
         */
        private String bizId;
        /**
         * biz type
         * <p> 示例值：1
         */
        private Integer bizType;
        /**
         * object_id info
         * <p> 示例值：1695036250478
         */
        private String objectId;
        /**
         * type
         * <p> 示例值：Media
         */
        private String type;

        /**
         * biz id info
         * <p> 示例值：file_3e042213
         *
         * @param bizId
         * @return
         */
        public Builder bizId(String bizId) {
            this.bizId = bizId;
            return this;
        }


        /**
         * biz type
         * <p> 示例值：1
         *
         * @param bizType
         * @return
         */
        public Builder bizType(Integer bizType) {
            this.bizType = bizType;
            return this;
        }


        /**
         * object_id info
         * <p> 示例值：1695036250478
         *
         * @param objectId
         * @return
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }


        /**
         * type
         * <p> 示例值：Media
         *
         * @param type
         * @return
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }


        public MyAiAvPluginCallbackInfo build() {
            return new MyAiAvPluginCallbackInfo(this);
        }
    }
}
