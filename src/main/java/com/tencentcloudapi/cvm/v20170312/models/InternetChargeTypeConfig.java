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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InternetChargeTypeConfig  extends AbstractModel{

    /**
    * 网络计费模式。
    */
    @SerializedName("InternetChargeType")
    @Expose
    private String InternetChargeType;

    /**
    * 网络计费模式描述信息。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * 获取网络计费模式。
     * @return InternetChargeType 网络计费模式。
     */
    public String getInternetChargeType() {
        return this.InternetChargeType;
    }

    /**
     * 设置网络计费模式。
     * @param InternetChargeType 网络计费模式。
     */
    public void setInternetChargeType(String InternetChargeType) {
        this.InternetChargeType = InternetChargeType;
    }

    /**
     * 获取网络计费模式描述信息。
     * @return Description 网络计费模式描述信息。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * 设置网络计费模式描述信息。
     * @param Description 网络计费模式描述信息。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InternetChargeType", this.InternetChargeType);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

