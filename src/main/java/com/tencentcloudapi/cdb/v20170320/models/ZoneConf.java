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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ZoneConf  extends AbstractModel{

    /**
    * 可用区部署方式，可能的值为：0-单可用区；1-多可用区
    */
    @SerializedName("DeployMode")
    @Expose
    private Integer [] DeployMode;

    /**
    * 主实例所在的可用区
    */
    @SerializedName("MasterZone")
    @Expose
    private String [] MasterZone;

    /**
    * 实例为多可用区部署时，备库1所在的可用区
    */
    @SerializedName("SlaveZone")
    @Expose
    private String [] SlaveZone;

    /**
    * 实例为多可用区部署时，备库2所在的可用区
    */
    @SerializedName("BackupZone")
    @Expose
    private String [] BackupZone;

    /**
     * 获取可用区部署方式，可能的值为：0-单可用区；1-多可用区
     * @return DeployMode 可用区部署方式，可能的值为：0-单可用区；1-多可用区
     */
    public Integer [] getDeployMode() {
        return this.DeployMode;
    }

    /**
     * 设置可用区部署方式，可能的值为：0-单可用区；1-多可用区
     * @param DeployMode 可用区部署方式，可能的值为：0-单可用区；1-多可用区
     */
    public void setDeployMode(Integer [] DeployMode) {
        this.DeployMode = DeployMode;
    }

    /**
     * 获取主实例所在的可用区
     * @return MasterZone 主实例所在的可用区
     */
    public String [] getMasterZone() {
        return this.MasterZone;
    }

    /**
     * 设置主实例所在的可用区
     * @param MasterZone 主实例所在的可用区
     */
    public void setMasterZone(String [] MasterZone) {
        this.MasterZone = MasterZone;
    }

    /**
     * 获取实例为多可用区部署时，备库1所在的可用区
     * @return SlaveZone 实例为多可用区部署时，备库1所在的可用区
     */
    public String [] getSlaveZone() {
        return this.SlaveZone;
    }

    /**
     * 设置实例为多可用区部署时，备库1所在的可用区
     * @param SlaveZone 实例为多可用区部署时，备库1所在的可用区
     */
    public void setSlaveZone(String [] SlaveZone) {
        this.SlaveZone = SlaveZone;
    }

    /**
     * 获取实例为多可用区部署时，备库2所在的可用区
     * @return BackupZone 实例为多可用区部署时，备库2所在的可用区
     */
    public String [] getBackupZone() {
        return this.BackupZone;
    }

    /**
     * 设置实例为多可用区部署时，备库2所在的可用区
     * @param BackupZone 实例为多可用区部署时，备库2所在的可用区
     */
    public void setBackupZone(String [] BackupZone) {
        this.BackupZone = BackupZone;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "DeployMode.", this.DeployMode);
        this.setParamArraySimple(map, prefix + "MasterZone.", this.MasterZone);
        this.setParamArraySimple(map, prefix + "SlaveZone.", this.SlaveZone);
        this.setParamArraySimple(map, prefix + "BackupZone.", this.BackupZone);

    }
}

