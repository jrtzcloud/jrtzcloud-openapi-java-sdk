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
package com.tencentcloudapi.ms.v20180408.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class SoInfo  extends AbstractModel{

    /**
    * so文件列表
    */
    @SerializedName("SoFileNames")
    @Expose
    private String [] SoFileNames;

    /**
     * 获取so文件列表
     * @return SoFileNames so文件列表
     */
    public String [] getSoFileNames() {
        return this.SoFileNames;
    }

    /**
     * 设置so文件列表
     * @param SoFileNames so文件列表
     */
    public void setSoFileNames(String [] SoFileNames) {
        this.SoFileNames = SoFileNames;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "SoFileNames.", this.SoFileNames);

    }
}

