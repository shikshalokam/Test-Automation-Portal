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
import com.shikshalokam.utils.logger.Logger;
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
    	if(getEnvironmentValue().contains("preprod") || getEnvironmentValue().contains("diksha")) {
        	getLoginPageActions().clickOnExploreDiksha();
        }
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
         Thread.sleep(10000);
         getLoginPageActions().refreshpage();
         Thread.sleep(5000);  
       
        getObservationPageActions().clickOnObservationButton();
        getLoginPageActions().clickOnProfileIcon1();
        getReportPageActions().clickOnMyReportsTab();
        getReportPageActions().verifyMyReportsTitle();
        getReportPageActions().verifyEntityFilterOption();
        getReportPageActions().verifyMyReportInTableFormat();
        getReportPageActions().clickOnqaSolutionEntityTypeBlockParentChildFD345Report();
        getReportPageActions().verifyQuestionTabInReport();
        getReportPageActions().verifyCriteriaTabInReport();
        getReportPageActions().verifyFiltersButtonInReport();
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
        Thread.sleep(10000);
        getLoginPageActions().refreshpage();
        Thread.sleep(5000);  
       
      
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
   
    //..................................REG..............................................//
    
    @Test(description = "-To verify user should be able to view 'My Reports' section, along with the list of other sections when clicked on user icon on top right corner of the screen.")
    @Author(name = "SHREEJITH")
    public void myReportsSection_REG() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        
       //using refreshpage due to blank screen showing up after login 
        Thread.sleep(10000);
        getLoginPageActions().refreshpage();
        Thread.sleep(5000);  
      
        getLoginPageActions().clickOnProfileIcon1();
        getReportPageActions().verifyMyReportsSection();
    }
    
    @Test(description = "-To verify user sees names of the observations that were submitted under the column 'title'." +
    "-To verify user sees the 'name of the program' under the name of observation in the table.")
    @Author(name = "SHREEJITH")
    public void programAndObservationNameOfSubmittedObservationSection_REG() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        
       //using refreshpage due to blank screen showing up after login 
        Thread.sleep(10000);
        getLoginPageActions().refreshpage();
        Thread.sleep(5000);  
      
        getLoginPageActions().clickOnProfileIcon1();
        getReportPageActions().clickOnMyReportsTab();
        getReportPageActions().verifySubmittedObservationName();
        getReportPageActions().verifyProgramNameOfSubmittedObservation();
       
    }
    
            @Test(description = "-To verify when a user clicks on an observation form from the table, user is re-directed to entity listing pop-up screen." +
    	    "-To verify user can select an entity from the entity listing page for which the observation was submitted"+
    		"-To verify when user clicks on 'Submit' button the user is re-directed to reports page."+
    	    "-To verify when reports page open user sees the 'Observation Name',  'Last Submission date' and 'Entity Name' on reports.")
    	    @Author(name = "SHREEJITH")
    	    public void entityListingPopup_REG() throws Exception {
    	        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
    	        switchEnvironment();
    	        getLoginPageActions().BMCLSelection();
    	        getLoginPageActions().clickOnGuest();
    	        getLoginPageActions().clickOnLogin();
    	        getLoginPageActions().enterUserName(loginTestData.get("reportuser"));
    	        getLoginPageActions().enterPassword(loginTestData.get("reportuserPassword"));
    	        getLoginPageActions().clickOnLoginButton();
    	        
    	       //using refreshpage due to blank screen showing up after login 
    	        Thread.sleep(10000);
    	        getLoginPageActions().refreshpage();
    	        Thread.sleep(5000);  
    	      
    	        getLoginPageActions().clickOnProfileIcon1();
    	        getReportPageActions().clickOnMyReportsTab();
    	        getReportPageActions().selectObservationWithRubricReport();
    	        getReportPageActions().verifyEntityListingPopup();
    	        getReportPageActions().verifyContentsOfEntityListingPopup();
    	        getReportPageActions().selectFirstEntity();
    	        getReportPageActions().verifySubmitGotEnabled();
    	        getReportPageActions().clickOnSubmitButton();
    	        getReportPageActions().verifyRedirectedToReportPage();
    }
            
            @Test(description = "To verify when users click on dropdown filter 'Select Submission', then user sees list of submissions for the form.")
            @Author(name = "SHREEJITH")
            public void listOfSubmissions_REG() throws Exception {
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
                 Thread.sleep(10000);
                 getLoginPageActions().refreshpage();
                 Thread.sleep(5000);  
               
                getObservationPageActions().clickOnObservationButton();
                getLoginPageActions().clickOnProfileIcon1();
                getReportPageActions().clickOnMyReportsTab();
                getReportPageActions().verifyMyReportsTitle();
                getReportPageActions().verifyEntityFilterOption();
                getReportPageActions().verifyMyReportInTableFormat();
                getReportPageActions().clickOnqaSolutionEntityTypeBlockParentChildFD345Report();
                getReportPageActions().verifySelectSubmissionDropdown();
                getReportPageActions().clickOnSelectSubmissionDropdown();
                getReportPageActions().verifylistOfSubmissions();
    
            }
            
            @Test(description = "-To verify user sees two buttons on the right side of screen below in questions tab.1) Fliter 2) Export "+
           "-To verify user sees two buttons on the right side of screen below in criteria tab. 1) Fliter 2) Export As " )
            @Author(name = "SHREEJITH")
            public void filtersAndExportsButtonAcrossTabs_REG() throws Exception {
                loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
                switchEnvironment();
                getLoginPageActions().BMCLSelection();
                getLoginPageActions().clickOnGuest();
                getLoginPageActions().clickOnLogin();
                getLoginPageActions().enterUserName(loginTestData.get("userName"));
                getLoginPageActions().enterPassword(loginTestData.get("password"));
                getLoginPageActions().clickOnLoginButton();
                 
                //using refreshpage due to blank screen showing up after login 
                 Thread.sleep(10000);
                 getLoginPageActions().refreshpage();
                 Thread.sleep(5000);  
               
                getObservationPageActions().clickOnObservationButton();
                getLoginPageActions().clickOnProfileIcon1();
                getReportPageActions().clickOnMyReportsTab();
                getReportPageActions().clickOnqaSolutionEntityTypeBlockParentChildFD345Report();
                getReportPageActions().verifyFiltersButtonInReport();
                getReportPageActions().verifyExportAsButtonInReport();
                Logger.logAndReportPass("Filters and Export button is displayed on Question Page");
                getReportPageActions().clickOnCriteriaTab();
                getReportPageActions().verifyFiltersButtonInReport();
                getReportPageActions().verifyExportAsButtonInReport();
                Logger.logAndReportPass("Filters and Export button is displayed on Criteria Page");
                
           
            }
            
            @Test(description = "-To verify a pop-up window for selecting the questions appears when user is on question tab and clicks on filter option "+
           "-To verify if user clicks on the cross button on the pop-up window of question filter, the user should be re-directed back to the reports page." +
           "-To verify the user sees the criteria wise report of observation without rubric when Criteria tab is selected."+
           "-To verify a pop-up window for selecting the criteria names appears, when user clicks on 'Filter' option in the criteria tab."+
           "-To verify if user clicks on the cross button on pop-up window on criteria filter, the user should be re-directed back to the reports page.")
            @Author(name = "SHREEJITH")
            public void filtersPopup_REG() throws Exception {
                loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
                appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
                switchEnvironment();
                getLoginPageActions().BMCLSelection();
                getLoginPageActions().clickOnGuest();
                getLoginPageActions().clickOnLogin();
                getLoginPageActions().enterUserName(loginTestData.get("profileCredentials"));
                getLoginPageActions().enterPassword(loginTestData.get("profileCredentialsPassword"));
                getLoginPageActions().clickOnLoginButton();
                 
                //using refreshpage due to blank screen showing up after login 
                 Thread.sleep(10000);
                 getLoginPageActions().refreshpage();
                 Thread.sleep(5000);  
               
                getObservationPageActions().clickOnObservationButton();
                getLoginPageActions().clickOnProfileIcon1();
                getReportPageActions().clickOnMyReportsTab();
                
                getReportPageActions().selectSolutionWithoutRubricsFileButtonFD429Report();
                getReportPageActions().verifyFiltersButtonInReport();
                getReportPageActions().clickOnFiltersButton();
                
                getReportPageActions().verifyQuestionsTabFiltersPopup();
                getReportPageActions().verifyContentsOfQuestionsTabFiltersPopup();
                getReportPageActions().clickOnCrossButton();
                getReportPageActions().verifyRedirectedToReportPage();
                
                getReportPageActions().clickOnCriteriaTab();
                Thread.sleep(2000);
                getReportPageActions().verifyFiltersButtonInReport();
                getReportPageActions().clickOnFiltersButton();
                
                getReportPageActions().verifyCriteriaFiltersPopup();
                getReportPageActions().verifyContentsCriteriaOfTabFiltersPopup();
                getReportPageActions().clickOnCrossButton();
                getReportPageActions().verifyRedirectedToReportPage();
                
                
                
           
            }
            
            @Test(description = "-To verify when user clicks on an observation (observed for only single entity), user must be re-directed to reports page directly")
            @Author(name = "SHREEJITH")
            public void redirectedToReportsPage_REG() throws Exception {
                loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
                switchEnvironment();
                getLoginPageActions().BMCLSelection();
                getLoginPageActions().clickOnGuest();
                getLoginPageActions().clickOnLogin();
                getLoginPageActions().enterUserName(loginTestData.get("userName"));
                getLoginPageActions().enterPassword(loginTestData.get("password"));
                getLoginPageActions().clickOnLoginButton();
                 
                //using refreshpage due to blank screen showing up after login 
                 Thread.sleep(10000);
                 getLoginPageActions().refreshpage();
                 Thread.sleep(5000);  
               
                getObservationPageActions().clickOnObservationButton();
                getLoginPageActions().clickOnProfileIcon1();
                getReportPageActions().clickOnMyReportsTab();
                getReportPageActions().clickOnqaSolutionEntityTypeBlockParentChildFD345Report();
                getReportPageActions().verifyRedirectedToReportPage();
            }
            
            @Test(description = "-To verify when user comes up on 'Reports' page on portal, user should see back button on report screen.")
            @Author(name = "SHREEJITH")
            public void backButtonOnReportsPage_REG() throws Exception {
                loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
                switchEnvironment();
                getLoginPageActions().BMCLSelection();
                getLoginPageActions().clickOnGuest();
                getLoginPageActions().clickOnLogin();
                getLoginPageActions().enterUserName(loginTestData.get("userName"));
                getLoginPageActions().enterPassword(loginTestData.get("password"));
                getLoginPageActions().clickOnLoginButton();
                 
                //using refreshpage due to blank screen showing up after login 
                 Thread.sleep(10000);
                 getLoginPageActions().refreshpage();
                 Thread.sleep(5000);  
               
                getObservationPageActions().clickOnObservationButton();
                getLoginPageActions().clickOnProfileIcon1();
                getReportPageActions().clickOnMyReportsTab();
                getLoginPageActions().clickOnBackbutton();
                getLoginPageActions().verifyHomeButton();
                Logger.logAndReportPass("Redirected back to Previous Page");
            }
            
           
            @Test(description = "-To verify the table consists of 3 columns with following headings:"
            		+ "1) Serial Number"
            		+ "2) Title"
            		+ "3) Latest Submission")
            @Author(name = "SHREEJITH")
            public void reportsTableColumns_REG() throws Exception {
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
                 Thread.sleep(10000);
                 getLoginPageActions().refreshpage();
                 Thread.sleep(5000);  
               
                getObservationPageActions().clickOnObservationButton();
                getLoginPageActions().clickOnProfileIcon1();
                getReportPageActions().clickOnMyReportsTab();
                getReportPageActions().verifyMyReportInTableFormat();
            }
            
            @Test(description = "To verify user should be able to view a table which shows the list of Observation submissions made.")
            @Author(name = "SHREEJITH")
            public void observationsUnderTitleColumn_REG() throws Exception {
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
                 Thread.sleep(10000);
                 getLoginPageActions().refreshpage();
                 Thread.sleep(5000);  
               
                getObservationPageActions().clickOnObservationButton();
                getLoginPageActions().clickOnProfileIcon1();
                getReportPageActions().clickOnMyReportsTab();
                getReportPageActions().verifyMyReportInTableFormat();
                getReportPageActions().verifySubmittedObservationsUnderTitleColumn();
            }
            
            @Test(description = "To verify when user selects any other role like 'Parent', 'Student', then user should not be able to view 'My Reports' section when clicked on user icon on top right corner of the screen.")
            @Author(name = "SHREEJITH")
            public void myReportsSectionsNotavailable_REG() throws Exception {
                loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
                appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
                switchEnvironment();
                getLoginPageActions().BMCLSelection();
                getLoginPageActions().clickOnGuest();
                getLoginPageActions().clickOnLogin();
                getLoginPageActions().enterUserName(loginTestData.get("otherpersona"));
                getLoginPageActions().enterPassword(loginTestData.get("otherpersonaPwd"));
                getLoginPageActions().clickOnLoginButton();
                 
                //using refreshpage due to blank screen showing up after login 
                 Thread.sleep(10000);
                 getLoginPageActions().refreshpage();
                 Thread.sleep(5000);  
                 
                 getLoginPageActions().clickOnGuest();
                 getLoginPageActions().selectProfile();
                 getLoginPageActions().clickOnEdit();
                 getLoginPageActions().clickOnSelectroleDropdown();
                 getLoginPageActions().selectStudentOnProfile();
                 getLoginPageActions().clickOnSubmitButton();
                 Thread.sleep(5000);
                 getLoginPageActions().clickOnGuest();
                 getReportPageActions().verifyMyReportsSectionNotAvailable();
                 getLoginPageActions().selectProfile();
                 getLoginPageActions().clickOnEdit();
                 getLoginPageActions().clickOnSelectroleDropdown();
                 getLoginPageActions().selectParentOnProfile();
                 getLoginPageActions().clickOnSubmitButton();
                 Thread.sleep(5000);
                 getLoginPageActions().clickOnGuest();
                 getReportPageActions().verifyMyReportsSectionNotAvailable();
                 

            }
               
            
            
    
}
