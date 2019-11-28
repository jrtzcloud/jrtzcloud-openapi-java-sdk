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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneInfo  extends AbstractModel{

    /**
    * 该可用区的英文名称
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 该可用区的中文名称
    */
    @SerializedName("ZoneName")
    @Expose
    private String ZoneName;

    /**
    * 该可用区对应的数字编号
    */
    @SerializedName("ZoneId")
    @Expose
    private Integer ZoneId;

    /**
    * 可用状态，UNAVAILABLE表示不可用，AVAILABLE表示可用
    */
    @SerializedName("ZoneState")
    @Expose
    private String ZoneState;

    /**
     * 获取该可用区的英文名称
     * @return Zone 该可用区的英文名称
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置该可用区的英文名称
     * @param Zone 该可用区的英文名称
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取该可用区的中文名称
     * @return ZoneName 该可用区的中文名称
     */
    public String getZoneName() {
        return this.ZoneName;
    }

    /**
     * 设置该可用区的中文名称
     * @param ZoneName 该可用区的中文名称
     */
    public void setZoneName(String ZoneName) {
        this.ZoneName = ZoneName;
    }

    /**
     * 获取该可用区对应的数字编号
     * @return ZoneId 该可用区对应的数字编号
     */
    public Integer getZoneId() {
        return this.ZoneId;
    }

    /**
     * 设置该可用区对应的数字编号
     * @param ZoneId 该可用区对应的数字编号
     */
    public void setZoneId(Integer ZoneId) {
        this.ZoneId = ZoneId;
    }

    /**
     * 获取可用状态，UNAVAILABLE表示不可用，AVAILABLE表示可用
     * @return ZoneState 可用状态，UNAVAILABLE表示不可用，AVAILABLE表示可用
     */
    public String getZoneState() {
        return this.ZoneState;
    }

    /**
     * 设置可用状态，UNAVAILABLE表示不可用，AVAILABLE表示可用
     * @param ZoneState 可用状态，UNAVAILABLE表示不可用，AVAILABLE表示可用
     */
    public void setZoneState(String ZoneState) {
        this.ZoneState = ZoneState;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "ZoneName", this.ZoneName);
        this.setParamSimple(map, prefix + "ZoneId", this.ZoneId);
        this.setParamSimple(map, prefix + "ZoneState", this.ZoneState);

    }
}

