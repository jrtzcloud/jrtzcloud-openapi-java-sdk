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
package com.tencentcloudapi.dcdb.v20180411.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DatabaseProcedure  extends AbstractModel{

    /**
    * 存储过程名称
    */
    @SerializedName("Proc")
    @Expose
    private String Proc;

    /**
     * 获取存储过程名称
     * @return Proc 存储过程名称
     */
    public String getProc() {
        return this.Proc;
    }

    /**
     * 设置存储过程名称
     * @param Proc 存储过程名称
     */
    public void setProc(String Proc) {
        this.Proc = Proc;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Proc", this.Proc);

    }
}

