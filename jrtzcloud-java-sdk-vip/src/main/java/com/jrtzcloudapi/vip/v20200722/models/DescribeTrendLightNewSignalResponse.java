package com.jrtzcloudapi.vip.v20200722.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;
import com.jrtzcloudapi.vip.v20200722.models.entity.TrendLightStock;

import java.util.HashMap;
import java.util.List;

public class DescribeTrendLightNewSignalResponse extends AbstractModel {

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
     * 全部股票数量
     */
    @SerializedName("Count")
    @Expose
    private Integer Count;

    /**
     * 机会信号股票数量
     */
    @SerializedName("ChanceCount")
    @Expose
    private Integer ChanceCount;

    /**
     * 风险信号股票数量
     */
    @SerializedName("RiskCount")
    @Expose
    private Integer RiskCount;

    /**
     * 无信号股票数量
     */
    @SerializedName("NoChanceCount")
    @Expose
    private Integer NoChanceCount;

    /**
     * 信号股票列表
     */
    @SerializedName("RobotStockChanceInOwn")
    @Expose
    private List<TrendLightStock> RobotStockChanceInOwn;

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
        this.setParamSimple(map, prefix + "PageNumber", this.PageNumber);
        this.setParamSimple(map, prefix + "Count", this.Count);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
        this.setParamSimple(map, prefix + "ChanceCount", this.ChanceCount);
        this.setParamSimple(map, prefix + "RiskCount", this.RiskCount);
        this.setParamSimple(map, prefix + "NoChanceCount", this.NoChanceCount);
        this.setParamSimple(map, prefix + "RobotStockChanceInOwn", this.RobotStockChanceInOwn);
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

    public Integer getCount() {
        return Count;
    }

    public void setCount(Integer Count) {
        this.Count = Count;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer PageSize) {
        this.PageSize = PageSize;
    }

    public Integer getChanceCount() {
        return ChanceCount;
    }

    public void setChanceCount(Integer ChanceCount) {
        this.ChanceCount = ChanceCount;
    }

    public Integer getRiskCount() {
        return RiskCount;
    }

    public void setRiskCount(Integer RiskCount) {
        this.RiskCount = RiskCount;
    }

    public Integer getNoChanceCount() {
        return NoChanceCount;
    }

    public void setNoChanceCount(Integer NoChanceCount) {
        this.NoChanceCount = NoChanceCount;
    }

    public List<TrendLightStock> getRobotStockChanceInOwn() {
        return RobotStockChanceInOwn;
    }

    public void setRobotStockChanceInOwn(List<TrendLightStock> robotStockChanceInOwn) {
        RobotStockChanceInOwn = robotStockChanceInOwn;
    }
}
