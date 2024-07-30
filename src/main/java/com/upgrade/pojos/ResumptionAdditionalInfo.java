package com.upgrade.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResumptionAdditionalInfo {
    @JsonProperty("cardIssuingBank")
    private Object cardIssuingBank;

    @JsonProperty("cardIssuingBank")
    public Object getCardIssuingBank() {
        return cardIssuingBank;
    }

    @JsonProperty("cardIssuingBank")
    public void setCardIssuingBank(Object cardIssuingBank) {
        this.cardIssuingBank = cardIssuingBank;
    }

}
