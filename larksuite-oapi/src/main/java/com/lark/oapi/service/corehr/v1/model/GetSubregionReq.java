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

package com.lark.oapi.service.corehr.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;

public class GetSubregionReq {
    /**
     * 城市/区域 ID
     * <p> 示例值：67489937334909845
     */
    @Path
    @SerializedName("subregion_id")
    private String subregionId;

    // builder 开始
    public GetSubregionReq() {
    }

    public GetSubregionReq(Builder builder) {
        /**
         * 城市/区域 ID
         * <p> 示例值：67489937334909845
         */
        this.subregionId = builder.subregionId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getSubregionId() {
        return this.subregionId;
    }

    public void setSubregionId(String subregionId) {
        this.subregionId = subregionId;
    }

    public static class Builder {

        private String subregionId; // 城市/区域 ID

        /**
         * 城市/区域 ID
         * <p> 示例值：67489937334909845
         *
         * @param subregionId
         * @return
         */
        public Builder subregionId(String subregionId) {
            this.subregionId = subregionId;
            return this;
        }

        public GetSubregionReq build() {
            return new GetSubregionReq(this);
        }
    }
}
