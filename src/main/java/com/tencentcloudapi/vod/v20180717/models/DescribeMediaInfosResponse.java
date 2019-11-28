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
package com.tencentcloudapi.vod.v20180717.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMediaInfosResponse  extends AbstractModel{

    /**
    * 媒体文件信息列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MediaInfoSet")
    @Expose
    private MediaInfo [] MediaInfoSet;

    /**
    * 不存在的文件 ID 列表。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NotExistFileIdSet")
    @Expose
    private String [] NotExistFileIdSet;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取媒体文件信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @return MediaInfoSet 媒体文件信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public MediaInfo [] getMediaInfoSet() {
        return this.MediaInfoSet;
    }

    /**
     * 设置媒体文件信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MediaInfoSet 媒体文件信息列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMediaInfoSet(MediaInfo [] MediaInfoSet) {
        this.MediaInfoSet = MediaInfoSet;
    }

    /**
     * 获取不存在的文件 ID 列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @return NotExistFileIdSet 不存在的文件 ID 列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getNotExistFileIdSet() {
        return this.NotExistFileIdSet;
    }

    /**
     * 设置不存在的文件 ID 列表。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NotExistFileIdSet 不存在的文件 ID 列表。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNotExistFileIdSet(String [] NotExistFileIdSet) {
        this.NotExistFileIdSet = NotExistFileIdSet;
    }

    /**
     * 获取唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * 设置唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "MediaInfoSet.", this.MediaInfoSet);
        this.setParamArraySimple(map, prefix + "NotExistFileIdSet.", this.NotExistFileIdSet);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

