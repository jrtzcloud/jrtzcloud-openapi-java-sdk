package com.jrtzcloudapi.consensus.v20201119.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class DescribeIndFrcstAnaemRequest extends AbstractModel {
    /**
     * 开始日期，格式yyyyMMdd
     */
    @SerializedName("BeginDate")
    @Expose
    private String BeginDate;
    /**
     * 结束日期，格式yyyyMMdd
     */
    @SerializedName("EndDate")
    @Expose
    private String EndDate;
    /**
     * 证券代码,用逗号分隔,调取股票数超过10个或按指数样本股取数时，一次调取时间最长为一个月
     */
    @SerializedName("SecCd")
    @Expose
    private String SecCd;
    /**
     * 0-按A/B股个股取数， SecCd 可以输入股票列表
     * 1-按指数样本股取数， SecCd 只允许输入一个指数代码
     * 不输入时缺省值为0
     */
    @SerializedName("OperType")
    @Expose
    private Integer OperType;
    /**
     * 研报范围,0-全部,1-考虑补录入,2-不考虑补录入
     */
    @SerializedName("RptRang")
    @Expose
    private Integer RptRang;
    /**
     * 预测年份
     * 缺省返回所有年份
     */
    @SerializedName("RptYr")
    @Expose
    private Integer RptYr;
    /**
     * 返回参数集合,用逗号分隔
     */
    @SerializedName("Fields")
    @Expose
    private String Fields;
    /**
     * 页码
     */
    @SerializedName("Page")
    @Expose
    private Integer PageNo;
    /**
     * 每页条数
     */
    @SerializedName("PageCount")
    @Expose
    private Integer PageSize;

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "BeginDate", this.BeginDate);
        this.setParamSimple(map, prefix + "EndDate", this.EndDate);
        this.setParamSimple(map, prefix + "SecCd", this.SecCd);
        this.setParamSimple(map, prefix + "OperType", this.OperType);
        this.setParamSimple(map, prefix + "RptRang", this.RptRang);
        this.setParamSimple(map, prefix + "RptYr", this.RptYr);
        this.setParamSimple(map, prefix + "Fields", this.Fields);
        this.setParamSimple(map, prefix + "PageNo", this.PageNo);
        this.setParamSimple(map, prefix + "PageSize", this.PageSize);
    }

    public String getBeginDate() {
        return BeginDate;
    }

    public void setBeginDate(String beginDate) {
        BeginDate = beginDate;
    }

    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    public String getSecCd() {
        return SecCd;
    }

    public void setSecCd(String secCd) {
        SecCd = secCd;
    }

    public Integer getOperType() {
        return OperType;
    }

    public void setOperType(Integer operType) {
        OperType = operType;
    }

    public Integer getRptRang() {
        return RptRang;
    }

    public void setRptRang(Integer rptRang) {
        RptRang = rptRang;
    }

    public Integer getRptYr() {
        return RptYr;
    }

    public void setRptYr(Integer rptYr) {
        RptYr = rptYr;
    }

    public String getFields() {
        return Fields;
    }

    public void setFields(String fields) {
        Fields = fields;
    }

    public Integer getPageNo() {
        return PageNo;
    }

    public void setPageNo(Integer pageNo) {
        PageNo = pageNo;
    }

    public Integer getPageSize() {
        return PageSize;
    }

    public void setPageSize(Integer pageSize) {
        PageSize = pageSize;
    }
}
