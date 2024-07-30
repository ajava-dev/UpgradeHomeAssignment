package com.upgrade.utils;

import com.upgrade.pojos.ErrorResponse;
import com.upgrade.pojos.ResumeAPIResponse;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;

/**
 * This AssertUtil class will help in custom assertions and make code more maintainable and resusable
 */

public class AssertsUtil {

    private static final Logger logger = LogManager.getLogger(AssertsUtil.class);

    /**
     * @param response           Response from the server
     * @param statusCodeExpected Expected response code for the response sent by server.
     */
    public static void assertStatusCode(Response response, int statusCodeExpected) {

        logger.info("Asserting for status code. Expected code :{},Actual code :{}", statusCodeExpected, response.getStatusCode());
        Assert.assertEquals(statusCodeExpected, response.getStatusCode(), "Status code does not match");

    }

    /**
     * This method asserts for status code and product type String
     *
     * @param response           Response from the server
     * @param statusCodeExpected Expected response code for the response sent by server.
     * @param productType        String product type to be verified
     */

    public static void assertStatusCodeAndProductType(Response response, int statusCodeExpected, String productType) {

        logger.info("Asserting for status code and product type. Expected code :{},Actual code :{}", statusCodeExpected, response.getStatusCode());
        ResumeAPIResponse resumeAPIResponse = response.as(ResumeAPIResponse.class);
        assertStatusCode(response, statusCodeExpected);
        Assert.assertEquals(resumeAPIResponse.getLoanAppResumptionInfo().getProductType(), productType, "Product type  does not match");

    }

    /**
     * This method asserts for status code 404
     *
     * @param response           Response from the server
     * @param statusCodeExpected Expected response code for the response sent by server.
     */
    public static void assertStatusCode404(Response response, int statusCodeExpected) {

        logger.info("Asserting for status code 404 and message. Expected code :{},Actual code :{}", statusCodeExpected, response.getStatusCode());
        ErrorResponse errorResponse = response.as(ErrorResponse.class);
        assertStatusCode(response, statusCodeExpected);
        Assert.assertEquals(errorResponse.getCode(), 100001);
        Assert.assertEquals(errorResponse.getMessage(), "Loan application does not exist.");
        Assert.assertEquals(errorResponse.getRetryable(), false);
        Assert.assertEquals(errorResponse.getType(), "ABNORMAL");
        Assert.assertEquals(errorResponse.getHttpStatus(), "NOT_FOUND");

    }

    /**
     * This method asserts for status code 400
     *
     * @param response           Response from the server
     * @param statusCodeExpected Expected response code for the response sent by server.
     */
    public static void assertStatusCode400(Response response, int statusCodeExpected) {

        logger.info("Asserting for status code 400 and message. Expected code :{},Actual code :{}", statusCodeExpected, response.getStatusCode());
        ErrorResponse errorResponse = response.as(ErrorResponse.class);
        assertStatusCode(response, statusCodeExpected);
        Assert.assertEquals(errorResponse.getHttpStatus(), "BAD_REQUEST");

    }

    /**
     * This method asserts for status code and headers from Options request only
     *
     * @param response           Response from the server
     * @param statusCodeExpected Expected response code for the response sent by server.
     */
    public static void assertStatusCodeAndOptionsHeaders(Response response, int statusCodeExpected) {

        logger.info("Asserting for status code and headers. Expected code :{},Actual code :{}", statusCodeExpected, response.getStatusCode());
        String allowHeaders = response.getHeader("Allow");
        assertStatusCode(response, statusCodeExpected);
        Assert.assertNotNull(allowHeaders);
        Assert.assertTrue(allowHeaders.contains("POST"), "Only POST and OPTIONS method are allowed");
        Assert.assertTrue(allowHeaders.contains("OPTIONS"), "Only POST and OPTIONS method are allowed");
    }
}
