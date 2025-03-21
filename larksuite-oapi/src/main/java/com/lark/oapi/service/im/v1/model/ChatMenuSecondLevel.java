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

public class ChatMenuSecondLevel {
    /**
     * 二级菜单ID
     * <p> 示例值：7039638308221468675
     */
    @SerializedName("chat_menu_second_level_id")
    private String chatMenuSecondLevelId;
    /**
     * 二级菜单信息
     * <p> 示例值：
     */
    @SerializedName("chat_menu_item")
    private ChatMenuItem chatMenuItem;

    // builder 开始
    public ChatMenuSecondLevel() {
    }

    public ChatMenuSecondLevel(Builder builder) {
        /**
         * 二级菜单ID
         * <p> 示例值：7039638308221468675
         */
        this.chatMenuSecondLevelId = builder.chatMenuSecondLevelId;
        /**
         * 二级菜单信息
         * <p> 示例值：
         */
        this.chatMenuItem = builder.chatMenuItem;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getChatMenuSecondLevelId() {
        return this.chatMenuSecondLevelId;
    }

    public void setChatMenuSecondLevelId(String chatMenuSecondLevelId) {
        this.chatMenuSecondLevelId = chatMenuSecondLevelId;
    }

    public ChatMenuItem getChatMenuItem() {
        return this.chatMenuItem;
    }

    public void setChatMenuItem(ChatMenuItem chatMenuItem) {
        this.chatMenuItem = chatMenuItem;
    }

    public static class Builder {
        /**
         * 二级菜单ID
         * <p> 示例值：7039638308221468675
         */
        private String chatMenuSecondLevelId;
        /**
         * 二级菜单信息
         * <p> 示例值：
         */
        private ChatMenuItem chatMenuItem;

        /**
         * 二级菜单ID
         * <p> 示例值：7039638308221468675
         *
         * @param chatMenuSecondLevelId
         * @return
         */
        public Builder chatMenuSecondLevelId(String chatMenuSecondLevelId) {
            this.chatMenuSecondLevelId = chatMenuSecondLevelId;
            return this;
        }


        /**
         * 二级菜单信息
         * <p> 示例值：
         *
         * @param chatMenuItem
         * @return
         */
        public Builder chatMenuItem(ChatMenuItem chatMenuItem) {
            this.chatMenuItem = chatMenuItem;
            return this;
        }


        public ChatMenuSecondLevel build() {
            return new ChatMenuSecondLevel(this);
        }
    }
}
