package com.sikshalokam.listners;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.sikshalokam.annotation.Author;
import com.sikshalokam.driver.DriverManager;
import com.sikshalokam.driver.GlobalSession;
import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.constants.IAutoConst;
import com.sikshalokam.report.ExtentManager;
import com.sikshalokam.report.ExtentTestManager;
import com.sikshalokam.report.SikshaLokamReport;
import com.sikshalokam.utils.prop.PropUtlis;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import static com.sikshalokam.utils.logger.DebugLogger.debugLogger;

/**
 * @author: Sunil H N Date: 03/05/2021 Purpose: initilize and start appium
 * server
 */

public class TestListeners implements ITestListener {

    public static String mode;

    public void onTestStart(ITestResult result) {
        try {
            String className = result.getMethod().getTestClass().getName();
            String testName = result.getMethod().getMethodName() + "";
            debugLogger().info(className.substring(20));
            debugLogger().info("*********************onTestStart********************* " + testName);
            Author author = result.getMethod().getConstructorOrMethod().getMethod().getAnnotation(Author.class);
            String description = result.getMethod().getDescription();
            ExtentTest testReport = ExtentTestManager.createTest(testName, description, PropUtlis.readConfig("browserConfig", "browser"), author);
            SikshaLokamReport.setExtentTest(testReport);
            GlobalSession.get().getDriverManager().createDriver();
            SikshaLokamClient.setSikshaLokamClient(new SikshaLokamClient(DriverManager.getDriver()));
            debugLogger().info("instance created for Web");

        } catch (Exception e) {
            debugLogger().error("Exception onTestStart: " + e.getMessage());
            e.printStackTrace();
        }

    }

    public void onTestSuccess(ITestResult result) {
        try {
            debugLogger().info("@onTestSuccess");

            SikshaLokamReport.getExtentTest().log(Status.PASS, result.getMethod().getMethodName() + " Passed");
            GlobalSession.get().getDriverManager().quitDriver();
            debugLogger().info("Driver closed");
        } catch (Exception e) {
            debugLogger().error("Exception onTestSuccess: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void onTestFailure(ITestResult result) {
        try {
            debugLogger().error("OnTestFailure");
            debugLogger().error(result.getThrowable().toString());
            String base64img = SikshaLokamClient.get().getScreenShot().captureBase64();
            SikshaLokamReport.getExtentTest().fail(
                    result.getMethod().getMethodName() + " Failed " + result.getThrowable().getLocalizedMessage(),
                    MediaEntityBuilder.createScreenCaptureFromBase64String(base64img).build());


            GlobalSession.get().getDriverManager().quitDriver();
        } catch (Exception e) {
            debugLogger().error("Exception onTestFailure: " + e.getMessage());
            e.printStackTrace();
        }
    }

    @SuppressWarnings("unused")
    public void onStart(ITestContext context) {
        try {
            debugLogger().info("*********************onStart********************* mode " + mode);
            IAnnotation.enableTests();
            GlobalSession.set(new GlobalSession());
            DriverManager driverManager = new DriverManager();
            if (true) {
                GlobalSession.get().setDriverManager(driverManager);
                try {
                    if (mode == null || mode.equalsIgnoreCase(IAutoConst.MODE_LOCAL)) {
                        debugLogger().info("Running in local");
                        GlobalSession.get().setDriverManager(driverManager);                    }
                } catch (Exception e) {
                    debugLogger().error("Exception onStart: " + e.getMessage());
                    e.printStackTrace();
                }
            }
            ExtentTestManager.InitReport();
        } catch (Exception e) {
            e.printStackTrace();
            debugLogger().error("Exception onStart: " + e.getMessage());
        }
    }

    public void onFinish(ITestContext context) {
        try {
            debugLogger().info("*********************onFinish*********************");
            ExtentManager.getExtent().flush();
        } catch (Exception e) {
            debugLogger().error("Exception onFinish: " + e.getMessage());
            e.printStackTrace();
        }

    }

}
