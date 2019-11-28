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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabaseTableResponse  extends AbstractModel{

    /**
    * 实例名称。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 数据库名称。
    */
    @SerializedName("DbName")
    @Expose
    private String DbName;

    /**
    * 表名称。
    */
    @SerializedName("Table")
    @Expose
    private String Table;

    /**
    * 列信息。
    */
    @SerializedName("Cols")
    @Expose
    private TableColumn [] Cols;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取实例名称。
     * @return InstanceId 实例名称。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例名称。
     * @param InstanceId 实例名称。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取数据库名称。
     * @return DbName 数据库名称。
     */
    public String getDbName() {
        return this.DbName;
    }

    /**
     * 设置数据库名称。
     * @param DbName 数据库名称。
     */
    public void setDbName(String DbName) {
        this.DbName = DbName;
    }

    /**
     * 获取表名称。
     * @return Table 表名称。
     */
    public String getTable() {
        return this.Table;
    }

    /**
     * 设置表名称。
     * @param Table 表名称。
     */
    public void setTable(String Table) {
        this.Table = Table;
    }

    /**
     * 获取列信息。
     * @return Cols 列信息。
     */
    public TableColumn [] getCols() {
        return this.Cols;
    }

    /**
     * 设置列信息。
     * @param Cols 列信息。
     */
    public void setCols(TableColumn [] Cols) {
        this.Cols = Cols;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "DbName", this.DbName);
        this.setParamSimple(map, prefix + "Table", this.Table);
        this.setParamArrayObj(map, prefix + "Cols.", this.Cols);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

