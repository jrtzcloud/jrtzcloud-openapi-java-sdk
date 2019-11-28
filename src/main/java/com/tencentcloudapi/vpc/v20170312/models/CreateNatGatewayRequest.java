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

public class CreateNatGatewayRequest  extends AbstractModel{

    /**
    * NAT网关名称
    */
    @SerializedName("NatGatewayName")
    @Expose
    private String NatGatewayName;

    /**
    * VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * NAT网关最大外网出带宽(单位:Mbps)，支持的参数值：`20, 50, 100, 200, 500, 1000, 2000, 5000`，默认: `100Mbps`。
    */
    @SerializedName("InternetMaxBandwidthOut")
    @Expose
    private Integer InternetMaxBandwidthOut;

    /**
    * NAT网关并发连接上限，支持参数值：`1000000、3000000、10000000`，默认值为`100000`。
    */
    @SerializedName("MaxConcurrentConnection")
    @Expose
    private Integer MaxConcurrentConnection;

    /**
    * 需要申请的弹性IP个数，系统会按您的要求生产N个弹性IP，其中AddressCount和PublicAddresses至少传递一个。
    */
    @SerializedName("AddressCount")
    @Expose
    private Integer AddressCount;

    /**
    * 绑定NAT网关的弹性IP数组，其中AddressCount和PublicAddresses至少传递一个。
    */
    @SerializedName("PublicIpAddresses")
    @Expose
    private String [] PublicIpAddresses;

    /**
    * 可用区，形如：`ap-guangzhou-1`。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
     * 获取NAT网关名称
     * @return NatGatewayName NAT网关名称
     */
    public String getNatGatewayName() {
        return this.NatGatewayName;
    }

    /**
     * 设置NAT网关名称
     * @param NatGatewayName NAT网关名称
     */
    public void setNatGatewayName(String NatGatewayName) {
        this.NatGatewayName = NatGatewayName;
    }

    /**
     * 获取VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     * @return VpcId VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     * @param VpcId VPC实例ID。可通过DescribeVpcs接口返回值中的VpcId获取。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取NAT网关最大外网出带宽(单位:Mbps)，支持的参数值：`20, 50, 100, 200, 500, 1000, 2000, 5000`，默认: `100Mbps`。
     * @return InternetMaxBandwidthOut NAT网关最大外网出带宽(单位:Mbps)，支持的参数值：`20, 50, 100, 200, 500, 1000, 2000, 5000`，默认: `100Mbps`。
     */
    public Integer getInternetMaxBandwidthOut() {
        return this.InternetMaxBandwidthOut;
    }

    /**
     * 设置NAT网关最大外网出带宽(单位:Mbps)，支持的参数值：`20, 50, 100, 200, 500, 1000, 2000, 5000`，默认: `100Mbps`。
     * @param InternetMaxBandwidthOut NAT网关最大外网出带宽(单位:Mbps)，支持的参数值：`20, 50, 100, 200, 500, 1000, 2000, 5000`，默认: `100Mbps`。
     */
    public void setInternetMaxBandwidthOut(Integer InternetMaxBandwidthOut) {
        this.InternetMaxBandwidthOut = InternetMaxBandwidthOut;
    }

    /**
     * 获取NAT网关并发连接上限，支持参数值：`1000000、3000000、10000000`，默认值为`100000`。
     * @return MaxConcurrentConnection NAT网关并发连接上限，支持参数值：`1000000、3000000、10000000`，默认值为`100000`。
     */
    public Integer getMaxConcurrentConnection() {
        return this.MaxConcurrentConnection;
    }

    /**
     * 设置NAT网关并发连接上限，支持参数值：`1000000、3000000、10000000`，默认值为`100000`。
     * @param MaxConcurrentConnection NAT网关并发连接上限，支持参数值：`1000000、3000000、10000000`，默认值为`100000`。
     */
    public void setMaxConcurrentConnection(Integer MaxConcurrentConnection) {
        this.MaxConcurrentConnection = MaxConcurrentConnection;
    }

    /**
     * 获取需要申请的弹性IP个数，系统会按您的要求生产N个弹性IP，其中AddressCount和PublicAddresses至少传递一个。
     * @return AddressCount 需要申请的弹性IP个数，系统会按您的要求生产N个弹性IP，其中AddressCount和PublicAddresses至少传递一个。
     */
    public Integer getAddressCount() {
        return this.AddressCount;
    }

    /**
     * 设置需要申请的弹性IP个数，系统会按您的要求生产N个弹性IP，其中AddressCount和PublicAddresses至少传递一个。
     * @param AddressCount 需要申请的弹性IP个数，系统会按您的要求生产N个弹性IP，其中AddressCount和PublicAddresses至少传递一个。
     */
    public void setAddressCount(Integer AddressCount) {
        this.AddressCount = AddressCount;
    }

    /**
     * 获取绑定NAT网关的弹性IP数组，其中AddressCount和PublicAddresses至少传递一个。
     * @return PublicIpAddresses 绑定NAT网关的弹性IP数组，其中AddressCount和PublicAddresses至少传递一个。
     */
    public String [] getPublicIpAddresses() {
        return this.PublicIpAddresses;
    }

    /**
     * 设置绑定NAT网关的弹性IP数组，其中AddressCount和PublicAddresses至少传递一个。
     * @param PublicIpAddresses 绑定NAT网关的弹性IP数组，其中AddressCount和PublicAddresses至少传递一个。
     */
    public void setPublicIpAddresses(String [] PublicIpAddresses) {
        this.PublicIpAddresses = PublicIpAddresses;
    }

    /**
     * 获取可用区，形如：`ap-guangzhou-1`。
     * @return Zone 可用区，形如：`ap-guangzhou-1`。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区，形如：`ap-guangzhou-1`。
     * @param Zone 可用区，形如：`ap-guangzhou-1`。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NatGatewayName", this.NatGatewayName);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "InternetMaxBandwidthOut", this.InternetMaxBandwidthOut);
        this.setParamSimple(map, prefix + "MaxConcurrentConnection", this.MaxConcurrentConnection);
        this.setParamSimple(map, prefix + "AddressCount", this.AddressCount);
        this.setParamArraySimple(map, prefix + "PublicIpAddresses.", this.PublicIpAddresses);
        this.setParamSimple(map, prefix + "Zone", this.Zone);

    }
}

