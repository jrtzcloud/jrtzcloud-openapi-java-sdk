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
package com.tencentcloudapi.cdb.v20170320.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDatabasesRequest  extends AbstractModel{

    /**
    * 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 偏移量，最小值为0。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 单次请求数量，默认值为20，最小值为1，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 匹配数据库库名的正则表达式，规则同 MySQL 官网
    */
    @SerializedName("DatabaseRegexp")
    @Expose
    private String DatabaseRegexp;

    /**
     * 获取实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     * @return InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     * @param InstanceId 实例 ID，格式如：cdb-c1nl9rpv，与云数据库控制台页面中显示的实例 ID 相同。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取偏移量，最小值为0。
     * @return Offset 偏移量，最小值为0。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，最小值为0。
     * @param Offset 偏移量，最小值为0。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取单次请求数量，默认值为20，最小值为1，最大值为100。
     * @return Limit 单次请求数量，默认值为20，最小值为1，最大值为100。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置单次请求数量，默认值为20，最小值为1，最大值为100。
     * @param Limit 单次请求数量，默认值为20，最小值为1，最大值为100。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取匹配数据库库名的正则表达式，规则同 MySQL 官网
     * @return DatabaseRegexp 匹配数据库库名的正则表达式，规则同 MySQL 官网
     */
    public String getDatabaseRegexp() {
        return this.DatabaseRegexp;
    }

    /**
     * 设置匹配数据库库名的正则表达式，规则同 MySQL 官网
     * @param DatabaseRegexp 匹配数据库库名的正则表达式，规则同 MySQL 官网
     */
    public void setDatabaseRegexp(String DatabaseRegexp) {
        this.DatabaseRegexp = DatabaseRegexp;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "DatabaseRegexp", this.DatabaseRegexp);

    }
}

