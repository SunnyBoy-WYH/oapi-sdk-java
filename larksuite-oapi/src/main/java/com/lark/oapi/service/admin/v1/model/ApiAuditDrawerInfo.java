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

package com.lark.oapi.service.admin.v1.model;

import com.google.gson.annotations.SerializedName;

public class ApiAuditDrawerInfo {
    /**
     * key信息
     * <p> 示例值：
     */
    @SerializedName("info_key")
    private String infoKey;
    /**
     * val值
     * <p> 示例值：
     */
    @SerializedName("info_val")
    private String infoVal;
    /**
     * key对应的i18nkey
     * <p> 示例值：
     */
    @SerializedName("key_i18n_key")
    private String keyI18nKey;
    /**
     * val类型
     * <p> 示例值：
     */
    @SerializedName("val_type")
    private String valType;
    /**
     * val对应的i18nkey
     * <p> 示例值：
     */
    @SerializedName("val_i18n_key")
    private String valI18nKey;

    // builder 开始
    public ApiAuditDrawerInfo() {
    }

    public ApiAuditDrawerInfo(Builder builder) {
        /**
         * key信息
         * <p> 示例值：
         */
        this.infoKey = builder.infoKey;
        /**
         * val值
         * <p> 示例值：
         */
        this.infoVal = builder.infoVal;
        /**
         * key对应的i18nkey
         * <p> 示例值：
         */
        this.keyI18nKey = builder.keyI18nKey;
        /**
         * val类型
         * <p> 示例值：
         */
        this.valType = builder.valType;
        /**
         * val对应的i18nkey
         * <p> 示例值：
         */
        this.valI18nKey = builder.valI18nKey;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getInfoKey() {
        return this.infoKey;
    }

    public void setInfoKey(String infoKey) {
        this.infoKey = infoKey;
    }

    public String getInfoVal() {
        return this.infoVal;
    }

    public void setInfoVal(String infoVal) {
        this.infoVal = infoVal;
    }

    public String getKeyI18nKey() {
        return this.keyI18nKey;
    }

    public void setKeyI18nKey(String keyI18nKey) {
        this.keyI18nKey = keyI18nKey;
    }

    public String getValType() {
        return this.valType;
    }

    public void setValType(String valType) {
        this.valType = valType;
    }

    public String getValI18nKey() {
        return this.valI18nKey;
    }

    public void setValI18nKey(String valI18nKey) {
        this.valI18nKey = valI18nKey;
    }

    public static class Builder {
        /**
         * key信息
         * <p> 示例值：
         */
        private String infoKey;
        /**
         * val值
         * <p> 示例值：
         */
        private String infoVal;
        /**
         * key对应的i18nkey
         * <p> 示例值：
         */
        private String keyI18nKey;
        /**
         * val类型
         * <p> 示例值：
         */
        private String valType;
        /**
         * val对应的i18nkey
         * <p> 示例值：
         */
        private String valI18nKey;

        /**
         * key信息
         * <p> 示例值：
         *
         * @param infoKey
         * @return
         */
        public Builder infoKey(String infoKey) {
            this.infoKey = infoKey;
            return this;
        }


        /**
         * val值
         * <p> 示例值：
         *
         * @param infoVal
         * @return
         */
        public Builder infoVal(String infoVal) {
            this.infoVal = infoVal;
            return this;
        }


        /**
         * key对应的i18nkey
         * <p> 示例值：
         *
         * @param keyI18nKey
         * @return
         */
        public Builder keyI18nKey(String keyI18nKey) {
            this.keyI18nKey = keyI18nKey;
            return this;
        }


        /**
         * val类型
         * <p> 示例值：
         *
         * @param valType
         * @return
         */
        public Builder valType(String valType) {
            this.valType = valType;
            return this;
        }


        /**
         * val对应的i18nkey
         * <p> 示例值：
         *
         * @param valI18nKey
         * @return
         */
        public Builder valI18nKey(String valI18nKey) {
            this.valI18nKey = valI18nKey;
            return this;
        }


        public ApiAuditDrawerInfo build() {
            return new ApiAuditDrawerInfo(this);
        }
    }
}
