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
package com.tencentcloudapi.tbm.v20180129.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class MoviePortrait  extends AbstractModel{

    /**
    * 电影名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 百分比
    */
    @SerializedName("Percent")
    @Expose
    private Float Percent;

    /**
     * 获取电影名称
     * @return Name 电影名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置电影名称
     * @param Name 电影名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取百分比
     * @return Percent 百分比
     */
    public Float getPercent() {
        return this.Percent;
    }

    /**
     * 设置百分比
     * @param Percent 百分比
     */
    public void setPercent(Float Percent) {
        this.Percent = Percent;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Percent", this.Percent);

    }
}

