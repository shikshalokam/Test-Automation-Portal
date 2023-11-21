package com.shikshalokam.pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.objects.AdminDashboardObjects;
import com.shikshalokam.utils.logger.Logger;
import com.shikshalokam.utils.prop.PropUtlis;

public class AdminDashboardAction {
	
	AdminDashboardObjects adminDashboardObjects;
	
	 public AdminDashboardAction() throws Exception {
		 adminDashboardObjects = PageFactory.initElements(ShikshaLokamClient.get().driver(), AdminDashboardObjects.class);
	    }
	      SoftAssert softAssert = new SoftAssert();

	    JavascriptExecutor js = (JavascriptExecutor) ShikshaLokamClient.get().driver();
	    
	    String appUrl;
	    public String getEnvironmentValue() throws Exception {
	    	return appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
	    }
	    
	    // switch to webview for inspect elements
	    public void switchToWebView() throws Exception {
	        Thread.sleep(5000);

	    }

	    public void clickOnadmindashboard() throws Exception {
			ShikshaLokamClient.get().gestures().click(adminDashboardObjects.admindashboard);
     ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Admin Dashboard"); 
	    }
	    
	 
	   /* public void verifyTabs() throws Exception {
	    	Thread.sleep(5000);
	    	verifyReportstab();
	    	verifyDatasetstab();
	    }
*/	    
	    
	    public void verifyReportsandDatasetsTab() throws Exception {
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.reportsTab),"Reports tab is not displayed.");
			Logger.logAndReportPass("Reports tab is displayed.");
			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.datasetsTab),"Datasets tab is not displayed.");
			Logger.logAndReportPass("Datasets tab is displayed.");
		
		}
	    
	  

		
	    public void verifyGlobalSearchfilter() throws Exception {
	       Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.globalSearchFilter),"Global Search Filter is not displayed.");
			Logger.logAndReportPass("Global Search Filter is displayed.");
			
		}
	    

	/*    public void searchAndSelectProjectReports() throws Exception {
	        ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.globalSearchFilter,"test improve report");
	    	//adminDashboardObjects.globalSearchFilter.sendKeys("Improvement Project Report test");
	        Logger.logAndReportInfo("Searched for test improve report ");
	        Thread.sleep(2000);
	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.impProjectReport);
	        Logger.logAndReportInfo("Clicked on Improvement Project Report"); 
	    }   */
	        
	        public void searchAndSelectImprovementsProjectReport() throws Exception {
	   	         
	   	      if(getEnvironmentValue().contains("diksha")) {
		            ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
		        } else if(getEnvironmentValue().contains("preprod")) {
		        	 ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
		        } else {
		        	
		        	 ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.globalSearchFilter,"Improvement Projects Report");
		        	 //System.out.println(Clock.SYSTEM);
		 	        Logger.logAndReportInfo("Searched for Improvement Projects Report");
		 	        Thread.sleep(2000);
		 	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.impProjectReport);
		 	       //System.out.println(Clock.SYSTEM);
		 	        Logger.logAndReportInfo("Clicked on Improvements Project Report"); 
		        }
	    }
	        public void searchAndSelectImprovementsConsumptionReport() throws Exception {
	   	         
		   	      if(getEnvironmentValue().contains("diksha")) {
			            ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
			        } else if(getEnvironmentValue().contains("preprod")) {
			        	 ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
			        } else {
			        	
			        	 ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.globalSearchFilter,"Improvement Consumption Report");
			        	 //System.out.println(Clock.SYSTEM);
			 	        Logger.logAndReportInfo("Searched forImprovement Consumption Report");
			 	        Thread.sleep(2000);
			 	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.improvementConsumptionReport);
			 	       //System.out.println(Clock.SYSTEM);
			 	        Logger.logAndReportInfo("Clicked on Improvement Consumption Report"); 
			        }
		    }
	    
	      
	        public void searchAndSelectObservationWithRubricsReport() throws Exception {
	   	         
		   	      if(getEnvironmentValue().contains("diksha")) {
			            ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
			        } else if(getEnvironmentValue().contains("preprod")) {
			        	ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
			        } else {
                          ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.globalSearchFilter,"Observation With Rubric Report");
			 	    	
			 	        Logger.logAndReportInfo("Searched for Observation With Rubric Report ");
			 	        //Thread.sleep(2000);
			 	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.observationWithRubricReport);
			 	        Logger.logAndReportInfo("Clicked on Observation With Rubric Report"); 
			        }
		    }
	        

	        public void searchAndSelectObservationReport() throws Exception {
	   	         
		   	      if(getEnvironmentValue().contains("diksha")) {
			            ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
			        } else if(getEnvironmentValue().contains("preprod")) {
			        	ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
			        } else {
                          ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.globalSearchFilter,"Observation Report");
			 	    	
			 	        Logger.logAndReportInfo("Searched for Observation Report ");
			 	        //Thread.sleep(2000);
			 	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.observationReport);
			 	        Logger.logAndReportInfo("Clicked on Observation Report"); 
			        }
		    }
	        
	        public void searchAndSelectObservationConsumptionReport() throws Exception {
	   	         
		   	      if(getEnvironmentValue().contains("diksha")) {
			            ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
			        } else if(getEnvironmentValue().contains("preprod")) {
			        	ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
			        } else {
                        ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.globalSearchFilter,"Observation consumption Report");
			 	    	
			 	        Logger.logAndReportInfo("Searched for Observation consumption Report");
			 	        //Thread.sleep(2000);
			 	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.observationConsumptionReport);
			 	        Logger.logAndReportInfo("Clicked on Observation consumption Report"); 
			        }
		    }
	        
	        public void searchAndSelectSurveyReport() throws Exception {
	   	         
		   	      if(getEnvironmentValue().contains("diksha")) {
			            ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
			        } else if(getEnvironmentValue().contains("preprod")) {
			            ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	

			        } else {
                        ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.globalSearchFilter,"Survey consumption Report");
			 	    	
			 	        Logger.logAndReportInfo("Searched for Survey consumption Report");
			 	        //Thread.sleep(2000);
			 	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.surveyReport);
			 	        Logger.logAndReportInfo("Clicked on Survey consumption Report"); 
			        }
		    }
	        
	        
	        
	        
	    public void verifySelectedReportInTableFormat() throws Exception {
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.serialNoColumn),"Serial.No Column is not displayed.");
			Logger.logAndReportInfo("Serial.No Column is displayed.");
			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.parameterColumn),"Parameter Column is not displayed.");
			Logger.logAndReportInfo("ParameterColumn is displayed.");
			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.StatusColumn),"Status Column is not displayed.");
			Logger.logAndReportInfo("Status Column is displayed.");
			
		}
	    public void verifyLocalSearchfilter() throws Exception {
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.localSearchFilter),"Local Search Filter is not displayed.");
			Logger.logAndReportPass("Local Search Filter is displayed.");
			
		}
	    
	    
	    public void searchAndSelectParameter() throws Exception {
	    	ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.localSearchFilter,"apekx");
	        Logger.logAndReportInfo("Searched for apekx1");
	        Thread.sleep(2000);
	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.apekxPararmeter);
	        Logger.logAndReportInfo("Clicked on apekx Parameter");     
	    }
	    
	    public void verifyGraphsTab() throws Exception {
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.graphsTab),"Graphs tab is not Present.");
			Logger.logAndReportPass("Graphs tab is Present.");
		
		}
	    
	    public void verifyImprovementProjectsStatusByDistrictTab() throws Exception {
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.improvementProjectsStatusByDistrictTab),"Improvement projects status by District tab is not Present.");
			Logger.logAndReportPass("Improvement projects status by District is Present.");
		
		}
	    
	    public void verifyImprovementProjectsStatusByBlockTab() throws Exception {
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.improvementProjectsStatusByBlockTab),"Improvement projects status by Block tab is not Present.");
			Logger.logAndReportPass("Improvement projects status by Block tab is Present.");
		
		}
	    
	    public void verifyDistrictWiseObservationStatusAndEntitiesObservedTab() throws Exception {
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.districtWiseObservationStatusAndEntitiesObservedTab),"District wise observation status and entities observed tab is not Present.");
			Logger.logAndReportPass("District wise observation status and entities observed tab is Present.");
		
		}
	    
	    public void verifyBlockWiseObservationStatusAndEntitiesObservedTab() throws Exception {
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.blockWiseObservationStatusAndEntitiesObservedTab),"District wise observation status and entities observed tab is not Present.");
			Logger.logAndReportPass("Block wise observation status and entities observed tab is Present.");
		
		}
	    public void clickOnDistrictWiseObservationStatusAndEntitiesObservedTab() throws Exception {
	       ShikshaLokamClient.get().gestures().click(adminDashboardObjects.districtWiseObservationStatusAndEntitiesObservedTab);
		Logger.logAndReportPass("Clicked On District wise observation status and entities observed tab.");
		
		}
	    
	    public void clickOnBlockWiseObservationStatusAndEntitiesObservedTab() throws Exception {
		       ShikshaLokamClient.get().gestures().click(adminDashboardObjects.blockWiseObservationStatusAndEntitiesObservedTab);
			Logger.logAndReportPass("Clicked On Block wise observation status and entities observed tab.");
			
			}
	    public void clickOnimprovementProjectsStatusByDistrictTab() throws Exception {
		       ShikshaLokamClient.get().gestures().click(adminDashboardObjects.improvementProjectsStatusByDistrictTab);
			Logger.logAndReportPass("Clicked On Improvement Projects Status By District tab.");
			
			}
	    public void clickOnimprovementProjectsStatusByBlockTab() throws Exception {
		       ShikshaLokamClient.get().gestures().click(adminDashboardObjects.improvementProjectsStatusByBlockTab);
			Logger.logAndReportPass("Clicked On Improvement Projects Status By Block tab.");
			Thread.sleep(2000);
			
			}
	    
 public void selectProjectFilters() throws Exception {
	 ShikshaLokamClient.get().gestures().click(adminDashboardObjects.selectProgramFilter);
     ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Program Filter"); 
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox1);
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox2);
     ShikshaLokamClient.get().report().log(Status.INFO, " Selected multiple filters"); 
  
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.selectImprovementProjectsFilter);
     ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Improvement Projects Filter"); 
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox1);
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox2);
     ShikshaLokamClient.get().report().log(Status.INFO, "Selected multiple filters");
    
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.selectDistrictFilter);
     ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select District Filter"); 
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox1);
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox2);
     ShikshaLokamClient.get().report().log(Status.INFO, "Selected multiple filters");
     
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.selectBlockFilter);
     ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Block Filter");
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox1);
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox2);
     ShikshaLokamClient.get().report().log(Status.INFO, "Selected multiple filters");
    
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.selectOrganisationFilter);
     ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Organisation Filter"); 
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox1);
     ShikshaLokamClient.get().report().log(Status.INFO,  "Selected Organisation filter");   
     
	    }
	    
	    public void selectObservationFilters() throws Exception {
			ShikshaLokamClient.get().gestures().click(adminDashboardObjects.selectProgramFilter);
     ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Program Filter"); 
    // Thread.sleep(2000);
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox1);
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox2);
     ShikshaLokamClient.get().report().log(Status.INFO, "Selected multiple filters"); 
     //Thread.sleep(2000);
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.selectImprovementProjectsFilter);
     ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Improvement Projects Filter"); 
    // Thread.sleep(2000);
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox1);
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox2);
     ShikshaLokamClient.get().report().log(Status.INFO, "Selected multiple filters");
     //Thread.sleep(2000);
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.selectDistrictFilter);
     ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select District Filter"); 
     //Thread.sleep(2000);
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox1);
    // ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox2);
     ShikshaLokamClient.get().report().log(Status.INFO, "Selected multiple filters");
     //Thread.sleep(2000);
     
     
	    }
	    
	    public void ExportAs() throws Exception {
			ShikshaLokamClient.get().gestures().click(adminDashboardObjects.exportAs);
     ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Export As Dropdown"); 
     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.pdf),"Pdf option is not displayed.");
		Logger.logAndReportPass("Pdf option is displayed.");
		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.img),"Img option is not displayed.");
		Logger.logAndReportPass("Img option is displayed.");
		
		ShikshaLokamClient.get().gestures().click(adminDashboardObjects.pdf);
	     ShikshaLokamClient.get().report().log(Status.INFO, "able to download pdf"); 
     
	     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.exportAs);
	     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.img);
	     ShikshaLokamClient.get().report().log(Status.INFO, "able to download img"); 
	     
	    }
	    
	    
	    public void clickOnBackButton() throws Exception {
			ShikshaLokamClient.get().gestures().click(adminDashboardObjects.backButton);
     ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Back Button"); 
	    }   
	    
	    public void xyz() throws Exception {
	    ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.globalSearchFilter,"Unique User Observation Report");
	    	
	        Logger.logAndReportInfo("Searched for Unique User Observation Report ");
	        //Thread.sleep(2000);
	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.observationReport);
	        Logger.logAndReportInfo("Clicked on Unique User Observation Report"); 
	    
	    }
	    
	    public void clickOnResetFiltersButton() throws Exception {
	 			ShikshaLokamClient.get().gestures().click(adminDashboardObjects.resetFilters);
	      ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Reset Filters Button"); 
	 	    }
	    
	    public void verifySelectedFiltersAreRemoved() throws Exception {
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementnotPresent(adminDashboardObjects.selectedProgramNameSection),"Program name:- Section is Present.");
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementnotPresent(adminDashboardObjects.selectedProjectNameSection),"Project name:- Section is Present.");
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementnotPresent(adminDashboardObjects.selectedDistrictNameSection),"District name:- Section is Present.");
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementnotPresent(adminDashboardObjects.selectedBlockNameSection),"Block name:- Section is Present.");
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementnotPresent(adminDashboardObjects.selectedOrganisationSection),"Organisation:- Section is Present.");
	        Logger.logAndReportPass("Selected Filters are Removed.");
		
		}
	    
	    public void verifySelectedFiltersAreDispalyed() throws Exception {
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.selectedProgramNameSection),"Program name:- Section is not Displyed.");
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.selectedProjectNameSection),"Project name:- Section is not Displyed.");
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.selectedDistrictNameSection),"District name:- Section is not Displyed.");
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.selectedBlockNameSection),"Block name:- Section is not Displyed.");
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.selectedOrganisationSection),"Organisation:- Section is not Displyed.");
	        Logger.logAndReportPass("Selected Filters are Displayed.");
		
		}
	    
	    public void clickOnPage2() throws Exception {
	    	ShikshaLokamClient.get().gestures().scrollToElement(adminDashboardObjects.showing1To);
	 	    ShikshaLokamClient.get().gestures().click(adminDashboardObjects.pagination2);
	        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Page 2 Button"); 
	      Thread.sleep(2000);
	 	    }
	    
	    public void verifyNavigatedToPage2() throws Exception {
	    	Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.showing11To),"Did Not Navigate to Page 2.");
			Logger.logAndReportPass("Navigated To Page 2.");
			
	 	    }
	    public void verifyErrorMessageToSelectDistrictFirst() throws Exception {
	            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.errorMessageToSelectDistrict),"*Please select a district first from the district filter -error message doesn't shows up, hence Block Filter is Enabled ");
	    		Logger.logAndReportPass("*Please select a district first from the district filter - error message shows up, hence Block Filter is Disabled ");
	    	}
	    
	    public void clickOnBlockFilter() throws Exception {
	           ShikshaLokamClient.get().gestures().click(adminDashboardObjects.selectBlockFilter);
	           ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Block Filter");
	    }
	    
	    public void clickOnProgramFilter() throws Exception {
	           ShikshaLokamClient.get().gestures().click(adminDashboardObjects.selectProgramFilter);
	           ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Program Filter");
	    }
	    
	    public void enterSearchTextIntoSelectProgramFilterAndSelect() throws Exception {
	    	ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.selectProgramFilter,"program – teacher");
	        Logger.logAndReportInfo("Searched for program – teacher");
	        Thread.sleep(2000);
	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.programTeacherProgram);
	       ShikshaLokamClient.get().report().log(Status.INFO, "Selected program – teacher from Dropdown list");
	        
	    }
	    
	    public void clickOnImprovementProjectFilter() throws Exception {
	           ShikshaLokamClient.get().gestures().click(adminDashboardObjects.selectImprovementProjectsFilter);
	           ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Improvement Project Filter");
	    }

	    public void enterSearchTextIntoSelectImprovementProjectFilterAndSelect() throws Exception {
	    	ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.selectImprovementProjectsFilter,"improvement project - teacher");
	        Logger.logAndReportInfo("Searched for improvement project - teacher ");
	        Thread.sleep(2000);
	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.ImprovementProjectTeacher);
	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected improvement project - teacher from Dropdown list");
	        
	    }
	    public void clickOnDistrictFilter() throws Exception {
	           ShikshaLokamClient.get().gestures().click(adminDashboardObjects.selectDistrictFilter);
	           ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select District Filter");
	    }
	    
	    public void selectDistrict() throws Exception {
	     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox1);
	     ShikshaLokamClient.get().report().log(Status.INFO, "Able to select District From DropDown");
	    }
	    
	    public void selectMultipleDistrict() throws Exception {
		     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox1);
		     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox2);
		     ShikshaLokamClient.get().report().log(Status.INFO, "District filter is Multiselectable");
		    }
	    
	    public void selectBlock() throws Exception {
		     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox1);
		     ShikshaLokamClient.get().report().log(Status.INFO, "Able to select Block from Dropdown, once District is Selected");
		    }
	    
	    public void selectMultipleBlock() throws Exception {
		     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox1);
		     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox2);
		     ShikshaLokamClient.get().report().log(Status.INFO, "Block filter is Multiselectable");
		    }
	    
	    public void enterSearchTextIntoSelectDistrictFilterAndSelect() throws Exception {
	    	ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.selectDistrictFilter,"ananthapuram");
	        Logger.logAndReportInfo("Searched for ananthapuram ");
	        Thread.sleep(2000);
	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.ananthapuramDistrict);
	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected ananthapuram District from Dropdown list");
	        
	    }
	    
	    public void enterSearchTextIntoSelectBlockFilterAndSelect() throws Exception {
	    	ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.selectBlockFilter,"amadagur");
	        Logger.logAndReportInfo("Searched for amadagur ");
	        Thread.sleep(2000);
	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.amadagurBlock);
	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected amadagur Block from Dropdown list");
	        
	    }
	    //staging custodian organization 
	    
	    
	    public void clickOnOrganisationFilter() throws Exception {
	           ShikshaLokamClient.get().gestures().click(adminDashboardObjects.selectOrganisationFilter);
	           ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Organisation Filter");
	    }
	    
	    public void enterSearchTextIntoSelectOrganisationFilterAndSelect() throws Exception {
	    	ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.selectOrganisationFilter,"staging custodian organization");
	        Logger.logAndReportInfo("Searched for staging custodian organization ");
	        Thread.sleep(2000);
	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.stagingCustodianOrganization);
	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected staging custodian organization from Dropdown list");
	        
	    }
	    
	    public void verifyMultipleGlobalFilters() throws Exception {
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.selectProgramFilter),"Program Filter is not present.");
			Logger.logAndReportInfo("Program Filter is present.");
			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.selectImprovementProjectsFilter),"Improvement Projects Filter is not present.");
			Logger.logAndReportInfo("Improvement Projects Filter is present.");
			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.selectDistrictFilter),"District Filter is not present.");
			Logger.logAndReportInfo("District Filteris present.");
			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.selectBlockFilter),"Block Filter is not present.");
			Logger.logAndReportInfo("Block Filter is present.");
			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.selectOrganisationFilter),"Organisation Filter is not present.");
			Logger.logAndReportInfo("Organisation Filter is present.");
			Logger.logAndReportPass("Multiple Global Filters are present.");
		}
	   
	    public void verifyObservationWithRubricTableColumnsOfDistrictWiseObservationStatusAndEntitiesObservedTab() throws Exception {
	    	Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.programNameColumn),"Program Name - column is not Present.");
	   	    Logger.logAndReportPass("Program Name - column is Present.");
	   	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.observationNameColumn),"Observation Name - column is not Present.");
	   	    Logger.logAndReportPass("Observation Name - column is Present.");
	   	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.organizationNameColumn),"Organisation Name - column is not Present.");
		    Logger.logAndReportPass("Organisation Name  - column is Present.");
		    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.districtColumn),"District - column is not Present.");
	   	    Logger.logAndReportPass("District - column is Present.");
	   	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.noOfUsersStartedColumn),"No. of users (started) - column is not Present.");
		    Logger.logAndReportPass("No. of users (started) - column is Present.");
		    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.noOfUsersSubmittedColumn),"No. of users (submitted) - column is not Present.");
		    Logger.logAndReportPass("No. of users (submitted) - column is Present.");
		    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.totalSubmissionsColumn),"Total Submissions - column is not Present.");
		    Logger.logAndReportPass("Total Submissions - column is Present.");
		    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.entitiesObservedColumn),"Entities Observed - column is not Present.");
		    Logger.logAndReportPass("Entities Observed - column is Present.");

	    }
	    
	    public void verifyimprovementProjectsStatusByDistrictTabTablesColumns() throws Exception {
	    	verifyProgramNameColumn();
	    	verifyImprovementProjectNameColumn();
	    	verifyOrganisationNameColumn();
	    	verifyDistrictNameColumn();
	    	verifyStartedColumn();
	    	verifyInProgressColumn();
	    	verifyInProgressProjectWithEvidenceColumn();
	    	verifySubmittedColumn();
	    	verifySubmittedProjectWithEvidenceColumn();
	    	verifyCertificatesIssuedColumn();

	    }
	    
	    public void verifyimprovementProjectsStatusByBlockTabTablesColumns() throws Exception {
	    	verifyProgramNameColumn();
	    	verifyImprovementProjectNameColumn();
	    	verifyOrganisationNameColumn();
	    	verifyDistrictNameColumn();
	    	verifyBlockNameColumn();
	    	verifyStartedColumn();
	    	verifyInProgressColumn();
	    	verifyInProgressProjectWithEvidenceColumn();
	    	verifySubmittedColumn();
	    	verifySubmittedProjectWithEvidenceColumn();
	    	

	    }
	    
	    
	    
	    public void verifyProgramNameColumn() throws Exception {
	    	Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.programNameColumn),"Program Name - column is not Present.");
	   	    Logger.logAndReportPass("Program Name - column is Present.");
	    
	    }
	    public void verifyImprovementProjectNameColumn() throws Exception {
	    	Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.improvementProjectNameColumn),"Improvement Project Name - column is not Present.");
	   	    Logger.logAndReportPass("Improvement Project Name - column is Present.");
	    }
	    
	    public void verifyOrganisationNameColumn() throws Exception {
	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.organizationNameColumn),"Organisation Name - column is not Present.");
	    Logger.logAndReportPass("Organisation Name  - column is Present.");
	    }
	    
	    public void verifyDistrictNameColumn() throws Exception {
	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.districtNameColumn),"District Name - column is not Present.");
   	    Logger.logAndReportPass("District Name - column is Present.");
	    }
	    
	    public void verifyBlockNameColumn() throws Exception {
		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.blockNameColumn),"Block Name - column is not Present.");
	   	Logger.logAndReportPass("Block Name - column is Present.");
	    }
		 
	    public void verifyStartedColumn() throws Exception {
	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.startedColumn),"Started - column is not Present.");
	    Logger.logAndReportPass("Started - column is Present.");
	    }
	    
	    public void verifyInProgressColumn() throws Exception {
	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.inprogressColumn),"In-Progress - column is not Present.");
	    Logger.logAndReportPass("In-Progress - column is Present.");
	    }
	    
	    public void verifyInProgressProjectWithEvidenceColumn() throws Exception {
	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.inprogressProjectWithEvidenceColumn),"Inprogress Project With Evidence - column is not Present.");
	    Logger.logAndReportPass("Inprogress Project With Evidence - column is Present.");
	    }
	    
	    public void verifySubmittedColumn() throws Exception {
	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.submittedColumn),"Submitted - column is not Present.");
	    Logger.logAndReportPass("Submitted - column is Present.");
	    }
	    
	    public void verifySubmittedProjectWithEvidenceColumn() throws Exception {
	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.submittedProjectWithEvidenceColumn),"Submitted Project With Evidence - column is not Present.");
	    Logger.logAndReportPass("Submitted Project With Evidence - column is Present.");
	    }
	    
	    public void verifyCertificatesIssuedColumn() throws Exception {
	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.certificatesIssuedColumn),"Certificates Issued - column is not Present.");
	    Logger.logAndReportPass("Certificates Issued - column is Present.");
	    }

	    
	    public void verifyObservationReportTableColumnsOfBlockWiseObservationStatusAndEntitiesObservedTab() throws Exception {
	    	Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.programNameColumn),"Program Name - column is not Present.");
	   	    Logger.logAndReportPass("Program Name - column is Present.");
	   	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.observationNameColumn),"Observation Name - column is not Present.");
	   	    Logger.logAndReportPass("Observation Name - column is Present.");
	   	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.organizationNameColumn),"Organisation Name - column is not Present.");
		    Logger.logAndReportPass("Organisation Name  - column is Present.");
		    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.districtColumn),"District - column is not Present.");
	   	    Logger.logAndReportPass("District - column is Present.");
	   	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.blockColumn),"Block - column is not Present.");
	   	    Logger.logAndReportPass("Block - column is Present.");
	   	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.noOfUsersStartedColumn),"No. of users (started) - column is not Present.");
		    Logger.logAndReportPass("No. of users (started) - column is Present.");
		    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.noOfUsersSubmittedColumn),"No. of users (submitted) - column is not Present.");
		    Logger.logAndReportPass("No. of users (submitted) - column is Present.");
		    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.totalSubmissionsColumn),"Total Submissions - column is not Present.");
		    Logger.logAndReportPass("Total Submissions - column is Present.");
		    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.entitiesObservedColumn),"Entities Observed - column is not Present.");
		    Logger.logAndReportPass("Entities Observed - column is Present.");

	    }
	    
	    public void verifyBlockWiseObservationStatusAndEntitiesObservedTabFilters() throws Exception {
	    	verifyProgramFilter();
	    	verifyObservationFilter();
	    	verifyDistrictFilter();
	    	verifyBlockFilter();
	    	verifyOrganisationFilter();
			
		}
	    
	    
	    public void verifyimprovementProjectsStatusByBlockTabFilters() throws Exception {
	    	verifyProgramFilter();
	    	verifyImprovementProjectsFilter();
	    	verifyDistrictFilter();
	    	verifyBlockFilter();
	    	verifyOrganisationFilter();
			
		}
	    
	    public void verifyProgramFilter() throws Exception {
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.selectProgramFilter),"Program Filter is not present.");
			Logger.logAndReportInfo("Program Filter is present.");
	    
	    }
	    
	    public void verifyImprovementProjectsFilter() throws Exception {
	    	Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.selectImprovementProjectsFilter),"Improvement Projects Filter is not present.");
			Logger.logAndReportInfo("Improvement Projects Filter is present.");
	    
	    }
	    
	    public void verifyDistrictFilter() throws Exception {
	    	Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.selectDistrictFilter),"District Filter is not present.");
			Logger.logAndReportInfo("District Filteris present.");
	    
	    }
	    
	    public void verifyBlockFilter() throws Exception {
	    	Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.selectBlockFilter),"Block Filter is not present.");
			Logger.logAndReportInfo("Block Filter is present.");
	    
	    }
	    
	    public void verifyOrganisationFilter() throws Exception {
	         Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.selectOrganisationFilter),"Organisation Filter is not present.");
		     Logger.logAndReportInfo("Organisation Filter is present.");
        }
	    
	    public void verifyObservationFilter() throws Exception {
	         Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.selectObservationFilter),"Observation Filter is not present.");
		     Logger.logAndReportInfo("Observation Filter is present.");
        }
	    
	    public void clickOnFilters() throws Exception {
	    	ShikshaLokamClient.get().gestures().scrollToElement(adminDashboardObjects.filtersButton);
	    	ShikshaLokamClient.get().report().log(Status.INFO, "Scrolled to Filters Button");
		     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filtersButton);
		     ShikshaLokamClient.get().report().log(Status.INFO, "Clicked On Filters Button");
		    }
	    
	    public void enterSearchTextIntoSelectProgramFilterAndSelectChartFilters() throws Exception {
	    	ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.chartFilterselectProgram,"program – teacher");
	        Logger.logAndReportInfo("Searched for program – teacher");
	        Thread.sleep(2000);
	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.programTeacherProgram);
	       ShikshaLokamClient.get().report().log(Status.INFO, "Selected program – teacher from Dropdown list");
	        
	    }
	    
	    public void enterSearchTextIntoSelectImprovementProjectFilterAndSelectChartFilters() throws Exception {
	    	ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.chartFilterSelectProject,"improvement project - teacher");
	        Logger.logAndReportInfo("Searched for improvement project - teacher ");
	        Thread.sleep(2000);
	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.ImprovementProjectTeacher);
	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected improvement project - teacher from Dropdown list");
	        
	    }
	    
	    public void enterSearchTextIntoSelectDistrictFilterAndSelectChartFilters() throws Exception {
	    	ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.chartFilterSelectDistrict,"ananthapuram");
	        Logger.logAndReportInfo("Searched for ananthapuram ");
	        Thread.sleep(2000);
	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.ananthapuramDistrict);
	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected ananthapuram District from Dropdown list");
	        
	    }
	    
	    public void enterSearchTextIntoSelectBlockFilterAndSelectChartFilters() throws Exception {
	    	ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.chartFilterSelectBlock,"amadagur");
	        Logger.logAndReportInfo("Searched for amadagur ");
	        Thread.sleep(2000);
	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.amadagurBlock);
	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected amadagur Block from Dropdown list");
	        
	    }
	    
	    
	   
	    public void enterSearchTextIntoSelectOrganisationFilterAndSelectChartFilters() throws Exception {
	    	ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.chartFilterselectOrganisation,"staging custodian organization");
	        Logger.logAndReportInfo("Searched for staging custodian organization ");
	        Thread.sleep(2000);
	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.stagingCustodianOrganization);
	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected staging custodian organization from Dropdown list");
	        
	    }
	    
	    public void verifyShowEntriesDropdown() throws Exception {
	    	Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.showEntries),"Show Entries is not present.");
			Logger.logAndReportInfo("Show Entries is present.");
	    
	    }
	    
	    public void ClickOnShowEntriesDropdown() throws Exception {
	    	ShikshaLokamClient.get().gestures().click(adminDashboardObjects.showEntries);
			Logger.logAndReportInfo("Clicked On Show Entries Dropdown .");
	    
	    }
	    
	    public void verifyShowEntriesValues() throws Exception {
	    	Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.entries10),"Value 10 is not present.");
			Logger.logAndReportInfo("Value 10 is present.");
			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.entries25),"Value 25 is not present.");
			Logger.logAndReportInfo("Value 25 is present.");
			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.entries50),"Value 50 is not present.");
			Logger.logAndReportInfo("Value 50 is present.");
			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.entries100),"Value 100 is not present.");
			Logger.logAndReportInfo("Value 100 is present.");
	    
	    }
}
