package com.shikshalokam.pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.objects.CoursePageObjects;
import com.shikshalokam.pages.objects.LoginPageObjects;
import com.shikshalokam.utils.logger.Logger;
import com.shikshalokam.utils.prop.PropUtlis;

public class CoursePageAction {
	CoursePageObjects coursepageObjects;
	  LoginPageObjects loginPageObjects;
	 public CoursePageAction() throws Exception {
		 coursepageObjects = PageFactory.initElements(ShikshaLokamClient.get().driver(), CoursePageObjects.class);
	    }
	      SoftAssert softAssert = new SoftAssert();

	    JavascriptExecutor js = (JavascriptExecutor) ShikshaLokamClient.get().driver();
	    
	    String appUrl;
	    public String getEnvironmentValue() throws Exception {
	    	return appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
	    }
	    
	    
	    public void verifyCourseButton() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(coursepageObjects.coursesButton),"Course button is not displayed.");
    		Logger.logAndReportPass("Course button button is displayed succesfully");
    	}
	    
	    public void clickOnCoursesButton() throws Exception {
    		ShikshaLokamClient.get().gestures().click(coursepageObjects.coursesButton);
    		Logger.logAndReportInfo("Clicked on the Courses button");
    	}
	    
	    public void clickOnWorkspace() throws Exception {
    		ShikshaLokamClient.get().gestures().click(coursepageObjects.workspace);
    		Logger.logAndReportInfo("Clicked on the Workspace");
    	}
	    
	    public void searchForOngoinCourse() throws Exception {
	    	if(getEnvironmentValue().contains("diksha")) {
	    		 ShikshaLokamClient.get().report().log(Status.INFO, "NO ");
	    	}
	    	 else if(getEnvironmentValue().contains("preprod")) {
	    		 ShikshaLokamClient.get().gestures().sendValueToTextBox(coursepageObjects.searchfield, "do_2137765795439984641158");
	   	    		ShikshaLokamClient.get().gestures().click(coursepageObjects.searchbutton);
	  	    		Logger.logAndReportInfo("Searched for Automation testing course");
	   	    		//Thread.sleep(2000);
    	    		 ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.ongoingCourse);	    	    		
    	    		 ShikshaLokamClient.get().gestures().click(coursepageObjects.ongoingCourse);
	    	    		Logger.logAndReportInfo("Selected Automation testing course");
	    	    		Thread.sleep(2000);
	    	}
	    		 else {
    		ShikshaLokamClient.get().gestures().sendValueToTextBox(coursepageObjects.searchfield, "do_2137730803486720001382");
    		ShikshaLokamClient.get().gestures().click(coursepageObjects.searchbutton);
    		Logger.logAndReportInfo("Searched for Automation testing course");
    		//Thread.sleep(2000);
    		 ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.ongoingCourse);
    		ShikshaLokamClient.get().gestures().click(coursepageObjects.ongoingCourse);
    		Logger.logAndReportInfo("Selected Automation testing course");
    		Thread.sleep(2000);
    	}}
	    
	    
	    public void verifyJoinCourseButtonisEnabled() throws Exception {
	    	ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.joinCourseButton);
	    	Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(coursepageObjects.joinCourseButton),"Join Button not Enabled for Ongoin Course.");
			   Logger.logAndReportPass("Join Button is Enabled for Ongoin Course.");
    		
    	}
	    public void clickCreateCourse() throws Exception {
    		ShikshaLokamClient.get().gestures().click(coursepageObjects.createCourse);
    		Logger.logAndReportInfo("Clicked on the Course Button in Myworkspace Page");
    	}
	    //selectAllandDelete
	    public void enterCourseTitle(String courseName) throws Exception {
	    	 //ShikshaLokamClient.get().gestures().click(coursepageObjects.coursetitle);
	    	// ShikshaLokamClient.get().gestures().selectAllandDelete();
	    	ShikshaLokamClient.get().gestures().clear(coursepageObjects.coursetitle);
	         ShikshaLokamClient.get().gestures().sendValueToTextBox(coursepageObjects.coursetitle, courseName);
	         ShikshaLokamClient.get().report().log(Status.INFO, "Entered course name is : " + courseName );
	    }
	    
	    public void fillMandatoryFields() throws Exception {
	    	//ShikshaLokamClient.get().gestures().click(coursepageObjects.coursetitle);
	    	ShikshaLokamClient.get().gestures().sendValueToTextBox(coursepageObjects.enterKeywords, "AutomationIsKeyToSuccess");
	    	//Logger.logAndReportInfo("Entered : AutomationIsKeyToSuccess ");
    		//Thread.sleep(2000);	
	    	ShikshaLokamClient.get().gestures().click(coursepageObjects.courseTypeDropdown);
    	//Logger.logAndReportInfo("Clicked on coursetype ");
    		ShikshaLokamClient.get().gestures().click(coursepageObjects.courseTypeTamilNadu);
    		//Logger.logAndReportInfo("Selected TamilNadu Course Type ");
    		ShikshaLokamClient.get().gestures().PressEsc();
    		//Thread.sleep(2000);	
    		ShikshaLokamClient.get().gestures().click(coursepageObjects.selectSubjectDropdown);
    	//Logger.logAndReportInfo("Clicked on SelectSubject ");
    		 ShikshaLokamClient.get().gestures().click(coursepageObjects.selectSubjectAccountancy);
    		//Logger.logAndReportInfo("Selected Accountancy Subject " );
    		ShikshaLokamClient.get().gestures().PressEsc();
    		
    		js.executeScript("arguments[0].scrollIntoView(true);", coursepageObjects.selectSyllabusDropdown);
    		ShikshaLokamClient.get().gestures().click(coursepageObjects.selectSyllabusDropdown);
    	//Logger.logAndReportInfo("Clicked on SelectSubject ");
    		 ShikshaLokamClient.get().gestures().click(coursepageObjects.selectSyllabusTamilNadu);
    		ShikshaLokamClient.get().gestures().PressEsc();
    		
    		js.executeScript("arguments[0].scrollIntoView(true);", coursepageObjects.selectMediumDropdown);
    		ShikshaLokamClient.get().gestures().click(coursepageObjects.selectMediumDropdown);
    	//Logger.logAndReportInfo("Clicked on SelectSubject ");
    		 ShikshaLokamClient.get().gestures().click(coursepageObjects.selectMediumEnglish);
    		//ShikshaLokamClient.get().gestures().PressEsc();
    		
     		js.executeScript("arguments[0].scrollIntoView(true);", coursepageObjects.selectClassDropdown);
    		 ShikshaLokamClient.get().gestures().click(coursepageObjects.selectClassDropdown);
     	//Logger.logAndReportInfo("Clicked on SelectSubject ");
     		 ShikshaLokamClient.get().gestures().click(coursepageObjects.selectClass1);
    		
      		js.executeScript("arguments[0].scrollIntoView(true);", coursepageObjects.selectSubject1Dropdown);
     		 ShikshaLokamClient.get().gestures().click(coursepageObjects.selectSubject1Dropdown);
      	//Logger.logAndReportInfo("Clicked on SelectSubject ");
      		 ShikshaLokamClient.get().gestures().click(coursepageObjects.selectSubjectEnglish1);
      		 
       		js.executeScript("arguments[0].scrollIntoView(true);", coursepageObjects.copyrightYear);
      		 ShikshaLokamClient.get().gestures().sendValueToTextBox(coursepageObjects.copyrightYear, "2022");
	      //  ShikshaLokamClient.get().report().log(Status.INFO, "Entered 2022 " );
    		
	    }
	    
	    public void clickAddChild() throws Exception {
    		ShikshaLokamClient.get().gestures().click(coursepageObjects.addChild);
    		Logger.logAndReportInfo("Clicked on Add Child Button ");
    	}
	    
	    public void clickaddfromLibrary() throws Exception {
    		ShikshaLokamClient.get().gestures().click(coursepageObjects.addfromLibrary);
    		Logger.logAndReportInfo("Clicked on Add from Library ");
    		Thread.sleep(2000);
    	}
	    
	    public void selectContentfromLibrary() throws Exception {
	    	//js.executeScript("arguments[0].scrollIntoView(true);", coursepageObjects.selectContent1);
    		//ShikshaLokamClient.get().gestures().click(coursepageObjects.selectContent1);
    		//Logger.logAndReportInfo("Selected content from Library ");
	    	js.executeScript("arguments[0].scrollIntoView(true);", coursepageObjects.selectContentButton);
    		ShikshaLokamClient.get().gestures().click(coursepageObjects.selectContentButton);
    		Logger.logAndReportInfo("Clicked on Select Content Button ");
    		Thread.sleep(2000);

    	}
	    
	    public void verifyWhereDoYouWantToAddThisContentPopup() throws Exception {
	    	ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.contentPopup);
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(coursepageObjects.contentPopup),"Where Do You Want To Add This Content Popup Pop-up is not displayed.");
			Logger.logAndReportPass("Where Do You Want To Add This Content Popup Pop-up  is displayed.");
			ShikshaLokamClient.get().gestures().click(coursepageObjects.addContentButtonOnPopup);
    		Logger.logAndReportInfo("Clicked on Add Content On Popup ");
    		Thread.sleep(5000);

		}
	    
	    public void clickOnBackButton() throws Exception {
	    	js.executeScript("arguments[0].scrollIntoView(true);", coursepageObjects.backButton);
	    	ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.backButton);
    		ShikshaLokamClient.get().gestures().click(coursepageObjects.backButton);
    		Logger.logAndReportInfo("Clicked on Back Button ");
    	}
	    
	    public void verifyandClickOnSendForReviewButton() throws Exception {
	    	ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.sendforReview);
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(coursepageObjects.sendforReview),"Send For Review Button  is not displayed.");
			Logger.logAndReportPass("Send For Review Button is displayed.");
			ShikshaLokamClient.get().gestures().click(coursepageObjects.sendforReview);
			Logger.logAndReportPass("Clicked On Send For Review Button.");
	    }
	    
	    public void verifyTandCPopupandClickOnAgreeandSubmit() throws Exception {
	    	ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.tAndcPopup);
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(coursepageObjects.tAndcPopup),"Terms and Condition Pop-up is not displayed.");
			Logger.logAndReportPass("Terms and Condition Pop-up  is displayed.");
			ShikshaLokamClient.get().gestures().click(coursepageObjects.agreeTandC);
    		Logger.logAndReportInfo("Clicked on Agree TandC ");
    		
    		ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.submitButtonOnTandCPopup);
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(coursepageObjects.submitButtonOnTandCPopup),"Submit Button On Terms and Condition Pop up is not Enabled");
			Logger.logAndReportPass("Submit Button On Terms and Condition Pop up is Enabled");
    		Thread.sleep(2000);
    		ShikshaLokamClient.get().gestures().click(coursepageObjects.submitButtonOnTandCPopup);
    		Logger.logAndReportInfo("Clicked on Submit Button on TandC Popup ");
    		Thread.sleep(2000);

		}
	    public void clickOnProfileiconAndLogout() throws Exception {
	    	ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.guestIcon); 
	    	ShikshaLokamClient.get().gestures().click(coursepageObjects.guestIcon);
	    	Logger.logAndReportInfo("Clicked on Profile Icon ");
	    	Thread.sleep(2000);
	    	ShikshaLokamClient.get().gestures().click(coursepageObjects.logout);
	    	Logger.logAndReportInfo("Clicked on Logout");
	    	Thread.sleep(2000);	
    	}
	    public void clickOnUpforReview() throws Exception {
    		ShikshaLokamClient.get().gestures().click(coursepageObjects.upforReview);
    		Logger.logAndReportInfo("Clicked on Up for Review ");
    		Thread.sleep(2000);
	    }
	    
	    public void searchUpforReviewCourse(String courseName) throws Exception {
	    ShikshaLokamClient.get().gestures().sendValueToTextBox(coursepageObjects.upforReviewSearchBox, courseName);
        ShikshaLokamClient.get().report().log(Status.INFO, "Searched for course name : " + courseName );
        Thread.sleep(3000);
        }
	    
	    public void verifyandClickOnPublishButton() throws Exception {
	    	ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.publishButton);
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(coursepageObjects.publishButton),"Publish Button is not displayed.");
			Logger.logAndReportPass("Publish Button is displayed.");
			ShikshaLokamClient.get().gestures().click(coursepageObjects.publishButton);
			Logger.logAndReportPass("Clicked On Publish Button.");
	    }
	    
	    public void selectFirstSearchResult() throws Exception {
	    	ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.firstSeacrhResult);
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(coursepageObjects.firstSeacrhResult),"Searched Result Not Found");
    		ShikshaLokamClient.get().gestures().click(coursepageObjects.firstSeacrhResult);
    		Logger.logAndReportInfo("Clicked on first Search Result ");
    		Thread.sleep(2000);
	    }
	    public void verifyPublishCollectionPopUp() throws Exception {
	    ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.publishCollectionPopUp);
        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(coursepageObjects.publishCollectionPopUp),"Publish Collection Pop-up is not displayed.");
		Logger.logAndReportPass("Publish Collection Pop-up is displayed.");
		ShikshaLokamClient.get().gestures().click(coursepageObjects.noButtonOnCollectionPopUp);
		//Logger.logAndReportInfo("Clicked on Agree TandC ");
	    }
		

}
