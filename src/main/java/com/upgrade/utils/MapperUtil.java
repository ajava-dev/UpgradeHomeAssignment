package com.upgrade.utils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.upgrade.pojos.Headers;
import com.upgrade.pojos.QueryParams;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.File;
import java.io.IOException;

/**
 * This MapperUtil maps the JSON files data to respective pojo class objects using generics and Jackson Object Mapper
 */

public class MapperUtil {

    public static final ObjectMapper mapper = new ObjectMapper();
    private static final Logger logger = LogManager.getLogger(MapperUtil.class);

    /**
     * @param jsonFilePath Path to the JSON file
     * @param pojoClass    The class type to convert JSON to
     * @param <T>          Type of class
     * @return Instance of class type specified is returned
     */
    public static <T> T loadPojo(String jsonFilePath, Class<T> pojoClass) {

        try {
            JsonNode rootNode = mapper.readTree(new File(jsonFilePath));
            JsonNode bodyNode = rootNode.path("body");
            T currentPojo = mapper.treeToValue(bodyNode, pojoClass);
            logger.info("Successfully loaded data to pojo: {}", currentPojo);
            return currentPojo;
        } catch (IOException e) {
            logger.error("Failed to load data to pojo " + pojoClass + " from file: " + jsonFilePath);
            throw new RuntimeException("Failed to load data to pojo" + pojoClass + " from file: " + jsonFilePath);
        }
    }

    /**
     * Method extracts Headers from the JSON file
     *
     * @param jsonFilePath Path to the JSON file
     * @return Headers object is returned
     */
    public static Headers extractHeaders(String jsonFilePath) {

        try {
            JsonNode rootNode = mapper.readTree(new File(jsonFilePath));
            Headers headers = new Headers();
            JsonNode headersNode = rootNode.path("headers");
            headersNode.fields().forEachRemaining(field -> headers.addHeader(field.getKey(), field.getValue().asText()));
            logger.info("Successfully loaded headers data");
            return headers;
        } catch (IOException e) {
            logger.error("Failed to load headers data from " + jsonFilePath);
            throw new RuntimeException("Failed to load headers data from " + jsonFilePath);
        }
    }

    /**
     * Method extracts QueryParams Headers from the JSON file
     *
     * @param jsonFilePath Path to the JSON file
     * @return QueryParams object is returned
     */
    public static QueryParams extractParams(String jsonFilePath) {

        try {
            JsonNode rootNode = mapper.readTree(new File(jsonFilePath));
            QueryParams params = new QueryParams();
            JsonNode paramsNode = rootNode.path("params");
            paramsNode.fields().forEachRemaining(field -> params.addParam(field.getKey(), field.getValue().asText()));
            logger.info("Successfully loaded parameter data");
            return params;
        } catch (IOException e) {
            logger.error("Failed to load parameter data from " + jsonFilePath);
            throw new RuntimeException("Failed to load parameter data from " + jsonFilePath);
        }
    }


}
