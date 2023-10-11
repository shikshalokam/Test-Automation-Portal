package com.shikshalokam.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.Map;

import org.testng.annotations.Test;

import com.shikshalokam.annotation.Author;
import com.shikshalokam.pages.actions.LoginPageAction;
import com.shikshalokam.pages.actions.ObservationPageAction;
import com.shikshalokam.pages.actions.ProgramDashboardAction;
import com.shikshalokam.pages.actions.ReportPageAction;
import com.shikshalokam.pages.objects.LoginPageObjects;
import com.shikshalokam.pages.objects.ObservationPageObjects;
import com.shikshalokam.utils.gSheet.TestData;
import com.shikshalokam.utils.prop.PropUtlis;

public class ObservationPageTest {

	Map<String, String> loginTestData;
    Map<String, String> observationPageTestData;
    String appUrl;
    public LoginPageAction getLoginPageActions() throws Exception {
        return new LoginPageAction();
    }
    
    public ObservationPageAction getObservationPageActions() throws Exception {
        return new ObservationPageAction();
    }
    public ProgramDashboardAction getProgramDashboardActions() throws Exception {
        return new ProgramDashboardAction();
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
    	
    	public void switchEnvironmentforHomeButton() throws Exception {
        	if(getEnvironmentValue().contains("preprod") || getEnvironmentValue().contains("prod")) {
            	getLoginPageActions().clickOnHomeButton();
            }
    }
  
    
    
    
    @Test(description = "login as HT official and verify observation tile")
    @Author(name = "Manjunatha K")
    public void htLoginAndVerifyObservationTile() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        //getLoginPageActions().clickOnExploreDiksha();
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
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        Thread.sleep(5000);
        getObservationPageActions().verifyObservationTitle();
        getLoginPageActions().enterNameToSearchbox(observationPageTestData.get("observatonForVerifyObservationTile"));
        Thread.sleep(5000);
        getLoginPageActions().clickOnSerachButton();
        getObservationPageActions().clickOnObservationButton();
        
      //  getLoginPageActions().clickOnSearchedObservationTitle();
        getObservationPageActions().clickOnObservationWithRub_SliderWithScore();
        getObservationPageActions().clickOnEntityDeleteOption();
        getObservationPageActions().clickOnEntityDeleteConfirmationYes();
        getObservationPageActions().clickOnAddSchoolButton();
        getObservationPageActions().selectFirstEntityAsSchool();
        //getObservationPageActions().selectHanumanahallyEntityAsSchool();
        getObservationPageActions().clickOnSubmitButtonOnAddEntityWindow();
        getObservationPageActions().selectAddedEntity();
        
        getObservationPageActions().clickOnObserveAgainButton();
        getObservationPageActions().clickOnObserveAgainYesConfirmation();
        getObservationPageActions().verifyObservation1TitleWithRubric();
        getObservationPageActions().clickOnObservation1TitleWithRubric();
        getObservationPageActions().verifyStartButtonFromObservation();
        getObservationPageActions().clickOnThreeDotEllipseOnObservation();
        getObservationPageActions().clickOnDeleteOptionFromThreeDotObservation();
        getObservationPageActions().clickOnYesConfirmationForObservationDelete();
        getObservationPageActions().clickOnBackButton();
        Thread.sleep(3000);
        getObservationPageActions().verifyObservationTitle();
        /*
        getObservationPageActions().clickOnObservationWithRub_SliderWithScore();
        getObservationPageActions().verifyThrashSymbolForEntityDelete(); */
        
    }
    
    @Test(description = "save and submit observation")
    @Author(name = "Manjunatha K")
    public void htLoginSaveAndSubmitObsForm() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        //getLoginPageActions().clickOnExploreDiksha();
        appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
        if(appUrl.contentEquals("https://preprod.ntp.net.in/"))
        {
        	getLoginPageActions().clickOnExploreDiksha();
        }
        getLoginPageActions().BMCLSelection();
       /* getLoginPageActions().selectRoleHTAndOffical();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnBoardDropDown();
        getLoginPageActions().selectcbseOrNcertBoardOption();
        getLoginPageActions().verifySubmitButtonEnabled();
        Thread.sleep(5000);
        getLoginPageActions().clickOnSubmitButtonOnLocationWindow(); */
        Thread.sleep(5000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        
        //using refreshpage due to blank screen showing up after login 
        /* Thread.sleep(10000);
         getLoginPageActions().refreshpage();
         Thread.sleep(5000);  */
        
        
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        Thread.sleep(5000);
        getObservationPageActions().verifyObservationTitle();
        getObservationPageActions().clickOnObservationParentChild();
        getObservationPageActions().clickOnObserveAgainButton();
        getObservationPageActions().verifyObserveAgainPopupTitle();
        getObservationPageActions().clickOnObserveAgainYesConfirmation();
       // getObservationPageActions().clickOnObservation1();
        getObservationPageActions().clickOnStartButtonOnObservation();
        getObservationPageActions().verifyParent1QuestionTitle();
        getObservationPageActions().clickOnParent1QuestionFirstAnswer();
        getObservationPageActions().verifyParent1Child1QuestionTitle();
        getObservationPageActions().clickOnParent1Child1QuestionFirstAnswer();
        getObservationPageActions().verifyParent2QuestionTitle();
        getObservationPageActions().clickOnParent2QuestionSecondAnswer();
        getObservationPageActions().verifyParent2Child2QuestionTitle();
        getObservationPageActions().clickOnParent2Child2QuestionSecondAnswer();
        getObservationPageActions().verifyparent3QuestionTitle();
        getObservationPageActions().clickOnParent3QuestionFirstAnswer();
        getObservationPageActions().verifyParent3Child1QuestionTitle();
        getObservationPageActions().clickOnParent3Child1FirstAnswer();
        
        getObservationPageActions().clickOnSaveObservationForm();
        getObservationPageActions().clickOnSaveFormConirmationYes();
        getObservationPageActions().verifyFormSaveSuccessMsg(observationPageTestData.get("observationFormSaveSuccessMsg"));
        getObservationPageActions().clickOnContinueButtonOnSaveObservationForm();
        getObservationPageActions().clickOnSubmitButtonOnObservationSaveForm();
        getObservationPageActions().clickOnYesForSubmitFormConfirmation();
        getObservationPageActions().verifyFormSubmitSuccessMsg(observationPageTestData.get("observationFormSubmitSuccessMsg"));
        
        //for report tab
        //getObservationPageActions().clickOnOkButtonOnSubmitFormSuccess();
        //getLoginPageActions().clickOnProfileIcon();
        //getReportPageActions().clickOnMyReportsTab();
    }
    
    
    //####new tc's
    @Test(description = "To verify school enitity is not added by deafault")
    @Author(name = "SHREEJITH")
    public void schoolandBlockEntityNotAddedBydefault() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!F:G");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        switchEnvironment();
        
        getLoginPageActions().BMCLSelection();
        Thread.sleep(5000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        Thread.sleep(2000);
        getProgramDashboardActions().clickOnProfileIcon();
        getLoginPageActions().selectProfile();
        getLoginPageActions().clickOnEdit();
        Thread.sleep(2000);
        getLoginPageActions().clickOnClear();
        Thread.sleep(2000);
        getLoginPageActions().selectState();
        getLoginPageActions().selectDistrict(); 
        Thread.sleep(2000);
       // getLoginPageActions().clickOnSelectSubrole();
        //getLoginPageActions().selectDeo();
        //Thread.sleep(2000);  
       getLoginPageActions().verifyAndClickOnSubmitButtonOnPersonaldetailspage();
        getLoginPageActions().clickOnBackbutton();
        
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        Thread.sleep(2000);
        getObservationPageActions().selectSchoolEntityobservation();
        getObservationPageActions().verifySchoolentityisnotadded();
        getLoginPageActions().clickOnBackbutton();
        getObservationPageActions().selectBlockEntityobservation();
        getObservationPageActions().verifyBlockentityisnotadded();
        
        getProgramDashboardActions().clickOnProfileIcon();
        getLoginPageActions().selectProfile();
        getLoginPageActions().clickOnEdit();
        Thread.sleep(2000);
        getLoginPageActions().selectBlock();
        
        getLoginPageActions().verifyAndClickOnSubmitButtonOnPersonaldetailspage();
        getLoginPageActions().clickOnBackbutton();      
        
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        
        //Thread.sleep(2000);
       getObservationPageActions().selectSchoolEntityobservation();  
        getObservationPageActions().verifySchoolentityisnotadded(); 
             
}
    
    @Test(description = "To verify Credits and License Dropdown")
    @Author(name = "SHREEJITH")
    public void verifyCreditsAndLicenseDropdown() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!F:G");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        switchEnvironment();
        
        getLoginPageActions().BMCLSelection();
        Thread.sleep(5000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        Thread.sleep(2000);
        
        //using refreshpage due to blank screen showing up after login 
        /* Thread.sleep(10000);
         getLoginPageActions().refreshpage();
         Thread.sleep(5000);  */
        
        
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        
        getObservationPageActions().selectCreditAndLicenceobservation();
        //Thread.sleep(2000);
        getObservationPageActions().clickOnCreditAndLicencedropdown();
        getObservationPageActions().verifyCreditsandLicensecontents();
        getObservationPageActions().VerifyCreditsPopup();
    
    }

    @Test(description = "Login as Teacher and Verify Observation Tile and Observation Details page")
    @Author(name = "SHREEJITH")
    public void teacherLoginVerifyObservationTileAndSaveSubmitObsForm() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        Thread.sleep(3000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("TeacheruserName"));
        getLoginPageActions().enterPassword(loginTestData.get("Teacherpassword"));
        getLoginPageActions().clickOnLoginButton();
        
        //using refreshpage due to blank screen showing up after login 
         Thread.sleep(10000);
         getLoginPageActions().refreshpage();
         Thread.sleep(5000);  
        
        
        switchEnvironmentforHomeButton();
        getObservationPageActions().verifyBrowseOtherCategories();
        getObservationPageActions().verifyObservationTileunderBrowseOtherCategories();
        getObservationPageActions().clickOnObservationTileunderBrowseOtherCategories();
        //verifying Observation With Rubric Multiple Submission
        getObservationPageActions().clickOnObservationWithRubricMultipleSubmission();
        getObservationPageActions().verifyObservationDetailsPageForWithRubricmultipleSubmission();
        getObservationPageActions().saveAndSubmitObservationWithRubricMultipleSubmission();
     
        getObservationPageActions().clickOnBackButton();  
        //verifying Observation Without Rubric 
        getObservationPageActions().clickOnObservationWithoutRubric();
        //getObservationPageActions().verifyObservationDetailsPageForWithoutRubricmultipleSubmission();
        getObservationPageActions().saveAndSubmitObservationWithoutRubric();
       
        getObservationPageActions().clickOnBackButton(); 
        //verifying Observation With Rubric Single Submission
        getObservationPageActions().clickOnObservationWithRubricSingleSubmission();
        getObservationPageActions().verifyObservationDetailsPageForSingleSubmission();  
        
        

    }

    @Test(description = "Login as Ht & Officials to verify Join Program and PII Pop up")
    @Author(name = "SHREEJITH")
    public void joinProgramAndVerifyingPIIpopupFromObservationTab() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!L:M");
       // observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        Thread.sleep(3000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("NewUserName"));
        getLoginPageActions().enterPassword(loginTestData.get("Newpassword"));
        getLoginPageActions().clickOnLoginButton();
        
        //using refreshpage due to blank screen showing up after login 
         Thread.sleep(10000);
         getLoginPageActions().refreshpage();
         Thread.sleep(5000);  
        
        switchEnvironmentforHomeButton();
        
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        Thread.sleep(3000);
        getObservationPageActions().verifyObservationTitle();
       getObservationPageActions().clickOnObservationWithoutRubric2();         //Solution:  Without rubrics 2
        getObservationPageActions().verifyJoinProgramButton();
        getObservationPageActions().clickOnJoinProgramButton();
        getObservationPageActions().verifyPiiPopup();
        getObservationPageActions().verifyPiiPopupContents();
        getLoginPageActions().browserBackButton();
        getObservationPageActions().clickOnObservationWithoutRubric2();           //Solution: Without rubrics 2
        getObservationPageActions().verifyPiiPopup();
        getObservationPageActions().checkTheCheckBox();
        getObservationPageActions().verifyshareButtonGotEnabled();
        getObservationPageActions().clickOnShareButton();
        getObservationPageActions().verifyUserIsAbleToConsumeObservation();
        getObservationPageActions().clickOnBackButton(); 
       Thread.sleep(2000);
        getObservationPageActions().clickOnObservation2();                              //Solution: Observation 2
        getObservationPageActions().clickOnAddSchoolButton();
        getObservationPageActions().verifyJoinProgramPopup();
        getObservationPageActions().verifyJoinProgramPopupContents();
        getObservationPageActions().clickOnCloseButtonOnPopup();
        Thread.sleep(2000);
        getObservationPageActions().clickOnObserveAgainButton();
        getObservationPageActions().verifyJoinProgramPopup();
        getObservationPageActions().verifyJoinProgramPopupContents();
        getObservationPageActions().clickOnJoinProgramButtonOnPopup();
        getObservationPageActions().verifyPiiPopup();
        getObservationPageActions().verifyPiiPopupContents();
        getObservationPageActions().checkTheCheckBox();
        getObservationPageActions().verifyshareButtonGotEnabled();
        getObservationPageActions().clickOnShareButton();
        getObservationPageActions().verifyUserIsAbleToConsumeObservation();
        //
          
    }
    
    
    @Test(description = "Login as Teacher to verify Join Program and PII Pop up")
    @Author(name = "SHREEJITH")
    public void teacherLoginJoinProgramAndVerifyingPIIpopupFromObservationTab() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!L:M");
       
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        Thread.sleep(3000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("TeacherNewUserName"));
        getLoginPageActions().enterPassword(loginTestData.get("TeacherNewpassword"));
        getLoginPageActions().clickOnLoginButton();
        
        //using refreshpage due to blank screen showing up after login 
         Thread.sleep(10000);
         getLoginPageActions().refreshpage();
         Thread.sleep(5000);  
        
        
        switchEnvironmentforHomeButton();
        getObservationPageActions().clickOnObservationTileunderBrowseOtherCategories();
        Thread.sleep(3000);
        getObservationPageActions().verifyObservationTitle();
       getObservationPageActions().clickOnObservationWithoutRubricTeacher();   ////Solution:  Observation Without Rubric Teacher
        getObservationPageActions().verifyJoinProgramButton();
        getObservationPageActions().clickOnJoinProgramButton();
        getObservationPageActions().verifyPiiPopup();
        getObservationPageActions().verifyPiiPopupContents();
        getLoginPageActions().browserBackButton();
        getObservationPageActions().clickOnObservationWithoutRubricTeacher();   //Solution:  Observation Without Rubric Teacher
        getObservationPageActions().verifyPiiPopup(); 
        getObservationPageActions().checkTheCheckBox();
        getObservationPageActions().verifyshareButtonGotEnabled();
        getObservationPageActions().clickOnShareButton();
        getObservationPageActions().verifyUserIsAbleToConsumeObservation();
        getObservationPageActions().clickOnBackButton(); 
       Thread.sleep(2000);
        getObservationPageActions().clickOnObservation2();    //Solution: Observation 2
        getObservationPageActions().clickOnAddSchoolButton();
        getObservationPageActions().verifyJoinProgramPopup();
        getObservationPageActions().verifyJoinProgramPopupContents();
        getObservationPageActions().clickOnCloseButtonOnPopup();
        Thread.sleep(2000);
        getObservationPageActions().clickOnObserveAgainButton();
        getObservationPageActions().verifyJoinProgramPopup();
        getObservationPageActions().verifyJoinProgramPopupContents();
        getObservationPageActions().clickOnJoinProgramButtonOnPopup();
        getObservationPageActions().verifyPiiPopup();
        getObservationPageActions().verifyPiiPopupContents();
        getObservationPageActions().checkTheCheckBox();
        getObservationPageActions().verifyshareButtonGotEnabled();
        getObservationPageActions().clickOnShareButton();
        getObservationPageActions().verifyUserIsAbleToConsumeObservation();

}
    
    //..................................REG..............................................//
    
    @Test(description = "To verify observation tab disappears if user changes to any other role from HT & official role from profile")
    @Author(name = "GAGAN")
    public void otherPersonasObservationtabNotAvailable_REG() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        Thread.sleep(3000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("profileCredentials"));
        getLoginPageActions().enterPassword(loginTestData.get("profileCredentialsPassword"));
        getLoginPageActions().clickOnLoginButton();
      
        Thread.sleep(10000);
        getLoginPageActions().refreshpage();
        Thread.sleep(10000);
       
        //Teacher
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().selectProfile();
        getLoginPageActions().clickOnEdit();
        Thread.sleep(2000);
        getLoginPageActions().clickOnSelectroleDropdown();
        getLoginPageActions().selectTeacherOnProfile();
        getLoginPageActions().verifyAndClickOnSubmitButtonOnPersonaldetailspage();
        getLoginPageActions().clickOnBackbutton();
        getObservationPageActions().verifyNoObservationTab();
        //student
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().selectProfile();
        getLoginPageActions().clickOnEdit();
        Thread.sleep(2000);
        getLoginPageActions().clickOnSelectroleDropdown();
        getLoginPageActions().selectStudentOnProfile();
        getLoginPageActions().verifyAndClickOnSubmitButtonOnPersonaldetailspage();
        getLoginPageActions().clickOnBackbutton();
        getObservationPageActions().verifyNoObservationTab();
      //Parent
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().selectProfile();
        getLoginPageActions().clickOnEdit();
        Thread.sleep(2000);
        getLoginPageActions().clickOnSelectroleDropdown();
        getLoginPageActions().selectParentOnProfile();
        getLoginPageActions().verifyAndClickOnSubmitButtonOnPersonaldetailspage();
        getLoginPageActions().clickOnBackbutton();
        getObservationPageActions().verifyNoObservationTab();
          
    }
    
    @Test(description = "To verify user will be able to view meta data 'Name of solution' , 'Program Name', 'Language' , ''Creator Name' on observations listed in tiles form.")
    @Author(name = "GAGAN")
    public void MetaDataOnObservationCard_REG() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!F:G");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        Thread.sleep(5000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        Thread.sleep(10000);
        getLoginPageActions().refreshpage();
        Thread.sleep(10000);
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        getObservationPageActions().verifyObservationNameOnCard();
        getObservationPageActions().verifyLanguageOnCard();
        getObservationPageActions().verifyCreatorNameOnCard();
        getObservationPageActions().verifyProgramNameOnCard();
    }
    
    @Test(description = "To verify when user selects an observation, user is re-directed to details page of observation form")
    @Author(name = "GAGAN")
    public void ObservationDetails_REG() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!F:G");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        Thread.sleep(5000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        Thread.sleep(10000);
        getLoginPageActions().refreshpage();
        Thread.sleep(10000);
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        getObservationPageActions().clickObservationWithRubric();
        getObservationPageActions().verifyTextOnObservationDetailsPage();
       
       
    }
    
    
    @Test(description = "To verify user can go back to observation listing page from the details page on clicking back button")
    @Author(name = "GAGAN")
    public void BackButtonOnObservationDetails_REG() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!F:G");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        Thread.sleep(5000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        Thread.sleep(10000);
        getLoginPageActions().refreshpage();
        Thread.sleep(10000);
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        getObservationPageActions().clickObservationWithRubric();
        getObservationPageActions().clickOnBackButton();
        getObservationPageActions().verifyObservationButton();
       
    }
    
    @Test(description = "To verify when user clicks on 'Close' button then entity list pop-up window closes")
    @Author(name = "GAGAN")
    public void CrossIconCloseButtonOnAddEntityPopup_REG() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!F:G");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        Thread.sleep(5000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        Thread.sleep(10000);
        getLoginPageActions().refreshpage();
        Thread.sleep(10000);
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        getObservationPageActions().clickObservationWithRubric();
        getObservationPageActions().clickOnAddEntityButton();
        getObservationPageActions().clickOnCrossIconOnAddEntityPage();
        getObservationPageActions().clickOnAddEntityButton();
        getObservationPageActions().ClickedOnCloseButton();
        getObservationPageActions().verifyTextOnObservationDetailsPage();
    }
    
    // Note - In profile already school entity should be selected
    @Test(description = "To verify user can see entity added by default")
    @Author(name = "GAGAN")
    public void DefaultEntityAdded_REG() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!F:G");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        Thread.sleep(5000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        Thread.sleep(10000);
        getLoginPageActions().refreshpage();
        Thread.sleep(10000);
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        getObservationPageActions().clickObservationWithRubric();
        getObservationPageActions().DefaultEntityAdded();
        getObservationPageActions().clickOnBackButton();
        getObservationPageActions().clickObservationWithoutRubric();
        getObservationPageActions().DefaultEntityAdded();
        
    }
    
    @Test(description = "To verify user is able to select multiple entities or deselect the entities in the list of entities and delete and submit")
    @Author(name = "GAGAN")
    public void EntityselectAndDeselectAndDelete_REG() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!F:G");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        Thread.sleep(5000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        Thread.sleep(10000);
        getLoginPageActions().refreshpage();
        Thread.sleep(10000);
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        getObservationPageActions().clickObservationWithRubric();
        getObservationPageActions().clickOnAddEntityButton();
        getObservationPageActions().selectMultipleEntities();
        getObservationPageActions().DeselectEntities();
        getObservationPageActions().clickOnSubmitButtonOnAddEntityWindow();
        getObservationPageActions().clickOnEntityDeleteOption();
        getObservationPageActions().verifyTextMessageOnDeleteEntityPopup();
        getObservationPageActions().clickOnEntityDeleteConfirmationNo();
        getObservationPageActions().clickOnEntityDeleteOption();
        getObservationPageActions().clickOnEntityDeleteConfirmationYes();
        getObservationPageActions().clickOnEntityDeleteOption();
        getObservationPageActions().clickOnEntityDeleteConfirmationYes();
        Thread.sleep(1000);
        getObservationPageActions().verifyDeleteIconisNotPresent();
        
    }
    
    @Test(description = "To verify user doesn't see the observe again button for observation which user can only submit once")
    @Author(name = "GAGAN")
    public void VerifyNoObserveAgainButtonNoThreeDot_REG() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!F:G");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        Thread.sleep(5000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        Thread.sleep(10000);
        getLoginPageActions().refreshpage();
        Thread.sleep(10000);
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        getObservationPageActions().clickObservationWithRubric();
        getObservationPageActions().verifyNoObserveAgainButton();
        getObservationPageActions().verifyThreeDotNotPresent();
    }
    
    @Test(description = "To verify user sees pop-up box to edit the instance name with 'Cancel' and 'Update' options.")
    @Author(name = "GAGAN")
    public void VerifyObservationInstanceNameChange_REG() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!F:G");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        Thread.sleep(5000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName1"));
        getLoginPageActions().enterPassword(loginTestData.get("password1"));
        getLoginPageActions().clickOnLoginButton();
        Thread.sleep(10000);
        getLoginPageActions().refreshpage();
        Thread.sleep(10000);
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        getObservationPageActions().ClickedOnObservationWithoutRubric();
        getObservationPageActions().clickOnThreeDotEllipseOnObservation();
        getObservationPageActions().ClickedOnEditIconOnThreeDots();
        getObservationPageActions().ClickedOnCancelButtonOnObservationInstancePopup();
        getObservationPageActions().clickOnThreeDotEllipseOnObservation();
        getObservationPageActions().ClickedOnEditIconOnThreeDots();
        getObservationPageActions().ClearAndEnterTextNewObservationInstanceName();
        getObservationPageActions().clickOnThreeDotEllipseOnObservation();
        getObservationPageActions().ClickedOnEditIconOnThreeDots();
        
        
        }
    
 // Note - In profile already school entity should be selected
    @Test(description = "To verify user can see entity added by default")
    @Author(name = "GAGAN")
    public void DefaultEntityAddedObsWithRubric_REG() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!F:G");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        Thread.sleep(5000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName1"));
        getLoginPageActions().enterPassword(loginTestData.get("password1"));
        getLoginPageActions().clickOnLoginButton();
        Thread.sleep(10000);
        getLoginPageActions().refreshpage();
        Thread.sleep(10000);
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        getObservationPageActions().ClickedOnObsevationWithRubricSingleSubmission();
        getObservationPageActions().DefaultEntityAddedForObsWithRubricSingleSubmission();
        
    }
}
