package com.upgrade.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class QueryParams {
    @JsonProperty("params")
    private Map<String, String> params;

    public QueryParams() {
        this.params = new HashMap<>();
    }

    public QueryParams addParam(String key, String value) {
        this.params.put(key, value);
        return this;
    }


    public Map<String, String> getParams() {
        return params;
    }

    public void setParams(Map<String, String> params) {
        this.params = params;
    }

    @Override
    public String toString() {
        return "QueryParams{" +
                "params=" + params +
                '}';
    }
}
