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

public class RestoreInstanceRequest  extends AbstractModel{

    /**
    * 实例ID，形如mssql-j8kv137v
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份文件ID，该ID可以通过DescribeBackups接口返回数据中的Id字段获得
    */
    @SerializedName("BackupId")
    @Expose
    private Integer BackupId;

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
     * 获取备份文件ID，该ID可以通过DescribeBackups接口返回数据中的Id字段获得
     * @return BackupId 备份文件ID，该ID可以通过DescribeBackups接口返回数据中的Id字段获得
     */
    public Integer getBackupId() {
        return this.BackupId;
    }

    /**
     * 设置备份文件ID，该ID可以通过DescribeBackups接口返回数据中的Id字段获得
     * @param BackupId 备份文件ID，该ID可以通过DescribeBackups接口返回数据中的Id字段获得
     */
    public void setBackupId(Integer BackupId) {
        this.BackupId = BackupId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "BackupId", this.BackupId);

    }
}

