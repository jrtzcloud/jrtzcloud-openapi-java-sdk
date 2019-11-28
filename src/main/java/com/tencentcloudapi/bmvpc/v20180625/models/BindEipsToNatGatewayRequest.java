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
package com.tencentcloudapi.bmvpc.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BindEipsToNatGatewayRequest  extends AbstractModel{

    /**
    * NAT网关ID，例如：nat-kdm476mp
    */
    @SerializedName("NatId")
    @Expose
    private String NatId;

    /**
    * 私有网络ID，例如：vpc-kd7d06of
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 已分配的EIP列表；AssignedEips和AutoAllocEipNum至少输入一个
    */
    @SerializedName("AssignedEips")
    @Expose
    private String [] AssignedEips;

    /**
    * 新建EIP数目，系统将会按您的要求生产该数目个数EIP；AssignedEips和AutoAllocEipNum至少输入一个
    */
    @SerializedName("AutoAllocEipNum")
    @Expose
    private Long AutoAllocEipNum;

    /**
     * 获取NAT网关ID，例如：nat-kdm476mp
     * @return NatId NAT网关ID，例如：nat-kdm476mp
     */
    public String getNatId() {
        return this.NatId;
    }

    /**
     * 设置NAT网关ID，例如：nat-kdm476mp
     * @param NatId NAT网关ID，例如：nat-kdm476mp
     */
    public void setNatId(String NatId) {
        this.NatId = NatId;
    }

    /**
     * 获取私有网络ID，例如：vpc-kd7d06of
     * @return VpcId 私有网络ID，例如：vpc-kd7d06of
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络ID，例如：vpc-kd7d06of
     * @param VpcId 私有网络ID，例如：vpc-kd7d06of
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取已分配的EIP列表；AssignedEips和AutoAllocEipNum至少输入一个
     * @return AssignedEips 已分配的EIP列表；AssignedEips和AutoAllocEipNum至少输入一个
     */
    public String [] getAssignedEips() {
        return this.AssignedEips;
    }

    /**
     * 设置已分配的EIP列表；AssignedEips和AutoAllocEipNum至少输入一个
     * @param AssignedEips 已分配的EIP列表；AssignedEips和AutoAllocEipNum至少输入一个
     */
    public void setAssignedEips(String [] AssignedEips) {
        this.AssignedEips = AssignedEips;
    }

    /**
     * 获取新建EIP数目，系统将会按您的要求生产该数目个数EIP；AssignedEips和AutoAllocEipNum至少输入一个
     * @return AutoAllocEipNum 新建EIP数目，系统将会按您的要求生产该数目个数EIP；AssignedEips和AutoAllocEipNum至少输入一个
     */
    public Long getAutoAllocEipNum() {
        return this.AutoAllocEipNum;
    }

    /**
     * 设置新建EIP数目，系统将会按您的要求生产该数目个数EIP；AssignedEips和AutoAllocEipNum至少输入一个
     * @param AutoAllocEipNum 新建EIP数目，系统将会按您的要求生产该数目个数EIP；AssignedEips和AutoAllocEipNum至少输入一个
     */
    public void setAutoAllocEipNum(Long AutoAllocEipNum) {
        this.AutoAllocEipNum = AutoAllocEipNum;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatId", this.NatId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "AssignedEips.", this.AssignedEips);
        this.setParamSimple(map, prefix + "AutoAllocEipNum", this.AutoAllocEipNum);

    }
}

