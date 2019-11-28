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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBBackupsRequest  extends AbstractModel{

    /**
    * 实例ID，形如postgres-4wdeb0zv。
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 备份方式（1-全量）。目前只支持全量，取值为1。
    */
    @SerializedName("Type")
    @Expose
    private Integer Type;

    /**
    * 查询开始时间，形如2018-06-10 17:06:38，起始时间不得小于7天以前
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 查询结束时间，形如2018-06-10 17:06:38
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 备份列表分页返回，每页返回数量，默认为 20，最小为1，最大值为 100。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 返回结果中的第几页，从第0页开始。默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
     * 获取实例ID，形如postgres-4wdeb0zv。
     * @return DBInstanceId 实例ID，形如postgres-4wdeb0zv。
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * 设置实例ID，形如postgres-4wdeb0zv。
     * @param DBInstanceId 实例ID，形如postgres-4wdeb0zv。
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * 获取备份方式（1-全量）。目前只支持全量，取值为1。
     * @return Type 备份方式（1-全量）。目前只支持全量，取值为1。
     */
    public Integer getType() {
        return this.Type;
    }

    /**
     * 设置备份方式（1-全量）。目前只支持全量，取值为1。
     * @param Type 备份方式（1-全量）。目前只支持全量，取值为1。
     */
    public void setType(Integer Type) {
        this.Type = Type;
    }

    /**
     * 获取查询开始时间，形如2018-06-10 17:06:38，起始时间不得小于7天以前
     * @return StartTime 查询开始时间，形如2018-06-10 17:06:38，起始时间不得小于7天以前
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置查询开始时间，形如2018-06-10 17:06:38，起始时间不得小于7天以前
     * @param StartTime 查询开始时间，形如2018-06-10 17:06:38，起始时间不得小于7天以前
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取查询结束时间，形如2018-06-10 17:06:38
     * @return EndTime 查询结束时间，形如2018-06-10 17:06:38
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置查询结束时间，形如2018-06-10 17:06:38
     * @param EndTime 查询结束时间，形如2018-06-10 17:06:38
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取备份列表分页返回，每页返回数量，默认为 20，最小为1，最大值为 100。
     * @return Limit 备份列表分页返回，每页返回数量，默认为 20，最小为1，最大值为 100。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置备份列表分页返回，每页返回数量，默认为 20，最小为1，最大值为 100。
     * @param Limit 备份列表分页返回，每页返回数量，默认为 20，最小为1，最大值为 100。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取返回结果中的第几页，从第0页开始。默认为0。
     * @return Offset 返回结果中的第几页，从第0页开始。默认为0。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置返回结果中的第几页，从第0页开始。默认为0。
     * @param Offset 返回结果中的第几页，从第0页开始。默认为0。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

