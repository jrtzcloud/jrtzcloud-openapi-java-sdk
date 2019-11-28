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

public class ResourceIp  extends AbstractModel{

    /**
    * 资源ID
    */
    @SerializedName("Id")
    @Expose
    private String Id;

    /**
    * 资源的IP数组
    */
    @SerializedName("IpList")
    @Expose
    private String [] IpList;

    /**
     * 获取资源ID
     * @return Id 资源ID
     */
    public String getId() {
        return this.Id;
    }

    /**
     * 设置资源ID
     * @param Id 资源ID
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 获取资源的IP数组
     * @return IpList 资源的IP数组
     */
    public String [] getIpList() {
        return this.IpList;
    }

    /**
     * 设置资源的IP数组
     * @param IpList 资源的IP数组
     */
    public void setIpList(String [] IpList) {
        this.IpList = IpList;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamArraySimple(map, prefix + "IpList.", this.IpList);

    }
}

