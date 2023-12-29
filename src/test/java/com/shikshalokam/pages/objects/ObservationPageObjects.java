package com.shikshalokam.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ObservationPageObjects {

	@FindBy(xpath = "//a[text()=' Observations ']")
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
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/mat-dialog-content[2]/div[1]/div[1]/div[1]/div[2]/div[1]/label[1]")                
	public WebElement secondEntity;
	
	@FindBy(xpath="/html[1]/body[1]/div[2]/div[2]/div[1]/mat-dialog-container[1]/div[1]/mat-dialog-content[2]/div[1]/div[1]/div[1]/div[3]/div[1]/label[1]")                
	public WebElement thirdEntity;
	
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
	
	@FindBy(xpath="(//div//input[@type='radio'])[5]")
	public WebElement radio5;
	
	@FindBy(xpath="(//div//input[@type='radio'])[9]")
	public WebElement radio9;
	
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
	
	@FindBy(xpath="(//button[text()='Continue '])[1]")
	public WebElement continueButton;
	
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
    
    @FindBy(xpath = "(//h4//bdi[.= 'Without rubric'])[1]")
    public WebElement JoinProgramObs;
    

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
  //label[normalize-space()='Observation']
    @FindBy(xpath = "//label[normalize-space()='Observations']")
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
    
    @FindBy(xpath = "(//i[@class='plus icon'])[1]")
    public WebElement fileUploadicon1;
    
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
    
    @FindBy(xpath = "//i[@class='close inside icon']")
    public WebElement closeIconOnSavePopup;
    //******
    
  //i[@class='close inside icon']
  //button[normalize-space()='Upload']
  //input[@id='myCheck']
  //button[normalize-space()='Do not Upload']
  //label[@for='myCheck']
    
   //.......
    
    @FindBy(xpath = "//h4//bdi[normalize-space()='Automation rubric without submission - Teacher']")
    public WebElement observationWithoutRubric;
    
    
    @FindBy(xpath = "//button[normalize-space()='Capture']")
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
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
 	public WebElement checkbox2;
	
	@FindBy(xpath = "//label[.=' Smart phone without internet/data pack ' ]")
 	public WebElement checkbox3;
	
	@FindBy(xpath = "//label[.=' TV ' ]")
 	public WebElement checkbox4;
	@FindBy(xpath = "(//input[@type='checkbox'])[4]")
 	public WebElement checkbox5;
	
	@FindBy(xpath = "//input[@type='checkbox']")
 	public WebElement checkbox;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
 	public WebElement checkbox1;
	
	@FindBy(xpath = "(//h4//bdi[.= 'Observation without Rubrics Teacher'])[1]")
	public WebElement obsObservationWithoutRubricTeacher;
	
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
    
    @FindBy(xpath = "//bdi[normalize-space()='Observation with rubric(Multiple submission)FD830D']")
    public WebElement ObservationNamePresentOnCard;
   
    @FindBy(xpath = "//div[@id='0']//span[@title='English'][normalize-space()='English']")
    public WebElement LanguagePresentOnCard;
    
    @FindBy(xpath = "//div[@id='0']//span[@title='Survey Support'][normalize-space()='Survey Support']")
    public WebElement CreatorNamePresentOnCard;
   
    @FindBy(xpath = "//div[@id='0']//span[@title='Program - HT and officials'][normalize-space()='Program - HT and officials']")
    public WebElement ProgramNamePresentOnCard;
    
    @FindBy(xpath = "//bdi[normalize-space()='Obs with rubrics HT']")
    public WebElement ObsWithRubric;
    
    @FindBy(xpath = "//div[@id='1']//bdi[contains(text(),'Without rubric 2')]")
    public WebElement ObsWithoutRubric;
    
    @FindBy(xpath = "//h4[@class='mb-4']")
    public WebElement ObservationNameOnObservationDetailsPage;
    
    @FindBy(xpath = "//div[@class='fsmall']")
    public WebElement ProramNameOnObservationDetailsPage;
    
    @FindBy(xpath = "//button[@class='sb-btn sb-btn-primary sb-btn-normal mr-8']")
    public WebElement clickOnAddEntityButton;
    
    @FindBy(xpath = "//button[@aria-label='close dialog']")
    public WebElement crossIconOnAddEntityPopup;
   
    @FindBy(xpath = "(//label[@class='d-flex w-100 flex-jc-space-between'])[1]")
    public WebElement SchoolNameAddedByDefaultInObservationDetailsPage;
    
    @FindBy(xpath = "(//div//input[@type='checkbox'])[2]")
	public WebElement AddentityCheckBox;
    
    @FindBy(xpath = "(//h4//bdi[contains(text(),'Observation Without Rubrics NOC Test')])[1]")
    public WebElement ObservationWithoutRubricInstanceName;
  
    @FindBy(xpath = "//div[normalize-space()='Edit']")
    public WebElement EditOnThreedots;
    
    @FindBy(xpath = "(//div//input[@type='text'])[2]")
    public WebElement TextOnEditInstanceName;
    
    @FindBy(xpath = "(//div//input[@type='text'])[2]")
    public WebElement ResponseOne;
    
    @FindBy(xpath = "//button[normalize-space()='Update']")
    public WebElement UpdateButtonOnObservationInstancepopup;
    
    @FindBy(xpath = "//button[normalize-space()='Cancel']")
    public WebElement CancelButtonOnObservationInstancepopup;
                        
    @FindBy(xpath = "//h4//bdi[contains(text(),'Observation with Rubrics for program 1')]")
    public WebElement ObsWithRubricSingleSubmission;
    
    @FindBy(xpath = "//label[@for='493590d5-ab64-4e2d-8b0a-c2820cb86020'][1]")
    public WebElement DefaultEntityAddedObsWithRubricSingleSubmission;
    
    @FindBy(xpath = "//h4[@class='font-weight-bold']")
    public WebElement ObservationDetailsText;
    
    @FindBy(xpath = "//div[@class='popup-body ng-star-inserted']")
    public WebElement CloseButtonOnAddEntityPage;  
    
    @FindBy(xpath = "//div[@class='popup-body ng-star-inserted']")
    public WebElement DeleteEntityMessage;  
    
    @FindBy(xpath = "//div[@class='white-space-wrap']")
    public WebElement instanceName;
    
    @FindBy(xpath = "//h4[@class='mb-4']")
    public WebElement ProgramName;
    
    @FindBy(xpath = "//div[@class='fsmall']")
    public WebElement ResourceName;
    
    @FindBy(xpath = "//i[@class='close inside icon']")
    public WebElement CrossiconOnEntitydeletepopup;
    
    @FindBy(xpath = "//button[@aria-label='close dialog']")
    public WebElement Crossicon;
  
    @FindBy(xpath = "//div[@class='expanded']//div[2]//div[2]//button[1]")
    public WebElement clickstartnexttodomain;
     
    @FindBy(xpath = "//button[normalize-space()='Continue']")
    public WebElement continuebuttononsecondsave;
    
    @FindBy(xpath = "//div[@class='popup-body ng-star-inserted']")
    public WebElement textmessageoncontinuepopup;
    
    @FindBy(xpath = "//button[@class='sb-btn sb-btn-normal sb-btn-primary'][normalize-space()='Back']")
    public WebElement backbuttononsave;
    
    @FindBy(xpath = "//button[normalize-space()='View']")
    public WebElement Viewbutton;
    
    @FindBy(xpath = "(//button[normalize-space()='View'])[1]")
    public WebElement ViewbuttononDomainInstance;
    
    @FindBy(xpath = "//button[normalize-space()='No']")
    public WebElement noOnSubmitSavePopup;
    
    @FindBy(xpath = "//h4//bdi[contains(text(),'Test-சோதனை கண்காணிப்பு அறிக்கை hotfix - தமிழ்(Tami'))]")
    public WebElement clickobservation;
    
    @FindBy(xpath = "//h4[@title='OCI-Observation with rubric--Isrubricdriven-True-Criterialevelreport-False-Multiplesubmission-True']//bdi[contains(text(),'OCI-Observation with rubric--Isrubricdriven-True-C')]")
    public WebElement Domainstatusobs;
    
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-observation-details[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/submission[1]/sui-accordion[1]/sui-accordion-panel[1]/div[1]/div[1]")
    public WebElement DomainDropdown;
    
    @FindBy(xpath = "(//div//small[normalize-space()='Status : Not started'])[1]")
    public WebElement statusNotStarted;
    
    @FindBy(xpath = "(//div//small[normalize-space()='Status : draft'])[1]")
    public WebElement statusDraft;
    
    @FindBy(xpath = "(//div//small[normalize-space()='Status : completed'])[1]")
    public WebElement statusCompleted;
    
    @FindBy(xpath = "//input[@placeholder='Enter your response'][1]")
    public WebElement answer1;
    
    @FindBy(xpath = "(//input[@placeholder='Enter your response'])[2]")
    public WebElement answer3;
    
    @FindBy(xpath = "(//div[contains(text(),'As the district official')])[1]")
    public WebElement Question1;
    
    @FindBy(xpath = "(//div[contains(text(),'Age')])[1]")
    public WebElement Question3;
    
    @FindBy(xpath = "(//div[contains(text(),'Hira as the education officer as part of his duties ')])[1]")
    public WebElement Question2;
    
    @FindBy(xpath = "(//div[contains(text(),'As the district official')])[2]")
    public WebElement Question4;
    
    @FindBy(xpath = "//div[normalize-space()='Are you sure you want to save this form?']")
    public WebElement saveConfirmationMessage;
    
    @FindBy(xpath = "//div[normalize-space()='Your Form has been saved successfully!']")
    public WebElement secondSaveConfirmationMessage;
    
    @FindBy(xpath = "(//button[normalize-space()='Not Applicable'])[1]")
    public WebElement notapplicable;
  
    @FindBy(xpath = "//button[normalize-space()='Go back']")
    public WebElement GobackButton;
    
    @FindBy(xpath = "//button[normalize-space()='Back']")
    public WebElement BackButtonOnQuestionPage;
    
    @FindBy(xpath = "//h4[normalize-space()='Not Applicable']")
    public WebElement NotApplicablePopup;
    
    @FindBy(xpath = "//p[text()='Please add your remarks here before making the Domain Not applicable.']")
    public WebElement TextOnNotapplicablepopup;
    
    @FindBy(xpath = "//h4//bdi[contains(text(),'OCI-Observation without rubric - oci regression-sc')]")
    public WebElement AddRemarkObs;
    
    @FindBy(xpath = "(//button[text()='Start '])[1]")
    public WebElement StartButton; 
    
    @FindBy(xpath = "(//button[normalize-space ()='Add remarks'])[1]")
    public WebElement AddRemarksButton; 
    
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-questionnaire[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/sl-input[1]/div[1]/div[1]/div[1]/div[2]/sl-page-questions[1]/sl-input[1]/div[2]/div[1]/div[1]/div[2]/sl-ques-remarks[1]/div[2]/textarea[1]")
    public WebElement AddremarksTextbox; 
    
    @FindBy(xpath = "/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-questionnaire[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/form[1]/sl-input[1]/div[1]/div[1]/div[1]/div[2]/sl-page-questions[1]/sl-input[1]/div[3]/div[1]/div[1]/div[3]/sl-ques-remarks[1]/div[2]/textarea[1]")
    public WebElement AddremarksTextbox2; 
    
    @FindBy(xpath = "(//i[@class='trash large icon'])[2]")
    public WebElement RemarksDeleteIcon; 
    
    @FindBy(xpath = "//div[contains(text(),'2 .  Which class does your child study in?')]")
    public WebElement question; 
    
    @FindBy(xpath = "(//div//input[@type='radio'])[1]")
    public WebElement radio1; 
    
    @FindBy(xpath = "//div[@class='sb-h5 ng-star-inserted'][normalize-space()='3 .  Are you currently living in the vicinity of the school?']")
    public WebElement question3;
    
    @FindBy(xpath = "//div[contains(text(),' 5 . ')]")
    public WebElement checkboxquestion; 
    
    @FindBy(xpath = "//div[contains(text(),'You cannot upload evidences, please agree the content policies and try again')]")
    public WebElement textonprivacypolicypopup; 
    
    @FindBy(xpath = "//div[contains(text(),' 3 . ')]")
    public WebElement tipquestion; 
    
    @FindBy(xpath = "//small[normalize-space()='Use the name of the locality where the school is']")
    public WebElement tip; 
    
    @FindBy(xpath = "//h4//bdi[normalize-space()='TEACH Tool-support test']")
    public WebElement QuestionHintObservation;
    
    @FindBy(xpath = "//div[5]//div[1]//h4[1]")
    public WebElement SectionHeader;
    
    @FindBy(xpath = "//div[contains(text(),'6 . ')]")
    public WebElement hintQuestion;
    
    @FindBy(xpath = "//div[contains(text(),'5 . ')]/../following-sibling::div[2]/i[@class='icon large lightbulb']")
    public WebElement questionBulb;
    
    @FindBy(xpath = "//div[@aria-label='Observation 6 accordion']")
    public WebElement instance6;
    
    @FindBy(xpath = "//h4[@class='ui header']")
    public WebElement HintTextBody;
    
    @FindBy(xpath = "//h4//bdi[contains(text(),'Obs without rubrics')]")
    public WebElement AlltypeObservation;
    
    @FindBy(xpath = "(//label[contains(text(),'No')])[1]")
    public WebElement NoRadioOption;
    
    @FindBy(xpath = "//div[contains(text(),' 4 . ')]")
    public WebElement DepedentQuestion; 
    
    @FindBy(xpath = "//div[normalize-space()='This Domain has been already marked as Not applicable.']")
    public WebElement TextOnMarkedNotApplicablePopup; 
    
    @FindBy(xpath = "//div[contains(text(),'Observation form')]")
    public WebElement Text; 
    
    @FindBy(xpath = "//div[contains(text(),' 1 . ')]")
    public WebElement QuestionOne;
    
    @FindBy(xpath = "//div[contains(text(),' 2 . ')]")
    public WebElement QuestionTwo;
    
    @FindBy(xpath = "//input[@type='number']")
    public WebElement ResponseThree;
    
    @FindBy(xpath = "(//span[contains(text(),'Observation')])[1]")
    public WebElement ObservationLabel;
    
    @FindBy(xpath = "(//div[contains(text(),'Domain')])[1]/../../following-sibling::div/button[.='Not Applicable ']")
    public WebElement DomainNotApplicableButton;
    
    @FindBy(xpath = "//h4[@title='Testing Observation with criteriaLevelReport']")
    public WebElement MatrixTypeObs;
    
    @FindBy(xpath = "//div[contains(text(),' 1 . ')]/../../following-sibling::div//button[.=' Capture ']")
    public WebElement Question1Capture;
    
    @FindBy(xpath = "//a[normalize-space()='SECTION 1']")
    public WebElement Section1;
    
    @FindBy(xpath = "//h4[normalize-space()='Section 1']")
    public WebElement SectionHeader1;
    
    @FindBy(xpath = "//button[normalize-space()='Add']")
    public WebElement AddButton;
    
    @FindBy(xpath = "//span[normalize-space()='1']")
    public WebElement MatrixQuestionInstance1;
    
    @FindBy(xpath = "//label[.='Using the textbooks for my class']")
    public WebElement MatrixQuestionResponce1;
    
    @FindBy(xpath = "//label[.='On daily basis according to the class']")
    public WebElement MatrixQuestionResponce2;
    
    @FindBy(xpath = "//label[.='I conduct basic classroom learning']")
    public WebElement MatrixQuestionResponce3;
    
    @FindBy(xpath = "//label[.='I reflect rarely']")
    public WebElement MatrixQuestionResponce4;
    
    @FindBy(xpath = "//label[.='I identified the peers I can reach to but didn’t act on it']")
    public WebElement MatrixQuestionResponce5;
    
    @FindBy(xpath = "//label[.='I identified the peers I can reach to but didn’t act on it']")
    public WebElement CloseIconOnMatrixPopup;
    
    @FindBy(xpath = "//button[@class='sb-btn sb-btn-normal sb-btn-primary'][normalize-space()='Submit']")
    public WebElement MatrixSubmitButton;
    
    @FindBy(xpath = "//span[@class='fs-0-785 modified ng-star-inserted']")
    public WebElement MatrixInstanceStatus;
    
    @FindBy(xpath = "(//i[contains(@class,'trash')])[2]")
    public WebElement SecondTrashIcon;
    
    @FindBy(xpath = "//h4//bdi[text()='OCI-ନିରୀକ୍ଷଣ']")
    public WebElement EnterdateObservation;
    
    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement EnterdateQuestion;
    
    @FindBy(xpath = "//button[normalize-space()='Close']")
    public WebElement CloseButtonQuestionHint;
    
    @FindBy(xpath = "//h4[normalize-space()='Positive Behavioural Expectations']")
    public WebElement sectionHeader;
    
    @FindBy(xpath = "(//a[@class='remove-image'])[2]")
    public WebElement fileremove;
    
    @FindBy(xpath = "//button[normalize-space()='Add District']")
    public WebElement addDistrict;
    
    @FindBy(xpath = "//input[@placeholder='Search']")
    public WebElement searchEntity;
    
    @FindBy(xpath = "//label[.='Prakasam, 2818']")
    public WebElement searchEntityvalue;
    
    @FindBy(xpath = "(//h4//bdi[contains(text(),'Baseline Form_ Blended Teacher Training_APSALT_EI_')])[1]")
    public WebElement AddStateObservation;
    
    @FindBy(xpath = "//button[normalize-space()='Add State']")
    public WebElement addStateButton;
    
    @FindBy(xpath = "//div[contains(text(),'No data found')]")
    public WebElement text;
    
    @FindBy(xpath = "//a[contains(text(),'Privacy Policy')]")
    public WebElement hyperLink;
    
    @FindBy(xpath = "//input[@role='checkbox']")
    public WebElement privacyCheckbox;
    
    @FindBy(xpath = "(//bdi[contains(text(),'Observation with Rubrics for Testing Script for 5.')])[1]")
    public WebElement joinprogramCloseObs;
    
    @FindBy(xpath = "//mat-icon[@role='img']")
    public WebElement closeIcon;
    
    @FindBy(xpath = "(//h4//bdi[contains(text(),'Observation for project in task test School Subrol')])[1]")
    public WebElement teacherObservation;
    
    @FindBy(xpath = "(//bdi[contains(text(),'Observation with Rubrics for Testing Script for 5.')])[1]")
    public WebElement teacherObservation2;
    
    
   
    
   
    
   
    
    
    
    
  
  
}
