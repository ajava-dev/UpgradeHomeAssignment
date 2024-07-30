package com.upgrade.utils;

import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * This  HelperUtil would contain methods that could be used across the project like logging API repsonse,load config properties etc.
 */

public class HelperUtil {

    private static final Logger logger = LogManager.getLogger(HelperUtil.class);
    private static Properties properties;

    /**
     * This method loads config properties file
     */
    public static void loadProperties() {
        properties = new Properties();
        try {
            logger.info("Loading config property file");
            InputStream inputStream = new FileInputStream("src/main/resources/config/config.properties");
            properties.load(inputStream);

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load propertries config", e);

        }
    }

    /**
     * @param propertyKey Property key that we want to read from config properties file
     * @return String value for the property key
     */
    public static String getProperty(String propertyKey) {
        if (properties == null) {
            loadProperties();
        } else {
            loadProperties();
        }


        return properties.getProperty(propertyKey);
    }

    /**
     * Method logs response details via logger
     *
     * @param response API response object that would be logged.
     */
    public static void logApiResponse(Response response) {

        logger.info(" Response status code: {}", response.getStatusCode());
        logger.info("Response headers:\n{}", response.getHeaders());
        logger.info("Response body: \n{}", response.getBody().asString());

    }

    /**
     * Method returns the Base URI
     *
     * @return String value for the Base URI
     */
    public static String getBaseURI() {
        return getProperty("app.base.uri");

    }

}
