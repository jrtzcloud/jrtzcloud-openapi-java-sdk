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
package com.tencentcloudapi.as.v20180419.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LaunchConfiguration  extends AbstractModel{

    /**
    * 实例所属项目ID。
    */
    @SerializedName("ProjectId")
    @Expose
    private Integer ProjectId;

    /**
    * 启动配置ID。
    */
    @SerializedName("LaunchConfigurationId")
    @Expose
    private String LaunchConfigurationId;

    /**
    * 启动配置名称。
    */
    @SerializedName("LaunchConfigurationName")
    @Expose
    private String LaunchConfigurationName;

    /**
    * 实例机型。
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 实例系统盘配置信息。
    */
    @SerializedName("SystemDisk")
    @Expose
    private SystemDisk SystemDisk;

    /**
    * 实例数据盘配置信息。
    */
    @SerializedName("DataDisks")
    @Expose
    private DataDisk [] DataDisks;

    /**
    * 实例登录设置。
    */
    @SerializedName("LoginSettings")
    @Expose
    private LimitedLoginSettings LoginSettings;

    /**
    * 公网带宽相关信息设置。
    */
    @SerializedName("InternetAccessible")
    @Expose
    private InternetAccessible InternetAccessible;

    /**
    * 实例所属安全组。
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
    * 启动配置关联的伸缩组。
    */
    @SerializedName("AutoScalingGroupAbstractSet")
    @Expose
    private AutoScalingGroupAbstract [] AutoScalingGroupAbstractSet;

    /**
    * 自定义数据。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UserData")
    @Expose
    private String UserData;

    /**
    * 启动配置创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
    * 实例的增强服务启用情况与其设置。
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * 镜像ID。
    */
    @SerializedName("ImageId")
    @Expose
    private String ImageId;

    /**
    * 启动配置当前状态。取值范围：<br><li>NORMAL：正常<br><li>IMAGE_ABNORMAL：启动配置镜像异常<br><li>CBS_SNAP_ABNORMAL：启动配置数据盘快照异常<br><li>SECURITY_GROUP_ABNORMAL：启动配置安全组异常<br>
    */
    @SerializedName("LaunchConfigurationStatus")
    @Expose
    private String LaunchConfigurationStatus;

    /**
    * 实例计费类型，CVM默认值按照POSTPAID_BY_HOUR处理。
<br><li>POSTPAID_BY_HOUR：按小时后付费
<br><li>SPOTPAID：竞价付费
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
    * 实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("InstanceMarketOptions")
    @Expose
    private InstanceMarketOptionsRequest InstanceMarketOptions;

    /**
    * 实例机型列表。
    */
    @SerializedName("InstanceTypes")
    @Expose
    private String [] InstanceTypes;

    /**
    * 标签列表。
    */
    @SerializedName("InstanceTags")
    @Expose
    private InstanceTag [] InstanceTags;

    /**
    * 版本号。
    */
    @SerializedName("VersionNumber")
    @Expose
    private Integer VersionNumber;

    /**
    * 更新时间。
    */
    @SerializedName("UpdatedTime")
    @Expose
    private String UpdatedTime;

    /**
    * CAM角色名称。可通过DescribeRoleList接口返回值中的roleName获取。
    */
    @SerializedName("CamRoleName")
    @Expose
    private String CamRoleName;

    /**
    * 上次操作时，InstanceTypesCheckPolicy 取值。
    */
    @SerializedName("LastOperationInstanceTypesCheckPolicy")
    @Expose
    private String LastOperationInstanceTypesCheckPolicy;

    /**
    * 云服务器主机名（HostName）的相关设置。
    */
    @SerializedName("HostNameSettings")
    @Expose
    private HostNameSettings HostNameSettings;

    /**
     * 获取实例所属项目ID。
     * @return ProjectId 实例所属项目ID。
     */
    public Integer getProjectId() {
        return this.ProjectId;
    }

    /**
     * 设置实例所属项目ID。
     * @param ProjectId 实例所属项目ID。
     */
    public void setProjectId(Integer ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * 获取启动配置ID。
     * @return LaunchConfigurationId 启动配置ID。
     */
    public String getLaunchConfigurationId() {
        return this.LaunchConfigurationId;
    }

    /**
     * 设置启动配置ID。
     * @param LaunchConfigurationId 启动配置ID。
     */
    public void setLaunchConfigurationId(String LaunchConfigurationId) {
        this.LaunchConfigurationId = LaunchConfigurationId;
    }

    /**
     * 获取启动配置名称。
     * @return LaunchConfigurationName 启动配置名称。
     */
    public String getLaunchConfigurationName() {
        return this.LaunchConfigurationName;
    }

    /**
     * 设置启动配置名称。
     * @param LaunchConfigurationName 启动配置名称。
     */
    public void setLaunchConfigurationName(String LaunchConfigurationName) {
        this.LaunchConfigurationName = LaunchConfigurationName;
    }

    /**
     * 获取实例机型。
     * @return InstanceType 实例机型。
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * 设置实例机型。
     * @param InstanceType 实例机型。
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * 获取实例系统盘配置信息。
     * @return SystemDisk 实例系统盘配置信息。
     */
    public SystemDisk getSystemDisk() {
        return this.SystemDisk;
    }

    /**
     * 设置实例系统盘配置信息。
     * @param SystemDisk 实例系统盘配置信息。
     */
    public void setSystemDisk(SystemDisk SystemDisk) {
        this.SystemDisk = SystemDisk;
    }

    /**
     * 获取实例数据盘配置信息。
     * @return DataDisks 实例数据盘配置信息。
     */
    public DataDisk [] getDataDisks() {
        return this.DataDisks;
    }

    /**
     * 设置实例数据盘配置信息。
     * @param DataDisks 实例数据盘配置信息。
     */
    public void setDataDisks(DataDisk [] DataDisks) {
        this.DataDisks = DataDisks;
    }

    /**
     * 获取实例登录设置。
     * @return LoginSettings 实例登录设置。
     */
    public LimitedLoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * 设置实例登录设置。
     * @param LoginSettings 实例登录设置。
     */
    public void setLoginSettings(LimitedLoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * 获取公网带宽相关信息设置。
     * @return InternetAccessible 公网带宽相关信息设置。
     */
    public InternetAccessible getInternetAccessible() {
        return this.InternetAccessible;
    }

    /**
     * 设置公网带宽相关信息设置。
     * @param InternetAccessible 公网带宽相关信息设置。
     */
    public void setInternetAccessible(InternetAccessible InternetAccessible) {
        this.InternetAccessible = InternetAccessible;
    }

    /**
     * 获取实例所属安全组。
     * @return SecurityGroupIds 实例所属安全组。
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * 设置实例所属安全组。
     * @param SecurityGroupIds 实例所属安全组。
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * 获取启动配置关联的伸缩组。
     * @return AutoScalingGroupAbstractSet 启动配置关联的伸缩组。
     */
    public AutoScalingGroupAbstract [] getAutoScalingGroupAbstractSet() {
        return this.AutoScalingGroupAbstractSet;
    }

    /**
     * 设置启动配置关联的伸缩组。
     * @param AutoScalingGroupAbstractSet 启动配置关联的伸缩组。
     */
    public void setAutoScalingGroupAbstractSet(AutoScalingGroupAbstract [] AutoScalingGroupAbstractSet) {
        this.AutoScalingGroupAbstractSet = AutoScalingGroupAbstractSet;
    }

    /**
     * 获取自定义数据。
注意：此字段可能返回 null，表示取不到有效值。
     * @return UserData 自定义数据。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUserData() {
        return this.UserData;
    }

    /**
     * 设置自定义数据。
注意：此字段可能返回 null，表示取不到有效值。
     * @param UserData 自定义数据。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUserData(String UserData) {
        this.UserData = UserData;
    }

    /**
     * 获取启动配置创建时间。
     * @return CreatedTime 启动配置创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * 设置启动配置创建时间。
     * @param CreatedTime 启动配置创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * 获取实例的增强服务启用情况与其设置。
     * @return EnhancedService 实例的增强服务启用情况与其设置。
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * 设置实例的增强服务启用情况与其设置。
     * @param EnhancedService 实例的增强服务启用情况与其设置。
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * 获取镜像ID。
     * @return ImageId 镜像ID。
     */
    public String getImageId() {
        return this.ImageId;
    }

    /**
     * 设置镜像ID。
     * @param ImageId 镜像ID。
     */
    public void setImageId(String ImageId) {
        this.ImageId = ImageId;
    }

    /**
     * 获取启动配置当前状态。取值范围：<br><li>NORMAL：正常<br><li>IMAGE_ABNORMAL：启动配置镜像异常<br><li>CBS_SNAP_ABNORMAL：启动配置数据盘快照异常<br><li>SECURITY_GROUP_ABNORMAL：启动配置安全组异常<br>
     * @return LaunchConfigurationStatus 启动配置当前状态。取值范围：<br><li>NORMAL：正常<br><li>IMAGE_ABNORMAL：启动配置镜像异常<br><li>CBS_SNAP_ABNORMAL：启动配置数据盘快照异常<br><li>SECURITY_GROUP_ABNORMAL：启动配置安全组异常<br>
     */
    public String getLaunchConfigurationStatus() {
        return this.LaunchConfigurationStatus;
    }

    /**
     * 设置启动配置当前状态。取值范围：<br><li>NORMAL：正常<br><li>IMAGE_ABNORMAL：启动配置镜像异常<br><li>CBS_SNAP_ABNORMAL：启动配置数据盘快照异常<br><li>SECURITY_GROUP_ABNORMAL：启动配置安全组异常<br>
     * @param LaunchConfigurationStatus 启动配置当前状态。取值范围：<br><li>NORMAL：正常<br><li>IMAGE_ABNORMAL：启动配置镜像异常<br><li>CBS_SNAP_ABNORMAL：启动配置数据盘快照异常<br><li>SECURITY_GROUP_ABNORMAL：启动配置安全组异常<br>
     */
    public void setLaunchConfigurationStatus(String LaunchConfigurationStatus) {
        this.LaunchConfigurationStatus = LaunchConfigurationStatus;
    }

    /**
     * 获取实例计费类型，CVM默认值按照POSTPAID_BY_HOUR处理。
<br><li>POSTPAID_BY_HOUR：按小时后付费
<br><li>SPOTPAID：竞价付费
     * @return InstanceChargeType 实例计费类型，CVM默认值按照POSTPAID_BY_HOUR处理。
<br><li>POSTPAID_BY_HOUR：按小时后付费
<br><li>SPOTPAID：竞价付费
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * 设置实例计费类型，CVM默认值按照POSTPAID_BY_HOUR处理。
<br><li>POSTPAID_BY_HOUR：按小时后付费
<br><li>SPOTPAID：竞价付费
     * @param InstanceChargeType 实例计费类型，CVM默认值按照POSTPAID_BY_HOUR处理。
<br><li>POSTPAID_BY_HOUR：按小时后付费
<br><li>SPOTPAID：竞价付费
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * 获取实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。
注意：此字段可能返回 null，表示取不到有效值。
     * @return InstanceMarketOptions 实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public InstanceMarketOptionsRequest getInstanceMarketOptions() {
        return this.InstanceMarketOptions;
    }

    /**
     * 设置实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。
注意：此字段可能返回 null，表示取不到有效值。
     * @param InstanceMarketOptions 实例的市场相关选项，如竞价实例相关参数，若指定实例的付费模式为竞价付费则该参数必传。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setInstanceMarketOptions(InstanceMarketOptionsRequest InstanceMarketOptions) {
        this.InstanceMarketOptions = InstanceMarketOptions;
    }

    /**
     * 获取实例机型列表。
     * @return InstanceTypes 实例机型列表。
     */
    public String [] getInstanceTypes() {
        return this.InstanceTypes;
    }

    /**
     * 设置实例机型列表。
     * @param InstanceTypes 实例机型列表。
     */
    public void setInstanceTypes(String [] InstanceTypes) {
        this.InstanceTypes = InstanceTypes;
    }

    /**
     * 获取标签列表。
     * @return InstanceTags 标签列表。
     */
    public InstanceTag [] getInstanceTags() {
        return this.InstanceTags;
    }

    /**
     * 设置标签列表。
     * @param InstanceTags 标签列表。
     */
    public void setInstanceTags(InstanceTag [] InstanceTags) {
        this.InstanceTags = InstanceTags;
    }

    /**
     * 获取版本号。
     * @return VersionNumber 版本号。
     */
    public Integer getVersionNumber() {
        return this.VersionNumber;
    }

    /**
     * 设置版本号。
     * @param VersionNumber 版本号。
     */
    public void setVersionNumber(Integer VersionNumber) {
        this.VersionNumber = VersionNumber;
    }

    /**
     * 获取更新时间。
     * @return UpdatedTime 更新时间。
     */
    public String getUpdatedTime() {
        return this.UpdatedTime;
    }

    /**
     * 设置更新时间。
     * @param UpdatedTime 更新时间。
     */
    public void setUpdatedTime(String UpdatedTime) {
        this.UpdatedTime = UpdatedTime;
    }

    /**
     * 获取CAM角色名称。可通过DescribeRoleList接口返回值中的roleName获取。
     * @return CamRoleName CAM角色名称。可通过DescribeRoleList接口返回值中的roleName获取。
     */
    public String getCamRoleName() {
        return this.CamRoleName;
    }

    /**
     * 设置CAM角色名称。可通过DescribeRoleList接口返回值中的roleName获取。
     * @param CamRoleName CAM角色名称。可通过DescribeRoleList接口返回值中的roleName获取。
     */
    public void setCamRoleName(String CamRoleName) {
        this.CamRoleName = CamRoleName;
    }

    /**
     * 获取上次操作时，InstanceTypesCheckPolicy 取值。
     * @return LastOperationInstanceTypesCheckPolicy 上次操作时，InstanceTypesCheckPolicy 取值。
     */
    public String getLastOperationInstanceTypesCheckPolicy() {
        return this.LastOperationInstanceTypesCheckPolicy;
    }

    /**
     * 设置上次操作时，InstanceTypesCheckPolicy 取值。
     * @param LastOperationInstanceTypesCheckPolicy 上次操作时，InstanceTypesCheckPolicy 取值。
     */
    public void setLastOperationInstanceTypesCheckPolicy(String LastOperationInstanceTypesCheckPolicy) {
        this.LastOperationInstanceTypesCheckPolicy = LastOperationInstanceTypesCheckPolicy;
    }

    /**
     * 获取云服务器主机名（HostName）的相关设置。
     * @return HostNameSettings 云服务器主机名（HostName）的相关设置。
     */
    public HostNameSettings getHostNameSettings() {
        return this.HostNameSettings;
    }

    /**
     * 设置云服务器主机名（HostName）的相关设置。
     * @param HostNameSettings 云服务器主机名（HostName）的相关设置。
     */
    public void setHostNameSettings(HostNameSettings HostNameSettings) {
        this.HostNameSettings = HostNameSettings;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "LaunchConfigurationId", this.LaunchConfigurationId);
        this.setParamSimple(map, prefix + "LaunchConfigurationName", this.LaunchConfigurationName);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamObj(map, prefix + "SystemDisk.", this.SystemDisk);
        this.setParamArrayObj(map, prefix + "DataDisks.", this.DataDisks);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamObj(map, prefix + "InternetAccessible.", this.InternetAccessible);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);
        this.setParamArrayObj(map, prefix + "AutoScalingGroupAbstractSet.", this.AutoScalingGroupAbstractSet);
        this.setParamSimple(map, prefix + "UserData", this.UserData);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamSimple(map, prefix + "ImageId", this.ImageId);
        this.setParamSimple(map, prefix + "LaunchConfigurationStatus", this.LaunchConfigurationStatus);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);
        this.setParamObj(map, prefix + "InstanceMarketOptions.", this.InstanceMarketOptions);
        this.setParamArraySimple(map, prefix + "InstanceTypes.", this.InstanceTypes);
        this.setParamArrayObj(map, prefix + "InstanceTags.", this.InstanceTags);
        this.setParamSimple(map, prefix + "VersionNumber", this.VersionNumber);
        this.setParamSimple(map, prefix + "UpdatedTime", this.UpdatedTime);
        this.setParamSimple(map, prefix + "CamRoleName", this.CamRoleName);
        this.setParamSimple(map, prefix + "LastOperationInstanceTypesCheckPolicy", this.LastOperationInstanceTypesCheckPolicy);
        this.setParamObj(map, prefix + "HostNameSettings.", this.HostNameSettings);

    }
}

