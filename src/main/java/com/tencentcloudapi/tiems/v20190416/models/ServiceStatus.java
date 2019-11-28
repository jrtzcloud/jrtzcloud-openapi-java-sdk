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
package com.tencentcloudapi.tiems.v20190416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ServiceStatus  extends AbstractModel{

    /**
    * 预期副本数
    */
    @SerializedName("DesiredReplicas")
    @Expose
    private Long DesiredReplicas;

    /**
    * 当前副本数
    */
    @SerializedName("CurrentReplicas")
    @Expose
    private Long CurrentReplicas;

    /**
    * Normal：正常运行中；Abnormal：服务异常，例如容器启动失败等；Waiting：服务等待中，例如容器下载镜像过程等；Stopped：已停止 Stopping 停止中；Resuming：重启中；Updating：服务更新中
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 服务处于当前状态的原因集合
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Conditions")
    @Expose
    private Conditions [] Conditions;

    /**
    * 副本名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Replicas")
    @Expose
    private String [] Replicas;

    /**
    * 运行状态对额外信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Message")
    @Expose
    private String Message;

    /**
     * 获取预期副本数
     * @return DesiredReplicas 预期副本数
     */
    public Long getDesiredReplicas() {
        return this.DesiredReplicas;
    }

    /**
     * 设置预期副本数
     * @param DesiredReplicas 预期副本数
     */
    public void setDesiredReplicas(Long DesiredReplicas) {
        this.DesiredReplicas = DesiredReplicas;
    }

    /**
     * 获取当前副本数
     * @return CurrentReplicas 当前副本数
     */
    public Long getCurrentReplicas() {
        return this.CurrentReplicas;
    }

    /**
     * 设置当前副本数
     * @param CurrentReplicas 当前副本数
     */
    public void setCurrentReplicas(Long CurrentReplicas) {
        this.CurrentReplicas = CurrentReplicas;
    }

    /**
     * 获取Normal：正常运行中；Abnormal：服务异常，例如容器启动失败等；Waiting：服务等待中，例如容器下载镜像过程等；Stopped：已停止 Stopping 停止中；Resuming：重启中；Updating：服务更新中
     * @return Status Normal：正常运行中；Abnormal：服务异常，例如容器启动失败等；Waiting：服务等待中，例如容器下载镜像过程等；Stopped：已停止 Stopping 停止中；Resuming：重启中；Updating：服务更新中
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置Normal：正常运行中；Abnormal：服务异常，例如容器启动失败等；Waiting：服务等待中，例如容器下载镜像过程等；Stopped：已停止 Stopping 停止中；Resuming：重启中；Updating：服务更新中
     * @param Status Normal：正常运行中；Abnormal：服务异常，例如容器启动失败等；Waiting：服务等待中，例如容器下载镜像过程等；Stopped：已停止 Stopping 停止中；Resuming：重启中；Updating：服务更新中
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取服务处于当前状态的原因集合
注意：此字段可能返回 null，表示取不到有效值。
     * @return Conditions 服务处于当前状态的原因集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Conditions [] getConditions() {
        return this.Conditions;
    }

    /**
     * 设置服务处于当前状态的原因集合
注意：此字段可能返回 null，表示取不到有效值。
     * @param Conditions 服务处于当前状态的原因集合
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConditions(Conditions [] Conditions) {
        this.Conditions = Conditions;
    }

    /**
     * 获取副本名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return Replicas 副本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getReplicas() {
        return this.Replicas;
    }

    /**
     * 设置副本名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Replicas 副本名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReplicas(String [] Replicas) {
        this.Replicas = Replicas;
    }

    /**
     * 获取运行状态对额外信息
注意：此字段可能返回 null，表示取不到有效值。
     * @return Message 运行状态对额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMessage() {
        return this.Message;
    }

    /**
     * 设置运行状态对额外信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param Message 运行状态对额外信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMessage(String Message) {
        this.Message = Message;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DesiredReplicas", this.DesiredReplicas);
        this.setParamSimple(map, prefix + "CurrentReplicas", this.CurrentReplicas);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArrayObj(map, prefix + "Conditions.", this.Conditions);
        this.setParamArraySimple(map, prefix + "Replicas.", this.Replicas);
        this.setParamSimple(map, prefix + "Message", this.Message);

    }
}

