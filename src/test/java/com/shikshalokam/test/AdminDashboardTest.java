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

	    	
	    	  @Test(description = "-login as Admin ")
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
	    	        getLoginPageActions().clickOnLoginButton();
	    	        
	    	        
	    	        Thread.sleep(10000);
	    	        getLoginPageActions().refreshpage();
	    	        Thread.sleep(5000); 
	    	       
	    	        
	    	        getLoginPageActions().clickOnGuest();
	    	        //getProgramDashboardActions().clickOnProfileIcon();
	    	   
	    	        getAdminDashboardActions().clickOnadmindashboard();
	    	        getAdminDashboardActions().verifyReportsandDatasetsTab();
	    	        getAdminDashboardActions().verifyGlobalSearchfilter();
	    	       
	    	        getAdminDashboardActions().searchAndSelectImprovementsProjectReport();
	    	        getAdminDashboardActions().verifySelectedReportInTableFormat();
	    	        getAdminDashboardActions().verifyLocalSearchfilter();
	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	        Thread.sleep(10000);
	    	        getAdminDashboardActions().verifyGraphsTab();
	    	        getAdminDashboardActions().verifyImprovementProjectsStatusByDistrictTab();
	    	        getAdminDashboardActions().verifyImprovementProjectsStatusByBlockTab();
	    	        getAdminDashboardActions().selectProjectFilters();
	    	        getAdminDashboardActions().ExportAs();
	    	        getAdminDashboardActions().clickOnBackButton();
	    	        
	    	        getAdminDashboardActions().searchAndSelectObservationReport();
	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	        Thread.sleep(10000);
	    	        getAdminDashboardActions().verifyGraphsTab();
	    	        getAdminDashboardActions().verifyDistrictWiseObservationStatusAndEntitiesObservedTab();
	    	        getAdminDashboardActions().verifyBlockWiseObservationStatusAndEntitiesObserved();
	    	        getAdminDashboardActions().selectObservationFilters();
	    	        getAdminDashboardActions().ExportAs();
	    	        getAdminDashboardActions().clickOnBackButton();
	    	        
	    	        getAdminDashboardActions().searchAndSelectObservationWithRubricsReport();
	    	        getAdminDashboardActions().verifySelectedReportInTableFormat();
	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	        getAdminDashboardActions().verifyGraphsTab();
	    	        getAdminDashboardActions().verifyDistrictWiseObservationStatusAndEntitiesObservedTab();
	    	        getAdminDashboardActions().selectObservationFilters();
	    	        getAdminDashboardActions().ExportAs();
	    	        getAdminDashboardActions().clickOnBackButton();
	    	        
	    	        getAdminDashboardActions().searchAndSelectSurveyReport();
	    	        getAdminDashboardActions().verifySelectedReportInTableFormat();
	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	        getAdminDashboardActions().verifyGraphsTab();
	    	        getAdminDashboardActions().selectObservationFilters();
	    	        getAdminDashboardActions().ExportAs();
	    	       
	    	        
	    	  }
	    	  
	    	  //---------------------------------------REG------------------------------------//
	    	  
	    	  @Test(description = "-To verify clicking on Reset button all the previous selected values on the filter should get erased.")
	    	    @Author(name = "SHREEJITH")
	    	    public void resetFiltersButtonAD_REG() throws Exception {
	    	        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!H:I");
	    	
	    	        switchEnvironment();
	    	        getLoginPageActions().BMCLSelection();
	    	        Thread.sleep(2000);
	    	        getLoginPageActions().clickOnGuest();
	    	        getLoginPageActions().clickOnLogin();
	    	        getLoginPageActions().enterUserName(loginTestData.get("userName"));
	    	        getLoginPageActions().enterPassword(loginTestData.get("password"));
	    	        getLoginPageActions().clickOnLoginButton();
	    	        
	    	        
	    	        Thread.sleep(10000);
	    	        getLoginPageActions().refreshpage();
	    	        Thread.sleep(5000); 
	    	       
	    	        
	    	        getLoginPageActions().clickOnGuest();
	    	        getAdminDashboardActions().clickOnadmindashboard();
	    	        getAdminDashboardActions().verifyGlobalSearchfilter();
	    	       
	    	        getAdminDashboardActions().searchAndSelectImprovementsProjectReport();
	    	        getAdminDashboardActions().verifyLocalSearchfilter();
	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	        Thread.sleep(10000);
	    	        getAdminDashboardActions().selectProjectFilters();
	    	        getAdminDashboardActions().clickOnResetFiltersButton();
	    	        getAdminDashboardActions().verifySelectedFiltersAreRemoved();

	    	  }
	    	  
	    	  @Test(description = "-To verify clicking on Page numbers users should be able to see the data on the selected page.")
	    	    @Author(name = "SHREEJITH")
	    	    public void paginationAD_REG() throws Exception {
	    	        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!H:I");
	    	
	    	        switchEnvironment();
	    	        getLoginPageActions().BMCLSelection();
	    	        Thread.sleep(2000);
	    	        getLoginPageActions().clickOnGuest(); 
	    	        getLoginPageActions().clickOnLogin();
	    	        getLoginPageActions().enterUserName(loginTestData.get("userName"));
	    	        getLoginPageActions().enterPassword(loginTestData.get("password"));
	    	        getLoginPageActions().clickOnLoginButton();
	    	        
	    	        
	    	        Thread.sleep(10000);
	    	        getLoginPageActions().refreshpage();
	    	        Thread.sleep(5000); 
	    	       
	    	        
	    	        getLoginPageActions().clickOnGuest();
	    	        getAdminDashboardActions().clickOnadmindashboard();
	    	        getAdminDashboardActions().clickOnPage2();
	    	        getAdminDashboardActions().verifyNavigatedToPage2();
	    	       
	    	  }
	    	  
	    	  @Test(description = "-Verify if district is not selected then user will not be able to select any block in the block filter"
	    	  		+ "  -Verify If a user tries to select block level filter without selecting any district an error message will come up on the screen")
	    	    @Author(name = "SHREEJITH")
	    	    public void errorMessageToSelectDistrictFirstAD_REG() throws Exception {
	    	        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!H:I");
	    	
	    	        switchEnvironment();
	    	        getLoginPageActions().BMCLSelection();
	    	        Thread.sleep(2000);
	    	        getLoginPageActions().clickOnGuest();
	    	        getLoginPageActions().clickOnLogin();
	    	        getLoginPageActions().enterUserName(loginTestData.get("userName"));
	    	        getLoginPageActions().enterPassword(loginTestData.get("password"));
	    	        getLoginPageActions().clickOnLoginButton();
	    	        
	    	        
	    	        Thread.sleep(10000);
	    	        getLoginPageActions().refreshpage();
	    	        Thread.sleep(5000); 
	    	       
	    	        
	    	        getLoginPageActions().clickOnGuest();
	    	        //getProgramDashboardActions().clickOnProfileIcon();
	    	   
	    	        getAdminDashboardActions().clickOnadmindashboard();
	    	       
	    	        getAdminDashboardActions().searchAndSelectImprovementsProjectReport();
	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	        Thread.sleep(10000);
	    	        getAdminDashboardActions().clickOnBlockFilter();
	    	        getAdminDashboardActions().verifyErrorMessageToSelectDistrictFirst();
	    	        getAdminDashboardActions().clickOnBackButton();
	    	        
	    	        getAdminDashboardActions().searchAndSelectImprovementsConsumptionReport();
	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	        Thread.sleep(10000);
	    	        getAdminDashboardActions().clickOnBlockFilter();
	    	        getAdminDashboardActions().verifyErrorMessageToSelectDistrictFirst();
	    	        getAdminDashboardActions().clickOnBackButton();
	    	        
	    	        
	    	        getAdminDashboardActions().searchAndSelectObservationReport();
	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	        Thread.sleep(10000);
	    	        getAdminDashboardActions().clickOnBlockFilter();
	    	        getAdminDashboardActions().verifyErrorMessageToSelectDistrictFirst();
	    	        getAdminDashboardActions().clickOnBackButton();
	    	        
	    	        getAdminDashboardActions().searchAndSelectObservationWithRubricsReport();
	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	        Thread.sleep(10000);
	    	        getAdminDashboardActions().clickOnBlockFilter();
	    	        getAdminDashboardActions().verifyErrorMessageToSelectDistrictFirst();
	    	        getAdminDashboardActions().clickOnBackButton();
	    	       
	    	        getAdminDashboardActions().searchAndSelectObservationConsumptionReport();
	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	        Thread.sleep(10000);
	    	        getAdminDashboardActions().clickOnBlockFilter();
	    	        getAdminDashboardActions().verifyErrorMessageToSelectDistrictFirst();
	    	       
	    	      
	    	  }
	    	  
	    	  @Test(description = "-To verify user is able to type on the search bar."+
		      "    -To verify user is given a list of options and option for the keyword searched." +
	    	  "    -To verify user should be able to select the option from the list relevant to the search."+
		      "    -Verify that when the user chooses any value from any field and checks it from the drop-down list, the chosen field & values are displayed below the filters")
		    
		    	    @Author(name = "SHREEJITH")
		    	    public void searchFromTextFieldAndSelectAD_REG() throws Exception {
		    	        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!H:I");
		    	
		    	        switchEnvironment();
		    	        getLoginPageActions().BMCLSelection();
		    	        Thread.sleep(2000);
		    	        getLoginPageActions().clickOnGuest();
		    	        getLoginPageActions().clickOnLogin();
		    	        getLoginPageActions().enterUserName(loginTestData.get("userName"));
		    	        getLoginPageActions().enterPassword(loginTestData.get("password"));
		    	        getLoginPageActions().clickOnLoginButton();
		    	        
		    	        Thread.sleep(10000);
		    	        getLoginPageActions().refreshpage();
		    	        Thread.sleep(5000); 
		    	       
		    	        
		    	        getLoginPageActions().clickOnGuest();
		    	   
		    	        getAdminDashboardActions().clickOnadmindashboard();
		    	       
		    	        getAdminDashboardActions().searchAndSelectImprovementsProjectReport();
		    	        getAdminDashboardActions().searchAndSelectParameter();
		    	        Thread.sleep(20000);
		    	        getAdminDashboardActions().clickOnProgramFilter();
		    	        getAdminDashboardActions().enterSearchTextIntoSelectProgramFilterAndSelect();
		    	        
		    	        getAdminDashboardActions().clickOnImprovementProjectFilter();
		    	        getAdminDashboardActions().enterSearchTextIntoSelectImprovementProjectFilterAndSelect();
		    	        
		    	        getAdminDashboardActions().clickOnDistrictFilter();
		    	        getAdminDashboardActions().enterSearchTextIntoSelectDistrictFilterAndSelect();
		    	        
		    	        getAdminDashboardActions().clickOnBlockFilter();
		    	        getAdminDashboardActions().enterSearchTextIntoSelectBlockFilterAndSelect();
		    	        
		    	        getAdminDashboardActions().clickOnOrganisationFilter();
		    	        getAdminDashboardActions().enterSearchTextIntoSelectOrganisationFilterAndSelect();
		    	        getAdminDashboardActions().verifySelectedFiltersAreDispalyed();
	    	  }
	    	  
	    	  @Test(description = "- To verify there can be multiple global filters in a report")
	    	    @Author(name = "SHREEJITH")
	    	    public void multipleGlobalFiltersAD_REG() throws Exception {
	    	        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!H:I");
	    	
	    	        switchEnvironment();
	    	        getLoginPageActions().BMCLSelection();
	    	        Thread.sleep(2000);
	    	        getLoginPageActions().clickOnGuest();
	    	        getLoginPageActions().clickOnLogin();
	    	        getLoginPageActions().enterUserName(loginTestData.get("userName"));
	    	        getLoginPageActions().enterPassword(loginTestData.get("password"));
	    	        getLoginPageActions().clickOnLoginButton();
	    	        
	    	        Thread.sleep(10000);
	    	        getLoginPageActions().refreshpage();
	    	        Thread.sleep(5000); 
	    	        
	    	        getLoginPageActions().clickOnGuest();
	    	   
	    	        getAdminDashboardActions().clickOnadmindashboard();
	    	        getAdminDashboardActions().searchAndSelectImprovementsProjectReport();
	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	        Thread.sleep(10000);
	    	        getAdminDashboardActions().verifyMultipleGlobalFilters();
	    	  }
	    	  
	    	  @Test(description = "-To verify new added table chart on admin dashboard and Program dashboard called \"Observation with rubric report\" in the existing report "+
	    	  "    -To verify new added table chart on admin dashboard and Program dashboard called \"Observation with rubric report\" in the existing report ")
	    	    @Author(name = "SHREEJITH")
	    	    public void districtWiseObservationStatusAndEntitiesObservedTabColumnsAD_REG() throws Exception {
	    	        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!H:I");
	  	
	    	        switchEnvironment();
	    	        getLoginPageActions().BMCLSelection();
	    	        Thread.sleep(2000);
	    	        getLoginPageActions().clickOnGuest();
	    	        getLoginPageActions().clickOnLogin();
	    	        getLoginPageActions().enterUserName(loginTestData.get("userName"));
	    	        getLoginPageActions().enterPassword(loginTestData.get("password"));
	    	        getLoginPageActions().clickOnLoginButton();
	    	        
	    	        Thread.sleep(10000);
	    	        getLoginPageActions().refreshpage();
	    	        Thread.sleep(5000); 
	    	       
	    	        getLoginPageActions().clickOnGuest();
	    	   
	    	        getAdminDashboardActions().clickOnadmindashboard();
	    	        getAdminDashboardActions().searchAndSelectObservationWithRubricsReport();
	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	        getAdminDashboardActions().verifyDistrictWiseObservationStatusAndEntitiesObservedTab();
	    	        getAdminDashboardActions().clickOnDistrictWiseObservationStatusAndEntitiesObservedTab();
	    	        getAdminDashboardActions().verifyObservationWithRubricTableColumnsOfDistrictWiseObservationStatusAndEntitiesObservedTab();
	    	        
	    	  }
	    	  
	    	  @Test(description = "-To verify, User is able to see In progress projects with evidence column for Improvement project report in Admin dashboard"+
	    	  " -To verify, User is able to see Submitted Projects with evidence column for Improvement project report in Admin dashboard")
	    	    @Author(name = "SHREEJITH")
	    	    public void improvementProjectsStatusByDistrictTabTablesColumnsAD_REG() throws Exception {
	    	        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!H:I");
	  	
	    	        switchEnvironment();
	    	        getLoginPageActions().BMCLSelection();
	    	        Thread.sleep(2000);
	    	        getLoginPageActions().clickOnGuest();
	    	        getLoginPageActions().clickOnLogin();
	    	        getLoginPageActions().enterUserName(loginTestData.get("userName"));
	    	        getLoginPageActions().enterPassword(loginTestData.get("password"));
	    	        getLoginPageActions().clickOnLoginButton();
	    	        
	    	        Thread.sleep(10000);
	    	        getLoginPageActions().refreshpage();
	    	        Thread.sleep(5000); 
	    	       
	    	        getLoginPageActions().clickOnGuest();
	    	   
	    	        getAdminDashboardActions().clickOnadmindashboard();
	    	        getAdminDashboardActions().searchAndSelectImprovementsProjectReport();
	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	        getAdminDashboardActions().verifyImprovementProjectsStatusByDistrictTab();
	    	        getAdminDashboardActions().clickOnimprovementProjectsStatusByDistrictTab();
	    	        getAdminDashboardActions().verifyimprovementProjectsStatusByDistrictTabTablesColumns();
	    	        
	    	  }
	    	  
	    	  @Test(description = "-To verify , user is able to view the respective global filters for the Block-wise observation status and entities observed by block as mentioned." +
	    	  "- Verify the data that represented on the UI is in tabular form." +
	    	  "- To Verify, user is able to view the respective columns in the tabular report .")
	    	    	    @Author(name = "SHREEJITH")
	    	    	    public void blockWiseObservationStatusAndEntitiesOobservedTabTablesColumnsAD_REG() throws Exception {
	    	    	        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!H:I");
	    	  	
	    	    	        switchEnvironment();
	    	    	        getLoginPageActions().BMCLSelection();
	    	    	        Thread.sleep(2000);
	    	    	        getLoginPageActions().clickOnGuest();
	    	    	        getLoginPageActions().clickOnLogin();
	    	    	        getLoginPageActions().enterUserName(loginTestData.get("userName"));
	    	    	        getLoginPageActions().enterPassword(loginTestData.get("password"));
	    	    	        getLoginPageActions().clickOnLoginButton();
	    	    	        
	    	    	        Thread.sleep(10000);
	    	    	        getLoginPageActions().refreshpage();
	    	    	        Thread.sleep(5000); 
	    	    	       
	    	    	        getLoginPageActions().clickOnGuest();
	    	    	   
	    	    	        getAdminDashboardActions().clickOnadmindashboard();
	    	    	        getAdminDashboardActions().searchAndSelectObservationReport();
	    	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	    	        Thread.sleep(10000);
	    	    	        getAdminDashboardActions().verifyBlockWiseObservationStatusAndEntitiesObserved();
	    	    	        getAdminDashboardActions().clickOnBlockWiseObservationStatusAndEntitiesObservedTab();
	    	    	        getAdminDashboardActions().verifyBlockWiseObservationStatusAndEntitiesObservedTabFilters();
	    	    	        getAdminDashboardActions().verifyObservationReportTableColumnsOfBlockWiseObservationStatusAndEntitiesObservedTab();

	    	    	        	    	    	        
	    	    	  }

}
