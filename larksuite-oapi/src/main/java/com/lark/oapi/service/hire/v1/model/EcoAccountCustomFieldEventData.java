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

public class EcoAccountCustomFieldEventData {
    /**
     * 自定义字段的标识
     * <p> 示例值：ord_id
     */
    @SerializedName("key")
    private String key;
    /**
     * 自定义字段的值
     * <p> 示例值：7233333
     */
    @SerializedName("value")
    private String value;

    // builder 开始
    public EcoAccountCustomFieldEventData() {
    }

    public EcoAccountCustomFieldEventData(Builder builder) {
        /**
         * 自定义字段的标识
         * <p> 示例值：ord_id
         */
        this.key = builder.key;
        /**
         * 自定义字段的值
         * <p> 示例值：7233333
         */
        this.value = builder.value;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static class Builder {
        /**
         * 自定义字段的标识
         * <p> 示例值：ord_id
         */
        private String key;
        /**
         * 自定义字段的值
         * <p> 示例值：7233333
         */
        private String value;

        /**
         * 自定义字段的标识
         * <p> 示例值：ord_id
         *
         * @param key
         * @return
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }


        /**
         * 自定义字段的值
         * <p> 示例值：7233333
         *
         * @param value
         * @return
         */
        public Builder value(String value) {
            this.value = value;
            return this;
        }


        public EcoAccountCustomFieldEventData build() {
            return new EcoAccountCustomFieldEventData(this);
        }
    }
}
