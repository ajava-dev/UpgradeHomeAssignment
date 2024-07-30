package com.upgrade.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanAppResumptionInfo {
    @JsonProperty("loanAppId")
    private Integer loanAppId;
    @JsonProperty("loanAppUuid")
    private String loanAppUuid;
    @JsonProperty("purpose")
    private String purpose;
    @JsonProperty("referrer")
    private String referrer;
    @JsonProperty("status")
    private String status;
    @JsonProperty("productType")
    private String productType;
    @JsonProperty("sourceSystem")
    private String sourceSystem;
    @JsonProperty("desiredAmount")
    private Double desiredAmount;
    @JsonProperty("borrowerResumptionInfo")
    private BorrowerResumptionInfo borrowerResumptionInfo;
    @JsonProperty("coBorrowerResumptionInfo")
    private Object coBorrowerResumptionInfo;
    @JsonProperty("turnDown")
    private Boolean turnDown;
    @JsonProperty("hasLogin")
    private Boolean hasLogin;
    @JsonProperty("availableAppImprovements")
    private Object availableAppImprovements;
    @JsonProperty("cashOutAmount")
    private Object cashOutAmount;
    @JsonProperty("canAddCollateral")
    private Boolean canAddCollateral;
    @JsonProperty("programDefinitionCode")
    private String programDefinitionCode;
    @JsonProperty("rewardProgramId")
    private Object rewardProgramId;
    @JsonProperty("addon")
    private Object addon;
    @JsonProperty("isMobileDiscountApplied")
    private Object isMobileDiscountApplied;
    @JsonProperty("checkingDiscountAvailable")
    private Boolean checkingDiscountAvailable;
    @JsonProperty("plDepositBundleEligible")
    private Boolean plDepositBundleEligible;
    @JsonProperty("promotions")
    private List<Object> promotions;
    @JsonProperty("loanApplicationBundle")
    private LoanApplicationBundle loanApplicationBundle;
    @JsonProperty("resumptionAdditionalInfo")
    private ResumptionAdditionalInfo resumptionAdditionalInfo;
    @JsonProperty("creditUnionDisclaimers")
    private CreditUnionDisclaimers creditUnionDisclaimers;
    @JsonProperty("employmentRequired")
    private Boolean employmentRequired;
    @JsonProperty("ckMilestoneExperiment")
    private Object ckMilestoneExperiment;

    @JsonProperty("loanAppId")
    public Integer getLoanAppId() {
        return loanAppId;
    }

    @JsonProperty("loanAppId")
    public void setLoanAppId(Integer loanAppId) {
        this.loanAppId = loanAppId;
    }

    @JsonProperty("loanAppUuid")
    public String getLoanAppUuid() {
        return loanAppUuid;
    }

    @JsonProperty("loanAppUuid")
    public void setLoanAppUuid(String loanAppUuid) {
        this.loanAppUuid = loanAppUuid;
    }

    @JsonProperty("purpose")
    public String getPurpose() {
        return purpose;
    }

    @JsonProperty("purpose")
    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @JsonProperty("referrer")
    public String getReferrer() {
        return referrer;
    }

    @JsonProperty("referrer")
    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("productType")
    public String getProductType() {
        return productType;
    }

    @JsonProperty("productType")
    public void setProductType(String productType) {
        this.productType = productType;
    }

    @JsonProperty("sourceSystem")
    public String getSourceSystem() {
        return sourceSystem;
    }

    @JsonProperty("sourceSystem")
    public void setSourceSystem(String sourceSystem) {
        this.sourceSystem = sourceSystem;
    }

    @JsonProperty("desiredAmount")
    public Double getDesiredAmount() {
        return desiredAmount;
    }

    @JsonProperty("desiredAmount")
    public void setDesiredAmount(Double desiredAmount) {
        this.desiredAmount = desiredAmount;
    }

    @JsonProperty("borrowerResumptionInfo")
    public BorrowerResumptionInfo getBorrowerResumptionInfo() {
        return borrowerResumptionInfo;
    }

    @JsonProperty("borrowerResumptionInfo")
    public void setBorrowerResumptionInfo(BorrowerResumptionInfo borrowerResumptionInfo) {
        this.borrowerResumptionInfo = borrowerResumptionInfo;
    }

    @JsonProperty("coBorrowerResumptionInfo")
    public Object getCoBorrowerResumptionInfo() {
        return coBorrowerResumptionInfo;
    }

    @JsonProperty("coBorrowerResumptionInfo")
    public void setCoBorrowerResumptionInfo(Object coBorrowerResumptionInfo) {
        this.coBorrowerResumptionInfo = coBorrowerResumptionInfo;
    }

    @JsonProperty("turnDown")
    public Boolean getTurnDown() {
        return turnDown;
    }

    @JsonProperty("turnDown")
    public void setTurnDown(Boolean turnDown) {
        this.turnDown = turnDown;
    }

    @JsonProperty("hasLogin")
    public Boolean getHasLogin() {
        return hasLogin;
    }

    @JsonProperty("hasLogin")
    public void setHasLogin(Boolean hasLogin) {
        this.hasLogin = hasLogin;
    }

    @JsonProperty("availableAppImprovements")
    public Object getAvailableAppImprovements() {
        return availableAppImprovements;
    }

    @JsonProperty("availableAppImprovements")
    public void setAvailableAppImprovements(Object availableAppImprovements) {
        this.availableAppImprovements = availableAppImprovements;
    }

    @JsonProperty("cashOutAmount")
    public Object getCashOutAmount() {
        return cashOutAmount;
    }

    @JsonProperty("cashOutAmount")
    public void setCashOutAmount(Object cashOutAmount) {
        this.cashOutAmount = cashOutAmount;
    }

    @JsonProperty("canAddCollateral")
    public Boolean getCanAddCollateral() {
        return canAddCollateral;
    }

    @JsonProperty("canAddCollateral")
    public void setCanAddCollateral(Boolean canAddCollateral) {
        this.canAddCollateral = canAddCollateral;
    }

    @JsonProperty("programDefinitionCode")
    public String getProgramDefinitionCode() {
        return programDefinitionCode;
    }

    @JsonProperty("programDefinitionCode")
    public void setProgramDefinitionCode(String programDefinitionCode) {
        this.programDefinitionCode = programDefinitionCode;
    }

    @JsonProperty("rewardProgramId")
    public Object getRewardProgramId() {
        return rewardProgramId;
    }

    @JsonProperty("rewardProgramId")
    public void setRewardProgramId(Object rewardProgramId) {
        this.rewardProgramId = rewardProgramId;
    }

    @JsonProperty("addon")
    public Object getAddon() {
        return addon;
    }

    @JsonProperty("addon")
    public void setAddon(Object addon) {
        this.addon = addon;
    }

    @JsonProperty("isMobileDiscountApplied")
    public Object getIsMobileDiscountApplied() {
        return isMobileDiscountApplied;
    }

    @JsonProperty("isMobileDiscountApplied")
    public void setIsMobileDiscountApplied(Object isMobileDiscountApplied) {
        this.isMobileDiscountApplied = isMobileDiscountApplied;
    }

    @JsonProperty("checkingDiscountAvailable")
    public Boolean getCheckingDiscountAvailable() {
        return checkingDiscountAvailable;
    }

    @JsonProperty("checkingDiscountAvailable")
    public void setCheckingDiscountAvailable(Boolean checkingDiscountAvailable) {
        this.checkingDiscountAvailable = checkingDiscountAvailable;
    }

    @JsonProperty("plDepositBundleEligible")
    public Boolean getPlDepositBundleEligible() {
        return plDepositBundleEligible;
    }

    @JsonProperty("plDepositBundleEligible")
    public void setPlDepositBundleEligible(Boolean plDepositBundleEligible) {
        this.plDepositBundleEligible = plDepositBundleEligible;
    }

    @JsonProperty("promotions")
    public List<Object> getPromotions() {
        return promotions;
    }

    @JsonProperty("promotions")
    public void setPromotions(List<Object> promotions) {
        this.promotions = promotions;
    }

    @JsonProperty("loanApplicationBundle")
    public LoanApplicationBundle getLoanApplicationBundle() {
        return loanApplicationBundle;
    }

    @JsonProperty("loanApplicationBundle")
    public void setLoanApplicationBundle(LoanApplicationBundle loanApplicationBundle) {
        this.loanApplicationBundle = loanApplicationBundle;
    }

    @JsonProperty("resumptionAdditionalInfo")
    public ResumptionAdditionalInfo getResumptionAdditionalInfo() {
        return resumptionAdditionalInfo;
    }

    @JsonProperty("resumptionAdditionalInfo")
    public void setResumptionAdditionalInfo(ResumptionAdditionalInfo resumptionAdditionalInfo) {
        this.resumptionAdditionalInfo = resumptionAdditionalInfo;
    }

    @JsonProperty("creditUnionDisclaimers")
    public CreditUnionDisclaimers getCreditUnionDisclaimers() {
        return creditUnionDisclaimers;
    }

    @JsonProperty("creditUnionDisclaimers")
    public void setCreditUnionDisclaimers(CreditUnionDisclaimers creditUnionDisclaimers) {
        this.creditUnionDisclaimers = creditUnionDisclaimers;
    }

    @JsonProperty("employmentRequired")
    public Boolean getEmploymentRequired() {
        return employmentRequired;
    }

    @JsonProperty("employmentRequired")
    public void setEmploymentRequired(Boolean employmentRequired) {
        this.employmentRequired = employmentRequired;
    }

    @JsonProperty("ckMilestoneExperiment")
    public Object getCkMilestoneExperiment() {
        return ckMilestoneExperiment;
    }

    @JsonProperty("ckMilestoneExperiment")
    public void setCkMilestoneExperiment(Object ckMilestoneExperiment) {
        this.ckMilestoneExperiment = ckMilestoneExperiment;
    }

}