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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTransmitStatisRequest  extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版；shield表示棋牌盾）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源实例ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 指标名，取值：
traffic表示流量带宽；
pkg表示包速率；
    */
    @SerializedName("MetricName")
    @Expose
    private String MetricName;

    /**
    * 统计时间粒度（300表示5分钟；3600表示小时；86400表示天）
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 统计开始时间，秒部分保持为0，分钟部分为5的倍数
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 统计结束时间，秒部分保持为0，分钟部分为5的倍数
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 资源的IP；当不填写时，默认统计资源实例的所有IP；资源实例有多个IP（比如高防IP专业版）时，统计方式是求和；
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
     * 获取大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版；shield表示棋牌盾）
     * @return Business 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版；shield表示棋牌盾）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * 设置大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版；shield表示棋牌盾）
     * @param Business 大禹子产品代号（bgpip表示高防IP；net表示高防IP专业版；shield表示棋牌盾）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * 获取资源实例ID
     * @return Id 资源实例ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * 设置资源实例ID
     * @param Id 资源实例ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 获取指标名，取值：
traffic表示流量带宽；
pkg表示包速率；
     * @return MetricName 指标名，取值：
traffic表示流量带宽；
pkg表示包速率；
     */
    public String getMetricName() {
        return this.MetricName;
    }

    /**
     * 设置指标名，取值：
traffic表示流量带宽；
pkg表示包速率；
     * @param MetricName 指标名，取值：
traffic表示流量带宽；
pkg表示包速率；
     */
    public void setMetricName(String MetricName) {
        this.MetricName = MetricName;
    }

    /**
     * 获取统计时间粒度（300表示5分钟；3600表示小时；86400表示天）
     * @return Period 统计时间粒度（300表示5分钟；3600表示小时；86400表示天）
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * 设置统计时间粒度（300表示5分钟；3600表示小时；86400表示天）
     * @param Period 统计时间粒度（300表示5分钟；3600表示小时；86400表示天）
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * 获取统计开始时间，秒部分保持为0，分钟部分为5的倍数
     * @return StartTime 统计开始时间，秒部分保持为0，分钟部分为5的倍数
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置统计开始时间，秒部分保持为0，分钟部分为5的倍数
     * @param StartTime 统计开始时间，秒部分保持为0，分钟部分为5的倍数
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取统计结束时间，秒部分保持为0，分钟部分为5的倍数
     * @return EndTime 统计结束时间，秒部分保持为0，分钟部分为5的倍数
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置统计结束时间，秒部分保持为0，分钟部分为5的倍数
     * @param EndTime 统计结束时间，秒部分保持为0，分钟部分为5的倍数
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取资源的IP；当不填写时，默认统计资源实例的所有IP；资源实例有多个IP（比如高防IP专业版）时，统计方式是求和；
     * @return IpList 资源的IP；当不填写时，默认统计资源实例的所有IP；资源实例有多个IP（比如高防IP专业版）时，统计方式是求和；
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * 设置资源的IP；当不填写时，默认统计资源实例的所有IP；资源实例有多个IP（比如高防IP专业版）时，统计方式是求和；
     * @param IpList 资源的IP；当不填写时，默认统计资源实例的所有IP；资源实例有多个IP（比如高防IP专业版）时，统计方式是求和；
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MetricName", this.MetricName);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);

    }
}

