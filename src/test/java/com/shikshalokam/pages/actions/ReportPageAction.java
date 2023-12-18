package com.shikshalokam.pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.objects.LoginPageObjects;
import com.shikshalokam.pages.objects.ObservationPageObjects;
import com.shikshalokam.pages.objects.ReportPageObjects;
import com.shikshalokam.utils.logger.Logger;
import com.shikshalokam.utils.prop.PropUtlis;

public class ReportPageAction {

	LoginPageObjects loginPageObjects = new LoginPageObjects();
    ObservationPageObjects observationPageObjects = new ObservationPageObjects();
    ReportPageObjects reportPageObjects = new ReportPageObjects();
    
    JavascriptExecutor js = (JavascriptExecutor) ShikshaLokamClient.get().driver();
    
    
    String appUrl;
    public String getEnvironmentValue() throws Exception {
    	return appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
    }
    
    public ReportPageAction() throws Exception {
    	reportPageObjects = PageFactory.initElements(ShikshaLokamClient.get().driver(), ReportPageObjects.class);
    }
        //******************Actions*********************************************************//
    
    	public void clickOnMyReportsTab() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.myReportsFromProfile);
    		Logger.logAndReportInfo("Clicked on the my reports tab .");
    	}
    
    	public void clickOnqaSolutionEntityTypeBlockParentChildFD345Report() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.qaSolutionEntityTypeBlockParentChildFD345Report);
    		Logger.logAndReportInfo("Clicked on the QA solution - entity type block - Parent Child - FD 345 - Report");
    	}
    	
    	public void clickOnObsWithRubricSingleSubmissionReport() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.obsWithRubricSingleSubmissionReport);
    		Logger.logAndReportInfo("Clicked on Automation rubric with single submission - Teacher from my report section.");
    	}
    	
    	public void clickOnObsWithRubricMultipleSubmissionReport() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.obsWithRubricMultipleSubmissionReport);
    		Logger.logAndReportInfo("Clicked on Automation rubric with Multiple submission - Teacher from my report section.");
    	}
    	
    	
    	public void clickOnObsWithoutRubricReport() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.obsWithoutRubricReport);
    		Logger.logAndReportInfo("Clicked on Automation rubric without submission - Teacher from my report section.");
    	}
    	
    	public void clickOnCriteriaTab() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.critiriaTabFromReport);
    		Logger.logAndReportInfo("Clicked on Criteria Tab .");
    	}
    	
    	public void clickOnExportAsButton() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.exportAsButtonInReport);
    		Logger.logAndReportInfo("Clicked on the export as button in report.");
    	}
    
    	public void moveonExportAsButton() throws Exception {
    		ShikshaLokamClient.get().gestures().moveToElement(reportPageObjects.exportAsButtonInReport);
    		Thread.sleep(5000);
    		Logger.logAndReportInfo("Moved on to the export as button.");
    	}
    	public void clickOnPDFButton() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.pdfButtonWithoutRubric);
    		Logger.logAndReportInfo("Clicked on the pdf button.");
    	}
    	
    	public void selectFirstEntity() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.selectFirstEntity);
    		Logger.logAndReportInfo("selected First Entity.");
    	}
    	
    	public void clickOnSubmitButton() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.submitButton);
    		Logger.logAndReportInfo("Clicked on Submit button.");
    	}
    	
    	public void clickOnSelectSubmissionDropdown() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.selectSubmissionDropdown);
    		Logger.logAndReportInfo("Clicked on Select Submission Dropdown button.");
    	}
    	
    	public void clickOnFiltersButton() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.filterButtonInReport);
    		Logger.logAndReportInfo("Clicked on Filters button.");
    	}
    	
    	public void clickOnCrossButton() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.crossIcon);
    		Logger.logAndReportInfo("Clicked on Cross button.");
    	}
    	
     
    	
    	
    	
    	  public void selectObservationWithRubricReport() throws Exception {
	   	      if(getEnvironmentValue().contains("diksha")) {
		            ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
		        } else if(getEnvironmentValue().contains("preprod")) {
		        	ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
		        } else {
		 	        Thread.sleep(2000);
		 	        ShikshaLokamClient.get().gestures().click(reportPageObjects.observationWithRubricsforprogram1);
		 	        Logger.logAndReportInfo("Clicked on Observation with Rubrics for Program 1 Report"); 
		        }
	    }
    
    	  public void selectSolutionWithoutRubricsFileButtonFD429Report() throws Exception {
	   	      if(getEnvironmentValue().contains("diksha")) {
		            ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
		        } else if(getEnvironmentValue().contains("preprod")) {
		        	ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
		        } else {
		 	        Thread.sleep(2000);
		 	        ShikshaLokamClient.get().gestures().click(reportPageObjects.solutionWithoutRubricsFileButtonFD429);
		 	        Logger.logAndReportInfo("Clicked on Solution without rubrics -File button – FD-429 Report"); 
		        }
	    }
    	//******************Verify*********************************************************//
    	
    	public void verifyMyReportsTitle() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.myReportsTitle),"My reports title is not displayed.");
    		Logger.logAndReportPass("My reports title is displayed succesfully. ");
    	}
    	
    	public void verifyMyReportsSection() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.myReportsFromProfile),"My reports section is not displayed.");
    		Logger.logAndReportPass("My reports section  is displayed succesfully. ");
    	}
    	
    	public void verifyMyReportsSectionNotAvailable() throws Exception {
            Assert.assertFalse(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.myReportsFromProfile),"My reports section is displayed.");
    		Logger.logAndReportPass("My reports section  is not displayed succesfully. ");
    	}
    	
    	 public void verifyMyReportInTableFormat() throws Exception {
 	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.serialNoColumn),"Serial.No Column is not displayed.");
 			Logger.logAndReportInfo("Serial.No Column is displayed.");
 			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.titleColumn),"Tile Column is not displayed.");
 			Logger.logAndReportInfo("Title Column is displayed.");
 			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.latestSubmissionColumn),"Latest Submission Column is not displayed.");
 			Logger.logAndReportInfo("Latest Submission Column is displayed.");
 			
 		}
    	public void verifyEntityFilterOption() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.entityFilterForReport),"Entity Filter for report is not displayed.");
    		Logger.logAndReportPass("Entity Filter for report is displayed succesfully.");
    	}
    	
    	public void verifyQuestionTabInReport() throws Exception {
    		Thread.sleep(10000);
            Assert.assertTrue(ShikshaLokamClient.get().gestures().click(reportPageObjects.questionTabFromReport),"Question Tab inside the report is not displayed.");
    		Logger.logAndReportPass("Question Tab inside the report is displayed succesfully.");
    	}
    	
    	public void verifyQuestionTabIsSelected() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isSelected(reportPageObjects.questionTabFromReport),"Question Tab is Not Selected By Default");
    		Logger.logAndReportPass("Question Tab is Selected By Default");
    	}
    	
    	public void verifyCriteriaTabInReport() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.critiriaTabFromReport),"Criteria Tab inside the report is not displayed.");
    		js.executeScript("arguments[0].scrollIntoView(true);", reportPageObjects.critiriaTabFromReport);
    		Logger.logAndReportPass("Criteria Tab inside the report is displayed succesfully.");
    	}
    	
    	public void verifyFiltersButtonInReport() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.filterButtonInReport),"Filters button is not displayed.");
    		Logger.logAndReportPass("Filters button is displayed succesfully.");
    	}
    	
    	public void verifyExportAsButtonInReport() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.exportAsButtonInReport),"Export button is not displayed.");
    		Logger.logAndReportPass("Export button is displayed succesfully.");
    	}
    	
    	public void verifySelectSubmissionDropdown() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.selectSubmissionDropdown),"Select Submission Dropdown is not displayed.");
    		Logger.logAndReportPass("Select Submission Dropdown is displayed succesfully.");
    	}
    	
    	public void verifylistOfSubmissions() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.listOfSubmissions),"List Of Submissions is not displayed.");
    		Logger.logAndReportPass("List Of Submissions is displayed succesfully.");
    	}
    	public void verifyPdfButtonInReportWithoutRubric() throws Exception {
    		//ShikshaLokamClient.get().gestures().moveToElement(reportPageObjects.pdfButton);
    		//Assert.assertTrue(ShikshaLokamClient.get().gestures().isDisplayed(reportPageObjects.pdfButton));
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.pdfButtonWithoutRubric),"PDF Button is not displayed.");
    		Logger.logAndReportPass("PDF Button is displayed succesfully.");
    	}
    	

    	public void verifyPdfButtonInReportWithRubric() throws Exception {
    		//ShikshaLokamClient.get().gestures().moveToElement(reportPageObjects.pdfButton);
    		//Assert.assertTrue(ShikshaLokamClient.get().gestures().isDisplayed(reportPageObjects.pdfButton));
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.pdfButtonWithRubric),"PDF Button is not displayed.");
    		Logger.logAndReportPass("PDF Button is displayed succesfully.");
    	}
    	public void verifyPdfButtonInReportBoolean() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.pdfButtonWithoutRubric));
    		Logger.logAndReportPass("Pdf button is displayed.");
    	}
    	public void verifyDescriptiveViewSection() throws Exception {
    		js.executeScript("arguments[0].scrollIntoView(true);", reportPageObjects.descriptiveViewSection);
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.descriptiveViewSection),"Descriptive View Section is not displayed.");
    		Logger.logAndReportPass("Descriptive View Section is displayed.");
    	}
    	
    	public void verifySubmittedObservationName() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.submittedObservationName),"Submitted Observation Name is not displayed.");
    		Logger.logAndReportPass("Submitted Observation Name is displayed succesfully. ");
    	}
    	
    	public void verifyProgramNameOfSubmittedObservation() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.programNameOfSubmittedObservation),"Program Name Of Submitted Observation is not displayed.");
    		Logger.logAndReportPass("Program Name Of Submitted Observation is displayed succesfully. ");
    	}
    	
    	 public void verifyEntityListingPopup() throws Exception {
 	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.selectEntityPopup),"Entity Listing Pop-up is not displayed.");
 			Logger.logAndReportPass("Entity Listing Pop-up is displayed succesfully");
 		}
    	
    	public void verifyContentsOfEntityListingPopup() throws Exception {
			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.selectEntityPopup),"Select entity - Header is not displayed.");
			Logger.logAndReportPass("Select entity - Header is displayed succesfully");
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.crossIcon),"Cross icon 'x' icon is not displayed.");
			Logger.logAndReportPass("Cross icon 'x' icon is displayed succesfully");
			Thread.sleep(2000);
			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.selectFirstEntity),"List of Entities are not displayed.");
			Logger.logAndReportPass("List of Entities are displayed succesfully");
			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.submitButton),"Submit Button is not displayed.");
			Logger.logAndReportPass("Submit Button is displayed succesfully");
		}
    	
    	 public void verifySubmitGotEnabled() throws Exception {
  	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(reportPageObjects.submitButton),"Submit Button is Disabled");
  			Logger.logAndReportPass("Submit Button got Enabled");
  		}
    	 
    		public void verifyRedirectedToReportPage() throws Exception {
    			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.observationNameOnReportPage),"Observation Name is not Displayed on Report Page.");
    			Logger.logAndReportInfo("Observation Name is Displayed on Report Page.");
    	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.lastSubmittedDateOnReportPage),"Last Submitted Date section is not displayed on Report Page.");
    			Logger.logAndReportInfo("Last Submitted Date section is displayed on Report Page.");
    			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.EntityNameOnReportPage),"Entity Name is not Displayed on Report Page.");
    			Logger.logAndReportInfo("Entity Name is Displayed on Report Page.");
    			
    			Logger.logAndReportPass("Redirected to Report Page Succesfully");
    		}
    		
    		 public void verifyQuestionsTabFiltersPopup() throws Exception {
    	 	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.questionsFiltersPopup),"Filters Pop-up is not displayed.");
    	 			Logger.logAndReportPass("Filters Pop-up is displayed succesfully");
    	 		}
    		 
    		 public void verifyContentsOfQuestionsTabFiltersPopup() throws Exception {
    				Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.questionsFiltersPopup),"Select Questions  to filter - Header is not displayed.");
    				Logger.logAndReportPass("Select Questions  to filter - Header is displayed succesfully");
    		        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.crossIcon),"Cross icon 'x' icon is not displayed.");
    				Logger.logAndReportPass("Cross icon 'x' icon is displayed succesfully");
    				Thread.sleep(2000);
    				Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.question1option),"List of Questions are not displayed.");
    				Logger.logAndReportPass("List of Questions are displayed succesfully");
    				Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.ApplyFiltersButton),"Apply Filters Button is not displayed.");
    				Logger.logAndReportPass("Apply Filters Button is displayed succesfully");
    			}
    		 
    		 public void verifyCriteriaFiltersPopup() throws Exception {
 	 	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.criteriaFiltersPopup),"Filters Pop-up is not displayed.");
 	 			Logger.logAndReportPass("Filters Pop-up is displayed succesfully");
 	 		}
 		 
 		 public void verifyContentsCriteriaOfTabFiltersPopup() throws Exception {
 				Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.criteriaFiltersPopup),"Select Questions  to filter - Header is not displayed.");
 				Logger.logAndReportPass("Select Questions  to filter - Header is displayed succesfully");
 		        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.crossIcon),"Cross icon 'x' icon is not displayed.");
 				Logger.logAndReportPass("Cross icon 'x' icon is displayed succesfully");
 				Thread.sleep(2000);
 				Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.question1option),"List of Criteria are not displayed.");
 				Logger.logAndReportPass("List of Criteria are displayed succesfully");
 				Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.ApplyFiltersButton),"Apply Filters Button is not displayed.");
 				Logger.logAndReportPass("Apply Filters Button is displayed succesfully");
 			}
 		 
 		 public void verifySubmittedObservationsUnderTitleColumn() throws Exception {
	 	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.obseravtionsUnderTitleColumn),"Observation names doesnt show up under Title Column");
	 			Logger.logAndReportPass("Observation names shows up under Title Column");
	 		}
}
