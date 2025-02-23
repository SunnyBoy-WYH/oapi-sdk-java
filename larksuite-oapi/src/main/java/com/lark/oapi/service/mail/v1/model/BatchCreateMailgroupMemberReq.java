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

package com.lark.oapi.service.mail.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class BatchCreateMailgroupMemberReq {
    /**
     * 此次调用中使用的用户ID的类型
     * <p> 示例值：open_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 此次调用中使用的部门ID的类型
     * <p> 示例值：
     */
    @Query
    @SerializedName("department_id_type")
    private String departmentIdType;
    /**
     * The unique ID or email address of a mail group
     * <p> 示例值：xxxxxxxxxxxxxxx or test_mail_group@xxx.xx
     */
    @Path
    @SerializedName("mailgroup_id")
    private String mailgroupId;
    @Body
    private BatchCreateMailgroupMemberReqBody body;

    // builder 开始
    public BatchCreateMailgroupMemberReq() {
    }

    public BatchCreateMailgroupMemberReq(Builder builder) {
        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：open_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 此次调用中使用的部门ID的类型
         * <p> 示例值：
         */
        this.departmentIdType = builder.departmentIdType;
        /**
         * The unique ID or email address of a mail group
         * <p> 示例值：xxxxxxxxxxxxxxx or test_mail_group@xxx.xx
         */
        this.mailgroupId = builder.mailgroupId;
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

    public String getDepartmentIdType() {
        return this.departmentIdType;
    }

    public void setDepartmentIdType(String departmentIdType) {
        this.departmentIdType = departmentIdType;
    }

    public String getMailgroupId() {
        return this.mailgroupId;
    }

    public void setMailgroupId(String mailgroupId) {
        this.mailgroupId = mailgroupId;
    }

    public BatchCreateMailgroupMemberReqBody getBatchCreateMailgroupMemberReqBody() {
        return this.body;
    }

    public void setBatchCreateMailgroupMemberReqBody(BatchCreateMailgroupMemberReqBody body) {
        this.body = body;
    }

    public static class Builder {
        private String userIdType; // 此次调用中使用的用户ID的类型
        private String departmentIdType; // 此次调用中使用的部门ID的类型
        private String mailgroupId; // The unique ID or email address of a mail group
        private BatchCreateMailgroupMemberReqBody body;

        /**
         * 此次调用中使用的用户ID的类型
         * <p> 示例值：open_id
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
         * <p> 示例值：open_id
         *
         * @param userIdType {@link com.lark.oapi.service.mail.v1.enums.BatchCreateMailgroupMemberUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.mail.v1.enums.BatchCreateMailgroupMemberUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 此次调用中使用的部门ID的类型
         * <p> 示例值：
         *
         * @param departmentIdType
         * @return
         */
        public Builder departmentIdType(String departmentIdType) {
            this.departmentIdType = departmentIdType;
            return this;
        }

        /**
         * 此次调用中使用的部门ID的类型
         * <p> 示例值：
         *
         * @param departmentIdType {@link com.lark.oapi.service.mail.v1.enums.BatchCreateMailgroupMemberDepartmentIdTypeEnum}
         * @return
         */
        public Builder departmentIdType(com.lark.oapi.service.mail.v1.enums.BatchCreateMailgroupMemberDepartmentIdTypeEnum departmentIdType) {
            this.departmentIdType = departmentIdType.getValue();
            return this;
        }

        /**
         * The unique ID or email address of a mail group
         * <p> 示例值：xxxxxxxxxxxxxxx or test_mail_group@xxx.xx
         *
         * @param mailgroupId
         * @return
         */
        public Builder mailgroupId(String mailgroupId) {
            this.mailgroupId = mailgroupId;
            return this;
        }

        public BatchCreateMailgroupMemberReqBody getBatchCreateMailgroupMemberReqBody() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder batchCreateMailgroupMemberReqBody(BatchCreateMailgroupMemberReqBody body) {
            this.body = body;
            return this;
        }

        public BatchCreateMailgroupMemberReq build() {
            return new BatchCreateMailgroupMemberReq(this);
        }
    }
}
