package com.jrtzcloudapi.vip.v20200722.models.entity;

import java.math.BigDecimal;
import java.util.HashMap;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

public class TrendLightStock extends AbstractModel {

    /**
     * 交易日期
     */
	@SerializedName("PubDtN")
	@Expose
	private Integer PubDtN;

    /**
     * 源数据发布日期
     */
	@SerializedName("SourceDt")
	@Expose
	private Integer SourceDt;

    /**
     * 股票代码
     */
	@SerializedName("StockCode")
	@Expose
	private String StockCode;

    /**
     * 股票简称
     */
	@SerializedName("StockName")
	@Expose
	private	String	StockName;

    /**
     * 证券类型: A :A股，B：B股
     */
	@SerializedName("VarCl")
	@Expose
	private String VarCl;

    /**
     * 交易市场代码：Z: 深圳市场，S:上海市场
     */
	@SerializedName("MktCl")
	@Expose
	private String MktCl;

    /**
     * 机会建议:1 机会，0
     */
	@SerializedName("Pk")
	@Expose
	private Integer Pk;

    /**
     * 机会信号:1（机会信号）-1（风险信号）0（无信号）
     */
	@SerializedName("Chance")
	@Expose
	private Integer Chance;

    /**
     * 昨天盘价
     */
	@SerializedName("RefClose")
	@Expose
	private	BigDecimal RefClose;

    /**
     * 收盘价
     */
	@SerializedName("Close")
	@Expose
	private	BigDecimal Close;

    /**
     * 是否为自选股：1 自选股， 0 非自选股
     */
	@SerializedName("InOwn")
	@Expose
	private Integer InOwn;

	@Override
	protected void toMap(HashMap<String, String> map, String prefix) {
		this.setParamSimple(map, prefix + "PubDtN", this.PubDtN);
		this.setParamSimple(map, prefix + "StockCode", this.StockCode);
		this.setParamSimple(map, prefix + "VarCl", this.VarCl);
		this.setParamSimple(map, prefix + "MktCl", this.MktCl);
		this.setParamSimple(map, prefix + "Chance", this.Chance);
		this.setParamSimple(map, prefix + "StockName", this.StockName);
		this.setParamSimple(map, prefix + "Close", this.Close);
		this.setParamSimple(map, prefix + "RefClose", this.RefClose);
		this.setParamSimple(map, prefix + "Pk", this.Pk);
		this.setParamSimple(map, prefix + "SourceDt", this.SourceDt);
		this.setParamSimple(map, prefix + "InOwn", this.InOwn);
	}


	public Integer getPubDtN() {
		return PubDtN;
	}
	public void setPubDtN(Integer PubDtN) {
		this.PubDtN = PubDtN;
	}
	public String getStockCode() {
		return StockCode;
	}
	public void setStockCode(String StockCode) {
		this.StockCode = StockCode;
	}
	public String getVarCl() {
		return VarCl;
	}
	public void setVarCl(String VarCl) {
		this.VarCl = VarCl;
	}
	public String getMktCl() {
		return MktCl;
	}
	public void setMktCl(String MktCl) {
		this.MktCl = MktCl;
	}
	public Integer getChance() {
		return Chance;
	}
	public void setChance(Integer Chance) {
		this.Chance = Chance;
	}
	public String getStockName() {
		return StockName;
	}
	public void setStockName(String StockName) {
		this.StockName = StockName;
	}
	public BigDecimal getClose() {
		return Close;
	}
	public void setClose(BigDecimal Close) {
		this.Close = Close;
	}
	public BigDecimal getRefClose() {
		return RefClose;
	}
	public void setRefClose(BigDecimal RefClose) {
		this.RefClose = RefClose;
	}
	public Integer getPk() {
		return Pk;
	}
	public void setPk(Integer Pk) {
		this.Pk = Pk;
	}
	public Integer getSourceDt() {
		return SourceDt;
	}
	public void setSourceDt(Integer SourceDt) {
		this.SourceDt = SourceDt;
	}
	public Integer getInOwn() {
		return InOwn;
	}
	public void setInOwn(Integer InOwn) {
		this.InOwn = InOwn;
	}

}


