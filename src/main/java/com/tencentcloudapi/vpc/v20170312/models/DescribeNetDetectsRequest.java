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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeNetDetectsRequest  extends AbstractModel{

    /**
    * 网络探测实例`ID`数组。形如：[`netd-12345678`]
    */
    @SerializedName("NetDetectIds")
    @Expose
    private String [] NetDetectIds;

    /**
    * 过滤条件，参数不支持同时指定NetDetectIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-12345678</li>
<li>net-detect-id - String - （过滤条件）网络探测实例ID，形如：netd-12345678</li>
<li>subnet-id - String - （过滤条件）子网实例ID，形如：subnet-12345678</li>
<li>net-detect-name - String - （过滤条件）网络探测名称</li>
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 偏移量，默认为0。
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 返回数量，默认为20，最大值为100。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * 获取网络探测实例`ID`数组。形如：[`netd-12345678`]
     * @return NetDetectIds 网络探测实例`ID`数组。形如：[`netd-12345678`]
     */
    public String [] getNetDetectIds() {
        return this.NetDetectIds;
    }

    /**
     * 设置网络探测实例`ID`数组。形如：[`netd-12345678`]
     * @param NetDetectIds 网络探测实例`ID`数组。形如：[`netd-12345678`]
     */
    public void setNetDetectIds(String [] NetDetectIds) {
        this.NetDetectIds = NetDetectIds;
    }

    /**
     * 获取过滤条件，参数不支持同时指定NetDetectIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-12345678</li>
<li>net-detect-id - String - （过滤条件）网络探测实例ID，形如：netd-12345678</li>
<li>subnet-id - String - （过滤条件）子网实例ID，形如：subnet-12345678</li>
<li>net-detect-name - String - （过滤条件）网络探测名称</li>
     * @return Filters 过滤条件，参数不支持同时指定NetDetectIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-12345678</li>
<li>net-detect-id - String - （过滤条件）网络探测实例ID，形如：netd-12345678</li>
<li>subnet-id - String - （过滤条件）子网实例ID，形如：subnet-12345678</li>
<li>net-detect-name - String - （过滤条件）网络探测名称</li>
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤条件，参数不支持同时指定NetDetectIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-12345678</li>
<li>net-detect-id - String - （过滤条件）网络探测实例ID，形如：netd-12345678</li>
<li>subnet-id - String - （过滤条件）子网实例ID，形如：subnet-12345678</li>
<li>net-detect-name - String - （过滤条件）网络探测名称</li>
     * @param Filters 过滤条件，参数不支持同时指定NetDetectIds和Filters。
<li>vpc-id - String - （过滤条件）VPC实例ID，形如：vpc-12345678</li>
<li>net-detect-id - String - （过滤条件）网络探测实例ID，形如：netd-12345678</li>
<li>subnet-id - String - （过滤条件）子网实例ID，形如：subnet-12345678</li>
<li>net-detect-name - String - （过滤条件）网络探测名称</li>
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 获取偏移量，默认为0。
     * @return Offset 偏移量，默认为0。
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量，默认为0。
     * @param Offset 偏移量，默认为0。
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数量，默认为20，最大值为100。
     * @return Limit 返回数量，默认为20，最大值为100。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数量，默认为20，最大值为100。
     * @param Limit 返回数量，默认为20，最大值为100。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "NetDetectIds.", this.NetDetectIds);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

