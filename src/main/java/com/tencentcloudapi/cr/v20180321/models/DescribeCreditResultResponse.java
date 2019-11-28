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
package com.tencentcloudapi.cr.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCreditResultResponse  extends AbstractModel{

    /**
    * <p>呼叫结果，取值范围：</p><ul style="margin-bottom:0px;"><li>NON：接通</li><li>DBU：号码忙</li><li>DRF：不在服务区</li><li>ANA：欠费未接听</li><li>REJ：拒接</li><li>SHU：关机</li><li>NAN：空号</li><li>HAL：停机</li><li>DAD：未接听</li><li>EXE：其他异常</li></ul>
    */
    @SerializedName("ResultCode")
    @Expose
    private String ResultCode;

    /**
    * 客户标识代码，多个标识码以英文逗号分隔，ResultCode为NON时才有。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientCode")
    @Expose
    private String ClientCode;

    /**
    * 开始振铃时间，ResultCode为NON或DAD时才有此字段。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RingStartTime")
    @Expose
    private String RingStartTime;

    /**
    * 振铃时长
    */
    @SerializedName("RingDuration")
    @Expose
    private Integer RingDuration;

    /**
    * 接通时长
    */
    @SerializedName("AnswerDuration")
    @Expose
    private Integer AnswerDuration;

    /**
    * JSON格式的扩展信息字段，ResultCode为NON时才有。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContextValue")
    @Expose
    private String ContextValue;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取<p>呼叫结果，取值范围：</p><ul style="margin-bottom:0px;"><li>NON：接通</li><li>DBU：号码忙</li><li>DRF：不在服务区</li><li>ANA：欠费未接听</li><li>REJ：拒接</li><li>SHU：关机</li><li>NAN：空号</li><li>HAL：停机</li><li>DAD：未接听</li><li>EXE：其他异常</li></ul>
     * @return ResultCode <p>呼叫结果，取值范围：</p><ul style="margin-bottom:0px;"><li>NON：接通</li><li>DBU：号码忙</li><li>DRF：不在服务区</li><li>ANA：欠费未接听</li><li>REJ：拒接</li><li>SHU：关机</li><li>NAN：空号</li><li>HAL：停机</li><li>DAD：未接听</li><li>EXE：其他异常</li></ul>
     */
    public String getResultCode() {
        return this.ResultCode;
    }

    /**
     * 设置<p>呼叫结果，取值范围：</p><ul style="margin-bottom:0px;"><li>NON：接通</li><li>DBU：号码忙</li><li>DRF：不在服务区</li><li>ANA：欠费未接听</li><li>REJ：拒接</li><li>SHU：关机</li><li>NAN：空号</li><li>HAL：停机</li><li>DAD：未接听</li><li>EXE：其他异常</li></ul>
     * @param ResultCode <p>呼叫结果，取值范围：</p><ul style="margin-bottom:0px;"><li>NON：接通</li><li>DBU：号码忙</li><li>DRF：不在服务区</li><li>ANA：欠费未接听</li><li>REJ：拒接</li><li>SHU：关机</li><li>NAN：空号</li><li>HAL：停机</li><li>DAD：未接听</li><li>EXE：其他异常</li></ul>
     */
    public void setResultCode(String ResultCode) {
        this.ResultCode = ResultCode;
    }

    /**
     * 获取客户标识代码，多个标识码以英文逗号分隔，ResultCode为NON时才有。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClientCode 客户标识代码，多个标识码以英文逗号分隔，ResultCode为NON时才有。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientCode() {
        return this.ClientCode;
    }

    /**
     * 设置客户标识代码，多个标识码以英文逗号分隔，ResultCode为NON时才有。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientCode 客户标识代码，多个标识码以英文逗号分隔，ResultCode为NON时才有。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientCode(String ClientCode) {
        this.ClientCode = ClientCode;
    }

    /**
     * 获取开始振铃时间，ResultCode为NON或DAD时才有此字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @return RingStartTime 开始振铃时间，ResultCode为NON或DAD时才有此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRingStartTime() {
        return this.RingStartTime;
    }

    /**
     * 设置开始振铃时间，ResultCode为NON或DAD时才有此字段。
注意：此字段可能返回 null，表示取不到有效值。
     * @param RingStartTime 开始振铃时间，ResultCode为NON或DAD时才有此字段。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRingStartTime(String RingStartTime) {
        this.RingStartTime = RingStartTime;
    }

    /**
     * 获取振铃时长
     * @return RingDuration 振铃时长
     */
    public Integer getRingDuration() {
        return this.RingDuration;
    }

    /**
     * 设置振铃时长
     * @param RingDuration 振铃时长
     */
    public void setRingDuration(Integer RingDuration) {
        this.RingDuration = RingDuration;
    }

    /**
     * 获取接通时长
     * @return AnswerDuration 接通时长
     */
    public Integer getAnswerDuration() {
        return this.AnswerDuration;
    }

    /**
     * 设置接通时长
     * @param AnswerDuration 接通时长
     */
    public void setAnswerDuration(Integer AnswerDuration) {
        this.AnswerDuration = AnswerDuration;
    }

    /**
     * 获取JSON格式的扩展信息字段，ResultCode为NON时才有。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ContextValue JSON格式的扩展信息字段，ResultCode为NON时才有。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getContextValue() {
        return this.ContextValue;
    }

    /**
     * 设置JSON格式的扩展信息字段，ResultCode为NON时才有。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContextValue JSON格式的扩展信息字段，ResultCode为NON时才有。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContextValue(String ContextValue) {
        this.ContextValue = ContextValue;
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
        this.setParamSimple(map, prefix + "ResultCode", this.ResultCode);
        this.setParamSimple(map, prefix + "ClientCode", this.ClientCode);
        this.setParamSimple(map, prefix + "RingStartTime", this.RingStartTime);
        this.setParamSimple(map, prefix + "RingDuration", this.RingDuration);
        this.setParamSimple(map, prefix + "AnswerDuration", this.AnswerDuration);
        this.setParamSimple(map, prefix + "ContextValue", this.ContextValue);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

