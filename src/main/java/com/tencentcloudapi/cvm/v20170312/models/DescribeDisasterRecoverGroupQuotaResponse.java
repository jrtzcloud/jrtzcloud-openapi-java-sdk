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

public class DescribeDisasterRecoverGroupQuotaResponse  extends AbstractModel{

    /**
    * 可创建置放群组数量的上限。
    */
    @SerializedName("GroupQuota")
    @Expose
    private Integer GroupQuota;

    /**
    * 当前用户已经创建的置放群组数量。
    */
    @SerializedName("CurrentNum")
    @Expose
    private Integer CurrentNum;

    /**
    * 物理机类型容灾组内实例的配额数。
    */
    @SerializedName("CvmInHostGroupQuota")
    @Expose
    private Integer CvmInHostGroupQuota;

    /**
    * 交换机类型容灾组内实例的配额数。
    */
    @SerializedName("CvmInSwGroupQuota")
    @Expose
    private Integer CvmInSwGroupQuota;

    /**
    * 机架类型容灾组内实例的配额数。
    */
    @SerializedName("CvmInRackGroupQuota")
    @Expose
    private Integer CvmInRackGroupQuota;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取可创建置放群组数量的上限。
     * @return GroupQuota 可创建置放群组数量的上限。
     */
    public Integer getGroupQuota() {
        return this.GroupQuota;
    }

    /**
     * 设置可创建置放群组数量的上限。
     * @param GroupQuota 可创建置放群组数量的上限。
     */
    public void setGroupQuota(Integer GroupQuota) {
        this.GroupQuota = GroupQuota;
    }

    /**
     * 获取当前用户已经创建的置放群组数量。
     * @return CurrentNum 当前用户已经创建的置放群组数量。
     */
    public Integer getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * 设置当前用户已经创建的置放群组数量。
     * @param CurrentNum 当前用户已经创建的置放群组数量。
     */
    public void setCurrentNum(Integer CurrentNum) {
        this.CurrentNum = CurrentNum;
    }

    /**
     * 获取物理机类型容灾组内实例的配额数。
     * @return CvmInHostGroupQuota 物理机类型容灾组内实例的配额数。
     */
    public Integer getCvmInHostGroupQuota() {
        return this.CvmInHostGroupQuota;
    }

    /**
     * 设置物理机类型容灾组内实例的配额数。
     * @param CvmInHostGroupQuota 物理机类型容灾组内实例的配额数。
     */
    public void setCvmInHostGroupQuota(Integer CvmInHostGroupQuota) {
        this.CvmInHostGroupQuota = CvmInHostGroupQuota;
    }

    /**
     * 获取交换机类型容灾组内实例的配额数。
     * @return CvmInSwGroupQuota 交换机类型容灾组内实例的配额数。
     */
    public Integer getCvmInSwGroupQuota() {
        return this.CvmInSwGroupQuota;
    }

    /**
     * 设置交换机类型容灾组内实例的配额数。
     * @param CvmInSwGroupQuota 交换机类型容灾组内实例的配额数。
     */
    public void setCvmInSwGroupQuota(Integer CvmInSwGroupQuota) {
        this.CvmInSwGroupQuota = CvmInSwGroupQuota;
    }

    /**
     * 获取机架类型容灾组内实例的配额数。
     * @return CvmInRackGroupQuota 机架类型容灾组内实例的配额数。
     */
    public Integer getCvmInRackGroupQuota() {
        return this.CvmInRackGroupQuota;
    }

    /**
     * 设置机架类型容灾组内实例的配额数。
     * @param CvmInRackGroupQuota 机架类型容灾组内实例的配额数。
     */
    public void setCvmInRackGroupQuota(Integer CvmInRackGroupQuota) {
        this.CvmInRackGroupQuota = CvmInRackGroupQuota;
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
        this.setParamSimple(map, prefix + "GroupQuota", this.GroupQuota);
        this.setParamSimple(map, prefix + "CurrentNum", this.CurrentNum);
        this.setParamSimple(map, prefix + "CvmInHostGroupQuota", this.CvmInHostGroupQuota);
        this.setParamSimple(map, prefix + "CvmInSwGroupQuota", this.CvmInSwGroupQuota);
        this.setParamSimple(map, prefix + "CvmInRackGroupQuota", this.CvmInRackGroupQuota);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

