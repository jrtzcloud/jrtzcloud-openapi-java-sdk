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

public class L7RuleEntry  extends AbstractModel{

    /**
    * 转发协议，取值[http, https]
    */
    @SerializedName("Protocol")
    @Expose
    private String Protocol;

    /**
    * 转发域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 回源方式，取值[1(域名回源)，2(IP回源)]
    */
    @SerializedName("SourceType")
    @Expose
    private Long SourceType;

    /**
    * 会话保持时间，单位秒
    */
    @SerializedName("KeepTime")
    @Expose
    private Long KeepTime;

    /**
    * 回源列表
    */
    @SerializedName("SourceList")
    @Expose
    private L4RuleSource [] SourceList;

    /**
    * 负载均衡方式，取值[1(加权轮询)]
    */
    @SerializedName("LbType")
    @Expose
    private Long LbType;

    /**
    * 会话保持开关，取值[0(会话保持关闭)，1(会话保持开启)]
    */
    @SerializedName("KeepEnable")
    @Expose
    private Long KeepEnable;

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 证书来源，当为协议为https协议时必须填，取值[2(腾讯云托管证书)]，当协议为http时也可以填0
    */
    @SerializedName("CertType")
    @Expose
    private Long CertType;

    /**
    * 当证书来源为腾讯云托管证书时，此字段必须填写托管证书ID
    */
    @SerializedName("SSLId")
    @Expose
    private String SSLId;

    /**
    * 当证书来源为自有证书时，此字段必须填写证书内容；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
    */
    @SerializedName("Cert")
    @Expose
    private String Cert;

    /**
    * 当证书来源为自有证书时，此字段必须填写证书秘钥；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
    */
    @SerializedName("PrivateKey")
    @Expose
    private String PrivateKey;

    /**
    * 规则描述
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 规则状态，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
    */
    @SerializedName("Status")
    @Expose
    private Long Status;

    /**
    * cc防护状态，取值[0(关闭), 1(开启)]
    */
    @SerializedName("CCStatus")
    @Expose
    private Long CCStatus;

    /**
    * https的CC防护状态，取值[0(关闭), 1(开启)]
    */
    @SerializedName("CCEnable")
    @Expose
    private Long CCEnable;

    /**
    * https的CC防护阈值
    */
    @SerializedName("CCThreshold")
    @Expose
    private Long CCThreshold;

    /**
    * https的CC防护等级
    */
    @SerializedName("CCLevel")
    @Expose
    private String CCLevel;

    /**
     * 获取转发协议，取值[http, https]
     * @return Protocol 转发协议，取值[http, https]
     */
    public String getProtocol() {
        return this.Protocol;
    }

    /**
     * 设置转发协议，取值[http, https]
     * @param Protocol 转发协议，取值[http, https]
     */
    public void setProtocol(String Protocol) {
        this.Protocol = Protocol;
    }

    /**
     * 获取转发域名
     * @return Domain 转发域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置转发域名
     * @param Domain 转发域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取回源方式，取值[1(域名回源)，2(IP回源)]
     * @return SourceType 回源方式，取值[1(域名回源)，2(IP回源)]
     */
    public Long getSourceType() {
        return this.SourceType;
    }

    /**
     * 设置回源方式，取值[1(域名回源)，2(IP回源)]
     * @param SourceType 回源方式，取值[1(域名回源)，2(IP回源)]
     */
    public void setSourceType(Long SourceType) {
        this.SourceType = SourceType;
    }

    /**
     * 获取会话保持时间，单位秒
     * @return KeepTime 会话保持时间，单位秒
     */
    public Long getKeepTime() {
        return this.KeepTime;
    }

    /**
     * 设置会话保持时间，单位秒
     * @param KeepTime 会话保持时间，单位秒
     */
    public void setKeepTime(Long KeepTime) {
        this.KeepTime = KeepTime;
    }

    /**
     * 获取回源列表
     * @return SourceList 回源列表
     */
    public L4RuleSource [] getSourceList() {
        return this.SourceList;
    }

    /**
     * 设置回源列表
     * @param SourceList 回源列表
     */
    public void setSourceList(L4RuleSource [] SourceList) {
        this.SourceList = SourceList;
    }

    /**
     * 获取负载均衡方式，取值[1(加权轮询)]
     * @return LbType 负载均衡方式，取值[1(加权轮询)]
     */
    public Long getLbType() {
        return this.LbType;
    }

    /**
     * 设置负载均衡方式，取值[1(加权轮询)]
     * @param LbType 负载均衡方式，取值[1(加权轮询)]
     */
    public void setLbType(Long LbType) {
        this.LbType = LbType;
    }

    /**
     * 获取会话保持开关，取值[0(会话保持关闭)，1(会话保持开启)]
     * @return KeepEnable 会话保持开关，取值[0(会话保持关闭)，1(会话保持开启)]
     */
    public Long getKeepEnable() {
        return this.KeepEnable;
    }

    /**
     * 设置会话保持开关，取值[0(会话保持关闭)，1(会话保持开启)]
     * @param KeepEnable 会话保持开关，取值[0(会话保持关闭)，1(会话保持开启)]
     */
    public void setKeepEnable(Long KeepEnable) {
        this.KeepEnable = KeepEnable;
    }

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
     * 获取证书来源，当为协议为https协议时必须填，取值[2(腾讯云托管证书)]，当协议为http时也可以填0
     * @return CertType 证书来源，当为协议为https协议时必须填，取值[2(腾讯云托管证书)]，当协议为http时也可以填0
     */
    public Long getCertType() {
        return this.CertType;
    }

    /**
     * 设置证书来源，当为协议为https协议时必须填，取值[2(腾讯云托管证书)]，当协议为http时也可以填0
     * @param CertType 证书来源，当为协议为https协议时必须填，取值[2(腾讯云托管证书)]，当协议为http时也可以填0
     */
    public void setCertType(Long CertType) {
        this.CertType = CertType;
    }

    /**
     * 获取当证书来源为腾讯云托管证书时，此字段必须填写托管证书ID
     * @return SSLId 当证书来源为腾讯云托管证书时，此字段必须填写托管证书ID
     */
    public String getSSLId() {
        return this.SSLId;
    }

    /**
     * 设置当证书来源为腾讯云托管证书时，此字段必须填写托管证书ID
     * @param SSLId 当证书来源为腾讯云托管证书时，此字段必须填写托管证书ID
     */
    public void setSSLId(String SSLId) {
        this.SSLId = SSLId;
    }

    /**
     * 获取当证书来源为自有证书时，此字段必须填写证书内容；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     * @return Cert 当证书来源为自有证书时，此字段必须填写证书内容；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     */
    public String getCert() {
        return this.Cert;
    }

    /**
     * 设置当证书来源为自有证书时，此字段必须填写证书内容；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     * @param Cert 当证书来源为自有证书时，此字段必须填写证书内容；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     */
    public void setCert(String Cert) {
        this.Cert = Cert;
    }

    /**
     * 获取当证书来源为自有证书时，此字段必须填写证书秘钥；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     * @return PrivateKey 当证书来源为自有证书时，此字段必须填写证书秘钥；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     */
    public String getPrivateKey() {
        return this.PrivateKey;
    }

    /**
     * 设置当证书来源为自有证书时，此字段必须填写证书秘钥；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     * @param PrivateKey 当证书来源为自有证书时，此字段必须填写证书秘钥；(因已不再支持自有证书，此字段已弃用，请不用填写此字段)
     */
    public void setPrivateKey(String PrivateKey) {
        this.PrivateKey = PrivateKey;
    }

    /**
     * 获取规则描述
     * @return RuleName 规则描述
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * 设置规则描述
     * @param RuleName 规则描述
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * 获取规则状态，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
     * @return Status 规则状态，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
     */
    public Long getStatus() {
        return this.Status;
    }

    /**
     * 设置规则状态，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
     * @param Status 规则状态，取值[0(规则配置成功)，1(规则配置生效中)，2(规则配置失败)，3(规则删除生效中)，5(规则删除失败)，6(规则等待配置)，7(规则等待删除)，8(规则待配置证书)]
     */
    public void setStatus(Long Status) {
        this.Status = Status;
    }

    /**
     * 获取cc防护状态，取值[0(关闭), 1(开启)]
     * @return CCStatus cc防护状态，取值[0(关闭), 1(开启)]
     */
    public Long getCCStatus() {
        return this.CCStatus;
    }

    /**
     * 设置cc防护状态，取值[0(关闭), 1(开启)]
     * @param CCStatus cc防护状态，取值[0(关闭), 1(开启)]
     */
    public void setCCStatus(Long CCStatus) {
        this.CCStatus = CCStatus;
    }

    /**
     * 获取https的CC防护状态，取值[0(关闭), 1(开启)]
     * @return CCEnable https的CC防护状态，取值[0(关闭), 1(开启)]
     */
    public Long getCCEnable() {
        return this.CCEnable;
    }

    /**
     * 设置https的CC防护状态，取值[0(关闭), 1(开启)]
     * @param CCEnable https的CC防护状态，取值[0(关闭), 1(开启)]
     */
    public void setCCEnable(Long CCEnable) {
        this.CCEnable = CCEnable;
    }

    /**
     * 获取https的CC防护阈值
     * @return CCThreshold https的CC防护阈值
     */
    public Long getCCThreshold() {
        return this.CCThreshold;
    }

    /**
     * 设置https的CC防护阈值
     * @param CCThreshold https的CC防护阈值
     */
    public void setCCThreshold(Long CCThreshold) {
        this.CCThreshold = CCThreshold;
    }

    /**
     * 获取https的CC防护等级
     * @return CCLevel https的CC防护等级
     */
    public String getCCLevel() {
        return this.CCLevel;
    }

    /**
     * 设置https的CC防护等级
     * @param CCLevel https的CC防护等级
     */
    public void setCCLevel(String CCLevel) {
        this.CCLevel = CCLevel;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Protocol", this.Protocol);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "SourceType", this.SourceType);
        this.setParamSimple(map, prefix + "KeepTime", this.KeepTime);
        this.setParamArrayObj(map, prefix + "SourceList.", this.SourceList);
        this.setParamSimple(map, prefix + "LbType", this.LbType);
        this.setParamSimple(map, prefix + "KeepEnable", this.KeepEnable);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "CertType", this.CertType);
        this.setParamSimple(map, prefix + "SSLId", this.SSLId);
        this.setParamSimple(map, prefix + "Cert", this.Cert);
        this.setParamSimple(map, prefix + "PrivateKey", this.PrivateKey);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "CCStatus", this.CCStatus);
        this.setParamSimple(map, prefix + "CCEnable", this.CCEnable);
        this.setParamSimple(map, prefix + "CCThreshold", this.CCThreshold);
        this.setParamSimple(map, prefix + "CCLevel", this.CCLevel);

    }
}

