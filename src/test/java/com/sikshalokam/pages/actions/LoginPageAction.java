package com.sikshalokam.pages.actions;

import com.aventstack.extentreports.Status;
import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.objects.LoginPageObjects;
import com.sikshalokam.report.SikshaLokamReport;
import com.sikshalokam.test.LoginPageTest;
import com.sikshalokam.utils.logger.Logger;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAction {


    LoginPageObjects loginPageObjects;

    public LoginPageAction() throws Exception {
        loginPageObjects = PageFactory.initElements(SikshaLokamClient.get().driver(), LoginPageObjects.class);
    }

    JavascriptExecutor js = (JavascriptExecutor) SikshaLokamClient.get().driver();
    
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
        SikshaLokamClient.get().gestures().click(loginPageObjects.userName);
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
        SikshaLokamClient.get().gestures().click(loginPageObjects.andhraPradeshSate);
        SikshaLokamClient.get().report().log(Status.INFO, "State selected.");
    }

    public void selectDistrict() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.selectDistrict);
        SikshaLokamClient.get().gestures().click(loginPageObjects.ananthpurDistrict);
        SikshaLokamClient.get().report().log(Status.INFO, "District Selected.");
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
        SikshaLokamClient.get().gestures().click(loginPageObjects.profile);
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
    	SikshaLokamClient.get().gestures().click(loginPageObjects.continueButton);
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
    	SikshaLokamClient.get().gestures().click(loginPageObjects.mediumDropdown);
    	Logger.logAndReportInfo("Clicked on the medium drop down");
    }
    
    public void selectEnglishOption() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.cbseNcertOption);
    	Logger.logAndReportInfo("Selected the option english.");
    }
    
    public void clickOnClassDropDown() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.gradeLevelDropdown);
    	Logger.logAndReportInfo("Clicked on the board drop down");
    }
    
    public void selectClass1Option() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.class1Option);
    	Logger.logAndReportInfo("Selected the option class1.");
    }
    public void clickOnSubmitButtonOnCourseWindow() throws Exception {
    	SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(loginPageObjects.courseWindowSubmitButton);
    	SikshaLokamClient.get().gestures().click(loginPageObjects.courseWindowSubmitButton);
    	Logger.logAndReportInfo("Clicked on the submit button on BMC selection window.");
    }
    
    public void clickOnSubmitButtonOnLocationWindow() throws Exception {
    	SikshaLokamClient.get().gestures().click(loginPageObjects.LocationWindowSubmitButton);
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
    
    
    
    //************** Verify Actions *************************************//
    public void verifyObservationTile() throws Exception {
        SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.observations);
        Logger.logAndReportPass("Observation title is verified");
    }

	public void verifyWelcomeTitle() throws Exception {
        SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.welcomeTitle);
        Logger.logAndReportPass("Welcome title is displayed succesfully.");
//        SikshaLokamClient.get().report().log(Status.PASS, "Welcome title is displayed succesfully.");
	}
	
	public void verifyHomeButton() throws Exception {
		SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.homeButton);
		Logger.logAndReportPass("Home button is displayed succesfully");
	}
	
	public void verifyRegisterWindowTitle() throws Exception {
		SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.registerTitle);
		Logger.logAndReportPass("Register to DIKSHA title is displayed succesfully.");
	}
	
	public void verifyInvalidLoginError() throws Exception {
		SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.loginErorMessage);
		Logger.logAndReportPass("login error message displayed succesfully.");
	}
	
	public void verifyForgotPasswordTitle() throws Exception {
		SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.forgotPasswordTitle);
		Logger.logAndReportPass("Forgot password window title is displayed succesfully.");
	}
	
	
	
}
