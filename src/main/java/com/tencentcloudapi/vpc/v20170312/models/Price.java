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

public class Price  extends AbstractModel{

    /**
    * 实例价格。
    */
    @SerializedName("InstancePrice")
    @Expose
    private ItemPrice InstancePrice;

    /**
    * 网络价格。
    */
    @SerializedName("BandwidthPrice")
    @Expose
    private ItemPrice BandwidthPrice;

    /**
     * 获取实例价格。
     * @return InstancePrice 实例价格。
     */
    public ItemPrice getInstancePrice() {
        return this.InstancePrice;
    }

    /**
     * 设置实例价格。
     * @param InstancePrice 实例价格。
     */
    public void setInstancePrice(ItemPrice InstancePrice) {
        this.InstancePrice = InstancePrice;
    }

    /**
     * 获取网络价格。
     * @return BandwidthPrice 网络价格。
     */
    public ItemPrice getBandwidthPrice() {
        return this.BandwidthPrice;
    }

    /**
     * 设置网络价格。
     * @param BandwidthPrice 网络价格。
     */
    public void setBandwidthPrice(ItemPrice BandwidthPrice) {
        this.BandwidthPrice = BandwidthPrice;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "InstancePrice.", this.InstancePrice);
        this.setParamObj(map, prefix + "BandwidthPrice.", this.BandwidthPrice);

    }
}

