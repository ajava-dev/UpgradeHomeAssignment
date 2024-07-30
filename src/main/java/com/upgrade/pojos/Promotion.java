package com.upgrade.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Promotion {
    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("loanAppBundleUuid")
    private String loanAppBundleUuid;
    @JsonProperty("promotionProgramCode")
    private String promotionProgramCode;
    @JsonProperty("promotionAttributionType")
    private String promotionAttributionType;
    @JsonProperty("promotionLinkCode")
    private String promotionLinkCode;
    @JsonProperty("enrollStatus")
    private String enrollStatus;
    @JsonProperty("updatedByCrossSell")
    private Object updatedByCrossSell;

    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @JsonProperty("loanAppBundleUuid")
    public String getLoanAppBundleUuid() {
        return loanAppBundleUuid;
    }

    @JsonProperty("loanAppBundleUuid")
    public void setLoanAppBundleUuid(String loanAppBundleUuid) {
        this.loanAppBundleUuid = loanAppBundleUuid;
    }

    @JsonProperty("promotionProgramCode")
    public String getPromotionProgramCode() {
        return promotionProgramCode;
    }

    @JsonProperty("promotionProgramCode")
    public void setPromotionProgramCode(String promotionProgramCode) {
        this.promotionProgramCode = promotionProgramCode;
    }

    @JsonProperty("promotionAttributionType")
    public String getPromotionAttributionType() {
        return promotionAttributionType;
    }

    @JsonProperty("promotionAttributionType")
    public void setPromotionAttributionType(String promotionAttributionType) {
        this.promotionAttributionType = promotionAttributionType;
    }

    @JsonProperty("promotionLinkCode")
    public String getPromotionLinkCode() {
        return promotionLinkCode;
    }

    @JsonProperty("promotionLinkCode")
    public void setPromotionLinkCode(String promotionLinkCode) {
        this.promotionLinkCode = promotionLinkCode;
    }

    @JsonProperty("enrollStatus")
    public String getEnrollStatus() {
        return enrollStatus;
    }

    @JsonProperty("enrollStatus")
    public void setEnrollStatus(String enrollStatus) {
        this.enrollStatus = enrollStatus;
    }

    @JsonProperty("updatedByCrossSell")
    public Object getUpdatedByCrossSell() {
        return updatedByCrossSell;
    }

    @JsonProperty("updatedByCrossSell")
    public void setUpdatedByCrossSell(Object updatedByCrossSell) {
        this.updatedByCrossSell = updatedByCrossSell;
    }
}
