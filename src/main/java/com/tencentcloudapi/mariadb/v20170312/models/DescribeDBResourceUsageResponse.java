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

public class DescribeDBResourceUsageResponse  extends AbstractModel{

    /**
    * binlog日志磁盘可用空间,单位GB
    */
    @SerializedName("BinlogDiskAvailable")
    @Expose
    private MonitorData BinlogDiskAvailable;

    /**
    * 磁盘可用空间,单位GB
    */
    @SerializedName("DataDiskAvailable")
    @Expose
    private MonitorData DataDiskAvailable;

    /**
    * CPU利用率
    */
    @SerializedName("CpuUsageRate")
    @Expose
    private MonitorData CpuUsageRate;

    /**
    * 内存可用空间,单位GB
    */
    @SerializedName("MemAvailable")
    @Expose
    private MonitorData MemAvailable;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 获取binlog日志磁盘可用空间,单位GB
     * @return BinlogDiskAvailable binlog日志磁盘可用空间,单位GB
     */
    public MonitorData getBinlogDiskAvailable() {
        return this.BinlogDiskAvailable;
    }

    /**
     * 设置binlog日志磁盘可用空间,单位GB
     * @param BinlogDiskAvailable binlog日志磁盘可用空间,单位GB
     */
    public void setBinlogDiskAvailable(MonitorData BinlogDiskAvailable) {
        this.BinlogDiskAvailable = BinlogDiskAvailable;
    }

    /**
     * 获取磁盘可用空间,单位GB
     * @return DataDiskAvailable 磁盘可用空间,单位GB
     */
    public MonitorData getDataDiskAvailable() {
        return this.DataDiskAvailable;
    }

    /**
     * 设置磁盘可用空间,单位GB
     * @param DataDiskAvailable 磁盘可用空间,单位GB
     */
    public void setDataDiskAvailable(MonitorData DataDiskAvailable) {
        this.DataDiskAvailable = DataDiskAvailable;
    }

    /**
     * 获取CPU利用率
     * @return CpuUsageRate CPU利用率
     */
    public MonitorData getCpuUsageRate() {
        return this.CpuUsageRate;
    }

    /**
     * 设置CPU利用率
     * @param CpuUsageRate CPU利用率
     */
    public void setCpuUsageRate(MonitorData CpuUsageRate) {
        this.CpuUsageRate = CpuUsageRate;
    }

    /**
     * 获取内存可用空间,单位GB
     * @return MemAvailable 内存可用空间,单位GB
     */
    public MonitorData getMemAvailable() {
        return this.MemAvailable;
    }

    /**
     * 设置内存可用空间,单位GB
     * @param MemAvailable 内存可用空间,单位GB
     */
    public void setMemAvailable(MonitorData MemAvailable) {
        this.MemAvailable = MemAvailable;
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
        this.setParamObj(map, prefix + "BinlogDiskAvailable.", this.BinlogDiskAvailable);
        this.setParamObj(map, prefix + "DataDiskAvailable.", this.DataDiskAvailable);
        this.setParamObj(map, prefix + "CpuUsageRate.", this.CpuUsageRate);
        this.setParamObj(map, prefix + "MemAvailable.", this.MemAvailable);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

