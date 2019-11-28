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
package com.tencentcloudapi.cfs.v20190719.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class PGroupRuleInfo  extends AbstractModel{

    /**
    * 规则ID
    */
    @SerializedName("RuleId")
    @Expose
    private String RuleId;

    /**
    * 允许访问的客户端IP
    */
    @SerializedName("AuthClientIp")
    @Expose
    private String AuthClientIp;

    /**
    * 读写权限, ro为只读，rw为读写
    */
    @SerializedName("RWPermission")
    @Expose
    private String RWPermission;

    /**
    * 用户权限。其中all_squash为所有访问用户都会被映射为匿名用户或用户组；no_all_squash为访问用户会先与本机用户匹配，匹配失败后再映射为匿名用户或用户组；root_squash为将来访的root用户映射为匿名用户或用户组；no_root_squash为来访的root用户保持root帐号权限。
    */
    @SerializedName("UserPermission")
    @Expose
    private String UserPermission;

    /**
    * 规则优先级，1-100。 其中 1 为最高，100为最低
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
     * 获取规则ID
     * @return RuleId 规则ID
     */
    public String getRuleId() {
        return this.RuleId;
    }

    /**
     * 设置规则ID
     * @param RuleId 规则ID
     */
    public void setRuleId(String RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * 获取允许访问的客户端IP
     * @return AuthClientIp 允许访问的客户端IP
     */
    public String getAuthClientIp() {
        return this.AuthClientIp;
    }

    /**
     * 设置允许访问的客户端IP
     * @param AuthClientIp 允许访问的客户端IP
     */
    public void setAuthClientIp(String AuthClientIp) {
        this.AuthClientIp = AuthClientIp;
    }

    /**
     * 获取读写权限, ro为只读，rw为读写
     * @return RWPermission 读写权限, ro为只读，rw为读写
     */
    public String getRWPermission() {
        return this.RWPermission;
    }

    /**
     * 设置读写权限, ro为只读，rw为读写
     * @param RWPermission 读写权限, ro为只读，rw为读写
     */
    public void setRWPermission(String RWPermission) {
        this.RWPermission = RWPermission;
    }

    /**
     * 获取用户权限。其中all_squash为所有访问用户都会被映射为匿名用户或用户组；no_all_squash为访问用户会先与本机用户匹配，匹配失败后再映射为匿名用户或用户组；root_squash为将来访的root用户映射为匿名用户或用户组；no_root_squash为来访的root用户保持root帐号权限。
     * @return UserPermission 用户权限。其中all_squash为所有访问用户都会被映射为匿名用户或用户组；no_all_squash为访问用户会先与本机用户匹配，匹配失败后再映射为匿名用户或用户组；root_squash为将来访的root用户映射为匿名用户或用户组；no_root_squash为来访的root用户保持root帐号权限。
     */
    public String getUserPermission() {
        return this.UserPermission;
    }

    /**
     * 设置用户权限。其中all_squash为所有访问用户都会被映射为匿名用户或用户组；no_all_squash为访问用户会先与本机用户匹配，匹配失败后再映射为匿名用户或用户组；root_squash为将来访的root用户映射为匿名用户或用户组；no_root_squash为来访的root用户保持root帐号权限。
     * @param UserPermission 用户权限。其中all_squash为所有访问用户都会被映射为匿名用户或用户组；no_all_squash为访问用户会先与本机用户匹配，匹配失败后再映射为匿名用户或用户组；root_squash为将来访的root用户映射为匿名用户或用户组；no_root_squash为来访的root用户保持root帐号权限。
     */
    public void setUserPermission(String UserPermission) {
        this.UserPermission = UserPermission;
    }

    /**
     * 获取规则优先级，1-100。 其中 1 为最高，100为最低
     * @return Priority 规则优先级，1-100。 其中 1 为最高，100为最低
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * 设置规则优先级，1-100。 其中 1 为最高，100为最低
     * @param Priority 规则优先级，1-100。 其中 1 为最高，100为最低
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "AuthClientIp", this.AuthClientIp);
        this.setParamSimple(map, prefix + "RWPermission", this.RWPermission);
        this.setParamSimple(map, prefix + "UserPermission", this.UserPermission);
        this.setParamSimple(map, prefix + "Priority", this.Priority);

    }
}

