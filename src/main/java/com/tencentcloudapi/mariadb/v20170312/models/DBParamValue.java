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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DBParamValue  extends AbstractModel{

    /**
    * 参数名称
    */
    @SerializedName("Param")
    @Expose
    private String Param;

    /**
    * 参数值
    */
    @SerializedName("Value")
    @Expose
    private String Value;

    /**
     * 获取参数名称
     * @return Param 参数名称
     */
    public String getParam() {
        return this.Param;
    }

    /**
     * 设置参数名称
     * @param Param 参数名称
     */
    public void setParam(String Param) {
        this.Param = Param;
    }

    /**
     * 获取参数值
     * @return Value 参数值
     */
    public String getValue() {
        return this.Value;
    }

    /**
     * 设置参数值
     * @param Value 参数值
     */
    public void setValue(String Value) {
        this.Value = Value;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Param", this.Param);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

