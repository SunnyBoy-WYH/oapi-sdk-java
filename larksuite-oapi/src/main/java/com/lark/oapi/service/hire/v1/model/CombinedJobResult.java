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

public class CombinedJobResult {
    /**
     * 职位广告
     * <p> 示例值：
     */
    @SerializedName("default_job_post")
    private CombinedJobResultDefaultJobPost defaultJobPost;
    /**
     * 职位
     * <p> 示例值：
     */
    @SerializedName("job")
    private Job job;
    /**
     * 职位负责人
     * <p> 示例值：
     */
    @SerializedName("job_manager")
    private JobManager jobManager;
    /**
     * 面试登记表
     * <p> 示例值：
     */
    @SerializedName("interview_registration_schema_info")
    private RegistrationSchemaInfo interviewRegistrationSchemaInfo;
    /**
     * 入职登记表
     * <p> 示例值：
     */
    @SerializedName("onboard_registration_schema_info")
    private RegistrationSchemaInfo onboardRegistrationSchemaInfo;
    /**
     * 目标专业
     * <p> 示例值：
     */
    @SerializedName("target_major_list")
    private TargetMajorInfo[] targetMajorList;

    // builder 开始
    public CombinedJobResult() {
    }

    public CombinedJobResult(Builder builder) {
        /**
         * 职位广告
         * <p> 示例值：
         */
        this.defaultJobPost = builder.defaultJobPost;
        /**
         * 职位
         * <p> 示例值：
         */
        this.job = builder.job;
        /**
         * 职位负责人
         * <p> 示例值：
         */
        this.jobManager = builder.jobManager;
        /**
         * 面试登记表
         * <p> 示例值：
         */
        this.interviewRegistrationSchemaInfo = builder.interviewRegistrationSchemaInfo;
        /**
         * 入职登记表
         * <p> 示例值：
         */
        this.onboardRegistrationSchemaInfo = builder.onboardRegistrationSchemaInfo;
        /**
         * 目标专业
         * <p> 示例值：
         */
        this.targetMajorList = builder.targetMajorList;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public CombinedJobResultDefaultJobPost getDefaultJobPost() {
        return this.defaultJobPost;
    }

    public void setDefaultJobPost(CombinedJobResultDefaultJobPost defaultJobPost) {
        this.defaultJobPost = defaultJobPost;
    }

    public Job getJob() {
        return this.job;
    }

    public void setJob(Job job) {
        this.job = job;
    }

    public JobManager getJobManager() {
        return this.jobManager;
    }

    public void setJobManager(JobManager jobManager) {
        this.jobManager = jobManager;
    }

    public RegistrationSchemaInfo getInterviewRegistrationSchemaInfo() {
        return this.interviewRegistrationSchemaInfo;
    }

    public void setInterviewRegistrationSchemaInfo(RegistrationSchemaInfo interviewRegistrationSchemaInfo) {
        this.interviewRegistrationSchemaInfo = interviewRegistrationSchemaInfo;
    }

    public RegistrationSchemaInfo getOnboardRegistrationSchemaInfo() {
        return this.onboardRegistrationSchemaInfo;
    }

    public void setOnboardRegistrationSchemaInfo(RegistrationSchemaInfo onboardRegistrationSchemaInfo) {
        this.onboardRegistrationSchemaInfo = onboardRegistrationSchemaInfo;
    }

    public TargetMajorInfo[] getTargetMajorList() {
        return this.targetMajorList;
    }

    public void setTargetMajorList(TargetMajorInfo[] targetMajorList) {
        this.targetMajorList = targetMajorList;
    }

    public static class Builder {
        /**
         * 职位广告
         * <p> 示例值：
         */
        private CombinedJobResultDefaultJobPost defaultJobPost;
        /**
         * 职位
         * <p> 示例值：
         */
        private Job job;
        /**
         * 职位负责人
         * <p> 示例值：
         */
        private JobManager jobManager;
        /**
         * 面试登记表
         * <p> 示例值：
         */
        private RegistrationSchemaInfo interviewRegistrationSchemaInfo;
        /**
         * 入职登记表
         * <p> 示例值：
         */
        private RegistrationSchemaInfo onboardRegistrationSchemaInfo;
        /**
         * 目标专业
         * <p> 示例值：
         */
        private TargetMajorInfo[] targetMajorList;

        /**
         * 职位广告
         * <p> 示例值：
         *
         * @param defaultJobPost
         * @return
         */
        public Builder defaultJobPost(CombinedJobResultDefaultJobPost defaultJobPost) {
            this.defaultJobPost = defaultJobPost;
            return this;
        }


        /**
         * 职位
         * <p> 示例值：
         *
         * @param job
         * @return
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }


        /**
         * 职位负责人
         * <p> 示例值：
         *
         * @param jobManager
         * @return
         */
        public Builder jobManager(JobManager jobManager) {
            this.jobManager = jobManager;
            return this;
        }


        /**
         * 面试登记表
         * <p> 示例值：
         *
         * @param interviewRegistrationSchemaInfo
         * @return
         */
        public Builder interviewRegistrationSchemaInfo(RegistrationSchemaInfo interviewRegistrationSchemaInfo) {
            this.interviewRegistrationSchemaInfo = interviewRegistrationSchemaInfo;
            return this;
        }


        /**
         * 入职登记表
         * <p> 示例值：
         *
         * @param onboardRegistrationSchemaInfo
         * @return
         */
        public Builder onboardRegistrationSchemaInfo(RegistrationSchemaInfo onboardRegistrationSchemaInfo) {
            this.onboardRegistrationSchemaInfo = onboardRegistrationSchemaInfo;
            return this;
        }


        /**
         * 目标专业
         * <p> 示例值：
         *
         * @param targetMajorList
         * @return
         */
        public Builder targetMajorList(TargetMajorInfo[] targetMajorList) {
            this.targetMajorList = targetMajorList;
            return this;
        }


        public CombinedJobResult build() {
            return new CombinedJobResult(this);
        }
    }
}
