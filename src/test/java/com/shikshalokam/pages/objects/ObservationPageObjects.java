package com.shikshalokam.pages.objects;

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
	
	@FindBy(xpath = "//h4[@title='Obs with Rub – Only slider with score']")
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
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/mat-dialog-content[2]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]")                //(//label)[4]
	public WebElement firstEntity;
	
	@FindBy(xpath="//label[contains(text(),'MPPS HANUMANNAHALLI')]")
	public WebElement hanumanahalliEntity;
	
	@FindBy(xpath="//button[text()=' Submit ']")
	public WebElement submitButtonOnAddEntityWindow;
	
	@FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-observation-details[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/entity-list[1]/div[1]/div[1]/div[1]/label[1]")                //(//label)[4]
	public WebElement addedEntity;
	///html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-observation-details[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/entity-list[1]/div[1]/div[1]/div[1]/label[1]
	
	@FindBy(xpath = "//div//span[text()='Observe again']")
	public WebElement observeAgainTitle;
	
	@FindBy(xpath="//button[text()=' Yes ']")
	public WebElement yesConfirmationObserveAgain;
	
	@FindBy(xpath="//button[text()=' No ']")
	public WebElement noConfirmationForObserveAgain;
	
	@FindBy(xpath = "//div//span[text()='Observation 1']")
	public WebElement observation1TitleWithRubric;
	
	@FindBy(xpath = "//div[.='Observation 1 ']")
	public WebElement observation1TitleObsWithoutRubric;
	//div[.='Observation 1 ']
	
	@FindBy(xpath = "//i[contains(@class,'ellipsis vertical icon')]")
	public WebElement threeDotOnObservation;
	
	@FindBy(xpath = "//div[text()=' Edit ']")
	public WebElement editOptionForObservation;
	
	@FindBy(xpath = "//div[normalize-space()='Delete']")
	public WebElement deleteOptionForObservation;
	
	@FindBy(xpath="//button[normalize-space()='Yes']")
	public WebElement yesConfirmationForObservationDelete;
	
	@FindBy(xpath="//button[text()=' No ']")
	public WebElement noConfirmationForObservationDelete;
	
	@FindBy(xpath="//button[text()='Start ']")
	public WebElement startButtonForObservation;
	
	@FindBy(xpath="//button//i[contains(@class,'icon-back')]")
	public WebElement backButton;
	
	
	//h4//bdi[text()='QA solution - entity type block - Parent Child - FD 345']
	//h4[contains(@title, 'Parent')]
	@FindBy(xpath = "//h4[contains(@title, 'Parent')]")
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
  //div[@id='18']//div[@class='sb--card__meta']
    //h4[@title= 'Without rubric 2'])[1]
    //h4//bdi[.= 'Without rubric 2'])[1]
    @FindBy(xpath = "(//h4//bdi[.= 'Without rubric 2'])[1]")
    public WebElement ObsWithoutRubric2;
    

    @FindBy(xpath = "//button[normalize-space()='Join program']")
    public WebElement JoinProgramButton;
    
    @FindBy(xpath = "(//button[normalize-space()='Join program'])[2]")
    public WebElement JoinProgramButtonOnPopup;

    @FindBy(xpath = " //mat-icon[@role='img']")
    public WebElement closeButtonOnPopup;
    
	//,,,,,,,,,,,,,,,,
    
   // @FindBy(xpath = "//bdi[.='Test - Obs without rub – 2']")
    //public WebElement Obsworubric2;  
   
    @FindBy(xpath = "//h4[@title='Solution with rubrics -File button – FD-429']")
    public WebElement SchoolEnityNotAddedObsStaging;
    
    @FindBy(xpath = "//h4[@title='Testing project 5.1observation 5B 928']")
    public WebElement SchoolEnityNotAddedObsPreprod;
    
  //h4[@title='Testing project 5.1observation 5B 928']
	
    @FindBy(xpath = "(//div[.=' Observation form '])[2]")
    public WebElement observationform;
    
    @FindBy(xpath = "//h4[@title='QA solution - entity type block - FD 335']")
    public WebElement BlockEnityNotAddedObsStaging;
    
    @FindBy(xpath = "//h4[@title='Infrastructure Assessment- Furniture']")
    public WebElement BlockEnityNotAddedObsPreprod;
  //h4[@title='Infrastructure Assessment- Furniture']
     
    @FindBy(xpath = "//h4[@title='Infrastructure Assessment- Furniture']")
    public WebElement CerditsAndLicenceObsStaging;
    
    @FindBy(xpath = "//mat-panel-title[@aria-label='Credits & license info accordion']")
    public WebElement CerditsAndLicenceDroapdown;
    
    @FindBy(xpath = "//div[.=' Author']")
    public WebElement author;
    
    @FindBy(xpath = "//div[.=' Created by']")
    public WebElement createdby;
    
    @FindBy(xpath = "//div[.=' Published on SUNBIRD by']")
    public WebElement publishedonSunbirdBy;
    
    @FindBy(xpath = "//div[.=' Published on DIKSHA by']")
    public WebElement publishedonDikshaBy;
  //div[.=' Published on DIKSHA by']
    
    @FindBy(xpath = "//div[.=' Created on']")
    public WebElement creadtedon;
    
    @FindBy(xpath = "//div[.=' Updated on']")
    public WebElement updatedon;
    
    @FindBy(xpath = "//a[.=' Credits ']")
    public WebElement creditslink;
    
    @FindBy(xpath = "//div[.=' CREDITS ']")
    public WebElement creditsPopup;
    
    @FindBy(xpath = "//div[.='COPYRIGHT']")
    public WebElement copyrightsSectionOncreditsPopup;
    
    @FindBy(xpath = "//span[normalize-space()='×']")
    public WebElement closeIconOncreditsPopup;
    
  //span[normalize-space()='×']
  //div[.='COPYRIGHT']
  //div[.=' CREDITS ']
    @FindBy(xpath = "//div[.=' License terms']")
    public WebElement licenseterms;
    
    @FindBy(xpath = "//div[contains(text(),'Browse Other Categories')]")
    public WebElement browseOtherCategories;
    
    @FindBy(xpath = "//label[normalize-space()='Observation']")
    public WebElement observationTileunderBrowseOtherCategories;
    
    @FindBy(xpath = "//h4//bdi[normalize-space()='Automation rubric with multiple submission - Teacher']")
    public WebElement observationWithRubricMultipleSubmission;
    
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-observation-details[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/entity-list[1]/div[5]/div[1]/div[1]/label[1]")
    public WebElement fifthEntity;
    
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-observation-details[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/submission[1]/sui-accordion[1]/sui-accordion-panel[1]/div[1]")
    public WebElement addedInstance;
   
    @FindBy(xpath = "//div[normalize-space()='Domain 1']")
    public WebElement domain1;

    @FindBy(xpath = " //div[normalize-space()='Domain 2']")
    public WebElement domain2;
    
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-observation-details[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/submission[1]/sui-accordion[1]/sui-accordion-panel[1]/div[2]/div[1]/div[1]/div[1]/div[2]/button[1]")
    public WebElement domain1StartButton;
    
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-observation-details[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/submission[1]/sui-accordion[1]/sui-accordion-panel[1]/div[2]/div[1]/div[1]/div[2]/div[2]/button[1]")
    public WebElement domain2StartButton;
    
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-questionnaire[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/sl-input[1]/div[1]/div[1]/div[1]/div[2]/sl-page-questions[1]/sl-input[1]/div[1]/div[2]/div[1]/div[2]/sl-text-input[1]/div[1]/input[1]")
    public WebElement domain1Answer1;
    
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-questionnaire[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/sl-input[1]/div[1]/div[1]/div[1]/div[2]/sl-page-questions[1]/sl-input[1]/div[2]/div[2]/div[1]/div[2]/sl-number-input[1]/div[1]/input[1]")
    public WebElement domain1Answer2;
    
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-questionnaire[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/sl-input[1]/div[1]/div[1]/div[1]/div[2]/sl-page-questions[1]/sl-input[1]/div[3]/div[2]/div[1]/div[3]/sl-radio-input[1]/div[1]/div[2]/label[1]")
    public WebElement domain1Answer3;
    
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-questionnaire[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/sl-input[1]/div[1]/div[1]/div[1]/div[2]/sl-page-questions[1]/sl-input[1]/div[4]/div[2]/div[1]/div[3]/sl-radio-input[1]/div[1]/div[3]/input[1]")
    public WebElement domain1Answer4;
    
    @FindBy(xpath = "//label[contains(text(),'Orient principals, teachers with data of training ')]")
    public WebElement domain2Answer5;
    
    @FindBy(xpath = "//label[.='Grade 1']")
    public WebElement domain2Answer6;
  //label[.='Grade 1']
    
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-questionnaire[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/form[1]/sl-input[1]/div[2]/div[1]/div[1]/div[2]/sl-page-questions[1]/sl-input[1]/div[1]/div[2]/div[1]/div[2]/sl-date-input[1]/div[1]/div[1]/input[1]")
    public WebElement domain2Answer7;
    
    @FindBy(xpath = "(//i[@class='plus icon'])[1]")
    public WebElement addFile1;
    
    @FindBy(xpath = "(//i[@class='plus icon'])[2]")
    public WebElement addFile2;
    
    //(//i[@class='plus icon'])[1]
    @FindBy(xpath = "(//input[@type='file'])[1]")
    public WebElement fileUpload1;
    
    @FindBy(xpath = "(//input[@type='file'])[2]")
    public WebElement fileUpload2;
    
    @FindBy(xpath = "(//div[.=' Evidence uploaded '])[1]")
    public WebElement evidenceUplodedPopup;
    
    @FindBy(xpath = "//button[normalize-space()='OK']")
    public WebElement okOnevidenceUplodedPopup;
   
    //***** 
    @FindBy(xpath = "//label[@for='myCheck']")
    public WebElement privacyPolicyPopup;
    
    @FindBy(xpath = "//button[normalize-space()='Do not Upload']")
    public WebElement doNotUploadButtonOnPrivacyPolicyPopup;
    
    @FindBy(xpath = "//input[@id='myCheck']")
    public WebElement acceptCheckBoxOnPrivacyPolicyPopup;
    
    @FindBy(xpath = "//button[normalize-space()='Upload']")
    public WebElement uploadButtonOnPrivacyPolicyPopup;
    
    @FindBy(xpath = "//i[@class='close inside icon']")
    public WebElement closeIconOnPrivacyPolicyPopup;
    //******
    
  //i[@class='close inside icon']
  //button[normalize-space()='Upload']
  //input[@id='myCheck']
  //button[normalize-space()='Do not Upload']
  //label[@for='myCheck']
    
   //.......
    
    @FindBy(xpath = "//h4//bdi[normalize-space()='Automation rubric without submission - Teacher']")
    public WebElement observationWithoutRubric;
    
    
    @FindBy(xpath = "//button[normalize-space()='Auto Capture']")
    public WebElement withOutRubricAnswer1;
    
    @FindBy(xpath = "//label[normalize-space()='abc']")
    public WebElement withOutRubricAnswer2;
    
    @FindBy(xpath = "//label[normalize-space()='Yes']")
    public WebElement withOutRubricAnswer3;
    
    @FindBy(xpath = "//h4//bdi[normalize-space()='Automation rubric with single submission - Teacher']")
    public WebElement observationWithRubricSingleSubmission;
    

   	@FindBy(xpath = "(//div[normalize-space()='Consent to share details'])[2]")
 	public WebElement pIIPopup;
   	
   
   	@FindBy(xpath = "(//div[normalize-space()='Join program'])[1]")
   	public WebElement joinProgramPopup;
   	
   	
 	@FindBy(xpath = "//label[text()='User Name']")
 	public WebElement userNameSection;
    
 	@FindBy(xpath = "//label[text()='State']")
 	public WebElement stateSection;
 	
	@FindBy(xpath = "//label[text()='User ID']")
 	public WebElement userIdSection;
	
	@FindBy(xpath = "//label[text()='External Id']")
 	public WebElement externalIdSection;
	
	@FindBy(xpath = "//label[text()='District']")
 	public WebElement districtSection;
	
	@FindBy(xpath = "//label[text()='Block']")
 	public WebElement blockSection;
	
	@FindBy(xpath = "//label[text()='School ID']")
 	public WebElement schoolIdSection;
	
	@FindBy(xpath = "//label[text()='School or Org name']")
 	public WebElement schoolOrOrgNameSection;
	
	@FindBy(xpath = "//label[text()='Mobile Number']")
 	public WebElement mobileNumberSection;
	
	@FindBy(xpath = "//label[text()='Email address']")
 	public WebElement emailAddressSection;
	
	@FindBy(xpath = "//div[.='You can edit these details from your profile page ']")
 	public WebElement suggestionText;
	
	@FindBy(xpath = "//p[text()=' I consent to share my details with the administrators of this program. All administrators are bound by the privacy policy and SUNBIRD terms of use of my data. ']")
 	public WebElement checkboxSection;
	
	@FindBy(xpath = "//button[text()='Do not share']")
 	public WebElement doNotShareButton;
	
	@FindBy(xpath = "//button[text()='Share']")
 	public WebElement shareButton;
	
	@FindBy(xpath = "//input[@type='checkbox']")
 	public WebElement checkbox;
	
	
	@FindBy(xpath = "(//h4//bdi[.= 'Observation 2'])[1]")
	public WebElement obsObservation2;
	
	//p[contains(text(),' Please join ') ]
	
	@FindBy(xpath = "//p[contains(text(),' Please join ') ]")
	public WebElement joinProgramPopupText;
	

	
    
    //................  demo file upload
    @FindBy(xpath = "//h4//bdi[normalize-space()='Teacher Obs Form']")
    public WebElement demoobs;
    
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-questionnaire[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/sl-input[1]/div[1]/div[1]/div[1]/div[2]/sl-page-questions[1]/sl-input[1]/div[8]/div[1]/div[1]/div[1]/div[1]/div[1]")
    public WebElement demoq9;
   
    
  
   
}
