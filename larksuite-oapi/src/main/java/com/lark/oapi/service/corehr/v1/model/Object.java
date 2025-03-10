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

public class Object {
    /**
     * 对象的唯一标识
     * <p> 示例值：offboarding_info
     */
    @SerializedName("object_api_name")
    private String objectApiName;
    /**
     * 对象名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private Name name;
    /**
     * 是否启用;;True 为已启用;;False 为未启用
     * <p> 示例值：false
     */
    @SerializedName("is_open")
    private Boolean isOpen;
    /**
     * 创建时间，秒级时间戳
     * <p> 示例值：1644992809
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 更新时间，秒级时间戳
     * <p> 示例值：1644992809
     */
    @SerializedName("update_time")
    private String updateTime;

    // builder 开始
    public Object() {
    }

    public Object(Builder builder) {
        /**
         * 对象的唯一标识
         * <p> 示例值：offboarding_info
         */
        this.objectApiName = builder.objectApiName;
        /**
         * 对象名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 是否启用;;True 为已启用;;False 为未启用
         * <p> 示例值：false
         */
        this.isOpen = builder.isOpen;
        /**
         * 创建时间，秒级时间戳
         * <p> 示例值：1644992809
         */
        this.createTime = builder.createTime;
        /**
         * 更新时间，秒级时间戳
         * <p> 示例值：1644992809
         */
        this.updateTime = builder.updateTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getObjectApiName() {
        return this.objectApiName;
    }

    public void setObjectApiName(String objectApiName) {
        this.objectApiName = objectApiName;
    }

    public Name getName() {
        return this.name;
    }

    public void setName(Name name) {
        this.name = name;
    }

    public Boolean getIsOpen() {
        return this.isOpen;
    }

    public void setIsOpen(Boolean isOpen) {
        this.isOpen = isOpen;
    }

    public String getCreateTime() {
        return this.createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return this.updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public static class Builder {
        /**
         * 对象的唯一标识
         * <p> 示例值：offboarding_info
         */
        private String objectApiName;
        /**
         * 对象名称
         * <p> 示例值：
         */
        private Name name;
        /**
         * 是否启用;;True 为已启用;;False 为未启用
         * <p> 示例值：false
         */
        private Boolean isOpen;
        /**
         * 创建时间，秒级时间戳
         * <p> 示例值：1644992809
         */
        private String createTime;
        /**
         * 更新时间，秒级时间戳
         * <p> 示例值：1644992809
         */
        private String updateTime;

        /**
         * 对象的唯一标识
         * <p> 示例值：offboarding_info
         *
         * @param objectApiName
         * @return
         */
        public Builder objectApiName(String objectApiName) {
            this.objectApiName = objectApiName;
            return this;
        }


        /**
         * 对象名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(Name name) {
            this.name = name;
            return this;
        }


        /**
         * 是否启用;;True 为已启用;;False 为未启用
         * <p> 示例值：false
         *
         * @param isOpen
         * @return
         */
        public Builder isOpen(Boolean isOpen) {
            this.isOpen = isOpen;
            return this;
        }


        /**
         * 创建时间，秒级时间戳
         * <p> 示例值：1644992809
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 更新时间，秒级时间戳
         * <p> 示例值：1644992809
         *
         * @param updateTime
         * @return
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }


        public Object build() {
            return new Object(this);
        }
    }
}
