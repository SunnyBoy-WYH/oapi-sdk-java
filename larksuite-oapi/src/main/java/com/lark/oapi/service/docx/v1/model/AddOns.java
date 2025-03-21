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

public class AddOns {
    /**
     * 团队互动应用唯一ID
     * <p> 示例值：7056882725002051603
     */
    @SerializedName("component_id")
    private String componentId;
    /**
     * 团队互动应用类型，比如问答互动"blk_636a0a6657db8001c8df5488"
     * <p> 示例值：blk_636a0a6657db8001c8df5488
     */
    @SerializedName("component_type_id")
    private String componentTypeId;
    /**
     * 文档小组件内容数据，JSON 字符串
     * <p> 示例值："{}"
     */
    @SerializedName("record")
    private String record;

    // builder 开始
    public AddOns() {
    }

    public AddOns(Builder builder) {
        /**
         * 团队互动应用唯一ID
         * <p> 示例值：7056882725002051603
         */
        this.componentId = builder.componentId;
        /**
         * 团队互动应用类型，比如问答互动"blk_636a0a6657db8001c8df5488"
         * <p> 示例值：blk_636a0a6657db8001c8df5488
         */
        this.componentTypeId = builder.componentTypeId;
        /**
         * 文档小组件内容数据，JSON 字符串
         * <p> 示例值："{}"
         */
        this.record = builder.record;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getComponentId() {
        return this.componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public String getComponentTypeId() {
        return this.componentTypeId;
    }

    public void setComponentTypeId(String componentTypeId) {
        this.componentTypeId = componentTypeId;
    }

    public String getRecord() {
        return this.record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public static class Builder {
        /**
         * 团队互动应用唯一ID
         * <p> 示例值：7056882725002051603
         */
        private String componentId;
        /**
         * 团队互动应用类型，比如问答互动"blk_636a0a6657db8001c8df5488"
         * <p> 示例值：blk_636a0a6657db8001c8df5488
         */
        private String componentTypeId;
        /**
         * 文档小组件内容数据，JSON 字符串
         * <p> 示例值："{}"
         */
        private String record;

        /**
         * 团队互动应用唯一ID
         * <p> 示例值：7056882725002051603
         *
         * @param componentId
         * @return
         */
        public Builder componentId(String componentId) {
            this.componentId = componentId;
            return this;
        }


        /**
         * 团队互动应用类型，比如问答互动"blk_636a0a6657db8001c8df5488"
         * <p> 示例值：blk_636a0a6657db8001c8df5488
         *
         * @param componentTypeId
         * @return
         */
        public Builder componentTypeId(String componentTypeId) {
            this.componentTypeId = componentTypeId;
            return this;
        }


        /**
         * 文档小组件内容数据，JSON 字符串
         * <p> 示例值："{}"
         *
         * @param record
         * @return
         */
        public Builder record(String record) {
            this.record = record;
            return this;
        }


        public AddOns build() {
            return new AddOns(this);
        }
    }
}
