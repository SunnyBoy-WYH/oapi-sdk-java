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

public class JobProcess {
    /**
     * id
     * <p> 示例值：
     */
    @SerializedName("your_property_name")
    private String yourPropertyName;

    // builder 开始
    public JobProcess() {
    }

    public JobProcess(Builder builder) {
        /**
         * id
         * <p> 示例值：
         */
        this.yourPropertyName = builder.yourPropertyName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getYourPropertyName() {
        return this.yourPropertyName;
    }

    public void setYourPropertyName(String yourPropertyName) {
        this.yourPropertyName = yourPropertyName;
    }

    public static class Builder {
        /**
         * id
         * <p> 示例值：
         */
        private String yourPropertyName;

        /**
         * id
         * <p> 示例值：
         *
         * @param yourPropertyName
         * @return
         */
        public Builder yourPropertyName(String yourPropertyName) {
            this.yourPropertyName = yourPropertyName;
            return this;
        }


        public JobProcess build() {
            return new JobProcess(this);
        }
    }
}
