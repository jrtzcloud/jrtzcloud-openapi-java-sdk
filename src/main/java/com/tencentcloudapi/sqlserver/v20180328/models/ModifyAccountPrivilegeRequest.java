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

public class ModifyAccountPrivilegeRequest  extends AbstractModel{

    /**
    * 数据库实例ID，形如mssql-njj2mtpl
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 账号权限变更信息
    */
    @SerializedName("Accounts")
    @Expose
    private AccountPrivilegeModifyInfo [] Accounts;

    /**
     * 获取数据库实例ID，形如mssql-njj2mtpl
     * @return InstanceId 数据库实例ID，形如mssql-njj2mtpl
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置数据库实例ID，形如mssql-njj2mtpl
     * @param InstanceId 数据库实例ID，形如mssql-njj2mtpl
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取账号权限变更信息
     * @return Accounts 账号权限变更信息
     */
    public AccountPrivilegeModifyInfo [] getAccounts() {
        return this.Accounts;
    }

    /**
     * 设置账号权限变更信息
     * @param Accounts 账号权限变更信息
     */
    public void setAccounts(AccountPrivilegeModifyInfo [] Accounts) {
        this.Accounts = Accounts;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArrayObj(map, prefix + "Accounts.", this.Accounts);

    }
}

