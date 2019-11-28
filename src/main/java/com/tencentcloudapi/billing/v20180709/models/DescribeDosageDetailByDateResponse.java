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

public class DescribeDosageDetailByDateResponse  extends AbstractModel{

    /**
    * 计量单位
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Unit")
    @Expose
    private String Unit;

    /**
    * 用量数组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DetailSets")
    @Expose
    private DetailSet [] DetailSets;

    /**
    * 错误码
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetCode")
    @Expose
    private Integer RetCode;

    /**
    * 错误信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RetMsg")
    @Expose
    private String RetMsg;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取计量单位
注意：此字段可能返回 null，表示取不到有效值。
     * @return Unit 计量单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUnit() {
        return this.Unit;
    }

    /**
     * 设置计量单位
注意：此字段可能返回 null，表示取不到有效值。
     * @param Unit 计量单位
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUnit(String Unit) {
        this.Unit = Unit;
    }

    /**
     * 获取用量数组
注意：此字段可能返回 null，表示取不到有效值。
     * @return DetailSets 用量数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DetailSet [] getDetailSets() {
        return this.DetailSets;
    }

    /**
     * 设置用量数组
注意：此字段可能返回 null，表示取不到有效值。
     * @param DetailSets 用量数组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDetailSets(DetailSet [] DetailSets) {
        this.DetailSets = DetailSets;
    }

    /**
     * 获取错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @return RetCode 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Integer getRetCode() {
        return this.RetCode;
    }

    /**
     * 设置错误码
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetCode 错误码
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetCode(Integer RetCode) {
        this.RetCode = RetCode;
    }

    /**
     * 获取错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @return RetMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRetMsg() {
        return this.RetMsg;
    }

    /**
     * 设置错误信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param RetMsg 错误信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRetMsg(String RetMsg) {
        this.RetMsg = RetMsg;
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
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamArrayObj(map, prefix + "DetailSets.", this.DetailSets);
        this.setParamSimple(map, prefix + "RetCode", this.RetCode);
        this.setParamSimple(map, prefix + "RetMsg", this.RetMsg);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

