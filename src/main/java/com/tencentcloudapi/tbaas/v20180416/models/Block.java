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

public class Block  extends AbstractModel{

    /**
    * 区块编号
    */
    @SerializedName("BlockNum")
    @Expose
    private Integer BlockNum;

    /**
    * 区块Hash数值
    */
    @SerializedName("DataHash")
    @Expose
    private String DataHash;

    /**
    * 区块ID，与区块编号一致
    */
    @SerializedName("BlockId")
    @Expose
    private Integer BlockId;

    /**
    * 前一个区块Hash（未使用）,与区块Hash数值一致
    */
    @SerializedName("PreHash")
    @Expose
    private String PreHash;

    /**
    * 区块内的交易数量
    */
    @SerializedName("TxCount")
    @Expose
    private Integer TxCount;

    /**
     * 获取区块编号
     * @return BlockNum 区块编号
     */
    public Integer getBlockNum() {
        return this.BlockNum;
    }

    /**
     * 设置区块编号
     * @param BlockNum 区块编号
     */
    public void setBlockNum(Integer BlockNum) {
        this.BlockNum = BlockNum;
    }

    /**
     * 获取区块Hash数值
     * @return DataHash 区块Hash数值
     */
    public String getDataHash() {
        return this.DataHash;
    }

    /**
     * 设置区块Hash数值
     * @param DataHash 区块Hash数值
     */
    public void setDataHash(String DataHash) {
        this.DataHash = DataHash;
    }

    /**
     * 获取区块ID，与区块编号一致
     * @return BlockId 区块ID，与区块编号一致
     */
    public Integer getBlockId() {
        return this.BlockId;
    }

    /**
     * 设置区块ID，与区块编号一致
     * @param BlockId 区块ID，与区块编号一致
     */
    public void setBlockId(Integer BlockId) {
        this.BlockId = BlockId;
    }

    /**
     * 获取前一个区块Hash（未使用）,与区块Hash数值一致
     * @return PreHash 前一个区块Hash（未使用）,与区块Hash数值一致
     */
    public String getPreHash() {
        return this.PreHash;
    }

    /**
     * 设置前一个区块Hash（未使用）,与区块Hash数值一致
     * @param PreHash 前一个区块Hash（未使用）,与区块Hash数值一致
     */
    public void setPreHash(String PreHash) {
        this.PreHash = PreHash;
    }

    /**
     * 获取区块内的交易数量
     * @return TxCount 区块内的交易数量
     */
    public Integer getTxCount() {
        return this.TxCount;
    }

    /**
     * 设置区块内的交易数量
     * @param TxCount 区块内的交易数量
     */
    public void setTxCount(Integer TxCount) {
        this.TxCount = TxCount;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BlockNum", this.BlockNum);
        this.setParamSimple(map, prefix + "DataHash", this.DataHash);
        this.setParamSimple(map, prefix + "BlockId", this.BlockId);
        this.setParamSimple(map, prefix + "PreHash", this.PreHash);
        this.setParamSimple(map, prefix + "TxCount", this.TxCount);

    }
}

