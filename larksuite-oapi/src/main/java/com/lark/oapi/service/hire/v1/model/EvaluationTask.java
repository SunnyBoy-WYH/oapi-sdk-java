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

public class EvaluationTask {
    /**
     * 评估 ID
     * <p> 示例值：6989202908470446380
     */
    @SerializedName("id")
    private String id;
    /**
     * 职位 ID
     * <p> 示例值：6897921873523247373
     */
    @SerializedName("job_id")
    private String jobId;
    /**
     * 人才 ID
     * <p> 示例值：7046263097923537196
     */
    @SerializedName("talent_id")
    private String talentId;
    /**
     * 投递 ID
     * <p> 示例值：7046315599510833452
     */
    @SerializedName("application_id")
    private String applicationId;
    /**
     * 任务状态
     * <p> 示例值：1
     */
    @SerializedName("activity_status")
    private Integer activityStatus;

    // builder 开始
    public EvaluationTask() {
    }

    public EvaluationTask(Builder builder) {
        /**
         * 评估 ID
         * <p> 示例值：6989202908470446380
         */
        this.id = builder.id;
        /**
         * 职位 ID
         * <p> 示例值：6897921873523247373
         */
        this.jobId = builder.jobId;
        /**
         * 人才 ID
         * <p> 示例值：7046263097923537196
         */
        this.talentId = builder.talentId;
        /**
         * 投递 ID
         * <p> 示例值：7046315599510833452
         */
        this.applicationId = builder.applicationId;
        /**
         * 任务状态
         * <p> 示例值：1
         */
        this.activityStatus = builder.activityStatus;
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

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public String getTalentId() {
        return this.talentId;
    }

    public void setTalentId(String talentId) {
        this.talentId = talentId;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public Integer getActivityStatus() {
        return this.activityStatus;
    }

    public void setActivityStatus(Integer activityStatus) {
        this.activityStatus = activityStatus;
    }

    public static class Builder {
        /**
         * 评估 ID
         * <p> 示例值：6989202908470446380
         */
        private String id;
        /**
         * 职位 ID
         * <p> 示例值：6897921873523247373
         */
        private String jobId;
        /**
         * 人才 ID
         * <p> 示例值：7046263097923537196
         */
        private String talentId;
        /**
         * 投递 ID
         * <p> 示例值：7046315599510833452
         */
        private String applicationId;
        /**
         * 任务状态
         * <p> 示例值：1
         */
        private Integer activityStatus;

        /**
         * 评估 ID
         * <p> 示例值：6989202908470446380
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 职位 ID
         * <p> 示例值：6897921873523247373
         *
         * @param jobId
         * @return
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }


        /**
         * 人才 ID
         * <p> 示例值：7046263097923537196
         *
         * @param talentId
         * @return
         */
        public Builder talentId(String talentId) {
            this.talentId = talentId;
            return this;
        }


        /**
         * 投递 ID
         * <p> 示例值：7046315599510833452
         *
         * @param applicationId
         * @return
         */
        public Builder applicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }


        /**
         * 任务状态
         * <p> 示例值：1
         *
         * @param activityStatus
         * @return
         */
        public Builder activityStatus(Integer activityStatus) {
            this.activityStatus = activityStatus;
            return this;
        }


        public EvaluationTask build() {
            return new EvaluationTask(this);
        }
    }
}
