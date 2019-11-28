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

public class DescribeBillSummaryByProductResponse  extends AbstractModel{

    /**
    * 数据是否准备好，0未准备好，1准备好
    */
    @SerializedName("Ready")
    @Expose
    private Integer Ready;

    /**
    * 总花费详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SummaryTotal")
    @Expose
    private BusinessSummaryTotal SummaryTotal;

    /**
    * 各产品花费分布
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SummaryOverview")
    @Expose
    private BusinessSummaryOverviewItem [] SummaryOverview;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取数据是否准备好，0未准备好，1准备好
     * @return Ready 数据是否准备好，0未准备好，1准备好
     */
    public Integer getReady() {
        return this.Ready;
    }

    /**
     * 设置数据是否准备好，0未准备好，1准备好
     * @param Ready 数据是否准备好，0未准备好，1准备好
     */
    public void setReady(Integer Ready) {
        this.Ready = Ready;
    }

    /**
     * 获取总花费详情
注意：此字段可能返回 null，表示取不到有效值。
     * @return SummaryTotal 总花费详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BusinessSummaryTotal getSummaryTotal() {
        return this.SummaryTotal;
    }

    /**
     * 设置总花费详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param SummaryTotal 总花费详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummaryTotal(BusinessSummaryTotal SummaryTotal) {
        this.SummaryTotal = SummaryTotal;
    }

    /**
     * 获取各产品花费分布
注意：此字段可能返回 null，表示取不到有效值。
     * @return SummaryOverview 各产品花费分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BusinessSummaryOverviewItem [] getSummaryOverview() {
        return this.SummaryOverview;
    }

    /**
     * 设置各产品花费分布
注意：此字段可能返回 null，表示取不到有效值。
     * @param SummaryOverview 各产品花费分布
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSummaryOverview(BusinessSummaryOverviewItem [] SummaryOverview) {
        this.SummaryOverview = SummaryOverview;
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
        this.setParamSimple(map, prefix + "Ready", this.Ready);
        this.setParamObj(map, prefix + "SummaryTotal.", this.SummaryTotal);
        this.setParamArrayObj(map, prefix + "SummaryOverview.", this.SummaryOverview);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

