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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserCmdTasksRequest  extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 数量限制
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 排序字段，支持： RunBeginTime,RunEndTime,InstanceCount,SuccessCount,FailureCount
    */
    @SerializedName("OrderField")
    @Expose
    private String OrderField;

    /**
    * 排序方式，取值: 1倒序，0顺序；默认倒序
    */
    @SerializedName("Order")
    @Expose
    private Integer Order;

    /**
     * 获取偏移量
     * @return Offset 偏移量
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取数量限制
     * @return Limit 数量限制
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置数量限制
     * @param Limit 数量限制
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取排序字段，支持： RunBeginTime,RunEndTime,InstanceCount,SuccessCount,FailureCount
     * @return OrderField 排序字段，支持： RunBeginTime,RunEndTime,InstanceCount,SuccessCount,FailureCount
     */
    public String getOrderField() {
        return this.OrderField;
    }

    /**
     * 设置排序字段，支持： RunBeginTime,RunEndTime,InstanceCount,SuccessCount,FailureCount
     * @param OrderField 排序字段，支持： RunBeginTime,RunEndTime,InstanceCount,SuccessCount,FailureCount
     */
    public void setOrderField(String OrderField) {
        this.OrderField = OrderField;
    }

    /**
     * 获取排序方式，取值: 1倒序，0顺序；默认倒序
     * @return Order 排序方式，取值: 1倒序，0顺序；默认倒序
     */
    public Integer getOrder() {
        return this.Order;
    }

    /**
     * 设置排序方式，取值: 1倒序，0顺序；默认倒序
     * @param Order 排序方式，取值: 1倒序，0顺序；默认倒序
     */
    public void setOrder(Integer Order) {
        this.Order = Order;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "OrderField", this.OrderField);
        this.setParamSimple(map, prefix + "Order", this.Order);

    }
}

