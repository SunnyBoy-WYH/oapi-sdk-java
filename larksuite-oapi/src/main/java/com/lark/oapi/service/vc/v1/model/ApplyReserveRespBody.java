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

public class ApplyReserveRespBody {
    /**
     * 预约数据
     * <p> 示例值：
     */
    @SerializedName("reserve")
    private Reserve reserve;
    /**
     * 预约参数检查信息
     * <p> 示例值：
     */
    @SerializedName("reserve_correction_check_info")
    private ReserveCorrectionCheckInfo reserveCorrectionCheckInfo;

    public Reserve getReserve() {
        return this.reserve;
    }

    public void setReserve(Reserve reserve) {
        this.reserve = reserve;
    }

    public ReserveCorrectionCheckInfo getReserveCorrectionCheckInfo() {
        return this.reserveCorrectionCheckInfo;
    }

    public void setReserveCorrectionCheckInfo(ReserveCorrectionCheckInfo reserveCorrectionCheckInfo) {
        this.reserveCorrectionCheckInfo = reserveCorrectionCheckInfo;
    }

}
