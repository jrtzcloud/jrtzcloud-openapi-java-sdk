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

public class RuleInfo  extends AbstractModel{

    /**
    * 规则信息
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 监听器信息
    */
    @SerializedName("ListenerId")
    @Expose
    private String ListenerId;

    /**
    * 规则域名
    */
    @SerializedName("Domain")
    @Expose
    private String Domain;

    /**
    * 规则路径
    */
    @SerializedName("Path")
    @Expose
    private String Path;

    /**
    * 源站类型
    */
    @SerializedName("RealServerType")
    @Expose
    private String RealServerType;

    /**
    * 转发源站策略
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
    * 是否开启健康检查标志，1开启，0关闭
    */
    @SerializedName("HealthCheck")
    @Expose
    private Long HealthCheck;

    /**
    * 规则状态，0运行中，1创建中，2销毁中，3绑定解绑源站中，4配置更新中
    */
    @SerializedName("RuleStatus")
    @Expose
    private Long RuleStatus;

    /**
    * 健康检查相关参数
    */
    @SerializedName("CheckParams")
    @Expose
    private RuleCheckParams CheckParams;

    /**
    * 已绑定的源站相关信息
    */
    @SerializedName("RealServerSet")
    @Expose
    private BindRealServer [] RealServerSet;

    /**
    * 源站的服务状态，0：异常，1：正常。
未开启健康检查时，该状态始终未正常。
只要有一个源站健康状态为异常时，该状态为异常，具体源站的状态请查看RealServerSet。
    */
    @SerializedName("BindStatus")
    @Expose
    private Long BindStatus;

    /**
    * 通道转发到源站的请求所携带的host，其中default表示直接转发接收到的host。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ForwardHost")
    @Expose
    private String ForwardHost;

    /**
     * 获取规则信息
     * @return RuleId 规则信息
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * 设置规则信息
     * @param RuleId 规则信息
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * 获取监听器信息
     * @return ListenerId 监听器信息
     */
    public String getListenerId() {
        return this.ListenerId;
    }

    /**
     * 设置监听器信息
     * @param ListenerId 监听器信息
     */
    public void setListenerId(String ListenerId) {
        this.ListenerId = ListenerId;
    }

    /**
     * 获取规则域名
     * @return Domain 规则域名
     */
    public String getDomain() {
        return this.Domain;
    }

    /**
     * 设置规则域名
     * @param Domain 规则域名
     */
    public void setDomain(String Domain) {
        this.Domain = Domain;
    }

    /**
     * 获取规则路径
     * @return Path 规则路径
     */
    public String getPath() {
        return this.Path;
    }

    /**
     * 设置规则路径
     * @param Path 规则路径
     */
    public void setPath(String Path) {
        this.Path = Path;
    }

    /**
     * 获取源站类型
     * @return RealServerType 源站类型
     */
    public String getRealServerType() {
        return this.RealServerType;
    }

    /**
     * 设置源站类型
     * @param RealServerType 源站类型
     */
    public void setRealServerType(String RealServerType) {
        this.RealServerType = RealServerType;
    }

    /**
     * 获取转发源站策略
     * @return Scheduler 转发源站策略
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * 设置转发源站策略
     * @param Scheduler 转发源站策略
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    /**
     * 获取是否开启健康检查标志，1开启，0关闭
     * @return HealthCheck 是否开启健康检查标志，1开启，0关闭
     */
    public Long getHealthCheck() {
        return this.HealthCheck;
    }

    /**
     * 设置是否开启健康检查标志，1开启，0关闭
     * @param HealthCheck 是否开启健康检查标志，1开启，0关闭
     */
    public void setHealthCheck(Long HealthCheck) {
        this.HealthCheck = HealthCheck;
    }

    /**
     * 获取规则状态，0运行中，1创建中，2销毁中，3绑定解绑源站中，4配置更新中
     * @return RuleStatus 规则状态，0运行中，1创建中，2销毁中，3绑定解绑源站中，4配置更新中
     */
    public Long getRuleStatus() {
        return this.RuleStatus;
    }

    /**
     * 设置规则状态，0运行中，1创建中，2销毁中，3绑定解绑源站中，4配置更新中
     * @param RuleStatus 规则状态，0运行中，1创建中，2销毁中，3绑定解绑源站中，4配置更新中
     */
    public void setRuleStatus(Long RuleStatus) {
        this.RuleStatus = RuleStatus;
    }

    /**
     * 获取健康检查相关参数
     * @return CheckParams 健康检查相关参数
     */
    public RuleCheckParams getCheckParams() {
        return this.CheckParams;
    }

    /**
     * 设置健康检查相关参数
     * @param CheckParams 健康检查相关参数
     */
    public void setCheckParams(RuleCheckParams CheckParams) {
        this.CheckParams = CheckParams;
    }

    /**
     * 获取已绑定的源站相关信息
     * @return RealServerSet 已绑定的源站相关信息
     */
    public BindRealServer [] getRealServerSet() {
        return this.RealServerSet;
    }

    /**
     * 设置已绑定的源站相关信息
     * @param RealServerSet 已绑定的源站相关信息
     */
    public void setRealServerSet(BindRealServer [] RealServerSet) {
        this.RealServerSet = RealServerSet;
    }

    /**
     * 获取源站的服务状态，0：异常，1：正常。
未开启健康检查时，该状态始终未正常。
只要有一个源站健康状态为异常时，该状态为异常，具体源站的状态请查看RealServerSet。
     * @return BindStatus 源站的服务状态，0：异常，1：正常。
未开启健康检查时，该状态始终未正常。
只要有一个源站健康状态为异常时，该状态为异常，具体源站的状态请查看RealServerSet。
     */
    public Long getBindStatus() {
        return this.BindStatus;
    }

    /**
     * 设置源站的服务状态，0：异常，1：正常。
未开启健康检查时，该状态始终未正常。
只要有一个源站健康状态为异常时，该状态为异常，具体源站的状态请查看RealServerSet。
     * @param BindStatus 源站的服务状态，0：异常，1：正常。
未开启健康检查时，该状态始终未正常。
只要有一个源站健康状态为异常时，该状态为异常，具体源站的状态请查看RealServerSet。
     */
    public void setBindStatus(Long BindStatus) {
        this.BindStatus = BindStatus;
    }

    /**
     * 获取通道转发到源站的请求所携带的host，其中default表示直接转发接收到的host。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ForwardHost 通道转发到源站的请求所携带的host，其中default表示直接转发接收到的host。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getForwardHost() {
        return this.ForwardHost;
    }

    /**
     * 设置通道转发到源站的请求所携带的host，其中default表示直接转发接收到的host。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ForwardHost 通道转发到源站的请求所携带的host，其中default表示直接转发接收到的host。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setForwardHost(String ForwardHost) {
        this.ForwardHost = ForwardHost;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "ListenerId", this.ListenerId);
        this.setParamSimple(map, prefix + "Domain", this.Domain);
        this.setParamSimple(map, prefix + "Path", this.Path);
        this.setParamSimple(map, prefix + "RealServerType", this.RealServerType);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);
        this.setParamSimple(map, prefix + "HealthCheck", this.HealthCheck);
        this.setParamSimple(map, prefix + "RuleStatus", this.RuleStatus);
        this.setParamObj(map, prefix + "CheckParams.", this.CheckParams);
        this.setParamArrayObj(map, prefix + "RealServerSet.", this.RealServerSet);
        this.setParamSimple(map, prefix + "BindStatus", this.BindStatus);
        this.setParamSimple(map, prefix + "ForwardHost", this.ForwardHost);

    }
}

