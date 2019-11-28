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

public class DescribeAccountsRequest  extends AbstractModel{

    /**
    * 实例ID，形如postgres-6fego161
    */
    @SerializedName("DBInstanceId")
    @Expose
    private String DBInstanceId;

    /**
    * 分页返回，每页最大返回数目，默认20，取值范围为1-100
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 分页返回，返回第几页的用户数据。页码从0开始计数
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 返回数据按照创建时间或者用户名排序。取值只能为createTime或者name。createTime-按照创建时间排序；name-按照用户名排序
    */
    @SerializedName("OrderBy")
    @Expose
    private String OrderBy;

    /**
    * 返回结果是升序还是降序。取值只能为desc或者asc。desc-降序；asc-升序
    */
    @SerializedName("OrderByType")
    @Expose
    private String OrderByType;

    /**
     * 获取实例ID，形如postgres-6fego161
     * @return DBInstanceId 实例ID，形如postgres-6fego161
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * 设置实例ID，形如postgres-6fego161
     * @param DBInstanceId 实例ID，形如postgres-6fego161
     */
    public void setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
    }

    /**
     * 获取分页返回，每页最大返回数目，默认20，取值范围为1-100
     * @return Limit 分页返回，每页最大返回数目，默认20，取值范围为1-100
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置分页返回，每页最大返回数目，默认20，取值范围为1-100
     * @param Limit 分页返回，每页最大返回数目，默认20，取值范围为1-100
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取分页返回，返回第几页的用户数据。页码从0开始计数
     * @return Offset 分页返回，返回第几页的用户数据。页码从0开始计数
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置分页返回，返回第几页的用户数据。页码从0开始计数
     * @param Offset 分页返回，返回第几页的用户数据。页码从0开始计数
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数据按照创建时间或者用户名排序。取值只能为createTime或者name。createTime-按照创建时间排序；name-按照用户名排序
     * @return OrderBy 返回数据按照创建时间或者用户名排序。取值只能为createTime或者name。createTime-按照创建时间排序；name-按照用户名排序
     */
    public String getOrderBy() {
        return this.OrderBy;
    }

    /**
     * 设置返回数据按照创建时间或者用户名排序。取值只能为createTime或者name。createTime-按照创建时间排序；name-按照用户名排序
     * @param OrderBy 返回数据按照创建时间或者用户名排序。取值只能为createTime或者name。createTime-按照创建时间排序；name-按照用户名排序
     */
    public void setOrderBy(String OrderBy) {
        this.OrderBy = OrderBy;
    }

    /**
     * 获取返回结果是升序还是降序。取值只能为desc或者asc。desc-降序；asc-升序
     * @return OrderByType 返回结果是升序还是降序。取值只能为desc或者asc。desc-降序；asc-升序
     */
    public String getOrderByType() {
        return this.OrderByType;
    }

    /**
     * 设置返回结果是升序还是降序。取值只能为desc或者asc。desc-降序；asc-升序
     * @param OrderByType 返回结果是升序还是降序。取值只能为desc或者asc。desc-降序；asc-升序
     */
    public void setOrderByType(String OrderByType) {
        this.OrderByType = OrderByType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DBInstanceId", this.DBInstanceId);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "OrderBy", this.OrderBy);
        this.setParamSimple(map, prefix + "OrderByType", this.OrderByType);

    }
}

