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

public class CreateDisasterRecoverGroupResponse  extends AbstractModel{

    /**
    * 分散置放群组ID列表。
    */
    @SerializedName("DisasterRecoverGroupId")
    @Expose
    private String DisasterRecoverGroupId;

    /**
    * 分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
    * 分散置放群组名称，长度1-60个字符，支持中、英文。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 置放群组内可容纳的云服务器数量。
    */
    @SerializedName("CvmQuotaTotal")
    @Expose
    private Integer CvmQuotaTotal;

    /**
    * 置放群组内已有的云服务器数量。
    */
    @SerializedName("CurrentNum")
    @Expose
    private Integer CurrentNum;

    /**
    * 置放群组创建时间。
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取分散置放群组ID列表。
     * @return DisasterRecoverGroupId 分散置放群组ID列表。
     */
    public String getDisasterRecoverGroupId() {
        return this.DisasterRecoverGroupId;
    }

    /**
     * 设置分散置放群组ID列表。
     * @param DisasterRecoverGroupId 分散置放群组ID列表。
     */
    public void setDisasterRecoverGroupId(String DisasterRecoverGroupId) {
        this.DisasterRecoverGroupId = DisasterRecoverGroupId;
    }

    /**
     * 获取分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
     * @return Type 分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
     * @param Type 分散置放群组类型，取值范围：<br><li>HOST：物理机<br><li>SW：交换机<br><li>RACK：机架
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 获取分散置放群组名称，长度1-60个字符，支持中、英文。
     * @return Name 分散置放群组名称，长度1-60个字符，支持中、英文。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置分散置放群组名称，长度1-60个字符，支持中、英文。
     * @param Name 分散置放群组名称，长度1-60个字符，支持中、英文。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取置放群组内可容纳的云服务器数量。
     * @return CvmQuotaTotal 置放群组内可容纳的云服务器数量。
     */
    public Integer getCvmQuotaTotal() {
        return this.CvmQuotaTotal;
    }

    /**
     * 设置置放群组内可容纳的云服务器数量。
     * @param CvmQuotaTotal 置放群组内可容纳的云服务器数量。
     */
    public void setCvmQuotaTotal(Integer CvmQuotaTotal) {
        this.CvmQuotaTotal = CvmQuotaTotal;
    }

    /**
     * 获取置放群组内已有的云服务器数量。
     * @return CurrentNum 置放群组内已有的云服务器数量。
     */
    public Integer getCurrentNum() {
        return this.CurrentNum;
    }

    /**
     * 设置置放群组内已有的云服务器数量。
     * @param CurrentNum 置放群组内已有的云服务器数量。
     */
    public void setCurrentNum(Integer CurrentNum) {
        this.CurrentNum = CurrentNum;
    }

    /**
     * 获取置放群组创建时间。
     * @return CreateTime 置放群组创建时间。
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置置放群组创建时间。
     * @param CreateTime 置放群组创建时间。
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
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
        this.setParamSimple(map, prefix + "DisasterRecoverGroupId", this.DisasterRecoverGroupId);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CvmQuotaTotal", this.CvmQuotaTotal);
        this.setParamSimple(map, prefix + "CurrentNum", this.CurrentNum);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

