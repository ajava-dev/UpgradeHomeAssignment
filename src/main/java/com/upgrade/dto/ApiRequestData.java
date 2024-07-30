package com.upgrade.dto;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.upgrade.pojos.Headers;
import com.upgrade.pojos.QueryParams;
import com.upgrade.utils.MapperUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

public class ApiRequestData<T> {
    private static final Logger logger = LogManager.getLogger(ApiRequestData.class);
    private static final ObjectMapper mapper = new ObjectMapper();
    private final QueryParams params;
    private T body;
    private Headers headers;


    public ApiRequestData(String jsonFilePath, Class<T> pojoClass) {

        try {

            logger.info("Loading of ApiRequestData object started");
            JsonNode rootNode = mapper.readTree(new File(jsonFilePath));
            JsonNode bodyNode = rootNode.path("body");
            T currentPojo = mapper.treeToValue(bodyNode, pojoClass);
            logger.info("Starting header loaded data to pojo: {}", currentPojo);
            this.headers = MapperUtil.extractHeaders(jsonFilePath);
            this.params = MapperUtil.extractParams(jsonFilePath);
            logger.info("Successfully loaded data to pojo: {}", currentPojo);

        } catch (IOException e) {
            logger.error("Failed to load data to pojo " + pojoClass + " from file: " + jsonFilePath);
            throw new RuntimeException("Failed to load data to pojo" + pojoClass + " from file: " + jsonFilePath);
        }
    }

    public T getBody() {
        return body;
    }

    public void setBody(T body) {
        this.body = body;
    }

    public Headers getHeaders() {
        return headers;
    }

    public void setHeaders(Headers headers) {
        this.headers = headers;
    }

    @Override
    public String toString() {
        return "APIRequestData {" + headers.toString() + ", body=" + body + '}';
    }
}
