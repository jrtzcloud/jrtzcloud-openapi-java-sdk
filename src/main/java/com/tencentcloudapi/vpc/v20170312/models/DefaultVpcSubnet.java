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

public class DefaultVpcSubnet  extends AbstractModel{

    /**
    * 默认VpcId
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 默认SubnetId
    */
    @SerializedName("SubnetId")
    @Expose
    private String SubnetId;

    /**
     * 获取默认VpcId
     * @return VpcId 默认VpcId
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * 设置默认VpcId
     * @param VpcId 默认VpcId
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * 获取默认SubnetId
     * @return SubnetId 默认SubnetId
     */
    public String getSubnetId() {
        return this.SubnetId;
    }

    /**
     * 设置默认SubnetId
     * @param SubnetId 默认SubnetId
     */
    public void setSubnetId(String SubnetId) {
        this.SubnetId = SubnetId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamSimple(map, prefix + "SubnetId", this.SubnetId);

    }
}

