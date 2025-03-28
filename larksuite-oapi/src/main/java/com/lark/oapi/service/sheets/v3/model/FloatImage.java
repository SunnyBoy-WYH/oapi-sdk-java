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

package com.lark.oapi.service.sheets.v3.model;

import com.google.gson.annotations.SerializedName;

public class FloatImage {
    /**
     * 浮动图片 id
     * <p> 示例值：ye06SS14ph
     */
    @SerializedName("float_image_id")
    private String floatImageId;
    /**
     * 【更新时不用传，创建需要】浮动图片 token，需要先上传图片到表格获得此 token 之后再进行浮动图片的相关操作
     * <p> 示例值：boxbcbQsaSqIXsxxxxx1HCPJFbh
     */
    @SerializedName("float_image_token")
    private String floatImageToken;
    /**
     * 浮动图片的左上角单元格定位，只支持一个单元格
     * <p> 示例值：0b**12!A1:A1
     */
    @SerializedName("range")
    private String range;
    /**
     * 浮动图片的宽度，大于等于 20px
     * <p> 示例值：100
     */
    @SerializedName("width")
    private Double width;
    /**
     * 浮动图片的高度，大于等于 20px
     * <p> 示例值：100
     */
    @SerializedName("height")
    private Double height;
    /**
     * 浮动图片左上角所在位置相对于所在单元格左上角的横向偏移，大于等于0且小于所在单元格的宽度
     * <p> 示例值：0
     */
    @SerializedName("offset_x")
    private Double offsetX;
    /**
     * 浮动图片左上角所在位置相对于所在单元格左上角的纵向偏移，大于等于0且小于所在单元格的高度
     * <p> 示例值：0
     */
    @SerializedName("offset_y")
    private Double offsetY;

    // builder 开始
    public FloatImage() {
    }

    public FloatImage(Builder builder) {
        /**
         * 浮动图片 id
         * <p> 示例值：ye06SS14ph
         */
        this.floatImageId = builder.floatImageId;
        /**
         * 【更新时不用传，创建需要】浮动图片 token，需要先上传图片到表格获得此 token 之后再进行浮动图片的相关操作
         * <p> 示例值：boxbcbQsaSqIXsxxxxx1HCPJFbh
         */
        this.floatImageToken = builder.floatImageToken;
        /**
         * 浮动图片的左上角单元格定位，只支持一个单元格
         * <p> 示例值：0b**12!A1:A1
         */
        this.range = builder.range;
        /**
         * 浮动图片的宽度，大于等于 20px
         * <p> 示例值：100
         */
        this.width = builder.width;
        /**
         * 浮动图片的高度，大于等于 20px
         * <p> 示例值：100
         */
        this.height = builder.height;
        /**
         * 浮动图片左上角所在位置相对于所在单元格左上角的横向偏移，大于等于0且小于所在单元格的宽度
         * <p> 示例值：0
         */
        this.offsetX = builder.offsetX;
        /**
         * 浮动图片左上角所在位置相对于所在单元格左上角的纵向偏移，大于等于0且小于所在单元格的高度
         * <p> 示例值：0
         */
        this.offsetY = builder.offsetY;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFloatImageId() {
        return this.floatImageId;
    }

    public void setFloatImageId(String floatImageId) {
        this.floatImageId = floatImageId;
    }

    public String getFloatImageToken() {
        return this.floatImageToken;
    }

    public void setFloatImageToken(String floatImageToken) {
        this.floatImageToken = floatImageToken;
    }

    public String getRange() {
        return this.range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public Double getWidth() {
        return this.width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return this.height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getOffsetX() {
        return this.offsetX;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public Double getOffsetY() {
        return this.offsetY;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }

    public static class Builder {
        /**
         * 浮动图片 id
         * <p> 示例值：ye06SS14ph
         */
        private String floatImageId;
        /**
         * 【更新时不用传，创建需要】浮动图片 token，需要先上传图片到表格获得此 token 之后再进行浮动图片的相关操作
         * <p> 示例值：boxbcbQsaSqIXsxxxxx1HCPJFbh
         */
        private String floatImageToken;
        /**
         * 浮动图片的左上角单元格定位，只支持一个单元格
         * <p> 示例值：0b**12!A1:A1
         */
        private String range;
        /**
         * 浮动图片的宽度，大于等于 20px
         * <p> 示例值：100
         */
        private Double width;
        /**
         * 浮动图片的高度，大于等于 20px
         * <p> 示例值：100
         */
        private Double height;
        /**
         * 浮动图片左上角所在位置相对于所在单元格左上角的横向偏移，大于等于0且小于所在单元格的宽度
         * <p> 示例值：0
         */
        private Double offsetX;
        /**
         * 浮动图片左上角所在位置相对于所在单元格左上角的纵向偏移，大于等于0且小于所在单元格的高度
         * <p> 示例值：0
         */
        private Double offsetY;

        /**
         * 浮动图片 id
         * <p> 示例值：ye06SS14ph
         *
         * @param floatImageId
         * @return
         */
        public Builder floatImageId(String floatImageId) {
            this.floatImageId = floatImageId;
            return this;
        }


        /**
         * 【更新时不用传，创建需要】浮动图片 token，需要先上传图片到表格获得此 token 之后再进行浮动图片的相关操作
         * <p> 示例值：boxbcbQsaSqIXsxxxxx1HCPJFbh
         *
         * @param floatImageToken
         * @return
         */
        public Builder floatImageToken(String floatImageToken) {
            this.floatImageToken = floatImageToken;
            return this;
        }


        /**
         * 浮动图片的左上角单元格定位，只支持一个单元格
         * <p> 示例值：0b**12!A1:A1
         *
         * @param range
         * @return
         */
        public Builder range(String range) {
            this.range = range;
            return this;
        }


        /**
         * 浮动图片的宽度，大于等于 20px
         * <p> 示例值：100
         *
         * @param width
         * @return
         */
        public Builder width(Double width) {
            this.width = width;
            return this;
        }


        /**
         * 浮动图片的高度，大于等于 20px
         * <p> 示例值：100
         *
         * @param height
         * @return
         */
        public Builder height(Double height) {
            this.height = height;
            return this;
        }


        /**
         * 浮动图片左上角所在位置相对于所在单元格左上角的横向偏移，大于等于0且小于所在单元格的宽度
         * <p> 示例值：0
         *
         * @param offsetX
         * @return
         */
        public Builder offsetX(Double offsetX) {
            this.offsetX = offsetX;
            return this;
        }


        /**
         * 浮动图片左上角所在位置相对于所在单元格左上角的纵向偏移，大于等于0且小于所在单元格的高度
         * <p> 示例值：0
         *
         * @param offsetY
         * @return
         */
        public Builder offsetY(Double offsetY) {
            this.offsetY = offsetY;
            return this;
        }


        public FloatImage build() {
            return new FloatImage(this);
        }
    }
}
