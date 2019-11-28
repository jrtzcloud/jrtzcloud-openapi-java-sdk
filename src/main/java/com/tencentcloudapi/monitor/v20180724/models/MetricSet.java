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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MetricSet  extends AbstractModel{

    /**
    * 命名空间，每个云产品会有一个命名空间
    */
    @SerializedName("Namespace")
    @Expose
    private String Namespace;

    /**
    * 指标名称
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 指标使用的单位
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 指标使用的单位
    */
    @SerializedName("UnitCname")
    @Expose
    private String UnitCname;

    /**
    * 指标支持的统计周期，单位是秒，如60、300
    */
    @SerializedName("Period")
    @Expose
    private Integer [] Period;

    /**
    * 统计周期内指标方式
    */
    @SerializedName("Periods")
    @Expose
    private PeriodsSt [] Periods;

    /**
    * 统计指标含义解释
    */
    @SerializedName("Meaning")
    @Expose
    private MetricObjectMeaning Meaning;

    /**
    * 维度描述信息
    */
    @SerializedName("Dimensions")
    @Expose
    private DimensionsDesc [] Dimensions;

    /**
     * 获取命名空间，每个云产品会有一个命名空间
     * @return Namespace 命名空间，每个云产品会有一个命名空间
     */
    public String getNamespace() {
        return this.Namespace;
    }

    /**
     * 设置命名空间，每个云产品会有一个命名空间
     * @param Namespace 命名空间，每个云产品会有一个命名空间
     */
    public void setNamespace(String Namespace) {
        this.Namespace = Namespace;
    }

    /**
     * 获取指标名称
     * @return MetricName 指标名称
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * 设置指标名称
     * @param MetricName 指标名称
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * 获取指标使用的单位
     * @return Unit 指标使用的单位
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * 设置指标使用的单位
     * @param Unit 指标使用的单位
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * 获取指标使用的单位
     * @return UnitCname 指标使用的单位
     */
    public String getUnitCname() {
        return this.UnitCname;
    }

    /**
     * 设置指标使用的单位
     * @param UnitCname 指标使用的单位
     */
    public void setUnitCname(String UnitCname) {
        this.UnitCname = UnitCname;
    }

    /**
     * 获取指标支持的统计周期，单位是秒，如60、300
     * @return Period 指标支持的统计周期，单位是秒，如60、300
     */
    public Integer [] getPeriod() {
        return this.Period;
    }

    /**
     * 设置指标支持的统计周期，单位是秒，如60、300
     * @param Period 指标支持的统计周期，单位是秒，如60、300
     */
    public void setPeriod(Integer [] Period) {
        this.Period = Period;
    }

    /**
     * 获取统计周期内指标方式
     * @return Periods 统计周期内指标方式
     */
    public PeriodsSt [] getPeriods() {
        return this.Periods;
    }

    /**
     * 设置统计周期内指标方式
     * @param Periods 统计周期内指标方式
     */
    public void setPeriods(PeriodsSt [] Periods) {
        this.Periods = Periods;
    }

    /**
     * 获取统计指标含义解释
     * @return Meaning 统计指标含义解释
     */
    public MetricObjectMeaning getMeaning() {
        return this.Meaning;
    }

    /**
     * 设置统计指标含义解释
     * @param Meaning 统计指标含义解释
     */
    public void setMeaning(MetricObjectMeaning Meaning) {
        this.Meaning = Meaning;
    }

    /**
     * 获取维度描述信息
     * @return Dimensions 维度描述信息
     */
    public DimensionsDesc [] getDimensions() {
        return this.Dimensions;
    }

    /**
     * 设置维度描述信息
     * @param Dimensions 维度描述信息
     */
    public void setDimensions(DimensionsDesc [] Dimensions) {
        this.Dimensions = Dimensions;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Namespace", this.Namespace);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "UnitCname", this.UnitCname);
        this.setParamArraySimple(map, prefix + "Period.", this.Period);
        this.setParamArrayObj(map, prefix + "Periods.", this.Periods);
        this.setParamObj(map, prefix + "Meaning.", this.Meaning);
        this.setParamArrayObj(map, prefix + "Dimensions.", this.Dimensions);

    }
}

