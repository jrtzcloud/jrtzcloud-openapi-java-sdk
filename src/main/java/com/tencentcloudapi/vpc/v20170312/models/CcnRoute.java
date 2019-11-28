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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CcnRoute  extends AbstractModel{

    /**
    * 路由策略ID
    */
    @SerializedName("RouteId")
    @Expose
    private String RouteId;

    /**
    * 目的端
    */
    @SerializedName("DestinationCidrBlock")
    @Expose
    private String DestinationCidrBlock;

    /**
    * 下一跳类型（关联实例类型），所有类型：VPC、DIRECTCONNECT
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 下一跳（关联实例）
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 下一跳名称（关联实例名称）
    */
    @SerializedName("InstanceName")
    @Expose
    private String InstanceName;

    /**
    * 下一跳所属地域（关联实例所属地域）
    */
    @SerializedName("InstanceRegion")
    @Expose
    private String InstanceRegion;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 路由是否启用
    */
    @SerializedName("Enabled")
    @Expose
    private Boolean Enabled;

    /**
    * 关联实例所属UIN（根账号）
    */
    @SerializedName("InstanceUin")
    @Expose
    private String InstanceUin;

    /**
     * 获取路由策略ID
     * @return RouteId 路由策略ID
     */
    public String getRouteId() {
        return this.RouteId;
    }

    /**
     * 设置路由策略ID
     * @param RouteId 路由策略ID
     */
    public void setRouteId(String RouteId) {
        this.RouteId = RouteId;
    }

    /**
     * 获取目的端
     * @return DestinationCidrBlock 目的端
     */
    public String getDestinationCidrBlock() {
        return this.DestinationCidrBlock;
    }

    /**
     * 设置目的端
     * @param DestinationCidrBlock 目的端
     */
    public void setDestinationCidrBlock(String DestinationCidrBlock) {
        this.DestinationCidrBlock = DestinationCidrBlock;
    }

    /**
     * 获取下一跳类型（关联实例类型），所有类型：VPC、DIRECTCONNECT
     * @return InstanceType 下一跳类型（关联实例类型），所有类型：VPC、DIRECTCONNECT
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * 设置下一跳类型（关联实例类型），所有类型：VPC、DIRECTCONNECT
     * @param InstanceType 下一跳类型（关联实例类型），所有类型：VPC、DIRECTCONNECT
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * 获取下一跳（关联实例）
     * @return InstanceId 下一跳（关联实例）
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置下一跳（关联实例）
     * @param InstanceId 下一跳（关联实例）
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取下一跳名称（关联实例名称）
     * @return InstanceName 下一跳名称（关联实例名称）
     */
    public String getInstanceName() {
        return this.InstanceName;
    }

    /**
     * 设置下一跳名称（关联实例名称）
     * @param InstanceName 下一跳名称（关联实例名称）
     */
    public void setInstanceName(String InstanceName) {
        this.InstanceName = InstanceName;
    }

    /**
     * 获取下一跳所属地域（关联实例所属地域）
     * @return InstanceRegion 下一跳所属地域（关联实例所属地域）
     */
    public String getInstanceRegion() {
        return this.InstanceRegion;
    }

    /**
     * 设置下一跳所属地域（关联实例所属地域）
     * @param InstanceRegion 下一跳所属地域（关联实例所属地域）
     */
    public void setInstanceRegion(String InstanceRegion) {
        this.InstanceRegion = InstanceRegion;
    }

    /**
     * 获取更新时间
     * @return UpdateTime 更新时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置更新时间
     * @param UpdateTime 更新时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 获取路由是否启用
     * @return Enabled 路由是否启用
     */
    public Boolean getEnabled() {
        return this.Enabled;
    }

    /**
     * 设置路由是否启用
     * @param Enabled 路由是否启用
     */
    public void setEnabled(Boolean Enabled) {
        this.Enabled = Enabled;
    }

    /**
     * 获取关联实例所属UIN（根账号）
     * @return InstanceUin 关联实例所属UIN（根账号）
     */
    public String getInstanceUin() {
        return this.InstanceUin;
    }

    /**
     * 设置关联实例所属UIN（根账号）
     * @param InstanceUin 关联实例所属UIN（根账号）
     */
    public void setInstanceUin(String InstanceUin) {
        this.InstanceUin = InstanceUin;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RouteId", this.RouteId);
        this.setParamSimple(map, prefix + "DestinationCidrBlock", this.DestinationCidrBlock);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "InstanceName", this.InstanceName);
        this.setParamSimple(map, prefix + "InstanceRegion", this.InstanceRegion);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Enabled", this.Enabled);
        this.setParamSimple(map, prefix + "InstanceUin", this.InstanceUin);

    }
}

