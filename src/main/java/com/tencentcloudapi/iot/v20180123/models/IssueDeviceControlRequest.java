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

public class IssueDeviceControlRequest  extends AbstractModel{

    /**
    * 产品Id
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
    * 控制数据（json）
    */
    @SerializedName("ControlData")
    @Expose
    private String ControlData;

    /**
    * 是否发送metadata字段
    */
    @SerializedName("Metadata")
    @Expose
    private Boolean Metadata;

    /**
     * 获取产品Id
     * @return ProductId 产品Id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置产品Id
     * @param ProductId 产品Id
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
     * 获取控制数据（json）
     * @return ControlData 控制数据（json）
     */
    public String getControlData() {
        return this.ControlData;
    }

    /**
     * 设置控制数据（json）
     * @param ControlData 控制数据（json）
     */
    public void setControlData(String ControlData) {
        this.ControlData = ControlData;
    }

    /**
     * 获取是否发送metadata字段
     * @return Metadata 是否发送metadata字段
     */
    public Boolean getMetadata() {
        return this.Metadata;
    }

    /**
     * 设置是否发送metadata字段
     * @param Metadata 是否发送metadata字段
     */
    public void setMetadata(Boolean Metadata) {
        this.Metadata = Metadata;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "ControlData", this.ControlData);
        this.setParamSimple(map, prefix + "Metadata", this.Metadata);

    }
}

