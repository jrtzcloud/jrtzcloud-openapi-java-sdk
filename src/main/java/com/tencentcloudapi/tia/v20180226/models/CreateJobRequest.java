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
package com.tencentcloudapi.tia.v20180226.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateJobRequest  extends AbstractModel{

    /**
    * 任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 运行任务的集群，详见 [使用集群](https://cloud.tencent.com/document/product/851/17317)
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 运行任务的环境，详见 [运行环境](https://cloud.tencent.com/document/product/851/17320)
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * 挂载的路径，支持 NFS，[CFS](https://cloud.tencent.com/product/cfs) 和 [COS](https://cloud.tencent.com/product/cos)，其中 COS 只在 [TI-A 定制环境](https://cloud.tencent.com/document/product/851/17320#ti-a-.E5.AE.9A.E5.88.B6.E7.8E.AF.E5.A2.83) 中支持
    */
    @SerializedName("PackageDir")
    @Expose
    private String [] PackageDir;

    /**
    * 任务启动命令
    */
    @SerializedName("Command")
    @Expose
    private String [] Command;

    /**
    * 任务启动参数
    */
    @SerializedName("Args")
    @Expose
    private String [] Args;

    /**
    * 运行任务的配置信息，详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
    */
    @SerializedName("ScaleTier")
    @Expose
    private String ScaleTier;

    /**
    * Master 机器类型，ScaleTier 取值为 `CUSTOM` 时必填，详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
    */
    @SerializedName("MasterType")
    @Expose
    private String MasterType;

    /**
    * Worker 机器类型，ScaleTier 取值为 `CUSTOM` 时必填，详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
    */
    @SerializedName("WorkerType")
    @Expose
    private String WorkerType;

    /**
    * Parameter server 机器类型，ScaleTier 取值为 `CUSTOM` 时必填,详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
    */
    @SerializedName("ParameterServerType")
    @Expose
    private String ParameterServerType;

    /**
    * Worker 机器数量，ScaleTier 取值为 `CUSTOM` 时必填,详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
    */
    @SerializedName("WorkerCount")
    @Expose
    private Integer WorkerCount;

    /**
    * Parameter server 机器数量，ScaleTier 取值为 `CUSTOM` 时必填,详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
    */
    @SerializedName("ParameterServerCount")
    @Expose
    private Integer ParameterServerCount;

    /**
    * 启动 debug 模式，默认为 false
    */
    @SerializedName("Debug")
    @Expose
    private Boolean Debug;

    /**
    * 运行任务的其他配置信息
    */
    @SerializedName("RuntimeConf")
    @Expose
    private String [] RuntimeConf;

    /**
     * 获取任务名称
     * @return Name 任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * 设置任务名称
     * @param Name 任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * 获取运行任务的集群，详见 [使用集群](https://cloud.tencent.com/document/product/851/17317)
     * @return Cluster 运行任务的集群，详见 [使用集群](https://cloud.tencent.com/document/product/851/17317)
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * 设置运行任务的集群，详见 [使用集群](https://cloud.tencent.com/document/product/851/17317)
     * @param Cluster 运行任务的集群，详见 [使用集群](https://cloud.tencent.com/document/product/851/17317)
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * 获取运行任务的环境，详见 [运行环境](https://cloud.tencent.com/document/product/851/17320)
     * @return RuntimeVersion 运行任务的环境，详见 [运行环境](https://cloud.tencent.com/document/product/851/17320)
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * 设置运行任务的环境，详见 [运行环境](https://cloud.tencent.com/document/product/851/17320)
     * @param RuntimeVersion 运行任务的环境，详见 [运行环境](https://cloud.tencent.com/document/product/851/17320)
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * 获取挂载的路径，支持 NFS，[CFS](https://cloud.tencent.com/product/cfs) 和 [COS](https://cloud.tencent.com/product/cos)，其中 COS 只在 [TI-A 定制环境](https://cloud.tencent.com/document/product/851/17320#ti-a-.E5.AE.9A.E5.88.B6.E7.8E.AF.E5.A2.83) 中支持
     * @return PackageDir 挂载的路径，支持 NFS，[CFS](https://cloud.tencent.com/product/cfs) 和 [COS](https://cloud.tencent.com/product/cos)，其中 COS 只在 [TI-A 定制环境](https://cloud.tencent.com/document/product/851/17320#ti-a-.E5.AE.9A.E5.88.B6.E7.8E.AF.E5.A2.83) 中支持
     */
    public String [] getPackageDir() {
        return this.PackageDir;
    }

    /**
     * 设置挂载的路径，支持 NFS，[CFS](https://cloud.tencent.com/product/cfs) 和 [COS](https://cloud.tencent.com/product/cos)，其中 COS 只在 [TI-A 定制环境](https://cloud.tencent.com/document/product/851/17320#ti-a-.E5.AE.9A.E5.88.B6.E7.8E.AF.E5.A2.83) 中支持
     * @param PackageDir 挂载的路径，支持 NFS，[CFS](https://cloud.tencent.com/product/cfs) 和 [COS](https://cloud.tencent.com/product/cos)，其中 COS 只在 [TI-A 定制环境](https://cloud.tencent.com/document/product/851/17320#ti-a-.E5.AE.9A.E5.88.B6.E7.8E.AF.E5.A2.83) 中支持
     */
    public void setPackageDir(String [] PackageDir) {
        this.PackageDir = PackageDir;
    }

    /**
     * 获取任务启动命令
     * @return Command 任务启动命令
     */
    public String [] getCommand() {
        return this.Command;
    }

    /**
     * 设置任务启动命令
     * @param Command 任务启动命令
     */
    public void setCommand(String [] Command) {
        this.Command = Command;
    }

    /**
     * 获取任务启动参数
     * @return Args 任务启动参数
     */
    public String [] getArgs() {
        return this.Args;
    }

    /**
     * 设置任务启动参数
     * @param Args 任务启动参数
     */
    public void setArgs(String [] Args) {
        this.Args = Args;
    }

    /**
     * 获取运行任务的配置信息，详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     * @return ScaleTier 运行任务的配置信息，详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     */
    public String getScaleTier() {
        return this.ScaleTier;
    }

    /**
     * 设置运行任务的配置信息，详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     * @param ScaleTier 运行任务的配置信息，详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     */
    public void setScaleTier(String ScaleTier) {
        this.ScaleTier = ScaleTier;
    }

    /**
     * 获取Master 机器类型，ScaleTier 取值为 `CUSTOM` 时必填，详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     * @return MasterType Master 机器类型，ScaleTier 取值为 `CUSTOM` 时必填，详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     */
    public String getMasterType() {
        return this.MasterType;
    }

    /**
     * 设置Master 机器类型，ScaleTier 取值为 `CUSTOM` 时必填，详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     * @param MasterType Master 机器类型，ScaleTier 取值为 `CUSTOM` 时必填，详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     */
    public void setMasterType(String MasterType) {
        this.MasterType = MasterType;
    }

    /**
     * 获取Worker 机器类型，ScaleTier 取值为 `CUSTOM` 时必填，详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     * @return WorkerType Worker 机器类型，ScaleTier 取值为 `CUSTOM` 时必填，详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     */
    public String getWorkerType() {
        return this.WorkerType;
    }

    /**
     * 设置Worker 机器类型，ScaleTier 取值为 `CUSTOM` 时必填，详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     * @param WorkerType Worker 机器类型，ScaleTier 取值为 `CUSTOM` 时必填，详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     */
    public void setWorkerType(String WorkerType) {
        this.WorkerType = WorkerType;
    }

    /**
     * 获取Parameter server 机器类型，ScaleTier 取值为 `CUSTOM` 时必填,详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     * @return ParameterServerType Parameter server 机器类型，ScaleTier 取值为 `CUSTOM` 时必填,详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     */
    public String getParameterServerType() {
        return this.ParameterServerType;
    }

    /**
     * 设置Parameter server 机器类型，ScaleTier 取值为 `CUSTOM` 时必填,详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     * @param ParameterServerType Parameter server 机器类型，ScaleTier 取值为 `CUSTOM` 时必填,详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     */
    public void setParameterServerType(String ParameterServerType) {
        this.ParameterServerType = ParameterServerType;
    }

    /**
     * 获取Worker 机器数量，ScaleTier 取值为 `CUSTOM` 时必填,详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     * @return WorkerCount Worker 机器数量，ScaleTier 取值为 `CUSTOM` 时必填,详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     */
    public Integer getWorkerCount() {
        return this.WorkerCount;
    }

    /**
     * 设置Worker 机器数量，ScaleTier 取值为 `CUSTOM` 时必填,详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     * @param WorkerCount Worker 机器数量，ScaleTier 取值为 `CUSTOM` 时必填,详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     */
    public void setWorkerCount(Integer WorkerCount) {
        this.WorkerCount = WorkerCount;
    }

    /**
     * 获取Parameter server 机器数量，ScaleTier 取值为 `CUSTOM` 时必填,详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     * @return ParameterServerCount Parameter server 机器数量，ScaleTier 取值为 `CUSTOM` 时必填,详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     */
    public Integer getParameterServerCount() {
        return this.ParameterServerCount;
    }

    /**
     * 设置Parameter server 机器数量，ScaleTier 取值为 `CUSTOM` 时必填,详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     * @param ParameterServerCount Parameter server 机器数量，ScaleTier 取值为 `CUSTOM` 时必填,详见 [训练规模](https://cloud.tencent.com/document/product/851/17319)
     */
    public void setParameterServerCount(Integer ParameterServerCount) {
        this.ParameterServerCount = ParameterServerCount;
    }

    /**
     * 获取启动 debug 模式，默认为 false
     * @return Debug 启动 debug 模式，默认为 false
     */
    public Boolean getDebug() {
        return this.Debug;
    }

    /**
     * 设置启动 debug 模式，默认为 false
     * @param Debug 启动 debug 模式，默认为 false
     */
    public void setDebug(Boolean Debug) {
        this.Debug = Debug;
    }

    /**
     * 获取运行任务的其他配置信息
     * @return RuntimeConf 运行任务的其他配置信息
     */
    public String [] getRuntimeConf() {
        return this.RuntimeConf;
    }

    /**
     * 设置运行任务的其他配置信息
     * @param RuntimeConf 运行任务的其他配置信息
     */
    public void setRuntimeConf(String [] RuntimeConf) {
        this.RuntimeConf = RuntimeConf;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "RuntimeVersion", this.RuntimeVersion);
        this.setParamArraySimple(map, prefix + "PackageDir.", this.PackageDir);
        this.setParamArraySimple(map, prefix + "Command.", this.Command);
        this.setParamArraySimple(map, prefix + "Args.", this.Args);
        this.setParamSimple(map, prefix + "ScaleTier", this.ScaleTier);
        this.setParamSimple(map, prefix + "MasterType", this.MasterType);
        this.setParamSimple(map, prefix + "WorkerType", this.WorkerType);
        this.setParamSimple(map, prefix + "ParameterServerType", this.ParameterServerType);
        this.setParamSimple(map, prefix + "WorkerCount", this.WorkerCount);
        this.setParamSimple(map, prefix + "ParameterServerCount", this.ParameterServerCount);
        this.setParamSimple(map, prefix + "Debug", this.Debug);
        this.setParamArraySimple(map, prefix + "RuntimeConf.", this.RuntimeConf);

    }
}

