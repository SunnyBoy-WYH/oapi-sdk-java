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

package com.lark.oapi.service.im.v1.model;

import com.google.gson.annotations.SerializedName;

public class EventMessage {
    /**
     * 消息的open_message_id，说明参见：[消息ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message/intro#ac79c1c2)
     * <p> 示例值：om_5ce6d572455d361153b7cb51da133945
     */
    @SerializedName("message_id")
    private String messageId;
    /**
     * 根消息id，用于回复消息场景，说明参见：[消息ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message/intro#ac79c1c2)
     * <p> 示例值：om_5ce6d572455d361153b7cb5xxfsdfsdfdsf
     */
    @SerializedName("root_id")
    private String rootId;
    /**
     * 父消息的id，用于回复消息场景，说明参见：[消息ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message/intro#ac79c1c2)
     * <p> 示例值：om_5ce6d572455d361153b7cb5xxfsdfsdfdsf
     */
    @SerializedName("parent_id")
    private String parentId;
    /**
     * 消息发送时间（毫秒）
     * <p> 示例值：1609073151345
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 消息更新时间（毫秒）
     * <p> 示例值：1687343654666
     */
    @SerializedName("update_time")
    private String updateTime;
    /**
     * 消息所在的群组 ID
     * <p> 示例值：oc_5ce6d572455d361153b7xx51da133945
     */
    @SerializedName("chat_id")
    private String chatId;
    /**
     * 消息所在的群组类型;;**可选值有**：;- `p2p`：单聊;- `group`： 群组;- `topic_group`：话题群
     * <p> 示例值：group
     */
    @SerializedName("chat_type")
    private String chatType;
    /**
     * 消息类型
     * <p> 示例值：text
     */
    @SerializedName("message_type")
    private String messageType;
    /**
     * 消息内容, json 格式 ;[各类型消息Content](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/im-v1/message/events/message_content)
     * <p> 示例值：{\"text\":\"@_user_1 hello\"}
     */
    @SerializedName("content")
    private String content;
    /**
     * 被提及用户的信息
     * <p> 示例值：
     */
    @SerializedName("mentions")
    private MentionEvent[] mentions;
    /**
     * 用户代理
     * <p> 示例值：Mozilla/5.0 (Macintosh; Intel Mac OS X 13_2_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.53 Safari/537.36 Lark/6.7.5 LarkLocale/en_US ttnet SDK-Version/6.7.8
     */
    @SerializedName("user_agent")
    private String userAgent;

    // builder 开始
    public EventMessage() {
    }

    public EventMessage(Builder builder) {
        /**
         * 消息的open_message_id，说明参见：[消息ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message/intro#ac79c1c2)
         * <p> 示例值：om_5ce6d572455d361153b7cb51da133945
         */
        this.messageId = builder.messageId;
        /**
         * 根消息id，用于回复消息场景，说明参见：[消息ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message/intro#ac79c1c2)
         * <p> 示例值：om_5ce6d572455d361153b7cb5xxfsdfsdfdsf
         */
        this.rootId = builder.rootId;
        /**
         * 父消息的id，用于回复消息场景，说明参见：[消息ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message/intro#ac79c1c2)
         * <p> 示例值：om_5ce6d572455d361153b7cb5xxfsdfsdfdsf
         */
        this.parentId = builder.parentId;
        /**
         * 消息发送时间（毫秒）
         * <p> 示例值：1609073151345
         */
        this.createTime = builder.createTime;
        /**
         * 消息更新时间（毫秒）
         * <p> 示例值：1687343654666
         */
        this.updateTime = builder.updateTime;
        /**
         * 消息所在的群组 ID
         * <p> 示例值：oc_5ce6d572455d361153b7xx51da133945
         */
        this.chatId = builder.chatId;
        /**
         * 消息所在的群组类型;;**可选值有**：;- `p2p`：单聊;- `group`： 群组;- `topic_group`：话题群
         * <p> 示例值：group
         */
        this.chatType = builder.chatType;
        /**
         * 消息类型
         * <p> 示例值：text
         */
        this.messageType = builder.messageType;
        /**
         * 消息内容, json 格式 ;[各类型消息Content](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/im-v1/message/events/message_content)
         * <p> 示例值：{\"text\":\"@_user_1 hello\"}
         */
        this.content = builder.content;
        /**
         * 被提及用户的信息
         * <p> 示例值：
         */
        this.mentions = builder.mentions;
        /**
         * 用户代理
         * <p> 示例值：Mozilla/5.0 (Macintosh; Intel Mac OS X 13_2_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.53 Safari/537.36 Lark/6.7.5 LarkLocale/en_US ttnet SDK-Version/6.7.8
         */
        this.userAgent = builder.userAgent;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getMessageId() {
        return this.messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getRootId() {
        return this.rootId;
    }

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    public String getParentId() {
        return this.parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
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

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public String getChatType() {
        return this.chatType;
    }

    public void setChatType(String chatType) {
        this.chatType = chatType;
    }

    public String getMessageType() {
        return this.messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MentionEvent[] getMentions() {
        return this.mentions;
    }

    public void setMentions(MentionEvent[] mentions) {
        this.mentions = mentions;
    }

    public String getUserAgent() {
        return this.userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public static class Builder {
        /**
         * 消息的open_message_id，说明参见：[消息ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message/intro#ac79c1c2)
         * <p> 示例值：om_5ce6d572455d361153b7cb51da133945
         */
        private String messageId;
        /**
         * 根消息id，用于回复消息场景，说明参见：[消息ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message/intro#ac79c1c2)
         * <p> 示例值：om_5ce6d572455d361153b7cb5xxfsdfsdfdsf
         */
        private String rootId;
        /**
         * 父消息的id，用于回复消息场景，说明参见：[消息ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message/intro#ac79c1c2)
         * <p> 示例值：om_5ce6d572455d361153b7cb5xxfsdfsdfdsf
         */
        private String parentId;
        /**
         * 消息发送时间（毫秒）
         * <p> 示例值：1609073151345
         */
        private String createTime;
        /**
         * 消息更新时间（毫秒）
         * <p> 示例值：1687343654666
         */
        private String updateTime;
        /**
         * 消息所在的群组 ID
         * <p> 示例值：oc_5ce6d572455d361153b7xx51da133945
         */
        private String chatId;
        /**
         * 消息所在的群组类型;;**可选值有**：;- `p2p`：单聊;- `group`： 群组;- `topic_group`：话题群
         * <p> 示例值：group
         */
        private String chatType;
        /**
         * 消息类型
         * <p> 示例值：text
         */
        private String messageType;
        /**
         * 消息内容, json 格式 ;[各类型消息Content](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/im-v1/message/events/message_content)
         * <p> 示例值：{\"text\":\"@_user_1 hello\"}
         */
        private String content;
        /**
         * 被提及用户的信息
         * <p> 示例值：
         */
        private MentionEvent[] mentions;
        /**
         * 用户代理
         * <p> 示例值：Mozilla/5.0 (Macintosh; Intel Mac OS X 13_2_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.53 Safari/537.36 Lark/6.7.5 LarkLocale/en_US ttnet SDK-Version/6.7.8
         */
        private String userAgent;

        /**
         * 消息的open_message_id，说明参见：[消息ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message/intro#ac79c1c2)
         * <p> 示例值：om_5ce6d572455d361153b7cb51da133945
         *
         * @param messageId
         * @return
         */
        public Builder messageId(String messageId) {
            this.messageId = messageId;
            return this;
        }


        /**
         * 根消息id，用于回复消息场景，说明参见：[消息ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message/intro#ac79c1c2)
         * <p> 示例值：om_5ce6d572455d361153b7cb5xxfsdfsdfdsf
         *
         * @param rootId
         * @return
         */
        public Builder rootId(String rootId) {
            this.rootId = rootId;
            return this;
        }


        /**
         * 父消息的id，用于回复消息场景，说明参见：[消息ID说明](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/reference/im-v1/message/intro#ac79c1c2)
         * <p> 示例值：om_5ce6d572455d361153b7cb5xxfsdfsdfdsf
         *
         * @param parentId
         * @return
         */
        public Builder parentId(String parentId) {
            this.parentId = parentId;
            return this;
        }


        /**
         * 消息发送时间（毫秒）
         * <p> 示例值：1609073151345
         *
         * @param createTime
         * @return
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }


        /**
         * 消息更新时间（毫秒）
         * <p> 示例值：1687343654666
         *
         * @param updateTime
         * @return
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }


        /**
         * 消息所在的群组 ID
         * <p> 示例值：oc_5ce6d572455d361153b7xx51da133945
         *
         * @param chatId
         * @return
         */
        public Builder chatId(String chatId) {
            this.chatId = chatId;
            return this;
        }


        /**
         * 消息所在的群组类型;;**可选值有**：;- `p2p`：单聊;- `group`： 群组;- `topic_group`：话题群
         * <p> 示例值：group
         *
         * @param chatType
         * @return
         */
        public Builder chatType(String chatType) {
            this.chatType = chatType;
            return this;
        }


        /**
         * 消息类型
         * <p> 示例值：text
         *
         * @param messageType
         * @return
         */
        public Builder messageType(String messageType) {
            this.messageType = messageType;
            return this;
        }


        /**
         * 消息内容, json 格式 ;[各类型消息Content](https://open.feishu.cn/document/uAjLw4CM/ukTMukTMukTM/im-v1/message/events/message_content)
         * <p> 示例值：{\"text\":\"@_user_1 hello\"}
         *
         * @param content
         * @return
         */
        public Builder content(String content) {
            this.content = content;
            return this;
        }


        /**
         * 被提及用户的信息
         * <p> 示例值：
         *
         * @param mentions
         * @return
         */
        public Builder mentions(MentionEvent[] mentions) {
            this.mentions = mentions;
            return this;
        }


        /**
         * 用户代理
         * <p> 示例值：Mozilla/5.0 (Macintosh; Intel Mac OS X 13_2_1) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/101.0.4951.53 Safari/537.36 Lark/6.7.5 LarkLocale/en_US ttnet SDK-Version/6.7.8
         *
         * @param userAgent
         * @return
         */
        public Builder userAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }


        public EventMessage build() {
            return new EventMessage(this);
        }
    }
}
