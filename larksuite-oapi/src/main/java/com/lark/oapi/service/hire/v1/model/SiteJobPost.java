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

public class SiteJobPost {
    /**
     * 职位id
     * <p> 示例值：
     */
    @SerializedName("id")
    private String id;
    /**
     * 职位名称
     * <p> 示例值：
     */
    @SerializedName("title")
    private String title;
    /**
     * 职位描述
     * <p> 示例值：
     */
    @SerializedName("description")
    private String description;
    /**
     * 职位要求
     * <p> 示例值：
     */
    @SerializedName("requirement")
    private String requirement;
    /**
     * 职位职能
     * <p> 示例值：
     */
    @SerializedName("job_type_info")
    private SiteJobType jobTypeInfo;
    /**
     * 职位城市
     * <p> 示例值：
     */
    @SerializedName("city_info")
    private SiteJobCity cityInfo;
    /**
     * 雇佣类型
     * <p> 示例值：
     */
    @SerializedName("recruitment_type")
    private SiteJobRecruitmentType recruitmentType;
    /**
     * 职位发布时间
     * <p> 示例值：
     */
    @SerializedName("publish_time")
    private Integer publishTime;

    // builder 开始
    public SiteJobPost() {
    }

    public SiteJobPost(Builder builder) {
        /**
         * 职位id
         * <p> 示例值：
         */
        this.id = builder.id;
        /**
         * 职位名称
         * <p> 示例值：
         */
        this.title = builder.title;
        /**
         * 职位描述
         * <p> 示例值：
         */
        this.description = builder.description;
        /**
         * 职位要求
         * <p> 示例值：
         */
        this.requirement = builder.requirement;
        /**
         * 职位职能
         * <p> 示例值：
         */
        this.jobTypeInfo = builder.jobTypeInfo;
        /**
         * 职位城市
         * <p> 示例值：
         */
        this.cityInfo = builder.cityInfo;
        /**
         * 雇佣类型
         * <p> 示例值：
         */
        this.recruitmentType = builder.recruitmentType;
        /**
         * 职位发布时间
         * <p> 示例值：
         */
        this.publishTime = builder.publishTime;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRequirement() {
        return this.requirement;
    }

    public void setRequirement(String requirement) {
        this.requirement = requirement;
    }

    public SiteJobType getJobTypeInfo() {
        return this.jobTypeInfo;
    }

    public void setJobTypeInfo(SiteJobType jobTypeInfo) {
        this.jobTypeInfo = jobTypeInfo;
    }

    public SiteJobCity getCityInfo() {
        return this.cityInfo;
    }

    public void setCityInfo(SiteJobCity cityInfo) {
        this.cityInfo = cityInfo;
    }

    public SiteJobRecruitmentType getRecruitmentType() {
        return this.recruitmentType;
    }

    public void setRecruitmentType(SiteJobRecruitmentType recruitmentType) {
        this.recruitmentType = recruitmentType;
    }

    public Integer getPublishTime() {
        return this.publishTime;
    }

    public void setPublishTime(Integer publishTime) {
        this.publishTime = publishTime;
    }

    public static class Builder {
        /**
         * 职位id
         * <p> 示例值：
         */
        private String id;
        /**
         * 职位名称
         * <p> 示例值：
         */
        private String title;
        /**
         * 职位描述
         * <p> 示例值：
         */
        private String description;
        /**
         * 职位要求
         * <p> 示例值：
         */
        private String requirement;
        /**
         * 职位职能
         * <p> 示例值：
         */
        private SiteJobType jobTypeInfo;
        /**
         * 职位城市
         * <p> 示例值：
         */
        private SiteJobCity cityInfo;
        /**
         * 雇佣类型
         * <p> 示例值：
         */
        private SiteJobRecruitmentType recruitmentType;
        /**
         * 职位发布时间
         * <p> 示例值：
         */
        private Integer publishTime;

        /**
         * 职位id
         * <p> 示例值：
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 职位名称
         * <p> 示例值：
         *
         * @param title
         * @return
         */
        public Builder title(String title) {
            this.title = title;
            return this;
        }


        /**
         * 职位描述
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
         * 职位要求
         * <p> 示例值：
         *
         * @param requirement
         * @return
         */
        public Builder requirement(String requirement) {
            this.requirement = requirement;
            return this;
        }


        /**
         * 职位职能
         * <p> 示例值：
         *
         * @param jobTypeInfo
         * @return
         */
        public Builder jobTypeInfo(SiteJobType jobTypeInfo) {
            this.jobTypeInfo = jobTypeInfo;
            return this;
        }


        /**
         * 职位城市
         * <p> 示例值：
         *
         * @param cityInfo
         * @return
         */
        public Builder cityInfo(SiteJobCity cityInfo) {
            this.cityInfo = cityInfo;
            return this;
        }


        /**
         * 雇佣类型
         * <p> 示例值：
         *
         * @param recruitmentType
         * @return
         */
        public Builder recruitmentType(SiteJobRecruitmentType recruitmentType) {
            this.recruitmentType = recruitmentType;
            return this;
        }


        /**
         * 职位发布时间
         * <p> 示例值：
         *
         * @param publishTime
         * @return
         */
        public Builder publishTime(Integer publishTime) {
            this.publishTime = publishTime;
            return this;
        }


        public SiteJobPost build() {
            return new SiteJobPost(this);
        }
    }
}
