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

public class UnassociateSubDeviceFromGatewayProductRequest  extends AbstractModel{

    /**
    * 子设备产品Id
    */
    @SerializedName("SubDeviceProductId")
    @Expose
    private String SubDeviceProductId;

    /**
    * 网关设备产品Id
    */
    @SerializedName("GatewayProductId")
    @Expose
    private String GatewayProductId;

    /**
     * 获取子设备产品Id
     * @return SubDeviceProductId 子设备产品Id
     */
    public String getSubDeviceProductId() {
        return this.SubDeviceProductId;
    }

    /**
     * 设置子设备产品Id
     * @param SubDeviceProductId 子设备产品Id
     */
    public void setSubDeviceProductId(String SubDeviceProductId) {
        this.SubDeviceProductId = SubDeviceProductId;
    }

    /**
     * 获取网关设备产品Id
     * @return GatewayProductId 网关设备产品Id
     */
    public String getGatewayProductId() {
        return this.GatewayProductId;
    }

    /**
     * 设置网关设备产品Id
     * @param GatewayProductId 网关设备产品Id
     */
    public void setGatewayProductId(String GatewayProductId) {
        this.GatewayProductId = GatewayProductId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SubDeviceProductId", this.SubDeviceProductId);
        this.setParamSimple(map, prefix + "GatewayProductId", this.GatewayProductId);

    }
}

