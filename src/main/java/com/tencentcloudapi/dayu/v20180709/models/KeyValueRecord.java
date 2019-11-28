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
package com.tencentcloudapi.dayu.v20180709.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class KeyValueRecord  extends AbstractModel{

    /**
    * 一条记录的Key-Value数组
    */
    @SerializedName("Record")
    @Expose
    private KeyValue [] Record;

    /**
     * 获取一条记录的Key-Value数组
     * @return Record 一条记录的Key-Value数组
     */
    public KeyValue [] getRecord() {
        return this.Record;
    }

    /**
     * 设置一条记录的Key-Value数组
     * @param Record 一条记录的Key-Value数组
     */
    public void setRecord(KeyValue [] Record) {
        this.Record = Record;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "Record.", this.Record);

    }
}

