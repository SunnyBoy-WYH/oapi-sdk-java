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

public class BitableTableFieldActionValueProperty {
    /**
     * 数字、公式字段的显示格式
     * <p> 示例值：1,000
     */
    @SerializedName("formatter")
    private String formatter;
    /**
     * 日期、创建时间、最后更新时间字段的显示格式
     * <p> 示例值：yyyyMMdd
     */
    @SerializedName("date_formatter")
    private String dateFormatter;
    /**
     * 日期字段中新纪录自动填写创建时间
     * <p> 示例值：true
     */
    @SerializedName("auto_fill")
    private Boolean autoFill;
    /**
     * 人员字段中允许添加多个成员，单向关联、双向关联中允许添加多个记录
     * <p> 示例值：true
     */
    @SerializedName("multiple")
    private Boolean multiple;
    /**
     * 单向关联、双向关联字段中关联的数据表的ID
     * <p> 示例值：tblIniLz0Ic8oXyN
     */
    @SerializedName("table_id")
    private String tableId;
    /**
     * 单向关联、双向关联字段中关联的数据表的名字
     * <p> 示例值：table name
     */
    @SerializedName("table_name")
    private String tableName;
    /**
     * 双向关联字段中关联的数据表中对应的双向关联字段的名字
     * <p> 示例值：field name
     */
    @SerializedName("back_field_name")
    private String backFieldName;
    /**
     * 地理位置输入限制
     * <p> 示例值：only_mobile
     */
    @SerializedName("input_type")
    private String inputType;
    /**
     * 双向关联字段中关联的数据表中对应的双向关联字段的id
     * <p> 示例值：fldmj5qNii
     */
    @SerializedName("back_field_id")
    private String backFieldId;
    /**
     * 自动编号类型
     * <p> 示例值：
     */
    @SerializedName("auto_serial")
    private BitableTableFieldActionValuePropertyAutoSerial autoSerial;
    /**
     * 单选、多选字段的选项信息
     * <p> 示例值：
     */
    @SerializedName("options")
    private BitableTableFieldActionValuePropertyOption[] options;
    /**
     * 公式字段的公式表达式
     * <p> 示例值：bitable::$table[tblIniLz0Ic8oXyN].$field[fldqatAwxx]*6+333
     */
    @SerializedName("formula_expression")
    private String formulaExpression;

    // builder 开始
    public BitableTableFieldActionValueProperty() {
    }

    public BitableTableFieldActionValueProperty(Builder builder) {
        /**
         * 数字、公式字段的显示格式
         * <p> 示例值：1,000
         */
        this.formatter = builder.formatter;
        /**
         * 日期、创建时间、最后更新时间字段的显示格式
         * <p> 示例值：yyyyMMdd
         */
        this.dateFormatter = builder.dateFormatter;
        /**
         * 日期字段中新纪录自动填写创建时间
         * <p> 示例值：true
         */
        this.autoFill = builder.autoFill;
        /**
         * 人员字段中允许添加多个成员，单向关联、双向关联中允许添加多个记录
         * <p> 示例值：true
         */
        this.multiple = builder.multiple;
        /**
         * 单向关联、双向关联字段中关联的数据表的ID
         * <p> 示例值：tblIniLz0Ic8oXyN
         */
        this.tableId = builder.tableId;
        /**
         * 单向关联、双向关联字段中关联的数据表的名字
         * <p> 示例值：table name
         */
        this.tableName = builder.tableName;
        /**
         * 双向关联字段中关联的数据表中对应的双向关联字段的名字
         * <p> 示例值：field name
         */
        this.backFieldName = builder.backFieldName;
        /**
         * 地理位置输入限制
         * <p> 示例值：only_mobile
         */
        this.inputType = builder.inputType;
        /**
         * 双向关联字段中关联的数据表中对应的双向关联字段的id
         * <p> 示例值：fldmj5qNii
         */
        this.backFieldId = builder.backFieldId;
        /**
         * 自动编号类型
         * <p> 示例值：
         */
        this.autoSerial = builder.autoSerial;
        /**
         * 单选、多选字段的选项信息
         * <p> 示例值：
         */
        this.options = builder.options;
        /**
         * 公式字段的公式表达式
         * <p> 示例值：bitable::$table[tblIniLz0Ic8oXyN].$field[fldqatAwxx]*6+333
         */
        this.formulaExpression = builder.formulaExpression;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getFormatter() {
        return this.formatter;
    }

    public void setFormatter(String formatter) {
        this.formatter = formatter;
    }

    public String getDateFormatter() {
        return this.dateFormatter;
    }

    public void setDateFormatter(String dateFormatter) {
        this.dateFormatter = dateFormatter;
    }

    public Boolean getAutoFill() {
        return this.autoFill;
    }

    public void setAutoFill(Boolean autoFill) {
        this.autoFill = autoFill;
    }

    public Boolean getMultiple() {
        return this.multiple;
    }

    public void setMultiple(Boolean multiple) {
        this.multiple = multiple;
    }

    public String getTableId() {
        return this.tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    public String getTableName() {
        return this.tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getBackFieldName() {
        return this.backFieldName;
    }

    public void setBackFieldName(String backFieldName) {
        this.backFieldName = backFieldName;
    }

    public String getInputType() {
        return this.inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public String getBackFieldId() {
        return this.backFieldId;
    }

    public void setBackFieldId(String backFieldId) {
        this.backFieldId = backFieldId;
    }

    public BitableTableFieldActionValuePropertyAutoSerial getAutoSerial() {
        return this.autoSerial;
    }

    public void setAutoSerial(BitableTableFieldActionValuePropertyAutoSerial autoSerial) {
        this.autoSerial = autoSerial;
    }

    public BitableTableFieldActionValuePropertyOption[] getOptions() {
        return this.options;
    }

    public void setOptions(BitableTableFieldActionValuePropertyOption[] options) {
        this.options = options;
    }

    public String getFormulaExpression() {
        return this.formulaExpression;
    }

    public void setFormulaExpression(String formulaExpression) {
        this.formulaExpression = formulaExpression;
    }

    public static class Builder {
        /**
         * 数字、公式字段的显示格式
         * <p> 示例值：1,000
         */
        private String formatter;
        /**
         * 日期、创建时间、最后更新时间字段的显示格式
         * <p> 示例值：yyyyMMdd
         */
        private String dateFormatter;
        /**
         * 日期字段中新纪录自动填写创建时间
         * <p> 示例值：true
         */
        private Boolean autoFill;
        /**
         * 人员字段中允许添加多个成员，单向关联、双向关联中允许添加多个记录
         * <p> 示例值：true
         */
        private Boolean multiple;
        /**
         * 单向关联、双向关联字段中关联的数据表的ID
         * <p> 示例值：tblIniLz0Ic8oXyN
         */
        private String tableId;
        /**
         * 单向关联、双向关联字段中关联的数据表的名字
         * <p> 示例值：table name
         */
        private String tableName;
        /**
         * 双向关联字段中关联的数据表中对应的双向关联字段的名字
         * <p> 示例值：field name
         */
        private String backFieldName;
        /**
         * 地理位置输入限制
         * <p> 示例值：only_mobile
         */
        private String inputType;
        /**
         * 双向关联字段中关联的数据表中对应的双向关联字段的id
         * <p> 示例值：fldmj5qNii
         */
        private String backFieldId;
        /**
         * 自动编号类型
         * <p> 示例值：
         */
        private BitableTableFieldActionValuePropertyAutoSerial autoSerial;
        /**
         * 单选、多选字段的选项信息
         * <p> 示例值：
         */
        private BitableTableFieldActionValuePropertyOption[] options;
        /**
         * 公式字段的公式表达式
         * <p> 示例值：bitable::$table[tblIniLz0Ic8oXyN].$field[fldqatAwxx]*6+333
         */
        private String formulaExpression;

        /**
         * 数字、公式字段的显示格式
         * <p> 示例值：1,000
         *
         * @param formatter
         * @return
         */
        public Builder formatter(String formatter) {
            this.formatter = formatter;
            return this;
        }


        /**
         * 日期、创建时间、最后更新时间字段的显示格式
         * <p> 示例值：yyyyMMdd
         *
         * @param dateFormatter
         * @return
         */
        public Builder dateFormatter(String dateFormatter) {
            this.dateFormatter = dateFormatter;
            return this;
        }


        /**
         * 日期字段中新纪录自动填写创建时间
         * <p> 示例值：true
         *
         * @param autoFill
         * @return
         */
        public Builder autoFill(Boolean autoFill) {
            this.autoFill = autoFill;
            return this;
        }


        /**
         * 人员字段中允许添加多个成员，单向关联、双向关联中允许添加多个记录
         * <p> 示例值：true
         *
         * @param multiple
         * @return
         */
        public Builder multiple(Boolean multiple) {
            this.multiple = multiple;
            return this;
        }


        /**
         * 单向关联、双向关联字段中关联的数据表的ID
         * <p> 示例值：tblIniLz0Ic8oXyN
         *
         * @param tableId
         * @return
         */
        public Builder tableId(String tableId) {
            this.tableId = tableId;
            return this;
        }


        /**
         * 单向关联、双向关联字段中关联的数据表的名字
         * <p> 示例值：table name
         *
         * @param tableName
         * @return
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }


        /**
         * 双向关联字段中关联的数据表中对应的双向关联字段的名字
         * <p> 示例值：field name
         *
         * @param backFieldName
         * @return
         */
        public Builder backFieldName(String backFieldName) {
            this.backFieldName = backFieldName;
            return this;
        }


        /**
         * 地理位置输入限制
         * <p> 示例值：only_mobile
         *
         * @param inputType
         * @return
         */
        public Builder inputType(String inputType) {
            this.inputType = inputType;
            return this;
        }


        /**
         * 双向关联字段中关联的数据表中对应的双向关联字段的id
         * <p> 示例值：fldmj5qNii
         *
         * @param backFieldId
         * @return
         */
        public Builder backFieldId(String backFieldId) {
            this.backFieldId = backFieldId;
            return this;
        }


        /**
         * 自动编号类型
         * <p> 示例值：
         *
         * @param autoSerial
         * @return
         */
        public Builder autoSerial(BitableTableFieldActionValuePropertyAutoSerial autoSerial) {
            this.autoSerial = autoSerial;
            return this;
        }


        /**
         * 单选、多选字段的选项信息
         * <p> 示例值：
         *
         * @param options
         * @return
         */
        public Builder options(BitableTableFieldActionValuePropertyOption[] options) {
            this.options = options;
            return this;
        }


        /**
         * 公式字段的公式表达式
         * <p> 示例值：bitable::$table[tblIniLz0Ic8oXyN].$field[fldqatAwxx]*6+333
         *
         * @param formulaExpression
         * @return
         */
        public Builder formulaExpression(String formulaExpression) {
            this.formulaExpression = formulaExpression;
            return this;
        }


        public BitableTableFieldActionValueProperty build() {
            return new BitableTableFieldActionValueProperty(this);
        }
    }
}
