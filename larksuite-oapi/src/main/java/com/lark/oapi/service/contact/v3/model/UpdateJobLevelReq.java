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

package com.lark.oapi.service.contact.v3.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Body;
import com.lark.oapi.core.annotation.Path;

public class UpdateJobLevelReq {
    /**
     * 职级ID
     * <p> 示例值：mga5oa8ayjlp9rb
     */
    @Path
    @SerializedName("job_level_id")
    private String jobLevelId;
    @Body
    private JobLevel body;

    // builder 开始
    public UpdateJobLevelReq() {
    }

    public UpdateJobLevelReq(Builder builder) {
        /**
         * 职级ID
         * <p> 示例值：mga5oa8ayjlp9rb
         */
        this.jobLevelId = builder.jobLevelId;
        this.body = builder.body;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getJobLevelId() {
        return this.jobLevelId;
    }

    public void setJobLevelId(String jobLevelId) {
        this.jobLevelId = jobLevelId;
    }

    public JobLevel getJobLevel() {
        return this.body;
    }

    public void setJobLevel(JobLevel body) {
        this.body = body;
    }

    public static class Builder {

        private String jobLevelId; // 职级ID
        private JobLevel body;

        /**
         * 职级ID
         * <p> 示例值：mga5oa8ayjlp9rb
         *
         * @param jobLevelId
         * @return
         */
        public Builder jobLevelId(String jobLevelId) {
            this.jobLevelId = jobLevelId;
            return this;
        }

        public JobLevel getJobLevel() {
            return this.body;
        }

        /**
         * body
         *
         * @param body
         * @return
         */
        public Builder jobLevel(JobLevel body) {
            this.body = body;
            return this;
        }

        public UpdateJobLevelReq build() {
            return new UpdateJobLevelReq(this);
        }
    }
}
