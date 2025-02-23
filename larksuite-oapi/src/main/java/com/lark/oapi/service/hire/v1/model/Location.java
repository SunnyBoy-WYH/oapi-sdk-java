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

public class Location {
    /**
     * 地点 ID
     * <p> 示例值：1213213123123
     */
    @SerializedName("id")
    private String id;
    /**
     * 地点名称
     * <p> 示例值：
     */
    @SerializedName("name")
    private I18n name;
    /**
     * 区信息
     * <p> 示例值：
     */
    @SerializedName("district")
    private CodeNameObject district;
    /**
     * 市信息
     * <p> 示例值：
     */
    @SerializedName("city")
    private CodeNameObject city;
    /**
     * 省份/州信息
     * <p> 示例值：
     */
    @SerializedName("state")
    private CodeNameObject state;
    /**
     * 国家信息
     * <p> 示例值：
     */
    @SerializedName("country")
    private CodeNameObject country;
    /**
     * 启用状态
     * <p> 示例值：1
     */
    @SerializedName("active_status")
    private Integer activeStatus;

    // builder 开始
    public Location() {
    }

    public Location(Builder builder) {
        /**
         * 地点 ID
         * <p> 示例值：1213213123123
         */
        this.id = builder.id;
        /**
         * 地点名称
         * <p> 示例值：
         */
        this.name = builder.name;
        /**
         * 区信息
         * <p> 示例值：
         */
        this.district = builder.district;
        /**
         * 市信息
         * <p> 示例值：
         */
        this.city = builder.city;
        /**
         * 省份/州信息
         * <p> 示例值：
         */
        this.state = builder.state;
        /**
         * 国家信息
         * <p> 示例值：
         */
        this.country = builder.country;
        /**
         * 启用状态
         * <p> 示例值：1
         */
        this.activeStatus = builder.activeStatus;
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

    public I18n getName() {
        return this.name;
    }

    public void setName(I18n name) {
        this.name = name;
    }

    public CodeNameObject getDistrict() {
        return this.district;
    }

    public void setDistrict(CodeNameObject district) {
        this.district = district;
    }

    public CodeNameObject getCity() {
        return this.city;
    }

    public void setCity(CodeNameObject city) {
        this.city = city;
    }

    public CodeNameObject getState() {
        return this.state;
    }

    public void setState(CodeNameObject state) {
        this.state = state;
    }

    public CodeNameObject getCountry() {
        return this.country;
    }

    public void setCountry(CodeNameObject country) {
        this.country = country;
    }

    public Integer getActiveStatus() {
        return this.activeStatus;
    }

    public void setActiveStatus(Integer activeStatus) {
        this.activeStatus = activeStatus;
    }

    public static class Builder {
        /**
         * 地点 ID
         * <p> 示例值：1213213123123
         */
        private String id;
        /**
         * 地点名称
         * <p> 示例值：
         */
        private I18n name;
        /**
         * 区信息
         * <p> 示例值：
         */
        private CodeNameObject district;
        /**
         * 市信息
         * <p> 示例值：
         */
        private CodeNameObject city;
        /**
         * 省份/州信息
         * <p> 示例值：
         */
        private CodeNameObject state;
        /**
         * 国家信息
         * <p> 示例值：
         */
        private CodeNameObject country;
        /**
         * 启用状态
         * <p> 示例值：1
         */
        private Integer activeStatus;

        /**
         * 地点 ID
         * <p> 示例值：1213213123123
         *
         * @param id
         * @return
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }


        /**
         * 地点名称
         * <p> 示例值：
         *
         * @param name
         * @return
         */
        public Builder name(I18n name) {
            this.name = name;
            return this;
        }


        /**
         * 区信息
         * <p> 示例值：
         *
         * @param district
         * @return
         */
        public Builder district(CodeNameObject district) {
            this.district = district;
            return this;
        }


        /**
         * 市信息
         * <p> 示例值：
         *
         * @param city
         * @return
         */
        public Builder city(CodeNameObject city) {
            this.city = city;
            return this;
        }


        /**
         * 省份/州信息
         * <p> 示例值：
         *
         * @param state
         * @return
         */
        public Builder state(CodeNameObject state) {
            this.state = state;
            return this;
        }


        /**
         * 国家信息
         * <p> 示例值：
         *
         * @param country
         * @return
         */
        public Builder country(CodeNameObject country) {
            this.country = country;
            return this;
        }


        /**
         * 启用状态
         * <p> 示例值：1
         *
         * @param activeStatus
         * @return
         */
        public Builder activeStatus(Integer activeStatus) {
            this.activeStatus = activeStatus;
            return this;
        }


        public Location build() {
            return new Location(this);
        }
    }
}
