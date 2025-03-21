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

package com.lark.oapi.service.personal_settings.v1.model;

import com.google.gson.annotations.SerializedName;

public class PatchSystemStatusReqBody {
    /**
     * 系统状态
     * <p> 示例值：
     */
    @SerializedName("system_status")
    private SystemStatus systemStatus;
    /**
     * 需要更新的字段
     * <p> 示例值：['TITLE']
     */
    @SerializedName("update_fields")
    private String[] updateFields;

    // builder 开始
    public PatchSystemStatusReqBody() {
    }

    public PatchSystemStatusReqBody(Builder builder) {
        /**
         * 系统状态
         * <p> 示例值：
         */
        this.systemStatus = builder.systemStatus;
        /**
         * 需要更新的字段
         * <p> 示例值：['TITLE']
         */
        this.updateFields = builder.updateFields;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public SystemStatus getSystemStatus() {
        return this.systemStatus;
    }

    public void setSystemStatus(SystemStatus systemStatus) {
        this.systemStatus = systemStatus;
    }

    public String[] getUpdateFields() {
        return this.updateFields;
    }

    public void setUpdateFields(String[] updateFields) {
        this.updateFields = updateFields;
    }

    public static class Builder {
        /**
         * 系统状态
         * <p> 示例值：
         */
        private SystemStatus systemStatus;
        /**
         * 需要更新的字段
         * <p> 示例值：['TITLE']
         */
        private String[] updateFields;

        /**
         * 系统状态
         * <p> 示例值：
         *
         * @param systemStatus
         * @return
         */
        public Builder systemStatus(SystemStatus systemStatus) {
            this.systemStatus = systemStatus;
            return this;
        }


        /**
         * 需要更新的字段
         * <p> 示例值：['TITLE']
         *
         * @param updateFields
         * @return
         */
        public Builder updateFields(String[] updateFields) {
            this.updateFields = updateFields;
            return this;
        }


        public PatchSystemStatusReqBody build() {
            return new PatchSystemStatusReqBody(this);
        }
    }
}
