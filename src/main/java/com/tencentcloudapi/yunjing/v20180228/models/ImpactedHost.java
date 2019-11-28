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
package com.tencentcloudapi.yunjing.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ImpactedHost  extends AbstractModel{

    /**
    * 漏洞ID。
    */
    @SerializedName("Id")
    @Expose
    private Integer Id;

    /**
    * 主机IP。
    */
    @SerializedName("MachineIp")
    @Expose
    private String MachineIp;

    /**
    * 主机名称。
    */
    @SerializedName("MachineName")
    @Expose
    private String MachineName;

    /**
    * 最后检测时间。
    */
    @SerializedName("LastScanTime")
    @Expose
    private String LastScanTime;

    /**
    * 漏洞状态。
<li>UN_OPERATED ：待处理</li>
<li>SCANING : 扫描中</li>
<li>FIXED : 已修复</li>
    */
    @SerializedName("VulStatus")
    @Expose
    private String VulStatus;

    /**
    * 云镜客户端唯一标识UUID。
    */
    @SerializedName("Uuid")
    @Expose
    private String Uuid;

    /**
    * 漏洞描述。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 漏洞种类ID。
    */
    @SerializedName("VulId")
    @Expose
    private Integer VulId;

    /**
    * 是否为专业版。
    */
    @SerializedName("IsProVersion")
    @Expose
    private Boolean IsProVersion;

    /**
     * 获取漏洞ID。
     * @return Id 漏洞ID。
     */
    public Integer getId() {
        return this.Id;
    }

    /**
     * 设置漏洞ID。
     * @param Id 漏洞ID。
     */
    public void setId(Integer Id) {
        this.Id = Id;
    }

    /**
     * 获取主机IP。
     * @return MachineIp 主机IP。
     */
    public String getMachineIp() {
        return this.MachineIp;
    }

    /**
     * 设置主机IP。
     * @param MachineIp 主机IP。
     */
    public void setMachineIp(String MachineIp) {
        this.MachineIp = MachineIp;
    }

    /**
     * 获取主机名称。
     * @return MachineName 主机名称。
     */
    public String getMachineName() {
        return this.MachineName;
    }

    /**
     * 设置主机名称。
     * @param MachineName 主机名称。
     */
    public void setMachineName(String MachineName) {
        this.MachineName = MachineName;
    }

    /**
     * 获取最后检测时间。
     * @return LastScanTime 最后检测时间。
     */
    public String getLastScanTime() {
        return this.LastScanTime;
    }

    /**
     * 设置最后检测时间。
     * @param LastScanTime 最后检测时间。
     */
    public void setLastScanTime(String LastScanTime) {
        this.LastScanTime = LastScanTime;
    }

    /**
     * 获取漏洞状态。
<li>UN_OPERATED ：待处理</li>
<li>SCANING : 扫描中</li>
<li>FIXED : 已修复</li>
     * @return VulStatus 漏洞状态。
<li>UN_OPERATED ：待处理</li>
<li>SCANING : 扫描中</li>
<li>FIXED : 已修复</li>
     */
    public String getVulStatus() {
        return this.VulStatus;
    }

    /**
     * 设置漏洞状态。
<li>UN_OPERATED ：待处理</li>
<li>SCANING : 扫描中</li>
<li>FIXED : 已修复</li>
     * @param VulStatus 漏洞状态。
<li>UN_OPERATED ：待处理</li>
<li>SCANING : 扫描中</li>
<li>FIXED : 已修复</li>
     */
    public void setVulStatus(String VulStatus) {
        this.VulStatus = VulStatus;
    }

    /**
     * 获取云镜客户端唯一标识UUID。
     * @return Uuid 云镜客户端唯一标识UUID。
     */
    public String getUuid() {
        return this.Uuid;
    }

    /**
     * 设置云镜客户端唯一标识UUID。
     * @param Uuid 云镜客户端唯一标识UUID。
     */
    public void setUuid(String Uuid) {
        this.Uuid = Uuid;
    }

    /**
     * 获取漏洞描述。
     * @return Description 漏洞描述。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置漏洞描述。
     * @param Description 漏洞描述。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 获取漏洞种类ID。
     * @return VulId 漏洞种类ID。
     */
    public Integer getVulId() {
        return this.VulId;
    }

    /**
     * 设置漏洞种类ID。
     * @param VulId 漏洞种类ID。
     */
    public void setVulId(Integer VulId) {
        this.VulId = VulId;
    }

    /**
     * 获取是否为专业版。
     * @return IsProVersion 是否为专业版。
     */
    public Boolean getIsProVersion() {
        return this.IsProVersion;
    }

    /**
     * 设置是否为专业版。
     * @param IsProVersion 是否为专业版。
     */
    public void setIsProVersion(Boolean IsProVersion) {
        this.IsProVersion = IsProVersion;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "MachineIp", this.MachineIp);
        this.setParamSimple(map, prefix + "MachineName", this.MachineName);
        this.setParamSimple(map, prefix + "LastScanTime", this.LastScanTime);
        this.setParamSimple(map, prefix + "VulStatus", this.VulStatus);
        this.setParamSimple(map, prefix + "Uuid", this.Uuid);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "IsProVersion", this.IsProVersion);

    }
}

