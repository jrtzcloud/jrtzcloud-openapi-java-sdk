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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class HostResource  extends AbstractModel{

    /**
    * cdh实例总cpu核数
    */
    @SerializedName("CpuTotal")
    @Expose
    private Integer CpuTotal;

    /**
    * cdh实例可用cpu核数
    */
    @SerializedName("CpuAvailable")
    @Expose
    private Integer CpuAvailable;

    /**
    * cdh实例总内存大小（单位为:GiB）
    */
    @SerializedName("MemTotal")
    @Expose
    private Float MemTotal;

    /**
    * cdh实例可用内存大小（单位为:GiB）
    */
    @SerializedName("MemAvailable")
    @Expose
    private Float MemAvailable;

    /**
    * cdh实例总磁盘大小（单位为:GiB）
    */
    @SerializedName("DiskTotal")
    @Expose
    private Integer DiskTotal;

    /**
    * cdh实例可用磁盘大小（单位为:GiB）
    */
    @SerializedName("DiskAvailable")
    @Expose
    private Integer DiskAvailable;

    /**
     * 获取cdh实例总cpu核数
     * @return CpuTotal cdh实例总cpu核数
     */
    public Integer getCpuTotal() {
        return this.CpuTotal;
    }

    /**
     * 设置cdh实例总cpu核数
     * @param CpuTotal cdh实例总cpu核数
     */
    public void setCpuTotal(Integer CpuTotal) {
        this.CpuTotal = CpuTotal;
    }

    /**
     * 获取cdh实例可用cpu核数
     * @return CpuAvailable cdh实例可用cpu核数
     */
    public Integer getCpuAvailable() {
        return this.CpuAvailable;
    }

    /**
     * 设置cdh实例可用cpu核数
     * @param CpuAvailable cdh实例可用cpu核数
     */
    public void setCpuAvailable(Integer CpuAvailable) {
        this.CpuAvailable = CpuAvailable;
    }

    /**
     * 获取cdh实例总内存大小（单位为:GiB）
     * @return MemTotal cdh实例总内存大小（单位为:GiB）
     */
    public Float getMemTotal() {
        return this.MemTotal;
    }

    /**
     * 设置cdh实例总内存大小（单位为:GiB）
     * @param MemTotal cdh实例总内存大小（单位为:GiB）
     */
    public void setMemTotal(Float MemTotal) {
        this.MemTotal = MemTotal;
    }

    /**
     * 获取cdh实例可用内存大小（单位为:GiB）
     * @return MemAvailable cdh实例可用内存大小（单位为:GiB）
     */
    public Float getMemAvailable() {
        return this.MemAvailable;
    }

    /**
     * 设置cdh实例可用内存大小（单位为:GiB）
     * @param MemAvailable cdh实例可用内存大小（单位为:GiB）
     */
    public void setMemAvailable(Float MemAvailable) {
        this.MemAvailable = MemAvailable;
    }

    /**
     * 获取cdh实例总磁盘大小（单位为:GiB）
     * @return DiskTotal cdh实例总磁盘大小（单位为:GiB）
     */
    public Integer getDiskTotal() {
        return this.DiskTotal;
    }

    /**
     * 设置cdh实例总磁盘大小（单位为:GiB）
     * @param DiskTotal cdh实例总磁盘大小（单位为:GiB）
     */
    public void setDiskTotal(Integer DiskTotal) {
        this.DiskTotal = DiskTotal;
    }

    /**
     * 获取cdh实例可用磁盘大小（单位为:GiB）
     * @return DiskAvailable cdh实例可用磁盘大小（单位为:GiB）
     */
    public Integer getDiskAvailable() {
        return this.DiskAvailable;
    }

    /**
     * 设置cdh实例可用磁盘大小（单位为:GiB）
     * @param DiskAvailable cdh实例可用磁盘大小（单位为:GiB）
     */
    public void setDiskAvailable(Integer DiskAvailable) {
        this.DiskAvailable = DiskAvailable;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CpuTotal", this.CpuTotal);
        this.setParamSimple(map, prefix + "CpuAvailable", this.CpuAvailable);
        this.setParamSimple(map, prefix + "MemTotal", this.MemTotal);
        this.setParamSimple(map, prefix + "MemAvailable", this.MemAvailable);
        this.setParamSimple(map, prefix + "DiskTotal", this.DiskTotal);
        this.setParamSimple(map, prefix + "DiskAvailable", this.DiskAvailable);

    }
}

