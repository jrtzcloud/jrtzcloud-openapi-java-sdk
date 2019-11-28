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
package com.tencentcloudapi.tsf.v20180326.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RollbackConfigRequest  extends AbstractModel{

    /**
    * 配置项发布历史ID
    */
    @SerializedName("ConfigReleaseLogId")
    @Expose
    private String ConfigReleaseLogId;

    /**
    * 回滚描述
    */
    @SerializedName("ReleaseDesc")
    @Expose
    private String ReleaseDesc;

    /**
     * 获取配置项发布历史ID
     * @return ConfigReleaseLogId 配置项发布历史ID
     */
    public String getConfigReleaseLogId() {
        return this.ConfigReleaseLogId;
    }

    /**
     * 设置配置项发布历史ID
     * @param ConfigReleaseLogId 配置项发布历史ID
     */
    public void setConfigReleaseLogId(String ConfigReleaseLogId) {
        this.ConfigReleaseLogId = ConfigReleaseLogId;
    }

    /**
     * 获取回滚描述
     * @return ReleaseDesc 回滚描述
     */
    public String getReleaseDesc() {
        return this.ReleaseDesc;
    }

    /**
     * 设置回滚描述
     * @param ReleaseDesc 回滚描述
     */
    public void setReleaseDesc(String ReleaseDesc) {
        this.ReleaseDesc = ReleaseDesc;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigReleaseLogId", this.ConfigReleaseLogId);
        this.setParamSimple(map, prefix + "ReleaseDesc", this.ReleaseDesc);

    }
}

