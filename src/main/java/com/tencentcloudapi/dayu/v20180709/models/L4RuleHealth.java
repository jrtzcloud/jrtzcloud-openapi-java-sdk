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

public class L4RuleHealth  extends AbstractModel{

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * =1表示开启；=0表示关闭
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 响应超时时间，单位秒
    */
    @SerializedName("TimeOut")
    @Expose
    private Long TimeOut;

    /**
    * 检测间隔时间，单位秒
    */
    @SerializedName("Interval")
    @Expose
    private Long Interval;

    /**
    * 不健康阈值，单位次
    */
    @SerializedName("KickNum")
    @Expose
    private Long KickNum;

    /**
    * 健康阈值，单位次
    */
    @SerializedName("AliveNum")
    @Expose
    private Long AliveNum;

    /**
     * 获取规则ID
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * 设置规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * 获取=1表示开启；=0表示关闭
     * @return Enable =1表示开启；=0表示关闭
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * 设置=1表示开启；=0表示关闭
     * @param Enable =1表示开启；=0表示关闭
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * 获取响应超时时间，单位秒
     * @return TimeOut 响应超时时间，单位秒
     */
    public Long getTimeOut() {
        return this.TimeOut;
    }

    /**
     * 设置响应超时时间，单位秒
     * @param TimeOut 响应超时时间，单位秒
     */
    public void setTimeOut(Long TimeOut) {
        this.TimeOut = TimeOut;
    }

    /**
     * 获取检测间隔时间，单位秒
     * @return Interval 检测间隔时间，单位秒
     */
    public Long getInterval() {
        return this.Interval;
    }

    /**
     * 设置检测间隔时间，单位秒
     * @param Interval 检测间隔时间，单位秒
     */
    public void setInterval(Long Interval) {
        this.Interval = Interval;
    }

    /**
     * 获取不健康阈值，单位次
     * @return KickNum 不健康阈值，单位次
     */
    public Long getKickNum() {
        return this.KickNum;
    }

    /**
     * 设置不健康阈值，单位次
     * @param KickNum 不健康阈值，单位次
     */
    public void setKickNum(Long KickNum) {
        this.KickNum = KickNum;
    }

    /**
     * 获取健康阈值，单位次
     * @return AliveNum 健康阈值，单位次
     */
    public Long getAliveNum() {
        return this.AliveNum;
    }

    /**
     * 设置健康阈值，单位次
     * @param AliveNum 健康阈值，单位次
     */
    public void setAliveNum(Long AliveNum) {
        this.AliveNum = AliveNum;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamSimple(map, prefix + "TimeOut", this.TimeOut);
        this.setParamSimple(map, prefix + "Interval", this.Interval);
        this.setParamSimple(map, prefix + "KickNum", this.KickNum);
        this.setParamSimple(map, prefix + "AliveNum", this.AliveNum);

    }
}

