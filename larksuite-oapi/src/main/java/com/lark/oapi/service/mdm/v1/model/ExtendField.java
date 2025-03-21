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

package com.lark.oapi.service.mdm.v1.model;

import com.google.gson.annotations.SerializedName;

public class ExtendField {
    /**
     * 字段类型
     * <p> 示例值：0
     */
    @SerializedName("field_type")
    private Integer fieldType;
    /**
     * 字段类型为 单行文本框(0)、多行文本框(1)、单选框(3)、下拉单选框(5) 时的值
     * <p> 示例值：文本值
     */
    @SerializedName("field_value")
    private String fieldValue;
    /**
     * 字段类型为 多选框(4) 下拉多选(6) 时的值
     * <p> 示例值：["2021-09-23","2021-10-14"]
     */
    @SerializedName("options")
    private String[] options;
    /**
     * 字段类型为 数字(2) 时的值
     * <p> 示例值：1.11
     */
    @SerializedName("num")
    private Double num;
    /**
     * 字段类型是 日期(7)时候的值
     * <p> 示例值：2021-10-14
     */
    @SerializedName("date")
    private String date;
    /**
     * 字段类型是 日期区间(8) 时候的值    数组长度为2      0-startTime   1-endTime
     * <p> 示例值：2021-10-14
     */
    @SerializedName("range_date")
    private String[] rangeDate;
    /**
     * 字段编码
     * <p> 示例值：X00000001
     */
    @SerializedName("field_code")
    private String fieldCode;
    /**
     * 附件列表 字段类型是 附件(12) 时候的值
     * <p> 示例值：
     */
    @SerializedName("appendix")
    private Appendix[] appendix;

    // builder 开始
    public ExtendField() {
    }

    public ExtendField(Builder builder) {
        /**
         * 字段类型
         * <p> 示例值：0
         */
        this.fieldType = builder.fieldType;
        /**
         * 字段类型为 单行文本框(0)、多行文本框(1)、单选框(3)、下拉单选框(5) 时的值
         * <p> 示例值：文本值
         */
        this.fieldValue = builder.fieldValue;
        /**
         * 字段类型为 多选框(4) 下拉多选(6) 时的值
         * <p> 示例值：["2021-09-23","2021-10-14"]
         */
        this.options = builder.options;
        /**
         * 字段类型为 数字(2) 时的值
         * <p> 示例值：1.11
         */
        this.num = builder.num;
        /**
         * 字段类型是 日期(7)时候的值
         * <p> 示例值：2021-10-14
         */
        this.date = builder.date;
        /**
         * 字段类型是 日期区间(8) 时候的值    数组长度为2      0-startTime   1-endTime
         * <p> 示例值：2021-10-14
         */
        this.rangeDate = builder.rangeDate;
        /**
         * 字段编码
         * <p> 示例值：X00000001
         */
        this.fieldCode = builder.fieldCode;
        /**
         * 附件列表 字段类型是 附件(12) 时候的值
         * <p> 示例值：
         */
        this.appendix = builder.appendix;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Integer getFieldType() {
        return this.fieldType;
    }

    public void setFieldType(Integer fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldValue() {
        return this.fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public String[] getOptions() {
        return this.options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public Double getNum() {
        return this.num;
    }

    public void setNum(Double num) {
        this.num = num;
    }

    public String getDate() {
        return this.date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String[] getRangeDate() {
        return this.rangeDate;
    }

    public void setRangeDate(String[] rangeDate) {
        this.rangeDate = rangeDate;
    }

    public String getFieldCode() {
        return this.fieldCode;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }

    public Appendix[] getAppendix() {
        return this.appendix;
    }

    public void setAppendix(Appendix[] appendix) {
        this.appendix = appendix;
    }

    public static class Builder {
        /**
         * 字段类型
         * <p> 示例值：0
         */
        private Integer fieldType;
        /**
         * 字段类型为 单行文本框(0)、多行文本框(1)、单选框(3)、下拉单选框(5) 时的值
         * <p> 示例值：文本值
         */
        private String fieldValue;
        /**
         * 字段类型为 多选框(4) 下拉多选(6) 时的值
         * <p> 示例值：["2021-09-23","2021-10-14"]
         */
        private String[] options;
        /**
         * 字段类型为 数字(2) 时的值
         * <p> 示例值：1.11
         */
        private Double num;
        /**
         * 字段类型是 日期(7)时候的值
         * <p> 示例值：2021-10-14
         */
        private String date;
        /**
         * 字段类型是 日期区间(8) 时候的值    数组长度为2      0-startTime   1-endTime
         * <p> 示例值：2021-10-14
         */
        private String[] rangeDate;
        /**
         * 字段编码
         * <p> 示例值：X00000001
         */
        private String fieldCode;
        /**
         * 附件列表 字段类型是 附件(12) 时候的值
         * <p> 示例值：
         */
        private Appendix[] appendix;

        /**
         * 字段类型
         * <p> 示例值：0
         *
         * @param fieldType
         * @return
         */
        public Builder fieldType(Integer fieldType) {
            this.fieldType = fieldType;
            return this;
        }

        /**
         * 字段类型
         * <p> 示例值：0
         *
         * @param fieldType {@link com.lark.oapi.service.mdm.v1.enums.ExtendFieldFieldTypeEnum}
         * @return
         */
        public Builder fieldType(com.lark.oapi.service.mdm.v1.enums.ExtendFieldFieldTypeEnum fieldType) {
            this.fieldType = fieldType.getValue();
            return this;
        }


        /**
         * 字段类型为 单行文本框(0)、多行文本框(1)、单选框(3)、下拉单选框(5) 时的值
         * <p> 示例值：文本值
         *
         * @param fieldValue
         * @return
         */
        public Builder fieldValue(String fieldValue) {
            this.fieldValue = fieldValue;
            return this;
        }


        /**
         * 字段类型为 多选框(4) 下拉多选(6) 时的值
         * <p> 示例值：["2021-09-23","2021-10-14"]
         *
         * @param options
         * @return
         */
        public Builder options(String[] options) {
            this.options = options;
            return this;
        }


        /**
         * 字段类型为 数字(2) 时的值
         * <p> 示例值：1.11
         *
         * @param num
         * @return
         */
        public Builder num(Double num) {
            this.num = num;
            return this;
        }


        /**
         * 字段类型是 日期(7)时候的值
         * <p> 示例值：2021-10-14
         *
         * @param date
         * @return
         */
        public Builder date(String date) {
            this.date = date;
            return this;
        }


        /**
         * 字段类型是 日期区间(8) 时候的值    数组长度为2      0-startTime   1-endTime
         * <p> 示例值：2021-10-14
         *
         * @param rangeDate
         * @return
         */
        public Builder rangeDate(String[] rangeDate) {
            this.rangeDate = rangeDate;
            return this;
        }


        /**
         * 字段编码
         * <p> 示例值：X00000001
         *
         * @param fieldCode
         * @return
         */
        public Builder fieldCode(String fieldCode) {
            this.fieldCode = fieldCode;
            return this;
        }


        /**
         * 附件列表 字段类型是 附件(12) 时候的值
         * <p> 示例值：
         *
         * @param appendix
         * @return
         */
        public Builder appendix(Appendix[] appendix) {
            this.appendix = appendix;
            return this;
        }


        public ExtendField build() {
            return new ExtendField(this);
        }
    }
}
