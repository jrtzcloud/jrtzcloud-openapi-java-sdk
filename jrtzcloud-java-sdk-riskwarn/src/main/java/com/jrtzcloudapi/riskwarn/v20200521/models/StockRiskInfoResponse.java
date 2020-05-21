package com.jrtzcloudapi.riskwarn.v20200521.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.jrtzcloudapi.common.AbstractModel;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashMap;

/**
 * @Author Drx
 * @Date 2020/5/19
 * @Description
 * @Email hjx8862825@hotmail.com
 * PS: Please tell me if you find any bugs ^_^
 **/
public class StockRiskInfoResponse extends AbstractModel {

    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    @SerializedName("StockCode")
    @Expose
    private String StockCode;

    @SerializedName("StockName")
    @Expose
    private String StockName;

    @SerializedName("Industry")
    @Expose
    private String Industry;

    @SerializedName("PubDate")
    @Expose
    private Timestamp PubDate;

    @SerializedName("MarketCode")
    @Expose
    private String MarketCode;

    @SerializedName("RiskNum")
    @Expose
    private Integer RiskNum;

    @SerializedName("InfoReportRisk")
    @Expose
    private Boolean InfoReportRisk;

    @SerializedName("AnalyserRisk")
    @Expose
    private Boolean AnalyserRisk;

    @SerializedName("BehaviorRisk")
    @Expose
    private Boolean BehaviorRisk;

    @SerializedName("FinanceRisk")
    @Expose
    private Boolean FinanceRisk;

    @SerializedName("ProfitPredictRisk")
    @Expose
    private Boolean ProfitPredictRisk;

    @SerializedName("GradeRisk")
    @Expose
    private Boolean GradeRisk;

    @SerializedName("ReduceRisk")
    @Expose
    private Boolean ReduceRisk;

    @SerializedName("ProfitPredictRiskReportID")
    @Expose
    private String ProfitPredictRiskReportID;

    @SerializedName("GradeRiskReportID")
    @Expose
    private String GradeRiskReportID;

    @SerializedName("ReduceRiskReportID")
    @Expose
    private String ReduceRiskReportID;

    @SerializedName("PledgeRisk")
    @Expose
    private Boolean PledgeRisk;

    @SerializedName("StockHolderRisk")
    @Expose
    private Boolean StockHolderRisk;

    @SerializedName("ManagerReduceRisk")
    @Expose
    private Boolean ManagerReduceRisk;

    @SerializedName("UnRestrictRisk")
    @Expose
    private Boolean UnRestrictRisk;

    @SerializedName("UnderWarningLineRatio")
    @Expose
    private BigDecimal UnderWarningLineRatio;

    @SerializedName("BetweenWLandCLRatio")
    @Expose
    private BigDecimal BetweenWLandCLRatio;

    @SerializedName("ArriveCloseLineRatio")
    @Expose
    private BigDecimal ArriveCloseLineRatio;

    @SerializedName("UnderWarningLineNum")
    @Expose
    private BigDecimal UnderWarningLineNum;

    @SerializedName("BetweenWLandCLNum")
    @Expose
    private BigDecimal BetweenWLandCLNum;

    @SerializedName("ArriveCloseLineNum")
    @Expose
    private BigDecimal ArriveCloseLineNum;

    // -----------------------财务异常标识-----------------------------
    @SerializedName("DebtPayingRisk")
    @Expose
    private Boolean DebtPayingRisk;
    @SerializedName("StructureRisk")
    @Expose
    private Boolean StructureRisk;
    @SerializedName("UnPaidRisk")
    @Expose
    private Boolean UnPaidRisk;
    @SerializedName("ReceivableRisk")
    @Expose
    private Boolean ReceivableRisk;
    @SerializedName("ResearchCapitalizeRisk")
    @Expose
    private Boolean ResearchCapitalizeRisk;
    @SerializedName("PoorManagementRisk")
    @Expose
    private Integer PoorManagementRisk;
    @SerializedName("AchievementRisk")
    @Expose
    private Boolean AchievementRisk;
    @SerializedName("AchievementNoticeRisk")
    @Expose
    private Boolean AchievementNoticeRisk;
    @SerializedName("AchievementExpressRisk")
    @Expose
    private Boolean AchievementExpressRisk;
    @SerializedName("AchievementNoticeSignal")
    @Expose
    private Integer AchievementNoticeSignal;
    @SerializedName("AchievementNoticeNewestEndDate")
    @Expose
    private Timestamp AchievementNoticeNewestEndDate;
    @SerializedName("AchievementNoticeNearlyNewEndDate")
    @Expose
    private Timestamp AchievementNoticeNearlyNewEndDate;
    @SerializedName("AchievementExpressEndDate")
    @Expose
    private Timestamp AchievementExpressEndDate;
    @SerializedName("AchievementReportEndDateSignal")
    @Expose
    private Integer AchievementReportEndDateSignal;
    @SerializedName("AchievementReportNewestEndDate")
    @Expose
    private Timestamp AchievementReportNewestEndDate;
    @SerializedName("AchievementReportNearlyNewEndDate")
    @Expose
    private Timestamp AchievementReportNearlyNewEndDate;
    @SerializedName("SentimentRisk")
    @Expose
    private Boolean SentimentRisk;

    // -------------------- 财务异常属性 --------------------
    @SerializedName("AchievementReportRisk")
    @Expose
    private Boolean AchievementReportRisk;
    @SerializedName("DebtPayingDate")
    @Expose
    private Timestamp DebtPayingDate;
    @SerializedName("DebtRatio")
    @Expose
    private BigDecimal DebtRatio;
    @SerializedName("StructureDate")
    @Expose
    private Timestamp StructureDate;
    @SerializedName("GwInHolderRatio")
    @Expose
    private BigDecimal GwInHolderRatio;
    @SerializedName("UnpaidDate")
    @Expose
    private Timestamp UnpaidDate;
    @SerializedName("Funds")
    @Expose
    private BigDecimal Funds;
    @SerializedName("ShortTearDebts")
    @Expose
    private BigDecimal ShortTearDebts;
    @SerializedName("ReceivableDate")
    @Expose
    private Timestamp ReceivableDate;
    @SerializedName("CurReceivableRatio")
    @Expose
    private BigDecimal CurReceivableRatio;
    @SerializedName("LastReceivableRatio")
    @Expose
    private BigDecimal LastReceivableRatio;
    @SerializedName("RchCapDate")
    @Expose
    private Timestamp RchCapDate;
    @SerializedName("PrDate")
    @Expose
    private Timestamp PrDate;
    @SerializedName("StructureType")
    @Expose
    private Integer StructureType;
    @SerializedName("FixedAssetRatio")
    @Expose
    private BigDecimal FixedAssetRatio;
    @SerializedName("RcvInFlowRatio")
    @Expose
    private BigDecimal RcvInFlowRatio;
    @SerializedName("MessageRiskType")
    @Expose
    private String MessageRiskType;
    @SerializedName("CompositeRiskLevel")
    @Expose
    private Integer CompositeRiskLevel;
    @SerializedName("LastCompLevel")
    @Expose
    private Integer LastCompLevel;

    public String getStockCode() {
        return StockCode;
    }

    public void setStockCode(String stockCode) {
        StockCode = stockCode;
    }

    public String getStockName() {
        return StockName;
    }

    public void setStockName(String stockName) {
        StockName = stockName;
    }

    public String getIndustry() {
        return Industry;
    }

    public void setIndustry(String industry) {
        Industry = industry;
    }

    public Timestamp getPubDate() {
        return PubDate;
    }

    public void setPubDate(Timestamp pubDate) {
        PubDate = pubDate;
    }

    public String getMarketCode() {
        return MarketCode;
    }

    public void setMarketCode(String marketCode) {
        MarketCode = marketCode;
    }

    public Integer getRiskNum() {
        return RiskNum;
    }

    public void setRiskNum(Integer riskNum) {
        RiskNum = riskNum;
    }

    public Boolean getInfoReportRisk() {
        return InfoReportRisk;
    }

    public void setInfoReportRisk(Boolean infoReportRisk) {
        InfoReportRisk = infoReportRisk;
    }

    public Boolean getAnalyserRisk() {
        return AnalyserRisk;
    }

    public void setAnalyserRisk(Boolean analyserRisk) {
        AnalyserRisk = analyserRisk;
    }

    public Boolean getBehaviorRisk() {
        return BehaviorRisk;
    }

    public void setBehaviorRisk(Boolean behaviorRisk) {
        BehaviorRisk = behaviorRisk;
    }

    public Boolean getFinanceRisk() {
        return FinanceRisk;
    }

    public void setFinanceRisk(Boolean financeRisk) {
        FinanceRisk = financeRisk;
    }

    public Boolean getProfitPredictRisk() {
        return ProfitPredictRisk;
    }

    public void setProfitPredictRisk(Boolean profitPredictRisk) {
        ProfitPredictRisk = profitPredictRisk;
    }

    public Boolean getGradeRisk() {
        return GradeRisk;
    }

    public void setGradeRisk(Boolean gradeRisk) {
        GradeRisk = gradeRisk;
    }

    public Boolean getReduceRisk() {
        return ReduceRisk;
    }

    public void setReduceRisk(Boolean reduceRisk) {
        ReduceRisk = reduceRisk;
    }

    public String getProfitPredictRiskReportID() {
        return ProfitPredictRiskReportID;
    }

    public void setProfitPredictRiskReportID(String profitPredictRiskReportID) {
        ProfitPredictRiskReportID = profitPredictRiskReportID;
    }

    public String getGradeRiskReportID() {
        return GradeRiskReportID;
    }

    public void setGradeRiskReportID(String gradeRiskReportID) {
        GradeRiskReportID = gradeRiskReportID;
    }

    public String getReduceRiskReportID() {
        return ReduceRiskReportID;
    }

    public void setReduceRiskReportID(String reduceRiskReportID) {
        ReduceRiskReportID = reduceRiskReportID;
    }

    public Boolean getPledgeRisk() {
        return PledgeRisk;
    }

    public void setPledgeRisk(Boolean pledgeRisk) {
        PledgeRisk = pledgeRisk;
    }

    public Boolean getStockHolderRisk() {
        return StockHolderRisk;
    }

    public void setStockHolderRisk(Boolean stockHolderRisk) {
        StockHolderRisk = stockHolderRisk;
    }

    public Boolean getManagerReduceRisk() {
        return ManagerReduceRisk;
    }

    public void setManagerReduceRisk(Boolean managerReduceRisk) {
        ManagerReduceRisk = managerReduceRisk;
    }

    public Boolean getUnRestrictRisk() {
        return UnRestrictRisk;
    }

    public void setUnRestrictRisk(Boolean unRestrictRisk) {
        UnRestrictRisk = unRestrictRisk;
    }

    public BigDecimal getUnderWarningLineRatio() {
        return UnderWarningLineRatio;
    }

    public void setUnderWarningLineRatio(BigDecimal underWarningLineRatio) {
        UnderWarningLineRatio = underWarningLineRatio;
    }

    public BigDecimal getBetweenWLandCLRatio() {
        return BetweenWLandCLRatio;
    }

    public void setBetweenWLandCLRatio(BigDecimal betweenWLandCLRatio) {
        BetweenWLandCLRatio = betweenWLandCLRatio;
    }

    public BigDecimal getArriveCloseLineRatio() {
        return ArriveCloseLineRatio;
    }

    public void setArriveCloseLineRatio(BigDecimal arriveCloseLineRatio) {
        ArriveCloseLineRatio = arriveCloseLineRatio;
    }

    public BigDecimal getUnderWarningLineNum() {
        return UnderWarningLineNum;
    }

    public void setUnderWarningLineNum(BigDecimal underWarningLineNum) {
        UnderWarningLineNum = underWarningLineNum;
    }

    public BigDecimal getBetweenWLandCLNum() {
        return BetweenWLandCLNum;
    }

    public void setBetweenWLandCLNum(BigDecimal betweenWLandCLNum) {
        BetweenWLandCLNum = betweenWLandCLNum;
    }

    public BigDecimal getArriveCloseLineNum() {
        return ArriveCloseLineNum;
    }

    public void setArriveCloseLineNum(BigDecimal arriveCloseLineNum) {
        ArriveCloseLineNum = arriveCloseLineNum;
    }

    public Boolean getDebtPayingRisk() {
        return DebtPayingRisk;
    }

    public void setDebtPayingRisk(Boolean debtPayingRisk) {
        DebtPayingRisk = debtPayingRisk;
    }

    public Boolean getStructureRisk() {
        return StructureRisk;
    }

    public void setStructureRisk(Boolean structureRisk) {
        StructureRisk = structureRisk;
    }

    public Boolean getUnPaidRisk() {
        return UnPaidRisk;
    }

    public void setUnPaidRisk(Boolean unPaidRisk) {
        UnPaidRisk = unPaidRisk;
    }

    public Boolean getReceivableRisk() {
        return ReceivableRisk;
    }

    public void setReceivableRisk(Boolean receivableRisk) {
        ReceivableRisk = receivableRisk;
    }

    public Boolean getResearchCapitalizeRisk() {
        return ResearchCapitalizeRisk;
    }

    public void setResearchCapitalizeRisk(Boolean researchCapitalizeRisk) {
        ResearchCapitalizeRisk = researchCapitalizeRisk;
    }

    public Integer getPoorManagementRisk() {
        return PoorManagementRisk;
    }

    public void setPoorManagementRisk(Integer poorManagementRisk) {
        PoorManagementRisk = poorManagementRisk;
    }

    public Boolean getAchievementRisk() {
        return AchievementRisk;
    }

    public void setAchievementRisk(Boolean achievementRisk) {
        AchievementRisk = achievementRisk;
    }

    public Boolean getAchievementNoticeRisk() {
        return AchievementNoticeRisk;
    }

    public void setAchievementNoticeRisk(Boolean achievementNoticeRisk) {
        AchievementNoticeRisk = achievementNoticeRisk;
    }

    public Boolean getAchievementExpressRisk() {
        return AchievementExpressRisk;
    }

    public void setAchievementExpressRisk(Boolean achievementExpressRisk) {
        AchievementExpressRisk = achievementExpressRisk;
    }

    public Integer getAchievementNoticeSignal() {
        return AchievementNoticeSignal;
    }

    public void setAchievementNoticeSignal(Integer achievementNoticeSignal) {
        AchievementNoticeSignal = achievementNoticeSignal;
    }

    public Timestamp getAchievementNoticeNewestEndDate() {
        return AchievementNoticeNewestEndDate;
    }

    public void setAchievementNoticeNewestEndDate(Timestamp achievementNoticeNewestEndDate) {
        AchievementNoticeNewestEndDate = achievementNoticeNewestEndDate;
    }

    public Timestamp getAchievementNoticeNearlyNewEndDate() {
        return AchievementNoticeNearlyNewEndDate;
    }

    public void setAchievementNoticeNearlyNewEndDate(Timestamp achievementNoticeNearlyNewEndDate) {
        AchievementNoticeNearlyNewEndDate = achievementNoticeNearlyNewEndDate;
    }

    public Timestamp getAchievementExpressEndDate() {
        return AchievementExpressEndDate;
    }

    public void setAchievementExpressEndDate(Timestamp achievementExpressEndDate) {
        AchievementExpressEndDate = achievementExpressEndDate;
    }

    public Integer getAchievementReportEndDateSignal() {
        return AchievementReportEndDateSignal;
    }

    public void setAchievementReportEndDateSignal(Integer achievementReportEndDateSignal) {
        AchievementReportEndDateSignal = achievementReportEndDateSignal;
    }

    public Timestamp getAchievementReportNewestEndDate() {
        return AchievementReportNewestEndDate;
    }

    public void setAchievementReportNewestEndDate(Timestamp achievementReportNewestEndDate) {
        AchievementReportNewestEndDate = achievementReportNewestEndDate;
    }

    public Timestamp getAchievementReportNearlyNewEndDate() {
        return AchievementReportNearlyNewEndDate;
    }

    public void setAchievementReportNearlyNewEndDate(Timestamp achievementReportNearlyNewEndDate) {
        AchievementReportNearlyNewEndDate = achievementReportNearlyNewEndDate;
    }

    public Boolean getSentimentRisk() {
        return SentimentRisk;
    }

    public void setSentimentRisk(Boolean sentimentRisk) {
        SentimentRisk = sentimentRisk;
    }

    public Boolean getAchievementReportRisk() {
        return AchievementReportRisk;
    }

    public void setAchievementReportRisk(Boolean achievementReportRisk) {
        AchievementReportRisk = achievementReportRisk;
    }

    public Timestamp getDebtPayingDate() {
        return DebtPayingDate;
    }

    public void setDebtPayingDate(Timestamp debtPayingDate) {
        DebtPayingDate = debtPayingDate;
    }

    public BigDecimal getDebtRatio() {
        return DebtRatio;
    }

    public void setDebtRatio(BigDecimal debtRatio) {
        DebtRatio = debtRatio;
    }

    public Timestamp getStructureDate() {
        return StructureDate;
    }

    public void setStructureDate(Timestamp structureDate) {
        StructureDate = structureDate;
    }

    public BigDecimal getGwInHolderRatio() {
        return GwInHolderRatio;
    }

    public void setGwInHolderRatio(BigDecimal gwInHolderRatio) {
        GwInHolderRatio = gwInHolderRatio;
    }

    public Timestamp getUnpaidDate() {
        return UnpaidDate;
    }

    public void setUnpaidDate(Timestamp unpaidDate) {
        UnpaidDate = unpaidDate;
    }

    public BigDecimal getFunds() {
        return Funds;
    }

    public void setFunds(BigDecimal funds) {
        Funds = funds;
    }

    public BigDecimal getShortTearDebts() {
        return ShortTearDebts;
    }

    public void setShortTearDebts(BigDecimal shortTearDebts) {
        ShortTearDebts = shortTearDebts;
    }

    public Timestamp getReceivableDate() {
        return ReceivableDate;
    }

    public void setReceivableDate(Timestamp receivableDate) {
        ReceivableDate = receivableDate;
    }

    public BigDecimal getCurReceivableRatio() {
        return CurReceivableRatio;
    }

    public void setCurReceivableRatio(BigDecimal curReceivableRatio) {
        CurReceivableRatio = curReceivableRatio;
    }

    public BigDecimal getLastReceivableRatio() {
        return LastReceivableRatio;
    }

    public void setLastReceivableRatio(BigDecimal lastReceivableRatio) {
        LastReceivableRatio = lastReceivableRatio;
    }

    public Timestamp getRchCapDate() {
        return RchCapDate;
    }

    public void setRchCapDate(Timestamp rchCapDate) {
        RchCapDate = rchCapDate;
    }

    public Timestamp getPrDate() {
        return PrDate;
    }

    public void setPrDate(Timestamp prDate) {
        PrDate = prDate;
    }

    public Integer getStructureType() {
        return StructureType;
    }

    public void setStructureType(Integer structureType) {
        StructureType = structureType;
    }

    public BigDecimal getFixedAssetRatio() {
        return FixedAssetRatio;
    }

    public void setFixedAssetRatio(BigDecimal fixedAssetRatio) {
        FixedAssetRatio = fixedAssetRatio;
    }

    public BigDecimal getRcvInFlowRatio() {
        return RcvInFlowRatio;
    }

    public void setRcvInFlowRatio(BigDecimal rcvInFlowRatio) {
        RcvInFlowRatio = rcvInFlowRatio;
    }

    public String getMessageRiskType() {
        return MessageRiskType;
    }

    public void setMessageRiskType(String messageRiskType) {
        MessageRiskType = messageRiskType;
    }

    public Integer getCompositeRiskLevel() {
        return CompositeRiskLevel;
    }

    public void setCompositeRiskLevel(Integer compositeRiskLevel) {
        CompositeRiskLevel = compositeRiskLevel;
    }

    public Integer getLastCompLevel() {
        return LastCompLevel;
    }

    public void setLastCompLevel(Integer lastCompLevel) {
        LastCompLevel = lastCompLevel;
    }

    public String getRequestId() {
        return RequestId;
    }

    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    @Override
    protected void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StockCode", this.StockCode);
        this.setParamSimple(map, prefix + "StockName", this.StockName);
        this.setParamSimple(map, prefix + "Industry", this.Industry);
        this.setParamSimple(map, prefix + "PubDate", this.PubDate);
        this.setParamSimple(map, prefix + "MarketCode", this.MarketCode);
        this.setParamSimple(map, prefix + "RiskNum", this.RiskNum);
        this.setParamSimple(map, prefix + "InfoReportRisk", this.InfoReportRisk);
        this.setParamSimple(map, prefix + "AnalyserRisk", this.AnalyserRisk);
        this.setParamSimple(map, prefix + "BehaviorRisk", this.BehaviorRisk);
        this.setParamSimple(map, prefix + "FinanceRisk", this.FinanceRisk);
        this.setParamSimple(map, prefix + "ProfitPredictRisk", this.ProfitPredictRisk);
        this.setParamSimple(map, prefix + "GradeRisk", this.GradeRisk);
        this.setParamSimple(map, prefix + "ReduceRisk", this.ReduceRisk);
        this.setParamSimple(map, prefix + "ProfitPredictRiskReportID", this.ProfitPredictRiskReportID);
        this.setParamSimple(map, prefix + "GradeRiskReportID", this.GradeRiskReportID);
        this.setParamSimple(map, prefix + "ReduceRiskReportID", this.ReduceRiskReportID);
        this.setParamSimple(map, prefix + "PledgeRisk", this.PledgeRisk);
        this.setParamSimple(map, prefix + "StockHolderRisk", this.StockHolderRisk);
        this.setParamSimple(map, prefix + "ManagerReduceRisk", this.ManagerReduceRisk);
        this.setParamSimple(map, prefix + "UnRestrictRisk", this.UnRestrictRisk);
        this.setParamSimple(map, prefix + "UnderWarningLineRatio", this.UnderWarningLineRatio);
        this.setParamSimple(map, prefix + "BetweenWLandCLRatio", this.BetweenWLandCLRatio);
        this.setParamSimple(map, prefix + "ArriveCloseLineRatio", this.ArriveCloseLineRatio);
        this.setParamSimple(map, prefix + "UnderWarningLineNum", this.UnderWarningLineNum);
        this.setParamSimple(map, prefix + "BetweenWLandCLNum", this.BetweenWLandCLNum);
        this.setParamSimple(map, prefix + "ArriveCloseLineNum", this.ArriveCloseLineNum);
        this.setParamSimple(map, prefix + "DebtPayingRisk", this.DebtPayingRisk);
        this.setParamSimple(map, prefix + "StructureRisk", this.StructureRisk);
        this.setParamSimple(map, prefix + "UnPaidRisk", this.UnPaidRisk);
        this.setParamSimple(map, prefix + "ReceivableRisk", this.ReceivableRisk);
        this.setParamSimple(map, prefix + "ResearchCapitalizeRisk", this.ResearchCapitalizeRisk);
        this.setParamSimple(map, prefix + "PoorManagementRisk", this.PoorManagementRisk);
        this.setParamSimple(map, prefix + "AchievementRisk", this.AchievementRisk);
        this.setParamSimple(map, prefix + "AchievementNoticeRisk", this.AchievementNoticeRisk);
        this.setParamSimple(map, prefix + "AchievementExpressRisk", this.AchievementExpressRisk);
        this.setParamSimple(map, prefix + "AchievementNoticeSignal", this.AchievementNoticeSignal);
        this.setParamSimple(map, prefix + "AchievementNoticeNewestEndDate", this.AchievementNoticeNewestEndDate);
        this.setParamSimple(map, prefix + "AchievementNoticeNearlyNewEndDate", this.AchievementNoticeNearlyNewEndDate);
        this.setParamSimple(map, prefix + "AchievementExpressEndDate", this.AchievementExpressEndDate);
        this.setParamSimple(map, prefix + "AchievementReportEndDateSignal", this.AchievementReportEndDateSignal);
        this.setParamSimple(map, prefix + "AchievementReportNewestEndDate", this.AchievementReportNewestEndDate);
        this.setParamSimple(map, prefix + "AchievementReportNearlyNewEndDate", this.AchievementReportNearlyNewEndDate);
        this.setParamSimple(map, prefix + "SentimentRisk", this.SentimentRisk);
        this.setParamSimple(map, prefix + "AchievementReportRisk", this.AchievementReportRisk);
        this.setParamSimple(map, prefix + "DebtPayingDate", this.DebtPayingDate);
        this.setParamSimple(map, prefix + "DebtRatio", this.DebtRatio);
        this.setParamSimple(map, prefix + "StructureDate", this.StructureDate);
        this.setParamSimple(map, prefix + "GwInHolderRatio", this.GwInHolderRatio);
        this.setParamSimple(map, prefix + "UnpaidDate", this.UnpaidDate);
        this.setParamSimple(map, prefix + "Funds", this.Funds);
        this.setParamSimple(map, prefix + "ShortTearDebts", this.ShortTearDebts);
        this.setParamSimple(map, prefix + "ReceivableDate", this.ReceivableDate);
        this.setParamSimple(map, prefix + "CurReceivableRatio", this.CurReceivableRatio);
        this.setParamSimple(map, prefix + "LastReceivableRatio", this.LastReceivableRatio);
        this.setParamSimple(map, prefix + "RchCapDate", this.RchCapDate);
        this.setParamSimple(map, prefix + "PrDate", this.PrDate);
        this.setParamSimple(map, prefix + "StructureType", this.StructureType);
        this.setParamSimple(map, prefix + "FixedAssetRatio", this.FixedAssetRatio);
        this.setParamSimple(map, prefix + "RcvInFlowRatio", this.RcvInFlowRatio);
        this.setParamSimple(map, prefix + "MessageRiskType", this.MessageRiskType);
        this.setParamSimple(map, prefix + "CompositeRiskLevel", this.CompositeRiskLevel);
        this.setParamSimple(map, prefix + "LastCompLevel", this.LastCompLevel);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);
    }

}
