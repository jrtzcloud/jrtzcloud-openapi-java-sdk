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
package com.tencentcloudapi.es.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OperationDetail  extends AbstractModel{

    /**
    * 实例原始配置信息
    */
    @SerializedName("OldInfo")
    @Expose
    private KeyValue [] OldInfo;

    /**
    * 实例更新后配置信息
    */
    @SerializedName("NewInfo")
    @Expose
    private KeyValue [] NewInfo;

    /**
     * 获取实例原始配置信息
     * @return OldInfo 实例原始配置信息
     */
    public KeyValue [] getOldInfo() {
        return this.OldInfo;
    }

    /**
     * 设置实例原始配置信息
     * @param OldInfo 实例原始配置信息
     */
    public void setOldInfo(KeyValue [] OldInfo) {
        this.OldInfo = OldInfo;
    }

    /**
     * 获取实例更新后配置信息
     * @return NewInfo 实例更新后配置信息
     */
    public KeyValue [] getNewInfo() {
        return this.NewInfo;
    }

    /**
     * 设置实例更新后配置信息
     * @param NewInfo 实例更新后配置信息
     */
    public void setNewInfo(KeyValue [] NewInfo) {
        this.NewInfo = NewInfo;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "OldInfo.", this.OldInfo);
        this.setParamArrayObj(map, prefix + "NewInfo.", this.NewInfo);

    }
}

