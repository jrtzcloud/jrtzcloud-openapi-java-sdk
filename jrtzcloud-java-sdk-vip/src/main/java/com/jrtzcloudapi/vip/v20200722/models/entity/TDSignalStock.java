package com.jrtzcloudapi.vip.v20200722.models.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

public class TDSignalStock extends AbstractModel {

	/**
	 * 股票代码
	 */
	@SerializedName("StockCode")
	@Expose
	private String StockCode;

	/**
	 * 股票名称
	 */
	@SerializedName("StockName")
	@Expose
	private	String	StockName;

	/**
	 * 信号类型: 9-9转,  13: 13转
	 */
	@SerializedName("SignalModel")
	@Expose
	private Short SignalModel;

	/**
	 * 信号状态: 1: 抄底,  -1: 见顶,  0: 无信号
	 */
	@SerializedName("SignalFlag")
	@Expose
	private Short SignalFlag;

	/**
	 * 是否拐点	1—正拐点；-1—负拐点；0—非拐点
	 */
	@SerializedName("IsBreakpoint")
	@Expose
	private Short IsBreakpoint;

	/**
	 * 发布时间
	 */
	@SerializedName("PublishDate")
	@Expose
	private String PublishDate;

	/**
	 * 信号序号
	 */
	@SerializedName("Seq")
	@Expose
	private Short Seq;

	/**
	 * 信号K线标记位置，1—需标记；0—不需标记
	 */
	@SerializedName("SignalSeqFlag")
	@Expose
	private Short SignalSeqFlag;

	/**
	 * 是否为自选股：1 自选股， 0 非自选股
	 */
	@SerializedName("InOwn")
	@Expose
	private Integer InOwn;

	@Override
	protected void toMap(HashMap<String, String> map, String prefix) {
		this.setParamSimple(map, prefix + "StockCode", this.StockCode);
		this.setParamSimple(map, prefix + "StockName", this.StockName);
		this.setParamSimple(map, prefix + "SignalModel", this.SignalModel);
		this.setParamSimple(map, prefix + "SignalFlag", this.SignalFlag);
		this.setParamSimple(map, prefix + "IsBreakpoint", this.IsBreakpoint);
		this.setParamSimple(map, prefix + "PublishDate", this.PublishDate);
		this.setParamSimple(map, prefix + "Seq", this.Seq);
		this.setParamSimple(map, prefix + "SignalSeqFlag", this.SignalSeqFlag);
		this.setParamSimple(map, prefix + "InOwn", this.InOwn);
	}

	public String getStockCode() {
		return StockCode;
	}
	public void setStockCode(String StockCode) {
		this.StockCode = StockCode;
	}
	public String getStockName() {
		return StockName;
	}
	public void setStockName(String StockName) {
		this.StockName = StockName;
	}
	public Short getSignalModel() {
		return SignalModel;
	}
	public void setSignalModel(Short SignalModel) {
		this.SignalModel = SignalModel;
	}
	public Short getSignalFlag() {
		return SignalFlag;
	}
	public void setSignalFlag(Short SignalFlag) {
		this.SignalFlag = SignalFlag;
	}
	public Short getIsBreakpoint() {
		return IsBreakpoint;
	}
	public void setIsBreakpoint(Short IsBreakpoint) {
		this.IsBreakpoint = IsBreakpoint;
	}
	public String getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(String PublishDate) {
		this.PublishDate = PublishDate;
	}
	public Short getSeq() {
		return Seq;
	}
	public void setSeq(Short Seq) {
		this.Seq = Seq;
	}
	public Short getSignalSeqFlag() {
		return SignalSeqFlag;
	}
	public void setSignalSeqFlag(Short SignalSeqFlag) {
		this.SignalSeqFlag = SignalSeqFlag;
	}
	public Integer getInOwn() {
		return InOwn;
	}
	public void setInOwn(Integer InOwn) {
		this.InOwn = InOwn;
	}
}


