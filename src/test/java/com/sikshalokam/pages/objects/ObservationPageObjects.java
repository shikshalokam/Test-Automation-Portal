package com.sikshalokam.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObservationPageObjects {

	@FindBy(xpath = "//a[text()=' Observation ']")
	public WebElement observationButton;
	
	@FindBy(xpath = "//button[text()=' Update ']")
	public WebElement profileUpdatePopupButton;
	
	@FindBy(xpath = "//button[text()='Submit ']")
	public WebElement submitButtonOnPersonalDetailWindow;
	
	@FindBy(xpath = "(//h4[contains(@class,'title') ])[1]")
	public WebElement observationTitle;
	
	@FindBy(xpath = "//h4//bdi[text()='Obs with Rub – Only slider with score']")
	public WebElement observationWithRubic;
	
	@FindBy(xpath = "//h4[text()='Observation Details ']")
	public WebElement observationDetailsTitle;
	
	@FindBy(xpath = "//button[text()=' Add School ']")
	public WebElement addSchoolForEntity;
	
	@FindBy(xpath = "//i[contains(@class,'trash')]")
	public WebElement deleteButtonForEntity;
	
	@FindBy(xpath = "//button[text()=' Observe again ']")
	public WebElement observeAgainButton;
	
	@FindBy(xpath="//button[text()=' Yes ']")
	public WebElement yesConfirmationForEntityDelete;
	
	@FindBy(xpath="//button[text()=' No ']")
	public WebElement noConfirmationForEntityDelete;
	
	@FindBy(xpath="//label[contains(text(),'MPPS HANUMANNAHALLI')]")
	public WebElement hanumanahalliEntity;
	
	@FindBy(xpath="//button[text()=' Submit ']")
	public WebElement submitButtonOnAddEntityWindow;
	
	@FindBy(xpath = "//div//span[text()='Observe again']")
	public WebElement observeAgainTitle;
	
	@FindBy(xpath="//button[text()=' Yes ']")
	public WebElement yesConfirmationObserveAgain;
	
	@FindBy(xpath="//button[text()=' No ']")
	public WebElement noConfirmationForObserveAgain;
	
	@FindBy(xpath = "//div//span[text()='Observation 1']")
	public WebElement observation1Title;
	
	@FindBy(xpath = "//i[contains(@class,'ellipsis vertical icon')]")
	public WebElement threeDotOnObservation;
	
	@FindBy(xpath = "//div[text()=' Edit ']")
	public WebElement editOptionForObservation;
	
	@FindBy(xpath = "//div[text()=' Delete ']")
	public WebElement deleteOptionForObservation;
	
	@FindBy(xpath="//button[text()=' Yes ']")
	public WebElement yesConfirmationForObservationDelete;
	
	@FindBy(xpath="//button[text()=' No ']")
	public WebElement noConfirmationForObservationDelete;
	
	@FindBy(xpath="//button[text()='Start ']")
	public WebElement startButtonForObservation;
	
	@FindBy(xpath="//button//span[text()='Back']")
	public WebElement backButton;
	
	@FindBy(xpath = "//h4//bdi[text()='QA solution - entity type block - Parent Child - FD 345']")
	public WebElement parentChildObservation;
	
	@FindBy(xpath ="//div[contains(text(),'Q1 parent')]")
	public WebElement parent1QuestionTitle;
	
	@FindBy(xpath="(//div//input[@type='radio'])[1]")
	public WebElement parent1QuestionfirstAnswer;
	
	@FindBy(xpath = "//div[contains(text(),'Child 1')]")
	public WebElement parent1Child1Question;
	
	@FindBy(xpath = "(//div//input[@type='radio'])[3]")
	public WebElement parent1Child1FirstAnswer;
	
	@FindBy(xpath ="//div[contains(text(),'Q2 parent')]")
	public WebElement parent2QuestionTitle;
	
	@FindBy(xpath="(//div//input[@type='radio'])[6]")
	public WebElement parent2QuestionSecondAnswer;
	
	@FindBy(xpath = "//div[contains(text(),'Child 2')]")
	public WebElement parent2Child2QuestionTitle;
	
	@FindBy(xpath = "(//div//input[@type='checkbox'])[3]")
	public WebElement parent2Child2SecondAnswer;
	
	@FindBy(xpath ="//div[contains(text(),'Q3 parent')]")
	public WebElement parent3QuestionTitle;
	
	@FindBy(xpath="(//div//input[@type='radio'])[7]")
	public WebElement parent3QuestionFirstAnswer;
	
	@FindBy(xpath = "(//div[contains(text(),'Child 1')])[2]")
	public WebElement parent3Child1QuestionTitle;
	
	@FindBy(xpath = "(//div//input[@type='radio'])[9]")
	public WebElement parent3Child1FirstAnswer;
	
	@FindBy(xpath="//button[text()=' Save ']")
	public WebElement saveButtonForObservation;
	
	@FindBy(xpath = "//button[text()=' Submit ']")
	public WebElement submitButtonForObservation;
	
	@FindBy(xpath = "//button[text()=' Yes ']")
	public WebElement yesConfirmationForSaveForm;

	@FindBy(xpath = "//button[text()=' No ']")
	public WebElement noConfirmationForSaveForm;
	
	@FindBy(xpath ="//div[contains(text(),' Your Form has been saved successfully! ')]")
	public WebElement formSaveTitle;
	
	@FindBy(xpath="//button[text()=' Continue ']")
	public WebElement continueButtonOnFormSavePopup;
	
	@FindBy(xpath="//button[text()='Continue ']")
	public WebElement continueButtonOnObservation;
	
	@FindBy(xpath = "//button[text()=' Yes ']")
	public WebElement yesConfirmationForSubmitForm;

	@FindBy(xpath = "//button[text()=' No ']")
	public WebElement noConfirmationForSubmitForm;
	
	@FindBy(xpath ="//div[contains(text(),' Your form has been submitted successfully! ')]")
	public WebElement formSubmitSuccesMsg;
	
	@FindBy(xpath ="//button[text()=' OK ']")
	public WebElement okButtonOnFormSubmitSuccessMsg;
	
	@FindBy(xpath = "//div[contains(text(),'Observation')]")
	public WebElement observationTitleForSearch;
	
	@FindBy(xpath = "//div[@class='training-info']")
    public WebElement observtionDetailsTitle;
    
    @FindBy(xpath = "//h4[@class='mb-4']")
    public WebElement ObservationName;
	
	
	
}
