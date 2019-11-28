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

public class CreateSubnetRequest  extends AbstractModel{

    /**
    * 待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网名称，最大长度不能超过60个字节。
    */
    @SerializedName("SubnetName")
    @Expose
    private String SubnetName;

    /**
    * 子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠。
    */
    @SerializedName("CidrBlock")
    @Expose
    private String CidrBlock;

    /**
    * 子网所在的可用区ID，不同子网选择不同可用区可以做跨可用区灾备。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * 获取待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     * @return VpcId 待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     * @param VpcId 待操作的VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取子网名称，最大长度不能超过60个字节。
     * @return SubnetName 子网名称，最大长度不能超过60个字节。
     */
    public String getSubnetName() {
        return this.SubnetName;
    }

    /**
     * 设置子网名称，最大长度不能超过60个字节。
     * @param SubnetName 子网名称，最大长度不能超过60个字节。
     */
    public void setSubnetName(String SubnetName) {
        this.SubnetName = SubnetName;
    }

    /**
     * 获取子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠。
     * @return CidrBlock 子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠。
     */
    public String getCidrBlock() {
        return this.CidrBlock;
    }

    /**
     * 设置子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠。
     * @param CidrBlock 子网网段，子网网段必须在VPC网段内，相同VPC内子网网段不能重叠。
     */
    public void setCidrBlock(String CidrBlock) {
        this.CidrBlock = CidrBlock;
    }

    /**
     * 获取子网所在的可用区ID，不同子网选择不同可用区可以做跨可用区灾备。
     * @return Zone 子网所在的可用区ID，不同子网选择不同可用区可以做跨可用区灾备。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置子网所在的可用区ID，不同子网选择不同可用区可以做跨可用区灾备。
     * @param Zone 子网所在的可用区ID，不同子网选择不同可用区可以做跨可用区灾备。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetName", this.SubnetName);
        this.setParamSimple(map, prefix + "CidrBlock", this.CidrBlock);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

