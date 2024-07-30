package com.upgrade.api;

import com.upgrade.dto.ApiRequestData;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * This ResumeAPI class provides CRUD operation to work/interact with the microservice Resume API.
 * As per the OPTIONS request via POSTMAN only POST and OPTIONS requests are supported by the Resume API.
 * So only 2 methods postRequest, optionsRequest are listed as of now. Had the Resume API supported more operations(HTTP Methods),We would have added those in this class.
 * getRequest is an example Shell method that returns null back
 */

public class ResumeAPI extends BaseAPI {

    private static final String RESUME_API_ENDPOINT = "api/brfunnelorch/v2/resume/byLeadSecret";
    private static final Logger logger = LogManager.getLogger(ResumeAPI.class);

    /**
     * Sends out a POST request to Resume API
     *
     * @param apiRequestData ApiRequestData Object contains data for Headers,Body for the Resume API post request.
     *                       ApiRequestData Object data is loaded in the Test class using a post specific JSON template.
     * @return REST Assured Response Object is returned that contains reponse from the Server
     */
    public Response postRequest(ApiRequestData apiRequestData) {
        logger.info("POST request has been initiated to ENDPOINT: " + RESUME_API_ENDPOINT);
        return post(RESUME_API_ENDPOINT, apiRequestData);
    }

    /**
     * Sends out a OPTIONS request to Resume API
     *
     * @param apiRequestData
     * @return REST Assured Response Object is returned that contains reponse from the Server
     */
    public Response optionsRequest(ApiRequestData apiRequestData) {
        logger.info("OPTIONS request has been initiated to ENDPOINT: " + RESUME_API_ENDPOINT);
        return options(RESUME_API_ENDPOINT, apiRequestData);
    }


    /**
     * This is just a shell method for a get request for an example. Since the Resume API supports POST and OPTIONS only. It returns null.
     *
     * @param apiRequestData
     * @return REST Assured Response Object is returned that contains reponse from the Server
     */
    public Response getRequest(ApiRequestData apiRequestData) {
        logger.info("OPTIONS request has been initiated to ENDPOINT: " + RESUME_API_ENDPOINT);
        return null;
    }
}
