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

package com.lark.oapi.service.vc.v1.model;

import com.google.gson.annotations.SerializedName;

public class SetRoomConfigReqBody {
    /**
     * 设置节点范围
     * <p> 示例值：5
     */
    @SerializedName("scope")
    private Integer scope;
    /**
     * 国家/地区ID scope为2，3时需要此参数
     * <p> 示例值：1
     */
    @SerializedName("country_id")
    private String countryId;
    /**
     * 城市ID scope为3时需要此参数
     * <p> 示例值：2
     */
    @SerializedName("district_id")
    private String districtId;
    /**
     * 建筑ID scope为4，5时需要此参数
     * <p> 示例值：3
     */
    @SerializedName("building_id")
    private String buildingId;
    /**
     * 楼层 scope为5时需要此参数
     * <p> 示例值：4
     */
    @SerializedName("floor_name")
    private String floorName;
    /**
     * 会议室ID scope为6时需要此参数
     * <p> 示例值：67687262867363
     */
    @SerializedName("room_id")
    private String roomId;
    /**
     * 会议室设置
     * <p> 示例值：
     */
    @SerializedName("room_config")
    private RoomConfig roomConfig;

    // builder 开始
    public SetRoomConfigReqBody() {
    }

    public SetRoomConfigReqBody(Builder builder) {
        /**
         * 设置节点范围
         * <p> 示例值：5
         */
        this.scope = builder.scope;
        /**
         * 国家/地区ID scope为2，3时需要此参数
         * <p> 示例值：1
         */
        this.countryId = builder.countryId;
        /**
         * 城市ID scope为3时需要此参数
         * <p> 示例值：2
         */
        this.districtId = builder.districtId;
        /**
         * 建筑ID scope为4，5时需要此参数
         * <p> 示例值：3
         */
        this.buildingId = builder.buildingId;
        /**
         * 楼层 scope为5时需要此参数
         * <p> 示例值：4
         */
        this.floorName = builder.floorName;
        /**
         * 会议室ID scope为6时需要此参数
         * <p> 示例值：67687262867363
         */
        this.roomId = builder.roomId;
        /**
         * 会议室设置
         * <p> 示例值：
         */
        this.roomConfig = builder.roomConfig;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getScope() {
        return this.scope;
    }

    public void setScope(Integer scope) {
        this.scope = scope;
    }

    public String getCountryId() {
        return this.countryId;
    }

    public void setCountryId(String countryId) {
        this.countryId = countryId;
    }

    public String getDistrictId() {
        return this.districtId;
    }

    public void setDistrictId(String districtId) {
        this.districtId = districtId;
    }

    public String getBuildingId() {
        return this.buildingId;
    }

    public void setBuildingId(String buildingId) {
        this.buildingId = buildingId;
    }

    public String getFloorName() {
        return this.floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public String getRoomId() {
        return this.roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public RoomConfig getRoomConfig() {
        return this.roomConfig;
    }

    public void setRoomConfig(RoomConfig roomConfig) {
        this.roomConfig = roomConfig;
    }

    public static class Builder {
        /**
         * 设置节点范围
         * <p> 示例值：5
         */
        private Integer scope;
        /**
         * 国家/地区ID scope为2，3时需要此参数
         * <p> 示例值：1
         */
        private String countryId;
        /**
         * 城市ID scope为3时需要此参数
         * <p> 示例值：2
         */
        private String districtId;
        /**
         * 建筑ID scope为4，5时需要此参数
         * <p> 示例值：3
         */
        private String buildingId;
        /**
         * 楼层 scope为5时需要此参数
         * <p> 示例值：4
         */
        private String floorName;
        /**
         * 会议室ID scope为6时需要此参数
         * <p> 示例值：67687262867363
         */
        private String roomId;
        /**
         * 会议室设置
         * <p> 示例值：
         */
        private RoomConfig roomConfig;

        /**
         * 设置节点范围
         * <p> 示例值：5
         *
         * @param scope
         * @return
         */
        public Builder scope(Integer scope) {
            this.scope = scope;
            return this;
        }

        /**
         * 设置节点范围
         * <p> 示例值：5
         *
         * @param scope {@link com.lark.oapi.service.vc.v1.enums.SetRoomConfigNodeScopeEnum}
         * @return
         */
        public Builder scope(com.lark.oapi.service.vc.v1.enums.SetRoomConfigNodeScopeEnum scope) {
            this.scope = scope.getValue();
            return this;
        }


        /**
         * 国家/地区ID scope为2，3时需要此参数
         * <p> 示例值：1
         *
         * @param countryId
         * @return
         */
        public Builder countryId(String countryId) {
            this.countryId = countryId;
            return this;
        }


        /**
         * 城市ID scope为3时需要此参数
         * <p> 示例值：2
         *
         * @param districtId
         * @return
         */
        public Builder districtId(String districtId) {
            this.districtId = districtId;
            return this;
        }


        /**
         * 建筑ID scope为4，5时需要此参数
         * <p> 示例值：3
         *
         * @param buildingId
         * @return
         */
        public Builder buildingId(String buildingId) {
            this.buildingId = buildingId;
            return this;
        }


        /**
         * 楼层 scope为5时需要此参数
         * <p> 示例值：4
         *
         * @param floorName
         * @return
         */
        public Builder floorName(String floorName) {
            this.floorName = floorName;
            return this;
        }


        /**
         * 会议室ID scope为6时需要此参数
         * <p> 示例值：67687262867363
         *
         * @param roomId
         * @return
         */
        public Builder roomId(String roomId) {
            this.roomId = roomId;
            return this;
        }


        /**
         * 会议室设置
         * <p> 示例值：
         *
         * @param roomConfig
         * @return
         */
        public Builder roomConfig(RoomConfig roomConfig) {
            this.roomConfig = roomConfig;
            return this;
        }


        public SetRoomConfigReqBody build() {
            return new SetRoomConfigReqBody(this);
        }
    }
}
