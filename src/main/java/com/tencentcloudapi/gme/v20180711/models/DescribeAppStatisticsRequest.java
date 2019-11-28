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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAppStatisticsRequest  extends AbstractModel{

    /**
    * GME应用id
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 数据开始时间，东八区时间，格式: 年-月-日，如: 2018-07-13
    */
    @SerializedName("StartDate")
    @Expose
    private String StartDate;

    /**
    * 数据结束时间，东八区时间，格式: 年-月-日，如: 2018-07-13
    */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;

    /**
    * 要查询的服务列表，取值：RealTimeSpeech/VoiceMessage/VoiceFilter
    */
    @SerializedName("Services")
    @Expose
    private String [] Services;

    /**
     * 获取GME应用id
     * @return BizId GME应用id
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * 设置GME应用id
     * @param BizId GME应用id
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * 获取数据开始时间，东八区时间，格式: 年-月-日，如: 2018-07-13
     * @return StartDate 数据开始时间，东八区时间，格式: 年-月-日，如: 2018-07-13
     */
    public String getStartDate() {
        return this.StartDate;
    }

    /**
     * 设置数据开始时间，东八区时间，格式: 年-月-日，如: 2018-07-13
     * @param StartDate 数据开始时间，东八区时间，格式: 年-月-日，如: 2018-07-13
     */
    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }

    /**
     * 获取数据结束时间，东八区时间，格式: 年-月-日，如: 2018-07-13
     * @return EndDate 数据结束时间，东八区时间，格式: 年-月-日，如: 2018-07-13
     */
    public String getEndDate() {
        return this.EndDate;
    }

    /**
     * 设置数据结束时间，东八区时间，格式: 年-月-日，如: 2018-07-13
     * @param EndDate 数据结束时间，东八区时间，格式: 年-月-日，如: 2018-07-13
     */
    public void setEndDate(String EndDate) {
        this.EndDate = EndDate;
    }

    /**
     * 获取要查询的服务列表，取值：RealTimeSpeech/VoiceMessage/VoiceFilter
     * @return Services 要查询的服务列表，取值：RealTimeSpeech/VoiceMessage/VoiceFilter
     */
    public String [] getServices() {
        return this.Services;
    }

    /**
     * 设置要查询的服务列表，取值：RealTimeSpeech/VoiceMessage/VoiceFilter
     * @param Services 要查询的服务列表，取值：RealTimeSpeech/VoiceMessage/VoiceFilter
     */
    public void setServices(String [] Services) {
        this.Services = Services;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "StartDate", this.StartDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamArraySimple(map, prefix + "Services.", this.Services);

    }
}

