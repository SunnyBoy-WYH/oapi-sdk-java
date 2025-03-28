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

package com.lark.oapi.service.hire.v1.model;

import com.google.gson.annotations.SerializedName;

public class SiteResumeProject {
    /**
     * 项目名
     * <p> 示例值：
     */
    @SerializedName("name")
    private String name;
    /**
     * 担任角色
     * <p> 示例值：
     */
    @SerializedName("role")
    private String role;
    /**
     * 描述
     * <p> 示例值：
     */
    @SerializedName("description")
    private String description;
    /**
     * 开始时间
     * <p> 示例值：
     */
    @SerializedName("start_time")
    private String startTime;
    /**
     * 结束时间
     * <p> 示例值：
     */
    @SerializedName("end_time")
    private String endTime;

    // builder 开始
    public SiteResumeProject() {
    }

    public SiteResumeProject(Builder builder) {
        /**
         * 项目名
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 担任角色
         * <p> 示例值：
         */
        this.role = builder.role;
        /**
         * 描述
         * <p> 示例值：
         */
        this.description = builder.description;
        /**
         * 开始时间
         * <p> 示例值：
         */
        this.startTime = builder.startTime;
        /**
         * 结束时间
         * <p> 示例值：
         */
        this.endTime = builder.endTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return this.endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public static class Builder {
        /**
         * 项目名
         * <p> 示例值：
         */
        private String name;
        /**
         * 担任角色
         * <p> 示例值：
         */
        private String role;
        /**
         * 描述
         * <p> 示例值：
         */
        private String description;
        /**
         * 开始时间
         * <p> 示例值：
         */
        private String startTime;
        /**
         * 结束时间
         * <p> 示例值：
         */
        private String endTime;

        /**
         * 项目名
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }


        /**
         * 担任角色
         * <p> 示例值：
         *
         * @param role
         * @return
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }


        /**
         * 描述
         * <p> 示例值：
         *
         * @param description
         * @return
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }


        /**
         * 开始时间
         * <p> 示例值：
         *
         * @param startTime
         * @return
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }


        /**
         * 结束时间
         * <p> 示例值：
         *
         * @param endTime
         * @return
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }


        public SiteResumeProject build() {
            return new SiteResumeProject(this);
        }
    }
}
