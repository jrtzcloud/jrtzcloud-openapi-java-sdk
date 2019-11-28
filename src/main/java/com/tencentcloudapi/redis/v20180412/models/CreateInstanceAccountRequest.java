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

public class CreateInstanceAccountRequest  extends AbstractModel{

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 子账号名称
    */
    @SerializedName("AccountName")
    @Expose
    private String AccountName;

    /**
    * 子账号密码
    */
    @SerializedName("AccountPassword")
    @Expose
    private String AccountPassword;

    /**
    * 路由策略：填写master或者replication，表示主节点或者从节点
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
    * 读写策略：填写r、w、rw，表示只读、只写、读写
    */
    @SerializedName("Privilege")
    @Expose
    private String Privilege;

    /**
    * 子账号描述信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * 获取实例ID
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取子账号名称
     * @return AccountName 子账号名称
     */
    public String getAccountName() {
        return this.AccountName;
    }

    /**
     * 设置子账号名称
     * @param AccountName 子账号名称
     */
    public void setAccountName(String AccountName) {
        this.AccountName = AccountName;
    }

    /**
     * 获取子账号密码
     * @return AccountPassword 子账号密码
     */
    public String getAccountPassword() {
        return this.AccountPassword;
    }

    /**
     * 设置子账号密码
     * @param AccountPassword 子账号密码
     */
    public void setAccountPassword(String AccountPassword) {
        this.AccountPassword = AccountPassword;
    }

    /**
     * 获取路由策略：填写master或者replication，表示主节点或者从节点
     * @return ReadonlyPolicy 路由策略：填写master或者replication，表示主节点或者从节点
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * 设置路由策略：填写master或者replication，表示主节点或者从节点
     * @param ReadonlyPolicy 路由策略：填写master或者replication，表示主节点或者从节点
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    /**
     * 获取读写策略：填写r、w、rw，表示只读、只写、读写
     * @return Privilege 读写策略：填写r、w、rw，表示只读、只写、读写
     */
    public String getPrivilege() {
        return this.Privilege;
    }

    /**
     * 设置读写策略：填写r、w、rw，表示只读、只写、读写
     * @param Privilege 读写策略：填写r、w、rw，表示只读、只写、读写
     */
    public void setPrivilege(String Privilege) {
        this.Privilege = Privilege;
    }

    /**
     * 获取子账号描述信息
     * @return Remark 子账号描述信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * 设置子账号描述信息
     * @param Remark 子账号描述信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "AccountName", this.AccountName);
        this.setParamSimple(map, prefix + "AccountPassword", this.AccountPassword);
        this.setParamArraySimple(map, prefix + "ReadonlyPolicy.", this.ReadonlyPolicy);
        this.setParamSimple(map, prefix + "Privilege", this.Privilege);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

