package com.upgrade.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class Headers {
    @JsonProperty("headersMap")
    private final Map<String, String> headersMap = new HashMap<>();

    public Headers() {

    }

    public Headers(Map<String, String> headers) {

    }


    public void addHeader(String key, String value) {
        headersMap.put(key, value);

    }

    public void removeHeader(String key) {
        headersMap.remove(key);

    }

    public String getHeader(String key) {
        return headersMap.get(key);
    }

    public Map<String, String> getAllheaders() {
        return headersMap;
    }

    @Override
    public String toString() {

        return "Headers{" +
                "headers=" + headersMap + '}';

    }

}
