package com.sikshalokam.pages.objects;

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
	
	@FindBy(xpath = "//button[text()=' Pdf ']")
	public WebElement pdfButton;
	
	@FindBy(xpath = "//button[text()=' Filters ']")
	public WebElement filterButtonInReport;
	
	
}
