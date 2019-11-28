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
package com.tencentcloudapi.tbaas.v20180416.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetTransactionDetailForUserRequest  extends AbstractModel{

    /**
    * 模块名，固定字段：transaction
    */
    @SerializedName("Module")
    @Expose
    private String Module;

    /**
    * 操作名，固定字段：transaction_detail_for_user
    */
    @SerializedName("Operation")
    @Expose
    private String Operation;

    /**
    * 区块链网络ID，可在区块链网络详情或列表中获取
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 参与交易的组织名称，可以在组织管理列表中获取当前组织的名称
    */
    @SerializedName("GroupName")
    @Expose
    private String GroupName;

    /**
    * 业务所属通道名称，可在通道详情或列表中获取
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 区块ID，通过GetInvokeTx接口可以获取交易所在的区块ID
    */
    @SerializedName("BlockId")
    @Expose
    private Integer BlockId;

    /**
    * 交易ID，需要查询的详情的交易ID
    */
    @SerializedName("TransactionId")
    @Expose
    private String TransactionId;

    /**
     * 获取模块名，固定字段：transaction
     * @return Module 模块名，固定字段：transaction
     */
    public String getModule() {
        return this.Module;
    }

    /**
     * 设置模块名，固定字段：transaction
     * @param Module 模块名，固定字段：transaction
     */
    public void setModule(String Module) {
        this.Module = Module;
    }

    /**
     * 获取操作名，固定字段：transaction_detail_for_user
     * @return Operation 操作名，固定字段：transaction_detail_for_user
     */
    public String getOperation() {
        return this.Operation;
    }

    /**
     * 设置操作名，固定字段：transaction_detail_for_user
     * @param Operation 操作名，固定字段：transaction_detail_for_user
     */
    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    /**
     * 获取区块链网络ID，可在区块链网络详情或列表中获取
     * @return ClusterId 区块链网络ID，可在区块链网络详情或列表中获取
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * 设置区块链网络ID，可在区块链网络详情或列表中获取
     * @param ClusterId 区块链网络ID，可在区块链网络详情或列表中获取
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * 获取参与交易的组织名称，可以在组织管理列表中获取当前组织的名称
     * @return GroupName 参与交易的组织名称，可以在组织管理列表中获取当前组织的名称
     */
    public String getGroupName() {
        return this.GroupName;
    }

    /**
     * 设置参与交易的组织名称，可以在组织管理列表中获取当前组织的名称
     * @param GroupName 参与交易的组织名称，可以在组织管理列表中获取当前组织的名称
     */
    public void setGroupName(String GroupName) {
        this.GroupName = GroupName;
    }

    /**
     * 获取业务所属通道名称，可在通道详情或列表中获取
     * @return ChannelName 业务所属通道名称，可在通道详情或列表中获取
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * 设置业务所属通道名称，可在通道详情或列表中获取
     * @param ChannelName 业务所属通道名称，可在通道详情或列表中获取
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * 获取区块ID，通过GetInvokeTx接口可以获取交易所在的区块ID
     * @return BlockId 区块ID，通过GetInvokeTx接口可以获取交易所在的区块ID
     */
    public Integer getBlockId() {
        return this.BlockId;
    }

    /**
     * 设置区块ID，通过GetInvokeTx接口可以获取交易所在的区块ID
     * @param BlockId 区块ID，通过GetInvokeTx接口可以获取交易所在的区块ID
     */
    public void setBlockId(Integer BlockId) {
        this.BlockId = BlockId;
    }

    /**
     * 获取交易ID，需要查询的详情的交易ID
     * @return TransactionId 交易ID，需要查询的详情的交易ID
     */
    public String getTransactionId() {
        return this.TransactionId;
    }

    /**
     * 设置交易ID，需要查询的详情的交易ID
     * @param TransactionId 交易ID，需要查询的详情的交易ID
     */
    public void setTransactionId(String TransactionId) {
        this.TransactionId = TransactionId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Module", this.Module);
        this.setParamSimple(map, prefix + "Operation", this.Operation);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "GroupName", this.GroupName);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamSimple(map, prefix + "BlockId", this.BlockId);
        this.setParamSimple(map, prefix + "TransactionId", this.TransactionId);

    }
}

