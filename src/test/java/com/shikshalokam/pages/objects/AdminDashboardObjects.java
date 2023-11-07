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

	 @FindBy(xpath="//h6[normalize-space()='Improvement Projects Report']/../../../../td[2]/button/i")
     public  WebElement impProjectReport;
	
	 @FindBy(xpath="//h6[normalize-space()='Improvement Consumption Report']/../../../../td[2]/button/i")
     public  WebElement improvementConsumptionReport;
	 
	 @FindBy(xpath="//h6[normalize-space()='Observation with rubric report']/../../../../td[2]/button/i")
     public  WebElement observationWithRubricReport;
	
	 @FindBy(xpath="//h6[normalize-space()='Observation report']/../../../../td[2]/button/i")
     public  WebElement observationReport;
	
	 @FindBy(xpath="//h6[normalize-space()='Observation consumption Report']/../../../../td[2]/button/i")
     public  WebElement observationConsumptionReport;
	 
	 @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-list-all-reports[1]/div[2]/div[1]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/button[1]")
     public  WebElement surveyReport;
	
	 @FindBy(xpath="//th[@class='sorting_asc']")  
     public  WebElement serialNoColumn;
	 
	 @FindBy(xpath="//th[@aria-label='Parameter: activate to sort column ascending']")
     public  WebElement parameterColumn;
	 
	 @FindBy(xpath="//th[@class='text-center sorting'][normalize-space()='Status']")
     public  WebElement StatusColumn;
	 
	 @FindBy(xpath="(//input[@type='search'])[2]")
     public  WebElement localSearchFilter;
	 
	 @FindBy(xpath="//td[normalize-space()='apekx']")
     public  WebElement apekxPararmeter;
	 
	 @FindBy(xpath="//span[normalize-space()='Graphs']")
     public  WebElement graphsTab;

	 @FindBy(xpath="//span[normalize-space()='Improvement projects status by District']")
     public  WebElement improvementProjectsStatusByDistrictTab;

	 @FindBy(xpath="//span[normalize-space()='Improvement projects status by Block']")
     public  WebElement improvementProjectsStatusByBlockTab;
	
	 @FindBy(xpath="//span[normalize-space()='District wise observation status and entities observed']")
     public  WebElement districtWiseObservationStatusAndEntitiesObservedTab;
	
	 @FindBy(xpath="//div//label[.='Program']/..//div//app-material-auto-complete//div//mat-form-field//div//div//div//input")
     public  WebElement selectProgramFilter;
	 
	 @FindBy(xpath="//div//label[.='Improvement project']/..//div//app-material-auto-complete//div//mat-form-field//div//div//div//input")
     public  WebElement selectImprovementProjectsFilter;
	 
	 @FindBy(xpath="//div//label[.='District']/..//div//app-material-auto-complete//div//mat-form-field//div//div//div//input")
     public  WebElement selectDistrictFilter;
	 
	 @FindBy(xpath="//div//label[.='Block']/..//div//app-material-auto-complete//div//mat-form-field//div//div//div//input")
     public  WebElement selectBlockFilter;
	
	 @FindBy(xpath="//div//label[.='Organisation']/..//div//app-material-auto-complete//div//mat-form-field//div//div//div//input")
     public  WebElement selectOrganisationFilter;
	 
	 @FindBy(xpath="(//span[@class='mat-checkbox-label'])[1]")    
     public  WebElement filterCheckBox1;                             
	 
	 @FindBy(xpath="(//span[@class='mat-checkbox-label'])[2]")             
     public  WebElement filterCheckBox2;
	 
	 @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-report[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[3]/div[1]/label[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[1]/span[1]")             //(//li[@class='ng-star-inserted'])[2]
     public  WebElement exportAs;
	 
	 @FindBy(xpath="//span[normalize-space()='Pdf']")           
     public  WebElement pdf;
	 
	 @FindBy(xpath="//span[normalize-space()='Img']")            
     public  WebElement img;
	 
	 @FindBy(xpath="//button[@aria-label='back-button']")            
     public  WebElement backButton;
	 
	 @FindBy(xpath="//label[normalize-space()='Program']")            
     public  WebElement programLabel;
	 
	 @FindBy(xpath="//label[normalize-space()='Improvement project']")            
     public  WebElement improvementProjectLabel;

	 @FindBy(xpath="//label[normalize-space()='District']")            
     public  WebElement districtLabel;
	 
	 @FindBy(xpath="//label[normalize-space()='Block']")            
     public  WebElement blockLabel;
	 
	 @FindBy(xpath="//label[normalize-space()='Organisation']")            
     public  WebElement organisationLabel;
	 
	 @FindBy(xpath="//button[normalize-space()='Reset Filters']")            
     public  WebElement resetFilters;
	 
	 @FindBy(xpath="//span[normalize-space()='Program name:']")            
     public  WebElement selectedProgramNameSection;

	 @FindBy(xpath="//span[normalize-space()='Project name:']")            
     public  WebElement selectedProjectNameSection;
	 

	 @FindBy(xpath="//span[normalize-space()='District name:']")            
     public  WebElement selectedDistrictNameSection;
	
	 @FindBy(xpath="//span[normalize-space()='Block name:']")            
     public  WebElement selectedBlockNameSection;
	
	 @FindBy(xpath="//span[normalize-space()='Organisation:']")            
     public  WebElement selectedOrganisationSection;
	 
	 @FindBy(xpath="//div[contains(text(),'Showing 1 to ')]")            
     public  WebElement showing1To;
	 
	 @FindBy(xpath="//div[contains(text(),'Showing 11 to ')]")            
     public  WebElement showing11To;
	 
	 @FindBy(xpath="//span//a[.='2']")            
     public  WebElement pagination2;
	 
	  @FindBy(xpath="//div[normalize-space()='*Please select a district first from the district filter']")
	  public  WebElement errorMessageToSelectDistrict;
	  	  
	  @FindBy(xpath="//span[contains(text(),'program – teacher')]")
	  public  WebElement programTeacherProgram;
	  
	  @FindBy(xpath="//span[contains(text(),'improvement project - teacher')]")
	  public  WebElement ImprovementProjectTeacher;
	  
	  @FindBy(xpath="//span[contains(text(),'ananthapuram')]")
	  public  WebElement ananthapuramDistrict;
	  
	  @FindBy(xpath="//span[contains(text(),'amadagur')]")
	  public  WebElement amadagurBlock;
	  
	  @FindBy(xpath="//span[contains(text(),'staging custodian organization')]")
	  public  WebElement stagingCustodianOrganization;
}
