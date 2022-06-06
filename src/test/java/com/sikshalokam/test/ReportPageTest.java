package com.sikshalokam.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.sikshalokam.annotation.Author;
import com.sikshalokam.pages.actions.LoginPageAction;
import com.sikshalokam.pages.actions.ObservationPageAction;
import com.sikshalokam.pages.actions.ReportPageAction;
import com.sikshalokam.utils.gSheet.TestData;

public class ReportPageTest {

	Map<String, String> loginTestData;
    Map<String, String> observationPageTestData;
    Map<String, String> reportPageTestData;
    
    public LoginPageAction getLoginPageActions() throws Exception {
        return new LoginPageAction();
    }
    
    public ObservationPageAction getObservationPageActions() throws Exception {
        return new ObservationPageAction();
    }
    
    public ReportPageAction getReportPageActions() throws Exception {
    	return new ReportPageAction();
    }
    
    @Test(description = "observation with rubric - fill q and a and submit .")
    @Author(name = "Manjunatha K")
    public void observationWithRubricReport() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getLoginPageActions().enterNameToSearchbox(observationPageTestData.get("withRubricObservation"));
        getLoginPageActions().clickOnSerachButton();
        getObservationPageActions().clickOnObservationButton();
        getLoginPageActions().clickOnSearchedObservationTitle();
        getObservationPageActions().verifyObservationName(observationPageTestData.get("withRubricObservation"));
        
    }
    
    @Test(description = "observation without rubric - fill q and a and submit .")
    @Author(name = "Manjunatha K")
    public void observationWithOutRubricReport() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getLoginPageActions().enterNameToSearchbox(observationPageTestData.get("withoutRubricObservation"));
        getLoginPageActions().clickOnSerachButton();
        getObservationPageActions().clickOnObservationButton();
        getLoginPageActions().clickOnSearchedObservationTitle();
        getObservationPageActions().verifyObservationName(observationPageTestData.get("withoutRubricObservation"));
        
    }
    
    
    @Test(description = "visit my report section and verify features available in it.")
    @Author(name = "Manjunatha K")
    public void visitMyReportsAndVerifyFeatures() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getObservationPageActions().clickOnObservationButton();
        getLoginPageActions().clickOnProfileIcon1();
        getReportPageActions().clickOnMyReportsTab();
        getReportPageActions().verifyMyReportsTitle();
        getReportPageActions().verifyEntityFilterOption();
        getReportPageActions().clickOn1stReport();
        getReportPageActions().verifyQuestionTabInReport();
        getReportPageActions().verifyCriteriaTabInReport();
        getReportPageActions().verifyExportAsButtonInReport();
        getReportPageActions().clickOnExportAsButton();
        getReportPageActions().verifyPdfButtonInReport();
    }
}
