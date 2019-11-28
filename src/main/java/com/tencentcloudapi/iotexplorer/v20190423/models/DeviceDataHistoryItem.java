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
package com.tencentcloudapi.iotexplorer.v20190423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeviceDataHistoryItem  extends AbstractModel{

    /**
    * 时间点，毫秒时间戳
    */
    @SerializedName("Time")
    @Expose
    private String Time;

    /**
    * 字段取值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * 获取时间点，毫秒时间戳
     * @return Time 时间点，毫秒时间戳
     */
    public String getTime() {
        return this.Time;
    }

    /**
     * 设置时间点，毫秒时间戳
     * @param Time 时间点，毫秒时间戳
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * 获取字段取值
     * @return Value 字段取值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * 设置字段取值
     * @param Value 字段取值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Time", this.Time);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

