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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AvailableZone  extends AbstractModel{

    /**
    * 可用区名称
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 可用区ID
    */
    @SerializedName("ZoneId")
    @Expose
    private Long ZoneId;

    /**
    * 可用区中文名称
    */
    @SerializedName("ZoneCnName")
    @Expose
    private String ZoneCnName;

    /**
    * Type数组
    */
    @SerializedName("Types")
    @Expose
    private AvailableType [] Types;

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
     * 获取可用区ID
     * @return ZoneId 可用区ID
     */
    public Long getZoneId() {
        return this.ZoneId;
    }

    /**
     * 设置可用区ID
     * @param ZoneId 可用区ID
     */
    public void setZoneId(Long ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * 获取可用区中文名称
     * @return ZoneCnName 可用区中文名称
     */
    public String getZoneCnName() {
        return this.ZoneCnName;
    }

    /**
     * 设置可用区中文名称
     * @param ZoneCnName 可用区中文名称
     */
    public void setZoneCnName(String ZoneCnName) {
        this.ZoneCnName = ZoneCnName;
    }

    /**
     * 获取Type数组
     * @return Types Type数组
     */
    public AvailableType [] getTypes() {
        return this.Types;
    }

    /**
     * 设置Type数组
     * @param Types Type数组
     */
    public void setTypes(AvailableType [] Types) {
        this.Types = Types;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneCnName", this.ZoneCnName);
        this.setParamArrayObj(map, prefix + "Types.", this.Types);

    }
}

