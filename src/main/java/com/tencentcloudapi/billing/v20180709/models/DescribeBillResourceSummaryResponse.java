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
package com.tencentcloudapi.billing.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeBillResourceSummaryResponse  extends AbstractModel{

    /**
    * 资源汇总列表
    */
    @SerializedName("ResourceSummarySet")
    @Expose
    private BillResourceSummary [] ResourceSummarySet;

    /**
    * 资源汇总列表总数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Total")
    @Expose
    private Integer Total;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取资源汇总列表
     * @return ResourceSummarySet 资源汇总列表
     */
    public BillResourceSummary [] getResourceSummarySet() {
        return this.ResourceSummarySet;
    }

    /**
     * 设置资源汇总列表
     * @param ResourceSummarySet 资源汇总列表
     */
    public void setResourceSummarySet(BillResourceSummary [] ResourceSummarySet) {
        this.ResourceSummarySet = ResourceSummarySet;
    }

    /**
     * 获取资源汇总列表总数
注意：此字段可能返回 null，表示取不到有效值。
     * @return Total 资源汇总列表总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getTotal() {
        return this.Total;
    }

    /**
     * 设置资源汇总列表总数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Total 资源汇总列表总数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotal(Integer Total) {
        this.Total = Total;
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
        this.setParamArrayObj(map, prefix + "ResourceSummarySet.", this.ResourceSummarySet);
        this.setParamSimple(map, prefix + "Total", this.Total);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

