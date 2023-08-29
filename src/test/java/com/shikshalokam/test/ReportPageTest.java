package com.shikshalokam.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.Map;

import org.testng.annotations.Test;

import com.shikshalokam.annotation.Author;
import com.shikshalokam.pages.actions.LoginPageAction;
import com.shikshalokam.pages.actions.ObservationPageAction;
import com.shikshalokam.pages.actions.ReportPageAction;
import com.shikshalokam.utils.gSheet.TestData;
import com.shikshalokam.utils.prop.PropUtlis;

public class ReportPageTest {

	Map<String, String> loginTestData;
    Map<String, String> observationPageTestData;
    Map<String, String> reportPageTestData;
    String appUrl;
    
    public LoginPageAction getLoginPageActions() throws Exception {
        return new LoginPageAction();
    }
    
    public ObservationPageAction getObservationPageActions() throws Exception {
        return new ObservationPageAction();
    }
    
    public ReportPageAction getReportPageActions() throws Exception {
    	return new ReportPageAction();
    }
    public String getEnvironmentValue() throws Exception {
    	return appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
    }
    
    public void switchEnvironment() throws Exception {
    	if(getEnvironmentValue().contains("preprod") || getEnvironmentValue().contains("prod")) {
        	getLoginPageActions().clickOnExploreDiksha();
        }
    	}
    
    @Test(description = "observation with rubric - fill q and a and submit .")
    @Author(name = "Manjunatha K")
    public void observationWithRubricReport() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
        if(appUrl.contentEquals("https://preprod.ntp.net.in/"))
        {
        	getLoginPageActions().clickOnExploreDiksha();
        }
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
        appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
        if(appUrl.contentEquals("https://preprod.ntp.net.in/"))
        {
        	getLoginPageActions().clickOnExploreDiksha();
        }
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
        appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
         
        //using refreshpage due to blank screen showing up after login 
        /* Thread.sleep(10000);
         getLoginPageActions().refreshpage();
         Thread.sleep(5000);  */
       
        getObservationPageActions().clickOnObservationButton();
        getLoginPageActions().clickOnProfileIcon1();
        getReportPageActions().clickOnMyReportsTab();
        getReportPageActions().verifyMyReportsTitle();
        getReportPageActions().verifyEntityFilterOption();
        getReportPageActions().verifyMyReportInTableFormat();
        getReportPageActions().clickOn1stReport();
        getReportPageActions().verifyQuestionTabInReport();
        getReportPageActions().verifyCriteriaTabInReport();
        getReportPageActions().verifyExportAsButtonInReport();
        //getReportPageActions().clickOnExportAsButton();
        getReportPageActions().moveonExportAsButton();
        getReportPageActions().verifyPdfButtonInReportWithoutRubric();
        //getReportPageActions().verifyPdfButtonInReportBoolean();
    }
    
    @Test(description = "visit my report section and verify features available in it")
    @Author(name = "SHREEJITH")
    public void teacherRoleVisitMyReportsAndVerifyFeatures() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("TeacheruserName"));
        getLoginPageActions().enterPassword(loginTestData.get("Teacherpassword"));
        getLoginPageActions().clickOnLoginButton();
        
       //using refreshpage due to blank screen showing up after login 
       /* Thread.sleep(10000);
        getLoginPageActions().refreshpage();
        Thread.sleep(5000);  */
       
      
        getLoginPageActions().clickOnProfileIcon1();
        getReportPageActions().clickOnMyReportsTab();
        getReportPageActions().verifyMyReportsTitle();
        getReportPageActions().verifyEntityFilterOption();
       
        getReportPageActions().clickOnObsWithRubricSingleSubmissionReport();
        getReportPageActions().verifyQuestionTabInReport();
        getReportPageActions().verifyDescriptiveViewSection();
        getReportPageActions().verifyExportAsButtonInReport();
        getReportPageActions().moveonExportAsButton();
        getReportPageActions().verifyPdfButtonInReportWithRubric();
        
        getObservationPageActions().clickOnBackButton();
        
        getReportPageActions().clickOnObsWithRubricMultipleSubmissionReport();
        getReportPageActions().verifyQuestionTabInReport();
        getReportPageActions().verifyDescriptiveViewSection();
        getReportPageActions().verifyExportAsButtonInReport();
        getReportPageActions().moveonExportAsButton();
        getReportPageActions().verifyPdfButtonInReportWithRubric();
        
        getObservationPageActions().clickOnBackButton();
        
       
        getReportPageActions().clickOnObsWithoutRubricReport();
        getReportPageActions().verifyQuestionTabInReport();
        getReportPageActions().verifyCriteriaTabInReport();
        getReportPageActions().verifyExportAsButtonInReport();
        getReportPageActions().moveonExportAsButton();
        getReportPageActions().verifyPdfButtonInReportWithoutRubric();
}
}
