package com.shikshalokam.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminDashboardObjects {
	
	 @FindBy(xpath="//li[normalize-space()='Admin dashboard']")
     public  WebElement admindashboard;

	 @FindBy(xpath="//div[contains(text(),'Reports')]")
     public  WebElement reportsTab;

	 @FindBy(xpath="//div[contains(text(),'Datasets')]")
     public  WebElement datasetsTab;

	 @FindBy(xpath="(//input[@type='search'])[1]")
     public  WebElement globalSearchFilter;

	 
	 @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-list-all-reports[1]/div[2]/div[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/button[1]/i[1]")
     public  WebElement impProjectReportStaging;
	 
	 @FindBy(xpath="//tbody//i[1]")
     public  WebElement impProjectReportPreprod;
	 
	 @FindBy(xpath="//tbody//i[1]")
     public  WebElement observationReport;
	 
	 @FindBy(xpath="//tbody//i[1]")
     public  WebElement surveyReport;
	//tbody//i[1]
	//tbody//i[1]
	 
	 @FindBy(xpath="//th[@class='sorting_asc']")  
     public  WebElement serialNoColumn;
	 
	 @FindBy(xpath="//th[@aria-label='Parameter: activate to sort column ascending']")
     public  WebElement parameterColumn;
	 
	 @FindBy(xpath="//th[@class='text-center sorting'][normalize-space()='Status']")
     public  WebElement StatusColumn;
	 

	 @FindBy(xpath="(//input[@type='search'])[2]")
     public  WebElement localSearchFilter;
	 
	 @FindBy(xpath="//td[normalize-space()='up']")
     public  WebElement upPararmeter;
	 
	 @FindBy(xpath="//span[normalize-space()='Graphs']")
     public  WebElement graphsTab;
	//span[normalize-space()='Graphs']
	 
	 
	 @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-report[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[2]/div[1]/app-filter[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-material-auto-complete[1]/div[1]/mat-form-field[1]/div[1]/div[1]")
     public  WebElement selectProgramFilter;
	 
	 @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-report[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[2]/div[1]/app-filter[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-material-auto-complete[1]/div[1]/mat-form-field[1]/div[1]/div[1]")
     public  WebElement selectImprovementProjectsFilter;
	 
	 @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-report[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[2]/div[1]/app-filter[1]/form[1]/div[1]/div[1]/div[1]/div[3]/div[1]/app-material-auto-complete[1]/div[1]/mat-form-field[1]/div[1]/div[1]")
     public  WebElement selectDistrictFilter;
	 
	 
	 @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-report[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[2]/div[1]/app-filter[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[1]/app-material-auto-complete[1]/div[1]/mat-form-field[1]/div[1]/div[1]")
     public  WebElement selectOrganisationFilter;
	
	 @FindBy(xpath="(//span[@class='mat-checkbox-label'])[1]")     // (//span[@class='mat-checkbox-ripple mat-focus-indicator mat-ripple'])[2]
     public  WebElement filterCheckBox1;                             //  (//span[@class='mat-checkbox-frame'])[1]   
	 
	 @FindBy(xpath="(//span[@class='mat-checkbox-label'])[2]")             //(//li[@class='ng-star-inserted'])[2]
     public  WebElement filterCheckBox2;
	 
	 
	 @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-report[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[3]/div[1]/label[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")             //(//li[@class='ng-star-inserted'])[2]
     public  WebElement exportAs;
	 
	 
	 @FindBy(xpath="//span[normalize-space()='Pdf']")             //(//li[@class='ng-star-inserted'])[2]
     public  WebElement pdf;
	 
	 @FindBy(xpath="//span[normalize-space()='Img']")             //(//li[@class='ng-star-inserted'])[2]
     public  WebElement img;
	 
	 @FindBy(xpath="//button[@aria-label='back-button']")             //(//li[@class='ng-star-inserted'])[2]
     public  WebElement backButton;
	//button[@aria-label='back-button']
	 
	//span[normalize-space()='Img']
	//span[normalize-space()='Pdf']
	 
	 
	 
	 // /html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-report[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[2]/div[1]/app-filter[1]/form[1]/div[1]/div[1]/div[1]/div[4]/div[1]/app-material-auto-complete[1]/div[1]/mat-form-field[1]/div[1]/div[1]
//	 /html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-report[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[2]/div[1]/app-filter[1]/form[1]/div[1]/div[1]/div[1]/div[2]/div[1]/app-material-auto-complete[1]/div[1]/mat-form-field[1]/div[1]/div[1]
	 
	// /html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-report[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[2]/div[1]/app-filter[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/app-material-auto-complete[1]/div[1]/mat-form-field[1]/div[1]/div[1]
	//td[normalize-space()='up']
	 //	 /html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-list-all-reports[1]/div[2]/div[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/div[1]/label[1]/input[1]
	//th[@class='text-center sorting_asc']
	//th[@aria-label='Parameter: activate to sort column ascending']
	//th[@class='sorting_asc']
	 //tbody/tr[1]/td[2]/button[1]/i[1]	 
	 
	 
	 
	 
	//div[contains(text(),'Datasets')]
	//div[contains(text(),'Reports')]
	 //input[@type='search']
	 
	 
	 
	//th[@class='sorting_asc']
	//th[@aria-label='Parameter: activate to sort column ascending']
	//th[@class='text-center sorting'][normalize-space()='Status']
}
