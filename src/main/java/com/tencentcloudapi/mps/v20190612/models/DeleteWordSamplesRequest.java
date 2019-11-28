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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteWordSamplesRequest  extends AbstractModel{

    /**
    * 关键词，数组长度限制：100 个词。
    */
    @SerializedName("Keywords")
    @Expose
    private String [] Keywords;

    /**
     * 获取关键词，数组长度限制：100 个词。
     * @return Keywords 关键词，数组长度限制：100 个词。
     */
    public String [] getKeywords() {
        return this.Keywords;
    }

    /**
     * 设置关键词，数组长度限制：100 个词。
     * @param Keywords 关键词，数组长度限制：100 个词。
     */
    public void setKeywords(String [] Keywords) {
        this.Keywords = Keywords;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "Keywords.", this.Keywords);

    }
}

