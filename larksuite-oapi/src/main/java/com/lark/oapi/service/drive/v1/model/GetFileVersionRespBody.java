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

package com.lark.oapi.service.drive.v1.model;

import com.google.gson.annotations.SerializedName;

public class GetFileVersionRespBody {
    /**
     * 版本文档标题
     * <p> 示例值：文档标题
     */
    @SerializedName("name")
    private String name;
    /**
     * 版本文档版本号
     * <p> 示例值：version1
     */
    @SerializedName("version")
    private String version;
    /**
     * 源文档token
     * <p> 示例值：doxcnMycg4ryxQofSeoKkJuXYOb
     */
    @SerializedName("parent_token")
    private String parentToken;
    /**
     * 版本文档所有者id
     * <p> 示例值：694699009591869450
     */
    @SerializedName("owner_id")
    private String ownerId;
    /**
     * 版本文档创建者id
     * <p> 示例值：694699009591869451
     */
    @SerializedName("creator_id")
    private String creatorId;
    /**
     * 版本文档创建时间
     * <p> 示例值：1660708537
     */
    @SerializedName("create_time")
    private String createTime;
    /**
     * 版本文档更新时间
     * <p> 示例值：1660708537
     */
    @SerializedName("update_time")
    private String updateTime;
    /**
     * 版本文档状态
     * <p> 示例值：0，1，2
     */
    @SerializedName("status")
    private String status;
    /**
     * 版本文档类型
     * <p> 示例值：docx
     */
    @SerializedName("obj_type")
    private String objType;
    /**
     * 源文档类型
     * <p> 示例值：docx
     */
    @SerializedName("parent_type")
    private String parentType;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getParentToken() {
        return this.parentToken;
    }

    public void setParentToken(String parentToken) {
        this.parentToken = parentToken;
    }

    public String getOwnerId() {
        return this.ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getCreatorId() {
        return this.creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getObjType() {
        return this.objType;
    }

    public void setObjType(String objType) {
        this.objType = objType;
    }

    public String getParentType() {
        return this.parentType;
    }

    public void setParentType(String parentType) {
        this.parentType = parentType;
    }

}
