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

package com.lark.oapi.service.helpdesk.v1.model;

import com.google.gson.annotations.SerializedName;
import com.lark.oapi.core.annotation.Path;

public class DeleteAgentSchedulesReq {
    /**
     * agent user id
     * <p> 示例值：12345
     */
    @Path
    @SerializedName("agent_id")
    private String agentId;

    // builder 开始
    public DeleteAgentSchedulesReq() {
    }

    public DeleteAgentSchedulesReq(Builder builder) {
        /**
         * agent user id
         * <p> 示例值：12345
         */
        this.agentId = builder.agentId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getAgentId() {
        return this.agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public static class Builder {

        private String agentId; // agent user id

        /**
         * agent user id
         * <p> 示例值：12345
         *
         * @param agentId
         * @return
         */
        public Builder agentId(String agentId) {
            this.agentId = agentId;
            return this;
        }

        public DeleteAgentSchedulesReq build() {
            return new DeleteAgentSchedulesReq(this);
        }
    }
}
