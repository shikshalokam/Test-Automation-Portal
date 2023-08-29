package com.shikshalokam.test;

import org.testng.annotations.Test;
import java.util.Map;

import org.testng.annotations.Test;

import com.shikshalokam.annotation.Author;
import com.shikshalokam.pages.actions.AdminDashboardAction;
import com.shikshalokam.pages.actions.LoginPageAction;
import com.shikshalokam.pages.actions.ProgramDashboardAction;
import com.shikshalokam.utils.gSheet.TestData;
import com.shikshalokam.utils.prop.PropUtlis;

public class AdminDashboardTest {
		Map<String, String> loginTestData;
	    Map<String, String> observationPageTestData;
	    String appUrl;
	   
	    
	    public LoginPageAction getLoginPageActions() throws Exception {
	        return new LoginPageAction();
	    }
	    public ProgramDashboardAction getProgramDashboardActions() throws Exception {
	        return new ProgramDashboardAction();
	    }
	    
	    public AdminDashboardAction getAdminDashboardActions() throws Exception {
	        return new AdminDashboardAction();
	    }
	   
	    public String getEnvironmentValue() throws Exception {
	    	return appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
	    }
	    
	    public void switchEnvironment() throws Exception {
	    	if(getEnvironmentValue().contains("preprod") || getEnvironmentValue().contains("prod")) {
	        	getLoginPageActions().clickOnExploreDiksha();
	        }}

	    	
	    	  @Test(description = "login as Admin ")
	    	    @Author(name = "SHREEJITH")
	    	    public void adminDashboard() throws Exception {
	    	        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!H:I");
	    	
	    	        switchEnvironment();
	    	        getLoginPageActions().BMCLSelection();
	    	        Thread.sleep(2000);
	    	        getLoginPageActions().clickOnGuest();
	    	        getLoginPageActions().clickOnLogin();
	    	        getLoginPageActions().enterUserName(loginTestData.get("userName"));
	    	        getLoginPageActions().enterPassword(loginTestData.get("password"));
	    	        //Thread.sleep(2000);
	    	        getLoginPageActions().clickOnLoginButton();
	    	        Thread.sleep(3000);
	    	        
	    	       /* Thread.sleep(10000);
	    	        getLoginPageActions().refreshpage();
	    	        Thread.sleep(5000); */
	    	       
	    	        
	    	        getLoginPageActions().clickOnGuest();
	    	        //getProgramDashboardActions().clickOnProfileIcon();
	    	   
	    	        getAdminDashboardActions().clickOnadmindashboard();
	    	       getAdminDashboardActions().verifyReportsandDatasetsTab();
	    	       getAdminDashboardActions().verifyGlobalSearchfilter();
	    	       
	    	       getAdminDashboardActions().searchAndSelectProjectReports();
	    	        getAdminDashboardActions().verifySelectedReportInTableFormat();
	    	        getAdminDashboardActions().verifyLocalSearchfilter();
	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	        Thread.sleep(10000);
	    	         getAdminDashboardActions().verifyGraphsTab();
	    	        getAdminDashboardActions().selectProjectFilters();
	    	        getAdminDashboardActions().ExportAs();
	    	        getAdminDashboardActions().clickOnBackButton();
	    	        
	    	        getAdminDashboardActions().searchAndSelectObservationReports();
	    	        getAdminDashboardActions().verifySelectedReportInTableFormat();
	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	        getAdminDashboardActions().verifyGraphsTab();
	    	        getAdminDashboardActions().selectObservationFilters();
	    	        getAdminDashboardActions().ExportAs();
	    	        getAdminDashboardActions().clickOnBackButton();
	    	        
	    	        getAdminDashboardActions().searchAndSelectSurveyReports();
	    	        getAdminDashboardActions().verifySelectedReportInTableFormat();
	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	        getAdminDashboardActions().verifyGraphsTab();
	    	        getAdminDashboardActions().selectObservationFilters();
	    	        getAdminDashboardActions().ExportAs();
	    	       
	    	        
	    	  }
	    	  



}
