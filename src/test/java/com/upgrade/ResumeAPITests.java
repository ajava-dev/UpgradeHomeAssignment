package com.upgrade;

import com.upgrade.api.ResumeAPI;
import com.upgrade.dataprovider.GenericDataProvider;
import com.upgrade.dto.ApiRequestData;
import com.upgrade.pojos.ResumeAPIRequest;
import com.upgrade.utils.AssertsUtil;
import com.upgrade.utils.MapperUtil;
import io.restassured.response.Response;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * This class ResumeAPITests tests ResumeAPI for POST and OPTIONS operations(HTTP methods)under various positive and negative scenarios.
 */
public class ResumeAPITests extends BaseTest {
    private static final Logger logger = LogManager.getLogger(ResumeAPITests.class);
    ResumeAPI resumeAPI;
    private String postTemplateFilePath;
    private ResumeAPIRequest resumeAPIRequest;


    @BeforeClass
    public void init() {
        logger.info("Starting the Resume API tests by launching Resume API Object");
        resumeAPI = new ResumeAPI();
        postTemplateFilePath = "src/test/resources/api/resume/post/requestTemplate.json";

    }


    @Test(description = "Verify that POST request for Resume API returns status code 200 for a valid payload and response generated has a product type is 'PERSONAL_LOAN'")
    public void validateResumeApi() {

        logger.info("Starting Test to verify that POST request for Resume API returns status code 200 for a valid payload");
        ApiRequestData apiRequestData = new ApiRequestData(postTemplateFilePath, ResumeAPIRequest.class);
        resumeAPIRequest = MapperUtil.loadPojo(postTemplateFilePath, ResumeAPIRequest.class);
        apiRequestData.setBody(resumeAPIRequest);
        Response response = resumeAPI.postRequest(apiRequestData);
        AssertsUtil.assertStatusCodeAndProductType(response, 200, "PERSONAL_LOAN");
        logger.info("Test 'validateResumeApi' ended.");
    }

    @Test(description = "Verify that POST request for Resume API returns status code 200 with skipSideEffects=false")
    public void validateSkipSideEffectsSetFalse() {

        logger.info(" Starting Test to verify that POST request for Resume API returns status code 200 with skipSideEffects=false");
        ApiRequestData apiRequestData = new ApiRequestData(postTemplateFilePath, ResumeAPIRequest.class);
        resumeAPIRequest = MapperUtil.loadPojo(postTemplateFilePath, ResumeAPIRequest.class);
        logger.info("Starting Tests");
        resumeAPIRequest.setSkipSideEffects(false);
        apiRequestData.setBody(resumeAPIRequest);
        Response response = resumeAPI.postRequest(apiRequestData);
        AssertsUtil.assertStatusCodeAndProductType(response, 200, "PERSONAL_LOAN");
        logger.info("Test 'validateSkipSideEffectsSetFalse' ended.");

    }

    @Test(description = " DataProvider used to verify that POST request for Resume API returns status code 200 with different values of skipSideEffects via data provider. Example of data provider use.", dataProviderClass = GenericDataProvider.class, dataProvider = "skipSideEffectsBooleanDataProvider")
    public void validateSkipSideEffectsSetNull(Boolean skipSideEffectsValue) {

        ApiRequestData apiRequestData = new ApiRequestData(postTemplateFilePath, ResumeAPIRequest.class);
        resumeAPIRequest = MapperUtil.loadPojo(postTemplateFilePath, ResumeAPIRequest.class);
        logger.info("Starting tests to verify that POST request for Resume API returns status code 200 with different values of skipSideEffects via data provider.");
        resumeAPIRequest.setSkipSideEffects(skipSideEffectsValue);
        apiRequestData.setBody(resumeAPIRequest);
        Response response = resumeAPI.postRequest(apiRequestData);
        AssertsUtil.assertStatusCodeAndProductType(response, 200, "PERSONAL_LOAN");
        logger.info("Test 'validateSkipSideEffectsSetNull' ended.");

    }

    @Test(description = "Verify for POST request for Resume API returns status code 500 for invalid loanAppUuid")
    public void validateInCorrectLoanAppUuid() {

        logger.info("Starting test to verify for POST request for Resume API returns status code 500 for invalid loanAppUuid");
        ApiRequestData apiRequestData = new ApiRequestData(postTemplateFilePath, ResumeAPIRequest.class);
        resumeAPIRequest = MapperUtil.loadPojo(postTemplateFilePath, ResumeAPIRequest.class);
        resumeAPIRequest.setLoanAppUuid("000");
        apiRequestData.setBody(resumeAPIRequest);
        Response response = resumeAPI.postRequest(apiRequestData);
        AssertsUtil.assertStatusCode(response, 500);
        logger.info("Test 'validateInCorrectLoanAppUuid' ended.");

    }

    @Test(description = "Verify for POST request for Resume API returns status code 404 for missing loanAppUuid")
    public void validateMissingLoanAppUuid() {

        logger.info("Starting test to verify for POST request for Resume API returns status code 404 for missing loanAppUuid");
        ApiRequestData apiRequestData = new ApiRequestData(postTemplateFilePath, ResumeAPIRequest.class);
        resumeAPIRequest = MapperUtil.loadPojo(postTemplateFilePath, ResumeAPIRequest.class);
        resumeAPIRequest.setLoanAppUuid("637ed6ac-d8ac-4872-a08c-b69b809b01c2");
        apiRequestData.setBody(resumeAPIRequest);
        Response response = resumeAPI.postRequest(apiRequestData);
        AssertsUtil.assertStatusCode404(response, 404);
        logger.info("Test 'validateMissingLoanAppUuid' ended.");

    }


    @Test(description = "Verify for POST request for Resume API returns status code 400 for null loanAppUuid")
    public void validateNullLoanAppUuid() {

        logger.info("Staring test to verify for POST request for Resume API returns status code 400 for null loanAppUuid");
        ApiRequestData apiRequestData = new ApiRequestData(postTemplateFilePath, ResumeAPIRequest.class);
        resumeAPIRequest = MapperUtil.loadPojo(postTemplateFilePath, ResumeAPIRequest.class);
        resumeAPIRequest.setLoanAppUuid(null);
        apiRequestData.setBody(resumeAPIRequest);
        Response response = resumeAPI.postRequest(apiRequestData);
        AssertsUtil.assertStatusCode400(response, 400);
        logger.info("Test 'validateNullLoanAppUuid' ended.");

    }

    @Test(description = "Verify for POST request for Resume API returns status code 400 for large value for loanAppUuid")
    public void validateLargeValueForAppUuid() {

        logger.info("Starting test Verify for POST request for Resume API returns status code 400 for large value for loanAppUuid");
        ApiRequestData apiRequestData = new ApiRequestData(postTemplateFilePath, ResumeAPIRequest.class);
        resumeAPIRequest = MapperUtil.loadPojo(postTemplateFilePath, ResumeAPIRequest.class);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            stringBuilder.append("Super Large value of UUID .......");
        }
        resumeAPIRequest.setLoanAppUuid(stringBuilder.toString());
        apiRequestData.setBody(resumeAPIRequest);
        Response response = resumeAPI.postRequest(apiRequestData);
        AssertsUtil.assertStatusCode(response, 500);
        logger.info("Test 'validateLargeValueForAppUuid' ended.");

    }


    @Test(description = "Verify for POST request for Resume API returns status code 500 for no 'x-cf-corr-id' header ")
    public void validateInValidCorrIdHeader() {

        logger.info(" Starting test to verify for POST request for Resume API returns status code 500 for no 'x-cf-corr-id' header.");
        ApiRequestData apiRequestData = new ApiRequestData(postTemplateFilePath, ResumeAPIRequest.class);
        resumeAPIRequest = MapperUtil.loadPojo(postTemplateFilePath, ResumeAPIRequest.class);
        apiRequestData.getHeaders().removeHeader("x-cf-corr-id");
        apiRequestData.setBody(resumeAPIRequest);
        Response response = resumeAPI.postRequest(apiRequestData);
        AssertsUtil.assertStatusCode(response, 500);
        logger.info("Test  'validateInValidCorrIdHeader' ended.");

    }

    @Test(description = "Verify for POST request for Resume API returns status code 200 for no 'x-cf-source-id' header ")
    public void validateInValidSourceIdHeader() {

        logger.info(" Starting test to verify for POST request for Resume API returns status code 200 for no 'x-cf-source-id' header.");
        ApiRequestData apiRequestData = new ApiRequestData(postTemplateFilePath, ResumeAPIRequest.class);
        resumeAPIRequest = MapperUtil.loadPojo(postTemplateFilePath, ResumeAPIRequest.class);
        apiRequestData.getHeaders().removeHeader("x-cf-source-id");
        apiRequestData.setBody(resumeAPIRequest);
        Response response = resumeAPI.postRequest(apiRequestData);
        AssertsUtil.assertStatusCode(response, 200);
        logger.info("Test 'validateInValidSourceIdHeader' ended.");

    }

    @Test(description = "Verify for OPTIONS request for Resume API returns status code 200")
    public void validateOptionsRequest() {

        logger.info(" Starting test to verify for POST request for Resume API returns status code 500 for no 'x-cf-corr-id' header.");
        ApiRequestData apiRequestData = new ApiRequestData(postTemplateFilePath, ResumeAPIRequest.class);
        resumeAPIRequest = MapperUtil.loadPojo(postTemplateFilePath, ResumeAPIRequest.class);
        apiRequestData.setBody(resumeAPIRequest);
        Response response = resumeAPI.optionsRequest(apiRequestData);
        AssertsUtil.assertStatusCodeAndOptionsHeaders(response, 200);
        logger.info("Test 'validateOptionsRequest' ended.");

    }

    @Test(description = "Verify for OPTIONS request for Resume API returns status code 500 for no 'x-cf-corr-id' header")
    public void validateOptionsRequestWithInvalidHeader() {

        logger.info(" Starting test to verify for POST request for Resume API returns status code 500 for no 'x-cf-corr-id' header.");
        ApiRequestData apiRequestData = new ApiRequestData(postTemplateFilePath, ResumeAPIRequest.class);
        resumeAPIRequest = MapperUtil.loadPojo(postTemplateFilePath, ResumeAPIRequest.class);
        apiRequestData.getHeaders().removeHeader("x-cf-corr-id");
        apiRequestData.setBody(resumeAPIRequest);
        Response response = resumeAPI.optionsRequest(apiRequestData);
        AssertsUtil.assertStatusCode(response, 500);
        logger.info("Test 'validateOptionsRequestWithInvalidHeader' ended.");

    }

}
