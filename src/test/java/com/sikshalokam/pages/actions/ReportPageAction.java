package com.sikshalokam.pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.objects.LoginPageObjects;
import com.sikshalokam.pages.objects.ObservationPageObjects;
import com.sikshalokam.pages.objects.ReportPageObjects;
import com.sikshalokam.utils.logger.Logger;

public class ReportPageAction {

	LoginPageObjects loginPageObjects = new LoginPageObjects();
    ObservationPageObjects observationPageObjects = new ObservationPageObjects();
    ReportPageObjects reportPageObjects = new ReportPageObjects();
    
    JavascriptExecutor js = (JavascriptExecutor) SikshaLokamClient.get().driver();
    
    public ReportPageAction() throws Exception {
    	reportPageObjects = PageFactory.initElements(SikshaLokamClient.get().driver(), ReportPageObjects.class);
    }
        //******************Actions*********************************************************//
    
    	public void clickOnMyReportsTab() throws Exception {
    		SikshaLokamClient.get().gestures().click(reportPageObjects.myReportsFromProfile);
    		Logger.logAndReportInfo("Clicked on the my reports tab .");
    	}
    
    	public void clickOn1stReport() throws Exception {
    		SikshaLokamClient.get().gestures().click(reportPageObjects.myReportPage1stReport);
    		Logger.logAndReportInfo("Clicked on the 1st report from my report section.");
    	}
    	
    	public void clickOnExportAsButton() throws Exception {
    		SikshaLokamClient.get().gestures().click(reportPageObjects.exportAsButtonInReport);
    		Logger.logAndReportInfo("Clicked on the export as button in report.");
    	}
    	
    	public void clickOnPDFButton() throws Exception {
    		SikshaLokamClient.get().gestures().click(reportPageObjects.pdfButton);
    		Logger.logAndReportInfo("Clicked on the pdf button.");
    	}
    
    	//******************Verify*********************************************************//
    	
    	public void verifyMyReportsTitle() throws Exception {
    		SikshaLokamClient.get().gestures().isDisplayed(reportPageObjects.myReportsTitle);
    		Logger.logAndReportPass("My reports title is displayed succesfully. ");
    	}
    
    	public void verifyEntityFilterOption() throws Exception {
    		SikshaLokamClient.get().gestures().isDisplayed(reportPageObjects.entityFilterForReport);
    		Logger.logAndReportPass("Entity Filter for report is displayed succesfully.");
    	}
    	
    	public void verifyQuestionTabInReport() throws Exception {
    		SikshaLokamClient.get().gestures().isDisplayed(reportPageObjects.questionTabFromReport);
    		Logger.logAndReportPass("Question Tab inside the report is displayed succesfully.");
    	}
    	
    	public void verifyCriteriaTabInReport() throws Exception {
    		SikshaLokamClient.get().gestures().isDisplayed(reportPageObjects.critiriaTabFromReport);
    		js.executeScript("arguments[0].scrollIntoView(true);", reportPageObjects.critiriaTabFromReport);
    		Logger.logAndReportPass("Criteria Tab inside the report is displayed succesfully.");
    	}
    	
    	public void verifyExportAsButtonInReport() throws Exception {
    		SikshaLokamClient.get().gestures().isDisplayed(reportPageObjects.exportAsButtonInReport);
    		Logger.logAndReportPass("Export button is displayed succesfully.");
    	}
    	
    	public void verifyPdfButtonInReport() throws Exception {
    		SikshaLokamClient.get().gestures().isDisplayed(reportPageObjects.pdfButton);
    		Logger.logAndReportPass("PDF Button is displayed succesfully.");
    	}
}
