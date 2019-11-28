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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyTablesRequest  extends AbstractModel{

    /**
    * 待修改表所在应用实例ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 选中的改表IDL文件
    */
    @SerializedName("IdlFiles")
    @Expose
    private IdlFileInfo [] IdlFiles;

    /**
    * 待改表列表
    */
    @SerializedName("SelectedTables")
    @Expose
    private SelectedTableInfo [] SelectedTables;

    /**
     * 获取待修改表所在应用实例ID
     * @return ApplicationId 待修改表所在应用实例ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * 设置待修改表所在应用实例ID
     * @param ApplicationId 待修改表所在应用实例ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * 获取选中的改表IDL文件
     * @return IdlFiles 选中的改表IDL文件
     */
    public IdlFileInfo [] getIdlFiles() {
        return this.IdlFiles;
    }

    /**
     * 设置选中的改表IDL文件
     * @param IdlFiles 选中的改表IDL文件
     */
    public void setIdlFiles(IdlFileInfo [] IdlFiles) {
        this.IdlFiles = IdlFiles;
    }

    /**
     * 获取待改表列表
     * @return SelectedTables 待改表列表
     */
    public SelectedTableInfo [] getSelectedTables() {
        return this.SelectedTables;
    }

    /**
     * 设置待改表列表
     * @param SelectedTables 待改表列表
     */
    public void setSelectedTables(SelectedTableInfo [] SelectedTables) {
        this.SelectedTables = SelectedTables;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamArrayObj(map, prefix + "IdlFiles.", this.IdlFiles);
        this.setParamArrayObj(map, prefix + "SelectedTables.", this.SelectedTables);

    }
}

