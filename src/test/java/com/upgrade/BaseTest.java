package com.upgrade;

import com.upgrade.utils.HelperUtil;
import io.restassured.RestAssured;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.BeforeTest;

abstract class BaseTest {
    private static final Logger logger = LogManager.getLogger(BaseTest.class);

    @BeforeTest
    public static void setUp() {

        logger.info("Setting Base URI for tests");
        RestAssured.baseURI = HelperUtil.getBaseURI();
        logger.info("Base URI for tests has been set to " + RestAssured.baseURI);
    }

}
