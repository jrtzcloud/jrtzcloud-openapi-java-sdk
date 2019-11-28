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
package com.tencentcloudapi.cis.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Price  extends AbstractModel{

    /**
    * 原价，单位：元
    */
    @SerializedName("DiscountPrice")
    @Expose
    private Float DiscountPrice;

    /**
    * 折扣价，单位：元
    */
    @SerializedName("OriginalPrice")
    @Expose
    private Float OriginalPrice;

    /**
     * 获取原价，单位：元
     * @return DiscountPrice 原价，单位：元
     */
    public Float getDiscountPrice() {
        return this.DiscountPrice;
    }

    /**
     * 设置原价，单位：元
     * @param DiscountPrice 原价，单位：元
     */
    public void setDiscountPrice(Float DiscountPrice) {
        this.DiscountPrice = DiscountPrice;
    }

    /**
     * 获取折扣价，单位：元
     * @return OriginalPrice 折扣价，单位：元
     */
    public Float getOriginalPrice() {
        return this.OriginalPrice;
    }

    /**
     * 设置折扣价，单位：元
     * @param OriginalPrice 折扣价，单位：元
     */
    public void setOriginalPrice(Float OriginalPrice) {
        this.OriginalPrice = OriginalPrice;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DiscountPrice", this.DiscountPrice);
        this.setParamSimple(map, prefix + "OriginalPrice", this.OriginalPrice);

    }
}

