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
package com.tencentcloudapi.sqlserver.v20180328.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UpgradeDBInstanceRequest  extends AbstractModel{

    /**
    * 实例ID，形如mssql-j8kv137v
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 实例升级后内存大小，单位GB，其值不能小于当前实例内存大小
    */
    @SerializedName("Memory")
    @Expose
    private Integer Memory;

    /**
    * 实例升级后磁盘大小，单位GB，其值不能小于当前实例磁盘大小
    */
    @SerializedName("Storage")
    @Expose
    private Integer Storage;

    /**
    * 是否自动使用代金券，0 - 不使用；1 - 默认使用。取值默认为0
    */
    @SerializedName("AutoVoucher")
    @Expose
    private Integer AutoVoucher;

    /**
    * 代金券ID，目前单个订单只能使用一张代金券
    */
    @SerializedName("VoucherIds")
    @Expose
    private String [] VoucherIds;

    /**
     * 获取实例ID，形如mssql-j8kv137v
     * @return InstanceId 实例ID，形如mssql-j8kv137v
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID，形如mssql-j8kv137v
     * @param InstanceId 实例ID，形如mssql-j8kv137v
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取实例升级后内存大小，单位GB，其值不能小于当前实例内存大小
     * @return Memory 实例升级后内存大小，单位GB，其值不能小于当前实例内存大小
     */
    public Integer getMemory() {
        return this.Memory;
    }

    /**
     * 设置实例升级后内存大小，单位GB，其值不能小于当前实例内存大小
     * @param Memory 实例升级后内存大小，单位GB，其值不能小于当前实例内存大小
     */
    public void setMemory(Integer Memory) {
        this.Memory = Memory;
    }

    /**
     * 获取实例升级后磁盘大小，单位GB，其值不能小于当前实例磁盘大小
     * @return Storage 实例升级后磁盘大小，单位GB，其值不能小于当前实例磁盘大小
     */
    public Integer getStorage() {
        return this.Storage;
    }

    /**
     * 设置实例升级后磁盘大小，单位GB，其值不能小于当前实例磁盘大小
     * @param Storage 实例升级后磁盘大小，单位GB，其值不能小于当前实例磁盘大小
     */
    public void setStorage(Integer Storage) {
        this.Storage = Storage;
    }

    /**
     * 获取是否自动使用代金券，0 - 不使用；1 - 默认使用。取值默认为0
     * @return AutoVoucher 是否自动使用代金券，0 - 不使用；1 - 默认使用。取值默认为0
     */
    public Integer getAutoVoucher() {
        return this.AutoVoucher;
    }

    /**
     * 设置是否自动使用代金券，0 - 不使用；1 - 默认使用。取值默认为0
     * @param AutoVoucher 是否自动使用代金券，0 - 不使用；1 - 默认使用。取值默认为0
     */
    public void setAutoVoucher(Integer AutoVoucher) {
        this.AutoVoucher = AutoVoucher;
    }

    /**
     * 获取代金券ID，目前单个订单只能使用一张代金券
     * @return VoucherIds 代金券ID，目前单个订单只能使用一张代金券
     */
    public String [] getVoucherIds() {
        return this.VoucherIds;
    }

    /**
     * 设置代金券ID，目前单个订单只能使用一张代金券
     * @param VoucherIds 代金券ID，目前单个订单只能使用一张代金券
     */
    public void setVoucherIds(String [] VoucherIds) {
        this.VoucherIds = VoucherIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Memory", this.Memory);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "AutoVoucher", this.AutoVoucher);
        this.setParamArraySimple(map, prefix + "VoucherIds.", this.VoucherIds);

    }
}

