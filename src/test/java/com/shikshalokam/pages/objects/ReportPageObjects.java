package com.shikshalokam.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ReportPageObjects {

	@FindBy(xpath = "//li[text()=' My Reports ']")
	public WebElement myReportsFromProfile;
	
	@FindBy(xpath = "//a[text()=' My Reports']")
	public WebElement myReportsTitle;
	
	@FindBy(xpath = "//select[contains(@class,'search-entity')]")
	public WebElement entityFilterForReport;
	//table//tr//td[text()='1']
	@FindBy(xpath = "//h6[normalize-space()='QA solution - entity type block - Parent Child - FD 345']")
	public WebElement qaSolutionEntityTypeBlockParentChildFD345Report;
	
	@FindBy(xpath = "//span[text()='Questions']")
	public WebElement questionTabFromReport;
	
	@FindBy(xpath = "//span[text()='Criteria']")
	public WebElement critiriaTabFromReport;
	
	@FindBy(xpath = "//button[text()=' Export As ']")
	public WebElement exportAsButtonInReport;
	
	@FindBy(xpath = "(//div//button[text()=' Pdf '])[2]")
	public WebElement pdfButtonWithoutRubric;
	
	@FindBy(xpath = "//div//button[text()=' Pdf ']")
	public WebElement pdfButtonWithRubric;
	
	@FindBy(xpath = "//button[text()=' Filters ']")
	public WebElement filterButtonInReport;
	
	@FindBy(xpath = "//h6[normalize-space()='Automation rubric with single submission - Teacher']")
	public WebElement obsWithRubricSingleSubmissionReport;
	
	@FindBy(xpath = "//h6[contains(text(),'Automation rubric with multiple submission - Teach')]")
	public WebElement obsWithRubricMultipleSubmissionReport;

	@FindBy(xpath = "//h6[normalize-space()='Automation rubric without submission - Teacher']")
	public WebElement obsWithoutRubricReport;

	@FindBy(xpath = "//strong[normalize-space()='Descriptive view']")
	public WebElement descriptiveViewSection;
	
	@FindBy(xpath = "//mat-select[@aria-label='Select Submission']")
	public WebElement selectSubmissionDropdown;
	
	 @FindBy(xpath="//th[normalize-space()='Serial No']")
     public  WebElement serialNoColumn;  
	 
	 @FindBy(xpath="//th[normalize-space()='Title']")
     public  WebElement titleColumn;
	 
	 @FindBy(xpath="//th[normalize-space()='Latest Submission']")
     public  WebElement latestSubmissionColumn;
	//th[@aria-label='Title: activate to sort column ascending']
	 
	 @FindBy(xpath="(//div/h6)[1]")
     public  WebElement submittedObservationName;
	 	 
	 @FindBy(xpath="(//div/p)[1]")
     public  WebElement programNameOfSubmittedObservation;
	 
	 @FindBy(xpath="//div//h4[normalize-space()='Select entity']")
     public  WebElement selectEntityPopup;
	 
	 @FindBy(xpath="//button[@class='close-btn']")
     public  WebElement crossIcon;
	 
	 @FindBy(xpath="(//input[@type='radio']/..)[1]")
     public  WebElement selectFirstEntity;
	 
	 @FindBy(xpath="//div//button[normalize-space()='Submit']")
     public  WebElement submitButton;
	 
	 @FindBy(xpath="//h6[normalize-space()='Observation with Rubrics for program 1']/../../../../td[2]/button/i")
     public  WebElement observationWithRubricsforprogram1;
	 
	 @FindBy(xpath="//h6[normalize-space()='Solution without rubrics -File button – FD-429']")
     public  WebElement solutionWithoutRubricsFileButtonFD429;
	//h6[normalize-space()='Solution without rubrics -File button – FD-429']
	 
	 @FindBy(xpath="//div//div[@class='report-title']")
     public  WebElement observationNameOnReportPage;
	 
	 @FindBy(xpath="//div//span[contains(text(),'Last Submitted On')]/..")
     public  WebElement lastSubmittedDateOnReportPage;
	 
	 @FindBy(xpath="//div/following-sibling::p")
     public  WebElement EntityNameOnReportPage;
	 
	 @FindBy(xpath="(//mat-option/span[contains(text(),'Observation ')])[2]")
     public  WebElement listOfSubmissions;
	 
	 @FindBy(xpath="//div//h4[.='Select Questions  to filter']")
     public  WebElement questionsFiltersPopup;
	 
	 @FindBy(xpath="//div//h4[.='Select Criteria  to filter']")
     public  WebElement criteriaFiltersPopup;

	 @FindBy(xpath="//div//button[normalize-space()='Apply Filters']")
     public  WebElement ApplyFiltersButton;
	
	 @FindBy(xpath="(//label[@class='questions'])[1]")
     public  WebElement question1option;
	 

	 @FindBy(xpath="//th[normalize-space()='Title']/../../following-sibling::tbody//h6")
     public  WebElement obseravtionsUnderTitleColumn;
	
	
}
