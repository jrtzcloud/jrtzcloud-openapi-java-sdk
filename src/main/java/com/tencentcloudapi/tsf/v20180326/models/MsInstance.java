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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MsInstance  extends AbstractModel{

    /**
    * 机器实例ID信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 机器实例名称信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 服务运行的端口号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Port")
    @Expose
    private String Port;

    /**
    * 机器实例内网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LanIp")
    @Expose
    private String LanIp;

    /**
    * 机器实例外网IP
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WanIp")
    @Expose
    private String WanIp;

    /**
    * 机器可用状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceAvailableStatus")
    @Expose
    private String InstanceAvailableStatus;

    /**
    * 服务运行状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceInstanceStatus")
    @Expose
    private String ServiceInstanceStatus;

    /**
    * 应用ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 应用名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationName")
    @Expose
    private String ApplicationName;

    /**
    * 集群ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 集群名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceId")
    @Expose
    private String NamespaceId;

    /**
    * 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NamespaceName")
    @Expose
    private String NamespaceName;

    /**
    * 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupId")
    @Expose
    private String GroupId;

    /**
    * 部署组名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 机器TSF可用状态
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceStatus")
    @Expose
    private String InstanceStatus;

    /**
    * 健康检查URL
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("HealthCheckUrl")
    @Expose
    private String HealthCheckUrl;

    /**
    * 集群类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClusterType")
    @Expose
    private String ClusterType;

    /**
    * 应用程序包版本
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationPackageVersion")
    @Expose
    private String ApplicationPackageVersion;

    /**
    * 应用类型
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationType")
    @Expose
    private String ApplicationType;

    /**
     * 获取机器实例ID信息
注意：此字段可能返回 null，表示取不到有效值。
     * @return InstanceId 机器实例ID信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置机器实例ID信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceId 机器实例ID信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取机器实例名称信息
注意：此字段可能返回 null，表示取不到有效值。
     * @return InstanceName 机器实例名称信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置机器实例名称信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceName 机器实例名称信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取服务运行的端口号
注意：此字段可能返回 null，表示取不到有效值。
     * @return Port 服务运行的端口号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPort() {
        return this.Port;
    }

    /**
     * 设置服务运行的端口号
注意：此字段可能返回 null，表示取不到有效值。
     * @param Port 服务运行的端口号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPort(String Port) {
        this.Port = Port;
    }

    /**
     * 获取机器实例内网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @return LanIp 机器实例内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLanIp() {
        return this.LanIp;
    }

    /**
     * 设置机器实例内网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param LanIp 机器实例内网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLanIp(String LanIp) {
        this.LanIp = LanIp;
    }

    /**
     * 获取机器实例外网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @return WanIp 机器实例外网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getWanIp() {
        return this.WanIp;
    }

    /**
     * 设置机器实例外网IP
注意：此字段可能返回 null，表示取不到有效值。
     * @param WanIp 机器实例外网IP
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWanIp(String WanIp) {
        this.WanIp = WanIp;
    }

    /**
     * 获取机器可用状态
注意：此字段可能返回 null，表示取不到有效值。
     * @return InstanceAvailableStatus 机器可用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceAvailableStatus() {
        return this.InstanceAvailableStatus;
    }

    /**
     * 设置机器可用状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceAvailableStatus 机器可用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceAvailableStatus(String InstanceAvailableStatus) {
        this.InstanceAvailableStatus = InstanceAvailableStatus;
    }

    /**
     * 获取服务运行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @return ServiceInstanceStatus 服务运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getServiceInstanceStatus() {
        return this.ServiceInstanceStatus;
    }

    /**
     * 设置服务运行状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceInstanceStatus 服务运行状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceInstanceStatus(String ServiceInstanceStatus) {
        this.ServiceInstanceStatus = ServiceInstanceStatus;
    }

    /**
     * 获取应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return ApplicationId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * 设置应用ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 应用ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * 获取应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationName() {
        return this.ApplicationName;
    }

    /**
     * 设置应用名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationName 应用名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationName(String ApplicationName) {
        this.ApplicationName = ApplicationName;
    }

    /**
     * 获取集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * 设置集群ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterId 集群ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * 获取集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * 设置集群名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterName 集群名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * 获取命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return NamespaceId 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceId() {
        return this.NamespaceId;
    }

    /**
     * 设置命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceId 命名空间ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceId(String NamespaceId) {
        this.NamespaceId = NamespaceId;
    }

    /**
     * 获取命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return NamespaceName 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getNamespaceName() {
        return this.NamespaceName;
    }

    /**
     * 设置命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param NamespaceName 命名空间名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNamespaceName(String NamespaceName) {
        this.NamespaceName = NamespaceName;
    }

    /**
     * 获取部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return GroupId 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupId() {
        return this.GroupId;
    }

    /**
     * 设置部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupId 部署组ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupId(String GroupId) {
        this.GroupId = GroupId;
    }

    /**
     * 获取部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return GroupName 部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * 设置部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GroupName 部署组名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * 获取机器TSF可用状态
注意：此字段可能返回 null，表示取不到有效值。
     * @return InstanceStatus 机器TSF可用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getInstanceStatus() {
        return this.InstanceStatus;
    }

    /**
     * 设置机器TSF可用状态
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceStatus 机器TSF可用状态
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceStatus(String InstanceStatus) {
        this.InstanceStatus = InstanceStatus;
    }

    /**
     * 获取健康检查URL
注意：此字段可能返回 null，表示取不到有效值。
     * @return HealthCheckUrl 健康检查URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHealthCheckUrl() {
        return this.HealthCheckUrl;
    }

    /**
     * 设置健康检查URL
注意：此字段可能返回 null，表示取不到有效值。
     * @param HealthCheckUrl 健康检查URL
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHealthCheckUrl(String HealthCheckUrl) {
        this.HealthCheckUrl = HealthCheckUrl;
    }

    /**
     * 获取集群类型
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClusterType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClusterType() {
        return this.ClusterType;
    }

    /**
     * 设置集群类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClusterType 集群类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClusterType(String ClusterType) {
        this.ClusterType = ClusterType;
    }

    /**
     * 获取应用程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     * @return ApplicationPackageVersion 应用程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationPackageVersion() {
        return this.ApplicationPackageVersion;
    }

    /**
     * 设置应用程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationPackageVersion 应用程序包版本
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationPackageVersion(String ApplicationPackageVersion) {
        this.ApplicationPackageVersion = ApplicationPackageVersion;
    }

    /**
     * 获取应用类型
注意：此字段可能返回 null，表示取不到有效值。
     * @return ApplicationType 应用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationType() {
        return this.ApplicationType;
    }

    /**
     * 设置应用类型
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationType 应用类型
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationType(String ApplicationType) {
        this.ApplicationType = ApplicationType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "LanIp", this.LanIp);
        this.setParamSimple(map, prefix + "WanIp", this.WanIp);
        this.setParamSimple(map, prefix + "InstanceAvailableStatus", this.InstanceAvailableStatus);
        this.setParamSimple(map, prefix + "ServiceInstanceStatus", this.ServiceInstanceStatus);
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "ApplicationName", this.ApplicationName);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "NamespaceId", this.NamespaceId);
        this.setParamSimple(map, prefix + "NamespaceName", this.NamespaceName);
        this.setParamSimple(map, prefix + "GroupId", this.GroupId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "InstanceStatus", this.InstanceStatus);
        this.setParamSimple(map, prefix + "HealthCheckUrl", this.HealthCheckUrl);
        this.setParamSimple(map, prefix + "ClusterType", this.ClusterType);
        this.setParamSimple(map, prefix + "ApplicationPackageVersion", this.ApplicationPackageVersion);
        this.setParamSimple(map, prefix + "ApplicationType", this.ApplicationType);

    }
}

