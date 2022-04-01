package com.sikshalokam.driver;

import com.sikshalokam.enums.BrowserType;
import com.sikshalokam.utils.prop.PropUtlis;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

import static com.sikshalokam.utils.logger.DebugLogger.debugLogger;

/**
 * Created by Qualitrix Technologies Pvt Ltd.
 *
 * @author: Sunil H N Date: 23/02/2022 Purpose: Initilize the WebDriver
 */

public class WebDriverManagerUtils {

    WebDriver driver;

    WebDriverManagerUtils(WebDriver driver) {
        this.driver = driver;
    }


    public WebDriver initialization() {
        try {
            debugLogger().info("On initialization ");
            String browserName = PropUtlis.readConfig("browserConfig", "browser");
            String headLess = PropUtlis.readConfig("browserConfig", "headLess");
            if (browserName.equalsIgnoreCase(BrowserType.CHROME.toString())) {
                WebDriverManager.chromedriver().setup();
                if (headLess.equalsIgnoreCase("true")) {
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless");
                    options.addArguments("--disable-gpu");
                    options.addArguments("--ignore-certificate-errors");
                    options.addArguments("--window-size=1920,1200");
                    driver = new ChromeDriver(options);
                    debugLogger().debug("Chrome Browser launched in HeadLess mode");
                } else {
                    driver = new ChromeDriver();
                    debugLogger().debug("Chrome Browser launched in Head Mode");
                }
            } else if (browserName.equalsIgnoreCase(BrowserType.FIREFOX.toString())) {
                WebDriverManager.firefoxdriver().setup();
                if (headLess.equalsIgnoreCase("true")) {
                    FirefoxOptions options = new FirefoxOptions();
                    options.addArguments("--headless");
                    options.addArguments("--disable-gpu");
                    options.addArguments("--ignore-certificate-errors");
                    options.addArguments("--window-size=1920,1200");
                    driver = new FirefoxDriver(options);
                    debugLogger().debug("FireFox Browser launched in HeadLess Mode");
                } else {
                    driver = new FirefoxDriver();
                }
                debugLogger().debug("FireFox Browser launched in Head Mode");
            }
            driver.manage().window().maximize();
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.get(PropUtlis.readConfig("webAppConfig", "appUrl"));
        } catch (Exception e) {
            debugLogger().error("Exception in WebDriverManagerUtils initialization method");
            e.printStackTrace();
        }
        return driver;
    }


}
