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
package com.tencentcloudapi.ecc.v20181213.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ErrorCoordinate  extends AbstractModel{

    /**
    * 维度单词坐标
    */
    @SerializedName("Coordinate")
    @Expose
    private Long [] Coordinate;

    /**
     * 获取维度单词坐标
     * @return Coordinate 维度单词坐标
     */
    public Long [] getCoordinate() {
        return this.Coordinate;
    }

    /**
     * 设置维度单词坐标
     * @param Coordinate 维度单词坐标
     */
    public void setCoordinate(Long [] Coordinate) {
        this.Coordinate = Coordinate;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Coordinate.", this.Coordinate);

    }
}

