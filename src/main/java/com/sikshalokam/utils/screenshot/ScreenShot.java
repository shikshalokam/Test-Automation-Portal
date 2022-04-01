package com.sikshalokam.utils.screenshot;

import static com.sikshalokam.utils.logger.DebugLogger.debugLogger;

import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;

import com.aventstack.extentreports.Status;
import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.report.SikshaLokamReport;

public class ScreenShot {

	private WebDriver driver;

	public ScreenShot(WebDriver driver) {
		this.driver = driver;
	}


	public void screenshot() throws Exception {
		debugLogger().info("screenshot");
		TakesScreenshot newScreen = (TakesScreenshot) driver;
		String scnShot = newScreen.getScreenshotAs(OutputType.BASE64);
		SikshaLokamReport.getExtentTest().info(
				"Captured Screen Shoot",
				MediaEntityBuilder.createScreenCaptureFromBase64String(scnShot).build());

	}

	public String captureBase64() {
		TakesScreenshot newScreen = (TakesScreenshot) driver;
		String scnShot = newScreen.getScreenshotAs(OutputType.BASE64);
		return "data:image/jpg;base64, " + scnShot;
	}

}
