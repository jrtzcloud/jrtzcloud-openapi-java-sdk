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

public class OperationCountLimit  extends AbstractModel{

    /**
    * 实例操作。
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 实例ID。
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 当前已使用次数，如果返回值为-1表示该操作无次数限制。
    */
    @SerializedName("CurrentCount")
    @Expose
    private Integer CurrentCount;

    /**
    * 操作次数最高额度，如果返回值为-1表示该操作无次数限制，如果返回值为0表示不支持调整配置。
    */
    @SerializedName("LimitCount")
    @Expose
    private Integer LimitCount;

    /**
     * 获取实例操作。
     * @return Operation 实例操作。
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * 设置实例操作。
     * @param Operation 实例操作。
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * 获取实例ID。
     * @return InstanceId 实例ID。
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * 设置实例ID。
     * @param InstanceId 实例ID。
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * 获取当前已使用次数，如果返回值为-1表示该操作无次数限制。
     * @return CurrentCount 当前已使用次数，如果返回值为-1表示该操作无次数限制。
     */
    public Integer getCurrentCount() {
        return this.CurrentCount;
    }

    /**
     * 设置当前已使用次数，如果返回值为-1表示该操作无次数限制。
     * @param CurrentCount 当前已使用次数，如果返回值为-1表示该操作无次数限制。
     */
    public void setCurrentCount(Integer CurrentCount) {
        this.CurrentCount = CurrentCount;
    }

    /**
     * 获取操作次数最高额度，如果返回值为-1表示该操作无次数限制，如果返回值为0表示不支持调整配置。
     * @return LimitCount 操作次数最高额度，如果返回值为-1表示该操作无次数限制，如果返回值为0表示不支持调整配置。
     */
    public Integer getLimitCount() {
        return this.LimitCount;
    }

    /**
     * 设置操作次数最高额度，如果返回值为-1表示该操作无次数限制，如果返回值为0表示不支持调整配置。
     * @param LimitCount 操作次数最高额度，如果返回值为-1表示该操作无次数限制，如果返回值为0表示不支持调整配置。
     */
    public void setLimitCount(Integer LimitCount) {
        this.LimitCount = LimitCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "CurrentCount", this.CurrentCount);
        this.setParamSimple(map, prefix + "LimitCount", this.LimitCount);

    }
}

