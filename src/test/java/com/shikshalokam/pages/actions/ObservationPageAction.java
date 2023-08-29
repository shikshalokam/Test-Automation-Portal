package com.shikshalokam.pages.actions;

import static org.testng.Assert.assertFalse;

import java.io.File;
import java.util.Map;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.objects.LoginPageObjects;
import com.shikshalokam.pages.objects.ObservationPageObjects;
import com.shikshalokam.utils.gSheet.TestData;
import com.shikshalokam.utils.logger.Logger;
import com.shikshalokam.utils.prop.PropUtlis;

public class ObservationPageAction {
	
	 Map<String, String> observationPageTestData;
	 
	LoginPageObjects loginPageObjects = new LoginPageObjects();
    ObservationPageObjects observationPageObjects = new ObservationPageObjects();
    
    String filepath = System.getProperty("user.dir");

    JavascriptExecutor js = (JavascriptExecutor) ShikshaLokamClient.get().driver();
//    js.executeScript("window.scrollBy(0,250)", "");
    
    SoftAssert softAssert = new SoftAssert();
    
    String appUrl;
    public String getEnvironmentValue() throws Exception {
    	return appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
    }
    
    public ObservationPageAction() throws Exception {
    	observationPageObjects = PageFactory.initElements(ShikshaLokamClient.get().driver(), ObservationPageObjects.class);
    }
        //******************Actions*********************************************************//
    		
    	public void clickOnObservationButton() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.observationButton);
    		Thread.sleep(1000);
    		Logger.logAndReportInfo("Clicked on the observation button");
    	}
    	
    	public void clickOnUpdateButtonOnProfileUpdatePopup() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.profileUpdatePopupButton);
    		Logger.logAndReportInfo("Clicked on the update button on profile update popup");
    	}
    	
    	
    	public void clickOnUdateButtonOnPersonalDetailsWindow() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.profileUpdatePopupButton);
    		Logger.logAndReportInfo("Clicked on the submit button on personal details window.");
    	}
    	
    	public void clickOnObservationWithRub_SliderWithScore() throws Exception {
    		//js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.observationWithRubic);
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.observationWithRubic);
    		Logger.logAndReportInfo("Clicked on the observation with rub only slider with score.");
    	}
    	
    	public void clickOnEntityDeleteOption() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.deleteButtonForEntity);
    		Logger.logAndReportInfo("Clicked on the entity delete option");
    	}
    	
    	public void clickOnEntityDeleteConfirmationYes() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.yesConfirmationForEntityDelete);
    		Logger.logAndReportInfo("Clicked on the yes confirmation for entity deletion.");
    	}
    	
    	public void clickOnAddSchoolButton() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.addSchoolForEntity);
    		Logger.logAndReportInfo("Clicked on the Add School Button ");
    		Thread.sleep(2000);
    	}
    	
    	public void selectFirstEntityAsSchool() throws Exception {
        	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.firstEntity);
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.firstEntity);
    		Logger.logAndReportInfo("Selected first entity for the school.");
    	}
    	
    	public void selectHanumanahallyEntityAsSchool() throws Exception {
        	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.hanumanahalliEntity);
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.hanumanahalliEntity);
    		Logger.logAndReportInfo("Selected hanumanahally entity for the school.");
    	}
    	
    	public void clickOnSubmitButtonOnAddEntityWindow() throws Exception {
        	ShikshaLokamClient.get().gestures().click(observationPageObjects.submitButtonOnAddEntityWindow);
    		Logger.logAndReportInfo("Clicked on the submit button on add entity window.");
    		Thread.sleep(1000);
    	}
    	
    	public void selectAddedEntity() throws Exception {
        	ShikshaLokamClient.get().gestures().click(observationPageObjects.addedEntity);
    		Logger.logAndReportInfo("Clicked on Added Entity.");
    		Thread.sleep(1000);
    	}
    	
    	public void clickOnObserveAgainButton() throws Exception {
    		//ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(observationPageObjects.observeAgainButton);;
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.observeAgainButton);
    		Logger.logAndReportInfo("Clicked on the observe again button.");
    	}
    	
    	public void clickOnObservation1TitleWithRubric() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.observation1TitleWithRubric);
    		Logger.logAndReportInfo("Clicked on the observation 1 Title.");
    	}
    	
    	public void clickOnObservation1TitleWithoutRubric() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.observation1TitleObsWithoutRubric);
    		Logger.logAndReportInfo("Clicked on the observation 1 Title.");
    	}
    	
    	public void clickOnObserveAgainYesConfirmation() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.yesConfirmationObserveAgain);
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.observeAgainButton);
    		Logger.logAndReportInfo("Clicked on the yes button for observe again button.");
    	}
    	
    	public void clickOnThreeDotEllipseOnObservation() throws Exception {
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.observeAgainButton);
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.threeDotOnObservation);
    		Logger.logAndReportInfo("Clicked on the three dot on observation. ");
    		Thread.sleep(2000);
    	}
    	
    	public void clickOnDeleteOptionFromThreeDotObservation() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.deleteOptionForObservation);
    		//ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(observationPageObjects.deleteOptionForObservation);
    		//js.executeScript("arguments[0].click();", observationPageObjects.deleteOptionForObservation);
    		Logger.logAndReportInfo("Clicked on the delete option from observation three dot ellipse.");
    		Thread.sleep(2000);
    	}
    	
    	public void clickOnYesConfirmationForObservationDelete() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.yesConfirmationForObservationDelete);
    		Logger.logAndReportInfo("Clicked on the yes confirmation for deleting observation.");
    		Thread.sleep(3000);
    	}
    	public void clickOnBackButton() throws Exception {
    		js.executeScript("arguments[0].click();", observationPageObjects.backButton);
    		//js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.backButton);
    		//ShikshaLokamClient.get().gestures().click(observationPageObjects.backButton);
    		Logger.logAndReportInfo("Clicked on the back button on the observation page.");
    	}
    	
    	public void clickOnStartButtonOnObservation() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.startButtonForObservation);
    		Logger.logAndReportInfo("Clicked on the start button from observation.");
    	}
    	
    	public void clickOnObservationParentChild() throws Exception {
    		//ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(observationPageObjects.parentChildObservation);
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parentChildObservation);
    		Logger.logAndReportInfo("Clicked on the parent child observation.");
    	}
    	
    	public void clickOnObservationWithoutRubric2() throws Exception {
    		/*js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.ObsWithoutRubric2);
    		Thread.sleep(2000);
    		ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(observationPageObjects.ObsWithoutRubric2);
		    ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Without rubric 2.");   */
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.ObsWithoutRubric2);
    	    Logger.logAndReportInfo("Clicked on Without rubric 2.");
    	}
    	//parent child actions
    	/*public void clickOn1stAnswerFor1stParent() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent1firstAnswer);
    		Logger.logAndReportInfo("Clicked on the parent1 first answer");
    	}
    	
    	public void clickOnParent1Child1FirstAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.child1FirstAnswer);
    		Logger.logAndReportInfo("Clicked on the child 1 question first answer ");
    	}*/
    	
    	public void clickOnSaveObservationForm() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.saveButtonForObservation);
    		Logger.logAndReportInfo("Clicked on the save button on observation question form");
    	}
    	
    	public void clickOnSaveFormConirmationYes() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.yesConfirmationForSaveForm);
    		Logger.logAndReportInfo("Clicked on the Yes confirmation to save observation form.");
    	}
    	
    	/*public void clickOnQ2ParentSecondAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent2SecondAnswer);
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.parent2SecondAnswer);
    		Logger.logAndReportInfo("Clicked on the parenet 2 question second answer");
    	}
    	
    	public void clickOnParent2Child2firstAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.child2SecondAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 2 child 2 second answer");
    	}
    	
    	public void clickOnParent3FirstAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent3Child1Answer);
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.parent3Child1Answer);
    		Logger.logAndReportInfo("Clicked on the parent 3 first answer.");
    	}
    	
    	public void clickOnParent3FirstChildFirstAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent3Child1FirstAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 3 child 1 first answer.");
    	}
    	*/
    	// parent child click operations
    	public void clickOnParent1QuestionFirstAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent1QuestionfirstAnswer);
    		Logger.logAndReportInfo("Clicked on the Parent 1 question first answer.");;
    	}
    	
    	public void clickOnParent1Child1QuestionFirstAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent1Child1FirstAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 1 child 1 first answer.");
    	}
    	
    	public void clickOnParent2QuestionSecondAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent2QuestionSecondAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 2 question second answer.");
    	}
    	
    	public void clickOnParent2Child2QuestionSecondAnswer() throws Exception {
    		js.executeScript("arguments[0].click();", observationPageObjects.parent2Child2SecondAnswer);
    		//ShikshaLokamClient.get().gestures().click(observationPageObjects.parent2Child2SecondAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 2 child 2 second answer ");
    	}
    	
    	public void clickOnParent3QuestionFirstAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent3QuestionFirstAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 3 question first answer.");
    	}
    	
    	public void clickOnParent3Child1FirstAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent3Child1FirstAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 3 child 1 first answer.");
    	}
    	
    	
    	public void clickOnSubmitButtonOnQuestionForm() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.submitButtonForObservation);
    		Logger.logAndReportInfo("Clicked on the submit button on observation form.");
    	}
    	
    	public void clickOnContinueButtonOnSaveObservationForm() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.continueButtonOnFormSavePopup);
    		Logger.logAndReportInfo("Clicked on the continue button on observation form save");
    	}
    	
    	public void clickOnSubmitButtonOnObservationSaveForm() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.submitButtonForObservation);
    		Logger.logAndReportInfo("Clicked on the submit button on Observation form.");
    	}
    	
    	public void clickOnYesForSubmitFormConfirmation() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.yesConfirmationForSubmitForm);
    		Logger.logAndReportInfo("Clicked on the yes confirmation on submitting the form.");
    	}
    	
    	public void clickOnOkButtonOnSubmitFormSuccess() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.okButtonOnFormSubmitSuccessMsg);
    		Logger.logAndReportInfo("Clicked on the Ok button on form submit success msg.");
    	}
    	
    	public void clickOnSearchedObservationTitle() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.observationTitleForSearch);
    		Logger.logAndReportInfo("Clicked on the serached observation title.");
    	}
    	
    	public void clickOnOkButtonOnEvidenceUploadedPopup() throws Exception {
    	 ShikshaLokamClient.get().gestures().click(observationPageObjects.okOnevidenceUplodedPopup);
    	 Logger.logAndReportInfo("Clicked on the Ok button on Evidence Uploaded Popup"); 
    	}
  
    	/*  	public void clickOnSearchedObsworubric2() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.Obsworubric2);
    		Logger.logAndReportInfo("Clicked on the obsworubric2."); 
    	} */
    	
    	
    	public void selectSchoolEntityobservation() throws Exception {
               if(getEnvironmentValue().contains("diksha")) {
                ShikshaLokamClient.get().gestures().click(loginPageObjects.alappuzhaDistrict);
                ShikshaLokamClient.get().report().log(Status.INFO, "Alappuzha District Selected.");
            } else if(getEnvironmentValue().contains("preprod")) {
                ShikshaLokamClient.get().gestures().click(observationPageObjects.SchoolEnityNotAddedObsPreprod);
                ShikshaLokamClient.get().report().log(Status.INFO, "Testing project 5.1observation 5B 928.");
            } else {
            	ShikshaLokamClient.get().gestures().click(observationPageObjects.SchoolEnityNotAddedObsStaging);
                ShikshaLokamClient.get().report().log(Status.INFO, "Solution with rubrics -File button – FD-429");        	
            }
        }
    	
    	public void selectBlockEntityobservation() throws Exception {
            if(getEnvironmentValue().contains("diksha")) {
             ShikshaLokamClient.get().gestures().click(loginPageObjects.alappuzhaDistrict);
             ShikshaLokamClient.get().report().log(Status.INFO, "Alappuzha District Selected.");
         } else if(getEnvironmentValue().contains("preprod")) {
             ShikshaLokamClient.get().gestures().click(observationPageObjects.BlockEnityNotAddedObsPreprod);
             ShikshaLokamClient.get().report().log(Status.INFO, "Infrastructure Assessment- Furniture.");
         } else {
         	ShikshaLokamClient.get().gestures().click(observationPageObjects.BlockEnityNotAddedObsStaging);
             ShikshaLokamClient.get().report().log(Status.INFO, "QA solution - entity type block - FD 335']");        	
         }
     }
    	
    	
    	public void selectCreditAndLicenceobservation() throws Exception {
            if(getEnvironmentValue().contains("diksha")) {
             ShikshaLokamClient.get().gestures().click(loginPageObjects.alappuzhaDistrict);
             ShikshaLokamClient.get().report().log(Status.INFO, "Alappuzha District Selected.");
         } else if(getEnvironmentValue().contains("preprod")) {
             ShikshaLokamClient.get().gestures().click(observationPageObjects.BlockEnityNotAddedObsPreprod);
             ShikshaLokamClient.get().report().log(Status.INFO, "Credits And License Observation.");
         } else {
         	ShikshaLokamClient.get().gestures().click(observationPageObjects.CerditsAndLicenceObsStaging);
             ShikshaLokamClient.get().report().log(Status.INFO, "Credits And License Observation");        	
         }
     }
    	
    	 public void clickOnSchoolEntityobsevation() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.SchoolEnityNotAddedObsStaging);
    	        ShikshaLokamClient.get().report().log(Status.INFO, "Solution with rubrics -File button – FD-429");
    		
    		 }
    	 
    	 public void clickOnBlockEntityobsevation() throws Exception {
    		 ShikshaLokamClient.get().gestures().click(observationPageObjects.BlockEnityNotAddedObsStaging);
    	        ShikshaLokamClient.get().report().log(Status.INFO, "QA solution - entity type block - FD 335']");
    		
    		 }
    	 
    	 public void clickOnCreditAndLicenceobservation() throws Exception {
    		 ShikshaLokamClient.get().gestures().click(observationPageObjects.CerditsAndLicenceObsStaging);
    	        ShikshaLokamClient.get().report().log(Status.INFO, "Credits And License Observation");
    		
    		 }
    	
    	 
    	 public void clickOnCreditAndLicencedropdown() throws Exception {
    		 ShikshaLokamClient.get().gestures().click(observationPageObjects.CerditsAndLicenceDroapdown);
    	        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Credits And License Dropdown");
    	 }
    	 
    	 public void savePartiallyFilledObservationForm() throws Exception {
    		 clickOnSaveObservationForm();
  	   		clickOnSaveFormConirmationYes();
  	   		verifyFormSaveSuccessMsg(observationPageTestData.get("observationFormSaveSuccessMsg"));
  	   		Logger.logAndReportInfo("Saved Partially filled form");
  	   		clickOnContinueButtonOnSaveObservationForm();
    	 }
    	 
    	 public void submitObservationForm() throws Exception {
    	  clickOnSubmitButtonOnObservationSaveForm();
  		  clickOnYesForSubmitFormConfirmation();
  		  verifyFormSubmitSuccessMsg(observationPageTestData.get("observationFormSubmitSuccessMsg"));   
  		  clickOnOkButtonOnSubmitFormSuccess(); 
  		  Thread.sleep(3000);
    	 }
    	 
    	 public void clickOnObservationTileunderBrowseOtherCategories() throws Exception {
     		ShikshaLokamClient.get().gestures().click(observationPageObjects.observationTileunderBrowseOtherCategories);
     		Thread.sleep(1000);
     		Logger.logAndReportInfo("Clicked on the observation Tile");
     	}
    	 
    	 public void clickOnObservationWithRubricMultipleSubmission() throws Exception {
     		//js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.observationWithRubic);
     		ShikshaLokamClient.get().gestures().click(observationPageObjects.observationWithRubricMultipleSubmission);
     		Logger.logAndReportInfo("Clicked on Automation rubric with multiple submission - Teacher");
     	}
    	 
    	 
    	 public void verifyObservationDetailsPageForWithRubricmultipleSubmission() throws Exception {
    		 clickOnEntityDeleteOption();
    		 clickOnEntityDeleteConfirmationYes();
    		 clickOnAddSchoolButton();
    		 selectFirstEntityAsSchool();
    		 clickOnSubmitButtonOnAddEntityWindow();
    		 selectAddedEntity();   
    		 clickOnObserveAgainButton();
             clickOnObserveAgainYesConfirmation();
             verifyObservation1TitleWithRubric();
             clickOnObservation1TitleWithRubric();
   		     verifyStartButtonFromObservation();
  		     clickOnThreeDotEllipseOnObservation();
   	         clickOnDeleteOptionFromThreeDotObservation();
             clickOnYesConfirmationForObservationDelete();
    		 
      	}
    	 
    	 public void saveAndSubmitObservationWithRubricMultipleSubmission() throws Exception {
    		 observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
    		 
    		 ShikshaLokamClient.get().gestures().click(observationPageObjects.fifthEntity);
    		 Logger.logAndReportInfo("Clicked on fifth added entity");
    		 clickOnObserveAgainButton();
    		 clickOnObserveAgainYesConfirmation();
    		 Thread.sleep(3000);
    		 ShikshaLokamClient.get().gestures().click(observationPageObjects.addedInstance);
    		 Logger.logAndReportInfo("Clicked on Added instance");
    		 
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.domain1),"Domain 1 section is not displayed.");
     		Logger.logAndReportPass("Domain 1 section is displayed succesfully");
     		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.domain1StartButton),"Start Button is not displayed.");
     		Logger.logAndReportPass("Start Button is displayed succesfully");
     		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.domain2),"Domain 2 section is not displayed.");
      		Logger.logAndReportPass("Domain 2 section is displayed succesfully");
      		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.domain2StartButton),"Start Button is not displayed.");
     		Logger.logAndReportPass("Start Button is displayed succesfully");
     		
        	ShikshaLokamClient.get().gestures().click(observationPageObjects.domain1StartButton);
     		Logger.logAndReportInfo("Clicked on Domain 1 Start Button");
     		
     		observationPageObjects.domain1Answer1.sendKeys("Hardwork");
    		Logger.logAndReportInfo("Answered first Question");
    		observationPageObjects.domain1Answer2.sendKeys("25");
    		Logger.logAndReportInfo("Answered second Question");
    		Thread.sleep(2000);
    		
    		js.executeScript("arguments[0].click();", observationPageObjects.domain1Answer3);
    		//ShikshaLokamClient.get().gestures().click(observationPageObjects.domain1Answer3);
     		Logger.logAndReportInfo("Answered third Question");
     		
     		clickOnSaveObservationForm();
     		clickOnSaveFormConirmationYes();
     		verifyFormSaveSuccessMsg(observationPageTestData.get("observationFormSaveSuccessMsg"));
     		Logger.logAndReportInfo("Saved Partially filled form");
     		clickOnContinueButtonOnSaveObservationForm();
     		
     		js.executeScript("arguments[0].click();", observationPageObjects.domain1Answer4);
     		//ShikshaLokamClient.get().gestures().click(observationPageObjects.domain1Answer4);
     		Logger.logAndReportInfo("Answered fourth Question");
     		
     		clickOnSubmitButtonOnObservationSaveForm();
     		clickOnYesForSubmitFormConfirmation();
     		verifyFormSubmitSuccessMsg(observationPageTestData.get("observationFormSubmitSuccessMsg"));  
     		clickOnOkButtonOnSubmitFormSuccess();
     		
     		ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.fifthEntity);
     		ShikshaLokamClient.get().gestures().click(observationPageObjects.fifthEntity);
   		    Logger.logAndReportInfo("Clicked on fifth added entity");
   		    Thread.sleep(3000);
		    ShikshaLokamClient.get().gestures().click(observationPageObjects.addedInstance);
		    Logger.logAndReportInfo("Clicked on Added instance");
		     
  
		    ShikshaLokamClient.get().gestures().click(observationPageObjects.domain2StartButton);
     		Logger.logAndReportInfo("Clicked on Domain 2 Start Button");
     		
     		//js.executeScript("arguments[0].click();", observationPageObjects.domain2Answer5);
     		ShikshaLokamClient.get().gestures().click(observationPageObjects.domain2Answer5);
     		Logger.logAndReportInfo("Answered fifth Question");
     		
	    	observationPageObjects.fileUpload1.sendKeys(filepath+"//Fileupload_files//Shikshalokam.jpg");
	    	 
	    	 verifyEvidenceUploadedPopup();
	    	 clickOnOkButtonOnEvidenceUploadedPopup();
	    	 
     		js.executeScript("arguments[0].click();", observationPageObjects.domain2Answer6);
     		Logger.logAndReportInfo("Answered sixth Question");
     		
     		observationPageObjects.fileUpload2.sendKeys(filepath+"//Fileupload_files//videoupload.mp4");
     		Thread.sleep(3000);
     	    verifyEvidenceUploadedPopup();
	        clickOnOkButtonOnEvidenceUploadedPopup();
	       
	        savePartiallyFilledObservationForm();
	    	 
	    	js.executeScript("arguments[0].click();", observationPageObjects.domain2Answer7);
	    	observationPageObjects.domain2Answer7.sendKeys("15 August 2023");
	    	ShikshaLokamClient.get().gestures().PressEsc();
	    	Logger.logAndReportInfo("Answered seventh Question");
	    	
	    	submitObservationForm();
    		
      	}
    	 
    	 public void clickOnObservationWithoutRubric() throws Exception {
      		//js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.observationWithRubic);
      		ShikshaLokamClient.get().gestures().click(observationPageObjects.observationWithoutRubric);
      		Logger.logAndReportInfo("Clicked on Automation rubric without submission - Teacher");
      		
      	}
    	 
    	 public void verifyObservationDetailsPageForWithoutRubricmultipleSubmission() throws Exception {
    		 clickOnEntityDeleteOption();
    		 clickOnEntityDeleteConfirmationYes();
    		 clickOnAddSchoolButton();
    		 selectFirstEntityAsSchool();
    		 clickOnSubmitButtonOnAddEntityWindow();
    		 selectAddedEntity();   
    		 clickOnObserveAgainButton();
             clickOnObserveAgainYesConfirmation();
             verifyObservation1TitleWithOutRubric();
             clickOnObservation1TitleWithoutRubric();
   		     verifyStartButtonFromObservation();
  		     clickOnThreeDotEllipseOnObservation();
   	         clickOnDeleteOptionFromThreeDotObservation();
             clickOnYesConfirmationForObservationDelete();
    		 
      	}
    	 
    	 public void saveAndSubmitObservationWithoutRubric() throws Exception {
    		 observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
    		 
    		 ShikshaLokamClient.get().gestures().click(observationPageObjects.fifthEntity);
    		 Logger.logAndReportInfo("Clicked on fifth added entity");
    		 clickOnObserveAgainButton();
    		 clickOnObserveAgainYesConfirmation();
    		 Thread.sleep(3000);
    		 //ShikshaLokamClient.get().gestures().click(observationPageObjects.addedInstance);
    		 //Logger.logAndReportInfo("Clicked on Added instance");
    		 verifyStartButtonFromObservation();
    		 clickOnStartButtonOnObservation();
    		 
    		 ShikshaLokamClient.get().gestures().click(observationPageObjects.withOutRubricAnswer1);
    		 Logger.logAndReportInfo("Answered first Question");
   //****** 		 
    		 ShikshaLokamClient.get().gestures().click(observationPageObjects.addFile1);
    		 Logger.logAndReportInfo("Clicked on Add file ");
    		 
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.privacyPolicyPopup),"Privacy Policy Pop-up is not present .");
       		Logger.logAndReportPass("Privacy Policy Pop-up is present");
       		
       		Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(observationPageObjects.doNotUploadButtonOnPrivacyPolicyPopup),"Do not Upload Button is enabled by default on Privacy Policy Pop-up .");
       		Logger.logAndReportPass("Do not Upload Button is not enabled by default on Privacy Policy Pop-up .");
       		
       	    ShikshaLokamClient.get().gestures().click(observationPageObjects.acceptCheckBoxOnPrivacyPolicyPopup);
		    Logger.logAndReportInfo("Clicked on Checkbox on Privacy Policy Pop-up");
		    Thread.sleep(2000);
		    
		    Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(observationPageObjects.uploadButtonOnPrivacyPolicyPopup),"Upload Button is enabled on Privacy Policy Pop-up .");
       		Logger.logAndReportPass("Upload Button is enabled on Privacy Policy Pop-up .");
       		
       		ShikshaLokamClient.get().gestures().click(observationPageObjects.closeIconOnPrivacyPolicyPopup);
		    Logger.logAndReportInfo("Clicked on Close icon on Privacy Policy Pop-up ");
    		 
             observationPageObjects.fileUpload1.sendKeys(filepath+"//Fileupload_files//Shikshalokam.jpg"); 
	    	 verifyEvidenceUploadedPopup();
	    	 clickOnOkButtonOnEvidenceUploadedPopup();
    		
    		 ShikshaLokamClient.get().gestures().click(observationPageObjects.withOutRubricAnswer2);
    		 Logger.logAndReportInfo("Answered second Question");
             observationPageObjects.fileUpload2.sendKeys(filepath+"//Fileupload_files//videoupload.mp4"); 
	    	 verifyEvidenceUploadedPopup();
	    	 clickOnOkButtonOnEvidenceUploadedPopup();
    		
    		 savePartiallyFilledObservationForm();
    		 
    		 js.executeScript("arguments[0].click();", observationPageObjects.withOutRubricAnswer3);
         	 Logger.logAndReportInfo("Answered third Question");
         	
         	 submitObservationForm();
    	 }
    	 
    	 
    	 public void clickOnObservationWithRubricSingleSubmission() throws Exception {
      		ShikshaLokamClient.get().gestures().click(observationPageObjects.observationWithRubricSingleSubmission);
      		Logger.logAndReportInfo("Clicked on Automation rubric with single submission - Teacher");
    		
    	 }
    		public void clickOnJoinProgramButton() throws Exception {
                ShikshaLokamClient.get().gestures().click(observationPageObjects.JoinProgramButton);
        		Logger.logAndReportPass("Clicked on Join Program Button ");
        	}
    		
    		public void checkTheCheckBox() throws Exception {
                ShikshaLokamClient.get().gestures().click(observationPageObjects.checkbox);
        		Logger.logAndReportPass("Checked the Checkbox");
        	}
    		
    		public void clickOnShareButton() throws Exception {
                ShikshaLokamClient.get().gestures().click(observationPageObjects.shareButton);
        		Logger.logAndReportPass("clicked on Share Button");
        	}
    		
    		public void clickOnObservation2() throws Exception {
    		/*	js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.obsObservation2);
   			 ShikshaLokamClient.get().gestures().click(observationPageObjects.obsObservation2);
   		         ShikshaLokamClient.get().report().log(Status.INFO, "clicked on Observation 2"); */
                ShikshaLokamClient.get().gestures().click(observationPageObjects.obsObservation2);
        		Logger.logAndReportPass("clicked on Observation 2");
        	}
    	 
    	 public void verifyObservationDetailsPageForSingleSubmission() throws Exception {
    		 verifyObservation1instanceisAddedByDefault();
    		 verifyObserveAgainButtonisNotPresent();
      	}
    	 
    	 public void clickOnCloseButtonOnPopup() throws Exception {
             ShikshaLokamClient.get().gestures().click(observationPageObjects.closeButtonOnPopup);
     		Logger.logAndReportPass("clicked on close Button on Pop-up");
     	}
    	 
    	 public void clickOnJoinProgramButtonOnPopup() throws Exception {
             ShikshaLokamClient.get().gestures().click(observationPageObjects.JoinProgramButtonOnPopup);
     		Logger.logAndReportPass("clicked on JoinProgram Button on Pop-up");
     	}
    	 
    	//******************Verify*********************************************************//
    	 public void verifyObservation1instanceisAddedByDefault() throws Exception {
             Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.observation1TitleWithRubric),"Observation1 instance is not added by Default.");
     		Logger.logAndReportPass("Observation1 instance is added by Default.");
     	}
    	 
    	 public void verifyObserveAgainButtonisNotPresent() throws Exception {  
   		  Assert.assertTrue(ShikshaLokamClient.get().gestures().verifyNoelement(observationPageObjects.observeAgainButton),"Observe Again Button is Present");
  	    	Logger.logAndReportPass("Observe Again Button is not Present");
       }
    	 
    	public void verifyObservationButton() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.observationButton),"Observation button is not displayed.");
    		Logger.logAndReportPass("Observation button is displayed succesfully");
    	}
    
    	public void verifyObservationTitle() throws Exception {
    		ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.observationTitle);
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.observationTitle),"Observation title is not displayed.");
    		Logger.logAndReportPass("Observation title is displayed succesfully.");
    	}
    	public void verifyObservationListingScreen() throws Exception {
    		Thread.sleep(2000);
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.observationTitle),"Not Redirected to Observation listing page");
    		Logger.logAndReportPass("Redirected to Observation listing page");
    	}
    
    	public void verifyObservationDetailsTitle() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.observationDetailsTitle),"Observation Details title is not displayed.");
    		Logger.logAndReportPass("Observation Details title is displayed succesfully.");
    	}
    	
    	public void verifyObserveAgainPopupTitle() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.observeAgainTitle),"Observe again title is not displayed.");
    		Logger.logAndReportPass("Observe again title is displayed succesfully.");
    	}
    	public void verifyObservation1TitleWithRubric() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.observation1TitleWithRubric),"Observation 1 title is not displayed.");
    		Logger.logAndReportPass("Observation 1 title is displayed succesfully.");
    		Thread.sleep(2000);
    	}
    	
    	public void verifyObservation1TitleWithOutRubric() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.observation1TitleObsWithoutRubric),"Observation 1 title is not displayed.");
    		Logger.logAndReportPass("Observation 1 title is displayed succesfully.");
    		Thread.sleep(2000);
    	}
    	
    	public void verifyStartButtonFromObservation() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.startButtonForObservation),"Start button for the observation is not displayed.");
    		Logger.logAndReportPass("Start button for the observation is displayed succesfully.");
    	}
    	
    /*	public void verifyThrashSymbolForEntityDelete() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.backButton), "Back button is not available on page");
    		Logger.logAndReportPass("Back symbol on observation is displayed succesfully.");  
    	}  */
    	
    	
    	/**
    	//parent child verify
    	public void oldverifyParent1QuestionTitle() throws Exception {
    		ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.parent1Question);
    		Logger.logAndReportPass("Q1 parent question is displayed succesfully");
    	}
    	
    	public void verifyParent1QuestionChild1QuestionTitle() throws Exception {
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.child1Question);
    		ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.child1Question);
    		Logger.logAndReportPass("parent 1 child 1 question title is displayed succesfully.");
    	}
    	
    	public void verifyParent2QuestionChild2QuestionTitle() throws Exception {
    		ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.child2Question);
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.child2Question);
    		Logger.logAndReportPass("Parent 2 Child 2 question title is displayed succesfully.");
    	}
    	
    	public void verifyParent3QuestionTitle() throws Exception {
    		ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.parent3Question);
    		Logger.logAndReportPass("Parent 3 Question title is displayed succesfully.");
    	}
    	**/
    	//new parent child verify actions
    	public void verifyParent1QuestionTitle() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.parent1QuestionTitle),"Parent 1 Question title is not displayed.");
    		Logger.logAndReportPass("Parent 1 Question title is displayed succesfully.");
    	}
    	
    	public void verifyParent1Child1QuestionTitle() throws Exception {
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.parent1Child1Question);
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.parent1Child1Question),"Parent 1 child 1 Question title is not displayed.");
    		Logger.logAndReportPass("Parent 1 child 1 Question is displayed succesfully.");
    	}
    	
    	public void verifyParent2QuestionTitle() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.parent2QuestionTitle),"Parent 2 Question title is not displayed.");
    		Logger.logAndReportPass("Parent 2 Question title is displayed succesfully.");
    	}
    	
    	public void verifyParent2Child2QuestionTitle() throws Exception {
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.parent2Child2QuestionTitle);
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.parent2Child2QuestionTitle),"Parent 2 Child 2 Question title is not displayed.");
    		Logger.logAndReportPass("Parent 2 Child 2 Question title is displayed succesfully.");
    	}
    	
    	public void verifyparent3QuestionTitle() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.parent3QuestionTitle),"Parent 3 question title title is not displayed.");
    		Logger.logAndReportPass("Parent 3 question title is displayed succesfully.");
    	}
    	
    	public void verifyParent3Child1QuestionTitle() throws Exception {
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.parent3Child1QuestionTitle);
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.parent3Child1QuestionTitle),"Parent 3 child 1 question title is not displayed.");
    		Logger.logAndReportPass("Parent 3 child 1 question title is displayed succesfully.");
    	}
    	
    	public void verifyFormSaveSuccessMsg(String SuccessMsg) throws Exception {
    		ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.formSaveTitle);
    		String actualSuccesMsg = ShikshaLokamClient.get().gestures().getText(observationPageObjects.formSaveTitle);
    		ShikshaLokamClient.get().getAsserts().assertEquals(SuccessMsg.trim(), actualSuccesMsg.trim(),
    				"Form Save success Msg is not matching..");
    		Logger.logAndReportPass("Form save success msg is matched and displayed succesfully.");
    	}
    	
    	public void verifyFormSubmitSuccessMsg(String SuccessMsg) throws Exception {
    		ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.formSubmitSuccesMsg);
    		String actualSuccesMsg = ShikshaLokamClient.get().gestures().getText(observationPageObjects.formSubmitSuccesMsg);
    		ShikshaLokamClient.get().getAsserts().assertEquals(SuccessMsg.trim(), actualSuccesMsg.trim(),
    				"Form Submit success Msg is not matching..");
    		Logger.logAndReportPass("Form submit success msg is matched and displayed succesfully.");
    	}
    	
    	public void verifyObservationName(String actualObservationName) throws Exception {
    		Thread.sleep(2000);
    		ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.observtionDetailsTitle);
    		ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.ObservationName);
    		String presentObservationName =ShikshaLokamClient.get().gestures().getText(observationPageObjects.ObservationName);
    		ShikshaLokamClient.get().getAsserts().assertEquals(actualObservationName.trim(), presentObservationName.trim(), "Observation Name not matching..");
    		Logger.logAndReportPass("Observation name is matched and displayed succesfully.");
    	}
    	
    	
    	
    /*	public boolean verifyNoelement() throws Exception {
            try
            {
               if(observationPageObjects.observationform.isDisplayed())
               {
               return false;
               }
               return false;
            }
            catch(Exception e)
            {
            	Logger.logAndReportPass("No entity added by default");
                return true;
            }
    	}  */
    	
 	   public void xyz() throws Exception {  
 		  Assert.assertNotEquals(observationPageObjects.observationform, null, "Entity added by default");
	    	Logger.logAndReportInfo("No entity added by default");
 	   	
	    	//Assert.assertTrue(observationPageObjects.observationform.isDisplayed(),"yes");{
	    	//Logger.logAndReportPass("No entity added by default");              
 	   }
    	
    
    	
    	public void verifySchoolentityisnotadded() throws Exception {  
    		  Assert.assertTrue(ShikshaLokamClient.get().gestures().verifyNoelement(observationPageObjects.observationform),"Entity added by default");
   	    	Logger.logAndReportPass("No School entity added by default");
        }
   	    	public void verifyBlockentityisnotadded() throws Exception {  
      		  Assert.assertTrue(ShikshaLokamClient.get().gestures().verifyNoelement(observationPageObjects.observationform),"Entity added by default");
     	    	Logger.logAndReportPass("No Block entity added by default");
          }   
   	    
   	    	//Assert.assertEquals(0, wd.findElements(By.locator("locator")).size());

   	    	//credits and license contents verification
   	    	public void verifyCreditsandLicensecontents() throws Exception {
   	    		VerifyAuthor();
   	    		VerifyCreatedBy();
   	    		VerifyPublishedonby();
   	    		VerifyCreadtedon();
   	    		VerifyUpdatedon();
   	    		VerifyCreditslink();
   	    		VerifyLicenseterms();
   	    		softAssert.assertAll();
   	    		
   	    		Logger.logAndReportPass("Credits and License Contents are Verified");
   	    		
   	    	}
   	    	

   	    	public void VerifyAuthor() throws Exception {
   	    		//SoftAssert softAssert = new SoftAssert();
   	    		softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.author),"Author Section is not Present.");
   	    		Logger.logAndReportInfo("Author Section is Present .");
   	    		
   	    	}
           
   	    	public void VerifyCreatedBy() throws Exception {
   	    		softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.createdby),"Created By Section is not Present.");
   	    		Logger.logAndReportInfo("Created By Section is Present .");
   	    	
   	    	}
             
   	    	public void VerifyPublishedonby() throws Exception {
   	    	  if(getEnvironmentValue().contains("diksha")) {
   	    		softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.publishedonDikshaBy),"Published On Diksha By Section is not Present .");
  	             ShikshaLokamClient.get().report().log(Status.INFO, "Published On Diksha By Section is Present .");
  	           
   	         } else if(getEnvironmentValue().contains("preprod")) {
   	        	softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.publishedonDikshaBy),"Published On Diksha By Section is not Present .");
   	             ShikshaLokamClient.get().report().log(Status.INFO, "Published On Diksha By Section is Present .");
   	          
   	         } else {
   	        	softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.publishedonSunbirdBy),"Published On Sunbird By Section is not Present .");
   	        	ShikshaLokamClient.get().report().log(Status.INFO, "Published On Sunbird By Section is Present ."); 
   	        	
   	         	      	
   	         }
   	     } 
   	    	
   	    	public void VerifyCreadtedon() throws Exception {
   	    		softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.creadtedon),"Created On Section is not Present.");
   	    		Logger.logAndReportInfo("Created On Section is Present .");
   	    		
   	    	}
   	    	

   	    	public void VerifyUpdatedon() throws Exception {
   	    		softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.updatedon),"Updated On Section is not Present.");
   	    		Logger.logAndReportInfo("Updated On Section is Present .");
   	    		
   	    	}
   	    	
   	    	public void VerifyCreditslink() throws Exception {
   	    		softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.creditslink),"Credits link is not Present.");
   	    		Logger.logAndReportInfo("Credits link is Present .");
   	    		
   	    	}
   	    	
   	    	public void VerifyLicenseterms() throws Exception {
   	    		softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.licenseterms),"License terms section is not Present.");
   	    		Logger.logAndReportInfo("License terms section is Present .");
   	    		
   	    	}
   	    	
   	    	public void VerifyCreditsPopup() throws Exception {
   	    		ShikshaLokamClient.get().gestures().click(observationPageObjects.creditslink);
   	    		Logger.logAndReportInfo("Clicked on Credits link .");
   	    		
   	    		softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.creditsPopup),"Credits Pop-up is not Present.");
   	    		Logger.logAndReportInfo("Credits Pop-up is Present .");
   	    		
   	    		softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.copyrightsSectionOncreditsPopup),"COPYRIGHT section is not Present on Credits Pop-up.");
   	    		Logger.logAndReportInfo("COPYRIGHT section is Present on Credits Pop-up.");
   	    		
   	    		ShikshaLokamClient.get().gestures().click(observationPageObjects.closeIconOncreditsPopup);
   	    		Logger.logAndReportInfo("Clicked on 'X' on Credits Pop-up");
   	    
   	    	}
   	    	
   	    	
   	  
   	 	public void verifyBrowseOtherCategories() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.browseOtherCategories),"Browse Other Categories is not displayed.");
    		Logger.logAndReportPass("Browse Other Categories is displayed succesfully");
    	}
    
    	public void verifyObservationTileunderBrowseOtherCategories() throws Exception {
    		ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.observationTileunderBrowseOtherCategories);
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.observationTileunderBrowseOtherCategories),"Observation Tile under Browse Other Categories is not displayed.");
    		Logger.logAndReportPass("Observation Tile under Browse Other Categories is displayed succesfully.");
    	}
    	
    	public void verifyEvidenceUploadedPopup() throws Exception {
    		ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.evidenceUplodedPopup);
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.evidenceUplodedPopup),"Evidence Uploaded Pop-up is not displayed.");
    		Logger.logAndReportPass("Evidence Uploaded Pop-up is displayed succesfully.");
    	}
    	
    	public void verifyJoinProgramButton() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.JoinProgramButton),"Join Program Button is not displayed.");
    		Logger.logAndReportPass("Join Program Button is displayed succesfully");
    	}
   
    	
    	//Verifying PII pop up
    	public void verifyPiiPopup() throws Exception {
    		ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.pIIPopup);
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.pIIPopup),"PII Pop-up Doesn't Show up");
    		Logger.logAndReportPass("PII Pop-up Shows up");
    	}
    	public void verifyPiiPopupContents() throws Exception {
    		verifyPiiHeader();
    		verifyuserNameSection();
    		verifystateSection();
    		verifyuserIdSection();
    		verifyexternalIdSection();
    		verifydistrictSection();
    		verifyblockSection();
    		verifyschoolIdSection();
    		verifyschoolOrOrgNameSection();
    		verifymobileNumberSection();
    		verifyemailAddressSection();
    		verifysuggestionText();
    		verifycheckboxSection();
    		verifydoNotShareButton();
    		verifyshareButton();
    		
    		
    		Logger.logAndReportPass("PII Pop-up Contents are Verified");
    	}
    	
    	
    	public void verifyPiiHeader() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.pIIPopup),"Consent to share details - Header is not Displayed");
    		Logger.logAndReportInfo("Consent to share details - Header is Displayed.");	
    	}
    	
    	public void verifyuserNameSection() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.userNameSection),"User Name Section is not Present");
    		Logger.logAndReportInfo("User Name Section is Present");	
    	}
    	public void verifystateSection() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.stateSection),"State Section is not Present");
    		Logger.logAndReportInfo("State Section is Present");	
    	}
    	public void verifyuserIdSection() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.userIdSection),"User ID Section is not Present");
    		Logger.logAndReportInfo("User ID Section is Present");	
    	}
    	public void verifyexternalIdSection() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.externalIdSection),"External ID Section is not Present");
    		Logger.logAndReportInfo("External ID Section is Present");	
    	}
    	public void verifydistrictSection() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.districtSection),"District Section is not Present");
    		Logger.logAndReportInfo("District Section is Present");	
    	}
    	public void verifyblockSection() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.blockSection),"Block Section is not Present");
    		Logger.logAndReportInfo("Block Section is Present");	
    	}
    	public void verifyschoolIdSection() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.schoolIdSection),"School ID Section is not Present");
    		Logger.logAndReportInfo("School ID Section is Present");	
    	}
    	public void verifyschoolOrOrgNameSection() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.schoolOrOrgNameSection),"School or Org name Section is not Present");
    		Logger.logAndReportInfo("School or Org name Section is Present");	
    	}
    	public void verifymobileNumberSection() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.mobileNumberSection),"Mobile Number Section is not Present");
    		Logger.logAndReportInfo("Mobile Number Section is Present");	
    	}
    	public void verifyemailAddressSection() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.emailAddressSection),"Email address Section is not Present");
    		Logger.logAndReportInfo("Email address Section is Present");	
    	}
    	public void verifysuggestionText() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.suggestionText),"You can edit these details from your profile page - message is not Displayed");
    		Logger.logAndReportInfo("You can edit these details from your profile page - message is Displayed");	
    	}
    	public void verifycheckboxSection() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.checkboxSection),"Checkbox is not Present");
    		Logger.logAndReportInfo("Checkbox is Present");	
    	}
    	public void verifydoNotShareButton() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.doNotShareButton),"DO NOT SHARE Button is not Present");
    		Logger.logAndReportInfo("DO NOT SHARE Button is Present");	
    	}
    	public void verifyshareButton() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.shareButton),"SHARE Button is not Present");
    		Logger.logAndReportInfo("SHARE Button is Present");	
    	}
    	
    	public void verifyshareButtonGotEnabled() throws Exception {
    	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(observationPageObjects.shareButton),"Share Button is not enabled on PII Pop-up .");
    		Logger.logAndReportPass("Share Button is enabled on PII Pop-up .");	
    	}
    	
    	public void verifyUserIsAbleToConsumeObservation() throws Exception {
    		Thread.sleep(2000);
    		clickOnObserveAgainButton();
		Thread.sleep(2000);
		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.observeAgainTitle),"User is not able to Consume the Observation.");
		Logger.logAndReportPass("User is able to Consume the Observation.");
		ShikshaLokamClient.get().gestures().click(observationPageObjects.yesConfirmationObserveAgain);
    	}
    	
    	public void verifyJoinProgramPopup() throws Exception {
    		ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.joinProgramPopup);
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.joinProgramPopup),"Join Program Pop-up Doesn't Show up");
    		Logger.logAndReportPass("Join Program Pop-up Shows up");
    	}
    	
    	public void verifyJoinProgramPopupContents() throws Exception {
    		verifyJoinProgramHeader();
    		verifyjoinProgramPopupText();
    		verifyJoinProgramButtonOnPopup();
    		verifyCloseButtonOnPopup();
    	}
    	
    		
    	public void verifyJoinProgramHeader() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.joinProgramPopup),"Join program - Header is not Displayed");
    		Logger.logAndReportInfo("Join program - Header is Displayed");	
    	}
    	
    	public void verifyjoinProgramPopupText() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.joinProgramPopupText),"Join Program Popup Text is not Displayed");
    		Logger.logAndReportInfo("Join Program Popup Text is Displayed");	
    	}
    	public void verifyJoinProgramButtonOnPopup() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.JoinProgramButtonOnPopup),"Join Program Button is not Present");
    		Logger.logAndReportInfo("Join Program Button is Present");
    	}
    	
    	public void verifyCloseButtonOnPopup() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.closeButtonOnPopup),"Close icon Button is not Present");
    		Logger.logAndReportInfo("Close icon Button is Present");
    	}
    	//.....@#$%^&demo file upload
    		
    		public void upload() throws Exception {
        		ShikshaLokamClient.get().gestures().click(observationPageObjects.demoobs);
        		Thread.sleep(1000);
        		ShikshaLokamClient.get().gestures().click(observationPageObjects.startButtonForObservation);
        		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.demoq9);
        		//Thread.sleep(5000);
        		//observationPageObjects.fileUpload.sendKeys("//home//navadhiti//SL automation !!!!//Test-Automation-Portalll//image.png");
        	
}
    		
    		//file upload from google sheet ---NA as user dir path differs from each system
    		 public void fileupload1(String filepath) throws Exception {
    	    	 
    	         ShikshaLokamClient.get().gestures().sendValueToTextBox(observationPageObjects.fileUpload1, filepath);
    	         ShikshaLokamClient.get().report().log(Status.INFO, "File Path : " + filepath );
    	         ShikshaLokamClient.get().gestures().click(observationPageObjects.okOnevidenceUplodedPopup);
    		}
    		 

    		 
               public void fileupload2() throws Exception {
                    String filepath = System.getProperty("user.dir");
                    System.out.println(filepath);	
    	    	    observationPageObjects.fileUpload1.sendKeys(filepath+"//Fileupload_files//Shikshalokam.jpg");
    	            ShikshaLokamClient.get().gestures().click(observationPageObjects.okOnevidenceUplodedPopup);
    		}
               ////////
            
}


