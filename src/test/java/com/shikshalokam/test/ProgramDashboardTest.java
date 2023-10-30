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
import com.shikshalokam.utils.logger.Logger;
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
  
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        getProgramDashboardActions().verifyByDefaultOnProgramDatasetsTab();
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
        //getProgramDashboardActions().requestStatusreportYes();
       
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
    
    getLoginPageActions().clickOnGuest();
    getProgramDashboardActions().clickOnprogramdashboard();
    getProgramDashboardActions().verifyselectProgramPopup();
    getProgramDashboardActions().selectOldProgram();
    Thread.sleep(2000);
 
    getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
    getProgramDashboardActions().verifyTabsOnProgramdashboardPage();
    getProgramDashboardActions().VerifySelectResourceMessage();
    getProgramDashboardActions().selectProjectResource();
    //getProgramDashboardActions().selectDistrictandOrgPD();
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
        getProgramDashboardActions().selectNewProgramProgramHTandOfficials();
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
        getProgramDashboardActions().selectNewProgramProgramHTandOfficials();
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
        getProgramDashboardActions().selectNewProgramProgramHTandOfficials();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        
        getProgramDashboardActions().verifyPmUdrReport();
        getProgramDashboardActions().requestUDRreport();
    

}
    //..................................REG..............................................//

    @Test(description = "To verify when user clicks on back button and Close dashboard on the page will takes user to the Home screen of the portal")
    @Author(name = "GAGAN")
    public void programDashboardBackButtonCloseDashboardButton_REG() throws Exception {
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
        getProgramDashboardActions().selectNewProgramProgramHTandOfficials();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        getLoginPageActions().clickOnBackbutton();
        getProgramDashboardActions().verifyUserOnHomePage();
        getLoginPageActions().clickOnGuest();
        getProgramDashboardActions().clickOnprogramdashboard();
        getProgramDashboardActions().verifyselectProgramPopup();
        getProgramDashboardActions().selectNewProgramProgramHTandOfficials();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        getProgramDashboardActions().ClickCloseDashboardButton();
        getProgramDashboardActions().verifyUserOnHomePage();
    }
    
    
    
    @Test(description = "To verify if User is able to Reset the filters.")
    @Author(name = "GAGAN")
    public void resetFilter_REG() throws Exception {
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
       
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        getProgramDashboardActions().clickOnProgramDatasetsTab();
        getProgramDashboardActions().selectProjectResource();
        getProgramDashboardActions().selectDistrictandOrgPD();
        getProgramDashboardActions().ClickResetFilterButton();
        getProgramDashboardActions().verifyselectProgramPopup();
       

    }
    
    
    @Test(description = "Verify user should see error message under graphs tab -- for old Proram")
    @Author(name = "SHREEJITH")
    public void selectResourceMsgUnderGraphsTabPM_REG() throws Exception {
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
        getProgramDashboardActions().selectOldProgram();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
       
        getProgramDashboardActions().clickOnGraphsTab();
        getProgramDashboardActions().VerifySelectResourceMessage();
        
    }
    
    @Test(description = "To verify, User should get an message when trying to access Tables tab (District wise status & Block wise status) - for PM")
    @Author(name = "SHREEJITH")
    public void selectResourceMsgAcrossTabsPM_REG() throws Exception {
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
        getProgramDashboardActions().selectNewProgramProgramHTandOfficials();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
    
        getProgramDashboardActions().clickOnDistrictWiseStatusTab();
        getProgramDashboardActions().VerifySelectResourceMessage(); 
    
        getProgramDashboardActions().clickOnBlockWiseStatusTab();
        getProgramDashboardActions().VerifySelectResourceMessage();

    }
    
    @Test(description = "To verify, User should get an message when trying to access Tables tab (District wise status & Block wise status) - for PD")
    @Author(name = "SHREEJITH")
    public void selectResourceMsgAcrossTabsPD_REG() throws Exception {
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
        Thread.sleep(10000);
         getLoginPageActions().refreshpage();
         Thread.sleep(5000);  
        
        getLoginPageActions().clickOnGuest();

        getProgramDashboardActions().clickOnprogramdashboard();
        getProgramDashboardActions().verifyselectProgramPopup();
        getProgramDashboardActions().selectNewProgramProgramHTandOfficials();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
    
        getProgramDashboardActions().clickOnDistrictWiseStatusTab();
        getProgramDashboardActions().VerifySelectResourceMessage(); 
    
        getProgramDashboardActions().clickOnBlockWiseStatusTab();
        getProgramDashboardActions().VerifySelectResourceMessage();

    }
    
    @Test(description = "To verify, User should get an message when trying to access Tables tab (District wise status & Block wise status) - for PM&PD")
    @Author(name = "SHREEJITH")
    
    public void selectResourceMsgAcrossTabsPMPD_REG() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!D:E");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();  
        
        Thread.sleep(3000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userNamePMPD"));
        getLoginPageActions().enterPassword(loginTestData.get("passwordPMPD"));
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
        getProgramDashboardActions().selectNewProgramProgramHTandOfficials();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
    
        getProgramDashboardActions().clickOnDistrictWiseStatusTab();
        getProgramDashboardActions().VerifySelectResourceMessage(); 
    
        getProgramDashboardActions().clickOnBlockWiseStatusTab();
        getProgramDashboardActions().VerifySelectResourceMessage();
}
    
    @Test(description = "Verify pop up appears when user clicks on 'Yes' button on Request Report Pop-up")
    @Author(name = "SHREEJITH")
    public void downloadReportPopup_REG() throws Exception {
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
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        
        getProgramDashboardActions().selectProjectResource();
        getProgramDashboardActions().requestTaskreportYes();
        getProgramDashboardActions().requestFilteredTaskDetailreportYes();
        getProgramDashboardActions(). selectObswithrubrics();
        getProgramDashboardActions().requestQuestionreportYes();
        getProgramDashboardActions().requestStatusreportYes();
        getProgramDashboardActions().requestDomainCriteriareportYes();
    
    }
    
    @Test(description = "Verify Select Program Pop-up")
    @Author(name = "SHREEJITH")
    public void selectProgramPopupConents_REG() throws Exception {
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
        getProgramDashboardActions().verifyContentsOfSelectProgramPopup();
        getProgramDashboardActions().clickOnCrossIcon();
        getProgramDashboardActions().verifyUserOnHomePage();
    }
   
    @Test(description = "To verify if User is able to add the program and Resource name through the filter drop-down again.")
    @Author(name = "SHREEJITH")
    public void selectProgramAgainOnDatasetsTab_REG() throws Exception {
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
        getProgramDashboardActions().selectNewProgramProgramHTandOfficials();
        Thread.sleep(2000);
  
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        getProgramDashboardActions().selectProgramAgain();
        getProgramDashboardActions().VerifySelectResourceMessage(); 
        getProgramDashboardActions().selectProjectResource();
    }
    
    @Test(description = "To verify if same Program and Resource Name is dispalyed across all tabs")
    @Author(name = "SHREEJITH")
    public void programAndResourceNameRetainedAcrossAllTabs_REG() throws Exception {
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
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        
        getProgramDashboardActions().selectProjectResource();
        getProgramDashboardActions().VerifyProgramNameAndResourceName();
        getProgramDashboardActions().clickOnGraphsTab();
        getProgramDashboardActions().VerifyProgramNameAndResourceName();
        getProgramDashboardActions().clickOnDistrictWiseStatusTab();
        getProgramDashboardActions().VerifyProgramNameAndResourceName();
        getProgramDashboardActions().clickOnBlockWiseStatusTab();
        getProgramDashboardActions().VerifyProgramNameAndResourceName();
    
    }
    
    
    
    @Test(description = "Verify that the table name is displayed on the top left of the table")
    @Author(name = "SHREEJITH")
    public void tableHeadersAcrossTableTabs_REG() throws Exception {
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
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        
        getProgramDashboardActions().selectProjectResource();
        getProgramDashboardActions().clickOnDistrictWiseStatusTab();
        getProgramDashboardActions().verifyDistrictWiseHeader();
       
        getProgramDashboardActions().clickOnBlockWiseStatusTab();
        getProgramDashboardActions().verifyBlockWiseHeader();
    
    }
    
    @Test(description = "To verify if the status report is selected, then the select Dropdown consists of following values and it is Multiselectable")
    @Author(name = "SHREEJITH")
    public void selectStatusDropdownValues_REG() throws Exception {
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
  
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();

        getProgramDashboardActions().selectProjectResource();
        getProgramDashboardActions().clickOnSelectReportDropdown();
        getProgramDashboardActions().selectStatusReport();
        getProgramDashboardActions().verifyProjectStatusFilters();
        
        //commenting out this piece code as Observations and survey Statusfilters is a knownbug ED-678
        getProgramDashboardActions(). selectObswithrubrics();
        getProgramDashboardActions().clickOnSelectReportDropdown();
        getProgramDashboardActions().selectStatusReport();
        getProgramDashboardActions().verifyObsWithRubricsStatusFilters();
        
        getProgramDashboardActions().selectObswithoutrubrics();
        getProgramDashboardActions().clickOnSelectReportDropdown();
        getProgramDashboardActions().selectStatusReport();
        getProgramDashboardActions().verifyObsWithoutRubricsStatusFilters(); 
       
        
        getProgramDashboardActions().selectSurvey();
        getProgramDashboardActions().clickOnSelectReportDropdown();
        getProgramDashboardActions().selectStatusReport();
        getProgramDashboardActions().verifySurveyStatusFilters();
        
    }
   
    
    @Test(description = "Verify that when user selects the filtered task detail report from dropdown, 3 more filters appears on program dashboard screen.")
    @Author(name = "SHREEJITH")
    public void filteredTaskDetailReportFilters_REG() throws Exception {
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
  
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();

        getProgramDashboardActions().selectProjectResource();
        getProgramDashboardActions().clickOnSelectReportDropdown();
        getProgramDashboardActions().selectFilteredTaskDetailReport();
        getProgramDashboardActions().verifyFilteredTaskDetailReportFilters();
    
    }
    
    @Test(description = "Verify that the user is able to select other filters District, Organization to filter all Graphs / Tables " + "&"
    		+ "  Verify that the user is able to reset the filters applied and post which user is shown with the pop-up to select the program")
    @Author(name = "SHREEJITH")
    public void selectDistrictOrgFiltersAndResetFiltersAcrossGraphsAndTablesTabs_REG() throws Exception {
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
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();

        getProgramDashboardActions().selectProjectResource();
        
        getProgramDashboardActions().clickOnGraphsTab();
        getProgramDashboardActions().VerifyProgramNameAndResourceName();
        getProgramDashboardActions().selectDistrictandOrgPD();
        getProgramDashboardActions().ClickResetFilterButton();
        getProgramDashboardActions().verifyselectProgramPopup();
        getProgramDashboardActions().selectOldProgram();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        getProgramDashboardActions().selectProjectResource();
       
        
        getProgramDashboardActions().clickOnDistrictWiseStatusTab();
        getProgramDashboardActions().VerifyProgramNameAndResourceName();
        getProgramDashboardActions().selectDistrictandOrgPD();
        getProgramDashboardActions().ClickResetFilterButton();
        getProgramDashboardActions().verifyselectProgramPopup();
        getProgramDashboardActions().selectOldProgram();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        getProgramDashboardActions().selectProjectResource();
        
        
        getProgramDashboardActions().clickOnBlockWiseStatusTab();
        getProgramDashboardActions().VerifyProgramNameAndResourceName();
        getProgramDashboardActions().selectDistrictandOrgPD();
        getProgramDashboardActions().ClickResetFilterButton();
        getProgramDashboardActions().verifyselectProgramPopup();
         
    }
   
    @Test(description = "Verify If a user tries to select block level filter without selecting any district an error message will come up below the filters on the screen" )
    @Author(name = "SHREEJITH")
    public void errorMessageToSelectDistrictFirst_REG() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!D:E");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();  
        
        Thread.sleep(3000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userNamePM"));
        getLoginPageActions().enterPassword(loginTestData.get("passwordPM"));
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
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();

        getProgramDashboardActions().selectProjectResource();
        getProgramDashboardActions().clickOnBlockPD();
        getProgramDashboardActions().verifyErrorMessageToSelectDistrictFirst();
        
      
    }
    
    @Test(description = "To verify, User is able to see In progress projects with evidence for Improvement project report in Program dashboard " +  "&" +  "To verify, User is able to see Submitted Projects with evidence for Improvement project report in Program dashboard" )
    @Author(name = "SHREEJITH")
    public void inprogressAndSubmittedProjectsWithEvidenceTableHeaders_REG() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!D:E");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();  
        
        Thread.sleep(3000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userNamePM"));
        getLoginPageActions().enterPassword(loginTestData.get("passwordPM"));
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
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        getProgramDashboardActions().selectProjectResource();
    
        getProgramDashboardActions().clickOnDistrictWiseStatusTab();
        getProgramDashboardActions().verifyInprogressAndSubmittedProjectsWithEvidencesTableColumns();
  
    }
    
    @Test(description = "Verify User Detail Report will not be availabe in Report type dropdown, When User has selected resource in resource filter")
    @Author(name = "SHREEJITH")
    public void userDetailedReportNotAvailablePM_REG() throws Exception {
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
        getProgramDashboardActions().selectNewProgramProgramTeacher(); 
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        Thread.sleep(2000);
        getProgramDashboardActions().selectProgramTeacherProjectResource();
        getProgramDashboardActions().clickOnSelectReportDropdown();
        getProgramDashboardActions().verifyNoUserDetailReport();
        
        getProgramDashboardActions().selectProgramTeacherObsWithRubricsResource();
        getProgramDashboardActions().clickOnSelectReportDropdown();
        getProgramDashboardActions().verifyNoUserDetailReport();
        
        getProgramDashboardActions().selectProgramTeacherObsWithoutRubricsResource();
        getProgramDashboardActions().clickOnSelectReportDropdown();
        getProgramDashboardActions().verifyNoUserDetailReport();
        
        getProgramDashboardActions().ClickResetFilterButton();  //clicking on reset filter due to unavailablity of all the resources in a single new Program
        
        getProgramDashboardActions().selectNewProgramProgramHTandOfficials();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        Thread.sleep(2000);
        
        getProgramDashboardActions().selectProgramHTandOfficialsSurveyHTResource();
        getProgramDashboardActions().clickOnSelectReportDropdown();
        getProgramDashboardActions().verifyNoUserDetailReport();
      
    }
    
    @Test(description = "To verify, User should NOT see any Report in the Report type dropdown,  if logged in as Program Designer , when only Program is selected ")
    @Author(name = "SHREEJITH")
    public void noReportsAvailableForPD_REG() throws Exception {
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
        Thread.sleep(10000);
         getLoginPageActions().refreshpage();
         Thread.sleep(5000);  
        
        getLoginPageActions().clickOnGuest();

        getProgramDashboardActions().clickOnprogramdashboard();
        getProgramDashboardActions().verifyselectProgramPopup();
        getProgramDashboardActions().selectNewProgramProgramHTandOfficials();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
       
        getProgramDashboardActions().verifySelectReportisNotClickable();
        
    }
    
    @Test(description = "Verify User Detail Report will be availabe in Report type dropdown, if logged in as both Program Manager & Program Designer ,when selected only Program")
    @Author(name = "SHREEJITH")
    public void userDetailReportPMPD_REG() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!D:E");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();  
        
        Thread.sleep(3000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userNamePMPD"));
        getLoginPageActions().enterPassword(loginTestData.get("passwordPMPD"));
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
        getProgramDashboardActions().selectNewProgramProgramHTandOfficials();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        getProgramDashboardActions().clickOnSelectReportDropdown();
        getProgramDashboardActions().verifyUdrReport();
        
    }
    
    @Test(description = "To verify, User should NOT see any report in the Report type dropdown, when user has selected old program")
    @Author(name = "SHREEJITH")
    public void noReportsAvailableForPM_REG() throws Exception {
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
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
       
        getProgramDashboardActions().verifySelectReportisNotClickable();
        
    }
    
    @Test(description = "Verify user lands on dataset tab by default when clicks on confirm button on the pop up  " + "  Verify resource will not be selected by default in the dataset tab on the program dashboard")
    @Author(name = "SHREEJITH")
    public void programSelectedByDefaultAndresourceNotSelectedByDefault_REG() throws Exception {
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
        getProgramDashboardActions().selectNewProgramProgramHTandOfficials();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        getProgramDashboardActions().verifySelectedProgramHTandOfficialsOnPopupIsByDefaultSelected(); 
        getProgramDashboardActions().verifyByDefaultNoResouceIsSelected();
      
    }
    
    @Test(description = "Verify user should not see  “No. of users who joined program” Big number chart under graphs tab")
    @Author(name = "SHREEJITH")
    public void bigNumbersChartNotAvailablePM_REG() throws Exception {
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
  
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        getProgramDashboardActions().clickOnGraphsTab();
        getProgramDashboardActions().VerifyNoBigNumberChart();
    }
    
    @Test(description = "To verify, If user has selected the resource as 'Improvement Project' then user should see the Table columns as mentioned in the Expected results   " +
    "  To verify, If user has selected the resource as 'Observation without rubric' then user should see the Table columns as mentioned in the Expected results    " +
    "  To verify, If user has selected the resource as 'Observation with rubric' then user should see the Table columns as mentioned in the Expected results  " +
    "  To verify, If user has selected the resource as 'Survey' then user should see the Table columns as mentioned in the Expected results")
    @Author(name = "SHREEJITH")
    public void blockWiseStatusTabTableColumnsPM_REG() throws Exception {
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
        getProgramDashboardActions().selectNewProgramProgramTeacher(); 
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        Thread.sleep(2000);
        getProgramDashboardActions().selectProgramTeacherProjectResource();
        getProgramDashboardActions().clickOnBlockWiseStatusTab();
        getProgramDashboardActions().verifyImprovementProjectTableColumnsOfBlockWiseStatusTab();
        
        getProgramDashboardActions().clickOnProgramDatasetsTab();
        Thread.sleep(2000);
        getProgramDashboardActions().selectProgramTeacherObsWithRubricsResource();
        getProgramDashboardActions().clickOnBlockWiseStatusTab();
        getProgramDashboardActions().verifyObservationsTableColumnsOfBlockWiseStatusTab();
        
        getProgramDashboardActions().clickOnProgramDatasetsTab(); 
        Thread.sleep(2000);
        getProgramDashboardActions().selectProgramTeacherObsWithoutRubricsResource(); 
        getProgramDashboardActions().clickOnBlockWiseStatusTab();
        getProgramDashboardActions().verifyObservationsTableColumnsOfBlockWiseStatusTab();
        
        getProgramDashboardActions().ClickResetFilterButton();  //clicking on reset filter due to unavailablity of all the resources in a single new Program
        
        getProgramDashboardActions().selectNewProgramProgramHTandOfficials();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        Thread.sleep(2000);
        
        getProgramDashboardActions().selectProgramHTandOfficialsSurveyHTResource();
        getProgramDashboardActions().clickOnBlockWiseStatusTab();
        
        getProgramDashboardActions().verifyTableViewNotAvailableFotThisReportUnderBlockWiseStatusTabForSurveyResource();
       
    }
    
    @Test(description = "To verify, If user has selected the resource as 'Improvement Project' then user should see the Table columns as mentioned in the Expected results   " +
    	    "  To verify, If user has selected the resource as 'Observation without rubric' then user should see the Table columns as mentioned in the Expected results    " +
    	    "  To verify, If user has selected the resource as 'Observation with rubric' then user should see the Table columns as mentioned in the Expected results  " +
    	    "  To verify, If user has selected the resource as 'Survey' then user should see the Table columns as mentioned in the Expected results")
    	    @Author(name = "SHREEJITH")
    	    public void blockWiseStatusTabTableColumnsPD_REG() throws Exception {
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
    	        Thread.sleep(10000);
    	         getLoginPageActions().refreshpage();
    	         Thread.sleep(5000);  
    	    
    	        getLoginPageActions().clickOnGuest();

    	        getProgramDashboardActions().clickOnprogramdashboard();
    	        getProgramDashboardActions().verifyselectProgramPopup();
    	        getProgramDashboardActions().selectNewProgramProgramTeacher(); 
    	        Thread.sleep(2000);
    	        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
    	        Thread.sleep(2000);
    	        getProgramDashboardActions().selectProgramTeacherProjectResource();
    	        getProgramDashboardActions().clickOnBlockWiseStatusTab();
    	        getProgramDashboardActions().verifyImprovementProjectTableColumnsOfBlockWiseStatusTab();
    	        
    	        getProgramDashboardActions().clickOnProgramDatasetsTab();
    	        Thread.sleep(2000);
    	        getProgramDashboardActions().selectProgramTeacherObsWithRubricsResource();
    	        getProgramDashboardActions().clickOnBlockWiseStatusTab();
    	        getProgramDashboardActions().verifyObservationsTableColumnsOfBlockWiseStatusTab();
    	        
    	        getProgramDashboardActions().clickOnProgramDatasetsTab(); 
    	        Thread.sleep(2000);
    	        getProgramDashboardActions().selectProgramTeacherObsWithoutRubricsResource(); 
    	        getProgramDashboardActions().clickOnBlockWiseStatusTab();
    	        getProgramDashboardActions().verifyObservationsTableColumnsOfBlockWiseStatusTab();
    	        
    	        getProgramDashboardActions().ClickResetFilterButton();  //clicking on reset filter due to unavailablity of all the resources in a single new Program
    	        
    	        getProgramDashboardActions().selectNewProgramProgramHTandOfficials();
    	        Thread.sleep(2000);
    	        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
    	        Thread.sleep(2000);
    	        
    	        getProgramDashboardActions().selectProgramHTandOfficialsSurveyHTResource();
    	        getProgramDashboardActions().clickOnBlockWiseStatusTab();
    	        
    	        getProgramDashboardActions().verifyTableViewNotAvailableFotThisReportUnderBlockWiseStatusTabForSurveyResource();
    }
    
    @Test(description = "Verify Request report button gets enabled when user clicks on User Detail Report , Whith selecting filters(i.e district, block , organisation...etc )  " + 
    " Verify user is able to request for User detail report with selecting other filters except resource filter  ")
    @Author(name = "SHREEJITH")
    public void RequestingUserDetailReportWithSelectingFilters_REG() throws Exception {
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
        getProgramDashboardActions().selectNewProgramProgramHTandOfficials();
        Thread.sleep(2000);
        getProgramDashboardActions().verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup();
        getProgramDashboardActions().clickOnDistrictDropdown();
        getProgramDashboardActions().selectDistrictUdr();
        getProgramDashboardActions().clickOnBlockPD();
        getProgramDashboardActions().selectBlock();
        getProgramDashboardActions().selectOrgPD();
        
        getProgramDashboardActions().verifyPmUdrReport();
        getProgramDashboardActions().requestUDRreportYes();
    

}
    
}