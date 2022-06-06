package com.sikshalokam.utils.gestures;

import com.aventstack.extentreports.Status;
import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.report.SikshaLokamReport;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.IOException;

import static com.sikshalokam.utils.logger.DebugLogger.debugLogger;

@SuppressWarnings("rawtypes")
public class Gestures {
    public WebDriver driver;

    public Gestures(WebDriver webDriver) {
        this.driver = webDriver;
    }

    public void gestures() {
        debugLogger().info("Gestures");
    }

    public void sendValueToTextBox(WebElement element, String text) {
        try {
            element.sendKeys(text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getText(WebElement element) {

        return element.getText();
    }

    public boolean isDisplayed(WebElement element) {
        return element.isDisplayed();
    }

    public boolean click(WebElement element) throws Exception {
        String identifyBy = "xpath";
        boolean bElementFound = false;
        try {
            if (identifyBy.equalsIgnoreCase("xpath")) {
                bElementFound = element.isDisplayed();
                element.click();
            } else if (identifyBy.equalsIgnoreCase("id")) {
                bElementFound = this.driver.findElement(By.id(element.getAttribute("ID"))).isDisplayed();
                element.click();
            } else {
                SikshaLokamClient.get().logger().info("None of the Element Selected Please check the Element Once: ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            SikshaLokamClient.get().logger()
                    .error("None of the Element Selected Please check the Element Once: " + element);
            Assert.assertTrue(false, "***Method: click: Exception occured for locator= " + e.getMessage());
        }
        SikshaLokamClient.get().logger().info("Method: click for locator = " + element + " status = " + bElementFound);

        return bElementFound;
    }

    public boolean type(WebElement element, String value) throws Exception {
        String identifyBy = "xpath";
        boolean bElementFound = false;
        try {
            if (identifyBy.equalsIgnoreCase("xpath")) {
                bElementFound = element.isDisplayed();
                element.sendKeys(value);
            } else if (identifyBy.equalsIgnoreCase("id")) {
                bElementFound = this.driver.findElement(By.id(element.getAttribute("ID"))).isDisplayed();
                element.sendKeys(value);
            } else {
                SikshaLokamClient.get().logger().info("None of the Element Selected Please check the Element Once: ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            SikshaLokamClient.get().logger()
                    .error("None of the Element Selected Please check the Element Once: " + element);
            Assert.assertTrue(false, "***Method: type: Exception occured for locator= " + e.getMessage());
        }
        SikshaLokamClient.get().logger().info("Method: type for locator = " + element + " status = " + bElementFound);
        return bElementFound;
    }

    public void clear(WebElement element) {
        try {
            waitTillTheElementIsVisibleAndClickable(element);
            element.clear();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean isSelected(WebElement element) {
        return element.isSelected();
    }

    public boolean type(WebElement element) throws IOException {
        String identifyBy = "xpath";
        boolean bElementFound = false;
        waitTillTheElementIsVisibleAndClickable(element);
        try {
            if (identifyBy.equalsIgnoreCase("xpath")) {
                bElementFound = element.isDisplayed();
            } else if (identifyBy.equalsIgnoreCase("id")) {
                bElementFound = this.driver.findElement(By.id(element.getAttribute("ID"))).isDisplayed();
            } else {
                SikshaLokamClient.get().logger().info("None of the Element Selected Please check the Element Once: ");
            }
        } catch (Exception e) {
            SikshaLokamClient.get().logger().error("Method: assertIfElementExists :: Exception occured for locator = "
                    + element + " exception is = " + e.getMessage());
            Assert.assertTrue(false,
                    "***Method: assertIfElementExists: Exception occured for locator= " + e.getMessage());
        }
        SikshaLokamClient.get().logger()
                .info("Method: assertIfElementExists for locator = " + element + " status = " + bElementFound);
        return bElementFound;
    }

    public void clearValue(WebElement element) {
        element.clear();
    }

    public boolean assertIfElementExistsAndClick(WebDriver mDriver, String identifyBy, WebElement locator)
            throws Exception {
        boolean bElementFound = false;
        try {
            waitTillTheElementIsVisibleAndClickable(locator);
            if (identifyBy.equalsIgnoreCase("xpath")) {
                bElementFound = locator.isDisplayed();
                locator.click();
            } else if (identifyBy.equalsIgnoreCase("id")) {
                bElementFound = mDriver.findElement(By.id(locator.getAttribute("ID"))).isDisplayed();
                mDriver.findElement(By.id(locator.getAttribute("ID"))).click();
            } else {
                SikshaLokamClient.get().logger().info("None of the Element Selected Please check the Element Once: ");
            }
        } catch (Exception e) {
            e.printStackTrace();
            SikshaLokamReport.getExtentTest().log(Status.FAIL,
                    "Method: assertIfElementExists :: Exception occured for locator = " + locator + " exception is = "
                            + e.getMessage());
            Assert.assertTrue(false,
                    "***Method: assertIfElementExists: Exception occured for locator= " + e.getMessage());
        }
        SikshaLokamClient.get().logger()
                .info("Method: assertIfElementExists for locator = " + locator + " status = " + bElementFound);
        return bElementFound;
    }

    // Method to Wait till the Element is Visible and Clickable
    public void waitTillTheElementIsVisibleAndClickable(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, 30);
            wait.until(ExpectedConditions.visibilityOf(element));
            wait = new WebDriverWait(driver, 25);
            wait.until(ExpectedConditions.elementToBeClickable(element));
        } catch (Exception e) {
            e.printStackTrace();
            debugLogger().error(e.getLocalizedMessage());
        }
    }


    // New

    private boolean isElementPresent(WebElement locator) {
        try {
            waitForElementToAppear(locator);
            if (locator.isDisplayed())
                System.out.println("Element present on screen ***********" + locator);
            return true;
        } catch (Exception e) {
            System.out.println("Element not present on screen **************" + locator);
            return false;
        }
    }

    public WebElement waitForElementToAppear(WebElement id) {
        WebDriverWait wait = new WebDriverWait(this.driver, 25);
        wait.until(ExpectedConditions.visibilityOf(id));
        return id;
    }


    public void waitAndClickElementisVisible(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }


}
