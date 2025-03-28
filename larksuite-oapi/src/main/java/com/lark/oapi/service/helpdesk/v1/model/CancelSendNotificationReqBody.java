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

public class CancelSendNotificationReqBody {
    /**
     * 是否召回已发送的消息,新人入职消息同样适用
     * <p> 示例值：true
     */
    @SerializedName("is_recall")
    private Boolean isRecall;

    // builder 开始
    public CancelSendNotificationReqBody() {
    }

    public CancelSendNotificationReqBody(Builder builder) {
        /**
         * 是否召回已发送的消息,新人入职消息同样适用
         * <p> 示例值：true
         */
        this.isRecall = builder.isRecall;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Boolean getIsRecall() {
        return this.isRecall;
    }

    public void setIsRecall(Boolean isRecall) {
        this.isRecall = isRecall;
    }

    public static class Builder {
        /**
         * 是否召回已发送的消息,新人入职消息同样适用
         * <p> 示例值：true
         */
        private Boolean isRecall;

        /**
         * 是否召回已发送的消息,新人入职消息同样适用
         * <p> 示例值：true
         *
         * @param isRecall
         * @return
         */
        public Builder isRecall(Boolean isRecall) {
            this.isRecall = isRecall;
            return this;
        }


        public CancelSendNotificationReqBody build() {
            return new CancelSendNotificationReqBody(this);
        }
    }
}
