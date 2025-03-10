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

public class Replace {
    /**
     * 查找条件
     * <p> 示例值：
     */
    @SerializedName("find_condition")
    private FindCondition findCondition;
    /**
     * 查找的字符串
     * <p> 示例值：hello
     */
    @SerializedName("find")
    private String find;
    /**
     * 替换的字符串
     * <p> 示例值：world
     */
    @SerializedName("replacement")
    private String replacement;

    // builder 开始
    public Replace() {
    }

    public Replace(Builder builder) {
        /**
         * 查找条件
         * <p> 示例值：
         */
        this.findCondition = builder.findCondition;
        /**
         * 查找的字符串
         * <p> 示例值：hello
         */
        this.find = builder.find;
        /**
         * 替换的字符串
         * <p> 示例值：world
         */
        this.replacement = builder.replacement;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public FindCondition getFindCondition() {
        return this.findCondition;
    }

    public void setFindCondition(FindCondition findCondition) {
        this.findCondition = findCondition;
    }

    public String getFind() {
        return this.find;
    }

    public void setFind(String find) {
        this.find = find;
    }

    public String getReplacement() {
        return this.replacement;
    }

    public void setReplacement(String replacement) {
        this.replacement = replacement;
    }

    public static class Builder {
        /**
         * 查找条件
         * <p> 示例值：
         */
        private FindCondition findCondition;
        /**
         * 查找的字符串
         * <p> 示例值：hello
         */
        private String find;
        /**
         * 替换的字符串
         * <p> 示例值：world
         */
        private String replacement;

        /**
         * 查找条件
         * <p> 示例值：
         *
         * @param findCondition
         * @return
         */
        public Builder findCondition(FindCondition findCondition) {
            this.findCondition = findCondition;
            return this;
        }


        /**
         * 查找的字符串
         * <p> 示例值：hello
         *
         * @param find
         * @return
         */
        public Builder find(String find) {
            this.find = find;
            return this;
        }


        /**
         * 替换的字符串
         * <p> 示例值：world
         *
         * @param replacement
         * @return
         */
        public Builder replacement(String replacement) {
            this.replacement = replacement;
            return this;
        }


        public Replace build() {
            return new Replace(this);
        }
    }
}
