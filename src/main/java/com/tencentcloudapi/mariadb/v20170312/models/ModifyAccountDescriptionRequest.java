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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAccountDescriptionRequest  extends AbstractModel{

    /**
    * 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 登录用户名。
    */
    @SerializedName("UserName")
    @Expose
    private String UserName;

    /**
    * 用户允许的访问 host，用户名+host唯一确定一个账号。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 新的账号备注，长度 0~256。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * 获取实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     * @return InstanceId 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     * @param InstanceId 实例 ID，形如：tdsql-ow728lmc，可以通过 DescribeDBInstances 查询实例详情获得。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取登录用户名。
     * @return UserName 登录用户名。
     */
    public String getUserName() {
        return this.UserName;
    }

    /**
     * 设置登录用户名。
     * @param UserName 登录用户名。
     */
    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    /**
     * 获取用户允许的访问 host，用户名+host唯一确定一个账号。
     * @return Host 用户允许的访问 host，用户名+host唯一确定一个账号。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * 设置用户允许的访问 host，用户名+host唯一确定一个账号。
     * @param Host 用户允许的访问 host，用户名+host唯一确定一个账号。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * 获取新的账号备注，长度 0~256。
     * @return Description 新的账号备注，长度 0~256。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置新的账号备注，长度 0~256。
     * @param Description 新的账号备注，长度 0~256。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "UserName", this.UserName);
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

