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
package com.tencentcloudapi.bmlb.v20180625.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeTrafficMirrorReceiverHealthStatusRequest  extends AbstractModel{

    /**
    * 查询所在的流量镜像ID。
    */
    @SerializedName("TrafficMirrorId")
    @Expose
    private String TrafficMirrorId;

    /**
    * 流量镜像接收机实例ID和端口数组。
    */
    @SerializedName("ReceiverSet")
    @Expose
    private DescribeTrafficMirrorReceiver [] ReceiverSet;

    /**
     * 获取查询所在的流量镜像ID。
     * @return TrafficMirrorId 查询所在的流量镜像ID。
     */
    public String getTrafficMirrorId() {
        return this.TrafficMirrorId;
    }

    /**
     * 设置查询所在的流量镜像ID。
     * @param TrafficMirrorId 查询所在的流量镜像ID。
     */
    public void setTrafficMirrorId(String TrafficMirrorId) {
        this.TrafficMirrorId = TrafficMirrorId;
    }

    /**
     * 获取流量镜像接收机实例ID和端口数组。
     * @return ReceiverSet 流量镜像接收机实例ID和端口数组。
     */
    public DescribeTrafficMirrorReceiver [] getReceiverSet() {
        return this.ReceiverSet;
    }

    /**
     * 设置流量镜像接收机实例ID和端口数组。
     * @param ReceiverSet 流量镜像接收机实例ID和端口数组。
     */
    public void setReceiverSet(DescribeTrafficMirrorReceiver [] ReceiverSet) {
        this.ReceiverSet = ReceiverSet;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TrafficMirrorId", this.TrafficMirrorId);
        this.setParamArrayObj(map, prefix + "ReceiverSet.", this.ReceiverSet);

    }
}

