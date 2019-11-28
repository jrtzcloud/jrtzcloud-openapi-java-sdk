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
package com.tencentcloudapi.cdn.v20180606.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeMapInfoResponse  extends AbstractModel{

    /**
    * 映射关系数组。
    */
    @SerializedName("MapInfoList")
    @Expose
    private MapInfo [] MapInfoList;

    /**
    * 服务端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServerRegionRelation")
    @Expose
    private RegionMapRelation [] ServerRegionRelation;

    /**
    * 客户端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientRegionRelation")
    @Expose
    private RegionMapRelation [] ClientRegionRelation;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取映射关系数组。
     * @return MapInfoList 映射关系数组。
     */
    public MapInfo [] getMapInfoList() {
        return this.MapInfoList;
    }

    /**
     * 设置映射关系数组。
     * @param MapInfoList 映射关系数组。
     */
    public void setMapInfoList(MapInfo [] MapInfoList) {
        this.MapInfoList = MapInfoList;
    }

    /**
     * 获取服务端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ServerRegionRelation 服务端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RegionMapRelation [] getServerRegionRelation() {
        return this.ServerRegionRelation;
    }

    /**
     * 设置服务端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServerRegionRelation 服务端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServerRegionRelation(RegionMapRelation [] ServerRegionRelation) {
        this.ServerRegionRelation = ServerRegionRelation;
    }

    /**
     * 获取客户端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClientRegionRelation 客户端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public RegionMapRelation [] getClientRegionRelation() {
        return this.ClientRegionRelation;
    }

    /**
     * 设置客户端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientRegionRelation 客户端区域id和子区域id的映射关系。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientRegionRelation(RegionMapRelation [] ClientRegionRelation) {
        this.ClientRegionRelation = ClientRegionRelation;
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
        this.setParamArrayObj(map, prefix + "MapInfoList.", this.MapInfoList);
        this.setParamArrayObj(map, prefix + "ServerRegionRelation.", this.ServerRegionRelation);
        this.setParamArrayObj(map, prefix + "ClientRegionRelation.", this.ClientRegionRelation);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

