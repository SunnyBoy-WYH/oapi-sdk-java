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

public class UploadPersonReqBody {
    /**
     * 文件二进制内容
     * <p> 示例值：file binary
     */
    @SerializedName("file_content")
    private java.io.File fileContent;
    /**
     * 文件名称
     * <p> 示例值：个人信息
     */
    @SerializedName("file_name")
    private String fileName;

    // builder 开始
    public UploadPersonReqBody() {
    }

    public UploadPersonReqBody(Builder builder) {
        /**
         * 文件二进制内容
         * <p> 示例值：file binary
         */
        this.fileContent = builder.fileContent;
        /**
         * 文件名称
         * <p> 示例值：个人信息
         */
        this.fileName = builder.fileName;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public java.io.File getFileContent() {
        return this.fileContent;
    }

    public void setFileContent(java.io.File fileContent) {
        this.fileContent = fileContent;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public static class Builder {
        /**
         * 文件二进制内容
         * <p> 示例值：file binary
         */
        private java.io.File fileContent;
        /**
         * 文件名称
         * <p> 示例值：个人信息
         */
        private String fileName;

        /**
         * 文件二进制内容
         * <p> 示例值：file binary
         *
         * @param fileContent
         * @return
         */
        public Builder fileContent(java.io.File fileContent) {
            this.fileContent = fileContent;
            return this;
        }


        /**
         * 文件名称
         * <p> 示例值：个人信息
         *
         * @param fileName
         * @return
         */
        public Builder fileName(String fileName) {
            this.fileName = fileName;
            return this;
        }


        public UploadPersonReqBody build() {
            return new UploadPersonReqBody(this);
        }
    }
}
