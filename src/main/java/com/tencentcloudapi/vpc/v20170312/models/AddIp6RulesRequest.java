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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class AddIp6RulesRequest  extends AbstractModel{

    /**
    * IPV6转换实例唯一ID，形如ip6-xxxxxxxx
    */
    @SerializedName("Ip6TranslatorId")
    @Expose
    private String Ip6TranslatorId;

    /**
    * IPV6转换规则信息
    */
    @SerializedName("Ip6RuleInfos")
    @Expose
    private Ip6RuleInfo [] Ip6RuleInfos;

    /**
    * IPV6转换规则名称
    */
    @SerializedName("Ip6RuleName")
    @Expose
    private String Ip6RuleName;

    /**
     * 获取IPV6转换实例唯一ID，形如ip6-xxxxxxxx
     * @return Ip6TranslatorId IPV6转换实例唯一ID，形如ip6-xxxxxxxx
     */
    public String getIp6TranslatorId() {
        return this.Ip6TranslatorId;
    }

    /**
     * 设置IPV6转换实例唯一ID，形如ip6-xxxxxxxx
     * @param Ip6TranslatorId IPV6转换实例唯一ID，形如ip6-xxxxxxxx
     */
    public void setIp6TranslatorId(String Ip6TranslatorId) {
        this.Ip6TranslatorId = Ip6TranslatorId;
    }

    /**
     * 获取IPV6转换规则信息
     * @return Ip6RuleInfos IPV6转换规则信息
     */
    public Ip6RuleInfo [] getIp6RuleInfos() {
        return this.Ip6RuleInfos;
    }

    /**
     * 设置IPV6转换规则信息
     * @param Ip6RuleInfos IPV6转换规则信息
     */
    public void setIp6RuleInfos(Ip6RuleInfo [] Ip6RuleInfos) {
        this.Ip6RuleInfos = Ip6RuleInfos;
    }

    /**
     * 获取IPV6转换规则名称
     * @return Ip6RuleName IPV6转换规则名称
     */
    public String getIp6RuleName() {
        return this.Ip6RuleName;
    }

    /**
     * 设置IPV6转换规则名称
     * @param Ip6RuleName IPV6转换规则名称
     */
    public void setIp6RuleName(String Ip6RuleName) {
        this.Ip6RuleName = Ip6RuleName;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Ip6TranslatorId", this.Ip6TranslatorId);
        this.setParamArrayObj(map, prefix + "Ip6RuleInfos.", this.Ip6RuleInfos);
        this.setParamSimple(map, prefix + "Ip6RuleName", this.Ip6RuleName);

    }
}

