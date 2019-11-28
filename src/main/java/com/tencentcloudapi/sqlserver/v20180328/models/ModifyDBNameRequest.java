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

public class ModifyDBNameRequest  extends AbstractModel{

    /**
    * 实例id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 旧数据库名
    */
    @SerializedName("OldDBName")
    @Expose
    private String OldDBName;

    /**
    * 新数据库名
    */
    @SerializedName("NewDBName")
    @Expose
    private String NewDBName;

    /**
     * 获取实例id
     * @return InstanceId 实例id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例id
     * @param InstanceId 实例id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取旧数据库名
     * @return OldDBName 旧数据库名
     */
    public String getOldDBName() {
        return this.OldDBName;
    }

    /**
     * 设置旧数据库名
     * @param OldDBName 旧数据库名
     */
    public void setOldDBName(String OldDBName) {
        this.OldDBName = OldDBName;
    }

    /**
     * 获取新数据库名
     * @return NewDBName 新数据库名
     */
    public String getNewDBName() {
        return this.NewDBName;
    }

    /**
     * 设置新数据库名
     * @param NewDBName 新数据库名
     */
    public void setNewDBName(String NewDBName) {
        this.NewDBName = NewDBName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "OldDBName", this.OldDBName);
        this.setParamSimple(map, prefix + "NewDBName", this.NewDBName);

    }
}

