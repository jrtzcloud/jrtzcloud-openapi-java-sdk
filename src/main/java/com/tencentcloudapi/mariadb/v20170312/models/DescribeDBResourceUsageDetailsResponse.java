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
package com.tencentcloudapi.mariadb.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeDBResourceUsageDetailsResponse  extends AbstractModel{

    /**
    * 主节点资源使用情况监控数据
    */
    @SerializedName("Master")
    @Expose
    private ResourceUsageMonitorSet Master;

    /**
    * 备机1资源使用情况监控数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Slave1")
    @Expose
    private ResourceUsageMonitorSet Slave1;

    /**
    * 备机2资源使用情况监控数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Slave2")
    @Expose
    private ResourceUsageMonitorSet Slave2;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取主节点资源使用情况监控数据
     * @return Master 主节点资源使用情况监控数据
     */
    public ResourceUsageMonitorSet getMaster() {
        return this.Master;
    }

    /**
     * 设置主节点资源使用情况监控数据
     * @param Master 主节点资源使用情况监控数据
     */
    public void setMaster(ResourceUsageMonitorSet Master) {
        this.Master = Master;
    }

    /**
     * 获取备机1资源使用情况监控数据
注意：此字段可能返回 null，表示取不到有效值。
     * @return Slave1 备机1资源使用情况监控数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceUsageMonitorSet getSlave1() {
        return this.Slave1;
    }

    /**
     * 设置备机1资源使用情况监控数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Slave1 备机1资源使用情况监控数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlave1(ResourceUsageMonitorSet Slave1) {
        this.Slave1 = Slave1;
    }

    /**
     * 获取备机2资源使用情况监控数据
注意：此字段可能返回 null，表示取不到有效值。
     * @return Slave2 备机2资源使用情况监控数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ResourceUsageMonitorSet getSlave2() {
        return this.Slave2;
    }

    /**
     * 设置备机2资源使用情况监控数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param Slave2 备机2资源使用情况监控数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSlave2(ResourceUsageMonitorSet Slave2) {
        this.Slave2 = Slave2;
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
        this.setParamObj(map, prefix + "Master.", this.Master);
        this.setParamObj(map, prefix + "Slave1.", this.Slave1);
        this.setParamObj(map, prefix + "Slave2.", this.Slave2);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

