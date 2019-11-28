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

public class DescribeClassicLinkInstancesRequest  extends AbstractModel{

    /**
    * 过滤条件。
<li>vpc-id - String - （过滤条件）VPC实例ID。</li>
<li>vm-ip - String - （过滤条件）基础网络云主机IP。</li>
    */
    @SerializedName("Filters")
    @Expose
    private FilterObject [] Filters;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private String Offset;

    /**
    * 返回数量
    */
    @SerializedName("Limit")
    @Expose
    private String Limit;

    /**
     * 获取过滤条件。
<li>vpc-id - String - （过滤条件）VPC实例ID。</li>
<li>vm-ip - String - （过滤条件）基础网络云主机IP。</li>
     * @return Filters 过滤条件。
<li>vpc-id - String - （过滤条件）VPC实例ID。</li>
<li>vm-ip - String - （过滤条件）基础网络云主机IP。</li>
     */
    public FilterObject [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤条件。
<li>vpc-id - String - （过滤条件）VPC实例ID。</li>
<li>vm-ip - String - （过滤条件）基础网络云主机IP。</li>
     * @param Filters 过滤条件。
<li>vpc-id - String - （过滤条件）VPC实例ID。</li>
<li>vm-ip - String - （过滤条件）基础网络云主机IP。</li>
     */
    public void setFilters(FilterObject [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 获取偏移量
     * @return Offset 偏移量
     */
    public String getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量
     * @param Offset 偏移量
     */
    public void setOffset(String Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取返回数量
     * @return Limit 返回数量
     */
    public String getLimit() {
        return this.Limit;
    }

    /**
     * 设置返回数量
     * @param Limit 返回数量
     */
    public void setLimit(String Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

