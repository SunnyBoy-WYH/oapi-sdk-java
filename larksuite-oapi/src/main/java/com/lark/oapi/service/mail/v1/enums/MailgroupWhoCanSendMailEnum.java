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

package com.lark.oapi.service.mail.v1.enums;

/**
 * 谁可发送邮件到此邮件组
 */
public enum MailgroupWhoCanSendMailEnum {
    ANYONE("ANYONE"), // Any Internet user can send mail to this mail group
    ALL_INTERNAL_USERS("ALL_INTERNAL_USERS"), // Anyone in the team can send mail to this mail group
    ALL_GROUP_MEMBERS("ALL_GROUP_MEMBERS"), // Any group member can send mail to this mail group
    CUSTOM_MEMBERS("CUSTOM_MEMBERS"), // Only custom members can send mail to this mail group, define in mailgroup.permission_members resoure
    ;
    private String value;

    MailgroupWhoCanSendMailEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}