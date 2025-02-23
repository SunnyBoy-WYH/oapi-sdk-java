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

package com.lark.oapi.service.search.v2.model;

import com.google.gson.annotations.SerializedName;

public class DocPassageParam {
    /**
     * 是否要搜索doc
     * <p> 示例值：false
     */
    @SerializedName("searchable")
    private Boolean searchable;
    /**
     * 搜索几篇特定doc
     * <p> 示例值：
     */
    @SerializedName("doc_tokens")
    private String[] docTokens;
    /**
     * 搜索特定的文件夹
     * <p> 示例值：
     */
    @SerializedName("folder_tokens")
    private String[] folderTokens;
    /**
     * 搜索特定doc（仅限内部使用，有需求请用doc_tokens）
     * <p> 示例值：
     */
    @SerializedName("obj_ids")
    private String[] objIds;

    // builder 开始
    public DocPassageParam() {
    }

    public DocPassageParam(Builder builder) {
        /**
         * 是否要搜索doc
         * <p> 示例值：false
         */
        this.searchable = builder.searchable;
        /**
         * 搜索几篇特定doc
         * <p> 示例值：
         */
        this.docTokens = builder.docTokens;
        /**
         * 搜索特定的文件夹
         * <p> 示例值：
         */
        this.folderTokens = builder.folderTokens;
        /**
         * 搜索特定doc（仅限内部使用，有需求请用doc_tokens）
         * <p> 示例值：
         */
        this.objIds = builder.objIds;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getSearchable() {
        return this.searchable;
    }

    public void setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }

    public String[] getDocTokens() {
        return this.docTokens;
    }

    public void setDocTokens(String[] docTokens) {
        this.docTokens = docTokens;
    }

    public String[] getFolderTokens() {
        return this.folderTokens;
    }

    public void setFolderTokens(String[] folderTokens) {
        this.folderTokens = folderTokens;
    }

    public String[] getObjIds() {
        return this.objIds;
    }

    public void setObjIds(String[] objIds) {
        this.objIds = objIds;
    }

    public static class Builder {
        /**
         * 是否要搜索doc
         * <p> 示例值：false
         */
        private Boolean searchable;
        /**
         * 搜索几篇特定doc
         * <p> 示例值：
         */
        private String[] docTokens;
        /**
         * 搜索特定的文件夹
         * <p> 示例值：
         */
        private String[] folderTokens;
        /**
         * 搜索特定doc（仅限内部使用，有需求请用doc_tokens）
         * <p> 示例值：
         */
        private String[] objIds;

        /**
         * 是否要搜索doc
         * <p> 示例值：false
         *
         * @param searchable
         * @return
         */
        public Builder searchable(Boolean searchable) {
            this.searchable = searchable;
            return this;
        }


        /**
         * 搜索几篇特定doc
         * <p> 示例值：
         *
         * @param docTokens
         * @return
         */
        public Builder docTokens(String[] docTokens) {
            this.docTokens = docTokens;
            return this;
        }


        /**
         * 搜索特定的文件夹
         * <p> 示例值：
         *
         * @param folderTokens
         * @return
         */
        public Builder folderTokens(String[] folderTokens) {
            this.folderTokens = folderTokens;
            return this;
        }


        /**
         * 搜索特定doc（仅限内部使用，有需求请用doc_tokens）
         * <p> 示例值：
         *
         * @param objIds
         * @return
         */
        public Builder objIds(String[] objIds) {
            this.objIds = objIds;
            return this;
        }


        public DocPassageParam build() {
            return new DocPassageParam(this);
        }
    }
}
