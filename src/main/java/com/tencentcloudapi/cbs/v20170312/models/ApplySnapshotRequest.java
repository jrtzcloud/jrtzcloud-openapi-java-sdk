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
package com.tencentcloudapi.cbs.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplySnapshotRequest  extends AbstractModel{

    /**
    * 快照ID, 可通过[DescribeSnapshots](/document/product/362/15647)查询。
    */
    @SerializedName("SnapshotId")
    @Expose
    private String SnapshotId;

    /**
    * 快照原云硬盘ID，可通过[DescribeDisks](/document/product/362/16315)接口查询。
    */
    @SerializedName("DiskId")
    @Expose
    private String DiskId;

    /**
     * 获取快照ID, 可通过[DescribeSnapshots](/document/product/362/15647)查询。
     * @return SnapshotId 快照ID, 可通过[DescribeSnapshots](/document/product/362/15647)查询。
     */
    public String getSnapshotId() {
        return this.SnapshotId;
    }

    /**
     * 设置快照ID, 可通过[DescribeSnapshots](/document/product/362/15647)查询。
     * @param SnapshotId 快照ID, 可通过[DescribeSnapshots](/document/product/362/15647)查询。
     */
    public void setSnapshotId(String SnapshotId) {
        this.SnapshotId = SnapshotId;
    }

    /**
     * 获取快照原云硬盘ID，可通过[DescribeDisks](/document/product/362/16315)接口查询。
     * @return DiskId 快照原云硬盘ID，可通过[DescribeDisks](/document/product/362/16315)接口查询。
     */
    public String getDiskId() {
        return this.DiskId;
    }

    /**
     * 设置快照原云硬盘ID，可通过[DescribeDisks](/document/product/362/16315)接口查询。
     * @param DiskId 快照原云硬盘ID，可通过[DescribeDisks](/document/product/362/16315)接口查询。
     */
    public void setDiskId(String DiskId) {
        this.DiskId = DiskId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "SnapshotId", this.SnapshotId);
        this.setParamSimple(map, prefix + "DiskId", this.DiskId);

    }
}

