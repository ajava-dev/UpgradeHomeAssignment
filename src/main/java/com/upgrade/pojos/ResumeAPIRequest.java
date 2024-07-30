package com.upgrade.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResumeAPIRequest {
    @JsonProperty("loanAppUuid")
    private String loanAppUuid;
    @JsonProperty("skipSideEffects")
    private Boolean skipSideEffects;

    @JsonProperty("loanAppUuid")
    public String getLoanAppUuid() {
        return loanAppUuid;
    }

    @JsonProperty("loanAppUuid")
    public void setLoanAppUuid(String loanAppUuid) {
        this.loanAppUuid = loanAppUuid;
    }

    @JsonProperty("skipSideEffects")
    public Boolean getSkipSideEffects() {
        return skipSideEffects;
    }

    @JsonProperty("skipSideEffects")
    public void setSkipSideEffects(Boolean skipSideEffects) {
        this.skipSideEffects = skipSideEffects;
    }

    @Override
    public String toString() {
        return "ResumeAPIRequest{" +
                "loanAppUuid='" + loanAppUuid + '\'' +
                ", skipSideEffects=" + skipSideEffects +
                '}';
    }
}
