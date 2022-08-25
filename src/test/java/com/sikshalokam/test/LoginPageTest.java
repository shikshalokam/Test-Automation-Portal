package com.sikshalokam.test;

import com.sikshalokam.annotation.Author;
import com.sikshalokam.pages.actions.LoginPageAction;
import com.sikshalokam.utils.gSheet.TestData;
import com.sikshalokam.utils.prop.PropUtlis;

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
    
    public String getEnvironmentValue() throws Exception {
    	return appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
    }
    
    public void switchEnvironment() throws Exception {
    	if(getEnvironmentValue().contains("preprod") || getEnvironmentValue().contains("prod")) {
        	getLoginPageActions().clickOnExploreDiksha();
        }
    }
    
    @Test(description = "login to application with valid Credentials")
    @Author(name = "Sunil H N")
    public void loginToApplication() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        if(getEnvironmentValue().contains("preprod")) {
        	getLoginPageActions().clickOnExploreDiksha();
        }
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
    }

    // not using..
    @Test(description = "login to application with valid Credentials")
    @Author(name = "Manjunatha K")
    public void loginAsHeadTeacher() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        if(getEnvironmentValue().contains("preprod")) {
        	getLoginPageActions().clickOnExploreDiksha();
        }
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
    }
    
    
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
        /*if(getEnvironmentValue().contains("preprod")) {
        	getLoginPageActions().clickOnExploreDiksha();
        }*/
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().clickOnRegister();
        getLoginPageActions().verifyRegisterWindowTitle();

    }

    @Test(description = "State System Login Enable")
    @Author(name = "Manjunatha K")
    public void loginWithStateSystem() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().clickOnLoginWithStateSystem();
        getLoginPageActions().verifySelectYourStateTitle();
        getLoginPageActions().verifySubmitButtonStatusOnStateLogin();
        getLoginPageActions().clickOnSelectStateDropDown();
        if(getEnvironmentValue().contains("preprod") || getEnvironmentValue().contains("prod")) {
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
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        //getLoginPageActions().clickOnExploreDiksha();
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
        //getLoginPageActions().clickOnExploreDiksha();
    	if(getEnvironmentValue().contains("preprod")) {
        	getLoginPageActions().clickOnExploreDiksha();
        }
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


    //@Test(description = "Verify Observation Tile")
    @Author(name = "Sunil H N")
    public void VerifyObservationTile() throws Exception {
    	if(getEnvironmentValue().contains("preprod")) {
        	getLoginPageActions().clickOnExploreDiksha();
        }
        getLoginPageActions().clickOnProfileIcon();
        getLoginPageActions().selectProfile();
        getLoginPageActions().selectRoleHTAndOffical();
        getLoginPageActions().clickOnSubmit();
        getLoginPageActions().clickOnProfileIcon();
        getLoginPageActions().selectTeacher();
        getLoginPageActions().ClickOnSubmit();
        getLoginPageActions().verifyObservationTile();
    }

    
    @Test(description = "Verify Gmail login")
    @Author(name = "Manjunatha K")
    public void verifyGmailSignIn() throws Exception {
    	loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
    	if(getEnvironmentValue().contains("preprod")) {
        	getLoginPageActions().clickOnExploreDiksha();
        }
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
        //getLoginPageActions().clickOnExploreDiksha();
        if(getEnvironmentValue().contains("preprod")) {
        	getLoginPageActions().clickOnExploreDiksha();
        }
        getLoginPageActions().verifyWelcomeTitle();
        getLoginPageActions().selectRoleHTAndOffical();
        getLoginPageActions().clickOnContinue();
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
        getLoginPageActions().clickOnProfileIcon();
        getLoginPageActions().verifyNameOnProfile();
        Assert.assertTrue(true,"User name is not present on profile");
        //getLoginPageActions().getUserNameFromProfile();
        //Assert.assertEquals(getLoginPageActions().getUserNameFromProfile(), loginTestData.get("userNameOnLocationWindow"), "User name is not matching");
    }
    
    @Test(description = "Program manager login and verify dashboard ")
    @Author(name = "Manjunatha K")
    public void programManagerLogin() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        switchEnvironment();
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("programManagerUsername"));
        getLoginPageActions().enterPassword(loginTestData.get("programManagerPassword"));
        getLoginPageActions().clickOnLoginButton();
        getLoginPageActions().clickOnLoggedInProfileIcon();
        getLoginPageActions().verifyProgramDashboard();
    }
}