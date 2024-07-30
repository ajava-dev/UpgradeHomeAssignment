package com.upgrade.api;


import com.fasterxml.jackson.databind.ObjectMapper;
import com.upgrade.dto.ApiRequestData;
import com.upgrade.utils.HelperUtil;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;

/**
 * This BaseAPI class provides all the CRUD operation to work with specific API
 * It will work as a template for specific API classes that implement the BaseAPI
 */

public abstract class BaseAPI {
    private static final Logger logger = LogManager.getLogger(BaseAPI.class);


    /**
     * Sends out a POST request to create a resource
     *
     * @param apiEndPoint    EndPoint for the API
     * @param apiRequestData ApiRequestData Object contains data for Headers,Body
     * @return REST Assured Response Object is returned that contains reponse from the Server
     */
    protected Response post(String apiEndPoint, ApiRequestData apiRequestData) {
        try {

            logger.info("A POST request to URL: " + RestAssured.baseURI + "/" + apiEndPoint + " has been inititated.");
            logger.info("Request body: " + apiRequestData.toString());
            Response response = RestAssured.given().headers(apiRequestData.getHeaders().getAllheaders()).body(apiRequestData.getBody()).post(apiEndPoint);
            HelperUtil.logApiResponse(response);
            return response;

        } catch (RuntimeException e) {
            logger.info("POST request has failed: " + e.getMessage());
            throw e;

        }

    }

    /**
     * This is an example in Base API class based on assumption that we have a path parameter(Example : /path/{id}) being used for the GET request.
     * As I do not have access to upgrade documentation this would need to modified if GET request takes in query paramter(Example :/path?role=user).
     *
     * @param apiEndPoint    EndPoint for the API
     * @param apiRequestData ApiRequestData Object contains data for Headers,Body and Query Parameter if any.
     * @param id             Id for resource that we want to get.
     * @return REST Assured Response Object is returned that contains reponse from the Server
     */
    protected Response get(String apiEndPoint, ApiRequestData apiRequestData, int id) {
        try {

            logger.info("A GET request to URL: " + RestAssured.baseURI + "/" + apiEndPoint + " has been inititated.");
            logger.info("Request body: " + apiRequestData.toString());
            Response response = RestAssured.given().headers(apiRequestData.getHeaders().getAllheaders()).get(apiEndPoint + "/" + id);
            HelperUtil.logApiResponse(response);
            return response;

        } catch (RuntimeException e) {
            logger.info("GET request has failed: " + e.getMessage());
            throw e;

        }

    }

    /**
     * This is an example in Base API class based on assumption that we have a path parameter(Example : /path/{id}) being used for the UPDATE request.
     * As I do not have access to upgrade documentation this would need to modified.
     *
     * @param apiEndPoint    EndPoint for the API
     * @param apiRequestData ApiRequestData Object contains data for Headers,Body and Query Parameter if any.
     * @return REST Assured Response Object is returned that contains reponse from the Server
     */
    protected Response update(String apiEndPoint, ApiRequestData apiRequestData) {
        try {

            logger.info("A PUT request to URL: " + RestAssured.baseURI + "/" + apiEndPoint + " has been inititated.");
            logger.info("Request body: " + apiRequestData.toString());
            Response response = RestAssured.given().headers(apiRequestData.getHeaders().getAllheaders()).body(apiRequestData.getBody()).put(apiEndPoint);
            HelperUtil.logApiResponse(response);
            return response;

        } catch (RuntimeException e) {
            logger.info("PUT request has failed: " + e.getMessage());
            throw e;

        }


    }

    /**
     * This is an example in Base API class based on assumption that we have a path parameter(Example : /users/{id}) being used for the DELETE request.
     * As I do not have access to upgrade documentation this would need to modified.
     *
     * @param apiEndPoint    EndPoint for the API
     * @param apiRequestData ApiRequestData Object contains data for Headers
     * @param id
     * @return REST Assured Response Object is returned that contains reponse from the Server
     */
    protected Response delete(String apiEndPoint, ApiRequestData apiRequestData, int id) {
        try {

            logger.info("A DELETE request to URL: " + RestAssured.baseURI + "/" + apiEndPoint + " has been inititated.");
            logger.info("Request body: " + apiRequestData.toString());
            Response response = RestAssured.given().headers(apiRequestData.getHeaders().getAllheaders()).delete(apiEndPoint + "/" + id);
            HelperUtil.logApiResponse(response);
            return response;

        } catch (RuntimeException e) {
            logger.info("DELETE request has failed: " + e.getMessage());
            throw e;

        }

    }

    /**
     * This is an example in Base API class based on assumption that we have a path parameter(Example : /path/{id}) being used for the PATCH request.
     * As I do not have access to upgrade documentation this would need to modified.
     *
     * @param apiEndPoint    EndPoint for the API
     * @param apiRequestData ApiRequestData Object contains data for Headers,Body and Query Parameter if any.
     * @return REST Assured Response Object is returned that contains reponse from the Server
     */

    protected Response patch(String apiEndPoint, ApiRequestData apiRequestData) {
        try {

            logger.info("A PATCH request to URL: " + RestAssured.baseURI + "/" + apiEndPoint + " has been inititated.");
            logger.info("Request body: " + apiRequestData.toString());
            Response response = RestAssured.given().headers(apiRequestData.getHeaders().getAllheaders()).body(apiRequestData.getBody()).patch(apiEndPoint);
            HelperUtil.logApiResponse(response);
            return response;

        } catch (RuntimeException e) {
            logger.info("PATCH request has failed: " + e.getMessage());
            throw e;

        }


    }

    /**
     * @param apiEndPoint
     * @param apiRequestData ApiRequestData Object contains data for Headers.
     * @return REST Assured Response Object is returned that contains reponse from the Server.
     * Since OPTIONS request will return the header containing info about what server requests accepts
     * for this end point Exampple : POST and OPTIONS. for endpoint(api/brfunnelorch/v2/resume/byLeadSecret)
     */
    protected Response options(String apiEndPoint, ApiRequestData apiRequestData) {
        try {

            logger.info("A OPTIONS request to URL: " + RestAssured.baseURI + "/" + apiEndPoint + " has been inititated.");
            logger.info("Request body: " + apiRequestData.toString());
            Response response = RestAssured.given().headers(apiRequestData.getHeaders().getAllheaders()).body(apiRequestData.getBody()).options(apiEndPoint);
            HelperUtil.logApiResponse(response);
            return response;

        } catch (RuntimeException e) {
            logger.info("Option request has failed: " + e.getMessage());
            throw e;

        }


    }

    /**
     * This is a method to load the data from the JSON file specified in the file path
     *
     * @param filePath Path to the JSON file.
     * @return ApiRequestData object is returned with data loaded from the JSON file specified.
     */

    private ApiRequestData readApiRequestData(String filePath) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            return mapper.readValue(filePath, ApiRequestData.class);

        } catch (IOException e) {
            logger.error("Error reading the requested payload data from file" + filePath, e);
            throw new RuntimeException("Failed to read payload Json file: " + filePath);
        }

    }


}
