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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AppDeviceDetail  extends AbstractModel{

    /**
    * 设备Id
    */
    @SerializedName("DeviceId")
    @Expose
    private String DeviceId;

    /**
    * 所属产品Id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * 别名
    */
    @SerializedName("AliasName")
    @Expose
    private String AliasName;

    /**
    * 地区
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 更新时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 设备信息（json）
    */
    @SerializedName("DeviceInfo")
    @Expose
    private String DeviceInfo;

    /**
    * 数据模板
    */
    @SerializedName("DataTemplate")
    @Expose
    private DataTemplate [] DataTemplate;

    /**
     * 获取设备Id
     * @return DeviceId 设备Id
     */
    public String getDeviceId() {
        return this.DeviceId;
    }

    /**
     * 设置设备Id
     * @param DeviceId 设备Id
     */
    public void setDeviceId(String DeviceId) {
        this.DeviceId = DeviceId;
    }

    /**
     * 获取所属产品Id
     * @return ProductId 所属产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置所属产品Id
     * @param ProductId 所属产品Id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
    }

    /**
     * 获取设备名称
     * @return DeviceName 设备名称
     */
    public String getDeviceName() {
        return this.DeviceName;
    }

    /**
     * 设置设备名称
     * @param DeviceName 设备名称
     */
    public void setDeviceName(String DeviceName) {
        this.DeviceName = DeviceName;
    }

    /**
     * 获取别名
     * @return AliasName 别名
     */
    public String getAliasName() {
        return this.AliasName;
    }

    /**
     * 设置别名
     * @param AliasName 别名
     */
    public void setAliasName(String AliasName) {
        this.AliasName = AliasName;
    }

    /**
     * 获取地区
     * @return Region 地区
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地区
     * @param Region 地区
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
     * 获取设备信息（json）
     * @return DeviceInfo 设备信息（json）
     */
    public String getDeviceInfo() {
        return this.DeviceInfo;
    }

    /**
     * 设置设备信息（json）
     * @param DeviceInfo 设备信息（json）
     */
    public void setDeviceInfo(String DeviceInfo) {
        this.DeviceInfo = DeviceInfo;
    }

    /**
     * 获取数据模板
     * @return DataTemplate 数据模板
     */
    public DataTemplate [] getDataTemplate() {
        return this.DataTemplate;
    }

    /**
     * 设置数据模板
     * @param DataTemplate 数据模板
     */
    public void setDataTemplate(DataTemplate [] DataTemplate) {
        this.DataTemplate = DataTemplate;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DeviceId", this.DeviceId);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "AliasName", this.AliasName);
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "DeviceInfo", this.DeviceInfo);
        this.setParamArrayObj(map, prefix + "DataTemplate.", this.DataTemplate);

    }
}

