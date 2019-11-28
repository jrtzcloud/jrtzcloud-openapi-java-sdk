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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CommandTake  extends AbstractModel{

    /**
    * 命令
    */
    @SerializedName("Cmd")
    @Expose
    private String Cmd;

    /**
    * 耗时
    */
    @SerializedName("Took")
    @Expose
    private Integer Took;

    /**
     * 获取命令
     * @return Cmd 命令
     */
    public String getCmd() {
        return this.Cmd;
    }

    /**
     * 设置命令
     * @param Cmd 命令
     */
    public void setCmd(String Cmd) {
        this.Cmd = Cmd;
    }

    /**
     * 获取耗时
     * @return Took 耗时
     */
    public Integer getTook() {
        return this.Took;
    }

    /**
     * 设置耗时
     * @param Took 耗时
     */
    public void setTook(Integer Took) {
        this.Took = Took;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Cmd", this.Cmd);
        this.setParamSimple(map, prefix + "Took", this.Took);

    }
}

