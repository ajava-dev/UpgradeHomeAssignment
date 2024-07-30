package com.upgrade.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CreditUnionDisclaimers {

    @JsonProperty("showDisclaimers")
    private Boolean showDisclaimers;

    @JsonProperty("showDisclaimers")
    public Boolean getShowDisclaimers() {
        return showDisclaimers;
    }

    @JsonProperty("showDisclaimers")
    public void setShowDisclaimers(Boolean showDisclaimers) {
        this.showDisclaimers = showDisclaimers;
    }
}
