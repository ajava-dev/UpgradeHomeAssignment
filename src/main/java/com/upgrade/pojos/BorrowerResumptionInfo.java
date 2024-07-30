package com.upgrade.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BorrowerResumptionInfo {


    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("maskedEmail")
    private String maskedEmail;
    @JsonProperty("userUuid")
    private Object userUuid;
    @JsonProperty("ssnRequired")
    private Boolean ssnRequired;
    @JsonProperty("state")
    private String state;

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("maskedEmail")
    public String getMaskedEmail() {
        return maskedEmail;
    }

    @JsonProperty("maskedEmail")
    public void setMaskedEmail(String maskedEmail) {
        this.maskedEmail = maskedEmail;
    }

    @JsonProperty("userUuid")
    public Object getUserUuid() {
        return userUuid;
    }

    @JsonProperty("userUuid")
    public void setUserUuid(Object userUuid) {
        this.userUuid = userUuid;
    }

    @JsonProperty("ssnRequired")
    public Boolean getSsnRequired() {
        return ssnRequired;
    }

    @JsonProperty("ssnRequired")
    public void setSsnRequired(Boolean ssnRequired) {
        this.ssnRequired = ssnRequired;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }
}