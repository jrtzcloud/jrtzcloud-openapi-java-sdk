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

public class CreatePublicConfigRequest  extends AbstractModel{

    /**
    * 配置项名称
    */
    @SerializedName("ConfigName")
    @Expose
    private String ConfigName;

    /**
    * 配置项版本
    */
    @SerializedName("ConfigVersion")
    @Expose
    private String ConfigVersion;

    /**
    * 配置项值，总是接收yaml格式的内容
    */
    @SerializedName("ConfigValue")
    @Expose
    private String ConfigValue;

    /**
    * 配置项版本描述
    */
    @SerializedName("ConfigVersionDesc")
    @Expose
    private String ConfigVersionDesc;

    /**
    * 配置项类型
    */
    @SerializedName("ConfigType")
    @Expose
    private String ConfigType;

    /**
     * 获取配置项名称
     * @return ConfigName 配置项名称
     */
    public String getConfigName() {
        return this.ConfigName;
    }

    /**
     * 设置配置项名称
     * @param ConfigName 配置项名称
     */
    public void setConfigName(String ConfigName) {
        this.ConfigName = ConfigName;
    }

    /**
     * 获取配置项版本
     * @return ConfigVersion 配置项版本
     */
    public String getConfigVersion() {
        return this.ConfigVersion;
    }

    /**
     * 设置配置项版本
     * @param ConfigVersion 配置项版本
     */
    public void setConfigVersion(String ConfigVersion) {
        this.ConfigVersion = ConfigVersion;
    }

    /**
     * 获取配置项值，总是接收yaml格式的内容
     * @return ConfigValue 配置项值，总是接收yaml格式的内容
     */
    public String getConfigValue() {
        return this.ConfigValue;
    }

    /**
     * 设置配置项值，总是接收yaml格式的内容
     * @param ConfigValue 配置项值，总是接收yaml格式的内容
     */
    public void setConfigValue(String ConfigValue) {
        this.ConfigValue = ConfigValue;
    }

    /**
     * 获取配置项版本描述
     * @return ConfigVersionDesc 配置项版本描述
     */
    public String getConfigVersionDesc() {
        return this.ConfigVersionDesc;
    }

    /**
     * 设置配置项版本描述
     * @param ConfigVersionDesc 配置项版本描述
     */
    public void setConfigVersionDesc(String ConfigVersionDesc) {
        this.ConfigVersionDesc = ConfigVersionDesc;
    }

    /**
     * 获取配置项类型
     * @return ConfigType 配置项类型
     */
    public String getConfigType() {
        return this.ConfigType;
    }

    /**
     * 设置配置项类型
     * @param ConfigType 配置项类型
     */
    public void setConfigType(String ConfigType) {
        this.ConfigType = ConfigType;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConfigName", this.ConfigName);
        this.setParamSimple(map, prefix + "ConfigVersion", this.ConfigVersion);
        this.setParamSimple(map, prefix + "ConfigValue", this.ConfigValue);
        this.setParamSimple(map, prefix + "ConfigVersionDesc", this.ConfigVersionDesc);
        this.setParamSimple(map, prefix + "ConfigType", this.ConfigType);

    }
}

