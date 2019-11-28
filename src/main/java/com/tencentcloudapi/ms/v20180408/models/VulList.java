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

public class VulList  extends AbstractModel{

    /**
    * 漏洞id
    */
    @SerializedName("VulId")
    @Expose
    private String VulId;

    /**
    * 漏洞名称
    */
    @SerializedName("VulName")
    @Expose
    private String VulName;

    /**
    * 漏洞代码
    */
    @SerializedName("VulCode")
    @Expose
    private String VulCode;

    /**
    * 漏洞描述
    */
    @SerializedName("VulDesc")
    @Expose
    private String VulDesc;

    /**
    * 漏洞解决方案
    */
    @SerializedName("VulSolution")
    @Expose
    private String VulSolution;

    /**
    * 漏洞来源类别，0默认自身，1第三方插件
    */
    @SerializedName("VulSrcType")
    @Expose
    private Integer VulSrcType;

    /**
    * 漏洞位置
    */
    @SerializedName("VulFilepath")
    @Expose
    private String VulFilepath;

    /**
    * 风险级别：1 低风险 ；2中等风险；3 高风险
    */
    @SerializedName("RiskLevel")
    @Expose
    private Integer RiskLevel;

    /**
     * 获取漏洞id
     * @return VulId 漏洞id
     */
    public String getVulId() {
        return this.VulId;
    }

    /**
     * 设置漏洞id
     * @param VulId 漏洞id
     */
    public void setVulId(String VulId) {
        this.VulId = VulId;
    }

    /**
     * 获取漏洞名称
     * @return VulName 漏洞名称
     */
    public String getVulName() {
        return this.VulName;
    }

    /**
     * 设置漏洞名称
     * @param VulName 漏洞名称
     */
    public void setVulName(String VulName) {
        this.VulName = VulName;
    }

    /**
     * 获取漏洞代码
     * @return VulCode 漏洞代码
     */
    public String getVulCode() {
        return this.VulCode;
    }

    /**
     * 设置漏洞代码
     * @param VulCode 漏洞代码
     */
    public void setVulCode(String VulCode) {
        this.VulCode = VulCode;
    }

    /**
     * 获取漏洞描述
     * @return VulDesc 漏洞描述
     */
    public String getVulDesc() {
        return this.VulDesc;
    }

    /**
     * 设置漏洞描述
     * @param VulDesc 漏洞描述
     */
    public void setVulDesc(String VulDesc) {
        this.VulDesc = VulDesc;
    }

    /**
     * 获取漏洞解决方案
     * @return VulSolution 漏洞解决方案
     */
    public String getVulSolution() {
        return this.VulSolution;
    }

    /**
     * 设置漏洞解决方案
     * @param VulSolution 漏洞解决方案
     */
    public void setVulSolution(String VulSolution) {
        this.VulSolution = VulSolution;
    }

    /**
     * 获取漏洞来源类别，0默认自身，1第三方插件
     * @return VulSrcType 漏洞来源类别，0默认自身，1第三方插件
     */
    public Integer getVulSrcType() {
        return this.VulSrcType;
    }

    /**
     * 设置漏洞来源类别，0默认自身，1第三方插件
     * @param VulSrcType 漏洞来源类别，0默认自身，1第三方插件
     */
    public void setVulSrcType(Integer VulSrcType) {
        this.VulSrcType = VulSrcType;
    }

    /**
     * 获取漏洞位置
     * @return VulFilepath 漏洞位置
     */
    public String getVulFilepath() {
        return this.VulFilepath;
    }

    /**
     * 设置漏洞位置
     * @param VulFilepath 漏洞位置
     */
    public void setVulFilepath(String VulFilepath) {
        this.VulFilepath = VulFilepath;
    }

    /**
     * 获取风险级别：1 低风险 ；2中等风险；3 高风险
     * @return RiskLevel 风险级别：1 低风险 ；2中等风险；3 高风险
     */
    public Integer getRiskLevel() {
        return this.RiskLevel;
    }

    /**
     * 设置风险级别：1 低风险 ；2中等风险；3 高风险
     * @param RiskLevel 风险级别：1 低风险 ；2中等风险；3 高风险
     */
    public void setRiskLevel(Integer RiskLevel) {
        this.RiskLevel = RiskLevel;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VulId", this.VulId);
        this.setParamSimple(map, prefix + "VulName", this.VulName);
        this.setParamSimple(map, prefix + "VulCode", this.VulCode);
        this.setParamSimple(map, prefix + "VulDesc", this.VulDesc);
        this.setParamSimple(map, prefix + "VulSolution", this.VulSolution);
        this.setParamSimple(map, prefix + "VulSrcType", this.VulSrcType);
        this.setParamSimple(map, prefix + "VulFilepath", this.VulFilepath);
        this.setParamSimple(map, prefix + "RiskLevel", this.RiskLevel);

    }
}

