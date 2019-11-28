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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ManualBackupInstanceRequest  extends AbstractModel{

    /**
    * 待操作的实例ID，可通过 DescribeInstance接口返回值中的 InstanceId 获取。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 备份的备注信息
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * 获取待操作的实例ID，可通过 DescribeInstance接口返回值中的 InstanceId 获取。
     * @return InstanceId 待操作的实例ID，可通过 DescribeInstance接口返回值中的 InstanceId 获取。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置待操作的实例ID，可通过 DescribeInstance接口返回值中的 InstanceId 获取。
     * @param InstanceId 待操作的实例ID，可通过 DescribeInstance接口返回值中的 InstanceId 获取。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取备份的备注信息
     * @return Remark 备份的备注信息
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * 设置备份的备注信息
     * @param Remark 备份的备注信息
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

