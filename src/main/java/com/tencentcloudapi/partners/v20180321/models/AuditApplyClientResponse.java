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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AuditApplyClientResponse  extends AbstractModel{

    /**
    * 代理商账号ID
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 客户账号ID
    */
    @SerializedName("ClientUin")
    @Expose
    private String ClientUin;

    /**
    * 审核结果，包括accept/reject/qcloudaudit（腾讯云审核）
    */
    @SerializedName("AuditResult")
    @Expose
    private String AuditResult;

    /**
    * 关联时间对应的时间戳
    */
    @SerializedName("AgentTime")
    @Expose
    private Integer AgentTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取代理商账号ID
     * @return Uin 代理商账号ID
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * 设置代理商账号ID
     * @param Uin 代理商账号ID
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * 获取客户账号ID
     * @return ClientUin 客户账号ID
     */
    public String getClientUin() {
        return this.ClientUin;
    }

    /**
     * 设置客户账号ID
     * @param ClientUin 客户账号ID
     */
    public void setClientUin(String ClientUin) {
        this.ClientUin = ClientUin;
    }

    /**
     * 获取审核结果，包括accept/reject/qcloudaudit（腾讯云审核）
     * @return AuditResult 审核结果，包括accept/reject/qcloudaudit（腾讯云审核）
     */
    public String getAuditResult() {
        return this.AuditResult;
    }

    /**
     * 设置审核结果，包括accept/reject/qcloudaudit（腾讯云审核）
     * @param AuditResult 审核结果，包括accept/reject/qcloudaudit（腾讯云审核）
     */
    public void setAuditResult(String AuditResult) {
        this.AuditResult = AuditResult;
    }

    /**
     * 获取关联时间对应的时间戳
     * @return AgentTime 关联时间对应的时间戳
     */
    public Integer getAgentTime() {
        return this.AgentTime;
    }

    /**
     * 设置关联时间对应的时间戳
     * @param AgentTime 关联时间对应的时间戳
     */
    public void setAgentTime(Integer AgentTime) {
        this.AgentTime = AgentTime;
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
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "ClientUin", this.ClientUin);
        this.setParamSimple(map, prefix + "AuditResult", this.AuditResult);
        this.setParamSimple(map, prefix + "AgentTime", this.AgentTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

