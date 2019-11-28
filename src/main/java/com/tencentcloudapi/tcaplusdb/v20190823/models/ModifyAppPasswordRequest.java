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
package com.tencentcloudapi.tcaplusdb.v20190823.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyAppPasswordRequest  extends AbstractModel{

    /**
    * 需要修改密码的应用实例ID
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 应用旧密码
    */
    @SerializedName("OldPassword")
    @Expose
    private String OldPassword;

    /**
    * 应用旧密码预期失效时间
    */
    @SerializedName("OldPasswordExpireTime")
    @Expose
    private String OldPasswordExpireTime;

    /**
    * 应用新密码
    */
    @SerializedName("NewPassword")
    @Expose
    private String NewPassword;

    /**
    * 更新模式： `1` 更新密码；`2` 更新旧密码失效时间，默认为`1` 模式
    */
    @SerializedName("Mode")
    @Expose
    private String Mode;

    /**
     * 获取需要修改密码的应用实例ID
     * @return ApplicationId 需要修改密码的应用实例ID
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * 设置需要修改密码的应用实例ID
     * @param ApplicationId 需要修改密码的应用实例ID
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * 获取应用旧密码
     * @return OldPassword 应用旧密码
     */
    public String getOldPassword() {
        return this.OldPassword;
    }

    /**
     * 设置应用旧密码
     * @param OldPassword 应用旧密码
     */
    public void setOldPassword(String OldPassword) {
        this.OldPassword = OldPassword;
    }

    /**
     * 获取应用旧密码预期失效时间
     * @return OldPasswordExpireTime 应用旧密码预期失效时间
     */
    public String getOldPasswordExpireTime() {
        return this.OldPasswordExpireTime;
    }

    /**
     * 设置应用旧密码预期失效时间
     * @param OldPasswordExpireTime 应用旧密码预期失效时间
     */
    public void setOldPasswordExpireTime(String OldPasswordExpireTime) {
        this.OldPasswordExpireTime = OldPasswordExpireTime;
    }

    /**
     * 获取应用新密码
     * @return NewPassword 应用新密码
     */
    public String getNewPassword() {
        return this.NewPassword;
    }

    /**
     * 设置应用新密码
     * @param NewPassword 应用新密码
     */
    public void setNewPassword(String NewPassword) {
        this.NewPassword = NewPassword;
    }

    /**
     * 获取更新模式： `1` 更新密码；`2` 更新旧密码失效时间，默认为`1` 模式
     * @return Mode 更新模式： `1` 更新密码；`2` 更新旧密码失效时间，默认为`1` 模式
     */
    public String getMode() {
        return this.Mode;
    }

    /**
     * 设置更新模式： `1` 更新密码；`2` 更新旧密码失效时间，默认为`1` 模式
     * @param Mode 更新模式： `1` 更新密码；`2` 更新旧密码失效时间，默认为`1` 模式
     */
    public void setMode(String Mode) {
        this.Mode = Mode;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "OldPassword", this.OldPassword);
        this.setParamSimple(map, prefix + "OldPasswordExpireTime", this.OldPasswordExpireTime);
        this.setParamSimple(map, prefix + "NewPassword", this.NewPassword);
        this.setParamSimple(map, prefix + "Mode", this.Mode);

    }
}

