package com.sikshalokam.pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.objects.LoginPageObjects;
import com.sikshalokam.pages.objects.ObservationPageObjects;
import com.sikshalokam.utils.logger.Logger;

public class ObservationPageAction {

	LoginPageObjects loginPageObjects = new LoginPageObjects();
    ObservationPageObjects observationPageObjects = new ObservationPageObjects();

    JavascriptExecutor js = (JavascriptExecutor) SikshaLokamClient.get().driver();
//    js.executeScript("window.scrollBy(0,250)", "");
    
    public ObservationPageAction() throws Exception {
    	observationPageObjects = PageFactory.initElements(SikshaLokamClient.get().driver(), ObservationPageObjects.class);
    }
        //******************Actions*********************************************************//
    		
    	public void clickOnObservationButton() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.observationButton);
    		Thread.sleep(1000);
    		Logger.logAndReportInfo("Clicked on the observation button");
    	}
    	
    	public void clickOnUpdateButtonOnProfileUpdatePopup() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.profileUpdatePopupButton);
    		Logger.logAndReportInfo("Clicked on the update button on profile update popup");
    	}
    	
    	
    	public void clickOnUdateButtonOnPersonalDetailsWindow() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.profileUpdatePopupButton);
    		Logger.logAndReportInfo("Clicked on the submit button on personal details window.");
    	}
    	
    	public void clickOnObservationWithRub_SliderWithScore() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.observationWithRubic);
    		Logger.logAndReportInfo("Clicked on the observation with rub only slider with score.");
    	}
    	
    	public void clickOnEntityDeleteOption() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.deleteButtonForEntity);
    		Logger.logAndReportInfo("Clicked on the entity delete option");
    	}
    	
    	public void clickOnEntityDeleteConfirmationYes() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.yesConfirmationForEntityDelete);
    		Logger.logAndReportInfo("Clicked on the yes confirmation for entity deletion.");
    	}
    	
    	public void clickOnAddSchoolButton() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.addSchoolForEntity);
    		Logger.logAndReportInfo("Clicked on the Add School Button ");
    		Thread.sleep(2000);
    	}
    	
    	public void selectHanumanahallyEntityAsSchool() throws Exception {
        	SikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.hanumanahalliEntity);
    		SikshaLokamClient.get().gestures().click(observationPageObjects.hanumanahalliEntity);
    		Logger.logAndReportInfo("Selected hanumanahally entity for the school.");
    	}
    	
    	public void clickOnSubmitButtonOnAddEntityWindow() throws Exception {
        	SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(observationPageObjects.submitButtonOnAddEntityWindow);
    		SikshaLokamClient.get().gestures().click(observationPageObjects.submitButtonOnAddEntityWindow);
    		Logger.logAndReportInfo("Clicked on the submit button on add entity window.");
    	}
    	
    	public void clickOnObserveAgainButton() throws Exception {
    		//SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(observationPageObjects.observeAgainButton);;
    		SikshaLokamClient.get().gestures().click(observationPageObjects.observeAgainButton);
    		Logger.logAndReportInfo("Clicked on the observe again button.");
    	}
    	
    	public void clickOnObservation1() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.observation1Title);
    		Logger.logAndReportInfo("Clicked on the observation 1 Title.");
    	}
    	public void clickOnObserveAgainYesConfirmation() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.yesConfirmationObserveAgain);
    		Logger.logAndReportInfo("Clicked on the yes button for obsere again button.");
    	}
    	
    	public void clickOnThreeDotEllipseOnObservation() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.threeDotOnObservation);
    		Logger.logAndReportInfo("Clicked on the three dot on observation. ");
    		Thread.sleep(2000);
    	}
    	
    	public void clickOnDeleteOptionFromThreeDotObservation() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.deleteOptionForObservation);
    		Logger.logAndReportInfo("Clicked on the delete option from observation three dot ellipse.");
    	}
    	
    	public void clickOnStartButtonOnObservation() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.startButtonForObservation);
    		Logger.logAndReportInfo("Clicked on the start button from observation.");
    	}
    	
    	public void clickOnObservationParentChild() throws Exception {
    		SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(observationPageObjects.parentChildObservation);
    		//SikshaLokamClient.get().gestures().click(observationPageObjects.parentChildObservation);
    		Logger.logAndReportInfo("Clicked on the parent child observation.");
    	}
    	
    	//parent child actions
    	/*public void clickOn1stAnswerFor1stParent() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.parent1firstAnswer);
    		Logger.logAndReportInfo("Clicked on the parent1 first answer");
    	}
    	
    	public void clickOnParent1Child1FirstAnswer() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.child1FirstAnswer);
    		Logger.logAndReportInfo("Clicked on the child 1 question first answer ");
    	}*/
    	
    	public void clickOnSaveObservationForm() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.saveButtonForObservation);
    		Logger.logAndReportInfo("Clicked on the save button on observation question form");
    	}
    	
    	public void clickOnSaveFormConirmationYes() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.yesConfirmationForSaveForm);
    		Logger.logAndReportInfo("Clicked on the Yes confirmation to save observation form.");
    	}
    	
    	/*public void clickOnQ2ParentSecondAnswer() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.parent2SecondAnswer);
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.parent2SecondAnswer);
    		Logger.logAndReportInfo("Clicked on the parenet 2 question second answer");
    	}
    	
    	public void clickOnParent2Child2firstAnswer() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.child2SecondAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 2 child 2 second answer");
    	}
    	
    	public void clickOnParent3FirstAnswer() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.parent3Child1Answer);
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.parent3Child1Answer);
    		Logger.logAndReportInfo("Clicked on the parent 3 first answer.");
    	}
    	
    	public void clickOnParent3FirstChildFirstAnswer() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.parent3Child1FirstAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 3 child 1 first answer.");
    	}
    	*/
    	// parent child click operations
    	public void clickOnParent1QuestionFirstAnswer() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.parent1QuestionfirstAnswer);
    		Logger.logAndReportInfo("Clicked on the Parent 1 question first answer.");;
    	}
    	
    	public void clickOnParent1Child1QuestionFirstAnswer() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.parent1Child1FirstAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 1 child 1 first answer.");
    	}
    	
    	public void clickOnParent2QuestionSecondAnswer() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.parent2QuestionSecondAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 2 question second answer.");
    	}
    	
    	public void clickOnParent2Child2QuestionSecondAnswer() throws Exception {
    		js.executeScript("arguments[0].click();", observationPageObjects.parent2Child2SecondAnswer);
    		//SikshaLokamClient.get().gestures().click(observationPageObjects.parent2Child2SecondAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 2 child 2 second answer ");
    	}
    	
    	public void clickOnParent3QuestionFirstAnswer() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.parent3QuestionFirstAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 3 question first answer.");
    	}
    	
    	public void clickOnParent3Child1FirstAnswer() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.parent3Child1FirstAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 3 child 1 first answer.");
    	}
    	
    	
    	public void clickOnSubmitButtonOnQuestionForm() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.submitButtonForObservation);
    		Logger.logAndReportInfo("Clicked on the submit button on observation form.");
    	}
    	
    	public void clickOnContinueButtonOnSaveObservationForm() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.continueButtonOnFormSavePopup);
    		Logger.logAndReportInfo("Clicked on the continue button on observation form save");
    	}
    	
    	public void clickOnSubmitButtonOnObservationSaveForm() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.submitButtonForObservation);
    		Logger.logAndReportInfo("Clicked on the submit button on Observation form.");
    	}
    	
    	public void clickOnYesForSubmitFormConfirmation() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.yesConfirmationForSubmitForm);
    		Logger.logAndReportInfo("Clicked on the yes confirmation on submitting the form.");
    	}
    	
    	public void clickOnOkButtonOnSubmitFormSuccess() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.okButtonOnFormSubmitSuccessMsg);
    		Logger.logAndReportInfo("Clicked on the Ok button on form submit success msg.");
    	}
    	
    	public void clickOnSearchedObservationTitle() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.observationTitleForSearch);
    		Logger.logAndReportInfo("Clicked on the serached observation title.");
    	}
    	//******************Verify*********************************************************//
    	
    	public void verifyObservationButton() throws Exception {
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.observationButton);
    		Logger.logAndReportPass("Observation button is displayed succesfully");
    	}
    
    	public void verifyObservationTitle() throws Exception {
    		SikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.observationTitle);
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.observationTitle);
    		Logger.logAndReportPass("Observation title is displayed succesfully.");
    	}
    
    	public void verifyObservationDetailsTitle() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.observationDetailsTitle);
    		Logger.logAndReportPass("Observation Details title is displayed succesfully.");
    	}
    	
    	public void verifyObserveAgainPopupTitle() throws Exception {
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.observeAgainTitle);
    		Logger.logAndReportPass("Observe again title is displayed succesfully.");
    	}
    	public void verifyObservation1Title() throws Exception {
    		SikshaLokamClient.get().gestures().click(observationPageObjects.observation1Title);
    		Logger.logAndReportPass("Observation 1 title is displayed succesfully.");
    	}
    	
    	public void verifyStartButtonFromObservation() throws Exception {
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.startButtonForObservation);
    		Logger.logAndReportPass("Start button for the observation is displayed succesfully.");
    	}
    	/**
    	//parent child verify
    	public void oldverifyParent1QuestionTitle() throws Exception {
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.parent1Question);
    		Logger.logAndReportPass("Q1 parent question is displayed succesfully");
    	}
    	
    	public void verifyParent1QuestionChild1QuestionTitle() throws Exception {
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.child1Question);
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.child1Question);
    		Logger.logAndReportPass("parent 1 child 1 question title is displayed succesfully.");
    	}
    	
    	public void verifyParent2QuestionChild2QuestionTitle() throws Exception {
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.child2Question);
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.child2Question);
    		Logger.logAndReportPass("Parent 2 Child 2 question title is displayed succesfully.");
    	}
    	
    	public void verifyParent3QuestionTitle() throws Exception {
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.parent3Question);
    		Logger.logAndReportPass("Parent 3 Question title is displayed succesfully.");
    	}
    	**/
    	//new parent child verify actions
    	public void verifyParent1QuestionTitle() throws Exception {
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.parent1QuestionTitle);
    		Logger.logAndReportPass("Parent 1 Question title is displayed succesfully.");
    	}
    	
    	public void verifyParent1Child1QuestionTitle() throws Exception {
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.parent1Child1Question);
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.parent1Child1Question);
    		Logger.logAndReportPass("Parent 1 child 1 Question is displayed succesfully.");
    	}
    	
    	public void verifyParent2QuestionTitle() throws Exception {
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.parent2QuestionTitle);
    		Logger.logAndReportPass("Parent 2 Question title is displayed succesfully.");
    	}
    	
    	public void verifyParent2Child2QuestionTitle() throws Exception {
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.parent2Child2QuestionTitle);
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.parent2Child2QuestionTitle);
    		Logger.logAndReportPass("Parent 2 Child 2 Question title is displayed succesfully.");
    	}
    	
    	public void verifyparent3QuestionTitle() throws Exception {
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.parent3QuestionTitle);
    		Logger.logAndReportPass("Parent 3 question title is displayed succesfully.");
    	}
    	
    	public void verifyParent3Child1QuestionTitle() throws Exception {
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.parent3Child1QuestionTitle);
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.parent3Child1QuestionTitle);
    		Logger.logAndReportPass("Parent 3 child 1 question title is displayed succesfully.");
    	}
    	
    	public void verifyFormSaveSuccessMsg(String SuccessMsg) throws Exception {
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.formSaveTitle);
    		String actualSuccesMsg = SikshaLokamClient.get().gestures().getText(observationPageObjects.formSaveTitle);
    		SikshaLokamClient.get().getAsserts().assertEquals(SuccessMsg.trim(), actualSuccesMsg.trim(),
    				"Form Save success Msg is not matching..");
    		Logger.logAndReportPass("Form save success msg is matched and displayed succesfully.");
    	}
    	
    	public void verifyFormSubmitSuccessMsg(String SuccessMsg) throws Exception {
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.formSubmitSuccesMsg);
    		String actualSuccesMsg = SikshaLokamClient.get().gestures().getText(observationPageObjects.formSubmitSuccesMsg);
    		SikshaLokamClient.get().getAsserts().assertEquals(SuccessMsg.trim(), actualSuccesMsg.trim(),
    				"Form Submit success Msg is not matching..");
    		Logger.logAndReportPass("Form submit success msg is matched and displayed succesfully.");
    	}
    	
    	public void verifyObservationName(String actualObservationName) throws Exception {
    		Thread.sleep(2000);
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.observtionDetailsTitle);
    		SikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.ObservationName);
    		String presentObservationName =SikshaLokamClient.get().gestures().getText(observationPageObjects.ObservationName);
    		SikshaLokamClient.get().getAsserts().assertEquals(actualObservationName.trim(), presentObservationName.trim(), "Observation Name not matching..");
    		Logger.logAndReportPass("Observation name is matched and displayed succesfully.");
    	}
}

