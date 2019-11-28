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
package com.tencentcloudapi.iot.v20180123.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnumData  extends AbstractModel{

    /**
    * 名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 描述
    */
    @SerializedName("Desc")
    @Expose
    private String Desc;

    /**
    * 读写模式
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
    * 取值列表
    */
    @SerializedName("Range")
    @Expose
    private String [] Range;

    /**
     * 获取名称
     * @return Name 名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置名称
     * @param Name 名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取描述
     * @return Desc 描述
     */
    public String getDesc() {
        return this.Desc;
    }

    /**
     * 设置描述
     * @param Desc 描述
     */
    public void setDesc(String Desc) {
        this.Desc = Desc;
    }

    /**
     * 获取读写模式
     * @return Mode 读写模式
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * 设置读写模式
     * @param Mode 读写模式
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * 获取取值列表
     * @return Range 取值列表
     */
    public String [] getRange() {
        return this.Range;
    }

    /**
     * 设置取值列表
     * @param Range 取值列表
     */
    public void setRange(String [] Range) {
        this.Range = Range;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Desc", this.Desc);
        this.setParamSimple(map, prefix + "Mode", this.Mode);
        this.setParamArraySimple(map, prefix + "Range.", this.Range);

    }
}

