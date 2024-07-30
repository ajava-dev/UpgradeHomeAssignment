package com.upgrade.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoanApplicationBundle {

    @JsonProperty("uuid")
    private String uuid;
    @JsonProperty("promotions")
    private List<Promotion> promotions;

    @JsonProperty("uuid")
    public String getUuid() {
        return uuid;
    }

    @JsonProperty("uuid")
    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @JsonProperty("promotions")
    public List<Promotion> getPromotions() {
        return promotions;
    }

    @JsonProperty("promotions")
    public void setPromotions(List<Promotion> promotions) {
        this.promotions = promotions;
    }
}
