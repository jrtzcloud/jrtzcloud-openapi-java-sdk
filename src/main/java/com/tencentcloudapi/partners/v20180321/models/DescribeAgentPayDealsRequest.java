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
package com.tencentcloudapi.partners.v20180321.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeAgentPayDealsRequest  extends AbstractModel{

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Integer Offset;

    /**
    * 限制数目
    */
    @SerializedName("Limit")
    @Expose
    private Integer Limit;

    /**
    * 下单时间范围起始点(不传时会默认查15天内订单，传值时需要传15天内的起始时间)
    */
    @SerializedName("CreatTimeRangeStart")
    @Expose
    private String CreatTimeRangeStart;

    /**
    * 下单时间范围终止点
    */
    @SerializedName("CreatTimeRangeEnd")
    @Expose
    private String CreatTimeRangeEnd;

    /**
    * 0:下单时间降序；其他：下单时间升序
    */
    @SerializedName("Order")
    @Expose
    private Integer Order;

    /**
    * 订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)
    */
    @SerializedName("Status")
    @Expose
    private Integer Status;

    /**
    * 下单人账号ID列表
    */
    @SerializedName("OwnerUins")
    @Expose
    private String [] OwnerUins;

    /**
    * 订单号列表
    */
    @SerializedName("DealNames")
    @Expose
    private String [] DealNames;

    /**
     * 获取偏移量
     * @return Offset 偏移量
     */
    public Integer getOffset() {
        return this.Offset;
    }

    /**
     * 设置偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Integer Offset) {
        this.Offset = Offset;
    }

    /**
     * 获取限制数目
     * @return Limit 限制数目
     */
    public Integer getLimit() {
        return this.Limit;
    }

    /**
     * 设置限制数目
     * @param Limit 限制数目
     */
    public void setLimit(Integer Limit) {
        this.Limit = Limit;
    }

    /**
     * 获取下单时间范围起始点(不传时会默认查15天内订单，传值时需要传15天内的起始时间)
     * @return CreatTimeRangeStart 下单时间范围起始点(不传时会默认查15天内订单，传值时需要传15天内的起始时间)
     */
    public String getCreatTimeRangeStart() {
        return this.CreatTimeRangeStart;
    }

    /**
     * 设置下单时间范围起始点(不传时会默认查15天内订单，传值时需要传15天内的起始时间)
     * @param CreatTimeRangeStart 下单时间范围起始点(不传时会默认查15天内订单，传值时需要传15天内的起始时间)
     */
    public void setCreatTimeRangeStart(String CreatTimeRangeStart) {
        this.CreatTimeRangeStart = CreatTimeRangeStart;
    }

    /**
     * 获取下单时间范围终止点
     * @return CreatTimeRangeEnd 下单时间范围终止点
     */
    public String getCreatTimeRangeEnd() {
        return this.CreatTimeRangeEnd;
    }

    /**
     * 设置下单时间范围终止点
     * @param CreatTimeRangeEnd 下单时间范围终止点
     */
    public void setCreatTimeRangeEnd(String CreatTimeRangeEnd) {
        this.CreatTimeRangeEnd = CreatTimeRangeEnd;
    }

    /**
     * 获取0:下单时间降序；其他：下单时间升序
     * @return Order 0:下单时间降序；其他：下单时间升序
     */
    public Integer getOrder() {
        return this.Order;
    }

    /**
     * 设置0:下单时间降序；其他：下单时间升序
     * @param Order 0:下单时间降序；其他：下单时间升序
     */
    public void setOrder(Integer Order) {
        this.Order = Order;
    }

    /**
     * 获取订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)
     * @return Status 订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)
     */
    public Integer getStatus() {
        return this.Status;
    }

    /**
     * 设置订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)
     * @param Status 订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)
     */
    public void setStatus(Integer Status) {
        this.Status = Status;
    }

    /**
     * 获取下单人账号ID列表
     * @return OwnerUins 下单人账号ID列表
     */
    public String [] getOwnerUins() {
        return this.OwnerUins;
    }

    /**
     * 设置下单人账号ID列表
     * @param OwnerUins 下单人账号ID列表
     */
    public void setOwnerUins(String [] OwnerUins) {
        this.OwnerUins = OwnerUins;
    }

    /**
     * 获取订单号列表
     * @return DealNames 订单号列表
     */
    public String [] getDealNames() {
        return this.DealNames;
    }

    /**
     * 设置订单号列表
     * @param DealNames 订单号列表
     */
    public void setDealNames(String [] DealNames) {
        this.DealNames = DealNames;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "CreatTimeRangeStart", this.CreatTimeRangeStart);
        this.setParamSimple(map, prefix + "CreatTimeRangeEnd", this.CreatTimeRangeEnd);
        this.setParamSimple(map, prefix + "Order", this.Order);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamArraySimple(map, prefix + "OwnerUins.", this.OwnerUins);
        this.setParamArraySimple(map, prefix + "DealNames.", this.DealNames);

    }
}

