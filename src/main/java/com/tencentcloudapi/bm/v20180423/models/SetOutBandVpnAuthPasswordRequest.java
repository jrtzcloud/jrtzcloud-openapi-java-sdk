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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SetOutBandVpnAuthPasswordRequest  extends AbstractModel{

    /**
    * 设置的Vpn认证密码
    */
    @SerializedName("Password")
    @Expose
    private String Password;

    /**
    * 操作字段，取值为：Create（创建）或Update（修改）
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
     * 获取设置的Vpn认证密码
     * @return Password 设置的Vpn认证密码
     */
    public String getPassword() {
        return this.Password;
    }

    /**
     * 设置设置的Vpn认证密码
     * @param Password 设置的Vpn认证密码
     */
    public void setPassword(String Password) {
        this.Password = Password;
    }

    /**
     * 获取操作字段，取值为：Create（创建）或Update（修改）
     * @return Operate 操作字段，取值为：Create（创建）或Update（修改）
     */
    public String getOperate() {
        return this.Operate;
    }

    /**
     * 设置操作字段，取值为：Create（创建）或Update（修改）
     * @param Operate 操作字段，取值为：Create（创建）或Update（修改）
     */
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Password", this.Password);
        this.setParamSimple(map, prefix + "Operate", this.Operate);

    }
}

