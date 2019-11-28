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
package com.tencentcloudapi.postgres.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InquiryPriceCreateDBInstancesRequest  extends AbstractModel{

    /**
    * 可用区ID。该参数可以通过调用 DescribeZones 接口的返回值中的Zone字段来获取。
    */
    @SerializedName("Zone")
    @Expose
    private String Zone;

    /**
    * 规格ID。该参数可以通过调用DescribeProductConfig接口的返回值中的SpecCode字段来获取。
    */
    @SerializedName("SpecCode")
    @Expose
    private String SpecCode;

    /**
    * 存储容量大小，单位：GB。
    */
    @SerializedName("Storage")
    @Expose
    private Integer Storage;

    /**
    * 实例数量。目前最大数量不超过100，如需一次性创建更多实例，请联系客服支持。
    */
    @SerializedName("InstanceCount")
    @Expose
    private Integer InstanceCount;

    /**
    * 购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值。
    */
    @SerializedName("Period")
    @Expose
    private Integer Period;

    /**
    * 计费ID。该参数可以通过调用DescribeProductConfig接口的返回值中的Pid字段来获取。
    */
    @SerializedName("Pid")
    @Expose
    private Integer Pid;

    /**
    * 实例计费类型。目前只支持：PREPAID（预付费，即包年包月）。
    */
    @SerializedName("InstanceChargeType")
    @Expose
    private String InstanceChargeType;

    /**
     * 获取可用区ID。该参数可以通过调用 DescribeZones 接口的返回值中的Zone字段来获取。
     * @return Zone 可用区ID。该参数可以通过调用 DescribeZones 接口的返回值中的Zone字段来获取。
     */
    public String getZone() {
        return this.Zone;
    }

    /**
     * 设置可用区ID。该参数可以通过调用 DescribeZones 接口的返回值中的Zone字段来获取。
     * @param Zone 可用区ID。该参数可以通过调用 DescribeZones 接口的返回值中的Zone字段来获取。
     */
    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    /**
     * 获取规格ID。该参数可以通过调用DescribeProductConfig接口的返回值中的SpecCode字段来获取。
     * @return SpecCode 规格ID。该参数可以通过调用DescribeProductConfig接口的返回值中的SpecCode字段来获取。
     */
    public String getSpecCode() {
        return this.SpecCode;
    }

    /**
     * 设置规格ID。该参数可以通过调用DescribeProductConfig接口的返回值中的SpecCode字段来获取。
     * @param SpecCode 规格ID。该参数可以通过调用DescribeProductConfig接口的返回值中的SpecCode字段来获取。
     */
    public void setSpecCode(String SpecCode) {
        this.SpecCode = SpecCode;
    }

    /**
     * 获取存储容量大小，单位：GB。
     * @return Storage 存储容量大小，单位：GB。
     */
    public Integer getStorage() {
        return this.Storage;
    }

    /**
     * 设置存储容量大小，单位：GB。
     * @param Storage 存储容量大小，单位：GB。
     */
    public void setStorage(Integer Storage) {
        this.Storage = Storage;
    }

    /**
     * 获取实例数量。目前最大数量不超过100，如需一次性创建更多实例，请联系客服支持。
     * @return InstanceCount 实例数量。目前最大数量不超过100，如需一次性创建更多实例，请联系客服支持。
     */
    public Integer getInstanceCount() {
        return this.InstanceCount;
    }

    /**
     * 设置实例数量。目前最大数量不超过100，如需一次性创建更多实例，请联系客服支持。
     * @param InstanceCount 实例数量。目前最大数量不超过100，如需一次性创建更多实例，请联系客服支持。
     */
    public void setInstanceCount(Integer InstanceCount) {
        this.InstanceCount = InstanceCount;
    }

    /**
     * 获取购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值。
     * @return Period 购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值。
     */
    public Integer getPeriod() {
        return this.Period;
    }

    /**
     * 设置购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值。
     * @param Period 购买时长，单位：月。目前只支持1,2,3,4,5,6,7,8,9,10,11,12,24,36这些值。
     */
    public void setPeriod(Integer Period) {
        this.Period = Period;
    }

    /**
     * 获取计费ID。该参数可以通过调用DescribeProductConfig接口的返回值中的Pid字段来获取。
     * @return Pid 计费ID。该参数可以通过调用DescribeProductConfig接口的返回值中的Pid字段来获取。
     */
    public Integer getPid() {
        return this.Pid;
    }

    /**
     * 设置计费ID。该参数可以通过调用DescribeProductConfig接口的返回值中的Pid字段来获取。
     * @param Pid 计费ID。该参数可以通过调用DescribeProductConfig接口的返回值中的Pid字段来获取。
     */
    public void setPid(Integer Pid) {
        this.Pid = Pid;
    }

    /**
     * 获取实例计费类型。目前只支持：PREPAID（预付费，即包年包月）。
     * @return InstanceChargeType 实例计费类型。目前只支持：PREPAID（预付费，即包年包月）。
     */
    public String getInstanceChargeType() {
        return this.InstanceChargeType;
    }

    /**
     * 设置实例计费类型。目前只支持：PREPAID（预付费，即包年包月）。
     * @param InstanceChargeType 实例计费类型。目前只支持：PREPAID（预付费，即包年包月）。
     */
    public void setInstanceChargeType(String InstanceChargeType) {
        this.InstanceChargeType = InstanceChargeType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Zone", this.Zone);
        this.setParamSimple(map, prefix + "SpecCode", this.SpecCode);
        this.setParamSimple(map, prefix + "Storage", this.Storage);
        this.setParamSimple(map, prefix + "InstanceCount", this.InstanceCount);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Pid", this.Pid);
        this.setParamSimple(map, prefix + "InstanceChargeType", this.InstanceChargeType);

    }
}

