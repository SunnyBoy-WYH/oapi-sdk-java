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

public class PatchEmployeeTypeReq {
    /**
     * 根据client_token是否一致来判断是否为同一请求
     * <p> 示例值：12454646
     */
    @Query
    @SerializedName("client_token")
    private String clientToken;
    /**
     * 雇员类型 ID
     * <p> 示例值：6969828847931885087
     */
    @Path
    @SerializedName("employee_type_id")
    private String employeeTypeId;
    @Body
    private EmployeeType body;

    // builder 开始
    public PatchEmployeeTypeReq() {
    }

    public PatchEmployeeTypeReq(Builder builder) {
        /**
         * 根据client_token是否一致来判断是否为同一请求
         * <p> 示例值：12454646
         */
        this.clientToken = builder.clientToken;
        /**
         * 雇员类型 ID
         * <p> 示例值：6969828847931885087
         */
        this.employeeTypeId = builder.employeeTypeId;
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

    public String getEmployeeTypeId() {
        return this.employeeTypeId;
    }

    public void setEmployeeTypeId(String employeeTypeId) {
        this.employeeTypeId = employeeTypeId;
    }

    public EmployeeType getEmployeeType() {
        return this.body;
    }

    public void setEmployeeType(EmployeeType body) {
        this.body = body;
    }

    public static class Builder {
        private String clientToken; // 根据client_token是否一致来判断是否为同一请求
        private String employeeTypeId; // 雇员类型 ID
        private EmployeeType body;

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
         * 雇员类型 ID
         * <p> 示例值：6969828847931885087
         *
         * @param employeeTypeId
         * @return
         */
        public Builder employeeTypeId(String employeeTypeId) {
            this.employeeTypeId = employeeTypeId;
            return this;
        }

        public EmployeeType getEmployeeType() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder employeeType(EmployeeType body) {
            this.body = body;
            return this;
        }

        public PatchEmployeeTypeReq build() {
            return new PatchEmployeeTypeReq(this);
        }
    }
}
