package com.shikshalokam.test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;

import com.shikshalokam.annotation.Author;
import com.shikshalokam.pages.actions.LoginPageAction;
import com.shikshalokam.pages.actions.ObservationPageAction;
import com.shikshalokam.utils.gSheet.TestData;
import com.shikshalokam.utils.logger.Logger;
import com.shikshalokam.utils.prop.PropUtlis;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

import java.util.Map;

public class LoginPageTest {


    Map<String, String> loginTestData;

    String appUrl;
    
    public LoginPageAction getLoginPageActions() throws Exception {
        return new LoginPageAction();
    }
    public ObservationPageAction getObservationPageActions() throws Exception {
        return new ObservationPageAction();
    }
    
    public String getEnvironmentValue() throws Exception {
    	return appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
    }
    
    public void switchEnvironment() throws Exception {
    	if(getEnvironmentValue().contains("preprod") || getEnvironmentValue().contains("diksha")) {
        	getLoginPageActions().clickOnExploreDiksha();
        }
    }
    
    // not using..
    @Test(description = "login to application with valid Credentials")
    @Author(name = "Manjunatha K")
    public void loginAsHeadTeacher() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        
        Thread.sleep(10000);
        getLoginPageActions().refreshpage();
        Thread.sleep(5000);
        
        getLoginPageActions().verifyValidLoginSuccessful();
    }
    
    // can be part of regression
    @Test(description = "login to application with Invalid Credentials")
    @Author(name = "Sunil H N")
    public void loginToWithInvalidCredentails() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        if(getEnvironmentValue().contains("preprod")) {
        	getLoginPageActions().clickOnExploreDiksha();
        }
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("InValidPassword"));
        getLoginPageActions().clickOnLoginButton();
        getLoginPageActions().verifyInvalidLoginError();
    }


    @Test(description = "Register An User")
    @Author(name = "Sunil H N")
    public void registerToAnApplication() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
       
        Thread.sleep(10000);
        getLoginPageActions().refreshpage();
        Thread.sleep(5000);
        
        getLoginPageActions().clickOnRegister();
        getLoginPageActions().verifyRegisterWindowTitle();

    }
    
    //can be part of regression
    @Test(description = "State System Login Enable")
    @Author(name = "Manjunatha K")
    public void loginWithStateSystem() throws Exception {
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().clickOnLoginWithStateSystem();
        getLoginPageActions().verifySelectYourStateTitle();
        getLoginPageActions().verifySubmitButtonStatusOnStateLogin();
        getLoginPageActions().clickOnSelectStateDropDown();
        if(getEnvironmentValue().contains("preprod") || getEnvironmentValue().contains("diksha")) {
        	getLoginPageActions().selectPreprodStateForStateLoginInPreprod();
        } else {
        	getLoginPageActions().selectTNStateForStateLoginInStaging();
        }
        getLoginPageActions().verifySubmitButtonStatusOnStateLogin();
        getLoginPageActions().clickOnSubmitButtonOnStateLogin();
        getLoginPageActions().verifyDikshaUATLoginTitle();
        
    }
    
    @Test(description = "Forgot password check")
    @Author(name = "Manjunatha K")
    public void forgotPasswordToLogin() throws Exception {
        if(getEnvironmentValue().contains("preprod")) {
        	getLoginPageActions().clickOnExploreDiksha();
        }
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().clickonForgotPassword();
        getLoginPageActions().verifyForgotPasswordTitle();
        
    }
    
    
    @Test(description = "Verify Teacher Role")
    @Author(name = "Sunil H N")
    public void verifyTeacherRoleForLogin() throws Exception {
        switchEnvironment();
        getLoginPageActions().selectTeacher();
        getLoginPageActions().selectBoard();
        getLoginPageActions().selectMedium();
        getLoginPageActions().selectClass();
        getLoginPageActions().clickOnSubmit();
        getLoginPageActions().enterName("");
        getLoginPageActions().selectState();
        getLoginPageActions().selectDistrict();
        getLoginPageActions().clickOnSubmit2();
        getLoginPageActions().clickOnUserIcon();


    }


    @Test(description = "Verify Gmail login")
    @Author(name = "Manjunatha K")
    public void verifyGmailSignIn() throws Exception {
    	loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().clickOnLoginWithGoogle();
        getLoginPageActions().enterEmailToGoolgleSignIn(loginTestData.get("gmailToLogin"));
        getLoginPageActions().clickOnNextButton();
        getLoginPageActions().enterPasswordToGooglePassword(loginTestData.get("passwordToGmail"));
        Thread.sleep(3000);
        getLoginPageActions().clickOnNextButton();
        Thread.sleep(3000);
        getLoginPageActions().verifyHomeButton();
    }
    
    @Test(description = "BMC and Location Adding")
    @Author(name = "Manjunatha K")
    public void BMCAndLocationEditAndVerify() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        switchEnvironment();
        getLoginPageActions().verifyWelcomeTitle();
        getLoginPageActions().selectRoleHTAndOffical();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().verifyBMCDropdown();
        
        getLoginPageActions().clickOnBoardDropDown();
        getLoginPageActions().selectcbseOrNcertBoardOption();
        Thread.sleep(20000);
        System.out.println("20 Seconds wait is over");
        getLoginPageActions().clickOnMediumDropDown();
        getLoginPageActions().selectEnglishOption();
        getLoginPageActions().clickOnClassDropDown();
        getLoginPageActions().selectClass1Option();
        getLoginPageActions().clickOnSubmitButtonOnCourseWindow();
        getLoginPageActions().enterNameInLocationWindow(loginTestData.get("userNameOnLocationWindow"));
        getLoginPageActions().selectState();
        getLoginPageActions().selectDistrict();
        getLoginPageActions().clickOnSubmitButtonOnLocationWindow();
        getLoginPageActions().verifyHomeButton();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().verifyNameOnProfile();
      //  Assert.assertTrue(true,"User name is not present on profile");
       
    }
    
    
    
    @Test(description = "Only Board is mandatory field in BMC Pop-up for HTofficial role")
    @Author(name = "SHREEJITH")
    public void htofficialsAndSubmit() throws Exception {
        switchEnvironment();
        getLoginPageActions().verifyWelcomeTitle();
        getLoginPageActions().selectRoleHTAndOffical();
       getLoginPageActions().clickOnContinue();
       getLoginPageActions().verifySubmitButtonisDisabled();
        getLoginPageActions().clickOnBoardDropDown();
        getLoginPageActions().selectcbseOrNcertBoardOption();
        Thread.sleep(5000);
        System.out.println("5 Seconds wait is over");
        getLoginPageActions().verifySubmitButtonEnabled();
        getLoginPageActions().verifyYourLocationPopUp();
}
    
    @Test(description = "Only Board is mandatory field in BMC Pop-up for HTofficial role.")
    @Author(name = "SHREEJITH")
    public void htofficialsAndSubmitfail() throws Exception {
        switchEnvironment();
        getLoginPageActions().verifyWelcomeTitle();
        getLoginPageActions().selectRoleHTAndOffical();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnBoardDropDown();
        getLoginPageActions().selectcbseOrNcertBoardOption();
        Thread.sleep(5000);
        System.out.println("5 Seconds wait is over");
        getLoginPageActions().verifySubmitButtonisDisabled();
        getLoginPageActions().verifyYourLocationPopUp();
}
  
    
    
   
    @Test(description = "Board Medium Grade are mandatory fields in BMC Pop-up for Teacher role")
    @Author(name = "SHREEJITH")
    public void teacherAndSubmit() throws Exception {
        switchEnvironment();
        getLoginPageActions().verifyWelcomeTitle();
        getLoginPageActions().selectTeacher();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnBoardDropDown();
        getLoginPageActions().selectcbseOrNcertBoardOption();
        Thread.sleep(5000);
        System.out.println("5 Seconds wait is over");
        getLoginPageActions().verifySubmitButtonisDisabled();
        getLoginPageActions().clickOnMediumDropDown();
        getLoginPageActions().selectEnglishOption();
        getLoginPageActions().clickOnClassDropDown();
        getLoginPageActions().selectClass1Option();
        getLoginPageActions().verifySubmitButtonEnabled();
        getLoginPageActions().verifyYourLocationPopUp();
}
   
    
    @Test(description = "Board Medium Grade are mandatory fields in BMC Pop-up for Student role")
    @Author(name = "SHREEJITH")
    public void studentAndSubmit() throws Exception {
        switchEnvironment();
        getLoginPageActions().verifyWelcomeTitle();
        getLoginPageActions().selectStudent();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnBoardDropDown();
        getLoginPageActions().selectcbseOrNcertBoardOption();
        Thread.sleep(5000);
        System.out.println("5 Seconds wait is over");
        getLoginPageActions().verifySubmitButtonisDisabled();
        getLoginPageActions().clickOnMediumDropDown();
        getLoginPageActions().selectEnglishOption();
        getLoginPageActions().clickOnClassDropDown();
        getLoginPageActions().selectClass1Option();
        getLoginPageActions().verifySubmitButtonEnabled();
        getLoginPageActions().verifyYourLocationPopUp();
}
    @Test(description = "Board Medium Grade are mandatory fields in BMC Pop-up for Parent role")
    @Author(name = "SHREEJITH")
    public void parentAndSubmit() throws Exception {
        switchEnvironment();
        getLoginPageActions().verifyWelcomeTitle();
        getLoginPageActions().selectParent();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnBoardDropDown();
        getLoginPageActions().selectcbseOrNcertBoardOption();
        Thread.sleep(5000);
        System.out.println("5 Seconds wait is over");
        getLoginPageActions().verifySubmitButtonisDisabled();
        getLoginPageActions().clickOnMediumDropDown();
        getLoginPageActions().selectEnglishOption();
        getLoginPageActions().clickOnClassDropDown();
        getLoginPageActions().selectClass1Option();
        getLoginPageActions().verifySubmitButtonEnabled();
        getLoginPageActions().verifyYourLocationPopUp();
}
    
    @Test(description = "login through observation tab")
    @Author(name = "SHREEJITH")
    public void loginFromObservationTab() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        getLoginPageActions().verifyLoginScreen();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getObservationPageActions().verifyObservationListingScreen();
    }
 
    @Test(description = "-To verify a user with teacher role can see 'Browse other categories' section on the home page on portal"+
    "-To verify a user with teacher role can see observation tile in the 'Browse other categories' section on portal home page"+
    "-To verify a user with teacher role is taken to the login page when they click on the Observation tile ")
    @Author(name = "SHREEJITH")
    public void guestUserRoleAsTeacher() throws Exception {
        switchEnvironment();
        getLoginPageActions().verifyWelcomeTitle();
        getLoginPageActions().selectTeacher();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnBoardDropDown();
        getLoginPageActions().selectcbseOrNcertBoardOption();
        Thread.sleep(5000);
        System.out.println("5 Seconds wait is over");
        getLoginPageActions().verifySubmitButtonisDisabled();
        getLoginPageActions().clickOnMediumDropDown();
        getLoginPageActions().selectEnglishOption();
        getLoginPageActions().clickOnClassDropDown();
        getLoginPageActions().selectClass1Option();
        getLoginPageActions().verifySubmitButtonEnabled();
        getLoginPageActions().verifyYourLocationPopUp();
     // getLoginPageActions().selectState();
     // getLoginPageActions().selectDistrict();
        getLoginPageActions().clickOnSubmitButtonOnLocationWindow();
        getLoginPageActions().verifyHomeButton();
        getLoginPageActions().clickOnHomeButton();
        getObservationPageActions().verifyBrowseOtherCategories();
        getObservationPageActions().verifyObservationTileunderBrowseOtherCategories();
        getObservationPageActions().clickOnObservationTileunderBrowseOtherCategories();
        getLoginPageActions().verifyLoginScreen();
        
    }
    
    @Test(description = "To verify user is able to login on portal from menu option")
    @Author(name = "SHREEJITH")
    public void loginScreen() throws Exception {
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        Thread.sleep(3000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().verifyLoginScreen();
    }
    
    @Test(description = "-To verify on click of Explore Diksha user should see the pop-up with following roles as option-"
    		+ "1. Teacher"
    		+ "2. Student"
    		+ "3. Parent"
    		+ "4. School head or official"
    		+ "5. Other")
    @Author(name = "SHREEJITH")
    public void rolesOnPopup() throws Exception {
    	  switchEnvironment();
          getLoginPageActions().verifyWelcomeTitle();
          getLoginPageActions().VerifyRoles();
    }
    
    
    
    //..................................REG..............................................//
  
    
    @Test(description = "-To verify the existing teacher user gets a prompt to update profile when they click on the observation tile, if all details are not filled." +
    	    "-To verify the existing teacher user comes to profile page after clicking on update profile on the pop up prompt message" 
    	   )
    	    @Author(name = "SHREEJITH")
    	    public void updateProfilePopupTeacherFlow_REG() throws Exception {
    	        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
    	        switchEnvironment();
    	        getLoginPageActions().BMCLSelection();  
    	        Thread.sleep(3000);
    	        getLoginPageActions().clickOnGuest();
    	        getLoginPageActions().clickOnLogin();
    	        getLoginPageActions().enterUserName(loginTestData.get("updateprofileuserName"));
    	        getLoginPageActions().enterPassword(loginTestData.get("updateprofileuserPassword"));
    	        getLoginPageActions().clickOnLoginButton();
    	       
    	        Thread.sleep(10000);
   	            getLoginPageActions().refreshpage();
   	            Thread.sleep(5000);  
   	            
    	        getLoginPageActions().verifyHomeButton();
    	        getLoginPageActions().clickOnHomeButton();
    	        getObservationPageActions().clickOnObservationTileunderBrowseOtherCategories();
    	        getLoginPageActions().verifyUpdateProfilePopup();
    	        getLoginPageActions().verifyContentsOfUpdateProfilePopup();
    	        getLoginPageActions().clickOnUpdateButton();
    	        getLoginPageActions().verifyEditPersonalDetailsPopup();
    }
    
    @Test(description = "-To verify a new user should be able to enter their credentials and login to portal. And navigated to complete my Profile details (i.e add sub role and location) ")
    	    @Author(name = "SHREEJITH")
    	    public void completeProfileDetails_REG() throws Exception {
    	        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
    	        switchEnvironment();
    	        getLoginPageActions().BMCLSelection();  
    	        Thread.sleep(3000);
    	        getLoginPageActions().clickOnGuest();
    	        getLoginPageActions().clickOnLogin();
    	        getLoginPageActions().enterUserName(loginTestData.get("newuserht"));
    	        getLoginPageActions().enterPassword(loginTestData.get("newuserhtPassword"));
    	        getLoginPageActions().clickOnLoginButton();
    	       
    	        Thread.sleep(10000);
   	            getLoginPageActions().refreshpage();
   	            Thread.sleep(5000);  
   	            getLoginPageActions().verifyYourLocationPopUp();
   	            Logger.logAndReportPass("As a first time user , user is asked to complete my Profile details (i.e add sub role and location) ");
    }
    	       
}