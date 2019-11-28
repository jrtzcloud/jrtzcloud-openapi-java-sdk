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

public class ModifyTableQuotasRequest  extends AbstractModel{

    /**
    * 带扩缩容表所属应用实例ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 已选中待修改的表配额列表
    */
    @SerializedName("TableQuotas")
    @Expose
    private SelectedTableInfo [] TableQuotas;

    /**
     * 获取带扩缩容表所属应用实例ID
     * @return ApplicationId 带扩缩容表所属应用实例ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * 设置带扩缩容表所属应用实例ID
     * @param ApplicationId 带扩缩容表所属应用实例ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * 获取已选中待修改的表配额列表
     * @return TableQuotas 已选中待修改的表配额列表
     */
    public SelectedTableInfo [] getTableQuotas() {
        return this.TableQuotas;
    }

    /**
     * 设置已选中待修改的表配额列表
     * @param TableQuotas 已选中待修改的表配额列表
     */
    public void setTableQuotas(SelectedTableInfo [] TableQuotas) {
        this.TableQuotas = TableQuotas;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamArrayObj(map, prefix + "TableQuotas.", this.TableQuotas);

    }
}

