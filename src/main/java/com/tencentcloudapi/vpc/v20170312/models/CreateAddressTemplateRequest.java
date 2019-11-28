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

public class CreateAddressTemplateRequest  extends AbstractModel{

    /**
    * IP地址模版名称
    */
    @SerializedName("AddressTemplateName")
    @Expose
    private String AddressTemplateName;

    /**
    * 地址信息，支持 IP、CIDR、IP 范围。
    */
    @SerializedName("Addresses")
    @Expose
    private String [] Addresses;

    /**
     * 获取IP地址模版名称
     * @return AddressTemplateName IP地址模版名称
     */
    public String getAddressTemplateName() {
        return this.AddressTemplateName;
    }

    /**
     * 设置IP地址模版名称
     * @param AddressTemplateName IP地址模版名称
     */
    public void setAddressTemplateName(String AddressTemplateName) {
        this.AddressTemplateName = AddressTemplateName;
    }

    /**
     * 获取地址信息，支持 IP、CIDR、IP 范围。
     * @return Addresses 地址信息，支持 IP、CIDR、IP 范围。
     */
    public String [] getAddresses() {
        return this.Addresses;
    }

    /**
     * 设置地址信息，支持 IP、CIDR、IP 范围。
     * @param Addresses 地址信息，支持 IP、CIDR、IP 范围。
     */
    public void setAddresses(String [] Addresses) {
        this.Addresses = Addresses;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AddressTemplateName", this.AddressTemplateName);
        this.setParamArraySimple(map, prefix + "Addresses.", this.Addresses);

    }
}

