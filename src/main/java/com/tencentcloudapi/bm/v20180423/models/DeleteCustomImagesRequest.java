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
package com.tencentcloudapi.bm.v20180423.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteCustomImagesRequest  extends AbstractModel{

    /**
    * 准备删除的镜像ID列表
    */
    @SerializedName("ImageIds")
    @Expose
    private String [] ImageIds;

    /**
     * 获取准备删除的镜像ID列表
     * @return ImageIds 准备删除的镜像ID列表
     */
    public String [] getImageIds() {
        return this.ImageIds;
    }

    /**
     * 设置准备删除的镜像ID列表
     * @param ImageIds 准备删除的镜像ID列表
     */
    public void setImageIds(String [] ImageIds) {
        this.ImageIds = ImageIds;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ImageIds.", this.ImageIds);

    }
}

