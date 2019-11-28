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
package com.tencentcloudapi.youmall.v20180228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class NetworkLastInfo  extends AbstractModel{

    /**
    * 总数
    */
    @SerializedName("Count")
    @Expose
    private Integer Count;

    /**
    * 网络状态
    */
    @SerializedName("Infos")
    @Expose
    private NetworkAndShopInfo [] Infos;

    /**
     * 获取总数
     * @return Count 总数
     */
    public Integer getCount() {
        return this.Count;
    }

    /**
     * 设置总数
     * @param Count 总数
     */
    public void setCount(Integer Count) {
        this.Count = Count;
    }

    /**
     * 获取网络状态
     * @return Infos 网络状态
     */
    public NetworkAndShopInfo [] getInfos() {
        return this.Infos;
    }

    /**
     * 设置网络状态
     * @param Infos 网络状态
     */
    public void setInfos(NetworkAndShopInfo [] Infos) {
        this.Infos = Infos;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamArrayObj(map, prefix + "Infos.", this.Infos);

    }
}

