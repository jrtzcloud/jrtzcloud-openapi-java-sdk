/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.ocr.v20181119.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class TextTable  extends AbstractModel{

    /**
    * 单元格左上角的列索引
    */
    @SerializedName("ColTl")
    @Expose
    private Integer ColTl;

    /**
    * 单元格左上角的行索引
    */
    @SerializedName("RowTl")
    @Expose
    private Integer RowTl;

    /**
    * 单元格右下角的列索引
    */
    @SerializedName("ColBr")
    @Expose
    private Integer ColBr;

    /**
    * 单元格右下角的行索引
    */
    @SerializedName("RowBr")
    @Expose
    private Integer RowBr;

    /**
    * 单元格文字
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 单元格类型，包含body（表格主体）、header（表头）、footer（表尾）三种
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 置信度 0 ~100
    */
    @SerializedName("Confidence")
    @Expose
    private Integer Confidence;

    /**
    * 文本行坐标，以四个顶点坐标表示
    */
    @SerializedName("Polygon")
    @Expose
    private Coord [] Polygon;

    /**
    * 此字段为扩展字段
    */
    @SerializedName("AdvancedInfo")
    @Expose
    private String AdvancedInfo;

    /**
     * 获取单元格左上角的列索引
     * @return ColTl 单元格左上角的列索引
     */
    public Integer getColTl() {
        return this.ColTl;
    }

    /**
     * 设置单元格左上角的列索引
     * @param ColTl 单元格左上角的列索引
     */
    public void setColTl(Integer ColTl) {
        this.ColTl = ColTl;
    }

    /**
     * 获取单元格左上角的行索引
     * @return RowTl 单元格左上角的行索引
     */
    public Integer getRowTl() {
        return this.RowTl;
    }

    /**
     * 设置单元格左上角的行索引
     * @param RowTl 单元格左上角的行索引
     */
    public void setRowTl(Integer RowTl) {
        this.RowTl = RowTl;
    }

    /**
     * 获取单元格右下角的列索引
     * @return ColBr 单元格右下角的列索引
     */
    public Integer getColBr() {
        return this.ColBr;
    }

    /**
     * 设置单元格右下角的列索引
     * @param ColBr 单元格右下角的列索引
     */
    public void setColBr(Integer ColBr) {
        this.ColBr = ColBr;
    }

    /**
     * 获取单元格右下角的行索引
     * @return RowBr 单元格右下角的行索引
     */
    public Integer getRowBr() {
        return this.RowBr;
    }

    /**
     * 设置单元格右下角的行索引
     * @param RowBr 单元格右下角的行索引
     */
    public void setRowBr(Integer RowBr) {
        this.RowBr = RowBr;
    }

    /**
     * 获取单元格文字
     * @return Text 单元格文字
     */
    public String getText() {
        return this.Text;
    }

    /**
     * 设置单元格文字
     * @param Text 单元格文字
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * 获取单元格类型，包含body（表格主体）、header（表头）、footer（表尾）三种
     * @return Type 单元格类型，包含body（表格主体）、header（表头）、footer（表尾）三种
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置单元格类型，包含body（表格主体）、header（表头）、footer（表尾）三种
     * @param Type 单元格类型，包含body（表格主体）、header（表头）、footer（表尾）三种
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取置信度 0 ~100
     * @return Confidence 置信度 0 ~100
     */
    public Integer getConfidence() {
        return this.Confidence;
    }

    /**
     * 设置置信度 0 ~100
     * @param Confidence 置信度 0 ~100
     */
    public void setConfidence(Integer Confidence) {
        this.Confidence = Confidence;
    }

    /**
     * 获取文本行坐标，以四个顶点坐标表示
     * @return Polygon 文本行坐标，以四个顶点坐标表示
     */
    public Coord [] getPolygon() {
        return this.Polygon;
    }

    /**
     * 设置文本行坐标，以四个顶点坐标表示
     * @param Polygon 文本行坐标，以四个顶点坐标表示
     */
    public void setPolygon(Coord [] Polygon) {
        this.Polygon = Polygon;
    }

    /**
     * 获取此字段为扩展字段
     * @return AdvancedInfo 此字段为扩展字段
     */
    public String getAdvancedInfo() {
        return this.AdvancedInfo;
    }

    /**
     * 设置此字段为扩展字段
     * @param AdvancedInfo 此字段为扩展字段
     */
    public void setAdvancedInfo(String AdvancedInfo) {
        this.AdvancedInfo = AdvancedInfo;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ColTl", this.ColTl);
        this.setParamSimple(map, prefix + "RowTl", this.RowTl);
        this.setParamSimple(map, prefix + "ColBr", this.ColBr);
        this.setParamSimple(map, prefix + "RowBr", this.RowBr);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Confidence", this.Confidence);
        this.setParamArrayObj(map, prefix + "Polygon.", this.Polygon);
        this.setParamSimple(map, prefix + "AdvancedInfo", this.AdvancedInfo);

    }
}

