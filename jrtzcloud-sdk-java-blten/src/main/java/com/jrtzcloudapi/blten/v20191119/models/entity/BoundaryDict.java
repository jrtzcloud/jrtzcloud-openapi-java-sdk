package com.jrtzcloudapi.blten.v20191119.models.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;
import java.util.HashMap;

public class BoundaryDict extends AbstractModel {
    /**
     * 精选基金持仓权重上下限
     */
    @SerializedName("ABS_RETURN")
    @Expose
    private Float [] ABS_RETURN;
    /**
     * A股基金持仓权重上下限
     */
    @SerializedName("ASHARE")
    @Expose
    private Float [] ASHARE;
    /**
     * 货币基金持仓权重上下限
     */
    @SerializedName("CASH")
    @Expose
    private Float [] CASH;
    /**
     * 信用债基金持仓权重上下限
     */
    @SerializedName("CN_CREDIT")
    @Expose
    private Float [] CN_CREDIT;
    /**
     * 全球债券基金持仓权重上下限
     */
    @SerializedName("GLOBAL_DEBT")
    @Expose
    private Float [] GLOBAL_DEBT;
    /**
     * 黄金商品基金持仓权重上下限
     */
    @SerializedName("GOLD")
    @Expose
    private Float [] GOLD;
    /**
     * 港股基金持仓权重上下限
     */
    @SerializedName("HKSHARE")
    @Expose
    private Float [] HKSHARE;
    /**
     * 原油商品基金持仓权重上下限
     */
    @SerializedName("OIL")
    @Expose
    private Float [] OIL;
    /**
     * 利率债基金持仓权重上下限
     */
    @SerializedName("TREASURY")
    @Expose
    private Float [] TREASURY;
    /**
     * 美股基金持仓权重上下限
     */
    @SerializedName("USSHARE")
    @Expose
    private Float [] USSHARE;

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "ABS_RETURN", this.ABS_RETURN);
        this.setParamArraySimple(map, prefix + "ASHARE", this.ASHARE);
        this.setParamArraySimple(map, prefix + "CASH", this.CASH);
        this.setParamArraySimple(map, prefix + "CN_CREDIT", this.CN_CREDIT);
        this.setParamArraySimple(map, prefix + "GLOBAL_DEBT", this.GLOBAL_DEBT);
        this.setParamArraySimple(map, prefix + "GOLD", this.GOLD);
        this.setParamArraySimple(map, prefix + "HKSHARE", this.HKSHARE);
        this.setParamArraySimple(map, prefix + "OIL", this.OIL);
        this.setParamArraySimple(map, prefix + "TREASURY", this.TREASURY);
        this.setParamArraySimple(map, prefix + "USSHARE", this.USSHARE);
    }

    public Float[] getABS_RETURN() {
        return ABS_RETURN;
    }

    public void setABS_RETURN(Float[] ABS_RETURN) {
        this.ABS_RETURN = ABS_RETURN;
    }

    public Float[] getASHARE() {
        return ASHARE;
    }

    public void setASHARE(Float[] ASHARE) {
        this.ASHARE = ASHARE;
    }

    public Float[] getCASH() {
        return CASH;
    }

    public void setCASH(Float[] CASH) {
        this.CASH = CASH;
    }

    public Float[] getCN_CREDIT() {
        return CN_CREDIT;
    }

    public void setCN_CREDIT(Float[] CN_CREDIT) {
        this.CN_CREDIT = CN_CREDIT;
    }

    public Float[] getGLOBAL_DEBT() {
        return GLOBAL_DEBT;
    }

    public void setGLOBAL_DEBT(Float[] GLOBAL_DEBT) {
        this.GLOBAL_DEBT = GLOBAL_DEBT;
    }

    public Float[] getGOLD() {
        return GOLD;
    }

    public void setGOLD(Float[] GOLD) {
        this.GOLD = GOLD;
    }

    public Float[] getHKSHARE() {
        return HKSHARE;
    }

    public void setHKSHARE(Float[] HKSHARE) {
        this.HKSHARE = HKSHARE;
    }

    public Float[] getOIL() {
        return OIL;
    }

    public void setOIL(Float[] OIL) {
        this.OIL = OIL;
    }

    public Float[] getTREASURY() {
        return TREASURY;
    }

    public void setTREASURY(Float[] TREASURY) {
        this.TREASURY = TREASURY;
    }

    public Float[] getUSSHARE() {
        return USSHARE;
    }

    public void setUSSHARE(Float[] USSHARE) {
        this.USSHARE = USSHARE;
    }
}
