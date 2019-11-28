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
package com.tencentcloudapi.gme.v20180711.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VoiceMessageConf  extends AbstractModel{

    /**
    * 离线语音服务开关，取值：open/close
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 离线语音支持语种，取值： all-全部，cnen-中英文。默认为中英文
    */
    @SerializedName("Language")
    @Expose
    private String Language;

    /**
     * 获取离线语音服务开关，取值：open/close
     * @return Status 离线语音服务开关，取值：open/close
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置离线语音服务开关，取值：open/close
     * @param Status 离线语音服务开关，取值：open/close
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取离线语音支持语种，取值： all-全部，cnen-中英文。默认为中英文
     * @return Language 离线语音支持语种，取值： all-全部，cnen-中英文。默认为中英文
     */
    public String getLanguage() {
        return this.Language;
    }

    /**
     * 设置离线语音支持语种，取值： all-全部，cnen-中英文。默认为中英文
     * @param Language 离线语音支持语种，取值： all-全部，cnen-中英文。默认为中英文
     */
    public void setLanguage(String Language) {
        this.Language = Language;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "Language", this.Language);

    }
}

