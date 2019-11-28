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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RedisBackupSet  extends AbstractModel{

    /**
    * 开始备份的时间
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 备份ID
    */
    @SerializedName("BackupId")
    @Expose
    private String BackupId;

    /**
    * 备份类型。 manualBackupInstance：用户发起的手动备份； systemBackupInstance：凌晨系统发起的备份
    */
    @SerializedName("BackupType")
    @Expose
    private String BackupType;

    /**
    * 备份状态。  1:"备份被其它流程锁定";  2:"备份正常，没有被任何流程锁定";  -1:"备份已过期"； 3:"备份正在被导出";  4:"备份导出成功"
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 备份的备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
    * 备份是否被锁定，0：未被锁定；1：已被锁定
    */
    @SerializedName("Locked")
    @Expose
    private Integer Locked;

    /**
     * 获取开始备份的时间
     * @return StartTime 开始备份的时间
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置开始备份的时间
     * @param StartTime 开始备份的时间
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取备份ID
     * @return BackupId 备份ID
     */
    public String getBackupId() {
        return this.BackupId;
    }

    /**
     * 设置备份ID
     * @param BackupId 备份ID
     */
    public void setBackupId(String BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * 获取备份类型。 manualBackupInstance：用户发起的手动备份； systemBackupInstance：凌晨系统发起的备份
     * @return BackupType 备份类型。 manualBackupInstance：用户发起的手动备份； systemBackupInstance：凌晨系统发起的备份
     */
    public String getBackupType() {
        return this.BackupType;
    }

    /**
     * 设置备份类型。 manualBackupInstance：用户发起的手动备份； systemBackupInstance：凌晨系统发起的备份
     * @param BackupType 备份类型。 manualBackupInstance：用户发起的手动备份； systemBackupInstance：凌晨系统发起的备份
     */
    public void setBackupType(String BackupType) {
        this.BackupType = BackupType;
    }

    /**
     * 获取备份状态。  1:"备份被其它流程锁定";  2:"备份正常，没有被任何流程锁定";  -1:"备份已过期"； 3:"备份正在被导出";  4:"备份导出成功"
     * @return Status 备份状态。  1:"备份被其它流程锁定";  2:"备份正常，没有被任何流程锁定";  -1:"备份已过期"； 3:"备份正在被导出";  4:"备份导出成功"
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置备份状态。  1:"备份被其它流程锁定";  2:"备份正常，没有被任何流程锁定";  -1:"备份已过期"； 3:"备份正在被导出";  4:"备份导出成功"
     * @param Status 备份状态。  1:"备份被其它流程锁定";  2:"备份正常，没有被任何流程锁定";  -1:"备份已过期"； 3:"备份正在被导出";  4:"备份导出成功"
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取备份的备注信息
     * @return Remark 备份的备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * 设置备份的备注信息
     * @param Remark 备份的备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * 获取备份是否被锁定，0：未被锁定；1：已被锁定
     * @return Locked 备份是否被锁定，0：未被锁定；1：已被锁定
     */
    public Integer getLocked() {
        return this.Locked;
    }

    /**
     * 设置备份是否被锁定，0：未被锁定；1：已被锁定
     * @param Locked 备份是否被锁定，0：未被锁定；1：已被锁定
     */
    public void setLocked(Integer Locked) {
        this.Locked = Locked;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);
        this.setParamSimple(map, prefix + "BackupType", this.BackupType);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Remark", this.Remark);
        this.setParamSimple(map, prefix + "Locked", this.Locked);

    }
}

