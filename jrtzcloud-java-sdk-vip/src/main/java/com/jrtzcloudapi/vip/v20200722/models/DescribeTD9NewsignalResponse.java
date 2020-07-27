package com.jrtzcloudapi.vip.v20200722.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;
import com.jrtzcloudapi.vip.v20200722.models.entity.TDSignalStock;

import java.util.HashMap;
import java.util.List;

public class DescribeTD9NewsignalResponse extends AbstractModel {

    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * 当前页码
     */
    @SerializedName("PageNumber")
    @Expose
    private Integer PageNumber;

    /**
     * 每页大小
     */
    @SerializedName("PageSize")
    @Expose
    private Integer PageSize;

    /**
     * 信号名称
     */
    @SerializedName("TdName")
    @Expose
    private String TdName;

    /**
     * 股票数量
     */
    @SerializedName("StockSize")
    @Expose
    private Integer StockSize;

    /**
     * 抄底信号总数
     */
    @SerializedName("BuySize")
    @Expose
    private Integer BuySize;

    /**
     * 见顶信号总数
     */
    @SerializedName("SellSize")
    @Expose
    private Integer SellSize;

    /**
     * 股票集
     */
    @SerializedName("StockList")
    @Expose
    private List<TDSignalStock> StockList;

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "TdName", this.TdName);
        this.setParamSimple(map, prefix + "StockSize", this.StockSize);
        this.setParamSimple(map, prefix + "BuySize", this.BuySize);
        this.setParamSimple(map, prefix + "SellSize", this.SellSize);
        this.setParamSimple(map, prefix + "StockList",  this.StockList);
    }

    public String getRequestId() {
        return RequestId;
    }
    public void setRequestId(String requestId) {
        RequestId = requestId;
    }
    public Integer getPageNumber() {
        return PageNumber;
    }
    public void setPageNumber(Integer PageNumber) {
        this.PageNumber = PageNumber;
    }
    public String getTdName() {
        return TdName;
    }
    public void setTdName(String TdName) {
        this.TdName = TdName;
    }
    public Integer getPageSize() {
        return PageSize;
    }
    public void setPageSize(Integer PageSize) {
        this.PageSize = PageSize;
    }
    public Integer getStockSize() {
        return StockSize;
    }
    public void setStockSize(Integer StockSize) {
        this.StockSize = StockSize;
    }
    public Integer getBuySize() {
        return BuySize;
    }
    public void setBuySize(Integer BuySize) {
        this.BuySize = BuySize;
    }
    public Integer getSellSize() {
        return SellSize;
    }
    public void setSellSize(Integer SellSize) {
        this.SellSize = SellSize;
    }
    public List<TDSignalStock> getStockList() {
        return StockList;
    }

    public void setStockList(List<TDSignalStock> stockList) {
        StockList = stockList;
    }
}
