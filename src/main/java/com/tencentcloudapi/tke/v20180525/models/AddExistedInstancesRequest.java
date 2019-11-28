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
package com.tencentcloudapi.tke.v20180525.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddExistedInstancesRequest  extends AbstractModel{

    /**
    * 集群ID
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 实例列表
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 实例额外需要设置参数信息
    */
    @SerializedName("InstanceAdvancedSettings")
    @Expose
    private InstanceAdvancedSettings InstanceAdvancedSettings;

    /**
    * 增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认开启云监控、云安全服务。
    */
    @SerializedName("EnhancedService")
    @Expose
    private EnhancedService EnhancedService;

    /**
    * 节点登录信息（目前仅支持使用Password或者单个KeyIds）
    */
    @SerializedName("LoginSettings")
    @Expose
    private LoginSettings LoginSettings;

    /**
    * 实例所属安全组。该参数可以通过调用 DescribeSecurityGroups 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。（目前仅支持设置单个sgId）
    */
    @SerializedName("SecurityGroupIds")
    @Expose
    private String [] SecurityGroupIds;

    /**
     * 获取集群ID
     * @return ClusterId 集群ID
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * 设置集群ID
     * @param ClusterId 集群ID
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * 获取实例列表
     * @return InstanceIds 实例列表
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置实例列表
     * @param InstanceIds 实例列表
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 获取实例额外需要设置参数信息
     * @return InstanceAdvancedSettings 实例额外需要设置参数信息
     */
    public InstanceAdvancedSettings getInstanceAdvancedSettings() {
        return this.InstanceAdvancedSettings;
    }

    /**
     * 设置实例额外需要设置参数信息
     * @param InstanceAdvancedSettings 实例额外需要设置参数信息
     */
    public void setInstanceAdvancedSettings(InstanceAdvancedSettings InstanceAdvancedSettings) {
        this.InstanceAdvancedSettings = InstanceAdvancedSettings;
    }

    /**
     * 获取增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认开启云监控、云安全服务。
     * @return EnhancedService 增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认开启云监控、云安全服务。
     */
    public EnhancedService getEnhancedService() {
        return this.EnhancedService;
    }

    /**
     * 设置增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认开启云监控、云安全服务。
     * @param EnhancedService 增强服务。通过该参数可以指定是否开启云安全、云监控等服务。若不指定该参数，则默认开启云监控、云安全服务。
     */
    public void setEnhancedService(EnhancedService EnhancedService) {
        this.EnhancedService = EnhancedService;
    }

    /**
     * 获取节点登录信息（目前仅支持使用Password或者单个KeyIds）
     * @return LoginSettings 节点登录信息（目前仅支持使用Password或者单个KeyIds）
     */
    public LoginSettings getLoginSettings() {
        return this.LoginSettings;
    }

    /**
     * 设置节点登录信息（目前仅支持使用Password或者单个KeyIds）
     * @param LoginSettings 节点登录信息（目前仅支持使用Password或者单个KeyIds）
     */
    public void setLoginSettings(LoginSettings LoginSettings) {
        this.LoginSettings = LoginSettings;
    }

    /**
     * 获取实例所属安全组。该参数可以通过调用 DescribeSecurityGroups 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。（目前仅支持设置单个sgId）
     * @return SecurityGroupIds 实例所属安全组。该参数可以通过调用 DescribeSecurityGroups 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。（目前仅支持设置单个sgId）
     */
    public String [] getSecurityGroupIds() {
        return this.SecurityGroupIds;
    }

    /**
     * 设置实例所属安全组。该参数可以通过调用 DescribeSecurityGroups 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。（目前仅支持设置单个sgId）
     * @param SecurityGroupIds 实例所属安全组。该参数可以通过调用 DescribeSecurityGroups 的返回值中的sgId字段来获取。若不指定该参数，则绑定默认安全组。（目前仅支持设置单个sgId）
     */
    public void setSecurityGroupIds(String [] SecurityGroupIds) {
        this.SecurityGroupIds = SecurityGroupIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamObj(map, prefix + "InstanceAdvancedSettings.", this.InstanceAdvancedSettings);
        this.setParamObj(map, prefix + "EnhancedService.", this.EnhancedService);
        this.setParamObj(map, prefix + "LoginSettings.", this.LoginSettings);
        this.setParamArraySimple(map, prefix + "SecurityGroupIds.", this.SecurityGroupIds);

    }
}

