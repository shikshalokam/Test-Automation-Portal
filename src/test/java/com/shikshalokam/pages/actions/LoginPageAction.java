package com.shikshalokam.pages.actions;

import com.aventstack.extentreports.Status;
import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.objects.LoginPageObjects;
import com.shikshalokam.pages.objects.ObservationPageObjects;
import com.shikshalokam.report.ShikshaLokamReport;
import com.shikshalokam.test.LoginPageTest;
import com.shikshalokam.utils.gestures.Gestures;
import com.shikshalokam.utils.logger.Logger;
import com.shikshalokam.utils.prop.PropUtlis;
import com.sun.mail.iap.Argument;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPageAction {


    LoginPageObjects loginPageObjects;
    ObservationPageObjects observationPageObjects = new ObservationPageObjects();
    public LoginPageAction() throws Exception {
        loginPageObjects = PageFactory.initElements(ShikshaLokamClient.get().driver(), LoginPageObjects.class);
    }

    JavascriptExecutor js = (JavascriptExecutor) ShikshaLokamClient.get().driver();
    
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
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.guestIcon);
        //ShikshaLokamClient.get().gestures().click(loginPageObjects.guestIcon);
        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Guest Icon");
    }

    public void clickOnLogin() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.login);
        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Login.");
    }

    public void clickOnRegister() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.registerHere);
        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Register");
    }

    // enter user name to field.
    public void enterUserName(String userName) throws Exception {
       // ShikshaLokamClient.get().gestures().click(loginPageObjects.userName);
        //ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.userName);
        ShikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.userName, userName);
        ShikshaLokamClient.get().report().log(Status.INFO, "Entered user name is : " + userName );
    }

    // enter password to field.
    public void enterPassword(String password) throws Exception {
        // ShikshaLokamClient.get().gestures().click(loginPageObjects.);
        //     ShikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects., password);
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.Password, password);
        ShikshaLokamClient.get().report().log(Status.INFO, "Entered password is : " + password );
    }

    public void clickOnLoginButton() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.loginButton);
        ShikshaLokamClient.get().report().log(Status.INFO, "clicked on the login button ");
    }

    public void verifyHomePage() throws Exception {
        //     ShikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.welcomeTitle);
    }


    public void clickOnHeadTeacherOption() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.schoolHeadOROfficial);
        ShikshaLokamClient.get().report().log(Status.PASS, "Clicked on the head teacher option");
    }

    public void clickOnLoginWithDikshaOption() throws Exception {
        //  ShikshaLokamClient.get().gestures().click(loginPageObjects.loginWithDiksha);

    }

    public void clickOnExploreDiksha() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.exploreDiksha);
        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Explore Diksha");
    }

    public void selectTeacher() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.teacherIcon);
        ShikshaLokamClient.get().report().log(Status.INFO, "Select Teacher");
    }
    
    public void selectStudent() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.studentIcon);
        ShikshaLokamClient.get().report().log(Status.INFO, "Select Student");
    }

    public void selectParent() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.parentIcon);
        ShikshaLokamClient.get().report().log(Status.INFO, "Select Parent");
    }
    public void selectBoard() throws Exception {
        ShikshaLokamClient.get().report().log(Status.INFO, "Select Board");
    }

    public void selectMedium() throws Exception {
        ShikshaLokamClient.get().report().log(Status.INFO, "Select Medium");
    }

    public void selectClass() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.selectClass);
        ShikshaLokamClient.get().report().log(Status.INFO, "Select Class");
    }

    public void clickOnSubmit() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.courseWindowSubmitButton);
        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Submit");
    }

    public void enterName(String name) throws Exception {
        ShikshaLokamClient.get().report().log(Status.INFO, "Entered Name as " + name);
    }

    public void selectState() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.selectState);
		//js.executeScript("arguments[0].scrollIntoView(true);", loginPageObjects.keralaState);
        if(getEnvironmentValue().contains("diksha")) {
            ShikshaLokamClient.get().gestures().click(loginPageObjects.keralaState);
            ShikshaLokamClient.get().report().log(Status.INFO, "Kerala State selected.");	
        } else if(getEnvironmentValue().contains("preprod")) {
        	js.executeScript("arguments[0].scrollIntoView(true);", loginPageObjects.uttarPradeshSate);
        	ShikshaLokamClient.get().gestures().click(loginPageObjects.uttarPradeshSate);
            ShikshaLokamClient.get().report().log(Status.INFO, "Uttara Pradesh State selected.");	
        } else {
        	ShikshaLokamClient.get().gestures().click(loginPageObjects.andhraPradeshSate);
            ShikshaLokamClient.get().report().log(Status.INFO, "Andhra Pradesh State selected.");
        }
        
    }
   
    

    public void selectDistrict() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.selectDistrict);
        if(getEnvironmentValue().contains("diksha")) {
            ShikshaLokamClient.get().gestures().click(loginPageObjects.alappuzhaDistrict);
            ShikshaLokamClient.get().report().log(Status.INFO, "Alappuzha District Selected.");
        } else if(getEnvironmentValue().contains("preprod")) {
            ShikshaLokamClient.get().gestures().click(loginPageObjects.agraDistrict);
            ShikshaLokamClient.get().report().log(Status.INFO, "Agra District Selected.");
        } else {
        	ShikshaLokamClient.get().gestures().click(loginPageObjects.ananthpurDistrict);
            ShikshaLokamClient.get().report().log(Status.INFO, "Ananathpura District Selected.");        	
        }
    }
    
    public void selectBlock() throws Exception {
        ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(loginPageObjects.blockDropdown);
        ShikshaLokamClient.get().gestures().click(loginPageObjects.blockDropdown);
        if(getEnvironmentValue().contains("diksha")) {
            ShikshaLokamClient.get().gestures().click(loginPageObjects.alappuzhaDistrict);
            ShikshaLokamClient.get().report().log(Status.INFO, "Alappuzha District Selected.");
        } else if(getEnvironmentValue().contains("preprod")) {
            ShikshaLokamClient.get().gestures().click(loginPageObjects.AchhneraBlock);
            ShikshaLokamClient.get().report().log(Status.INFO, "Achhnera Block Selected.");
        } else {
        	ShikshaLokamClient.get().gestures().click(loginPageObjects.AgaliBlock);
            ShikshaLokamClient.get().report().log(Status.INFO, "Agali Block Selected.");        	
        }
    }
    
    
    

    public void clickOnSubmit2() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.courseWindowSubmitButton);
        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Submit");
    }

    public void clickOnUserIcon() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.profile);
        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on User Icon");
    }

    public void clickOnProfileIcon() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.guestIcon);
        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on User Icon");
    }

    public void ClickOnSubmit() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.courseWindowSubmitButton);
        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Submit");
    }

    public void selectProfile() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.profile);
        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on User Icon");
    }
    
    public void clickOnEdit() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.edit);
        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Edit Button");
    }
    //***********
    public void clickOnEdit1() throws Exception {
        loginPageObjects.edit.click();
        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Edit Button");
    }
    
    public void clickOnClear() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.clear);
        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Clear Button"); 
    }
    
    public void clickOnSelectSubrole() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.subroleDropdown);
        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked subrole dropdown"); 
    }
   
    
    public void selectDeo() throws Exception {
    	if(ShikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.DEOsubroleselectedbydefault))
    	{
    		 ShikshaLokamClient.get().report().log(Status.INFO, "Already Selected DEO as Subrole");
    	}
    		// ShikshaLokamClient.get().gestures().click(loginPageObjects.subroleDropdown);
    	 //ShikshaLokamClient.get().report().log(Status.INFO, "Clicked subrole dropdown"); 
    	// Thread.sleep(3000);
		 else {
			 ShikshaLokamClient.get().gestures().click(loginPageObjects.subroleDropdown);
			 ShikshaLokamClient.get().report().log(Status.INFO, "Clicked subrole dropdown");
			 Thread.sleep(3000);
			 js.executeScript("arguments[0].scrollIntoView(true);", loginPageObjects.DEOsubrole);
		  ShikshaLokamClient.get().gestures().click(loginPageObjects.DEOsubrole);
	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected DEO as Subrole");
		
		 }}
    
  
    
    public void clickOnBackbutton() throws Exception {
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.backButton);
        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Back Button");
    }
    
    public void clickOnStateDropdown() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.stateDropdown);
        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on State Dropdown");
    }

    public void selectRoleHTAndOffical() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.schoolHeadOROfficial);
        ShikshaLokamClient.get().report().log(Status.INFO, "select Role as HT & Official");
    }

    public void clickOnContinue() throws Exception {
    	//ShikshaLokamClient.get().gestures().click(loginPageObjects.continueButton);
    	ShikshaLokamClient.get().gestures().waitAndClickElementisVisible(loginPageObjects.continueButton);
    	Logger.logAndReportInfo("Clicked on the continue button");
    }
    
    public void clickOnBoardDropDown() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.boardDropdown);
    	Logger.logAndReportInfo("Clicked on the board drop down");
    }
    
    public void selectcbseOrNcertBoardOption() throws Exception {
    	 if(getEnvironmentValue().contains("diksha")) {
    		 ShikshaLokamClient.get().gestures().click(loginPageObjects.cbseNcertOption);
    	    	Logger.logAndReportInfo("Selected the option cbse or ncert.");
         } else if(getEnvironmentValue().contains("dev")) {
             ShikshaLokamClient.get().gestures().click(loginPageObjects.ncfOption);
             Logger.logAndReportInfo("Selected the option NCF.");      
         } else {
        	 ShikshaLokamClient.get().gestures().click(loginPageObjects.cbseNcertOption);
         	Logger.logAndReportInfo("Selected the option cbse or ncert.");      	
         }
    }
    
    public void clickOnMediumDropDown() throws Exception {
    	//Thread.sleep(1000);
    	//ShikshaLokamClient.get().gestures().click(loginPageObjects.mediumDropdown);
    	ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(loginPageObjects.mediumDropdown);
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.mediumDropdown);
    	Logger.logAndReportInfo("Clicked on the medium drop down");
    }
    
    public void selectEnglishOption() throws Exception {	
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.englishOption);
        Thread.sleep(2000);
    	Logger.logAndReportInfo("Selected the option english.");
    	ShikshaLokamClient.get().gestures().tabKeyAndWait();
    }
    
    public void clickOnClassDropDown() throws Exception {
    	Thread.sleep(2000);
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.gradeLevelDropdown);
    	Logger.logAndReportInfo("Clicked on the board drop down");
    }
    
    public void selectClass1Option() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.class1Option);
    	Thread.sleep(1000);
    	Logger.logAndReportInfo("Selected the option class1.");
    	ShikshaLokamClient.get().gestures().tabKeyAndWait();
    }
    public void clickOnSubmitButtonOnCourseWindow() throws Exception {
    	ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(loginPageObjects.courseWindowSubmitButton);
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.courseWindowSubmitButton);
    	Logger.logAndReportInfo("Clicked on the submit button on BMC selection window.");
    }
    
    
    public void clickOnSubmitButtonOnLocationWindow() throws Exception {
		js.executeScript("arguments[0].click();", loginPageObjects.LocationWindowSubmitButton);
    	//ShikshaLokamClient.get().gestures().click(loginPageObjects.LocationWindowSubmitButton);
    	Logger.logAndReportInfo("Clicked on the submit button on location selection window.");
    }
    
    
    public void clickonForgotPassword() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.forgotPasswordButton);
    	Logger.logAndReportInfo("Clicked on the forgot password button");
    }
    
    public void clickOnLoginWithGoogle() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.signInWithGoogle);
        ShikshaLokamClient.get().report().log(Status.INFO, "Click on sign in with google gmail.");
    }
    
    public void enterEmailToGoolgleSignIn(String emailId) throws Exception {
    ShikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.emailIdToLogin, emailId);
	Logger.logAndReportInfo("entered gmail id is : " + emailId);
    }
    
    public void enterPasswordToGooglePassword(String password) throws Exception {
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.emailPasswordToLogin, password);
    	Logger.logAndReportInfo("entered password is : " + password);
    }
    
    public void clickOnNextButton() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.nextButton);
    	Logger.logAndReportInfo("Clicked on the next button");
    	Thread.sleep(2000);
    }
    
    public void clickOnLoginWithStateSystem() throws Exception {
        ShikshaLokamClient.get().gestures().click(loginPageObjects.signInStateSystem);
        Logger.logAndReportInfo("Clicked on sign in with State System.");
    }
    public void clickOnSelectStateDropDown() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.selectStateDropDownForLogin);
    	Logger.logAndReportInfo("Clicked on the select state dropdown.");
    }
   
    
    public void selectTNStateForStateLoginInStaging() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.TNStateForStateLogin);
    	Logger.logAndReportInfo("Selected the Tamilnadu state from dropdown.");
    }
    
    public void selectPreprodStateForStateLoginInPreprod() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.preprodclientStateLogin);
    	Logger.logAndReportInfo("Selected the Preprod state from dropdown.");
    }
    
    public void clickOnBMCWindowTitle() throws Exception {
    	Thread.sleep(3000);
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.BMCWindowTitle);
    	Logger.logAndReportInfo("Clicked on the BMCWindow title");
    }
    
    public void enterNameInLocationWindow(String userName) throws Exception {
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.nameFieldOnLocationWindow, userName);
    }
    
    public void clickOnProfileIcon1() throws Exception {
    	//ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(loginPageObjects.userProfileIcon);
    	//ShikshaLokamClient.get().gestures().click(loginPageObjects.userProfileIcon);
		js.executeScript("arguments[0].click();", loginPageObjects.userProfileIcon);
    	Logger.logAndReportInfo("Clicked on the user profile icon");
    }
    
    public String getUserNameFromProfile() throws Exception {
    	String actualUserName = ShikshaLokamClient.get().gestures().getText(loginPageObjects.userNameOnProfile);
    	return actualUserName;
    }
    
    public boolean verifyNameOnProfile() throws Exception {
    	ShikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.userNameOnProfile);
    	Logger.logAndReportPass("User name on profile is present");
		return true;
    }
  // = Board, medium, class and location selection
    public void BMCLSelection() throws Exception {
    	 verifyWelcomeTitle();
         selectRoleHTAndOffical();
         clickOnContinue();
         clickOnBoardDropDown();
         selectcbseOrNcertBoardOption();
         Thread.sleep(2000);
         clickOnSubmitButtonOnCourseWindow();
         selectState();
         selectDistrict();
         clickOnSubmitButtonOnLocationWindow();
         verifyHomeButton();
    }
    
    public void enterNameToSearchbox(String nameToSearch) throws Exception {
    	ShikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.searchInputBox, nameToSearch);
    	Logger.logAndReportInfo(" searched thing is : " + nameToSearch);
    }
    
    public void clickOnSerachButton() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.serachButton);
    	Thread.sleep(2000);
    	Logger.logAndReportInfo("clicked on the search button.");
    }
    
    public void clickOnSearchedObservationTitle() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.serachedObservationTitle);
    	Logger.logAndReportInfo("Clicked on the searched observation title.");
    }
    
    public void clickOnSubmitButtonOnStateLogin() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.submitButtonOnStateLogin);
    	Logger.logAndReportInfo("Clicked on the submit button on state login");
    }
    
    public void clickOnHomeButton() throws Exception {
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.homeButton);
    	Logger.logAndReportInfo("Clicked on Home button");
    }
    
    public void refreshpage() throws Exception {
		ShikshaLokamClient.get().driver().navigate().refresh();
ShikshaLokamClient.get().report().log(Status.INFO, "Page refreshed");
 }
    public void browserBackButton() throws Exception {
		ShikshaLokamClient.get().driver().navigate().back();
ShikshaLokamClient.get().report().log(Status.INFO, "clicked on Browser Back Button");
 }
    
    public void clickOnProfileiconAndLogout() throws Exception {
    	ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(loginPageObjects.guestIcon); 
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.guestIcon);
    	Logger.logAndReportInfo("Clicked on Profile Icon ");
    	Thread.sleep(2000);
    	ShikshaLokamClient.get().gestures().click(loginPageObjects.logout);
    	Logger.logAndReportInfo("Clicked on Logout");
    	Thread.sleep(2000);	
    }
    
    //************** Verify Actions *************************************//
    public void verifyObservationTile() throws Exception {
        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.observations),"Observation title is not displayed.");
        Logger.logAndReportPass("Observation title is verified");
    }

	public void verifyWelcomeTitle() throws Exception {
        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.welcomeTitle),"Welocme title is not displayed.");
        Logger.logAndReportPass("Welcome title is displayed succesfully.");
	}
	
	public void verifyHomeButton() throws Exception {
        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.homeButton),"Home button is not displayed.");
		Logger.logAndReportPass("Home button is displayed succesfully");
	}
	
	public void verifyRegisterWindowTitle() throws Exception {
        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.registerTitle),"Register to DIKSHA / Sunbird title is not displayed.");
		Logger.logAndReportPass("Register to DIKSHA / Sunbird title is displayed succesfully.");
	}
	
	public void verifyInvalidLoginError() throws Exception {
        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.loginErorMessage),"Login Error message is not displayed.");
		Logger.logAndReportPass("login error message displayed succesfully.");
	}
	
	public void verifyValidLoginSuccessful() throws Exception {
		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.loginSuccess),"Login Success Hi Username is not displayed.");
		Logger.logAndReportPass("Login Success Hi Username is displayed.");
	}
	
	public void verifyForgotPasswordTitle() throws Exception {
        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.forgotPasswordTitle),"Forgot password window title is not displayed.");
		Logger.logAndReportPass("Forgot password window title is displayed succesfully.");
	}
	
	public void verifySelectYourStateTitle() throws Exception {
        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.selectYourStateTitle),"Select state title is not displayed.");
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
        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.dikshaUATLoginTitle),"Diksha UAT title is not displayed.");
		Logger.logAndReportPass("Diksha UAT login title is displayed succesfully.");
	}
	
	public void verifyDikshaUATLoginTitleForStaging() throws Exception {
        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.dikshaUATLoginTitle),"Diksha UAT title is not displayed.");
		Logger.logAndReportPass("Diksha UAT login title is displayed succesfully.");
	}
	
	   public void verifySubmitButtonEnabled() throws Exception {
		   ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(loginPageObjects.courseWindowSubmitButton);
		   Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(loginPageObjects.courseWindowSubmitButton),"Submit button not Enabled on BMC selection window.");
		   Logger.logAndReportInfo("Submit button is Enabled on BMC selection window.");
	    	ShikshaLokamClient.get().gestures().click(loginPageObjects.courseWindowSubmitButton);
	    	
	    }
	  
	   
	   public void verifySubmitButtonEnabled1() throws Exception {
		   ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(loginPageObjects.courseWindowSubmitButton);
		   Assert.assertFalse(ShikshaLokamClient.get().gestures().isEnabled(loginPageObjects.courseWindowSubmitButton),"Submit button Enabled on BMC selection window.");
		   Logger.logAndReportInfo("Submit button not Enabled on BMC selection window.");
	    	ShikshaLokamClient.get().gestures().click(loginPageObjects.courseWindowSubmitButton);
	    	
	    }
	  
	   public void verifySubmitButtonisDisabled() throws Exception {  
		   Assert.assertFalse(ShikshaLokamClient.get().gestures().isEnabled(loginPageObjects.courseWindowSubmitButton),"Submit button is Enabled on BMC selection window.");
		   Logger.logAndReportInfo("Submit button is disabled on BMC selection window.");
	    		
	    }
	  //waitTillTheElementIsVisibleAndClickable
	    
	    public void verifyYourLocationPopUp() throws Exception {
	    	ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(loginPageObjects.YourLocationPopUp);
	    	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.YourLocationPopUp),"Your Location pop-up is not displayed");  
	    	Logger.logAndReportInfo("Your Location pop-up is displayed");
	    }
	    public void verifySubmitButtonEnabledonPersonaldetailspage() throws Exception {
			   ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(loginPageObjects.submitbuttonpersonadetailspage);
			  Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(loginPageObjects.submitbuttonpersonadetailspage),"Submit button not Enabled on Personal Details page.");
			   Logger.logAndReportInfo("Submit button is Enabled on Personal Details page.");
			   Thread.sleep(2000);
			  ShikshaLokamClient.get().gestures().click(loginPageObjects.submitbuttonpersonadetailspage);
			  Thread.sleep(8000);
		    	
		    }
	    public void verifyLoginScreen() throws Exception {
        	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.loginScreen),"Did not Redirect to Login screen");  
	    	Logger.logAndReportPass("Redirected to Login screen");
	    }
	    
	    
	    ///////////
	    
	    public void BMCLSelection1() throws Exception {
	    	 verifyWelcomeTitle();
	         selectRoleHTAndOffical();
	         clickOnContinue();
	         clickOnBoardDropDown();
	         selectcbseOrNcertBoardOption();
	         Thread.sleep(2000);
	         clickOnSubmitButtonOnCourseWindow();
	         Thread.sleep(2000);
	        //selectState();
	         //selectDistrict();
	         clickOnSubmitButtonOnLocationWindow();
	         verifyHomeButton();
	    }
	    
}
