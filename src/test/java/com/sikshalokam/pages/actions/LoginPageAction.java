package com.sikshalokam.pages.actions;

import com.aventstack.extentreports.Status;
import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.objects.LoginPageObjects;
import com.sikshalokam.report.SikshaLokamReport;
import com.sikshalokam.test.LoginPageTest;
import com.sikshalokam.utils.gestures.Gestures;
import com.sikshalokam.utils.logger.Logger;
import com.sikshalokam.utils.prop.PropUtlis;
import com.sun.mail.iap.Argument;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageAction {


    LoginPageObjects loginPageObjects;

    public LoginPageAction() throws Exception {
        loginPageObjects = PageFactory.initElements(SikshaLokamClient.get().driver(), LoginPageObjects.class);
    }

    JavascriptExecutor js = (JavascriptExecutor) SikshaLokamClient.get().driver();
    
    String appUrl;
    public String getEnvironmentValue() throws Exception {
    	return appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
    }
    
    // switch to webview for inspect elements
    public void switchToWebView() throws Exception {
        Thread.sleep(5000);

    }

    public void clickOnGuest() throws Exception {
    	System.out.println("Waiting for 5 seconds");
    	Thread.sleep(5000);
    	SikshaLokamClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.guestIcon);
        //SikshaLokamClient.get().gestures().click(loginPageObjects.guestIcon);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Guest Icon");
    }

    public void clickOnLogin() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.login);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Login.");
    }

    public void clickOnRegister() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.registerHere);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Register");
    }

    // enter user name to field.
    public void enterUserName(String userName) throws Exception {
       // SikshaLokamClient.get().gestures().click(loginPageObjects.userName);
        //SikshaLokamClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.userName);
        SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.userName, userName);
        SikshaLokamClient.get().report().log(Status.INFO, "Entered user name is : " + userName );
    }

    // enter password to field.
    public void enterPassword(String password) throws Exception {
        // SikshaLokamClient.get().gestures().click(loginPageObjects.);
        //     SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects., password);
    	SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.Password, password);
        SikshaLokamClient.get().report().log(Status.INFO, "Entered password is : " + password );
    }

    public void clickOnLoginButton() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.loginButton);
        SikshaLokamClient.get().report().log(Status.INFO, "clicked on the login button ");
    }

    public void verifyHomePage() throws Exception {
        //     SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.welcomeTitle);
    }


    public void clickOnHeadTeacherOption() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.schoolHeadOROfficial);
        SikshaLokamClient.get().report().log(Status.PASS, "Clicked on the head teacher option");
    }

    public void clickOnLoginWithDikshaOption() throws Exception {
        //  SikshaLokamClient.get().gestures().click(loginPageObjects.loginWithDiksha);

    }

    public void clickOnExploreDiksha() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.exploreDiksha);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Explore Diksha");
    }

    public void selectTeacher() throws Exception {
        SikshaLokamClient.get().report().log(Status.INFO, "Select Teacher");
    }

    public void selectBoard() throws Exception {
        SikshaLokamClient.get().report().log(Status.INFO, "Select Board");
    }

    public void selectMedium() throws Exception {
        SikshaLokamClient.get().report().log(Status.INFO, "Select Medium");
    }

    public void selectClass() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.selectClass);
        SikshaLokamClient.get().report().log(Status.INFO, "Select Class");
    }

    public void clickOnSubmit() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.courseWindowSubmitButton);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Submit");
    }

    public void enterName(String name) throws Exception {
        SikshaLokamClient.get().report().log(Status.INFO, "Entered Name as " + name);
    }

    public void selectState() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.selectState);
		//js.executeScript("arguments[0].scrollIntoView(true);", loginPageObjects.keralaState);
        if(getEnvironmentValue().contains("diksha")) {
            SikshaLokamClient.get().gestures().click(loginPageObjects.keralaState);
            SikshaLokamClient.get().report().log(Status.INFO, "Kerala State selected.");	
        } else if(getEnvironmentValue().contains("preprod")) {
        	SikshaLokamClient.get().gestures().click(loginPageObjects.uttarPradeshSate);
            SikshaLokamClient.get().report().log(Status.INFO, "Uttara Pradesh State selected.");	
        } else {
        	SikshaLokamClient.get().gestures().click(loginPageObjects.andhraPradeshSate);
            SikshaLokamClient.get().report().log(Status.INFO, "Andhra Pradesh State selected.");
        }
        
    }

    public void selectDistrict() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.selectDistrict);
        if(getEnvironmentValue().contains("diksha")) {
            SikshaLokamClient.get().gestures().click(loginPageObjects.alappuzhaDistrict);
            SikshaLokamClient.get().report().log(Status.INFO, "Alappuzha District Selected.");
        } else if(getEnvironmentValue().contains("preprod")) {
            SikshaLokamClient.get().gestures().click(loginPageObjects.agraDistrict);
            SikshaLokamClient.get().report().log(Status.INFO, "Agra District Selected.");
        } else {
        	SikshaLokamClient.get().gestures().click(loginPageObjects.ananthpurDistrict);
            SikshaLokamClient.get().report().log(Status.INFO, "Ananathpura District Selected.");        	
        }
    }

    public void clickOnSubmit2() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.courseWindowSubmitButton);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Submit");
    }

    public void clickOnUserIcon() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.profile);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on User Icon");
    }

    public void clickOnProfileIcon() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.guestIcon);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on User Icon");
    }

    public void ClickOnSubmit() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.courseWindowSubmitButton);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Submit");
    }

    public void selectProfile() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.profile);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on User Icon");

    }

    public void selectRoleHTAndOffical() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.schoolHeadOROfficial);
        SikshaLokamClient.get().report().log(Status.INFO, "select Role as HT & Official");
    }

    public void clickOnContinue() throws Exception {
    	//SikshaLokamClient.get().gestures().click(loginPageObjects.continueButton);
    	SikshaLokamClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.continueButton);
    	Logger.logAndReportInfo("Clicked on the continue button");
    }
    
    public void clickOnBoardDropDown() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.boardDropdown);
    	Logger.logAndReportInfo("Clicked on the board drop down");
    }
    
    public void selectcbseOrNcertBoardOption() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.cbseNcertOption);
    	Logger.logAndReportInfo("Selected the option cbse or ncert.");
    }
    
    public void clickOnMediumDropDown() throws Exception {
    	//Thread.sleep(1000);
    	//SikshaLokamClient.get().gestures().click(loginPageObjects.mediumDropdown);
    	SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(loginPageObjects.mediumDropdown);
    	SikshaLokamClient.get().gestures().click(loginPageObjects.mediumDropdown);
    	Logger.logAndReportInfo("Clicked on the medium drop down");
    }
    
    public void selectEnglishOption() throws Exception {	
    	SikshaLokamClient.get().gestures().click(loginPageObjects.englishOption);
        Thread.sleep(2000);
    	Logger.logAndReportInfo("Selected the option english.");
    	SikshaLokamClient.get().gestures().tabKeyAndWait();
    }
    
    public void clickOnClassDropDown() throws Exception {
    	Thread.sleep(1000);
    	SikshaLokamClient.get().gestures().click(loginPageObjects.gradeLevelDropdown);
    	Logger.logAndReportInfo("Clicked on the board drop down");
    }
    
    public void selectClass1Option() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.class1Option);
    	Thread.sleep(1000);
    	Logger.logAndReportInfo("Selected the option class1.");
    	SikshaLokamClient.get().gestures().tabKeyAndWait();
    }
    public void clickOnSubmitButtonOnCourseWindow() throws Exception {
    	SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(loginPageObjects.courseWindowSubmitButton);
    	SikshaLokamClient.get().gestures().click(loginPageObjects.courseWindowSubmitButton);
    	Logger.logAndReportInfo("Clicked on the submit button on BMC selection window.");
    }
    
    public void clickOnSubmitButtonOnLocationWindow() throws Exception {
		js.executeScript("arguments[0].click();", loginPageObjects.LocationWindowSubmitButton);
    	//SikshaLokamClient.get().gestures().click(loginPageObjects.LocationWindowSubmitButton);
    	Logger.logAndReportInfo("Clicked on the submit button on location selection window.");
    }
    
    
    public void clickonForgotPassword() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.forgotPasswordButton);
    	Logger.logAndReportInfo("Clicked on the forgot password button");
    }
    
    public void clickOnLoginWithGoogle() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.signInWithGoogle);
        SikshaLokamClient.get().report().log(Status.INFO, "Click on sign in with google gmail.");
    }
    
    public void enterEmailToGoolgleSignIn(String emailId) throws Exception {
    SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.emailIdToLogin, emailId);
	Logger.logAndReportInfo("entered gmail id is : " + emailId);
    }
    
    public void enterPasswordToGooglePassword(String password) throws Exception {
    	SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.emailPasswordToLogin, password);
    	Logger.logAndReportInfo("entered password is : " + password);
    }
    
    public void clickOnNextButton() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.nextButton);
    	Logger.logAndReportInfo("Clicked on the next button");
    	Thread.sleep(2000);
    }
    
    public void clickOnLoginWithStateSystem() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.signInStateSystem);
        Logger.logAndReportInfo("Clicked on sign in with State System.");
    }
    
    public void clickOnSelectStateDropDown() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.selectStateDropDownForLogin);
    	Logger.logAndReportInfo("Clicked on the select state dropdown.");
    }
    
    public void selectTNStateForStateLoginInStaging() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.TNStateForStateLogin);
    	Logger.logAndReportInfo("Selected the Tamilnadu state from dropdown.");
    }
    
    public void selectPreprodStateForStateLoginInPreprod() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.preprodclientStateLogin);
    	Logger.logAndReportInfo("Selected the Preprod state from dropdown.");
    }
    
    public void clickOnBMCWindowTitle() throws Exception {
    	Thread.sleep(3000);
    	SikshaLokamClient.get().gestures().click(loginPageObjects.BMCWindowTitle);
    	Logger.logAndReportInfo("Clicked on the BMCWindow title");
    }
    
    public void enterNameInLocationWindow(String userName) throws Exception {
    	SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.nameFieldOnLocationWindow, userName);
    }
    
    public void clickOnProfileIcon1() throws Exception {
    	//SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(loginPageObjects.userProfileIcon);
    	//SikshaLokamClient.get().gestures().click(loginPageObjects.userProfileIcon);
		js.executeScript("arguments[0].click();", loginPageObjects.userProfileIcon);
    	Logger.logAndReportInfo("Clicked on the user profile icon");
    }
    
    public String getUserNameFromProfile() throws Exception {
    	String actualUserName = SikshaLokamClient.get().gestures().getText(loginPageObjects.userNameOnProfile);
    	return actualUserName;
    }
    
    public boolean verifyNameOnProfile() throws Exception {
    	SikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.userNameOnProfile);
    	Logger.logAndReportPass("User name on profile is present");
		return true;
    }
  //BMCL = Board, medium, class and location selection
    public void BMCLSelection() throws Exception {
    	 verifyWelcomeTitle();
         selectRoleHTAndOffical();
         clickOnContinue();
         clickOnBoardDropDown();
         selectcbseOrNcertBoardOption();
         clickOnSubmitButtonOnCourseWindow();
         selectState();
         selectDistrict();
         clickOnSubmitButtonOnLocationWindow();
         verifyHomeButton();
    }
    
    public void enterNameToSearchbox(String nameToSearch) throws Exception {
    	SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.searchInputBox, nameToSearch);
    	Logger.logAndReportInfo(" searched thing is : " + nameToSearch);
    }
    
    public void clickOnSerachButton() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.serachButton);
    	Thread.sleep(2000);
    	Logger.logAndReportInfo("clicked on the search button.");
    }
    
    public void clickOnSearchedObservationTitle() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.serachedObservationTitle);
    	Logger.logAndReportInfo("Clicked on the searched observation title.");
    }
    
    public void clickOnSubmitButtonOnStateLogin() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.submitButtonOnStateLogin);
    	Logger.logAndReportInfo("Clicked on the submit button on state login");
    }
    
    //************** Verify Actions *************************************//
    public void verifyObservationTile() throws Exception {
        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.observations),"Observation title is not displayed.");
        Logger.logAndReportPass("Observation title is verified");
    }

	public void verifyWelcomeTitle() throws Exception {
        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.welcomeTitle),"Welocme title is not displayed.");
        Logger.logAndReportPass("Welcome title is displayed succesfully.");
	}
	
	public void verifyHomeButton() throws Exception {
        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.homeButton),"Home button is not displayed.");
		Logger.logAndReportPass("Home button is displayed succesfully");
	}
	
	public void verifyRegisterWindowTitle() throws Exception {
        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.registerTitle),"Register to DIKSHA / Sunbird title is not displayed.");
		Logger.logAndReportPass("Register to DIKSHA / Sunbird title is displayed succesfully.");
	}
	
	public void verifyInvalidLoginError() throws Exception {
        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.loginErorMessage),"Login Error message is not displayed.");
		Logger.logAndReportPass("login error message displayed succesfully.");
	}
	
	public void verifyForgotPasswordTitle() throws Exception {
        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.forgotPasswordTitle),"Forgot password window title is not displayed.");
		Logger.logAndReportPass("Forgot password window title is displayed succesfully.");
	}
	
	public void verifySelectYourStateTitle() throws Exception {
        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.selectYourStateTitle),"Select state title is not displayed.");
		Logger.logAndReportPass("Select State window title is displayed succesfully.");
	}
	
	public void verifySubmitButtonStatusOnStateLogin() throws Exception {
		boolean status =loginPageObjects.submitButtonOnStateLogin.isEnabled();
		if(status) {
			Logger.logAndReportPass("Submit button is enabled");
		} else {
			Logger.logAndReportWarning("Submit button is not enabled");
		}
	}
	
	public void verifyDikshaUATLoginTitle() throws Exception {
        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.dikshaUATLoginTitle),"Diksha UAT title is not displayed.");
		Logger.logAndReportPass("Diksha UAT login title is displayed succesfully.");
	}
	
	public void verifyDikshaUATLoginTitleForStaging() throws Exception {
        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.dikshaUATLoginTitle),"Diksha UAT title is not displayed.");
		Logger.logAndReportPass("Diksha UAT login title is displayed succesfully.");
	}
}
