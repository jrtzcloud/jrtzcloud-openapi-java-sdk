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

public class Quota  extends AbstractModel{

    /**
    * 配额名称，取值范围：<br><li>`TOTAL_EIP_QUOTA`：用户当前地域下EIP的配额数；<br><li>`DAILY_EIP_APPLY`：用户当前地域下今日申购次数；<br><li>`DAILY_PUBLIC_IP_ASSIGN`：用户当前地域下，重新分配公网 IP次数。
    */
    @SerializedName("QuotaId")
    @Expose
    private String QuotaId;

    /**
    * 当前数量
    */
    @SerializedName("QuotaCurrent")
    @Expose
    private Integer QuotaCurrent;

    /**
    * 配额数量
    */
    @SerializedName("QuotaLimit")
    @Expose
    private Integer QuotaLimit;

    /**
     * 获取配额名称，取值范围：<br><li>`TOTAL_EIP_QUOTA`：用户当前地域下EIP的配额数；<br><li>`DAILY_EIP_APPLY`：用户当前地域下今日申购次数；<br><li>`DAILY_PUBLIC_IP_ASSIGN`：用户当前地域下，重新分配公网 IP次数。
     * @return QuotaId 配额名称，取值范围：<br><li>`TOTAL_EIP_QUOTA`：用户当前地域下EIP的配额数；<br><li>`DAILY_EIP_APPLY`：用户当前地域下今日申购次数；<br><li>`DAILY_PUBLIC_IP_ASSIGN`：用户当前地域下，重新分配公网 IP次数。
     */
    public String getQuotaId() {
        return this.QuotaId;
    }

    /**
     * 设置配额名称，取值范围：<br><li>`TOTAL_EIP_QUOTA`：用户当前地域下EIP的配额数；<br><li>`DAILY_EIP_APPLY`：用户当前地域下今日申购次数；<br><li>`DAILY_PUBLIC_IP_ASSIGN`：用户当前地域下，重新分配公网 IP次数。
     * @param QuotaId 配额名称，取值范围：<br><li>`TOTAL_EIP_QUOTA`：用户当前地域下EIP的配额数；<br><li>`DAILY_EIP_APPLY`：用户当前地域下今日申购次数；<br><li>`DAILY_PUBLIC_IP_ASSIGN`：用户当前地域下，重新分配公网 IP次数。
     */
    public void setQuotaId(String QuotaId) {
        this.QuotaId = QuotaId;
    }

    /**
     * 获取当前数量
     * @return QuotaCurrent 当前数量
     */
    public Integer getQuotaCurrent() {
        return this.QuotaCurrent;
    }

    /**
     * 设置当前数量
     * @param QuotaCurrent 当前数量
     */
    public void setQuotaCurrent(Integer QuotaCurrent) {
        this.QuotaCurrent = QuotaCurrent;
    }

    /**
     * 获取配额数量
     * @return QuotaLimit 配额数量
     */
    public Integer getQuotaLimit() {
        return this.QuotaLimit;
    }

    /**
     * 设置配额数量
     * @param QuotaLimit 配额数量
     */
    public void setQuotaLimit(Integer QuotaLimit) {
        this.QuotaLimit = QuotaLimit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "QuotaId", this.QuotaId);
        this.setParamSimple(map, prefix + "QuotaCurrent", this.QuotaCurrent);
        this.setParamSimple(map, prefix + "QuotaLimit", this.QuotaLimit);

    }
}

