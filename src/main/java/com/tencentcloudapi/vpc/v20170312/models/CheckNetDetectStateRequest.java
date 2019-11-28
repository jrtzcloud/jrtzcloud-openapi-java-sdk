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

public class CheckNetDetectStateRequest  extends AbstractModel{

    /**
    * 探测目的IPv4地址数组，最多两个。
    */
    @SerializedName("DetectDestinationIp")
    @Expose
    private String [] DetectDestinationIp;

    /**
    * 下一跳类型，目前我们支持的类型有：
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
NAT：NAT网关；
NORMAL_CVM：普通云主机；
    */
    @SerializedName("NextHopType")
    @Expose
    private String NextHopType;

    /**
    * 下一跳目的网关，取值与“下一跳类型”相关：
下一跳类型为VPN，取值VPN网关ID，形如：vpngw-12345678；
下一跳类型为DIRECTCONNECT，取值专线网关ID，形如：dcg-12345678；
下一跳类型为PEERCONNECTION，取值对等连接ID，形如：pcx-12345678；
下一跳类型为NAT，取值Nat网关，形如：nat-12345678；
下一跳类型为NORMAL_CVM，取值云主机IPv4地址，形如：10.0.0.12；
    */
    @SerializedName("NextHopDestination")
    @Expose
    private String NextHopDestination;

    /**
    * 网络探测实例ID。形如：netd-12345678。
    */
    @SerializedName("NetDetectId")
    @Expose
    private String NetDetectId;

    /**
    * `VPC`实例`ID`。形如：`vpc-12345678`
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网实例ID。形如：subnet-12345678。
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 网络探测名称，最大长度不能超过60个字节。
    */
    @SerializedName("NetDetectName")
    @Expose
    private String NetDetectName;

    /**
     * 获取探测目的IPv4地址数组，最多两个。
     * @return DetectDestinationIp 探测目的IPv4地址数组，最多两个。
     */
    public String [] getDetectDestinationIp() {
        return this.DetectDestinationIp;
    }

    /**
     * 设置探测目的IPv4地址数组，最多两个。
     * @param DetectDestinationIp 探测目的IPv4地址数组，最多两个。
     */
    public void setDetectDestinationIp(String [] DetectDestinationIp) {
        this.DetectDestinationIp = DetectDestinationIp;
    }

    /**
     * 获取下一跳类型，目前我们支持的类型有：
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
NAT：NAT网关；
NORMAL_CVM：普通云主机；
     * @return NextHopType 下一跳类型，目前我们支持的类型有：
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
NAT：NAT网关；
NORMAL_CVM：普通云主机；
     */
    public String getNextHopType() {
        return this.NextHopType;
    }

    /**
     * 设置下一跳类型，目前我们支持的类型有：
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
NAT：NAT网关；
NORMAL_CVM：普通云主机；
     * @param NextHopType 下一跳类型，目前我们支持的类型有：
VPN：VPN网关；
DIRECTCONNECT：专线网关；
PEERCONNECTION：对等连接；
NAT：NAT网关；
NORMAL_CVM：普通云主机；
     */
    public void setNextHopType(String NextHopType) {
        this.NextHopType = NextHopType;
    }

    /**
     * 获取下一跳目的网关，取值与“下一跳类型”相关：
下一跳类型为VPN，取值VPN网关ID，形如：vpngw-12345678；
下一跳类型为DIRECTCONNECT，取值专线网关ID，形如：dcg-12345678；
下一跳类型为PEERCONNECTION，取值对等连接ID，形如：pcx-12345678；
下一跳类型为NAT，取值Nat网关，形如：nat-12345678；
下一跳类型为NORMAL_CVM，取值云主机IPv4地址，形如：10.0.0.12；
     * @return NextHopDestination 下一跳目的网关，取值与“下一跳类型”相关：
下一跳类型为VPN，取值VPN网关ID，形如：vpngw-12345678；
下一跳类型为DIRECTCONNECT，取值专线网关ID，形如：dcg-12345678；
下一跳类型为PEERCONNECTION，取值对等连接ID，形如：pcx-12345678；
下一跳类型为NAT，取值Nat网关，形如：nat-12345678；
下一跳类型为NORMAL_CVM，取值云主机IPv4地址，形如：10.0.0.12；
     */
    public String getNextHopDestination() {
        return this.NextHopDestination;
    }

    /**
     * 设置下一跳目的网关，取值与“下一跳类型”相关：
下一跳类型为VPN，取值VPN网关ID，形如：vpngw-12345678；
下一跳类型为DIRECTCONNECT，取值专线网关ID，形如：dcg-12345678；
下一跳类型为PEERCONNECTION，取值对等连接ID，形如：pcx-12345678；
下一跳类型为NAT，取值Nat网关，形如：nat-12345678；
下一跳类型为NORMAL_CVM，取值云主机IPv4地址，形如：10.0.0.12；
     * @param NextHopDestination 下一跳目的网关，取值与“下一跳类型”相关：
下一跳类型为VPN，取值VPN网关ID，形如：vpngw-12345678；
下一跳类型为DIRECTCONNECT，取值专线网关ID，形如：dcg-12345678；
下一跳类型为PEERCONNECTION，取值对等连接ID，形如：pcx-12345678；
下一跳类型为NAT，取值Nat网关，形如：nat-12345678；
下一跳类型为NORMAL_CVM，取值云主机IPv4地址，形如：10.0.0.12；
     */
    public void setNextHopDestination(String NextHopDestination) {
        this.NextHopDestination = NextHopDestination;
    }

    /**
     * 获取网络探测实例ID。形如：netd-12345678。
     * @return NetDetectId 网络探测实例ID。形如：netd-12345678。
     */
    public String getNetDetectId() {
        return this.NetDetectId;
    }

    /**
     * 设置网络探测实例ID。形如：netd-12345678。
     * @param NetDetectId 网络探测实例ID。形如：netd-12345678。
     */
    public void setNetDetectId(String NetDetectId) {
        this.NetDetectId = NetDetectId;
    }

    /**
     * 获取`VPC`实例`ID`。形如：`vpc-12345678`
     * @return VpcId `VPC`实例`ID`。形如：`vpc-12345678`
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置`VPC`实例`ID`。形如：`vpc-12345678`
     * @param VpcId `VPC`实例`ID`。形如：`vpc-12345678`
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取子网实例ID。形如：subnet-12345678。
     * @return SubnetId 子网实例ID。形如：subnet-12345678。
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网实例ID。形如：subnet-12345678。
     * @param SubnetId 子网实例ID。形如：subnet-12345678。
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取网络探测名称，最大长度不能超过60个字节。
     * @return NetDetectName 网络探测名称，最大长度不能超过60个字节。
     */
    public String getNetDetectName() {
        return this.NetDetectName;
    }

    /**
     * 设置网络探测名称，最大长度不能超过60个字节。
     * @param NetDetectName 网络探测名称，最大长度不能超过60个字节。
     */
    public void setNetDetectName(String NetDetectName) {
        this.NetDetectName = NetDetectName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DetectDestinationIp.", this.DetectDestinationIp);
        this.setParamSimple(map, prefix + "NextHopType", this.NextHopType);
        this.setParamSimple(map, prefix + "NextHopDestination", this.NextHopDestination);
        this.setParamSimple(map, prefix + "NetDetectId", this.NetDetectId);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamSimple(map, prefix + "NetDetectName", this.NetDetectName);

    }
}

