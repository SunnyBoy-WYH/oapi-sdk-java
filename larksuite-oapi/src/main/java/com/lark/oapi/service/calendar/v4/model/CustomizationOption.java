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

public class CustomizationOption {
    /**
     * 每个选项的唯一ID
     * <p> 示例值：16281481596185
     */
    @SerializedName("option_key")
    private String optionKey;
    /**
     * 当type类型为其它选项时，该参数需要填入
     * <p> 示例值：xxx
     */
    @SerializedName("others_content")
    private String othersContent;

    // builder 开始
    public CustomizationOption() {
    }

    public CustomizationOption(Builder builder) {
        /**
         * 每个选项的唯一ID
         * <p> 示例值：16281481596185
         */
        this.optionKey = builder.optionKey;
        /**
         * 当type类型为其它选项时，该参数需要填入
         * <p> 示例值：xxx
         */
        this.othersContent = builder.othersContent;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getOptionKey() {
        return this.optionKey;
    }

    public void setOptionKey(String optionKey) {
        this.optionKey = optionKey;
    }

    public String getOthersContent() {
        return this.othersContent;
    }

    public void setOthersContent(String othersContent) {
        this.othersContent = othersContent;
    }

    public static class Builder {
        /**
         * 每个选项的唯一ID
         * <p> 示例值：16281481596185
         */
        private String optionKey;
        /**
         * 当type类型为其它选项时，该参数需要填入
         * <p> 示例值：xxx
         */
        private String othersContent;

        /**
         * 每个选项的唯一ID
         * <p> 示例值：16281481596185
         *
         * @param optionKey
         * @return
         */
        public Builder optionKey(String optionKey) {
            this.optionKey = optionKey;
            return this;
        }


        /**
         * 当type类型为其它选项时，该参数需要填入
         * <p> 示例值：xxx
         *
         * @param othersContent
         * @return
         */
        public Builder othersContent(String othersContent) {
            this.othersContent = othersContent;
            return this;
        }


        public CustomizationOption build() {
            return new CustomizationOption(this);
        }
    }
}
