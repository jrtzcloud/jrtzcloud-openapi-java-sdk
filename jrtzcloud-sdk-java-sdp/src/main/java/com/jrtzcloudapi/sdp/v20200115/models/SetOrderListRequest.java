package com.jrtzcloudapi.sdp.v20200115.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class SetOrderListRequest extends AbstractModel {

    /**
     * 券商Id，今日投资分配给券商的id
     */
    @SerializedName("AppId")
    @Expose
    private String AppId;

    /**
     * 券商系统内部C用户唯一Id
     */
    @SerializedName("AccountId")
    @Expose
    private String AccountId;

    /**
     * 渠道产品id
     */
    @SerializedName("GoodId")
    @Expose
    private String GoodId;

    /**
     * 渠道产品名称
     */
    @SerializedName("GoodName")
    @Expose
    private String GoodName;

    /**
     * 订购时间
     */
    @SerializedName("OrderTime")
    @Expose
    private String OrderTime;

    /**
     * 服务开始时间
     */
    @SerializedName("StartTime")
    @Expose
    private String StartTime;

    /**
     * 服务结束时间
     */
    @SerializedName("EndTime")
    @Expose
    private String EndTime;

    /**
     * 渠道订购订单号
     */
    @SerializedName("OrderNum")
    @Expose
    private String OrderNum;

    /**
     * 订购状态信息 1 支付 2 退款
     */
    @SerializedName("OrderType")
    @Expose
    private Integer OrderType;

    /**
     * 计量单位 0 为定义 1 天 2 周 3 月 4 季度 5 年 6 次
     */
    @SerializedName("Unit")
    @Expose
    private Integer Unit;

    /**
     * 计量数量
     */
    @SerializedName("Numbers")
    @Expose
    private Integer Numbers;

    /**
     * 金额，单位分
     */
    @SerializedName("Amount")
    @Expose
    private Long Amount;



    public String getAppId() {
        return AppId;
    }
    public void setAppId(String AppId) {
        this.AppId = AppId;
    }

    public String getAccountId() {
        return AccountId;
    }
    public void setAccountId(String AccountId) {
        this.AccountId = AccountId;
    }

    public String getGoodId() {
        return GoodId;
    }
    public void setGoodId(String GoodId) {
        this.GoodId = GoodId;
    }

    public String getGoodName() {
        return GoodName;
    }
    public void setGoodName(String GoodName) {
        this.GoodName = GoodName;
    }

    public String getOrderTime() {
        return OrderTime;
    }
    public void setOrderTime(String OrderTime) {
        this.OrderTime = OrderTime;
    }

    public String getStartTime() {
        return StartTime;
    }
    public void setStartTime(String StartTime) {
        this.StartTime = StartTime;
    }

    public String getEndTime() {
        return EndTime;
    }
    public void setEndTime(String EndTime) {
        this.EndTime = EndTime;
    }

    public String getOrderNum() {
        return OrderNum;
    }
    public void setOrderNum(String OrderNum) {
        this.OrderNum = OrderNum;
    }

    public Integer getOrderType() {
        return OrderType;
    }
    public void setOrderType(Integer OrderType) {
        this.OrderType = OrderType;
    }

    public Integer getNumbers() {
        return Numbers;
    }
    public void setNumbers(Integer Numbers) {
        this.Numbers = Numbers;
    }

    public Integer getUnit() {
        return Unit;
    }
    public void setUnit(Integer Unit) {
        this.Unit = Unit;
    }

    public Long getAmount() {
        return Amount;
    }
    public void setAmount(Long Amount) {
        this.Amount = Amount;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "AppId", this.AppId);
        this.setParamSimple(map, prefix + "AccountId", this.AccountId);
        this.setParamSimple(map, prefix + "GoodId", this.GoodId);
        this.setParamSimple(map, prefix + "GoodName", this.GoodName);
        this.setParamSimple(map, prefix + "OrderTime", this.OrderTime);
        this.setParamSimple(map, prefix + "StartTime", this.StartTime);
        this.setParamSimple(map, prefix + "EndTime", this.EndTime);
        this.setParamSimple(map, prefix + "OrderNum", this.OrderNum);
        this.setParamSimple(map, prefix + "OrderType", this.OrderType);
        this.setParamSimple(map, prefix + "Unit", this.Unit);
        this.setParamSimple(map, prefix + "Numbers", this.Numbers);
        this.setParamSimple(map, prefix + "Amount", this.Amount);
    }
}
