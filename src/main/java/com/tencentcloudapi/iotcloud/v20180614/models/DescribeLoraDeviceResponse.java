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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLoraDeviceResponse  extends AbstractModel{

    /**
    * 设备名称
    */
    @SerializedName("DeviceName")
    @Expose
    private String DeviceName;

    /**
    * LoRa应用UUID
    */
    @SerializedName("AppEui")
    @Expose
    private String AppEui;

    /**
    * LoRa设备UUID
    */
    @SerializedName("DeviceEui")
    @Expose
    private String DeviceEui;

    /**
    * LoRa应用密钥
    */
    @SerializedName("AppKey")
    @Expose
    private String AppKey;

    /**
    * 设备类型,目前支持A、B、C三种
    */
    @SerializedName("ClassType")
    @Expose
    private String ClassType;

    /**
    * 设备所属产品id
    */
    @SerializedName("ProductId")
    @Expose
    private String ProductId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

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
     * 获取LoRa应用UUID
     * @return AppEui LoRa应用UUID
     */
    public String getAppEui() {
        return this.AppEui;
    }

    /**
     * 设置LoRa应用UUID
     * @param AppEui LoRa应用UUID
     */
    public void setAppEui(String AppEui) {
        this.AppEui = AppEui;
    }

    /**
     * 获取LoRa设备UUID
     * @return DeviceEui LoRa设备UUID
     */
    public String getDeviceEui() {
        return this.DeviceEui;
    }

    /**
     * 设置LoRa设备UUID
     * @param DeviceEui LoRa设备UUID
     */
    public void setDeviceEui(String DeviceEui) {
        this.DeviceEui = DeviceEui;
    }

    /**
     * 获取LoRa应用密钥
     * @return AppKey LoRa应用密钥
     */
    public String getAppKey() {
        return this.AppKey;
    }

    /**
     * 设置LoRa应用密钥
     * @param AppKey LoRa应用密钥
     */
    public void setAppKey(String AppKey) {
        this.AppKey = AppKey;
    }

    /**
     * 获取设备类型,目前支持A、B、C三种
     * @return ClassType 设备类型,目前支持A、B、C三种
     */
    public String getClassType() {
        return this.ClassType;
    }

    /**
     * 设置设备类型,目前支持A、B、C三种
     * @param ClassType 设备类型,目前支持A、B、C三种
     */
    public void setClassType(String ClassType) {
        this.ClassType = ClassType;
    }

    /**
     * 获取设备所属产品id
     * @return ProductId 设备所属产品id
     */
    public String getProductId() {
        return this.ProductId;
    }

    /**
     * 设置设备所属产品id
     * @param ProductId 设备所属产品id
     */
    public void setProductId(String ProductId) {
        this.ProductId = ProductId;
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
        this.setParamSimple(map, prefix + "DeviceName", this.DeviceName);
        this.setParamSimple(map, prefix + "AppEui", this.AppEui);
        this.setParamSimple(map, prefix + "DeviceEui", this.DeviceEui);
        this.setParamSimple(map, prefix + "AppKey", this.AppKey);
        this.setParamSimple(map, prefix + "ClassType", this.ClassType);
        this.setParamSimple(map, prefix + "ProductId", this.ProductId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

