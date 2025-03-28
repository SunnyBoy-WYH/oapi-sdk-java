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

package com.lark.oapi.service.helpdesk.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Query;

public class ListCategoryReq {
    /**
     * 知识库分类语言
     * <p> 示例值：zh_cn
     */
    @Query
    @SerializedName("lang")
    private String lang;
    /**
     * 排序键。1: 根据知识库分类更新时间排序
     * <p> 示例值：1
     */
    @Query
    @SerializedName("order_by")
    private Integer orderBy;
    /**
     * 顺序。true: 正序；false：反序
     * <p> 示例值：true
     */
    @Query
    @SerializedName("asc")
    private Boolean asc;

    // builder 开始
    public ListCategoryReq() {
    }

    public ListCategoryReq(Builder builder) {
        /**
         * 知识库分类语言
         * <p> 示例值：zh_cn
         */
        this.lang = builder.lang;
        /**
         * 排序键。1: 根据知识库分类更新时间排序
         * <p> 示例值：1
         */
        this.orderBy = builder.orderBy;
        /**
         * 顺序。true: 正序；false：反序
         * <p> 示例值：true
         */
        this.asc = builder.asc;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getLang() {
        return this.lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Integer getOrderBy() {
        return this.orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    public Boolean getAsc() {
        return this.asc;
    }

    public void setAsc(Boolean asc) {
        this.asc = asc;
    }

    public static class Builder {
        private String lang; // 知识库分类语言
        private Integer orderBy; // 排序键。1: 根据知识库分类更新时间排序
        private Boolean asc; // 顺序。true: 正序；false：反序


        /**
         * 知识库分类语言
         * <p> 示例值：zh_cn
         *
         * @param lang
         * @return
         */
        public Builder lang(String lang) {
            this.lang = lang;
            return this;
        }


        /**
         * 排序键。1: 根据知识库分类更新时间排序
         * <p> 示例值：1
         *
         * @param orderBy
         * @return
         */
        public Builder orderBy(Integer orderBy) {
            this.orderBy = orderBy;
            return this;
        }


        /**
         * 顺序。true: 正序；false：反序
         * <p> 示例值：true
         *
         * @param asc
         * @return
         */
        public Builder asc(Boolean asc) {
            this.asc = asc;
            return this;
        }

        public ListCategoryReq build() {
            return new ListCategoryReq(this);
        }
    }
}
