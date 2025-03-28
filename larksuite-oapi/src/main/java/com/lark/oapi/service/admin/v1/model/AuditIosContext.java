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

package com.lark.oapi.service.admin.v1.model;

import com.google.gson.annotations.SerializedName;

public class AuditIosContext {
    /**
     * UDID
     * <p> 示例值：
     */
    @SerializedName("udid")
    private String udid;
    /**
     * 设备ID
     * <p> 示例值：
     */
    @SerializedName("did")
    private String did;
    /**
     * app的版本
     * <p> 示例值：
     */
    @SerializedName("app_ver")
    private String appVer;
    /**
     * SecSDK版本
     * <p> 示例值：
     */
    @SerializedName("ver")
    private String ver;
    /**
     * 系统类型及版本
     * <p> 示例值：
     */
    @SerializedName("os")
    private String os;
    /**
     * 系统时区
     * <p> 示例值：
     */
    @SerializedName("STZone")
    private String sTZone;
    /**
     * 当前语言
     * <p> 示例值：
     */
    @SerializedName("ML")
    private String mL;
    /**
     * 是否越狱
     * <p> 示例值：
     */
    @SerializedName("sjd")
    private String sjd;
    /**
     * 代理ip
     * <p> 示例值：
     */
    @SerializedName("proxyip")
    private String proxyip;
    /**
     * wifi ip
     * <p> 示例值：
     */
    @SerializedName("wifip")
    private String wifip;
    /**
     * GPS经纬度
     * <p> 示例值：
     */
    @SerializedName("location")
    private String location;
    /**
     * 当前设备活跃ip
     * <p> 示例值：
     */
    @SerializedName("active_ip")
    private String activeIp;
    /**
     * 当前设备活跃ip对应网卡类型
     * <p> 示例值：
     */
    @SerializedName("active_ip_detail")
    private String activeIpDetail;
    /**
     * 基站信息
     * <p> 示例值：
     */
    @SerializedName("cell_base_station")
    private String cellBaseStation;
    /**
     * 公网ip
     * <p> 示例值：
     */
    @SerializedName("IP")
    private String iP;

    // builder 开始
    public AuditIosContext() {
    }

    public AuditIosContext(Builder builder) {
        /**
         * UDID
         * <p> 示例值：
         */
        this.udid = builder.udid;
        /**
         * 设备ID
         * <p> 示例值：
         */
        this.did = builder.did;
        /**
         * app的版本
         * <p> 示例值：
         */
        this.appVer = builder.appVer;
        /**
         * SecSDK版本
         * <p> 示例值：
         */
        this.ver = builder.ver;
        /**
         * 系统类型及版本
         * <p> 示例值：
         */
        this.os = builder.os;
        /**
         * 系统时区
         * <p> 示例值：
         */
        this.sTZone = builder.sTZone;
        /**
         * 当前语言
         * <p> 示例值：
         */
        this.mL = builder.mL;
        /**
         * 是否越狱
         * <p> 示例值：
         */
        this.sjd = builder.sjd;
        /**
         * 代理ip
         * <p> 示例值：
         */
        this.proxyip = builder.proxyip;
        /**
         * wifi ip
         * <p> 示例值：
         */
        this.wifip = builder.wifip;
        /**
         * GPS经纬度
         * <p> 示例值：
         */
        this.location = builder.location;
        /**
         * 当前设备活跃ip
         * <p> 示例值：
         */
        this.activeIp = builder.activeIp;
        /**
         * 当前设备活跃ip对应网卡类型
         * <p> 示例值：
         */
        this.activeIpDetail = builder.activeIpDetail;
        /**
         * 基站信息
         * <p> 示例值：
         */
        this.cellBaseStation = builder.cellBaseStation;
        /**
         * 公网ip
         * <p> 示例值：
         */
        this.iP = builder.iP;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getUdid() {
        return this.udid;
    }

    public void setUdid(String udid) {
        this.udid = udid;
    }

    public String getDid() {
        return this.did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getAppVer() {
        return this.appVer;
    }

    public void setAppVer(String appVer) {
        this.appVer = appVer;
    }

    public String getVer() {
        return this.ver;
    }

    public void setVer(String ver) {
        this.ver = ver;
    }

    public String getOs() {
        return this.os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getSTZone() {
        return this.sTZone;
    }

    public void setSTZone(String sTZone) {
        this.sTZone = sTZone;
    }

    public String getML() {
        return this.mL;
    }

    public void setML(String mL) {
        this.mL = mL;
    }

    public String getSjd() {
        return this.sjd;
    }

    public void setSjd(String sjd) {
        this.sjd = sjd;
    }

    public String getProxyip() {
        return this.proxyip;
    }

    public void setProxyip(String proxyip) {
        this.proxyip = proxyip;
    }

    public String getWifip() {
        return this.wifip;
    }

    public void setWifip(String wifip) {
        this.wifip = wifip;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getActiveIp() {
        return this.activeIp;
    }

    public void setActiveIp(String activeIp) {
        this.activeIp = activeIp;
    }

    public String getActiveIpDetail() {
        return this.activeIpDetail;
    }

    public void setActiveIpDetail(String activeIpDetail) {
        this.activeIpDetail = activeIpDetail;
    }

    public String getCellBaseStation() {
        return this.cellBaseStation;
    }

    public void setCellBaseStation(String cellBaseStation) {
        this.cellBaseStation = cellBaseStation;
    }

    public String getIP() {
        return this.iP;
    }

    public void setIP(String iP) {
        this.iP = iP;
    }

    public static class Builder {
        /**
         * UDID
         * <p> 示例值：
         */
        private String udid;
        /**
         * 设备ID
         * <p> 示例值：
         */
        private String did;
        /**
         * app的版本
         * <p> 示例值：
         */
        private String appVer;
        /**
         * SecSDK版本
         * <p> 示例值：
         */
        private String ver;
        /**
         * 系统类型及版本
         * <p> 示例值：
         */
        private String os;
        /**
         * 系统时区
         * <p> 示例值：
         */
        private String sTZone;
        /**
         * 当前语言
         * <p> 示例值：
         */
        private String mL;
        /**
         * 是否越狱
         * <p> 示例值：
         */
        private String sjd;
        /**
         * 代理ip
         * <p> 示例值：
         */
        private String proxyip;
        /**
         * wifi ip
         * <p> 示例值：
         */
        private String wifip;
        /**
         * GPS经纬度
         * <p> 示例值：
         */
        private String location;
        /**
         * 当前设备活跃ip
         * <p> 示例值：
         */
        private String activeIp;
        /**
         * 当前设备活跃ip对应网卡类型
         * <p> 示例值：
         */
        private String activeIpDetail;
        /**
         * 基站信息
         * <p> 示例值：
         */
        private String cellBaseStation;
        /**
         * 公网ip
         * <p> 示例值：
         */
        private String iP;

        /**
         * UDID
         * <p> 示例值：
         *
         * @param udid
         * @return
         */
        public Builder udid(String udid) {
            this.udid = udid;
            return this;
        }


        /**
         * 设备ID
         * <p> 示例值：
         *
         * @param did
         * @return
         */
        public Builder did(String did) {
            this.did = did;
            return this;
        }


        /**
         * app的版本
         * <p> 示例值：
         *
         * @param appVer
         * @return
         */
        public Builder appVer(String appVer) {
            this.appVer = appVer;
            return this;
        }


        /**
         * SecSDK版本
         * <p> 示例值：
         *
         * @param ver
         * @return
         */
        public Builder ver(String ver) {
            this.ver = ver;
            return this;
        }


        /**
         * 系统类型及版本
         * <p> 示例值：
         *
         * @param os
         * @return
         */
        public Builder os(String os) {
            this.os = os;
            return this;
        }


        /**
         * 系统时区
         * <p> 示例值：
         *
         * @param sTZone
         * @return
         */
        public Builder sTZone(String sTZone) {
            this.sTZone = sTZone;
            return this;
        }


        /**
         * 当前语言
         * <p> 示例值：
         *
         * @param mL
         * @return
         */
        public Builder mL(String mL) {
            this.mL = mL;
            return this;
        }


        /**
         * 是否越狱
         * <p> 示例值：
         *
         * @param sjd
         * @return
         */
        public Builder sjd(String sjd) {
            this.sjd = sjd;
            return this;
        }


        /**
         * 代理ip
         * <p> 示例值：
         *
         * @param proxyip
         * @return
         */
        public Builder proxyip(String proxyip) {
            this.proxyip = proxyip;
            return this;
        }


        /**
         * wifi ip
         * <p> 示例值：
         *
         * @param wifip
         * @return
         */
        public Builder wifip(String wifip) {
            this.wifip = wifip;
            return this;
        }


        /**
         * GPS经纬度
         * <p> 示例值：
         *
         * @param location
         * @return
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }


        /**
         * 当前设备活跃ip
         * <p> 示例值：
         *
         * @param activeIp
         * @return
         */
        public Builder activeIp(String activeIp) {
            this.activeIp = activeIp;
            return this;
        }


        /**
         * 当前设备活跃ip对应网卡类型
         * <p> 示例值：
         *
         * @param activeIpDetail
         * @return
         */
        public Builder activeIpDetail(String activeIpDetail) {
            this.activeIpDetail = activeIpDetail;
            return this;
        }


        /**
         * 基站信息
         * <p> 示例值：
         *
         * @param cellBaseStation
         * @return
         */
        public Builder cellBaseStation(String cellBaseStation) {
            this.cellBaseStation = cellBaseStation;
            return this;
        }


        /**
         * 公网ip
         * <p> 示例值：
         *
         * @param iP
         * @return
         */
        public Builder iP(String iP) {
            this.iP = iP;
            return this;
        }


        public AuditIosContext build() {
            return new AuditIosContext(this);
        }
    }
}
