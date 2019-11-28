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

public class DDoSPolicyPacketFilter  extends AbstractModel{

    /**
    * 协议，取值范围[tcp,udp,icmp,all]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 开始源端口，取值范围[0,65535]
    */
    @SerializedName("SportStart")
    @Expose
    private Long SportStart;

    /**
    * 结束源端口，取值范围[0,65535]
    */
    @SerializedName("SportEnd")
    @Expose
    private Long SportEnd;

    /**
    * 开始目的端口，取值范围[0,65535]
    */
    @SerializedName("DportStart")
    @Expose
    private Long DportStart;

    /**
    * 结束目的端口，取值范围[0,65535]
    */
    @SerializedName("DportEnd")
    @Expose
    private Long DportEnd;

    /**
    * 最小包长，取值范围[0,1500]
    */
    @SerializedName("PktlenMin")
    @Expose
    private Long PktlenMin;

    /**
    * 最大包长，取值范围[0,1500]
    */
    @SerializedName("PktlenMax")
    @Expose
    private Long PktlenMax;

    /**
    * 是否检测载荷，取值范围[begin_l5(表示检测), no_match(表示不检测)]
    */
    @SerializedName("MatchBegin")
    @Expose
    private String MatchBegin;

    /**
    * 是否是正则表达式，取值范围[sunday(表示关键字),pcre(表示正则表达式)]
    */
    @SerializedName("MatchType")
    @Expose
    private String MatchType;

    /**
    * 关键字或正则表达式
    */
    @SerializedName("Str")
    @Expose
    private String Str;

    /**
    * 检测深度，取值范围[0,1500]
    */
    @SerializedName("Depth")
    @Expose
    private Long Depth;

    /**
    * 检测偏移量，取值范围[0,1500]
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 是否包括，取值范围[0(表示不包含),1(表示包含)]
    */
    @SerializedName("IsNot")
    @Expose
    private Long IsNot;

    /**
    * 策略动作，取值范围[drop，drop_black，drop_rst，drop_black_rst，transmit]
    */
    @SerializedName("Action")
    @Expose
    private String Action;

    /**
     * 获取协议，取值范围[tcp,udp,icmp,all]
     * @return Protocol 协议，取值范围[tcp,udp,icmp,all]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * 设置协议，取值范围[tcp,udp,icmp,all]
     * @param Protocol 协议，取值范围[tcp,udp,icmp,all]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * 获取开始源端口，取值范围[0,65535]
     * @return SportStart 开始源端口，取值范围[0,65535]
     */
    public Long getSportStart() {
        return this.SportStart;
    }

    /**
     * 设置开始源端口，取值范围[0,65535]
     * @param SportStart 开始源端口，取值范围[0,65535]
     */
    public void setSportStart(Long SportStart) {
        this.SportStart = SportStart;
    }

    /**
     * 获取结束源端口，取值范围[0,65535]
     * @return SportEnd 结束源端口，取值范围[0,65535]
     */
    public Long getSportEnd() {
        return this.SportEnd;
    }

    /**
     * 设置结束源端口，取值范围[0,65535]
     * @param SportEnd 结束源端口，取值范围[0,65535]
     */
    public void setSportEnd(Long SportEnd) {
        this.SportEnd = SportEnd;
    }

    /**
     * 获取开始目的端口，取值范围[0,65535]
     * @return DportStart 开始目的端口，取值范围[0,65535]
     */
    public Long getDportStart() {
        return this.DportStart;
    }

    /**
     * 设置开始目的端口，取值范围[0,65535]
     * @param DportStart 开始目的端口，取值范围[0,65535]
     */
    public void setDportStart(Long DportStart) {
        this.DportStart = DportStart;
    }

    /**
     * 获取结束目的端口，取值范围[0,65535]
     * @return DportEnd 结束目的端口，取值范围[0,65535]
     */
    public Long getDportEnd() {
        return this.DportEnd;
    }

    /**
     * 设置结束目的端口，取值范围[0,65535]
     * @param DportEnd 结束目的端口，取值范围[0,65535]
     */
    public void setDportEnd(Long DportEnd) {
        this.DportEnd = DportEnd;
    }

    /**
     * 获取最小包长，取值范围[0,1500]
     * @return PktlenMin 最小包长，取值范围[0,1500]
     */
    public Long getPktlenMin() {
        return this.PktlenMin;
    }

    /**
     * 设置最小包长，取值范围[0,1500]
     * @param PktlenMin 最小包长，取值范围[0,1500]
     */
    public void setPktlenMin(Long PktlenMin) {
        this.PktlenMin = PktlenMin;
    }

    /**
     * 获取最大包长，取值范围[0,1500]
     * @return PktlenMax 最大包长，取值范围[0,1500]
     */
    public Long getPktlenMax() {
        return this.PktlenMax;
    }

    /**
     * 设置最大包长，取值范围[0,1500]
     * @param PktlenMax 最大包长，取值范围[0,1500]
     */
    public void setPktlenMax(Long PktlenMax) {
        this.PktlenMax = PktlenMax;
    }

    /**
     * 获取是否检测载荷，取值范围[begin_l5(表示检测), no_match(表示不检测)]
     * @return MatchBegin 是否检测载荷，取值范围[begin_l5(表示检测), no_match(表示不检测)]
     */
    public String getMatchBegin() {
        return this.MatchBegin;
    }

    /**
     * 设置是否检测载荷，取值范围[begin_l5(表示检测), no_match(表示不检测)]
     * @param MatchBegin 是否检测载荷，取值范围[begin_l5(表示检测), no_match(表示不检测)]
     */
    public void setMatchBegin(String MatchBegin) {
        this.MatchBegin = MatchBegin;
    }

    /**
     * 获取是否是正则表达式，取值范围[sunday(表示关键字),pcre(表示正则表达式)]
     * @return MatchType 是否是正则表达式，取值范围[sunday(表示关键字),pcre(表示正则表达式)]
     */
    public String getMatchType() {
        return this.MatchType;
    }

    /**
     * 设置是否是正则表达式，取值范围[sunday(表示关键字),pcre(表示正则表达式)]
     * @param MatchType 是否是正则表达式，取值范围[sunday(表示关键字),pcre(表示正则表达式)]
     */
    public void setMatchType(String MatchType) {
        this.MatchType = MatchType;
    }

    /**
     * 获取关键字或正则表达式
     * @return Str 关键字或正则表达式
     */
    public String getStr() {
        return this.Str;
    }

    /**
     * 设置关键字或正则表达式
     * @param Str 关键字或正则表达式
     */
    public void setStr(String Str) {
        this.Str = Str;
    }

    /**
     * 获取检测深度，取值范围[0,1500]
     * @return Depth 检测深度，取值范围[0,1500]
     */
    public Long getDepth() {
        return this.Depth;
    }

    /**
     * 设置检测深度，取值范围[0,1500]
     * @param Depth 检测深度，取值范围[0,1500]
     */
    public void setDepth(Long Depth) {
        this.Depth = Depth;
    }

    /**
     * 获取检测偏移量，取值范围[0,1500]
     * @return Offset 检测偏移量，取值范围[0,1500]
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * 设置检测偏移量，取值范围[0,1500]
     * @param Offset 检测偏移量，取值范围[0,1500]
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取是否包括，取值范围[0(表示不包含),1(表示包含)]
     * @return IsNot 是否包括，取值范围[0(表示不包含),1(表示包含)]
     */
    public Long getIsNot() {
        return this.IsNot;
    }

    /**
     * 设置是否包括，取值范围[0(表示不包含),1(表示包含)]
     * @param IsNot 是否包括，取值范围[0(表示不包含),1(表示包含)]
     */
    public void setIsNot(Long IsNot) {
        this.IsNot = IsNot;
    }

    /**
     * 获取策略动作，取值范围[drop，drop_black，drop_rst，drop_black_rst，transmit]
     * @return Action 策略动作，取值范围[drop，drop_black，drop_rst，drop_black_rst，transmit]
     */
    public String getAction() {
        return this.Action;
    }

    /**
     * 设置策略动作，取值范围[drop，drop_black，drop_rst，drop_black_rst，transmit]
     * @param Action 策略动作，取值范围[drop，drop_black，drop_rst，drop_black_rst，transmit]
     */
    public void setAction(String Action) {
        this.Action = Action;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "SportStart", this.SportStart);
        this.setParamSimple(map, prefix + "SportEnd", this.SportEnd);
        this.setParamSimple(map, prefix + "DportStart", this.DportStart);
        this.setParamSimple(map, prefix + "DportEnd", this.DportEnd);
        this.setParamSimple(map, prefix + "PktlenMin", this.PktlenMin);
        this.setParamSimple(map, prefix + "PktlenMax", this.PktlenMax);
        this.setParamSimple(map, prefix + "MatchBegin", this.MatchBegin);
        this.setParamSimple(map, prefix + "MatchType", this.MatchType);
        this.setParamSimple(map, prefix + "Str", this.Str);
        this.setParamSimple(map, prefix + "Depth", this.Depth);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "IsNot", this.IsNot);
        this.setParamSimple(map, prefix + "Action", this.Action);

    }
}

