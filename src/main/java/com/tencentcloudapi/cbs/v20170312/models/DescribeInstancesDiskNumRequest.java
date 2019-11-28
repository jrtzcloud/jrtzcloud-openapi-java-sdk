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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeInstancesDiskNumRequest  extends AbstractModel{

    /**
    * 云服务器实例ID，通过[DescribeInstances](/document/product/213/15728)接口查询。
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
     * 获取云服务器实例ID，通过[DescribeInstances](/document/product/213/15728)接口查询。
     * @return InstanceIds 云服务器实例ID，通过[DescribeInstances](/document/product/213/15728)接口查询。
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * 设置云服务器实例ID，通过[DescribeInstances](/document/product/213/15728)接口查询。
     * @param InstanceIds 云服务器实例ID，通过[DescribeInstances](/document/product/213/15728)接口查询。
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);

    }
}

