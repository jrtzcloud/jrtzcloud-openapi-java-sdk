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
package com.tencentcloudapi.gaap.v20180529.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProxyGroupStatisticsRequest  extends AbstractModel{

    /**
    * 通道组ID
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 起始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 统计指标名称列表，支持: 入带宽:InBandwidth, 出带宽:OutBandwidth, 并发:Concurrent, 入包量:InPackets, 出包量:OutPackets
    */
    @SerializedName("MetricNames")
    @Expose
    private String [] MetricNames;

    /**
    * 监控粒度，目前支持60，300，3600，86400，单位：秒。
当时间范围不超过1天，支持最小粒度60秒；
当时间范围不超过7天，支持最小粒度3600秒；
当时间范围不超过30天，支持最小粒度86400秒。
    */
    @SerializedName("Granularity")
    @Expose
    private Long Granularity;

    /**
     * 获取通道组ID
     * @return GroupId 通道组ID
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * 设置通道组ID
     * @param GroupId 通道组ID
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * 获取起始时间
     * @return StartTime 起始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置起始时间
     * @param StartTime 起始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取结束时间
     * @return EndTime 结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置结束时间
     * @param EndTime 结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取统计指标名称列表，支持: 入带宽:InBandwidth, 出带宽:OutBandwidth, 并发:Concurrent, 入包量:InPackets, 出包量:OutPackets
     * @return MetricNames 统计指标名称列表，支持: 入带宽:InBandwidth, 出带宽:OutBandwidth, 并发:Concurrent, 入包量:InPackets, 出包量:OutPackets
     */
    public String [] getMetricNames() {
        return this.MetricNames;
    }

    /**
     * 设置统计指标名称列表，支持: 入带宽:InBandwidth, 出带宽:OutBandwidth, 并发:Concurrent, 入包量:InPackets, 出包量:OutPackets
     * @param MetricNames 统计指标名称列表，支持: 入带宽:InBandwidth, 出带宽:OutBandwidth, 并发:Concurrent, 入包量:InPackets, 出包量:OutPackets
     */
    public void setMetricNames(String [] MetricNames) {
        this.MetricNames = MetricNames;
    }

    /**
     * 获取监控粒度，目前支持60，300，3600，86400，单位：秒。
当时间范围不超过1天，支持最小粒度60秒；
当时间范围不超过7天，支持最小粒度3600秒；
当时间范围不超过30天，支持最小粒度86400秒。
     * @return Granularity 监控粒度，目前支持60，300，3600，86400，单位：秒。
当时间范围不超过1天，支持最小粒度60秒；
当时间范围不超过7天，支持最小粒度3600秒；
当时间范围不超过30天，支持最小粒度86400秒。
     */
    public Long getGranularity() {
        return this.Granularity;
    }

    /**
     * 设置监控粒度，目前支持60，300，3600，86400，单位：秒。
当时间范围不超过1天，支持最小粒度60秒；
当时间范围不超过7天，支持最小粒度3600秒；
当时间范围不超过30天，支持最小粒度86400秒。
     * @param Granularity 监控粒度，目前支持60，300，3600，86400，单位：秒。
当时间范围不超过1天，支持最小粒度60秒；
当时间范围不超过7天，支持最小粒度3600秒；
当时间范围不超过30天，支持最小粒度86400秒。
     */
    public void setGranularity(Long Granularity) {
        this.Granularity = Granularity;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamArraySimple(map, prefix + "MetricNames.", this.MetricNames);
        this.setParamSimple(map, prefix + "Granularity", this.Granularity);

    }
}

