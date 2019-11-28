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

public class AgentDealElem  extends AbstractModel{

    /**
    * 订单自增 ID
    */
    @SerializedName("DealId")
    @Expose
    private String DealId;

    /**
    * 订单号
    */
    @SerializedName("DealName")
    @Expose
    private String DealName;

    /**
    * 商品类型 ID
    */
    @SerializedName("GoodsCategoryId")
    @Expose
    private String GoodsCategoryId;

    /**
    * 订单所有者
    */
    @SerializedName("OwnerUin")
    @Expose
    private String OwnerUin;

    /**
    * 订单所有者对应 appId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
    * 商品数量
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GoodsNum")
    @Expose
    private String GoodsNum;

    /**
    * 价格详情
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GoodsPrice")
    @Expose
    private DealGoodsPriceElem GoodsPrice;

    /**
    * 下单人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Creater")
    @Expose
    private String Creater;

    /**
    * 下单时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CreatTime")
    @Expose
    private String CreatTime;

    /**
    * 支付结束时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayEndTime")
    @Expose
    private String PayEndTime;

    /**
    * 扣费流水号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BillId")
    @Expose
    private String BillId;

    /**
    * 支付人
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Payer")
    @Expose
    private String Payer;

    /**
    * 订单状态，中文描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DealStatus")
    @Expose
    private String DealStatus;

    /**
    * 订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 产品名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GoodsName")
    @Expose
    private String GoodsName;

    /**
    * 客户备注
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientRemark")
    @Expose
    private String ClientRemark;

    /**
    * 订单操作类型，purchase（新购），renew（续费），modify（配置变更）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActionType")
    @Expose
    private String ActionType;

    /**
    * 代金券抵扣金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VoucherDecline")
    @Expose
    private String VoucherDecline;

    /**
    * 大订单号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("BigDealId")
    @Expose
    private String BigDealId;

    /**
    * 客户类型（new：新拓；old：存量；assign：指派）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ClientType")
    @Expose
    private String ClientType;

    /**
    * 项目类型（self：自拓；repeat：直销；platform：官网合作）
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProjectType")
    @Expose
    private String ProjectType;

    /**
    * 业务员账号ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SalesUin")
    @Expose
    private String SalesUin;

    /**
    * 支付方式，0：自付；1：代付
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PayerMode")
    @Expose
    private String PayerMode;

    /**
    * 活动ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ActivityId")
    @Expose
    private String ActivityId;

    /**
     * 获取订单自增 ID
     * @return DealId 订单自增 ID
     */
    public String getDealId() {
        return this.DealId;
    }

    /**
     * 设置订单自增 ID
     * @param DealId 订单自增 ID
     */
    public void setDealId(String DealId) {
        this.DealId = DealId;
    }

    /**
     * 获取订单号
     * @return DealName 订单号
     */
    public String getDealName() {
        return this.DealName;
    }

    /**
     * 设置订单号
     * @param DealName 订单号
     */
    public void setDealName(String DealName) {
        this.DealName = DealName;
    }

    /**
     * 获取商品类型 ID
     * @return GoodsCategoryId 商品类型 ID
     */
    public String getGoodsCategoryId() {
        return this.GoodsCategoryId;
    }

    /**
     * 设置商品类型 ID
     * @param GoodsCategoryId 商品类型 ID
     */
    public void setGoodsCategoryId(String GoodsCategoryId) {
        this.GoodsCategoryId = GoodsCategoryId;
    }

    /**
     * 获取订单所有者
     * @return OwnerUin 订单所有者
     */
    public String getOwnerUin() {
        return this.OwnerUin;
    }

    /**
     * 设置订单所有者
     * @param OwnerUin 订单所有者
     */
    public void setOwnerUin(String OwnerUin) {
        this.OwnerUin = OwnerUin;
    }

    /**
     * 获取订单所有者对应 appId
注意：此字段可能返回 null，表示取不到有效值。
     * @return AppId 订单所有者对应 appId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAppId() {
        return this.AppId;
    }

    /**
     * 设置订单所有者对应 appId
注意：此字段可能返回 null，表示取不到有效值。
     * @param AppId 订单所有者对应 appId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    /**
     * 获取商品数量
注意：此字段可能返回 null，表示取不到有效值。
     * @return GoodsNum 商品数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGoodsNum() {
        return this.GoodsNum;
    }

    /**
     * 设置商品数量
注意：此字段可能返回 null，表示取不到有效值。
     * @param GoodsNum 商品数量
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGoodsNum(String GoodsNum) {
        this.GoodsNum = GoodsNum;
    }

    /**
     * 获取价格详情
注意：此字段可能返回 null，表示取不到有效值。
     * @return GoodsPrice 价格详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DealGoodsPriceElem getGoodsPrice() {
        return this.GoodsPrice;
    }

    /**
     * 设置价格详情
注意：此字段可能返回 null，表示取不到有效值。
     * @param GoodsPrice 价格详情
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGoodsPrice(DealGoodsPriceElem GoodsPrice) {
        this.GoodsPrice = GoodsPrice;
    }

    /**
     * 获取下单人
注意：此字段可能返回 null，表示取不到有效值。
     * @return Creater 下单人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreater() {
        return this.Creater;
    }

    /**
     * 设置下单人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Creater 下单人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreater(String Creater) {
        this.Creater = Creater;
    }

    /**
     * 获取下单时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return CreatTime 下单时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCreatTime() {
        return this.CreatTime;
    }

    /**
     * 设置下单时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param CreatTime 下单时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCreatTime(String CreatTime) {
        this.CreatTime = CreatTime;
    }

    /**
     * 获取支付结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @return PayEndTime 支付结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayEndTime() {
        return this.PayEndTime;
    }

    /**
     * 设置支付结束时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayEndTime 支付结束时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayEndTime(String PayEndTime) {
        this.PayEndTime = PayEndTime;
    }

    /**
     * 获取扣费流水号
注意：此字段可能返回 null，表示取不到有效值。
     * @return BillId 扣费流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBillId() {
        return this.BillId;
    }

    /**
     * 设置扣费流水号
注意：此字段可能返回 null，表示取不到有效值。
     * @param BillId 扣费流水号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBillId(String BillId) {
        this.BillId = BillId;
    }

    /**
     * 获取支付人
注意：此字段可能返回 null，表示取不到有效值。
     * @return Payer 支付人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayer() {
        return this.Payer;
    }

    /**
     * 设置支付人
注意：此字段可能返回 null，表示取不到有效值。
     * @param Payer 支付人
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayer(String Payer) {
        this.Payer = Payer;
    }

    /**
     * 获取订单状态，中文描述
注意：此字段可能返回 null，表示取不到有效值。
     * @return DealStatus 订单状态，中文描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDealStatus() {
        return this.DealStatus;
    }

    /**
     * 设置订单状态，中文描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param DealStatus 订单状态，中文描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDealStatus(String DealStatus) {
        this.DealStatus = DealStatus;
    }

    /**
     * 获取订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)
注意：此字段可能返回 null，表示取不到有效值。
     * @return Status 订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * 设置订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)
注意：此字段可能返回 null，表示取不到有效值。
     * @param Status 订单的状态(1：未支付;2：已支付;3：发货中;4：已发货;5：发货失败;6：已退款;7：已关单;8：订单过期;9：订单已失效;10：产品已失效;11：代付拒绝;12：支付中)
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * 获取产品名称
注意：此字段可能返回 null，表示取不到有效值。
     * @return GoodsName 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getGoodsName() {
        return this.GoodsName;
    }

    /**
     * 设置产品名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param GoodsName 产品名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGoodsName(String GoodsName) {
        this.GoodsName = GoodsName;
    }

    /**
     * 获取客户备注
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClientRemark 客户备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientRemark() {
        return this.ClientRemark;
    }

    /**
     * 设置客户备注
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientRemark 客户备注
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientRemark(String ClientRemark) {
        this.ClientRemark = ClientRemark;
    }

    /**
     * 获取订单操作类型，purchase（新购），renew（续费），modify（配置变更）
注意：此字段可能返回 null，表示取不到有效值。
     * @return ActionType 订单操作类型，purchase（新购），renew（续费），modify（配置变更）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActionType() {
        return this.ActionType;
    }

    /**
     * 设置订单操作类型，purchase（新购），renew（续费），modify（配置变更）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActionType 订单操作类型，purchase（新购），renew（续费），modify（配置变更）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActionType(String ActionType) {
        this.ActionType = ActionType;
    }

    /**
     * 获取代金券抵扣金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
     * @return VoucherDecline 代金券抵扣金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVoucherDecline() {
        return this.VoucherDecline;
    }

    /**
     * 设置代金券抵扣金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
     * @param VoucherDecline 代金券抵扣金额，单位分
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVoucherDecline(String VoucherDecline) {
        this.VoucherDecline = VoucherDecline;
    }

    /**
     * 获取大订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @return BigDealId 大订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getBigDealId() {
        return this.BigDealId;
    }

    /**
     * 设置大订单号
注意：此字段可能返回 null，表示取不到有效值。
     * @param BigDealId 大订单号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBigDealId(String BigDealId) {
        this.BigDealId = BigDealId;
    }

    /**
     * 获取客户类型（new：新拓；old：存量；assign：指派）
注意：此字段可能返回 null，表示取不到有效值。
     * @return ClientType 客户类型（new：新拓；old：存量；assign：指派）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getClientType() {
        return this.ClientType;
    }

    /**
     * 设置客户类型（new：新拓；old：存量；assign：指派）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ClientType 客户类型（new：新拓；old：存量；assign：指派）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setClientType(String ClientType) {
        this.ClientType = ClientType;
    }

    /**
     * 获取项目类型（self：自拓；repeat：直销；platform：官网合作）
注意：此字段可能返回 null，表示取不到有效值。
     * @return ProjectType 项目类型（self：自拓；repeat：直销；platform：官网合作）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getProjectType() {
        return this.ProjectType;
    }

    /**
     * 设置项目类型（self：自拓；repeat：直销；platform：官网合作）
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProjectType 项目类型（self：自拓；repeat：直销；platform：官网合作）
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProjectType(String ProjectType) {
        this.ProjectType = ProjectType;
    }

    /**
     * 获取业务员账号ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return SalesUin 业务员账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getSalesUin() {
        return this.SalesUin;
    }

    /**
     * 设置业务员账号ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param SalesUin 业务员账号ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSalesUin(String SalesUin) {
        this.SalesUin = SalesUin;
    }

    /**
     * 获取支付方式，0：自付；1：代付
注意：此字段可能返回 null，表示取不到有效值。
     * @return PayerMode 支付方式，0：自付；1：代付
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getPayerMode() {
        return this.PayerMode;
    }

    /**
     * 设置支付方式，0：自付；1：代付
注意：此字段可能返回 null，表示取不到有效值。
     * @param PayerMode 支付方式，0：自付；1：代付
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPayerMode(String PayerMode) {
        this.PayerMode = PayerMode;
    }

    /**
     * 获取活动ID
注意：此字段可能返回 null，表示取不到有效值。
     * @return ActivityId 活动ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getActivityId() {
        return this.ActivityId;
    }

    /**
     * 设置活动ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param ActivityId 活动ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setActivityId(String ActivityId) {
        this.ActivityId = ActivityId;
    }

    /**
     * 内部实现，用户禁止调用
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DealId", this.DealId);
        this.setParamSimple(map, prefix + "DealName", this.DealName);
        this.setParamSimple(map, prefix + "GoodsCategoryId", this.GoodsCategoryId);
        this.setParamSimple(map, prefix + "OwnerUin", this.OwnerUin);
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "GoodsNum", this.GoodsNum);
        this.setParamObj(map, prefix + "GoodsPrice.", this.GoodsPrice);
        this.setParamSimple(map, prefix + "Creater", this.Creater);
        this.setParamSimple(map, prefix + "CreatTime", this.CreatTime);
        this.setParamSimple(map, prefix + "PayEndTime", this.PayEndTime);
        this.setParamSimple(map, prefix + "BillId", this.BillId);
        this.setParamSimple(map, prefix + "Payer", this.Payer);
        this.setParamSimple(map, prefix + "DealStatus", this.DealStatus);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "GoodsName", this.GoodsName);
        this.setParamSimple(map, prefix + "ClientRemark", this.ClientRemark);
        this.setParamSimple(map, prefix + "ActionType", this.ActionType);
        this.setParamSimple(map, prefix + "VoucherDecline", this.VoucherDecline);
        this.setParamSimple(map, prefix + "BigDealId", this.BigDealId);
        this.setParamSimple(map, prefix + "ClientType", this.ClientType);
        this.setParamSimple(map, prefix + "ProjectType", this.ProjectType);
        this.setParamSimple(map, prefix + "SalesUin", this.SalesUin);
        this.setParamSimple(map, prefix + "PayerMode", this.PayerMode);
        this.setParamSimple(map, prefix + "ActivityId", this.ActivityId);

    }
}

