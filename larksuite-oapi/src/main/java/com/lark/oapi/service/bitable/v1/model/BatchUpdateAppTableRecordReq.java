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

package com.lark.oapi.service.bitable.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class BatchUpdateAppTableRecordReq {
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * bitable app token
     * <p> 示例值：appbcbWCzen6D8dezhoCH2RpMAh
     */
    @Path
    @SerializedName("app_token")
    private String appToken;
    /**
     * table id
     * <p> 示例值：tblsRc9GRRXKqhvW
     */
    @Path
    @SerializedName("table_id")
    private String tableId;
    @Body
    private BatchUpdateAppTableRecordReqBody body;
    // builder 开始
    public BatchUpdateAppTableRecordReq() {
    }

    public BatchUpdateAppTableRecordReq(Builder builder) {
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         */
        this.userIdType = builder.userIdType;
        /**
         * bitable app token
         * <p> 示例值：appbcbWCzen6D8dezhoCH2RpMAh
         */
        this.appToken = builder.appToken;
        /**
         * table id
         * <p> 示例值：tblsRc9GRRXKqhvW
         */
        this.tableId = builder.tableId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUserIdType() {
        return this.userIdType;
    }

    public void setUserIdType(String userIdType) {
        this.userIdType = userIdType;
    }

    public String getAppToken() {
        return this.appToken;
    }

    public void setAppToken(String appToken) {
        this.appToken = appToken;
    }

    public String getTableId() {
        return this.tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public BatchUpdateAppTableRecordReqBody getBatchUpdateAppTableRecordReqBody() {
        return this.body;
    }

    public void setBatchUpdateAppTableRecordReqBody(BatchUpdateAppTableRecordReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String userIdType; // 此次调用中使用的用户ID的类型
        private String appToken; // bitable app token
        private String tableId; // table id
        private BatchUpdateAppTableRecordReqBody body;

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：
         *
         * @param userIdType {@link com.lark.oapi.service.bitable.v1.enums.BatchUpdateAppTableRecordUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.bitable.v1.enums.BatchUpdateAppTableRecordUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * bitable app token
         * <p> 示例值：appbcbWCzen6D8dezhoCH2RpMAh
         *
         * @param appToken
         * @return
         */
        public Builder appToken(String appToken) {
            this.appToken = appToken;
            return this;
        }

        /**
         * table id
         * <p> 示例值：tblsRc9GRRXKqhvW
         *
         * @param tableId
         * @return
         */
        public Builder tableId(String tableId) {
            this.tableId = tableId;
            return this;
        }

        public BatchUpdateAppTableRecordReqBody getBatchUpdateAppTableRecordReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder batchUpdateAppTableRecordReqBody(BatchUpdateAppTableRecordReqBody body) {
            this.body = body;
            return this;
        }

        public BatchUpdateAppTableRecordReq build() {
            return new BatchUpdateAppTableRecordReq(this);
        }
    }
}
