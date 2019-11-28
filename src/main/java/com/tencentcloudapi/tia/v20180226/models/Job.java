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

public class Job  extends AbstractModel{

    /**
    * 任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务创建时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
    */
    @SerializedName("CreateTime")
    @Expose
    private String CreateTime;

    /**
    * 任务开始时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
    */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
    * 任务结束时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
    */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
    * 任务状态，可能的状态为Created（已创建），Running（运行中），Succeeded（运行完成：成功），Failed（运行完成：失败）
    */
    @SerializedName("State")
    @Expose
    private String State;

    /**
    * 任务状态信息
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
    * 运行任务的配置信息
    */
    @SerializedName("ScaleTier")
    @Expose
    private String ScaleTier;

    /**
    * （ScaleTier为Custom时）master机器类型
    */
    @SerializedName("MasterType")
    @Expose
    private String MasterType;

    /**
    * （ScaleTier为Custom时）worker机器类型
    */
    @SerializedName("WorkerType")
    @Expose
    private String WorkerType;

    /**
    * （ScaleTier为Custom时）parameter server机器类型
    */
    @SerializedName("ParameterServerType")
    @Expose
    private String ParameterServerType;

    /**
    * （ScaleTier为Custom时）worker机器数量
    */
    @SerializedName("WorkerCount")
    @Expose
    private Integer WorkerCount;

    /**
    * （ScaleTier为Custom时）parameter server机器数量
    */
    @SerializedName("ParameterServerCount")
    @Expose
    private Integer ParameterServerCount;

    /**
    * 挂载的路径
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
    * 运行任务的集群
    */
    @SerializedName("Cluster")
    @Expose
    private String Cluster;

    /**
    * 运行任务的环境
    */
    @SerializedName("RuntimeVersion")
    @Expose
    private String RuntimeVersion;

    /**
    * 任务删除时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
    */
    @SerializedName("DelTime")
    @Expose
    private String DelTime;

    /**
    * 创建任务的AppId
    */
    @SerializedName("AppId")
    @Expose
    private Integer AppId;

    /**
    * 创建任务的Uin
    */
    @SerializedName("Uin")
    @Expose
    private String Uin;

    /**
    * 创建任务的Debug模式
    */
    @SerializedName("Debug")
    @Expose
    private Boolean Debug;

    /**
    * Runtime的额外配置信息
    */
    @SerializedName("RuntimeConf")
    @Expose
    private String [] RuntimeConf;

    /**
    * 任务Id
    */
    @SerializedName("Id")
    @Expose
    private String Id;

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
     * 获取任务创建时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     * @return CreateTime 任务创建时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     */
    public String getCreateTime() {
        return this.CreateTime;
    }

    /**
     * 设置任务创建时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     * @param CreateTime 任务创建时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     */
    public void setCreateTime(String CreateTime) {
        this.CreateTime = CreateTime;
    }

    /**
     * 获取任务开始时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     * @return StartTime 任务开始时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     */
    public String getStartTime() {
        return this.StartTime;
    }

    /**
     * 设置任务开始时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     * @param StartTime 任务开始时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     */
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    /**
     * 获取任务结束时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     * @return EndTime 任务结束时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     */
    public String getEndTime() {
        return this.EndTime;
    }

    /**
     * 设置任务结束时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     * @param EndTime 任务结束时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     */
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    /**
     * 获取任务状态，可能的状态为Created（已创建），Running（运行中），Succeeded（运行完成：成功），Failed（运行完成：失败）
     * @return State 任务状态，可能的状态为Created（已创建），Running（运行中），Succeeded（运行完成：成功），Failed（运行完成：失败）
     */
    public String getState() {
        return this.State;
    }

    /**
     * 设置任务状态，可能的状态为Created（已创建），Running（运行中），Succeeded（运行完成：成功），Failed（运行完成：失败）
     * @param State 任务状态，可能的状态为Created（已创建），Running（运行中），Succeeded（运行完成：成功），Failed（运行完成：失败）
     */
    public void setState(String State) {
        this.State = State;
    }

    /**
     * 获取任务状态信息
     * @return Message 任务状态信息
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置任务状态信息
     * @param Message 任务状态信息
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 获取运行任务的配置信息
     * @return ScaleTier 运行任务的配置信息
     */
    public String getScaleTier() {
        return this.ScaleTier;
    }

    /**
     * 设置运行任务的配置信息
     * @param ScaleTier 运行任务的配置信息
     */
    public void setScaleTier(String ScaleTier) {
        this.ScaleTier = ScaleTier;
    }

    /**
     * 获取（ScaleTier为Custom时）master机器类型
     * @return MasterType （ScaleTier为Custom时）master机器类型
     */
    public String getMasterType() {
        return this.MasterType;
    }

    /**
     * 设置（ScaleTier为Custom时）master机器类型
     * @param MasterType （ScaleTier为Custom时）master机器类型
     */
    public void setMasterType(String MasterType) {
        this.MasterType = MasterType;
    }

    /**
     * 获取（ScaleTier为Custom时）worker机器类型
     * @return WorkerType （ScaleTier为Custom时）worker机器类型
     */
    public String getWorkerType() {
        return this.WorkerType;
    }

    /**
     * 设置（ScaleTier为Custom时）worker机器类型
     * @param WorkerType （ScaleTier为Custom时）worker机器类型
     */
    public void setWorkerType(String WorkerType) {
        this.WorkerType = WorkerType;
    }

    /**
     * 获取（ScaleTier为Custom时）parameter server机器类型
     * @return ParameterServerType （ScaleTier为Custom时）parameter server机器类型
     */
    public String getParameterServerType() {
        return this.ParameterServerType;
    }

    /**
     * 设置（ScaleTier为Custom时）parameter server机器类型
     * @param ParameterServerType （ScaleTier为Custom时）parameter server机器类型
     */
    public void setParameterServerType(String ParameterServerType) {
        this.ParameterServerType = ParameterServerType;
    }

    /**
     * 获取（ScaleTier为Custom时）worker机器数量
     * @return WorkerCount （ScaleTier为Custom时）worker机器数量
     */
    public Integer getWorkerCount() {
        return this.WorkerCount;
    }

    /**
     * 设置（ScaleTier为Custom时）worker机器数量
     * @param WorkerCount （ScaleTier为Custom时）worker机器数量
     */
    public void setWorkerCount(Integer WorkerCount) {
        this.WorkerCount = WorkerCount;
    }

    /**
     * 获取（ScaleTier为Custom时）parameter server机器数量
     * @return ParameterServerCount （ScaleTier为Custom时）parameter server机器数量
     */
    public Integer getParameterServerCount() {
        return this.ParameterServerCount;
    }

    /**
     * 设置（ScaleTier为Custom时）parameter server机器数量
     * @param ParameterServerCount （ScaleTier为Custom时）parameter server机器数量
     */
    public void setParameterServerCount(Integer ParameterServerCount) {
        this.ParameterServerCount = ParameterServerCount;
    }

    /**
     * 获取挂载的路径
     * @return PackageDir 挂载的路径
     */
    public String [] getPackageDir() {
        return this.PackageDir;
    }

    /**
     * 设置挂载的路径
     * @param PackageDir 挂载的路径
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
     * 获取运行任务的集群
     * @return Cluster 运行任务的集群
     */
    public String getCluster() {
        return this.Cluster;
    }

    /**
     * 设置运行任务的集群
     * @param Cluster 运行任务的集群
     */
    public void setCluster(String Cluster) {
        this.Cluster = Cluster;
    }

    /**
     * 获取运行任务的环境
     * @return RuntimeVersion 运行任务的环境
     */
    public String getRuntimeVersion() {
        return this.RuntimeVersion;
    }

    /**
     * 设置运行任务的环境
     * @param RuntimeVersion 运行任务的环境
     */
    public void setRuntimeVersion(String RuntimeVersion) {
        this.RuntimeVersion = RuntimeVersion;
    }

    /**
     * 获取任务删除时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     * @return DelTime 任务删除时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     */
    public String getDelTime() {
        return this.DelTime;
    }

    /**
     * 设置任务删除时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     * @param DelTime 任务删除时间，格式为：2006-01-02 15:04:05.999999999 -0700 MST
     */
    public void setDelTime(String DelTime) {
        this.DelTime = DelTime;
    }

    /**
     * 获取创建任务的AppId
     * @return AppId 创建任务的AppId
     */
    public Integer getAppId() {
        return this.AppId;
    }

    /**
     * 设置创建任务的AppId
     * @param AppId 创建任务的AppId
     */
    public void setAppId(Integer AppId) {
        this.AppId = AppId;
    }

    /**
     * 获取创建任务的Uin
     * @return Uin 创建任务的Uin
     */
    public String getUin() {
        return this.Uin;
    }

    /**
     * 设置创建任务的Uin
     * @param Uin 创建任务的Uin
     */
    public void setUin(String Uin) {
        this.Uin = Uin;
    }

    /**
     * 获取创建任务的Debug模式
     * @return Debug 创建任务的Debug模式
     */
    public Boolean getDebug() {
        return this.Debug;
    }

    /**
     * 设置创建任务的Debug模式
     * @param Debug 创建任务的Debug模式
     */
    public void setDebug(Boolean Debug) {
        this.Debug = Debug;
    }

    /**
     * 获取Runtime的额外配置信息
     * @return RuntimeConf Runtime的额外配置信息
     */
    public String [] getRuntimeConf() {
        return this.RuntimeConf;
    }

    /**
     * 设置Runtime的额外配置信息
     * @param RuntimeConf Runtime的额外配置信息
     */
    public void setRuntimeConf(String [] RuntimeConf) {
        this.RuntimeConf = RuntimeConf;
    }

    /**
     * 获取任务Id
     * @return Id 任务Id
     */
    public String getId() {
        return this.Id;
    }

    /**
     * 设置任务Id
     * @param Id 任务Id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "CreateTime", this.CreateTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "State", this.State);
        this.setParamSimple(map, prefix + "Message", this.Message);
        this.setParamSimple(map, prefix + "ScaleTier", this.ScaleTier);
        this.setParamSimple(map, prefix + "MasterType", this.MasterType);
        this.setParamSimple(map, prefix + "WorkerType", this.WorkerType);
        this.setParamSimple(map, prefix + "ParameterServerType", this.ParameterServerType);
        this.setParamSimple(map, prefix + "WorkerCount", this.WorkerCount);
        this.setParamSimple(map, prefix + "ParameterServerCount", this.ParameterServerCount);
        this.setParamArraySimple(map, prefix + "PackageDir.", this.PackageDir);
        this.setParamArraySimple(map, prefix + "Command.", this.Command);
        this.setParamArraySimple(map, prefix + "Args.", this.Args);
        this.setParamSimple(map, prefix + "Cluster", this.Cluster);
        this.setParamSimple(map, prefix + "RuntimeVersion", this.RuntimeVersion);
        this.setParamSimple(map, prefix + "DelTime", this.DelTime);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "Uin", this.Uin);
        this.setParamSimple(map, prefix + "Debug", this.Debug);
        this.setParamArraySimple(map, prefix + "RuntimeConf.", this.RuntimeConf);
        this.setParamSimple(map, prefix + "Id", this.Id);

    }
}

