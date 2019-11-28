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
package com.tencentcloudapi.tci.v20190318.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LightLevelRatioStatistic  extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Level")
    @Expose
    private String Level;

    /**
    * 比例
    */
    @SerializedName("Ratio")
    @Expose
    private Float Ratio;

    /**
     * 获取名称
     * @return Level 名称
     */
    public String getLevel() {
        return this.Level;
    }

    /**
     * 设置名称
     * @param Level 名称
     */
    public void setLevel(String Level) {
        this.Level = Level;
    }

    /**
     * 获取比例
     * @return Ratio 比例
     */
    public Float getRatio() {
        return this.Ratio;
    }

    /**
     * 设置比例
     * @param Ratio 比例
     */
    public void setRatio(Float Ratio) {
        this.Ratio = Ratio;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Level", this.Level);
        this.setParamSimple(map, prefix + "Ratio", this.Ratio);

    }
}

