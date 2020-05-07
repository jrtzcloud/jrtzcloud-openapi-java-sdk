package com.jrtzcloudapi.blten.v20191119.models.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.util.HashMap;

@Deprecated
public class Risk extends AbstractModel {

    /**
     * TODO
     */
    @SerializedName("ABS_RETURN_WT")
    @Expose
    private Float ABS_RETURN_WT;
    /**
     * TODO
     */
    @SerializedName("ASHARE_WT")
    @Expose
    private Float ASHARE_WT;
    /**
     * TODO
     */
    @SerializedName("CASH_WT")
    @Expose
    private Float CASH_WT;
    /**
     * TODO
     */
    @SerializedName("CN_CREDIT_WT")
    @Expose
    private Float CN_CREDIT_WT;
    /**
     * TODO
     */
    @SerializedName("GLOBAL_DEBT_WT")
    @Expose
    private Float GLOBAL_DEBT_WT;
    /**
     * TODO
     */
    @SerializedName("GOLD_WT")
    @Expose
    private Float GOLD_WT;
    /**
     * TODO
     */
    @SerializedName("HKSHARE_WT")
    @Expose
    private Float HKSHARE_WT;
    /**
     * TODO
     */
    @SerializedName("OIL_WT")
    @Expose
    private Float OIL_WT;
    /**
     * TODO
     */
    @SerializedName("Port_Rtn")
    @Expose
    private Double Port_Rtn;
    /**
     * TODO
     */
    @SerializedName("Port_Utility")
    @Expose
    private Double Port_Utility;
    /**
     * TODO
     */
    @SerializedName("Port_Var")
    @Expose
    private Double Port_Var;
    /**
     * TODO
     */
    @SerializedName("RiskAversionCoef")
    @Expose
    private Float RiskAversionCoef;
    /**
     * TODO
     */
    @SerializedName("Risk_N")
    @Expose
    private String Risk_N;
    /**
     * TODO
     */
    @SerializedName("TREASURY_WT")
    @Expose
    private Float TREASURY_WT;
    /**
     * TODO
     */
    @SerializedName("USSHARE_WT")
    @Expose
    private Float USSHARE_WT;

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ABS_RETURN_WT", this.ABS_RETURN_WT);
        this.setParamSimple(map, prefix + "ASHARE_WT", this.ASHARE_WT);
        this.setParamSimple(map, prefix + "CASH_WT", this.CASH_WT);
        this.setParamSimple(map, prefix + "CN_CREDIT_WT", this.CN_CREDIT_WT);
        this.setParamSimple(map, prefix + "GLOBAL_DEBT_WT", this.GLOBAL_DEBT_WT);
        this.setParamSimple(map, prefix + "GOLD_WT", this.GOLD_WT);
        this.setParamSimple(map, prefix + "HKSHARE_WT", this.HKSHARE_WT);
        this.setParamSimple(map, prefix + "OIL_WT", this.OIL_WT);
        this.setParamSimple(map, prefix + "Port_Rtn", this.Port_Rtn);
        this.setParamSimple(map, prefix + "Port_Utility", this.Port_Utility);
        this.setParamSimple(map, prefix + "Port_Var", this.Port_Var);
        this.setParamSimple(map, prefix + "RiskAversionCoef", this.RiskAversionCoef);
        this.setParamSimple(map, prefix + "Risk_N", this.Risk_N);
        this.setParamSimple(map, prefix + "TREASURY_WT", this.TREASURY_WT);
        this.setParamSimple(map, prefix + "USSHARE_WT", this.USSHARE_WT);
    }

    public Float getABS_RETURN_WT() {
        return ABS_RETURN_WT;
    }

    public void setABS_RETURN_WT(Float ABS_RETURN_WT) {
        this.ABS_RETURN_WT = ABS_RETURN_WT;
    }

    public Float getASHARE_WT() {
        return ASHARE_WT;
    }

    public void setASHARE_WT(Float ASHARE_WT) {
        this.ASHARE_WT = ASHARE_WT;
    }

    public Float getCASH_WT() {
        return CASH_WT;
    }

    public void setCASH_WT(Float CASH_WT) {
        this.CASH_WT = CASH_WT;
    }

    public Float getCN_CREDIT_WT() {
        return CN_CREDIT_WT;
    }

    public void setCN_CREDIT_WT(Float CN_CREDIT_WT) {
        this.CN_CREDIT_WT = CN_CREDIT_WT;
    }

    public Float getGLOBAL_DEBT_WT() {
        return GLOBAL_DEBT_WT;
    }

    public void setGLOBAL_DEBT_WT(Float GLOBAL_DEBT_WT) {
        this.GLOBAL_DEBT_WT = GLOBAL_DEBT_WT;
    }

    public Float getGOLD_WT() {
        return GOLD_WT;
    }

    public void setGOLD_WT(Float GOLD_WT) {
        this.GOLD_WT = GOLD_WT;
    }

    public Float getHKSHARE_WT() {
        return HKSHARE_WT;
    }

    public void setHKSHARE_WT(Float HKSHARE_WT) {
        this.HKSHARE_WT = HKSHARE_WT;
    }

    public Float getOIL_WT() {
        return OIL_WT;
    }

    public void setOIL_WT(Float OIL_WT) {
        this.OIL_WT = OIL_WT;
    }

    public Double getPort_Rtn() {
        return Port_Rtn;
    }

    public void setPort_Rtn(Double port_Rtn) {
        Port_Rtn = port_Rtn;
    }

    public Double getPort_Utility() {
        return Port_Utility;
    }

    public void setPort_Utility(Double port_Utility) {
        Port_Utility = port_Utility;
    }

    public Double getPort_Var() {
        return Port_Var;
    }

    public void setPort_Var(Double port_Var) {
        Port_Var = port_Var;
    }

    public Float getRiskAversionCoef() {
        return RiskAversionCoef;
    }

    public void setRiskAversionCoef(Float riskAversionCoef) {
        RiskAversionCoef = riskAversionCoef;
    }

    public String getRisk_N() {
        return Risk_N;
    }

    public void setRisk_N(String risk_N) {
        Risk_N = risk_N;
    }

    public Float getTREASURY_WT() {
        return TREASURY_WT;
    }

    public void setTREASURY_WT(Float TREASURY_WT) {
        this.TREASURY_WT = TREASURY_WT;
    }

    public Float getUSSHARE_WT() {
        return USSHARE_WT;
    }

    public void setUSSHARE_WT(Float USSHARE_WT) {
        this.USSHARE_WT = USSHARE_WT;
    }
}
