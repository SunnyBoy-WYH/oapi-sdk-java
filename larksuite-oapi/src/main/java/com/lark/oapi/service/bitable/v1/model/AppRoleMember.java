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

public class AppRoleMember {
    /**
     * 协作者id
     * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
     */
    @SerializedName("member_id")
    private String memberId;
    /**
     * 用户的 open_id
     * <p> 示例值：ou_xxxxxxxx
     */
    @SerializedName("open_id")
    private String openId;
    /**
     * 用户的 union_id
     * <p> 示例值：on_xxxxxxxx
     */
    @SerializedName("union_id")
    private String unionId;
    /**
     * 用户的 user_id
     * <p> 示例值：xxxxxxxx
     */
    @SerializedName("user_id")
    private String userId;
    /**
     * 群聊的 chat_id
     * <p> 示例值：oc_xxxxxxxx
     */
    @SerializedName("chat_id")
    private String chatId;
    /**
     * 部门的 department_id
     * <p> 示例值：xxxxxxxx
     */
    @SerializedName("department_id")
    private String departmentId;
    /**
     * 部门的 open_department_id
     * <p> 示例值：od-xxxxxxxx
     */
    @SerializedName("open_department_id")
    private String openDepartmentId;
    /**
     * 协作者名字
     * <p> 示例值：张三
     */
    @SerializedName("member_name")
    private String memberName;
    /**
     * 协作者英文名
     * <p> 示例值：San Zhang
     */
    @SerializedName("member_en_name")
    private String memberEnName;
    /**
     * 协作者类型
     * <p> 示例值：user
     */
    @SerializedName("member_type")
    private String memberType;

    // builder 开始
    public AppRoleMember() {
    }

    public AppRoleMember(Builder builder) {
        /**
         * 协作者id
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        this.memberId = builder.memberId;
        /**
         * 用户的 open_id
         * <p> 示例值：ou_xxxxxxxx
         */
        this.openId = builder.openId;
        /**
         * 用户的 union_id
         * <p> 示例值：on_xxxxxxxx
         */
        this.unionId = builder.unionId;
        /**
         * 用户的 user_id
         * <p> 示例值：xxxxxxxx
         */
        this.userId = builder.userId;
        /**
         * 群聊的 chat_id
         * <p> 示例值：oc_xxxxxxxx
         */
        this.chatId = builder.chatId;
        /**
         * 部门的 department_id
         * <p> 示例值：xxxxxxxx
         */
        this.departmentId = builder.departmentId;
        /**
         * 部门的 open_department_id
         * <p> 示例值：od-xxxxxxxx
         */
        this.openDepartmentId = builder.openDepartmentId;
        /**
         * 协作者名字
         * <p> 示例值：张三
         */
        this.memberName = builder.memberName;
        /**
         * 协作者英文名
         * <p> 示例值：San Zhang
         */
        this.memberEnName = builder.memberEnName;
        /**
         * 协作者类型
         * <p> 示例值：user
         */
        this.memberType = builder.memberType;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getMemberId() {
        return this.memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getOpenId() {
        return this.openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getUnionId() {
        return this.unionId;
    }

    public void setUnionId(String unionId) {
        this.unionId = unionId;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getDepartmentId() {
        return this.departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getOpenDepartmentId() {
        return this.openDepartmentId;
    }

    public void setOpenDepartmentId(String openDepartmentId) {
        this.openDepartmentId = openDepartmentId;
    }

    public String getMemberName() {
        return this.memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberEnName() {
        return this.memberEnName;
    }

    public void setMemberEnName(String memberEnName) {
        this.memberEnName = memberEnName;
    }

    public String getMemberType() {
        return this.memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public static class Builder {
        /**
         * 协作者id
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         */
        private String memberId;
        /**
         * 用户的 open_id
         * <p> 示例值：ou_xxxxxxxx
         */
        private String openId;
        /**
         * 用户的 union_id
         * <p> 示例值：on_xxxxxxxx
         */
        private String unionId;
        /**
         * 用户的 user_id
         * <p> 示例值：xxxxxxxx
         */
        private String userId;
        /**
         * 群聊的 chat_id
         * <p> 示例值：oc_xxxxxxxx
         */
        private String chatId;
        /**
         * 部门的 department_id
         * <p> 示例值：xxxxxxxx
         */
        private String departmentId;
        /**
         * 部门的 open_department_id
         * <p> 示例值：od-xxxxxxxx
         */
        private String openDepartmentId;
        /**
         * 协作者名字
         * <p> 示例值：张三
         */
        private String memberName;
        /**
         * 协作者英文名
         * <p> 示例值：San Zhang
         */
        private String memberEnName;
        /**
         * 协作者类型
         * <p> 示例值：user
         */
        private String memberType;

        /**
         * 协作者id
         * <p> 示例值：ou_7dab8a3d3cdcc9da365777c7ad535d62
         *
         * @param memberId
         * @return
         */
        public Builder memberId(String memberId) {
            this.memberId = memberId;
            return this;
        }


        /**
         * 用户的 open_id
         * <p> 示例值：ou_xxxxxxxx
         *
         * @param openId
         * @return
         */
        public Builder openId(String openId) {
            this.openId = openId;
            return this;
        }


        /**
         * 用户的 union_id
         * <p> 示例值：on_xxxxxxxx
         *
         * @param unionId
         * @return
         */
        public Builder unionId(String unionId) {
            this.unionId = unionId;
            return this;
        }


        /**
         * 用户的 user_id
         * <p> 示例值：xxxxxxxx
         *
         * @param userId
         * @return
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }


        /**
         * 群聊的 chat_id
         * <p> 示例值：oc_xxxxxxxx
         *
         * @param chatId
         * @return
         */
        public Builder chatId(String chatId) {
            this.chatId = chatId;
            return this;
        }


        /**
         * 部门的 department_id
         * <p> 示例值：xxxxxxxx
         *
         * @param departmentId
         * @return
         */
        public Builder departmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }


        /**
         * 部门的 open_department_id
         * <p> 示例值：od-xxxxxxxx
         *
         * @param openDepartmentId
         * @return
         */
        public Builder openDepartmentId(String openDepartmentId) {
            this.openDepartmentId = openDepartmentId;
            return this;
        }


        /**
         * 协作者名字
         * <p> 示例值：张三
         *
         * @param memberName
         * @return
         */
        public Builder memberName(String memberName) {
            this.memberName = memberName;
            return this;
        }


        /**
         * 协作者英文名
         * <p> 示例值：San Zhang
         *
         * @param memberEnName
         * @return
         */
        public Builder memberEnName(String memberEnName) {
            this.memberEnName = memberEnName;
            return this;
        }


        /**
         * 协作者类型
         * <p> 示例值：user
         *
         * @param memberType
         * @return
         */
        public Builder memberType(String memberType) {
            this.memberType = memberType;
            return this;
        }

        /**
         * 协作者类型
         * <p> 示例值：user
         *
         * @param memberType {@link com.lark.oapi.service.bitable.v1.enums.AppRoleMemberMemberTypeEnum}
         * @return
         */
        public Builder memberType(com.lark.oapi.service.bitable.v1.enums.AppRoleMemberMemberTypeEnum memberType) {
            this.memberType = memberType.getValue();
            return this;
        }


        public AppRoleMember build() {
            return new AppRoleMember(this);
        }
    }
}
