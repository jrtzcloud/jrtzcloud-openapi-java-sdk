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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RegionInfo  extends AbstractModel{

    /**
    * 地域英文ID
    */
    @SerializedName("Region")
    @Expose
    private String Region;

    /**
    * 地域数字ID
    */
    @SerializedName("RegionId")
    @Expose
    private Integer RegionId;

    /**
    * 地域中文名
    */
    @SerializedName("RegionName")
    @Expose
    private String RegionName;

    /**
    * 可用区列表
    */
    @SerializedName("ZoneList")
    @Expose
    private ZonesInfo [] ZoneList;

    /**
    * 可选择的主可用区和从可用区
    */
    @SerializedName("AvailableChoice")
    @Expose
    private ShardZoneChooseInfo [] AvailableChoice;

    /**
     * 获取地域英文ID
     * @return Region 地域英文ID
     */
    public String getRegion() {
        return this.Region;
    }

    /**
     * 设置地域英文ID
     * @param Region 地域英文ID
     */
    public void setRegion(String Region) {
        this.Region = Region;
    }

    /**
     * 获取地域数字ID
     * @return RegionId 地域数字ID
     */
    public Integer getRegionId() {
        return this.RegionId;
    }

    /**
     * 设置地域数字ID
     * @param RegionId 地域数字ID
     */
    public void setRegionId(Integer RegionId) {
        this.RegionId = RegionId;
    }

    /**
     * 获取地域中文名
     * @return RegionName 地域中文名
     */
    public String getRegionName() {
        return this.RegionName;
    }

    /**
     * 设置地域中文名
     * @param RegionName 地域中文名
     */
    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    /**
     * 获取可用区列表
     * @return ZoneList 可用区列表
     */
    public ZonesInfo [] getZoneList() {
        return this.ZoneList;
    }

    /**
     * 设置可用区列表
     * @param ZoneList 可用区列表
     */
    public void setZoneList(ZonesInfo [] ZoneList) {
        this.ZoneList = ZoneList;
    }

    /**
     * 获取可选择的主可用区和从可用区
     * @return AvailableChoice 可选择的主可用区和从可用区
     */
    public ShardZoneChooseInfo [] getAvailableChoice() {
        return this.AvailableChoice;
    }

    /**
     * 设置可选择的主可用区和从可用区
     * @param AvailableChoice 可选择的主可用区和从可用区
     */
    public void setAvailableChoice(ShardZoneChooseInfo [] AvailableChoice) {
        this.AvailableChoice = AvailableChoice;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Region", this.Region);
        this.setParamSimple(map, prefix + "RegionId", this.RegionId);
        this.setParamSimple(map, prefix + "RegionName", this.RegionName);
        this.setParamArrayObj(map, prefix + "ZoneList.", this.ZoneList);
        this.setParamArrayObj(map, prefix + "AvailableChoice.", this.AvailableChoice);

    }
}

