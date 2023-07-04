package com.ebay.tests;

import com.ebay.fw.AppManager;
import org.openqa.selenium.remote.Browser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;
import java.util.Arrays;

public class TestBase {
    protected static AppManager app = new AppManager(
            System.getProperty("browser", Browser.CHROME.browserName()));

    Logger logger = LoggerFactory.getLogger(TestBase.class);

    // @BeforeMethod
    @BeforeSuite()
    public void setUp() {

        app.init();
    }

    // @AfterMethod(enabled = false)
    @AfterSuite(enabled = false)
    public void tearDown() {

        app.stop();
    }

   /* @BeforeMethod
    public void startTest(Method m, Object[] p) {
        logger.info("Start test " + m.getName() + " with data: " + Arrays.asList(p));
    }

    @AfterMethod
    public void stopTest(ITestResult result) {

        if (result.isSuccess()) {
            logger.info("PASSED " + result.getMethod().getMethodName());
        } else {
            logger.info("FAILED " + result.getMethod().getMethodName());

        }
        logger.info("Stop test");
        logger.info("===================================================");

    }*/
}
