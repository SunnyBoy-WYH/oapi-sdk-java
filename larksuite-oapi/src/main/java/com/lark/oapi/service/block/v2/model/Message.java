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

package com.lark.oapi.service.block.v2.model;

import com.google.gson.annotations.SerializedName;

public class Message {
    /**
     * 协同数据内容
     * <p> 示例值：{"id":"7094066727704592403","token":"test_123456789"}
     */
    @SerializedName("body")
    private String body;
    /**
     * 版本号(自增)
     * <p> 示例值：1637565292196
     */
    @SerializedName("version")
    private String version;
    /**
     * entity实体ID
     * <p> 示例值：8116040162664047375
     */
    @SerializedName("block_id")
    private String blockId;
    /**
     * 业务来源
     * <p> 示例值：read_block
     */
    @SerializedName("resource")
    private String resource;
    /**
     * 推送用户列表
     * <p> 示例值：["ou_fa7aa170f92d1615de63371ac425a767"]
     */
    @SerializedName("open_ids")
    private String[] openIds;

    // builder 开始
    public Message() {
    }

    public Message(Builder builder) {
        /**
         * 协同数据内容
         * <p> 示例值：{"id":"7094066727704592403","token":"test_123456789"}
         */
        this.body = builder.body;
        /**
         * 版本号(自增)
         * <p> 示例值：1637565292196
         */
        this.version = builder.version;
        /**
         * entity实体ID
         * <p> 示例值：8116040162664047375
         */
        this.blockId = builder.blockId;
        /**
         * 业务来源
         * <p> 示例值：read_block
         */
        this.resource = builder.resource;
        /**
         * 推送用户列表
         * <p> 示例值：["ou_fa7aa170f92d1615de63371ac425a767"]
         */
        this.openIds = builder.openIds;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getBody() {
        return this.body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getBlockId() {
        return this.blockId;
    }

    public void setBlockId(String blockId) {
        this.blockId = blockId;
    }

    public String getResource() {
        return this.resource;
    }

    public void setResource(String resource) {
        this.resource = resource;
    }

    public String[] getOpenIds() {
        return this.openIds;
    }

    public void setOpenIds(String[] openIds) {
        this.openIds = openIds;
    }

    public static class Builder {
        /**
         * 协同数据内容
         * <p> 示例值：{"id":"7094066727704592403","token":"test_123456789"}
         */
        private String body;
        /**
         * 版本号(自增)
         * <p> 示例值：1637565292196
         */
        private String version;
        /**
         * entity实体ID
         * <p> 示例值：8116040162664047375
         */
        private String blockId;
        /**
         * 业务来源
         * <p> 示例值：read_block
         */
        private String resource;
        /**
         * 推送用户列表
         * <p> 示例值：["ou_fa7aa170f92d1615de63371ac425a767"]
         */
        private String[] openIds;

        /**
         * 协同数据内容
         * <p> 示例值：{"id":"7094066727704592403","token":"test_123456789"}
         *
         * @param body
         * @return
         */
        public Builder body(String body) {
            this.body = body;
            return this;
        }


        /**
         * 版本号(自增)
         * <p> 示例值：1637565292196
         *
         * @param version
         * @return
         */
        public Builder version(String version) {
            this.version = version;
            return this;
        }


        /**
         * entity实体ID
         * <p> 示例值：8116040162664047375
         *
         * @param blockId
         * @return
         */
        public Builder blockId(String blockId) {
            this.blockId = blockId;
            return this;
        }


        /**
         * 业务来源
         * <p> 示例值：read_block
         *
         * @param resource
         * @return
         */
        public Builder resource(String resource) {
            this.resource = resource;
            return this;
        }


        /**
         * 推送用户列表
         * <p> 示例值：["ou_fa7aa170f92d1615de63371ac425a767"]
         *
         * @param openIds
         * @return
         */
        public Builder openIds(String[] openIds) {
            this.openIds = openIds;
            return this;
        }


        public Message build() {
            return new Message(this);
        }
    }
}
