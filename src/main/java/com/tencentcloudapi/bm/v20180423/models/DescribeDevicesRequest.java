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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDevicesRequest  extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 返回数量
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 机型ID，通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)查询
    */
    @SerializedName("DeviceClassCode")
    @Expose
    private String DeviceClassCode;

    /**
    * 设备ID数组
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 外网IP数组
    */
    @SerializedName("WanIps")
    @Expose
    private String [] WanIps;

    /**
    * 内网IP数组
    */
    @SerializedName("LanIps")
    @Expose
    private String [] LanIps;

    /**
    * 设备名称
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 模糊IP查询
    */
    @SerializedName("VagueIp")
    @Expose
    private String VagueIp;

    /**
    * 设备到期时间查询的起始时间
    */
    @SerializedName("DeadlineStartTime")
    @Expose
    private String DeadlineStartTime;

    /**
    * 设备到期时间查询的结束时间
    */
    @SerializedName("DeadlineEndTime")
    @Expose
    private String DeadlineEndTime;

    /**
    * 自动续费标志 0:不自动续费，1:自动续费
    */
    @SerializedName("AutoRenewFlag")
    @Expose
    private Integer AutoRenewFlag;

    /**
    * 私有网络唯一ID
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 子网唯一ID
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
    * 标签列表
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 设备类型，取值有: compute(计算型), standard(标准型), storage(存储型) 等
    */
    @SerializedName("DeviceType")
    @Expose
    private String DeviceType;

    /**
    * 竞价实例机器的过滤。如果未指定此参数，则不做过滤。0: 查询非竞价实例的机器; 1: 查询竞价实例的机器。
    */
    @SerializedName("IsLuckyDevice")
    @Expose
    private Integer IsLuckyDevice;

    /**
    * 排序字段
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方式，取值：0:增序(默认)，1:降序
    */
    @SerializedName("Order")
    @Expose
    private Integer Order;

    /**
     * 获取偏移量
     * @return Offset 偏移量
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数量
     * @return Limit 返回数量
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数量
     * @param Limit 返回数量
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取机型ID，通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)查询
     * @return DeviceClassCode 机型ID，通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)查询
     */
    public String getDeviceClassCode() {
        return this.DeviceClassCode;
    }

    /**
     * 设置机型ID，通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)查询
     * @param DeviceClassCode 机型ID，通过接口[查询设备型号(DescribeDeviceClass)](https://cloud.tencent.com/document/api/386/32911)查询
     */
    public void setDeviceClassCode(String DeviceClassCode) {
        this.DeviceClassCode = DeviceClassCode;
    }

    /**
     * 获取设备ID数组
     * @return InstanceIds 设备ID数组
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置设备ID数组
     * @param InstanceIds 设备ID数组
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 获取外网IP数组
     * @return WanIps 外网IP数组
     */
    public String [] getWanIps() {
        return this.WanIps;
    }

    /**
     * 设置外网IP数组
     * @param WanIps 外网IP数组
     */
    public void setWanIps(String [] WanIps) {
        this.WanIps = WanIps;
    }

    /**
     * 获取内网IP数组
     * @return LanIps 内网IP数组
     */
    public String [] getLanIps() {
        return this.LanIps;
    }

    /**
     * 设置内网IP数组
     * @param LanIps 内网IP数组
     */
    public void setLanIps(String [] LanIps) {
        this.LanIps = LanIps;
    }

    /**
     * 获取设备名称
     * @return Alias 设备名称
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * 设置设备名称
     * @param Alias 设备名称
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * 获取模糊IP查询
     * @return VagueIp 模糊IP查询
     */
    public String getVagueIp() {
        return this.VagueIp;
    }

    /**
     * 设置模糊IP查询
     * @param VagueIp 模糊IP查询
     */
    public void setVagueIp(String VagueIp) {
        this.VagueIp = VagueIp;
    }

    /**
     * 获取设备到期时间查询的起始时间
     * @return DeadlineStartTime 设备到期时间查询的起始时间
     */
    public String getDeadlineStartTime() {
        return this.DeadlineStartTime;
    }

    /**
     * 设置设备到期时间查询的起始时间
     * @param DeadlineStartTime 设备到期时间查询的起始时间
     */
    public void setDeadlineStartTime(String DeadlineStartTime) {
        this.DeadlineStartTime = DeadlineStartTime;
    }

    /**
     * 获取设备到期时间查询的结束时间
     * @return DeadlineEndTime 设备到期时间查询的结束时间
     */
    public String getDeadlineEndTime() {
        return this.DeadlineEndTime;
    }

    /**
     * 设置设备到期时间查询的结束时间
     * @param DeadlineEndTime 设备到期时间查询的结束时间
     */
    public void setDeadlineEndTime(String DeadlineEndTime) {
        this.DeadlineEndTime = DeadlineEndTime;
    }

    /**
     * 获取自动续费标志 0:不自动续费，1:自动续费
     * @return AutoRenewFlag 自动续费标志 0:不自动续费，1:自动续费
     */
    public Integer getAutoRenewFlag() {
        return this.AutoRenewFlag;
    }

    /**
     * 设置自动续费标志 0:不自动续费，1:自动续费
     * @param AutoRenewFlag 自动续费标志 0:不自动续费，1:自动续费
     */
    public void setAutoRenewFlag(Integer AutoRenewFlag) {
        this.AutoRenewFlag = AutoRenewFlag;
    }

    /**
     * 获取私有网络唯一ID
     * @return VpcId 私有网络唯一ID
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置私有网络唯一ID
     * @param VpcId 私有网络唯一ID
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取子网唯一ID
     * @return SubnetId 子网唯一ID
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置子网唯一ID
     * @param SubnetId 子网唯一ID
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 获取标签列表
     * @return Tags 标签列表
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * 设置标签列表
     * @param Tags 标签列表
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * 获取设备类型，取值有: compute(计算型), standard(标准型), storage(存储型) 等
     * @return DeviceType 设备类型，取值有: compute(计算型), standard(标准型), storage(存储型) 等
     */
    public String getDeviceType() {
        return this.DeviceType;
    }

    /**
     * 设置设备类型，取值有: compute(计算型), standard(标准型), storage(存储型) 等
     * @param DeviceType 设备类型，取值有: compute(计算型), standard(标准型), storage(存储型) 等
     */
    public void setDeviceType(String DeviceType) {
        this.DeviceType = DeviceType;
    }

    /**
     * 获取竞价实例机器的过滤。如果未指定此参数，则不做过滤。0: 查询非竞价实例的机器; 1: 查询竞价实例的机器。
     * @return IsLuckyDevice 竞价实例机器的过滤。如果未指定此参数，则不做过滤。0: 查询非竞价实例的机器; 1: 查询竞价实例的机器。
     */
    public Integer getIsLuckyDevice() {
        return this.IsLuckyDevice;
    }

    /**
     * 设置竞价实例机器的过滤。如果未指定此参数，则不做过滤。0: 查询非竞价实例的机器; 1: 查询竞价实例的机器。
     * @param IsLuckyDevice 竞价实例机器的过滤。如果未指定此参数，则不做过滤。0: 查询非竞价实例的机器; 1: 查询竞价实例的机器。
     */
    public void setIsLuckyDevice(Integer IsLuckyDevice) {
        this.IsLuckyDevice = IsLuckyDevice;
    }

    /**
     * 获取排序字段
     * @return OrderField 排序字段
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * 设置排序字段
     * @param OrderField 排序字段
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * 获取排序方式，取值：0:增序(默认)，1:降序
     * @return Order 排序方式，取值：0:增序(默认)，1:降序
     */
    public Integer getOrder() {
        return this.Order;
    }

    /**
     * 设置排序方式，取值：0:增序(默认)，1:降序
     * @param Order 排序方式，取值：0:增序(默认)，1:降序
     */
    public void setOrder(Integer Order) {
        this.Order = Order;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DeviceClassCode", this.DeviceClassCode);
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamArraySimple(map, prefix + "WanIps.", this.WanIps);
        this.setParamArraySimple(map, prefix + "LanIps.", this.LanIps);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "VagueIp", this.VagueIp);
        this.setParamSimple(map, prefix + "DeadlineStartTime", this.DeadlineStartTime);
        this.setParamSimple(map, prefix + "DeadlineEndTime", this.DeadlineEndTime);
        this.setParamSimple(map, prefix + "AutoRenewFlag", this.AutoRenewFlag);
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "DeviceType", this.DeviceType);
        this.setParamSimple(map, prefix + "IsLuckyDevice", this.IsLuckyDevice);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

