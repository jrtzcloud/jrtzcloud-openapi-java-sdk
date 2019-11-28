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
package com.tencentcloudapi.dc.v20180410.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDirectConnectsRequest  extends AbstractModel{

    /**
    * 过滤条件:
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 物理专线 ID数组
    */
    @SerializedName("DirectConnectIds")
    @Expose
    private String [] DirectConnectIds;

    /**
    * 偏移量，默认为0
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 返回数量，默认为20，最大值为100
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * 获取过滤条件:
     * @return Filters 过滤条件:
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤条件:
     * @param Filters 过滤条件:
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 获取物理专线 ID数组
     * @return DirectConnectIds 物理专线 ID数组
     */
    public String [] getDirectConnectIds() {
        return this.DirectConnectIds;
    }

    /**
     * 设置物理专线 ID数组
     * @param DirectConnectIds 物理专线 ID数组
     */
    public void setDirectConnectIds(String [] DirectConnectIds) {
        this.DirectConnectIds = DirectConnectIds;
    }

    /**
     * 获取偏移量，默认为0
     * @return Offset 偏移量，默认为0
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，默认为0
     * @param Offset 偏移量，默认为0
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数量，默认为20，最大值为100
     * @return Limit 返回数量，默认为20，最大值为100
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数量，默认为20，最大值为100
     * @param Limit 返回数量，默认为20，最大值为100
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamArraySimple(map, prefix + "DirectConnectIds.", this.DirectConnectIds);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

