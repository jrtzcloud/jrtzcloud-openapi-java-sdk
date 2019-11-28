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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ReservedInstances  extends AbstractModel{

    /**
    * 已购买的预留实例计费ID。形如：650c138f-ae7e-4750-952a-96841d6e9fc1。
    */
    @SerializedName("ReservedInstancesId")
    @Expose
    private String ReservedInstancesId;

    /**
    * 预留实例计费的类型。形如：S3.MEDIUM4。
返回项：<a href="https://cloud.tencent.com/document/product/213/11518">预留实例计费类型列表</a>
    */
    @SerializedName("InstanceType")
    @Expose
    private String InstanceType;

    /**
    * 预留实例计费可购买的可用区。形如：ap-guangzhou-1。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a>
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 预留实例计费开始时间。形如：1949-10-01 00:00:00
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 预留实例计费到期时间。形如：1949-10-01 00:00:00
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 预留实例计费【有效期】即预留实例计费购买时长。形如：31536000。
计量单位：秒。
    */
    @SerializedName("Duration")
    @Expose
    private Integer Duration;

    /**
    * 已购买的预留实例计费个数。形如：10。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Integer InstanceCount;

    /**
    * 描述预留实例计费的平台描述（即操作系统）。形如：linux。
返回项： linux 。
    */
    @SerializedName("ProductDescription")
    @Expose
    private String ProductDescription;

    /**
    * 预留实例计费购买的状态。形如：active
返回项： active (以创建) | pending (等待被创建) | retired (过期)。
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 可购买的预留实例计费类型的结算货币，使用ISO 4217标准货币代码。形如：USD。
返回项：USD（美元）。
    */
    @SerializedName("CurrencyCode")
    @Expose
    private String CurrencyCode;

    /**
    * 预留实例计费的付款类型。形如：All Upfront。
返回项： All Upfront (预付全部费用)。
    */
    @SerializedName("OfferingType")
    @Expose
    private String OfferingType;

    /**
     * 获取已购买的预留实例计费ID。形如：650c138f-ae7e-4750-952a-96841d6e9fc1。
     * @return ReservedInstancesId 已购买的预留实例计费ID。形如：650c138f-ae7e-4750-952a-96841d6e9fc1。
     */
    public String getReservedInstancesId() {
        return this.ReservedInstancesId;
    }

    /**
     * 设置已购买的预留实例计费ID。形如：650c138f-ae7e-4750-952a-96841d6e9fc1。
     * @param ReservedInstancesId 已购买的预留实例计费ID。形如：650c138f-ae7e-4750-952a-96841d6e9fc1。
     */
    public void setReservedInstancesId(String ReservedInstancesId) {
        this.ReservedInstancesId = ReservedInstancesId;
    }

    /**
     * 获取预留实例计费的类型。形如：S3.MEDIUM4。
返回项：<a href="https://cloud.tencent.com/document/product/213/11518">预留实例计费类型列表</a>
     * @return InstanceType 预留实例计费的类型。形如：S3.MEDIUM4。
返回项：<a href="https://cloud.tencent.com/document/product/213/11518">预留实例计费类型列表</a>
     */
    public String getInstanceType() {
        return this.InstanceType;
    }

    /**
     * 设置预留实例计费的类型。形如：S3.MEDIUM4。
返回项：<a href="https://cloud.tencent.com/document/product/213/11518">预留实例计费类型列表</a>
     * @param InstanceType 预留实例计费的类型。形如：S3.MEDIUM4。
返回项：<a href="https://cloud.tencent.com/document/product/213/11518">预留实例计费类型列表</a>
     */
    public void setInstanceType(String InstanceType) {
        this.InstanceType = InstanceType;
    }

    /**
     * 获取预留实例计费可购买的可用区。形如：ap-guangzhou-1。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a>
     * @return Zone 预留实例计费可购买的可用区。形如：ap-guangzhou-1。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a>
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置预留实例计费可购买的可用区。形如：ap-guangzhou-1。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a>
     * @param Zone 预留实例计费可购买的可用区。形如：ap-guangzhou-1。
返回项：<a href="https://cloud.tencent.com/document/product/213/6091">可用区列表</a>
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取预留实例计费开始时间。形如：1949-10-01 00:00:00
     * @return StartTime 预留实例计费开始时间。形如：1949-10-01 00:00:00
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置预留实例计费开始时间。形如：1949-10-01 00:00:00
     * @param StartTime 预留实例计费开始时间。形如：1949-10-01 00:00:00
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取预留实例计费到期时间。形如：1949-10-01 00:00:00
     * @return EndTime 预留实例计费到期时间。形如：1949-10-01 00:00:00
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置预留实例计费到期时间。形如：1949-10-01 00:00:00
     * @param EndTime 预留实例计费到期时间。形如：1949-10-01 00:00:00
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取预留实例计费【有效期】即预留实例计费购买时长。形如：31536000。
计量单位：秒。
     * @return Duration 预留实例计费【有效期】即预留实例计费购买时长。形如：31536000。
计量单位：秒。
     */
    public Integer getDuration() {
        return this.Duration;
    }

    /**
     * 设置预留实例计费【有效期】即预留实例计费购买时长。形如：31536000。
计量单位：秒。
     * @param Duration 预留实例计费【有效期】即预留实例计费购买时长。形如：31536000。
计量单位：秒。
     */
    public void setDuration(Integer Duration) {
        this.Duration = Duration;
    }

    /**
     * 获取已购买的预留实例计费个数。形如：10。
     * @return InstanceCount 已购买的预留实例计费个数。形如：10。
     */
    public Integer getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * 设置已购买的预留实例计费个数。形如：10。
     * @param InstanceCount 已购买的预留实例计费个数。形如：10。
     */
    public void setInstanceCount(Integer InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * 获取描述预留实例计费的平台描述（即操作系统）。形如：linux。
返回项： linux 。
     * @return ProductDescription 描述预留实例计费的平台描述（即操作系统）。形如：linux。
返回项： linux 。
     */
    public String getProductDescription() {
        return this.ProductDescription;
    }

    /**
     * 设置描述预留实例计费的平台描述（即操作系统）。形如：linux。
返回项： linux 。
     * @param ProductDescription 描述预留实例计费的平台描述（即操作系统）。形如：linux。
返回项： linux 。
     */
    public void setProductDescription(String ProductDescription) {
        this.ProductDescription = ProductDescription;
    }

    /**
     * 获取预留实例计费购买的状态。形如：active
返回项： active (以创建) | pending (等待被创建) | retired (过期)。
     * @return State 预留实例计费购买的状态。形如：active
返回项： active (以创建) | pending (等待被创建) | retired (过期)。
     */
    public String getState() {
        return this.State;
    }

    /**
     * 设置预留实例计费购买的状态。形如：active
返回项： active (以创建) | pending (等待被创建) | retired (过期)。
     * @param State 预留实例计费购买的状态。形如：active
返回项： active (以创建) | pending (等待被创建) | retired (过期)。
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * 获取可购买的预留实例计费类型的结算货币，使用ISO 4217标准货币代码。形如：USD。
返回项：USD（美元）。
     * @return CurrencyCode 可购买的预留实例计费类型的结算货币，使用ISO 4217标准货币代码。形如：USD。
返回项：USD（美元）。
     */
    public String getCurrencyCode() {
        return this.CurrencyCode;
    }

    /**
     * 设置可购买的预留实例计费类型的结算货币，使用ISO 4217标准货币代码。形如：USD。
返回项：USD（美元）。
     * @param CurrencyCode 可购买的预留实例计费类型的结算货币，使用ISO 4217标准货币代码。形如：USD。
返回项：USD（美元）。
     */
    public void setCurrencyCode(String CurrencyCode) {
        this.CurrencyCode = CurrencyCode;
    }

    /**
     * 获取预留实例计费的付款类型。形如：All Upfront。
返回项： All Upfront (预付全部费用)。
     * @return OfferingType 预留实例计费的付款类型。形如：All Upfront。
返回项： All Upfront (预付全部费用)。
     */
    public String getOfferingType() {
        return this.OfferingType;
    }

    /**
     * 设置预留实例计费的付款类型。形如：All Upfront。
返回项： All Upfront (预付全部费用)。
     * @param OfferingType 预留实例计费的付款类型。形如：All Upfront。
返回项： All Upfront (预付全部费用)。
     */
    public void setOfferingType(String OfferingType) {
        this.OfferingType = OfferingType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReservedInstancesId", this.ReservedInstancesId);
        this.setParamSimple(map, prefix + "InstanceType", this.InstanceType);
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "ProductDescription", this.ProductDescription);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "CurrencyCode", this.CurrencyCode);
        this.setParamSimple(map, prefix + "OfferingType", this.OfferingType);

    }
}

