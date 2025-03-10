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

package com.lark.oapi.service.calendar.v4.model;

import com.google.gson.annotations.SerializedName;

public class CalendarAttendeeResourceCustomization {
    /**
     * 每个配置的唯一ID
     * <p> 示例值：16281481596100
     */
    @SerializedName("index_key")
    private String indexKey;
    /**
     * 当type类型为填空时，该参数需要填入
     * <p> 示例值：xxx
     */
    @SerializedName("input_content")
    private String inputContent;
    /**
     * 每个配置的选项
     * <p> 示例值：
     */
    @SerializedName("options")
    private CustomizationOption[] options;

    // builder 开始
    public CalendarAttendeeResourceCustomization() {
    }

    public CalendarAttendeeResourceCustomization(Builder builder) {
        /**
         * 每个配置的唯一ID
         * <p> 示例值：16281481596100
         */
        this.indexKey = builder.indexKey;
        /**
         * 当type类型为填空时，该参数需要填入
         * <p> 示例值：xxx
         */
        this.inputContent = builder.inputContent;
        /**
         * 每个配置的选项
         * <p> 示例值：
         */
        this.options = builder.options;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getIndexKey() {
        return this.indexKey;
    }

    public void setIndexKey(String indexKey) {
        this.indexKey = indexKey;
    }

    public String getInputContent() {
        return this.inputContent;
    }

    public void setInputContent(String inputContent) {
        this.inputContent = inputContent;
    }

    public CustomizationOption[] getOptions() {
        return this.options;
    }

    public void setOptions(CustomizationOption[] options) {
        this.options = options;
    }

    public static class Builder {
        /**
         * 每个配置的唯一ID
         * <p> 示例值：16281481596100
         */
        private String indexKey;
        /**
         * 当type类型为填空时，该参数需要填入
         * <p> 示例值：xxx
         */
        private String inputContent;
        /**
         * 每个配置的选项
         * <p> 示例值：
         */
        private CustomizationOption[] options;

        /**
         * 每个配置的唯一ID
         * <p> 示例值：16281481596100
         *
         * @param indexKey
         * @return
         */
        public Builder indexKey(String indexKey) {
            this.indexKey = indexKey;
            return this;
        }


        /**
         * 当type类型为填空时，该参数需要填入
         * <p> 示例值：xxx
         *
         * @param inputContent
         * @return
         */
        public Builder inputContent(String inputContent) {
            this.inputContent = inputContent;
            return this;
        }


        /**
         * 每个配置的选项
         * <p> 示例值：
         *
         * @param options
         * @return
         */
        public Builder options(CustomizationOption[] options) {
            this.options = options;
            return this;
        }


        public CalendarAttendeeResourceCustomization build() {
            return new CalendarAttendeeResourceCustomization(this);
        }
    }
}
