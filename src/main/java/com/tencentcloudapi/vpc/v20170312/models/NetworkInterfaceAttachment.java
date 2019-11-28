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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkInterfaceAttachment  extends AbstractModel{

    /**
    * 云主机实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 网卡在云主机实例内的序号。
    */
    @SerializedName("DeviceIndex")
    @Expose
    private Integer DeviceIndex;

    /**
    * 云主机所有者账户信息。
    */
    @SerializedName("InstanceAccountId")
    @Expose
    private String InstanceAccountId;

    /**
    * 绑定时间。
    */
    @SerializedName("AttachTime")
    @Expose
    private String AttachTime;

    /**
     * 获取云主机实例ID。
     * @return InstanceId 云主机实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置云主机实例ID。
     * @param InstanceId 云主机实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取网卡在云主机实例内的序号。
     * @return DeviceIndex 网卡在云主机实例内的序号。
     */
    public Integer getDeviceIndex() {
        return this.DeviceIndex;
    }

    /**
     * 设置网卡在云主机实例内的序号。
     * @param DeviceIndex 网卡在云主机实例内的序号。
     */
    public void setDeviceIndex(Integer DeviceIndex) {
        this.DeviceIndex = DeviceIndex;
    }

    /**
     * 获取云主机所有者账户信息。
     * @return InstanceAccountId 云主机所有者账户信息。
     */
    public String getInstanceAccountId() {
        return this.InstanceAccountId;
    }

    /**
     * 设置云主机所有者账户信息。
     * @param InstanceAccountId 云主机所有者账户信息。
     */
    public void setInstanceAccountId(String InstanceAccountId) {
        this.InstanceAccountId = InstanceAccountId;
    }

    /**
     * 获取绑定时间。
     * @return AttachTime 绑定时间。
     */
    public String getAttachTime() {
        return this.AttachTime;
    }

    /**
     * 设置绑定时间。
     * @param AttachTime 绑定时间。
     */
    public void setAttachTime(String AttachTime) {
        this.AttachTime = AttachTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DeviceIndex", this.DeviceIndex);
        this.setParamSimple(map, prefix + "InstanceAccountId", this.InstanceAccountId);
        this.setParamSimple(map, prefix + "AttachTime", this.AttachTime);

    }
}

