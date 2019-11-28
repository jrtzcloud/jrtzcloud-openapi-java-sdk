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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDDoSEvInfoResponse  extends AbstractModel{

    /**
    * 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
    */
    @SerializedName("Business")
    @Expose
    private String Business;

    /**
    * 资源ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 资源的IP
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 攻击开始时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 攻击结束时间
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * TCP报文攻击包数
    */
    @SerializedName("TcpPacketSum")
    @Expose
    private Long TcpPacketSum;

    /**
    * TCP报文攻击流量，单位KB
    */
    @SerializedName("TcpKBSum")
    @Expose
    private Long TcpKBSum;

    /**
    * UDP报文攻击包数
    */
    @SerializedName("UdpPacketSum")
    @Expose
    private Long UdpPacketSum;

    /**
    * UDP报文攻击流量，单位KB
    */
    @SerializedName("UdpKBSum")
    @Expose
    private Long UdpKBSum;

    /**
    * ICMP报文攻击包数
    */
    @SerializedName("IcmpPacketSum")
    @Expose
    private Long IcmpPacketSum;

    /**
    * ICMP报文攻击流量，单位KB
    */
    @SerializedName("IcmpKBSum")
    @Expose
    private Long IcmpKBSum;

    /**
    * 其他报文攻击包数
    */
    @SerializedName("OtherPacketSum")
    @Expose
    private Long OtherPacketSum;

    /**
    * 其他报文攻击流量，单位KB
    */
    @SerializedName("OtherKBSum")
    @Expose
    private Long OtherKBSum;

    /**
    * 累计攻击流量，单位KB
    */
    @SerializedName("TotalTraffic")
    @Expose
    private Long TotalTraffic;

    /**
    * 攻击流量带宽峰值
    */
    @SerializedName("Mbps")
    @Expose
    private Long Mbps;

    /**
    * 攻击包速率峰值
    */
    @SerializedName("Pps")
    @Expose
    private Long Pps;

    /**
    * PCAP文件下载链接
    */
    @SerializedName("PcapUrl")
    @Expose
    private String [] PcapUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     * @return Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public String getBusiness() {
        return this.Business;
    }

    /**
     * 设置大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     * @param Business 大禹子产品代号（bgpip表示高防IP；bgp表示独享包；bgp-multip表示共享包；net表示高防IP专业版）
     */
    public void setBusiness(String Business) {
        this.Business = Business;
    }

    /**
     * 获取资源ID
     * @return Id 资源ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * 设置资源ID
     * @param Id 资源ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 获取资源的IP
     * @return Ip 资源的IP
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * 设置资源的IP
     * @param Ip 资源的IP
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * 获取攻击开始时间
     * @return StartTime 攻击开始时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置攻击开始时间
     * @param StartTime 攻击开始时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取攻击结束时间
     * @return EndTime 攻击结束时间
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置攻击结束时间
     * @param EndTime 攻击结束时间
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取TCP报文攻击包数
     * @return TcpPacketSum TCP报文攻击包数
     */
    public Long getTcpPacketSum() {
        return this.TcpPacketSum;
    }

    /**
     * 设置TCP报文攻击包数
     * @param TcpPacketSum TCP报文攻击包数
     */
    public void setTcpPacketSum(Long TcpPacketSum) {
        this.TcpPacketSum = TcpPacketSum;
    }

    /**
     * 获取TCP报文攻击流量，单位KB
     * @return TcpKBSum TCP报文攻击流量，单位KB
     */
    public Long getTcpKBSum() {
        return this.TcpKBSum;
    }

    /**
     * 设置TCP报文攻击流量，单位KB
     * @param TcpKBSum TCP报文攻击流量，单位KB
     */
    public void setTcpKBSum(Long TcpKBSum) {
        this.TcpKBSum = TcpKBSum;
    }

    /**
     * 获取UDP报文攻击包数
     * @return UdpPacketSum UDP报文攻击包数
     */
    public Long getUdpPacketSum() {
        return this.UdpPacketSum;
    }

    /**
     * 设置UDP报文攻击包数
     * @param UdpPacketSum UDP报文攻击包数
     */
    public void setUdpPacketSum(Long UdpPacketSum) {
        this.UdpPacketSum = UdpPacketSum;
    }

    /**
     * 获取UDP报文攻击流量，单位KB
     * @return UdpKBSum UDP报文攻击流量，单位KB
     */
    public Long getUdpKBSum() {
        return this.UdpKBSum;
    }

    /**
     * 设置UDP报文攻击流量，单位KB
     * @param UdpKBSum UDP报文攻击流量，单位KB
     */
    public void setUdpKBSum(Long UdpKBSum) {
        this.UdpKBSum = UdpKBSum;
    }

    /**
     * 获取ICMP报文攻击包数
     * @return IcmpPacketSum ICMP报文攻击包数
     */
    public Long getIcmpPacketSum() {
        return this.IcmpPacketSum;
    }

    /**
     * 设置ICMP报文攻击包数
     * @param IcmpPacketSum ICMP报文攻击包数
     */
    public void setIcmpPacketSum(Long IcmpPacketSum) {
        this.IcmpPacketSum = IcmpPacketSum;
    }

    /**
     * 获取ICMP报文攻击流量，单位KB
     * @return IcmpKBSum ICMP报文攻击流量，单位KB
     */
    public Long getIcmpKBSum() {
        return this.IcmpKBSum;
    }

    /**
     * 设置ICMP报文攻击流量，单位KB
     * @param IcmpKBSum ICMP报文攻击流量，单位KB
     */
    public void setIcmpKBSum(Long IcmpKBSum) {
        this.IcmpKBSum = IcmpKBSum;
    }

    /**
     * 获取其他报文攻击包数
     * @return OtherPacketSum 其他报文攻击包数
     */
    public Long getOtherPacketSum() {
        return this.OtherPacketSum;
    }

    /**
     * 设置其他报文攻击包数
     * @param OtherPacketSum 其他报文攻击包数
     */
    public void setOtherPacketSum(Long OtherPacketSum) {
        this.OtherPacketSum = OtherPacketSum;
    }

    /**
     * 获取其他报文攻击流量，单位KB
     * @return OtherKBSum 其他报文攻击流量，单位KB
     */
    public Long getOtherKBSum() {
        return this.OtherKBSum;
    }

    /**
     * 设置其他报文攻击流量，单位KB
     * @param OtherKBSum 其他报文攻击流量，单位KB
     */
    public void setOtherKBSum(Long OtherKBSum) {
        this.OtherKBSum = OtherKBSum;
    }

    /**
     * 获取累计攻击流量，单位KB
     * @return TotalTraffic 累计攻击流量，单位KB
     */
    public Long getTotalTraffic() {
        return this.TotalTraffic;
    }

    /**
     * 设置累计攻击流量，单位KB
     * @param TotalTraffic 累计攻击流量，单位KB
     */
    public void setTotalTraffic(Long TotalTraffic) {
        this.TotalTraffic = TotalTraffic;
    }

    /**
     * 获取攻击流量带宽峰值
     * @return Mbps 攻击流量带宽峰值
     */
    public Long getMbps() {
        return this.Mbps;
    }

    /**
     * 设置攻击流量带宽峰值
     * @param Mbps 攻击流量带宽峰值
     */
    public void setMbps(Long Mbps) {
        this.Mbps = Mbps;
    }

    /**
     * 获取攻击包速率峰值
     * @return Pps 攻击包速率峰值
     */
    public Long getPps() {
        return this.Pps;
    }

    /**
     * 设置攻击包速率峰值
     * @param Pps 攻击包速率峰值
     */
    public void setPps(Long Pps) {
        this.Pps = Pps;
    }

    /**
     * 获取PCAP文件下载链接
     * @return PcapUrl PCAP文件下载链接
     */
    public String [] getPcapUrl() {
        return this.PcapUrl;
    }

    /**
     * 设置PCAP文件下载链接
     * @param PcapUrl PCAP文件下载链接
     */
    public void setPcapUrl(String [] PcapUrl) {
        this.PcapUrl = PcapUrl;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Business", this.Business);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "TcpPacketSum", this.TcpPacketSum);
        this.setParamSimple(map, prefix + "TcpKBSum", this.TcpKBSum);
        this.setParamSimple(map, prefix + "UdpPacketSum", this.UdpPacketSum);
        this.setParamSimple(map, prefix + "UdpKBSum", this.UdpKBSum);
        this.setParamSimple(map, prefix + "IcmpPacketSum", this.IcmpPacketSum);
        this.setParamSimple(map, prefix + "IcmpKBSum", this.IcmpKBSum);
        this.setParamSimple(map, prefix + "OtherPacketSum", this.OtherPacketSum);
        this.setParamSimple(map, prefix + "OtherKBSum", this.OtherKBSum);
        this.setParamSimple(map, prefix + "TotalTraffic", this.TotalTraffic);
        this.setParamSimple(map, prefix + "Mbps", this.Mbps);
        this.setParamSimple(map, prefix + "Pps", this.Pps);
        this.setParamArraySimple(map, prefix + "PcapUrl.", this.PcapUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

