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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GenerateRandomRequest  extends AbstractModel{

    /**
    * 生成的随机数的长度。最小值为1， 最大值为1024。
    */
    @SerializedName("NumberOfBytes")
    @Expose
    private Long NumberOfBytes;

    /**
     * 获取生成的随机数的长度。最小值为1， 最大值为1024。
     * @return NumberOfBytes 生成的随机数的长度。最小值为1， 最大值为1024。
     */
    public Long getNumberOfBytes() {
        return this.NumberOfBytes;
    }

    /**
     * 设置生成的随机数的长度。最小值为1， 最大值为1024。
     * @param NumberOfBytes 生成的随机数的长度。最小值为1， 最大值为1024。
     */
    public void setNumberOfBytes(Long NumberOfBytes) {
        this.NumberOfBytes = NumberOfBytes;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "NumberOfBytes", this.NumberOfBytes);

    }
}

