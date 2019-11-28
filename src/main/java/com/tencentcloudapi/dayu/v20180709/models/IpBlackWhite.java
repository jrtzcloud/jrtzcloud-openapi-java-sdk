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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IpBlackWhite  extends AbstractModel{

    /**
    * IP地址
    */
    @SerializedName("Ip")
    @Expose
    private String Ip;

    /**
    * 黑白类型，取值范围[black，white]
    */
    @SerializedName("Type")
    @Expose
    private String Type;

    /**
     * 获取IP地址
     * @return Ip IP地址
     */
    public String getIp() {
        return this.Ip;
    }

    /**
     * 设置IP地址
     * @param Ip IP地址
     */
    public void setIp(String Ip) {
        this.Ip = Ip;
    }

    /**
     * 获取黑白类型，取值范围[black，white]
     * @return Type 黑白类型，取值范围[black，white]
     */
    public String getType() {
        return this.Type;
    }

    /**
     * 设置黑白类型，取值范围[black，white]
     * @param Type 黑白类型，取值范围[black，white]
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip", this.Ip);
        this.setParamSimple(map, prefix + "Type", this.Type);

    }
}

