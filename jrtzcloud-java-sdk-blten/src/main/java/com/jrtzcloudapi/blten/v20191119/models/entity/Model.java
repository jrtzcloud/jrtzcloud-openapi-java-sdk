package com.jrtzcloudapi.blten.v20191119.models.entity;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;
import java.util.HashMap;

public class Model extends AbstractModel {
    /**
     * 大类资产列表
     */
    @SerializedName("AssetList")
    @Expose
    private String[] AssetList;
    /**
     * 资产预期收益率字典
     */
    @SerializedName("OriginalExpRtnDict")
    @Expose
    private OriginalExpRtnDict OriginalExpRtnDict;
    /**
     * 资产持仓权重绝对值上下限字典
     */
    @SerializedName("BoundaryDict")
    @Expose
    private BoundaryDict BoundaryDict;
    /**
     * 资产持仓权重相对值等式-不等式约束列表
     */
    @SerializedName("ConstrainList")
    @Expose
    private String[][] ConstrainList;

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "AssetList", this.AssetList);
        this.setParamObj(map, prefix + "BoundaryDict", this.BoundaryDict);
        this.setParamArrayArraySimple(map, prefix + "ConstrainList", this.ConstrainList);
        this.setParamObj(map, prefix + "OriginalExpRtnDict", this.OriginalExpRtnDict);
    }

    public String[] getAssetList() {
        return AssetList;
    }

    public void setAssetList(String[] assetList) {
        AssetList = assetList;
    }

    public BoundaryDict getBoundaryDict() {
        return BoundaryDict;
    }

    public void setBoundaryDict(BoundaryDict boundaryDict) {
        BoundaryDict = boundaryDict;
    }

    public String[][] getConstrainList() {
        return ConstrainList;
    }

    public void setConstrainList(String[][] constrainList) {
        ConstrainList = constrainList;
    }

    public OriginalExpRtnDict getOriginalExpRtnDict() {
        return OriginalExpRtnDict;
    }

    public void setOriginalExpRtnDict(OriginalExpRtnDict originalExpRtnDict) {
        OriginalExpRtnDict = originalExpRtnDict;
    }
}
