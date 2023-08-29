package com.shikshalokam.pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.objects.LoginPageObjects;
import com.shikshalokam.pages.objects.ObservationPageObjects;
import com.shikshalokam.pages.objects.ReportPageObjects;
import com.shikshalokam.utils.logger.Logger;

public class ReportPageAction {

	LoginPageObjects loginPageObjects = new LoginPageObjects();
    ObservationPageObjects observationPageObjects = new ObservationPageObjects();
    ReportPageObjects reportPageObjects = new ReportPageObjects();
    
    JavascriptExecutor js = (JavascriptExecutor) ShikshaLokamClient.get().driver();
    
    public ReportPageAction() throws Exception {
    	reportPageObjects = PageFactory.initElements(ShikshaLokamClient.get().driver(), ReportPageObjects.class);
    }
        //******************Actions*********************************************************//
    
    	public void clickOnMyReportsTab() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.myReportsFromProfile);
    		Logger.logAndReportInfo("Clicked on the my reports tab .");
    	}
    
    	public void clickOn1stReport() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.myReportPage1stReport);
    		Logger.logAndReportInfo("Clicked on the 1st report from my report section.");
    	}
    	
    	public void clickOnObsWithRubricSingleSubmissionReport() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.obsWithRubricSingleSubmissionReport);
    		Logger.logAndReportInfo("Clicked on Automation rubric with single submission - Teacher from my report section.");
    	}
    	
    	public void clickOnObsWithRubricMultipleSubmissionReport() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.obsWithRubricMultipleSubmissionReport);
    		Logger.logAndReportInfo("Clicked on Automation rubric with Multiple submission - Teacher from my report section.");
    	}
    	
    	
    	public void clickOnObsWithoutRubricReport() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.obsWithoutRubricReport);
    		Logger.logAndReportInfo("Clicked on Automation rubric without submission - Teacher from my report section.");
    	}
    	public void clickOnExportAsButton() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.exportAsButtonInReport);
    		Logger.logAndReportInfo("Clicked on the export as button in report.");
    	}
    
    	public void moveonExportAsButton() throws Exception {
    		ShikshaLokamClient.get().gestures().moveToElement(reportPageObjects.exportAsButtonInReport);
    		Thread.sleep(5000);
    		Logger.logAndReportInfo("Moved on to the export as button.");
    	}
    	public void clickOnPDFButton() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.pdfButtonWithoutRubric);
    		Logger.logAndReportInfo("Clicked on the pdf button.");
    	}
    
    	//******************Verify*********************************************************//
    	
    	public void verifyMyReportsTitle() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.myReportsTitle),"My reports title is not displayed.");
    		Logger.logAndReportPass("My reports title is displayed succesfully. ");
    	}
    	
    	 public void verifyMyReportInTableFormat() throws Exception {
 	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.serialNoCloumn),"Serial.No Column is not displayed.");
 			Logger.logAndReportInfo("Serial.No Column is displayed.");
 			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.titleCloumn),"Tile Column is not displayed.");
 			Logger.logAndReportInfo("Title Column is displayed.");
 			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.latestSubmissionCloumn),"Latest Submission Column is not displayed.");
 			Logger.logAndReportInfo("Latest Submission Column is displayed.");
 			
 		}
    	public void verifyEntityFilterOption() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.entityFilterForReport),"Entity Filter for report is not displayed.");
    		Logger.logAndReportPass("Entity Filter for report is displayed succesfully.");
    	}
    	
    	public void verifyQuestionTabInReport() throws Exception {
    		Thread.sleep(10000);
            Assert.assertTrue(ShikshaLokamClient.get().gestures().click(reportPageObjects.questionTabFromReport),"Question Tab inside the report is not displayed.");
    		Logger.logAndReportPass("Question Tab inside the report is displayed succesfully.");
    	}
    	
    	public void verifyCriteriaTabInReport() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.critiriaTabFromReport),"Criteria Tab inside the report is not displayed.");
    		js.executeScript("arguments[0].scrollIntoView(true);", reportPageObjects.critiriaTabFromReport);
    		Logger.logAndReportPass("Criteria Tab inside the report is displayed succesfully.");
    	}
    	
    	public void verifyExportAsButtonInReport() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.exportAsButtonInReport),"Export button is not displayed.");
    		Logger.logAndReportPass("Export button is displayed succesfully.");
    	}
    	
    	public void verifyPdfButtonInReportWithoutRubric() throws Exception {
    		//ShikshaLokamClient.get().gestures().moveToElement(reportPageObjects.pdfButton);
    		//Assert.assertTrue(ShikshaLokamClient.get().gestures().isDisplayed(reportPageObjects.pdfButton));
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.pdfButtonWithoutRubric),"PDF Button is not displayed.");
    		Logger.logAndReportPass("PDF Button is displayed succesfully.");
    	}
    	

    	public void verifyPdfButtonInReportWithRubric() throws Exception {
    		//ShikshaLokamClient.get().gestures().moveToElement(reportPageObjects.pdfButton);
    		//Assert.assertTrue(ShikshaLokamClient.get().gestures().isDisplayed(reportPageObjects.pdfButton));
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.pdfButtonWithRubric),"PDF Button is not displayed.");
    		Logger.logAndReportPass("PDF Button is displayed succesfully.");
    	}
    	public void verifyPdfButtonInReportBoolean() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.pdfButtonWithoutRubric));
    		Logger.logAndReportPass("Pdf button is displayed.");
    	}
    	public void verifyDescriptiveViewSection() throws Exception {
    		js.executeScript("arguments[0].scrollIntoView(true);", reportPageObjects.descriptiveViewSection);
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.descriptiveViewSection),"Descriptive View Section is not displayed.");
    		Logger.logAndReportPass("Descriptive View Section is displayed.");
    	}
}
