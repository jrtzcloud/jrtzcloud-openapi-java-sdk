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
package com.tencentcloudapi.iotcloud.v20180614.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeProductsRequest  extends AbstractModel{

    /**
    * 分页偏移，Offset从0开始
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 分页大小，当前页面中显示的最大数量，值范围 10-250。
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 过滤条件
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
     * 获取分页偏移，Offset从0开始
     * @return Offset 分页偏移，Offset从0开始
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置分页偏移，Offset从0开始
     * @param Offset 分页偏移，Offset从0开始
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取分页大小，当前页面中显示的最大数量，值范围 10-250。
     * @return Limit 分页大小，当前页面中显示的最大数量，值范围 10-250。
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置分页大小，当前页面中显示的最大数量，值范围 10-250。
     * @param Limit 分页大小，当前页面中显示的最大数量，值范围 10-250。
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取过滤条件
     * @return Filters 过滤条件
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * 设置过滤条件
     * @param Filters 过滤条件
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);

    }
}

