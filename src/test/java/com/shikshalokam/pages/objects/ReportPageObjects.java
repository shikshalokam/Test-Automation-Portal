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
	
	@FindBy(xpath = "//table//tr//td[text()='1']")
	public WebElement myReportPage1stReport;
	
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
	//h6[normalize-space()='Automation rubric with single submission - Teacher']
	
	@FindBy(xpath = "//h6[contains(text(),'Automation rubric with multiple submission - Teach')]")
	public WebElement obsWithRubricMultipleSubmissionReport;

	@FindBy(xpath = "//h6[normalize-space()='Automation rubric without submission - Teacher']")
	public WebElement obsWithoutRubricReport;
	
	
	//h6[contains(text(),'Automation rubric with multiple submission - Teach')]
	//h6[normalize-space()='Automation rubric without submission - Teacher']
	
	//strong[normalize-space()='Descriptive view']
	@FindBy(xpath = "//strong[normalize-space()='Descriptive view']")
	public WebElement descriptiveViewSection;
	
	@FindBy(xpath = "//mat-select[@aria-label='Select Submission']")
	public WebElement selectSubmissionDropdown;
	
	 @FindBy(xpath="//th[@aria-label='Serial No: activate to sort column descending']")
     public  WebElement serialNoCloumn;  
	 
	 @FindBy(xpath="//th[@aria-label='Title: activate to sort column ascending']")
     public  WebElement titleCloumn;
	 
	 @FindBy(xpath="//th[@aria-label='Latest Submission: activate to sort column ascending']")
     public  WebElement latestSubmissionCloumn;
	//th[@aria-label='Title: activate to sort column ascending']
	
}
