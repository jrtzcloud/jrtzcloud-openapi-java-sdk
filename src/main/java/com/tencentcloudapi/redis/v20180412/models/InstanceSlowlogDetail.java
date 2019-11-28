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
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class InstanceSlowlogDetail  extends AbstractModel{

    /**
    * 慢查询耗时
    */
    @SerializedName("Duration")
    @Expose
    private Integer Duration;

    /**
    * 客户端地址
    */
    @SerializedName("Client")
    @Expose
    private String Client;

    /**
    * 命令
    */
    @SerializedName("Command")
    @Expose
    private String Command;

    /**
    * 详细命令行信息
    */
    @SerializedName("CommandLine")
    @Expose
    private String CommandLine;

    /**
    * 执行时间
    */
    @SerializedName("ExecuteTime")
    @Expose
    private String ExecuteTime;

    /**
     * 获取慢查询耗时
     * @return Duration 慢查询耗时
     */
    public Integer getDuration() {
        return this.Duration;
    }

    /**
     * 设置慢查询耗时
     * @param Duration 慢查询耗时
     */
    public void setDuration(Integer Duration) {
        this.Duration = Duration;
    }

    /**
     * 获取客户端地址
     * @return Client 客户端地址
     */
    public String getClient() {
        return this.Client;
    }

    /**
     * 设置客户端地址
     * @param Client 客户端地址
     */
    public void setClient(String Client) {
        this.Client = Client;
    }

    /**
     * 获取命令
     * @return Command 命令
     */
    public String getCommand() {
        return this.Command;
    }

    /**
     * 设置命令
     * @param Command 命令
     */
    public void setCommand(String Command) {
        this.Command = Command;
    }

    /**
     * 获取详细命令行信息
     * @return CommandLine 详细命令行信息
     */
    public String getCommandLine() {
        return this.CommandLine;
    }

    /**
     * 设置详细命令行信息
     * @param CommandLine 详细命令行信息
     */
    public void setCommandLine(String CommandLine) {
        this.CommandLine = CommandLine;
    }

    /**
     * 获取执行时间
     * @return ExecuteTime 执行时间
     */
    public String getExecuteTime() {
        return this.ExecuteTime;
    }

    /**
     * 设置执行时间
     * @param ExecuteTime 执行时间
     */
    public void setExecuteTime(String ExecuteTime) {
        this.ExecuteTime = ExecuteTime;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Duration", this.Duration);
        this.setParamSimple(map, prefix + "Client", this.Client);
        this.setParamSimple(map, prefix + "Command", this.Command);
        this.setParamSimple(map, prefix + "CommandLine", this.CommandLine);
        this.setParamSimple(map, prefix + "ExecuteTime", this.ExecuteTime);

    }
}

