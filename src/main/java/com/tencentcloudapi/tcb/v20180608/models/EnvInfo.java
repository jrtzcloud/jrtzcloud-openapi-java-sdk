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
package com.tencentcloudapi.tcb.v20180608.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnvInfo  extends AbstractModel{

    /**
    * 账户下该环境唯一标识
    */
    @SerializedName("EnvId")
    @Expose
    private String EnvId;

    /**
    * 环境来源。包含以下取值：
<li>miniapp：微信小程序</li>
<li>qcloud ：腾讯云</li>
    */
    @SerializedName("Source")
    @Expose
    private String Source;

    /**
    * 环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符
    */
    @SerializedName("Alias")
    @Expose
    private String Alias;

    /**
    * 创建时间
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 最后修改时间
    */
    @SerializedName("UpdateTime")
    @Expose
    private String UpdateTime;

    /**
    * 环境状态。包含以下取值：
<li>NORMAL：正常可用</li>
<li>HALTED：停服，用量超限或后台封禁</li>
<li>UNAVAILABLE：服务不可用，可能是尚未初始化或者初始化过程中</li>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 数据库列表
    */
    @SerializedName("Databases")
    @Expose
    private DatabasesInfo [] Databases;

    /**
    * 存储列表
    */
    @SerializedName("Storages")
    @Expose
    private StorageInfo [] Storages;

    /**
    * 函数列表
    */
    @SerializedName("Functions")
    @Expose
    private FunctionInfo [] Functions;

    /**
    * tcb产品套餐ID，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageId")
    @Expose
    private String PackageId;

    /**
    * 套餐中文名称，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PackageName")
    @Expose
    private String PackageName;

    /**
     * 获取账户下该环境唯一标识
     * @return EnvId 账户下该环境唯一标识
     */
    public String getEnvId() {
        return this.EnvId;
    }

    /**
     * 设置账户下该环境唯一标识
     * @param EnvId 账户下该环境唯一标识
     */
    public void setEnvId(String EnvId) {
        this.EnvId = EnvId;
    }

    /**
     * 获取环境来源。包含以下取值：
<li>miniapp：微信小程序</li>
<li>qcloud ：腾讯云</li>
     * @return Source 环境来源。包含以下取值：
<li>miniapp：微信小程序</li>
<li>qcloud ：腾讯云</li>
     */
    public String getSource() {
        return this.Source;
    }

    /**
     * 设置环境来源。包含以下取值：
<li>miniapp：微信小程序</li>
<li>qcloud ：腾讯云</li>
     * @param Source 环境来源。包含以下取值：
<li>miniapp：微信小程序</li>
<li>qcloud ：腾讯云</li>
     */
    public void setSource(String Source) {
        this.Source = Source;
    }

    /**
     * 获取环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符
     * @return Alias 环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符
     */
    public String getAlias() {
        return this.Alias;
    }

    /**
     * 设置环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符
     * @param Alias 环境别名，要以a-z开头，不能包含 a-zA-z0-9- 以外的字符
     */
    public void setAlias(String Alias) {
        this.Alias = Alias;
    }

    /**
     * 获取创建时间
     * @return CreateTime 创建时间
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置创建时间
     * @param CreateTime 创建时间
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取最后修改时间
     * @return UpdateTime 最后修改时间
     */
    public String getUpdateTime() {
        return this.UpdateTime;
    }

    /**
     * 设置最后修改时间
     * @param UpdateTime 最后修改时间
     */
    public void setUpdateTime(String UpdateTime) {
        this.UpdateTime = UpdateTime;
    }

    /**
     * 获取环境状态。包含以下取值：
<li>NORMAL：正常可用</li>
<li>HALTED：停服，用量超限或后台封禁</li>
<li>UNAVAILABLE：服务不可用，可能是尚未初始化或者初始化过程中</li>
     * @return Status 环境状态。包含以下取值：
<li>NORMAL：正常可用</li>
<li>HALTED：停服，用量超限或后台封禁</li>
<li>UNAVAILABLE：服务不可用，可能是尚未初始化或者初始化过程中</li>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置环境状态。包含以下取值：
<li>NORMAL：正常可用</li>
<li>HALTED：停服，用量超限或后台封禁</li>
<li>UNAVAILABLE：服务不可用，可能是尚未初始化或者初始化过程中</li>
     * @param Status 环境状态。包含以下取值：
<li>NORMAL：正常可用</li>
<li>HALTED：停服，用量超限或后台封禁</li>
<li>UNAVAILABLE：服务不可用，可能是尚未初始化或者初始化过程中</li>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取数据库列表
     * @return Databases 数据库列表
     */
    public DatabasesInfo [] getDatabases() {
        return this.Databases;
    }

    /**
     * 设置数据库列表
     * @param Databases 数据库列表
     */
    public void setDatabases(DatabasesInfo [] Databases) {
        this.Databases = Databases;
    }

    /**
     * 获取存储列表
     * @return Storages 存储列表
     */
    public StorageInfo [] getStorages() {
        return this.Storages;
    }

    /**
     * 设置存储列表
     * @param Storages 存储列表
     */
    public void setStorages(StorageInfo [] Storages) {
        this.Storages = Storages;
    }

    /**
     * 获取函数列表
     * @return Functions 函数列表
     */
    public FunctionInfo [] getFunctions() {
        return this.Functions;
    }

    /**
     * 设置函数列表
     * @param Functions 函数列表
     */
    public void setFunctions(FunctionInfo [] Functions) {
        this.Functions = Functions;
    }

    /**
     * 获取tcb产品套餐ID，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
     * @return PackageId tcb产品套餐ID，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageId() {
        return this.PackageId;
    }

    /**
     * 设置tcb产品套餐ID，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageId tcb产品套餐ID，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageId(String PackageId) {
        this.PackageId = PackageId;
    }

    /**
     * 获取套餐中文名称，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
     * @return PackageName 套餐中文名称，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPackageName() {
        return this.PackageName;
    }

    /**
     * 设置套餐中文名称，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
     * @param PackageName 套餐中文名称，参考DescribePackages接口的返回值。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPackageName(String PackageName) {
        this.PackageName = PackageName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "EnvId", this.EnvId);
        this.setParamSimple(map, prefix + "Source", this.Source);
        this.setParamSimple(map, prefix + "Alias", this.Alias);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "UpdateTime", this.UpdateTime);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Databases.", this.Databases);
        this.setParamArrayObj(map, prefix + "Storages.", this.Storages);
        this.setParamArrayObj(map, prefix + "Functions.", this.Functions);
        this.setParamSimple(map, prefix + "PackageId", this.PackageId);
        this.setParamSimple(map, prefix + "PackageName", this.PackageName);

    }
}

