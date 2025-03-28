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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class UploadFinishMediaReqBody {
    /**
     * 分片上传事务ID
     * <p> 示例值：7111211691345512356
     */
    @SerializedName("upload_id")
    private String uploadId;
    /**
     * 分片数量
     * <p> 示例值：1
     */
    @SerializedName("block_num")
    private Integer blockNum;

    // builder 开始
    public UploadFinishMediaReqBody() {
    }

    public UploadFinishMediaReqBody(Builder builder) {
        /**
         * 分片上传事务ID
         * <p> 示例值：7111211691345512356
         */
        this.uploadId = builder.uploadId;
        /**
         * 分片数量
         * <p> 示例值：1
         */
        this.blockNum = builder.blockNum;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUploadId() {
        return this.uploadId;
    }

    public void setUploadId(String uploadId) {
        this.uploadId = uploadId;
    }

    public Integer getBlockNum() {
        return this.blockNum;
    }

    public void setBlockNum(Integer blockNum) {
        this.blockNum = blockNum;
    }

    public static class Builder {
        /**
         * 分片上传事务ID
         * <p> 示例值：7111211691345512356
         */
        private String uploadId;
        /**
         * 分片数量
         * <p> 示例值：1
         */
        private Integer blockNum;

        /**
         * 分片上传事务ID
         * <p> 示例值：7111211691345512356
         *
         * @param uploadId
         * @return
         */
        public Builder uploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }


        /**
         * 分片数量
         * <p> 示例值：1
         *
         * @param blockNum
         * @return
         */
        public Builder blockNum(Integer blockNum) {
            this.blockNum = blockNum;
            return this;
        }


        public UploadFinishMediaReqBody build() {
            return new UploadFinishMediaReqBody(this);
        }
    }
}
