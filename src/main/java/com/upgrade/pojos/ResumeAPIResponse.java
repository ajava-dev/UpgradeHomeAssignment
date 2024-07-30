package com.upgrade.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResumeAPIResponse {

    @JsonProperty("loanAppResumptionInfo")
    private LoanAppResumptionInfo loanAppResumptionInfo;
    @JsonProperty("offers")
    private List<Object> offers;
    @JsonProperty("selectedOffer")
    private Object selectedOffer;
    @JsonProperty("requiredAgreements")
    private List<Object> requiredAgreements;
    @JsonProperty("resetOptions")
    private List<String> resetOptions;
    @JsonProperty("originalLoanApp")
    private Object originalLoanApp;

    @JsonProperty("loanAppResumptionInfo")
    public LoanAppResumptionInfo getLoanAppResumptionInfo() {
        return loanAppResumptionInfo;
    }

    @JsonProperty("loanAppResumptionInfo")
    public void setLoanAppResumptionInfo(LoanAppResumptionInfo loanAppResumptionInfo) {
        this.loanAppResumptionInfo = loanAppResumptionInfo;
    }

    @JsonProperty("offers")
    public List<Object> getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    @JsonProperty("selectedOffer")
    public Object getSelectedOffer() {
        return selectedOffer;
    }

    @JsonProperty("selectedOffer")
    public void setSelectedOffer(Object selectedOffer) {
        this.selectedOffer = selectedOffer;
    }

    @JsonProperty("requiredAgreements")
    public List<Object> getRequiredAgreements() {
        return requiredAgreements;
    }

    @JsonProperty("requiredAgreements")
    public void setRequiredAgreements(List<Object> requiredAgreements) {
        this.requiredAgreements = requiredAgreements;
    }

    @JsonProperty("resetOptions")
    public List<String> getResetOptions() {
        return resetOptions;
    }

    @JsonProperty("resetOptions")
    public void setResetOptions(List<String> resetOptions) {
        this.resetOptions = resetOptions;
    }

    @JsonProperty("originalLoanApp")
    public Object getOriginalLoanApp() {
        return originalLoanApp;
    }

    @JsonProperty("originalLoanApp")
    public void setOriginalLoanApp(Object originalLoanApp) {
        this.originalLoanApp = originalLoanApp;
    }

    @Override
    public String toString() {
        return "ResumeAPIResponse{" +
                "loanAppResumptionInfo=" + loanAppResumptionInfo +
                ", offers=" + offers +
                ", selectedOffer=" + selectedOffer +
                ", requiredAgreements=" + requiredAgreements +
                ", resetOptions=" + resetOptions +
                ", originalLoanApp=" + originalLoanApp +
                '}';
    }
}
