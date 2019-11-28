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
package com.tencentcloudapi.kms.v20190118.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CancelKeyDeletionRequest  extends AbstractModel{

    /**
    * 需要被取消删除的CMK的唯一标志
    */
    @SerializedName("KeyId")
    @Expose
    private String KeyId;

    /**
     * 获取需要被取消删除的CMK的唯一标志
     * @return KeyId 需要被取消删除的CMK的唯一标志
     */
    public String getKeyId() {
        return this.KeyId;
    }

    /**
     * 设置需要被取消删除的CMK的唯一标志
     * @param KeyId 需要被取消删除的CMK的唯一标志
     */
    public void setKeyId(String KeyId) {
        this.KeyId = KeyId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "KeyId", this.KeyId);

    }
}

