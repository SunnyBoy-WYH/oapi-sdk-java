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
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;
import com.lark.oapi.core.annotation.Query;

public class PatchDepartmentReq {
    /**
     * 根据client_token是否一致来判断是否为同一请求
     * <p> 示例值：12454646
     */
    @Query
    @SerializedName("client_token")
    private String clientToken;
    /**
     * 用户 ID 类型
     * <p> 示例值：people_corehr_id
     */
    @Query
    @SerializedName("user_id_type")
    private String userIdType;
    /**
     * 此次调用中使用的部门 ID 类型
     * <p> 示例值：people_corehr_department_id
     */
    @Query
    @SerializedName("department_id_type")
    private String departmentIdType;
    /**
     * 需要更新的部门ID，同部门实体在CoreHR内部的唯一键
     * <p> 示例值：6969828847121885087
     */
    @Path
    @SerializedName("department_id")
    private String departmentId;
    @Body
    private Department body;

    // builder 开始
    public PatchDepartmentReq() {
    }

    public PatchDepartmentReq(Builder builder) {
        /**
         * 根据client_token是否一致来判断是否为同一请求
         * <p> 示例值：12454646
         */
        this.clientToken = builder.clientToken;
        /**
         * 用户 ID 类型
         * <p> 示例值：people_corehr_id
         */
        this.userIdType = builder.userIdType;
        /**
         * 此次调用中使用的部门 ID 类型
         * <p> 示例值：people_corehr_department_id
         */
        this.departmentIdType = builder.departmentIdType;
        /**
         * 需要更新的部门ID，同部门实体在CoreHR内部的唯一键
         * <p> 示例值：6969828847121885087
         */
        this.departmentId = builder.departmentId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getClientToken() {
        return this.clientToken;
    }

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
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

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public Department getDepartment() {
        return this.body;
    }

    public void setDepartment(Department body) {
        this.body = body;
    }

    public static class Builder {
        private String clientToken; // 根据client_token是否一致来判断是否为同一请求
        private String userIdType; // 用户 ID 类型
        private String departmentIdType; // 此次调用中使用的部门 ID 类型
        private String departmentId; // 需要更新的部门ID，同部门实体在CoreHR内部的唯一键
        private Department body;

        /**
         * 根据client_token是否一致来判断是否为同一请求
         * <p> 示例值：12454646
         *
         * @param clientToken
         * @return
         */
        public Builder clientToken(String clientToken) {
            this.clientToken = clientToken;
            return this;
        }

        /**
         * 用户 ID 类型
         * <p> 示例值：people_corehr_id
         *
         * @param userIdType
         * @return
         */
        public Builder userIdType(String userIdType) {
            this.userIdType = userIdType;
            return this;
        }

        /**
         * 用户 ID 类型
         * <p> 示例值：people_corehr_id
         *
         * @param userIdType {@link com.lark.oapi.service.corehr.v1.enums.PatchDepartmentUserIdTypeEnum}
         * @return
         */
        public Builder userIdType(com.lark.oapi.service.corehr.v1.enums.PatchDepartmentUserIdTypeEnum userIdType) {
            this.userIdType = userIdType.getValue();
            return this;
        }

        /**
         * 此次调用中使用的部门 ID 类型
         * <p> 示例值：people_corehr_department_id
         *
         * @param departmentIdType
         * @return
         */
        public Builder departmentIdType(String departmentIdType) {
            this.departmentIdType = departmentIdType;
            return this;
        }

        /**
         * 此次调用中使用的部门 ID 类型
         * <p> 示例值：people_corehr_department_id
         *
         * @param departmentIdType {@link com.lark.oapi.service.corehr.v1.enums.PatchDepartmentDepartmentIdTypeEnum}
         * @return
         */
        public Builder departmentIdType(com.lark.oapi.service.corehr.v1.enums.PatchDepartmentDepartmentIdTypeEnum departmentIdType) {
            this.departmentIdType = departmentIdType.getValue();
            return this;
        }

        /**
         * 需要更新的部门ID，同部门实体在CoreHR内部的唯一键
         * <p> 示例值：6969828847121885087
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        public Department getDepartment() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder department(Department body) {
            this.body = body;
            return this;
        }

        public PatchDepartmentReq build() {
            return new PatchDepartmentReq(this);
        }
    }
}
