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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneSellConf  extends AbstractModel{

    /**
    * 可用区状态。可能的返回值为：0-未上线；1-上线；2-开放；3-停售；4-不展示
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 可用区中文名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 实例类型是否为自定义类型
    */
    @SerializedName("IsCustom")
    @Expose
    private Boolean IsCustom;

    /**
    * 是否支持灾备
    */
    @SerializedName("IsSupportDr")
    @Expose
    private Boolean IsSupportDr;

    /**
    * 是否支持私有网络
    */
    @SerializedName("IsSupportVpc")
    @Expose
    private Boolean IsSupportVpc;

    /**
    * 小时计费实例最大售卖数量
    */
    @SerializedName("HourInstanceSaleMaxNum")
    @Expose
    private Integer HourInstanceSaleMaxNum;

    /**
    * 是否为默认可用区
    */
    @SerializedName("IsDefaultZone")
    @Expose
    private Boolean IsDefaultZone;

    /**
    * 是否为黑石区
    */
    @SerializedName("IsBm")
    @Expose
    private Boolean IsBm;

    /**
    * 支持的付费类型。可能的返回值为：0-包年包月；1-小时计费；2-后付费
    */
    @SerializedName("PayType")
    @Expose
    private String [] PayType;

    /**
    * 数据复制类型。0-异步复制；1-半同步复制；2-强同步复制
    */
    @SerializedName("ProtectMode")
    @Expose
    private String [] ProtectMode;

    /**
    * 可用区名称
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 售卖实例类型数组
    */
    @SerializedName("SellType")
    @Expose
    private SellType [] SellType;

    /**
    * 多可用区信息
    */
    @SerializedName("ZoneConf")
    @Expose
    private ZoneConf ZoneConf;

    /**
    * 可支持的灾备可用区信息
    */
    @SerializedName("DrZone")
    @Expose
    private String [] DrZone;

    /**
     * 获取可用区状态。可能的返回值为：0-未上线；1-上线；2-开放；3-停售；4-不展示
     * @return Status 可用区状态。可能的返回值为：0-未上线；1-上线；2-开放；3-停售；4-不展示
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置可用区状态。可能的返回值为：0-未上线；1-上线；2-开放；3-停售；4-不展示
     * @param Status 可用区状态。可能的返回值为：0-未上线；1-上线；2-开放；3-停售；4-不展示
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取可用区中文名称
     * @return ZoneName 可用区中文名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * 设置可用区中文名称
     * @param ZoneName 可用区中文名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * 获取实例类型是否为自定义类型
     * @return IsCustom 实例类型是否为自定义类型
     */
    public Boolean getIsCustom() {
        return this.IsCustom;
    }

    /**
     * 设置实例类型是否为自定义类型
     * @param IsCustom 实例类型是否为自定义类型
     */
    public void setIsCustom(Boolean IsCustom) {
        this.IsCustom = IsCustom;
    }

    /**
     * 获取是否支持灾备
     * @return IsSupportDr 是否支持灾备
     */
    public Boolean getIsSupportDr() {
        return this.IsSupportDr;
    }

    /**
     * 设置是否支持灾备
     * @param IsSupportDr 是否支持灾备
     */
    public void setIsSupportDr(Boolean IsSupportDr) {
        this.IsSupportDr = IsSupportDr;
    }

    /**
     * 获取是否支持私有网络
     * @return IsSupportVpc 是否支持私有网络
     */
    public Boolean getIsSupportVpc() {
        return this.IsSupportVpc;
    }

    /**
     * 设置是否支持私有网络
     * @param IsSupportVpc 是否支持私有网络
     */
    public void setIsSupportVpc(Boolean IsSupportVpc) {
        this.IsSupportVpc = IsSupportVpc;
    }

    /**
     * 获取小时计费实例最大售卖数量
     * @return HourInstanceSaleMaxNum 小时计费实例最大售卖数量
     */
    public Integer getHourInstanceSaleMaxNum() {
        return this.HourInstanceSaleMaxNum;
    }

    /**
     * 设置小时计费实例最大售卖数量
     * @param HourInstanceSaleMaxNum 小时计费实例最大售卖数量
     */
    public void setHourInstanceSaleMaxNum(Integer HourInstanceSaleMaxNum) {
        this.HourInstanceSaleMaxNum = HourInstanceSaleMaxNum;
    }

    /**
     * 获取是否为默认可用区
     * @return IsDefaultZone 是否为默认可用区
     */
    public Boolean getIsDefaultZone() {
        return this.IsDefaultZone;
    }

    /**
     * 设置是否为默认可用区
     * @param IsDefaultZone 是否为默认可用区
     */
    public void setIsDefaultZone(Boolean IsDefaultZone) {
        this.IsDefaultZone = IsDefaultZone;
    }

    /**
     * 获取是否为黑石区
     * @return IsBm 是否为黑石区
     */
    public Boolean getIsBm() {
        return this.IsBm;
    }

    /**
     * 设置是否为黑石区
     * @param IsBm 是否为黑石区
     */
    public void setIsBm(Boolean IsBm) {
        this.IsBm = IsBm;
    }

    /**
     * 获取支持的付费类型。可能的返回值为：0-包年包月；1-小时计费；2-后付费
     * @return PayType 支持的付费类型。可能的返回值为：0-包年包月；1-小时计费；2-后付费
     */
    public String [] getPayType() {
        return this.PayType;
    }

    /**
     * 设置支持的付费类型。可能的返回值为：0-包年包月；1-小时计费；2-后付费
     * @param PayType 支持的付费类型。可能的返回值为：0-包年包月；1-小时计费；2-后付费
     */
    public void setPayType(String [] PayType) {
        this.PayType = PayType;
    }

    /**
     * 获取数据复制类型。0-异步复制；1-半同步复制；2-强同步复制
     * @return ProtectMode 数据复制类型。0-异步复制；1-半同步复制；2-强同步复制
     */
    public String [] getProtectMode() {
        return this.ProtectMode;
    }

    /**
     * 设置数据复制类型。0-异步复制；1-半同步复制；2-强同步复制
     * @param ProtectMode 数据复制类型。0-异步复制；1-半同步复制；2-强同步复制
     */
    public void setProtectMode(String [] ProtectMode) {
        this.ProtectMode = ProtectMode;
    }

    /**
     * 获取可用区名称
     * @return Zone 可用区名称
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区名称
     * @param Zone 可用区名称
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取售卖实例类型数组
     * @return SellType 售卖实例类型数组
     */
    public SellType [] getSellType() {
        return this.SellType;
    }

    /**
     * 设置售卖实例类型数组
     * @param SellType 售卖实例类型数组
     */
    public void setSellType(SellType [] SellType) {
        this.SellType = SellType;
    }

    /**
     * 获取多可用区信息
     * @return ZoneConf 多可用区信息
     */
    public ZoneConf getZoneConf() {
        return this.ZoneConf;
    }

    /**
     * 设置多可用区信息
     * @param ZoneConf 多可用区信息
     */
    public void setZoneConf(ZoneConf ZoneConf) {
        this.ZoneConf = ZoneConf;
    }

    /**
     * 获取可支持的灾备可用区信息
     * @return DrZone 可支持的灾备可用区信息
     */
    public String [] getDrZone() {
        return this.DrZone;
    }

    /**
     * 设置可支持的灾备可用区信息
     * @param DrZone 可支持的灾备可用区信息
     */
    public void setDrZone(String [] DrZone) {
        this.DrZone = DrZone;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "IsCustom", this.IsCustom);
        this.setParamSimple(map, prefix + "IsSupportDr", this.IsSupportDr);
        this.setParamSimple(map, prefix + "IsSupportVpc", this.IsSupportVpc);
        this.setParamSimple(map, prefix + "HourInstanceSaleMaxNum", this.HourInstanceSaleMaxNum);
        this.setParamSimple(map, prefix + "IsDefaultZone", this.IsDefaultZone);
        this.setParamSimple(map, prefix + "IsBm", this.IsBm);
        this.setParamArraySimple(map, prefix + "PayType.", this.PayType);
        this.setParamArraySimple(map, prefix + "ProtectMode.", this.ProtectMode);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamArrayObj(map, prefix + "SellType.", this.SellType);
        this.setParamObj(map, prefix + "ZoneConf.", this.ZoneConf);
        this.setParamArraySimple(map, prefix + "DrZone.", this.DrZone);

    }
}

