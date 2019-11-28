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
package com.tencentcloudapi.ic.v20190307.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeCardsRequest  extends AbstractModel{

    /**
    * 应用id
    */
    @SerializedName("Sdkappid")
    @Expose
    private String Sdkappid;

    /**
    * 偏移值
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 列表限制
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
     * 获取应用id
     * @return Sdkappid 应用id
     */
    public String getSdkappid() {
        return this.Sdkappid;
    }

    /**
     * 设置应用id
     * @param Sdkappid 应用id
     */
    public void setSdkappid(String Sdkappid) {
        this.Sdkappid = Sdkappid;
    }

    /**
     * 获取偏移值
     * @return Offset 偏移值
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移值
     * @param Offset 偏移值
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取列表限制
     * @return Limit 列表限制
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置列表限制
     * @param Limit 列表限制
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Sdkappid", this.Sdkappid);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);

    }
}

