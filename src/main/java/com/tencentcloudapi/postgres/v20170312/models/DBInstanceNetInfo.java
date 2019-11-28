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

public class DBInstanceNetInfo  extends AbstractModel{

    /**
    * DNS域名
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * Ip
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 连接Port地址
    */
    @SerializedName("Port")
    @Expose
    private Integer Port;

    /**
    * 网络类型，1、inner（内网地址）；2、public（外网地址）
    */
    @SerializedName("NetType")
    @Expose
    private String NetType;

    /**
    * 网络连接状态
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * 获取DNS域名
     * @return Address DNS域名
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * 设置DNS域名
     * @param Address DNS域名
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * 获取Ip
     * @return Ip Ip
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * 设置Ip
     * @param Ip Ip
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * 获取连接Port地址
     * @return Port 连接Port地址
     */
    public Integer getPort() {
        return this.Port;
    }

    /**
     * 设置连接Port地址
     * @param Port 连接Port地址
     */
    public void setPort(Integer Port) {
        this.Port = Port;
    }

    /**
     * 获取网络类型，1、inner（内网地址）；2、public（外网地址）
     * @return NetType 网络类型，1、inner（内网地址）；2、public（外网地址）
     */
    public String getNetType() {
        return this.NetType;
    }

    /**
     * 设置网络类型，1、inner（内网地址）；2、public（外网地址）
     * @param NetType 网络类型，1、inner（内网地址）；2、public（外网地址）
     */
    public void setNetType(String NetType) {
        this.NetType = NetType;
    }

    /**
     * 获取网络连接状态
     * @return Status 网络连接状态
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置网络连接状态
     * @param Status 网络连接状态
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Port", this.Port);
        this.setParamSimple(map, prefix + "NetType", this.NetType);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

