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

public class CreateMessageRespBody {
    /**
     * 消息id open_message_id
     * <p> 示例值：om_dc13264520392913993dd051dba21dcf
     */
    @SerializedName("message_id")
    private String messageId;
    /**
     * 根消息id open_message_id
     * <p> 示例值：om_40eb06e7b84dc71c03e009ad3c754195
     */
    @SerializedName("root_id")
    private String rootId;
    /**
     * 父消息的id open_message_id
     * <p> 示例值：om_d4be107c616aed9c1da8ed8068570a9f
     */
    @SerializedName("parent_id")
    private String parentId;
    /**
     * 消息类型 text post card image等等
     * <p> 示例值：card
     */
    @SerializedName("msg_type")
    private String msgType;
    /**
     * 消息生成的时间戳(毫秒)
     * <p> 示例值：1609296809
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 消息更新的时间戳
     * <p> 示例值：1609336806
     */
    @SerializedName("update_time")
    private String updateTime;
    /**
     * 消息是否被撤回
     * <p> 示例值：false
     */
    @SerializedName("deleted")
    private Boolean deleted;
    /**
     * 消息是否被更新
     * <p> 示例值：false
     */
    @SerializedName("updated")
    private Boolean updated;
    /**
     * 所属的群
     * <p> 示例值：oc_5ad11d72b830411d72b836c20
     */
    @SerializedName("chat_id")
    private String chatId;
    /**
     * 发送者，可以是用户或应用
     * <p> 示例值：object
     */
    @SerializedName("sender")
    private Sender sender;
    /**
     * 消息内容,json结构
     * <p> 示例值：json结构
     */
    @SerializedName("body")
    private MessageBody body;
    /**
     * 被艾特的人或应用的id
     * <p> 示例值：
     */
    @SerializedName("mentions")
    private Mention[] mentions;
    /**
     * 合并消息的上一层级消息id open_message_id
     * <p> 示例值：om_40eb06e7b84dc71c03e00ida3c754892
     */
    @SerializedName("upper_message_id")
    private String upperMessageId;

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

    public String getMsgType() {
        return this.msgType;
    }

    public void setMsgType(String msgType) {
        this.msgType = msgType;
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

    public Boolean getDeleted() {
        return this.deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean getUpdated() {
        return this.updated;
    }

    public void setUpdated(Boolean updated) {
        this.updated = updated;
    }

    public String getChatId() {
        return this.chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }

    public Sender getSender() {
        return this.sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public MessageBody getBody() {
        return this.body;
    }

    public void setBody(MessageBody body) {
        this.body = body;
    }

    public Mention[] getMentions() {
        return this.mentions;
    }

    public void setMentions(Mention[] mentions) {
        this.mentions = mentions;
    }

    public String getUpperMessageId() {
        return this.upperMessageId;
    }

    public void setUpperMessageId(String upperMessageId) {
        this.upperMessageId = upperMessageId;
    }

}
