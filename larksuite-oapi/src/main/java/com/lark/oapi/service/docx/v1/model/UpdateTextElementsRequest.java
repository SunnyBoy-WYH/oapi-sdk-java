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

package com.lark.oapi.service.docx.v1.model;

import com.google.gson.annotations.SerializedName;

public class UpdateTextElementsRequest {
    /**
     * 更新的文本元素列表，单次更新中 reminder 上限 30 个，mention_doc 上限 50 个，mention_user 上限 100 个
     * <p> 示例值：
     */
    @SerializedName("elements")
    private TextElement[] elements;

    // builder 开始
    public UpdateTextElementsRequest() {
    }

    public UpdateTextElementsRequest(Builder builder) {
        /**
         * 更新的文本元素列表，单次更新中 reminder 上限 30 个，mention_doc 上限 50 个，mention_user 上限 100 个
         * <p> 示例值：
         */
        this.elements = builder.elements;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public TextElement[] getElements() {
        return this.elements;
    }

    public void setElements(TextElement[] elements) {
        this.elements = elements;
    }

    public static class Builder {
        /**
         * 更新的文本元素列表，单次更新中 reminder 上限 30 个，mention_doc 上限 50 个，mention_user 上限 100 个
         * <p> 示例值：
         */
        private TextElement[] elements;

        /**
         * 更新的文本元素列表，单次更新中 reminder 上限 30 个，mention_doc 上限 50 个，mention_user 上限 100 个
         * <p> 示例值：
         *
         * @param elements
         * @return
         */
        public Builder elements(TextElement[] elements) {
            this.elements = elements;
            return this;
        }


        public UpdateTextElementsRequest build() {
            return new UpdateTextElementsRequest(this);
        }
    }
}
