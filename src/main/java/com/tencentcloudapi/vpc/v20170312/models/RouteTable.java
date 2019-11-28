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

public class RouteTable  extends AbstractModel{

    /**
    * VPC实例ID。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 路由表实例ID，例如：rtb-azd4dt1c。
    */
    @SerializedName("RouteTableId")
    @Expose
    private String RouteTableId;

    /**
    * 路由表名称。
    */
    @SerializedName("RouteTableName")
    @Expose
    private String RouteTableName;

    /**
    * 路由表关联关系。
    */
    @SerializedName("AssociationSet")
    @Expose
    private RouteTableAssociation [] AssociationSet;

    /**
    * 路由表策略集合。
    */
    @SerializedName("RouteSet")
    @Expose
    private Route [] RouteSet;

    /**
    * 是否默认路由表。
    */
    @SerializedName("Main")
    @Expose
    private Boolean Main;

    /**
    * 创建时间。
    */
    @SerializedName("CreatedTime")
    @Expose
    private String CreatedTime;

    /**
     * 获取VPC实例ID。
     * @return VpcId VPC实例ID。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置VPC实例ID。
     * @param VpcId VPC实例ID。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取路由表实例ID，例如：rtb-azd4dt1c。
     * @return RouteTableId 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public String getRouteTableId() {
        return this.RouteTableId;
    }

    /**
     * 设置路由表实例ID，例如：rtb-azd4dt1c。
     * @param RouteTableId 路由表实例ID，例如：rtb-azd4dt1c。
     */
    public void setRouteTableId(String RouteTableId) {
        this.RouteTableId = RouteTableId;
    }

    /**
     * 获取路由表名称。
     * @return RouteTableName 路由表名称。
     */
    public String getRouteTableName() {
        return this.RouteTableName;
    }

    /**
     * 设置路由表名称。
     * @param RouteTableName 路由表名称。
     */
    public void setRouteTableName(String RouteTableName) {
        this.RouteTableName = RouteTableName;
    }

    /**
     * 获取路由表关联关系。
     * @return AssociationSet 路由表关联关系。
     */
    public RouteTableAssociation [] getAssociationSet() {
        return this.AssociationSet;
    }

    /**
     * 设置路由表关联关系。
     * @param AssociationSet 路由表关联关系。
     */
    public void setAssociationSet(RouteTableAssociation [] AssociationSet) {
        this.AssociationSet = AssociationSet;
    }

    /**
     * 获取路由表策略集合。
     * @return RouteSet 路由表策略集合。
     */
    public Route [] getRouteSet() {
        return this.RouteSet;
    }

    /**
     * 设置路由表策略集合。
     * @param RouteSet 路由表策略集合。
     */
    public void setRouteSet(Route [] RouteSet) {
        this.RouteSet = RouteSet;
    }

    /**
     * 获取是否默认路由表。
     * @return Main 是否默认路由表。
     */
    public Boolean getMain() {
        return this.Main;
    }

    /**
     * 设置是否默认路由表。
     * @param Main 是否默认路由表。
     */
    public void setMain(Boolean Main) {
        this.Main = Main;
    }

    /**
     * 获取创建时间。
     * @return CreatedTime 创建时间。
     */
    public String getCreatedTime() {
        return this.CreatedTime;
    }

    /**
     * 设置创建时间。
     * @param CreatedTime 创建时间。
     */
    public void setCreatedTime(String CreatedTime) {
        this.CreatedTime = CreatedTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "RouteTableId", this.RouteTableId);
        this.setParamSimple(map, prefix + "RouteTableName", this.RouteTableName);
        this.setParamArrayObj(map, prefix + "AssociationSet.", this.AssociationSet);
        this.setParamArrayObj(map, prefix + "RouteSet.", this.RouteSet);
        this.setParamSimple(map, prefix + "Main", this.Main);
        this.setParamSimple(map, prefix + "CreatedTime", this.CreatedTime);

    }
}

