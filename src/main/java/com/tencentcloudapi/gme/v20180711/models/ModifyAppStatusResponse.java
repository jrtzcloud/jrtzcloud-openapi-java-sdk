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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAppStatusResponse  extends AbstractModel{

    /**
    * GME应用id
    */
    @SerializedName("BizId")
    @Expose
    private Long BizId;

    /**
    * 应用状态，取值：open/close
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
     * 获取GME应用id
     * @return BizId GME应用id
     */
    public Long getBizId() {
        return this.BizId;
    }

    /**
     * 设置GME应用id
     * @param BizId GME应用id
     */
    public void setBizId(Long BizId) {
        this.BizId = BizId;
    }

    /**
     * 获取应用状态，取值：open/close
     * @return Status 应用状态，取值：open/close
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置应用状态，取值：open/close
     * @param Status 应用状态，取值：open/close
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BizId", this.BizId);
        this.setParamSimple(map, prefix + "Status", this.Status);

    }
}

