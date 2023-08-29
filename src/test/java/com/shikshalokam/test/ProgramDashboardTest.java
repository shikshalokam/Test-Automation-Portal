package com.shikshalokam.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


import java.util.Map;

import com.shikshalokam.annotation.Author;
import com.shikshalokam.pages.actions.LoginPageAction;
import com.shikshalokam.pages.actions.ObservationPageAction;
import com.shikshalokam.pages.actions.ProgramDashboardAction;
import com.shikshalokam.pages.actions.ReportPageAction;
import com.shikshalokam.utils.gSheet.TestData;
import com.shikshalokam.utils.prop.PropUtlis;

public class ProgramDashboardTest {
	Map<String, String> loginTestData;
    Map<String, String> observationPageTestData;
    String appUrl;
   
    
    public LoginPageAction getLoginPageActions() throws Exception {
        return new LoginPageAction();
    }
    public ProgramDashboardAction getProgramDashboardActions() throws Exception {
        return new ProgramDashboardAction();
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
        }}
    
    @Test(description = "login as Program manager and verify types of reports")
    @Author(name = "SHREEJITH")
    public void programDashboardPM() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!D:E");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();  
        
        Thread.sleep(3000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userNamePM"));
        getLoginPageActions().enterPassword(loginTestData.get("passwordPM"));
        //Thread.sleep(2000);
        getLoginPageActions().clickOnLoginButton();
        Thread.sleep(3000);
        
        //using refreshpage due to blank screen showing up after login 
        Thread.sleep(10000);
         getLoginPageActions().refreshpage();
         Thread.sleep(5000);  
        
        getLoginPageActions().clickOnGuest();

        getProgramDashboardActions().clickOnprogramdashboard();
        getProgramDashboardActions().verifyselectProgramPopup();
        getProgramDashboardActions().selectOldProgram();
        Thread.sleep(2000);
      //  getProgramDashboardActions().selectProjectResource();
      
       
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        getProgramDashboardActions().verifyTabsOnProgramdashboardPage();
        getProgramDashboardActions().VerifyProgramDatasetFilters();
        getProgramDashboardActions().VerifyGraphsFilters();
        getProgramDashboardActions().VerifyDistrictWiseStatusFilters();
        getProgramDashboardActions().VerifyBlockWiseStatusFilters();
        
        getProgramDashboardActions().clickOnProgramDatasetsTab();
        
        
        getProgramDashboardActions().VerifySelectResourceMessage();
        getProgramDashboardActions().selectProjectResource();
        
      //  getProgramDashboardActions().selectDistrictandOrgPD();
        //getProgramDashboardActions().selectdate();
       getProgramDashboardActions().verifyProjectReports();  
        getProgramDashboardActions().requestTaskreport();
      getProgramDashboardActions().requestStatusreport();
      getProgramDashboardActions().requestFilteredTaskDetailreport();
        
        getProgramDashboardActions(). selectObswithrubrics();
        getProgramDashboardActions().verifyobswithrubricReports();
        getProgramDashboardActions().requestQuestionreport();
       getProgramDashboardActions().requestStatusreport();
        getProgramDashboardActions().requestDomainCriteriareport();
        
        getProgramDashboardActions().selectObswithoutrubrics();
        getProgramDashboardActions().verifyobswitouthrubricReports();
        getProgramDashboardActions().requestQuestionreport();
      getProgramDashboardActions().requestStatusreport();    
      
        getProgramDashboardActions().selectSurvey();
        getProgramDashboardActions().verifySurveyReports();
        getProgramDashboardActions().requestQuestionreport();
        getProgramDashboardActions().requestStatusreport();   //here we are clicking on No on confirmation Popup
        
        //To verify user is able request report by clicking Yes on confirmation popup
        //getProgramDashboardActions().requestStatusreportYES();
       
    }
    
    @Test(description = "login as Program designer and verify types of reports")
    @Author(name = "GAGAN")
    public void programDashboardPD() throws Exception {
    loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!D:E");
    switchEnvironment();
    getLoginPageActions().BMCLSelection();
    Thread.sleep(3000);
    getLoginPageActions().clickOnGuest();
    getLoginPageActions().clickOnLogin();
    getLoginPageActions().enterUserName(loginTestData.get("userNamePD"));
    getLoginPageActions().enterPassword(loginTestData.get("passwordPD"));
    //Thread.sleep(2000);
    getLoginPageActions().clickOnLoginButton();
    Thread.sleep(3000);
    
    //using refreshpage due to blank screen showing up after login 
    /*Thread.sleep(10000);
     getLoginPageActions().refreshpage();
     Thread.sleep(5000);  */
    
    getLoginPageActions().clickOnGuest();
    getProgramDashboardActions().clickOnprogramdashboard();
    getProgramDashboardActions().verifyselectProgramPopup();
    getProgramDashboardActions().selectOldProgram();
    Thread.sleep(2000);
 
    getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
    getProgramDashboardActions().verifyTabsOnProgramdashboardPage();
    getProgramDashboardActions().selectProjectResource();
    getProgramDashboardActions().selectDistrictandOrgPD();
    getProgramDashboardActions().verifyPDReports();
    getProgramDashboardActions().requestStatusreportPD();
    getProgramDashboardActions(). selectObswithrubrics();
    getProgramDashboardActions().verifyPDReports();
    getProgramDashboardActions().requestStatusreportPD();
    getProgramDashboardActions().selectObswithoutrubrics();
    getProgramDashboardActions().verifyPDReports();
    getProgramDashboardActions().requestStatusreportPD();
    getProgramDashboardActions().selectSurvey();
    getProgramDashboardActions().verifyPDReports();
    getProgramDashboardActions().requestStatusreportPD(); //here we are clicking on No on confirmation Popup
    //To verify user is able request report by clicking Yes on confirmation popup
    //getProgramDashboardActions().requestStatusreportYES();
    //////
    }
    
    
    @Test(description = "login as Program manager and Program Designer to verfy Big Number Chart")
    @Author(name = "SHREEJITH")
    public void bigNumbersPMandPD() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!D:E");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();  
        
        Thread.sleep(3000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userNamePM"));
        getLoginPageActions().enterPassword(loginTestData.get("passwordPM"));
        //Thread.sleep(2000);
        getLoginPageActions().clickOnLoginButton();
        Thread.sleep(3000);
        
        //using refreshpage due to blank screen showing up after login 
        Thread.sleep(10000);
         getLoginPageActions().refreshpage();
         Thread.sleep(5000);  
        
        getLoginPageActions().clickOnGuest();

        getProgramDashboardActions().clickOnprogramdashboard();
        getProgramDashboardActions().verifyselectProgramPopup();
        getProgramDashboardActions().selectNewProgram();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        getProgramDashboardActions().clickOnGraphsTab();
        getProgramDashboardActions().VerifyBigNumberChart();
        
        getLoginPageActions().clickOnProfileiconAndLogout();
        switchEnvironment();
     	
     	getLoginPageActions().clickOnGuest();
	    getLoginPageActions().clickOnLogin();
	    getLoginPageActions().enterUserName(loginTestData.get("userNamePD"));
        getLoginPageActions().enterPassword(loginTestData.get("passwordPD"));
        getLoginPageActions().clickOnLoginButton();
        
        //using refreshpage due to blank screen showing up after login 
         Thread.sleep(10000);
         getLoginPageActions().refreshpage();
         Thread.sleep(5000);  
        
        getLoginPageActions().clickOnGuest();
        
        getProgramDashboardActions().clickOnprogramdashboard();
        getProgramDashboardActions().verifyselectProgramPopup();
        getProgramDashboardActions().selectNewProgram();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        getProgramDashboardActions().clickOnGraphsTab();
        getProgramDashboardActions().VerifyBigNumberChart();
  
}
    
    
    @Test(description = "login as Program manager and verify User Detail Report")
    @Author(name = "SHREEJITH")
    public void userDetailReport() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!D:E");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();  
        
        Thread.sleep(3000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userNamePM"));
        getLoginPageActions().enterPassword(loginTestData.get("passwordPM"));
        //Thread.sleep(2000);
        getLoginPageActions().clickOnLoginButton();
        Thread.sleep(3000);
        
        //using refreshpage due to blank screen showing up after login 
        Thread.sleep(10000);
         getLoginPageActions().refreshpage();
         Thread.sleep(5000);  
        
        getLoginPageActions().clickOnGuest();

        getProgramDashboardActions().clickOnprogramdashboard();
        getProgramDashboardActions().verifyselectProgramPopup();
        getProgramDashboardActions().selectNewProgram();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        
        getProgramDashboardActions().verifyPmUdrReport();
        getProgramDashboardActions().requestUDRreport();
    

}
    
}