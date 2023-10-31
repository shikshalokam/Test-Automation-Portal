package com.shikshalokam.pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;


import com.aventstack.extentreports.Status;
import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.objects.LoginPageObjects;
import com.shikshalokam.pages.objects.ProgramDashboardObjects;
import com.shikshalokam.utils.logger.Logger;
import com.shikshalokam.utils.prop.PropUtlis;

public class ProgramDashboardAction {
	
	ProgramDashboardObjects programDashboardObjects;
	LoginPageObjects loginPageObjects;
	
	public ProgramDashboardAction() throws Exception {
		 programDashboardObjects = PageFactory.initElements(ShikshaLokamClient.get().driver(), ProgramDashboardObjects.class);
		 loginPageObjects = PageFactory.initElements(ShikshaLokamClient.get().driver(), LoginPageObjects.class);
	    }
	 
	    

	    JavascriptExecutor js = (JavascriptExecutor) ShikshaLokamClient.get().driver();
	    
	    String appUrl;
	    public String getEnvironmentValue() throws Exception {
	    	return appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
	    }
	    
	    // switch to webview for inspect elements
	    public void switchToWebView() throws Exception {
	        Thread.sleep(5000);

	    }

	
	 public void clickOnProfileIcon() throws Exception {
				ShikshaLokamClient.get().gestures().click(programDashboardObjects.guestIcon);
	        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on User Icon");
	    }
	 
	 public void clickOnprogramdashboard() throws Exception {
			ShikshaLokamClient.get().gestures().click(programDashboardObjects.programdashboard);
     ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Program Dashboard");
	 }
	
	 public void clickOnGraphsTab() throws Exception {
		 ShikshaLokamClient.get().gestures().waitForElementToAppear(programDashboardObjects.Graphs);
			ShikshaLokamClient.get().gestures().click(programDashboardObjects.Graphs);
  ShikshaLokamClient.get().report().log(Status.INFO, "Clicked Graphs Tab");
	 }
	 
	 public void clickOnProgramDatasetsTab() throws Exception {
		 ShikshaLokamClient.get().gestures().waitForElementToAppear(programDashboardObjects.Programdatasets);
			ShikshaLokamClient.get().gestures().click(programDashboardObjects.Programdatasets);
ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Program Datasets Tab");
	 }
	 
	 public void clickOnDistrictWiseStatusTab() throws Exception {
		 ShikshaLokamClient.get().gestures().waitForElementToAppear(programDashboardObjects.DistrictWiseStatus);
	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.DistrictWiseStatus);
		Logger.logAndReportInfo("Clicked On District Wise Status Tab");
	 }
	 
	 public void clickOnBlockWiseStatusTab() throws Exception {
		 ShikshaLokamClient.get().gestures().waitForElementToAppear(programDashboardObjects.BlockWiseStatus);
	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.BlockWiseStatus);
		Logger.logAndReportInfo("Clicked On Block Wise Status Tab");
	 }
	 

		public void verifyselectProgramPopup() throws Exception {
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.selectProgramPopup),"Select Program Pop-up is not displayed.");
			Logger.logAndReportPass("Select Program Pop-up is displayed. succesfully");
		}
		
		public void verifyContentsOfSelectProgramPopup() throws Exception {
			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.programFilterOnSelectProgramPopup),"Program Filter is not displayed.");
			Logger.logAndReportPass("Program Filter is displayed succesfully");
			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.infoIcon),"Info icon is not displayed.");
			Logger.logAndReportPass("Info icon is displayed succesfully");
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.selectProgramPopup),"Select Program Pop-up is not displayed.");
			Logger.logAndReportPass("Header - Note: Please select a program. is displayed");
			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.crossIcon),"Cross icon 'x' icon is not displayed.");
			Logger.logAndReportPass("Cross icon 'x' icon is displayed succesfully");
		}
		
		public void clickOnCrossIcon() throws Exception {
			 ShikshaLokamClient.get().gestures().click(programDashboardObjects.crossIcon);
	        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Cross icon 'X'");
	    }
		
		public void verifyUserOnHomePage() throws Exception {
			 ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(loginPageObjects.homeButton);
			Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(loginPageObjects.homeButton),"User is not Redirected to Home page");
			Logger.logAndReportPass("User is Redirected to Home page");	
	    }
		
		
		
		 public void clickOnSelectProgramDropdown() throws Exception {
			 ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(programDashboardObjects.selectprogramdropdownonpopup);
			 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectprogramdropdownonpopup);
	        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Program Dropdown");
	    }
		 
		 // if else condition
		 public void selectOldProgram() throws Exception {
			 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectprogramdropdownonpopup);
			Thread.sleep(2000);
		        if(getEnvironmentValue().contains("diksha")) {
		            ShikshaLokamClient.get().report().log(Status.INFO, "NO Program");	
		        } else if(getEnvironmentValue().contains("preprod")) {
		        	 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.programTestingProgram4point4);
		    		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.programTestingProgram4point4);
		    	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected Testing Program 4.4 Program");
		        } else {
		        	 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.programTesting4point4);
		    		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.programTesting4point4);
		    	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected Testing 4.4 Program");
		    	     
		        }
		        Thread.sleep(2000);
		        }
		 
		 public void selectProgramAgain() throws Exception {
			 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectprogramFromFilter);
			Thread.sleep(2000);
		        if(getEnvironmentValue().contains("diksha")) {
		            ShikshaLokamClient.get().report().log(Status.INFO, "NO Program");	
		        } else if(getEnvironmentValue().contains("preprod")) {
		        	 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.programTestingProgram4point4);
		    		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.programTestingProgram4point4);
		    	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected Testing Program 4.4 Program");
		        } else {
		        	 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.programTesting4point4);
		    		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.programTesting4point4);
		    		 Logger.logAndReportPass("selected Program Again from filter on Program Datasets Tab");
		    	          
		        }
		        Thread.sleep(2000);
		    }
		 
		 public void selectNewProgramProgramHTandOfficials() throws Exception {
			 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectprogramdropdownonpopup);
			Thread.sleep(2000);
		        if(getEnvironmentValue().contains("diksha")) {
		            ShikshaLokamClient.get().report().log(Status.INFO, "NO Program");	
		        } else if(getEnvironmentValue().contains("preprod")) {
		        	 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.programTestingProgram4point4);
		    		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.programTestingProgram4point4);
		    	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected Testing Program 4.4 Program");
		        } else {
		        	 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.programHtandOfficials);
		    		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.programHtandOfficials);
		    	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected Program - HT and officials");
		        }
		        Thread.sleep(2000); 
		    }
		 
		
		
		 public void selectProjectResource() throws Exception {
			 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectresourse);
			Thread.sleep(2000);
		        if(getEnvironmentValue().contains("diksha")) {
		            ShikshaLokamClient.get().report().log(Status.INFO, "NO Resource");	
		        } else if(getEnvironmentValue().contains("preprod")) {
		        	 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.projectlinkconsumptionfd137);
		    		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.projectlinkconsumptionfd137);
		    	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected Project Link Consumption -FD 137");
		        } else {
		        	js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.projectlinkconsumptionfd98);
					 ShikshaLokamClient.get().gestures().click(programDashboardObjects.projectlinkconsumptionfd98);
				         ShikshaLokamClient.get().report().log(Status.INFO, "Selected Project link consumption -FD 98");   
		        }
		        Thread.sleep(2000);
		    }
		 
	
		 
		 public void clickOnSelectResourceDropdown() throws Exception {
			 //ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(programDashboardObjects.selectresoursedropdown);
			 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectresourse);
			 Thread.sleep(2000);
	        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Resource Dropdown");
         }
		 
		 public void scrollandclickOnTesting4point4staging() throws Exception {
		 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.programTesting4point4);
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.programTesting4point4);
	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected Testing 4.4 Program");
		
		 }
		 
		 public void scrollandclickOnprojectlinkconsumptionfd98staging() throws Exception {
			 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.projectlinkconsumptionfd98);
			 ShikshaLokamClient.get().gestures().click(programDashboardObjects.projectlinkconsumptionfd98);
		         ShikshaLokamClient.get().report().log(Status.INFO, "Selected Project link consumption -FD 98");
             }
		 
		 public void verifyandclickOnEnabledConfirmbuttonOnSelectProgramPopup() throws Exception {
			 ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(programDashboardObjects.confirmbuttonOnSelectprogramPopup);
			   Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.confirmbuttonOnSelectprogramPopup),"Confirm Button got Enabled on Program Resource Pop-up.");
			   Logger.logAndReportInfo("Confirm Button got Enabled on Program Resource Pop-up.");
		    	ShikshaLokamClient.get().gestures().click(programDashboardObjects.confirmbuttonOnSelectprogramPopup);
		    	Logger.logAndReportInfo("Clicked on Confirm Button ");
		    	 Thread.sleep(2000);
              }
		 
	
		 //to verify tabs on Progamdashboard page
		 public void verifyTabsOnProgramdashboardPage() throws Exception {
			 Thread.sleep(2000);
			 VerifyProgradDataset();
			 VerifyGraphs();
			 VerifyDistrictWiseStatus();
			 VerifyBlockWiseStatus();
			//VerifyTables();
		 
		 }

	    	public void VerifyProgradDataset() throws Exception {
	            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.Programdatasets),"Program Datasets tab is not Present.");
	    		Logger.logAndReportInfo("Program Datasets tab is Present .");
	    	}

   	    	public void VerifyGraphs() throws Exception {
   	            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.Graphs),"Graphs tab is not Present.");
   	    		Logger.logAndReportInfo("Graphs tab is Present .");
   	    	}

   	    	public void VerifyDistrictWiseStatus() throws Exception {
   	            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.DistrictWiseStatus),"District wise Status tab is not Present.");
   	    		Logger.logAndReportInfo("District wise Status tab is Present .");
   	    	}
   	    	
   	    	public void VerifyBlockWiseStatus() throws Exception {
   	            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.BlockWiseStatus),"Block wise Status tab is not Present.");
   	    		Logger.logAndReportInfo("Block wise Status tab is Present .");
   	    	}
   	    	
   	    	public void VerifyProgramDatasetFilters() throws Exception {
   	    		Logger.logAndReportInfo("On Program Dataset Tab");
   	            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.ProgramFilter),"Program Filter is not Present.");
   	    		Logger.logAndReportInfo("Program Filter is Present .");
   	    	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.ResourceFilter),"Resource Filter is not Present.");
	    		Logger.logAndReportInfo("Resource Filter is Present .");
	    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.DistrictFilter),"District Filter is not Present.");
	   	    	Logger.logAndReportInfo("District Filter is Present .");
	   	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.BlockFilter),"Block Filter is not Present.");
	   	    	Logger.logAndReportInfo("Block Filter is Present .");
	   	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.OrganisationFilter),"Organisation Filter is not Present.");
	   	    	Logger.logAndReportInfo("Organisation Filter is Present .");
	   	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.StartDateFilter),"StartDate Filter is not Present.");
	   	    	Logger.logAndReportInfo("StartDate Filter is Present .");
	   	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.EndDateFilter),"EndDate Filter is not Present.");
	   	    	Logger.logAndReportInfo("EndDate Filter is Present .");
   	    	}
   	    	
   	    	public void VerifyGraphsFilters() throws Exception {
   	    	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.Graphs);
   	    		Logger.logAndReportInfo("Clicked On Graphs Tab");
   	            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.ProgramFilter),"Program Filter is not Present.");
   	    		Logger.logAndReportInfo("Program Filter is Present .");
   	    	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.ResourceFilter),"Resource Filter is not Present.");
	    		Logger.logAndReportInfo("Resource Filter is Present .");
	    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.DistrictFilter),"District Filter is not Present.");
	   	    	Logger.logAndReportInfo("District Filter is Present .");
	   	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.BlockFilter),"Block Filter is not Present.");
	   	    	Logger.logAndReportInfo("Block Filter is Present .");
	   	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.OrganisationFilter),"Organisation Filter is not Present.");
	   	    	Logger.logAndReportInfo("Organisation Filter is Present .");
	   	   
   	    	}
   	    	
   	    	public void VerifyDistrictWiseStatusFilters() throws Exception {
      	    	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.DistrictWiseStatus);
      	    		Logger.logAndReportInfo("Clicked On District Wise Status Tab");
      	            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.ProgramFilter),"Program Filter is not Present.");
      	    		Logger.logAndReportInfo("Program Filter is Present .");
      	    	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.ResourceFilter),"Resource Filter is not Present.");
   	    		Logger.logAndReportInfo("Resource Filter is Present .");
   	    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.DistrictFilter),"District Filter is not Present.");
   	   	    	Logger.logAndReportInfo("District Filter is Present .");
   	   	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.OrganisationFilter),"Organisation Filter is not Present.");
   	   	    	Logger.logAndReportInfo("Organisation Filter is Present .");
   	   	   
      	    	}
   	    	
   	    	public void VerifyBlockWiseStatusFilters() throws Exception {
      	    	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.BlockWiseStatus);
      	    		Logger.logAndReportInfo("Clicked On Block Wise Status Tab");
      	            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.ProgramFilter),"Program Filter is not Present.");
      	    		Logger.logAndReportInfo("Program Filter is Present .");
      	    	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.ResourceFilter),"Resource Filter is not Present.");
   	    		Logger.logAndReportInfo("Resource Filter is Present .");
   	    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.DistrictFilter),"District Filter is not Present.");
   	   	    	Logger.logAndReportInfo("District Filter is Present .");
   	   	  Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.BlockFilter),"Block Filter is not Present.");
 	    	Logger.logAndReportInfo("Block Filter is Present .");
   	   	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.OrganisationFilter),"Organisation Filter is not Present.");
   	   	    	Logger.logAndReportInfo("Organisation Filter is Present .");
   	   	   
      	    	}
   	    	
   	    	
   	    	public void VerifySelectResourceMessage() throws Exception {
   	            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.SelectResourceMessage),"*Please select the resource name to get data - message doesn't shows up.");
   	    		Logger.logAndReportInfo("*Please select the resource name to get data - message shows up.");
   	    	}
   	    	
   	    	public void verifyErrorMessageToSelectDistrictFirst() throws Exception {
   	            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.errorMessageToSelectDistrict),"*Please select a district first from the district filter -error message doesn't shows up.");
   	    		Logger.logAndReportInfo("*Please select a district first from the district filter - error message shows up.");
   	    	}
   	    	
   	    	//selecting district and organisation in staging
   	    	public void selectDistrictandOrgPD() throws Exception {
   	    		selectDistrictPD();
   	    		selectOrgPD();
   		 }
   	    	public void selectDistrictPD() throws Exception {
   	         ShikshaLokamClient.get().gestures().click(programDashboardObjects.districtDropdown);
   	      ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on District Dropdown");
		      Thread.sleep(2000);
   	      if(getEnvironmentValue().contains("diksha")) {
	            ShikshaLokamClient.get().report().log(Status.INFO, "NO Resource");	
	        } else if(getEnvironmentValue().contains("preprod")) {
	              ShikshaLokamClient.get().gestures().click(programDashboardObjects.Agradistrict);
	              ShikshaLokamClient.get().report().log(Status.INFO, "Selected Agra District");
	        
	        } else {
	              ShikshaLokamClient.get().gestures().click(programDashboardObjects.Chittordistrict);
	              ShikshaLokamClient.get().report().log(Status.INFO, "Selected Chittor District");
	        }
	    }//Chittordistrict
   	    	
   	    	
   	    	public void selectOrgPD() throws Exception {
     	          ShikshaLokamClient.get().gestures().click(programDashboardObjects.organisationsDropdown);
  		      Thread.sleep(2000);
  		    if(getEnvironmentValue().contains("diksha")) {
  		      ShikshaLokamClient.get().report().log(Status.INFO, "No org");
     	     }else if(getEnvironmentValue().contains("preprod")) {
     	    	ShikshaLokamClient.get().gestures().click(programDashboardObjects.preprodcustodianorg);
                ShikshaLokamClient.get().report().log(Status.INFO, "Selected Pre-Prod Custodian Organization");
     	     } else {
                	ShikshaLokamClient.get().gestures().click(programDashboardObjects.stagingcustodianorg);
                    ShikshaLokamClient.get().report().log(Status.INFO, "Selected Staging Custodian Organization");
                }
  		    }
   	    	
   	    	public void clickOnBlockPD() throws Exception {
      	         ShikshaLokamClient.get().gestures().click(programDashboardObjects.blockDropdown);
      	      ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Block Dropdown");
   		      Thread.sleep(2000);
   	    }
   	    	

   	    	public void selectdate() throws Exception {
   	    	
     	          ShikshaLokamClient.get().gestures().click(programDashboardObjects.startdate);
     	         ShikshaLokamClient.get().report().log(Status.INFO, "Clicked On Start Date picker");
     	        ShikshaLokamClient.get().gestures().click(programDashboardObjects.Previousmonth);
     	       ShikshaLokamClient.get().gestures().click(programDashboardObjects.date15);
     	      ShikshaLokamClient.get().gestures().click(programDashboardObjects.enddate);
  	         ShikshaLokamClient.get().report().log(Status.INFO, "Clicked On End Date picker");
  	        ShikshaLokamClient.get().gestures().click(programDashboardObjects.Previousmonth);
  	       ShikshaLokamClient.get().gestures().click(programDashboardObjects.date16); 

   	    	}
   	    	
   	     public void verifyProjectReports() throws Exception {
   	    	 Thread.sleep(2000);
			 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
			 Logger.logAndReportInfo("Clicked on Select Report Dropdown");
			 Thread.sleep(2000);
			 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.taskReport),"Task Report type is not Present.");
	    	 Logger.logAndReportInfo("Task Report type  is Present .");
	         Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.statusReport),"Status Report type is not Present.");
		     Logger.logAndReportInfo("Status Report type is Present .");
		     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.filteredtaskReport),"Filtered Task Report type is not Present.");
			 Logger.logAndReportInfo("Filtered Task Report type  is Present .");
			
	    }
   	     
   	  public void requestTaskreport() throws Exception {
   		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.taskReport);
   		 Logger.logAndReportPass("Selected Task Report .");
		
   		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
		 Logger.logAndReportPass("Request Report button is Enabled.");
		
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportPasswordPopup),"Pop-up header is incorrect");
		 Logger.logAndReportPass("Pop-up header displayed as - Are you sure you want to request this report?");
		
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.enterPassword),"Password Placeholder is incorrect");
	     Logger.logAndReportPass("Password Placeholder displayed as - Enter a password to request Report");
		 
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.pwdCriteriaMsg),"Password criteria message is incorrect");
	     Logger.logAndReportPass("Password criteria message displayed as - Your password should be 8 characters, alphanumeric, and without special characters or spaces. Remember your password, as you will require the same password to view the generated report."); 
		 
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.nobutton),"No button is not Enabled.");
		 Logger.logAndReportPass("No button is Enabled.");
	     
		 ShikshaLokamClient.get().gestures().sendValueToTextBox(programDashboardObjects.enterPassword,"Test1234");
		 Logger.logAndReportInfo("Entered password as : Test1234");
		
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.yesbutton),"Yes button is not Enabled.");
		 Logger.logAndReportPass("Yes button is Enabled.");
		 //********
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
		 Thread.sleep(2000);
   	  } 
   	  
   	public void requestTaskreportYes() throws Exception {
   	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
  		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.taskReport);
  		 Logger.logAndReportPass("Selected Task Report .");
		
  		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
		 Logger.logAndReportPass("Request Report button is Enabled.");
		
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportPasswordPopup),"Pop-up header is incorrect");
		 Logger.logAndReportPass("Pop-up header displayed as - Are you sure you want to request this report?");
		
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.enterPassword),"Password Placeholder is incorrect");
	     Logger.logAndReportPass("Password Placeholder displayed as - Enter a password to request Report");
		 
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.pwdCriteriaMsg),"Password criteria message is incorrect");
	     Logger.logAndReportPass("Password criteria message displayed as - Your password should be 8 characters, alphanumeric, and without special characters or spaces. Remember your password, as you will require the same password to view the generated report."); 
		 
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.nobutton),"No button is not Enabled.");
		 Logger.logAndReportPass("No button is Enabled.");
	     
		 ShikshaLokamClient.get().gestures().sendValueToTextBox(programDashboardObjects.enterPassword,"Test1234");
		 Logger.logAndReportInfo("Entered password as : Test1234");
		
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.yesbutton),"Yes button is not Enabled.");
		 Logger.logAndReportPass("Yes button is Enabled.");
		 //********
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.yesbutton);
		 Thread.sleep(2000);
		 ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(programDashboardObjects.reportRequestedPopup);
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.reportRequestedPopup),"Your Report Has Been Requested Pop-up is not Displayed");
		 Logger.logAndReportPass("Your report has been requested and will be available to download after 24 hours - Pop-up is Displayed");
		 ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.okButtonOnReportRequestedPopup);
		 Logger.logAndReportInfo("OK button is Enabled ");
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.okButtonOnReportRequestedPopup);
		 Logger.logAndReportInfo("Clicked on OK button on Report Requested Popup");
  	  } 
   	  
  	public void requestStatusreport() throws Exception {	
  		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
  		 
    		ShikshaLokamClient.get().gestures().click(programDashboardObjects.statusReport);
    	 Logger.logAndReportPass("Selected Status Report .");
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
 		 Logger.logAndReportPass("Request Report button is Enabled.");
 		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportYesNoPopup),"Request Report Yes No Pop-up is not Displayed");
		 Logger.logAndReportPass("Request Report Yes No Pop-up is Displayed");
		 //***********
		Thread.sleep(2000);
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
  	}
  	
  	public void requestStatusreportPD() throws Exception {	
   	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.statusReport);
   	 Logger.logAndReportPass("Selected Status Report .");
   	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
   	 Logger.logAndReportPass("Request Report button is Enabled.");
   	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
   	 Logger.logAndReportInfo("Clicked on Request Report.");
   	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportYesNoPopup),"Request Report Yes No Pop-up is not Displayed");
   	 Logger.logAndReportPass("Request Report Yes No Pop-up is Displayed");
   	 //***********
   	 Thread.sleep(2000);
   	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
   	 }
  	
	public void requestStatusreportYesPD() throws Exception {	
	   	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.statusReport);
	   	 Logger.logAndReportPass("Selected Status Report .");
	   	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
	   	 Logger.logAndReportPass("Request Report button is Enabled.");
	   	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
	   	 Logger.logAndReportInfo("Clicked on Request Report.");
	   	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportYesNoPopup),"Request Report Yes No Pop-up is not Displayed");
	   	 Logger.logAndReportPass("Request Report Yes No Pop-up is Displayed");
	   	 //***********
	   	Thread.sleep(2000);
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.yesbutton);
		 Logger.logAndReportInfo("Clicked Yes Button on Request Report Yes No Pop-up.");
		
		 ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(programDashboardObjects.reportRequestedPopup);
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.reportRequestedPopup),"Your Report Has Been Requested Pop-up is not Displayed");
		 Logger.logAndReportPass("Your report has been requested and will be available to download after 24 hours - Pop-up is Displayed");
		 ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.okButtonOnReportRequestedPopup);
		 Logger.logAndReportInfo("OK button is Enabled ");
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.okButtonOnReportRequestedPopup);
		 Logger.logAndReportInfo("Clicked on OK button on Report Requested Popup");
	   	 }
  	
  	
	public void requestStatusreportYes() throws Exception {	
 		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
 		 
   		ShikshaLokamClient.get().gestures().click(programDashboardObjects.statusReport);
   	 Logger.logAndReportPass("Selected Status Report .");
   		Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
		 Logger.logAndReportPass("Request Report button is Enabled.");
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportYesNoPopup),"Request Report Yes No Pop-up is not Displayed");
		 Logger.logAndReportPass("Request Report Yes No Pop-up is Displayed");
		 //***********
		Thread.sleep(2000);
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.yesbutton);
		 Logger.logAndReportInfo("Clicked Yes Button on Request Report Yes No Pop-up.");
		
		 ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(programDashboardObjects.reportRequestedPopup);
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.reportRequestedPopup),"Your Report Has Been Requested Pop-up is not Displayed");
		 Logger.logAndReportPass("Your report has been requested and will be available to download after 24 hours - Pop-up is Displayed");
		 ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.okButtonOnReportRequestedPopup);
		 Logger.logAndReportInfo("OK button is Enabled ");
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.okButtonOnReportRequestedPopup);
		 Logger.logAndReportInfo("Clicked on OK button on Report Requested Popup");
 	}
   	  // verify Project status filters
   	public void verifyProjectStatusFilters() throws Exception {	
		 
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.selectstatusDropdown),"Select Status Dropdown is not Displayed");
		 Logger.logAndReportPass("Select Status Dropdown is Displayed");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectstatusDropdown),"Select Status Dropdown is not Displayed");
		 Logger.logAndReportInfo("Clicked on Select Status Dropdown.");
		 
		
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.startedStatus),"Started Status is not Present.");
    	 Logger.logAndReportInfo("Started Status is Present.");
    	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.submittedStatus),"Submitted Status is not Present.");
	     Logger.logAndReportInfo("Submitted Status is Present.");
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.inprogressStatus),"Inprogress Status is not Present.");
		 Logger.logAndReportInfo("Inprogress Status is Present.");
		 
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.startedStatus);
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.submittedStatus);
		 Logger.logAndReportPass("values are multiselectable");
		 
		 Thread.sleep(2000);
		 ShikshaLokamClient.get().gestures().PressEsc(); 
     	  }
   	
   	public void verifyObsWithRubricsStatusFilters() throws Exception {	
		 
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.selectstatusDropdown),"Select Status Dropdown is not Displayed");
		 Logger.logAndReportPass("Select Status Dropdown is Displayed");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectstatusDropdown),"Select Status Dropdown is not Displayed");
		 Logger.logAndReportInfo("Clicked on Select Status Dropdown.");
		 
		
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.startedStatus),"Started Status is not Present.");
   	     Logger.logAndReportInfo("Started Status is Present.");
   	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.submittedStatus),"Submitted Status is not Present.");
	     Logger.logAndReportInfo("Submitted Status is Present.");
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.inprogressStatus),"Inprogress Status is not Present.");
		 Logger.logAndReportInfo("Inprogress Status is Present.");
		 
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.startedStatus);
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.submittedStatus);
		 Logger.logAndReportPass("values are multiselectable");
		
		 Thread.sleep(2000);
		 ShikshaLokamClient.get().gestures().PressEsc(); 
    	  }
   	
   	public void verifyObsWithoutRubricsStatusFilters() throws Exception {	
		 
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.selectstatusDropdown),"Select Status Dropdown is not Displayed");
		 Logger.logAndReportPass("Select Status Dropdown is Displayed");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectstatusDropdown),"Select Status Dropdown is not Displayed");
		 Logger.logAndReportInfo("Clicked on Select Status Dropdown.");
		 
	
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.startedStatus),"Started Status is not Present.");
  	 Logger.logAndReportInfo("Started Status is Present.");
  	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.submittedStatus),"Submitted Status is not Present.");
	     Logger.logAndReportInfo("Submitted Status is Present.");
				 Thread.sleep(2000);
				 
				 ShikshaLokamClient.get().gestures().click(programDashboardObjects.startedStatus);
				 ShikshaLokamClient.get().gestures().click(programDashboardObjects.submittedStatus);
				 Logger.logAndReportPass("values are multiselectable");
				  
		 ShikshaLokamClient.get().gestures().PressEsc(); 
   	  }

   	public void verifySurveyStatusFilters() throws Exception {	
		 
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.selectstatusDropdown),"Select Status Dropdown is not Displayed");
		 Logger.logAndReportPass("Select Status Dropdown is Displayed");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectstatusDropdown),"Select Status Dropdown is not Displayed");
		 Logger.logAndReportInfo("Clicked on Select Status Dropdown.");
		 
	
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.startedStatus),"Started Status is not Present.");
 	 Logger.logAndReportInfo("Started Status is Present.");
 	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.submittedStatus),"Submitted Status is not Present.");
	     Logger.logAndReportInfo("Submitted Status is Present.");
				 Thread.sleep(2000);
				 
				 ShikshaLokamClient.get().gestures().click(programDashboardObjects.startedStatus);
				 ShikshaLokamClient.get().gestures().click(programDashboardObjects.submittedStatus);
				  Logger.logAndReportPass("values are multiselectable");
				  
		 ShikshaLokamClient.get().gestures().PressEsc(); 
  	  }
   	
   	
    public void requestFilteredTaskDetailreport() throws Exception {
    	Thread.sleep(2000);
    	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
    	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.filteredtaskReport);
    	 Logger.logAndReportPass("Selected Filtered Task Detail Report .");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
		 Logger.logAndReportPass("Request Report button is Enabled.");
		 
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.mintasksinProject),"Minimum no. of tasks in the project textfield is not Present.");
    	 Logger.logAndReportInfo("Minimum no. of tasks in the project textfield is Present.");
         Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.mintaskEvidence),"Minimum no. of task evidence textfield is not Present.");
	     Logger.logAndReportInfo("Minimum no. of task evidence textfield is Present.");
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.minprojectEvidence),"Minimum no. of project evidence textfield is not Present.");
		 Logger.logAndReportInfo("Minimum no. of project evidence textfield is Present.");
		 
		
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportPasswordPopup),"Pop-up header is incorrect");
		 Logger.logAndReportPass("Pop-up header displayed as - Are you sure you want to request this report?");
		 
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.enterPassword),"Password Placeholder is incorrect");
	     Logger.logAndReportPass("Password Placeholder displayed as - Enter a password to request Report");
	     
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.pwdCriteriaMsg),"Password criteria message is incorrect");
	     Logger.logAndReportPass("Password criteria message displayed as - Your password should be 8 characters, alphanumeric, and without special characters or spaces. Remember your password, as you will require the same password to view the generated report."); 
		 
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.nobutton),"No button is not Enabled.");
		 Logger.logAndReportPass("No button is Enabled.");
		 
		 ShikshaLokamClient.get().gestures().sendValueToTextBox(programDashboardObjects.enterPassword,"Test1234");
		 Logger.logAndReportInfo("Entered password as : Test1234");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.yesbutton),"Yes button is not Enabled.");
		 Logger.logAndReportPass("Yes button is Enabled.");
		 //********
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
		 Thread.sleep(2000);
  	  } 
    
    public void requestFilteredTaskDetailreportYes() throws Exception {
    	Thread.sleep(2000);
    	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
    	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.filteredtaskReport);
    	 Logger.logAndReportPass("Selected Filtered Task Detail Report .");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
		 Logger.logAndReportPass("Request Report button is Enabled.");
		 
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.mintasksinProject),"Minimum no. of tasks in the project textfield is not Present.");
    	 Logger.logAndReportInfo("Minimum no. of tasks in the project textfield is Present.");
         Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.mintaskEvidence),"Minimum no. of task evidence textfield is not Present.");
	     Logger.logAndReportInfo("Minimum no. of task evidence textfield is Present.");
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.minprojectEvidence),"Minimum no. of project evidence textfield is not Present.");
		 Logger.logAndReportInfo("Minimum no. of project evidence textfield is Present.");
		 
		
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportPasswordPopup),"Pop-up header is incorrect");
		 Logger.logAndReportPass("Pop-up header displayed as - Are you sure you want to request this report?");
		 
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.enterPassword),"Password Placeholder is incorrect");
	     Logger.logAndReportPass("Password Placeholder displayed as - Enter a password to request Report");
	     
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.pwdCriteriaMsg),"Password criteria message is incorrect");
	     Logger.logAndReportPass("Password criteria message displayed as - Your password should be 8 characters, alphanumeric, and without special characters or spaces. Remember your password, as you will require the same password to view the generated report."); 
		 
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.nobutton),"No button is not Enabled.");
		 Logger.logAndReportPass("No button is Enabled.");
		 
		 ShikshaLokamClient.get().gestures().sendValueToTextBox(programDashboardObjects.enterPassword,"Test1234");
		 Logger.logAndReportInfo("Entered password as : Test1234");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.yesbutton),"Yes button is not Enabled.");
		 Logger.logAndReportPass("Yes button is Enabled.");
		 //********
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.yesbutton);
		 Thread.sleep(2000);
		 ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(programDashboardObjects.reportRequestedPopup);
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.reportRequestedPopup),"Your Report Has Been Requested Pop-up is not Displayed");
		 Logger.logAndReportPass("Your report has been requested and will be available to download after 24 hours - Pop-up is Displayed");
		 ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.okButtonOnReportRequestedPopup);
		 Logger.logAndReportInfo("OK button is Enabled ");
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.okButtonOnReportRequestedPopup);
		 Logger.logAndReportInfo("Clicked on OK button on Report Requested Popup");
  	  } 
   
    public void selectObswithrubrics() throws Exception {
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectresoursedropdown);
		Thread.sleep(2000);
	        if(getEnvironmentValue().contains("diksha")) {
	            ShikshaLokamClient.get().report().log(Status.INFO, "NO Resource");	
	        } else if(getEnvironmentValue().contains("preprod")) {
	        	 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.obswithrubricpreprod);
	    		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.obswithrubricpreprod);
	    	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected  Obs with rubric - FD 137 ')]");
	        } else {
	        	js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.obswithrubricstaging);
				 ShikshaLokamClient.get().gestures().click(programDashboardObjects.obswithrubricstaging);
			         ShikshaLokamClient.get().report().log(Status.INFO, "Selected Observation with Rubrics – FD 98')]");   
	        }
	        
	    }
    public void verifyobswithrubricReports() throws Exception {
	    	 Thread.sleep(2000);
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
		 Logger.logAndReportInfo("Clicked on Select Report Dropdown");
		 Thread.sleep(2000);
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.questionReport),"Question Report type is not Present.");
   	 Logger.logAndReportInfo("Question Report type  is Present .");
        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.statusReport),"Status Report type is not Present.");
	     Logger.logAndReportInfo("Status Report type is Present .");
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.domaincriteriaReport),"Domain Criteria Report type is not Present.");
		 Logger.logAndReportInfo("Domain Criteria Report type  is Present .");
		
   }
  
	
    
    
    public void requestQuestionreport() throws Exception {
  		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.questionReport);
  		 Logger.logAndReportPass("Selected Question Report .");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
		 Logger.logAndReportPass("Request Report button is Enabled.");
		
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportPasswordPopup),"Pop-up header is incorrect");
		 Logger.logAndReportPass("Pop-up header displayed as - Are you sure you want to request this report?");
		 
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.enterPassword),"Password Placeholder is incorrect");
	     Logger.logAndReportPass("Password Placeholder displayed as - Enter a password to request Report");
	     
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.pwdCriteriaMsg),"Password criteria message is incorrect");
	     Logger.logAndReportPass("Password criteria message displayed as - Your password should be 8 characters, alphanumeric, and without special characters or spaces. Remember your password, as you will require the same password to view the generated report."); 
		 
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.nobutton),"No button is not Enabled.");
		 Logger.logAndReportPass("No button is Enabled.");
		 
		 ShikshaLokamClient.get().gestures().sendValueToTextBox(programDashboardObjects.enterPassword,"Test1234");
		 Logger.logAndReportInfo("Entered password as : Test1234");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.yesbutton),"Yes button is not Enabled.");
		 Logger.logAndReportPass("Yes button is Enabled.");
		 //********
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
		 Thread.sleep(2000);
  	  } 
    
    public void requestQuestionreportYes() throws Exception {
    	ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
 		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.questionReport);
 		 Logger.logAndReportPass("Selected Question Report .");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
		 Logger.logAndReportPass("Request Report button is Enabled.");
		
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportPasswordPopup),"Pop-up header is incorrect");
		 Logger.logAndReportPass("Pop-up header displayed as - Are you sure you want to request this report?");
		 
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.enterPassword),"Password Placeholder is incorrect");
	     Logger.logAndReportPass("Password Placeholder displayed as - Enter a password to request Report");
	     
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.pwdCriteriaMsg),"Password criteria message is incorrect");
	     Logger.logAndReportPass("Password criteria message displayed as - Your password should be 8 characters, alphanumeric, and without special characters or spaces. Remember your password, as you will require the same password to view the generated report."); 
		 
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.nobutton),"No button is not Enabled.");
		 Logger.logAndReportPass("No button is Enabled.");
		 
		 ShikshaLokamClient.get().gestures().sendValueToTextBox(programDashboardObjects.enterPassword,"Test1234");
		 Logger.logAndReportInfo("Entered password as : Test1234");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.yesbutton),"Yes button is not Enabled.");
		 Logger.logAndReportPass("Yes button is Enabled.");
		 
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.yesbutton);
		 Thread.sleep(2000);
		 
		 ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(programDashboardObjects.reportRequestedPopup);
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.reportRequestedPopup),"Your Report Has Been Requested Pop-up is not Displayed");
		 Logger.logAndReportPass("Your report has been requested and will be available to download after 24 hours - Pop-up is Displayed");
		 ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.okButtonOnReportRequestedPopup);
		 Logger.logAndReportInfo("OK button is Enabled ");
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.okButtonOnReportRequestedPopup);
		 Logger.logAndReportInfo("Clicked on OK button on Report Requested Popup");
 	  } 
   
    public void requestDomainCriteriareport() throws Exception {	
      	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
   	 
      		ShikshaLokamClient.get().gestures().click(programDashboardObjects.domaincriteriaReport);
      	 Logger.logAndReportPass("Selected Domain Criteria Report .");
      		Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
   		 Logger.logAndReportPass("Request Report button is Enabled.");
   		 
   		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportYesNoPopup),"Request Report Yes No Pop-up is not Displayed");
		 Logger.logAndReportPass("Request Report Yes No Pop-up is Displayed");
		 //***********
		Thread.sleep(2000);
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
    }
    
    public void requestDomainCriteriareportYes() throws Exception {	
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
		 
  		ShikshaLokamClient.get().gestures().click(programDashboardObjects.domaincriteriaReport);
  	 Logger.logAndReportPass("Selected Domain Criteria Report .");
  		Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
		 Logger.logAndReportPass("Request Report button is Enabled.");
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportYesNoPopup),"Request Report Yes No Pop-up is not Displayed");
		 Logger.logAndReportPass("Request Report Yes No Pop-up is Displayed");
		 //***********
		Thread.sleep(2000);
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.yesbutton);
		 Logger.logAndReportInfo("Clicked Yes Button on Request Report Yes No Pop-up.");
		
		 ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(programDashboardObjects.reportRequestedPopup);
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.reportRequestedPopup),"Your Report Has Been Requested Pop-up is not Displayed");
		 Logger.logAndReportPass("Your report has been requested and will be available to download after 24 hours - Pop-up is Displayed");
		 ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.okButtonOnReportRequestedPopup);
		 Logger.logAndReportInfo("OK button is Enabled ");
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.okButtonOnReportRequestedPopup);
		 Logger.logAndReportInfo("Clicked on OK button on Report Requested Popup");
	}
    
    public void selectObswithoutrubrics() throws Exception {
    	Thread.sleep(2000);
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectresoursedropdown);
		Thread.sleep(2000);
	        if(getEnvironmentValue().contains("diksha")) {
	            ShikshaLokamClient.get().report().log(Status.INFO, "NO Resource");	
	        } else if(getEnvironmentValue().contains("preprod")) {
	        	 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.obswithoutrubricpreprod);
	    		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.obswithoutrubricpreprod);
	    	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected Obs without rubric - FD 137");
	        } else {
	        	js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.obswithoutrubricstaging);
				 ShikshaLokamClient.get().gestures().click(programDashboardObjects.obswithoutrubricstaging);
			         ShikshaLokamClient.get().report().log(Status.INFO, "Selected Observation without rubric targeted – FD 98 ");   
	        }
	        
	    }
    public void verifyobswitouthrubricReports() throws Exception {
   	 Thread.sleep(2000);
	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
	 Logger.logAndReportInfo("Clicked on Select Report Dropdown");
	 Thread.sleep(2000);
	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.questionReport),"Question Report type is not Present.");
	 Logger.logAndReportInfo("Question Report type  is Present .");
   Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.statusReport),"Status Report type is not Present.");
    Logger.logAndReportInfo("Status Report type is Present .");
    }
    
    public void selectSurvey() throws Exception {
    	Thread.sleep(2000);
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectresoursedropdown);
		Thread.sleep(2000);
	        if(getEnvironmentValue().contains("diksha")) {
	            ShikshaLokamClient.get().report().log(Status.INFO, "NO Resource");	
	        } else if(getEnvironmentValue().contains("preprod")) {
	        	 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.surveypreprod);
	    		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.surveypreprod);
	    	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected Survey Test Expiry -29/12/2021 -- FD 196");
	        } else {
	        	js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.surveystaging);
				 ShikshaLokamClient.get().gestures().click(programDashboardObjects.surveystaging);
			         ShikshaLokamClient.get().report().log(Status.INFO, "Survey 4.4 Reg Test - FD 235");   
	        }
	        
	    }
    
    public void verifySurveyReports() throws Exception {
      	 Thread.sleep(2000);
   	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
   	 Logger.logAndReportInfo("Clicked on Select Report Dropdown");
   	 Thread.sleep(2000);
   	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.questionReport),"Question Report type is not Present.");
   	 Logger.logAndReportInfo("Question Report type  is Present .");
      Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.statusReport),"Status Report type is not Present.");
       Logger.logAndReportInfo("Status Report type is Present .");
       }
   
    public void verifyPDReports() throws Exception {
    	 Thread.sleep(2000);
    	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
    	 Logger.logAndReportInfo("Clicked on Select Report Dropdown");
    	 Thread.sleep(2000);
    	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.statusReport),"Status Report type is not Present.");
    	 Logger.logAndReportInfo("Only Status Report type is Present .");
    	 }
    
    public void VerifyBigNumberChart() throws Exception {
           Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.BigNumberChart),"Big Number Chart is not Present.");
   		Logger.logAndReportInfo("Big Number Chart is Present .");
   	}
    
    public void VerifyNoBigNumberChart() throws Exception {
        Assert.assertFalse(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.BigNumberChart),"Big Number Chart is Available.");
		Logger.logAndReportInfo("Big Number Chart is not Available .");
	}
    
    
    public void verifyPmUdrReport() throws Exception {
	    	 Thread.sleep(2000);
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
		 Logger.logAndReportInfo("Clicked on Select Report Dropdown");
		 Thread.sleep(2000);
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.udrReport),"User Detail Report type is not Present.");
   	 Logger.logAndReportInfo("User Detail Report type  is Present ."); 
    }
    
    public void verifyUdrReport() throws Exception {
    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.udrReport),"User Detail Report type is not Present.");
  	 Logger.logAndReportInfo("User Detail Report type  is Present ."); 
    }
    public void verifyNoUserDetailReport() throws Exception {
    Assert.assertFalse(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.udrReport),"User Detail Report type  is Present .");
  	 Logger.logAndReportPass("User Detail Report type  is not Present ."); 
  	ShikshaLokamClient.get().gestures().PressEsc(); 
    }
    
    public void requestUDRreport() throws Exception {
  		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.udrReport);
  		 Logger.logAndReportPass("Selected User Detail Report .");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
		 Logger.logAndReportPass("Request Report button is Enabled.");
		
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportPasswordPopup),"Pop-up header is incorrect");
		 Logger.logAndReportPass("Pop-up header displayed as - Are you sure you want to request this report?");
		 
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.enterPassword),"Password Placeholder is incorrect");
	     Logger.logAndReportPass("Password Placeholder displayed as - Enter a password to request Report");
	     
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.pwdCriteriaMsg),"Password criteria message is incorrect");
	     Logger.logAndReportPass("Password criteria message displayed as - Your password should be 8 characters, alphanumeric, and without special characters or spaces. Remember your password, as you will require the same password to view the generated report."); 
		 
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.nobutton),"No button is not Enabled.");
		 Logger.logAndReportPass("No button is Enabled.");
		 
		 ShikshaLokamClient.get().gestures().sendValueToTextBox(programDashboardObjects.enterPassword,"Test1234");
		 Logger.logAndReportInfo("Entered password as : Test1234");
		
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.yesbutton),"Yes button is not Enabled.");
		 Logger.logAndReportPass("Yes button is Enabled.");
		 //********
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
		 Thread.sleep(2000);
  	  } 
    public void requestUDRreportYes() throws Exception {
 		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.udrReport);
 		 Logger.logAndReportPass("Selected User Detail Report .");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
		 Logger.logAndReportPass("Request Report button is Enabled.");
		
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportPasswordPopup),"Pop-up header is incorrect");
		 Logger.logAndReportPass("Pop-up header displayed as - Are you sure you want to request this report?");
		 
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.enterPassword),"Password Placeholder is incorrect");
	     Logger.logAndReportPass("Password Placeholder displayed as - Enter a password to request Report");
	     
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.pwdCriteriaMsg),"Password criteria message is incorrect");
	     Logger.logAndReportPass("Password criteria message displayed as - Your password should be 8 characters, alphanumeric, and without special characters or spaces. Remember your password, as you will require the same password to view the generated report."); 
		 
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.nobutton),"No button is not Enabled.");
		 Logger.logAndReportPass("No button is Enabled.");
		 
		 ShikshaLokamClient.get().gestures().sendValueToTextBox(programDashboardObjects.enterPassword,"Test1234");
		 Logger.logAndReportInfo("Entered password as : Test1234");
		
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.yesbutton),"Yes button is not Enabled.");
		 Logger.logAndReportPass("Yes button is Enabled.");
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.yesbutton);
		 Logger.logAndReportPass("Clicked On Yes Button.");
		 Thread.sleep(2000);
		 ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(programDashboardObjects.reportRequestedPopup);
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.reportRequestedPopup),"Your Report Has Been Requested Pop-up is not Displayed");
		 Logger.logAndReportPass("Your report has been requested and will be available to download after 24 hours - Pop-up is Displayed");
		 ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.okButtonOnReportRequestedPopup);
		 Logger.logAndReportInfo("OK button is Enabled ");
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.okButtonOnReportRequestedPopup);
		 Logger.logAndReportInfo("Clicked on OK button on Report Requested Popup"); 
    } 
    public void ClickCloseDashboardButton() throws Exception {
    	ShikshaLokamClient.get().gestures().click(programDashboardObjects.CloseDashboardButton);
		Logger.logAndReportInfo("Close Dashboard is present and clicked on it and user is landed on the Home page.");
	  }
    
    public void ClickResetFilterButton() throws Exception {
    	ShikshaLokamClient.get().gestures().click(programDashboardObjects.ResetFilterButton);
		Logger.logAndReportInfo("Clicked on Reser filter Button.");
	  }
    
    public void verifyRequestReportPasswordPopup()throws Exception {
		
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportPasswordPopup),"Pop-up header is incorrect");
		 Logger.logAndReportPass("Pop-up header displayed as - Are you sure you want to request this report?");
		 
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.enterPassword),"Password Placeholder is incorrect");
	     Logger.logAndReportPass("Password Placeholder displayed as - Enter a password to request Report");
	     
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.pwdCriteriaMsg),"Password criteria message is incorrect");
	     Logger.logAndReportPass("Password criteria message displayed as - Your password should be 8 characters, alphanumeric, and without special characters or spaces. Remember your password, as you will require the same password to view the generated report."); 
		 
	     Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.nobutton),"No button is not Enabled.");
		 Logger.logAndReportPass("No button is Enabled.");
		 
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
		 Thread.sleep(2000);
    	
    	
    }
    
    public void VerifyProgramNameAndResourceName() throws Exception {
           Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.programTesting4point4),"Same Program Name selected on Pop-up is not displayed");
   		Logger.logAndReportInfo("Same Program Name selected on Pop-up is displayed");
   	  Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.projectlinkconsumptionfd98),"Same Resource Name selected is not displayed");
 		Logger.logAndReportInfo("Same Resource Name selected is displayed");
   	}
    
    public void verifyDistrictWiseHeader() throws Exception {
		ShikshaLokamClient.get().gestures().waitForElementToAppear(programDashboardObjects.districtWiseTableHeader);
		Logger.logAndReportPass("District Wise Status Header is Displayed");	
   }
    
    public void verifyBlockWiseHeader() throws Exception {
		ShikshaLokamClient.get().gestures().waitForElementToAppear(programDashboardObjects.blockWiseTableHeader);
		Logger.logAndReportPass("Block Wise Status Header is Displayed");	
   }
    
    public void clickOnSelectReportDropdown() throws Exception {
    ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
	 Logger.logAndReportInfo("Clicked on Select Report Dropdown");
    
    }
   
    public void selectStatusReport() throws Exception {
    ShikshaLokamClient.get().gestures().click(programDashboardObjects.statusReport);
	 Logger.logAndReportPass("Selected Status Report .");
    }
    
    public void selectFilteredTaskDetailReport() throws Exception {
        ShikshaLokamClient.get().gestures().click(programDashboardObjects.filteredtaskReport);
    	 Logger.logAndReportPass("Selected Filtered Task Detail Report .");
    	 Thread.sleep(3000);
        }
    
    public void verifyFilteredTaskDetailReportFilters() throws Exception {
    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.mintasksinProject),"Minimum no. of tasks in the project textfield is not Present.");
	 Logger.logAndReportPass("Minimum no. of tasks in the project filter is Present.");
    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.mintaskEvidence),"Minimum no. of task evidence textfield is not Present.");
    Logger.logAndReportPass("Minimum no. of task evidence filter is Present.");
    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.minprojectEvidence),"Minimum no. of project evidence textfield is not Present.");
    Logger.logAndReportPass("Minimum no. of project evidence filter is Present.");
}
    public void verifyInprogressAndSubmittedProjectsWithEvidencesTableColumns() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(programDashboardObjects.districtWiseTableHeader);
        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.inprogressProjectWithEvidenceColumn),"In progress projects with evidence - column is not Present.");
    	 Logger.logAndReportPass("In progress projects with evidence - column is Present.");
    	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.submittedProjectWithEvidenceColumn),"Submitted projects with evidence - column is not Present.");
    	 Logger.logAndReportPass("Submitted projects with evidence - column is Present.");
   
    }
    
    public void selectNewProgramProgramTeacher() throws Exception {
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectprogramdropdownonpopup);
		 ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on select Program");	
		Thread.sleep(2000);
	        if(getEnvironmentValue().contains("diksha")) {
	            ShikshaLokamClient.get().report().log(Status.INFO, "NO Program");	
	        } else if(getEnvironmentValue().contains("preprod")) {
	    	        ShikshaLokamClient.get().report().log(Status.INFO, "NO Program");
	        } else {
	        	 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.programTeacher);
	    		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.programTeacher);
	    	        ShikshaLokamClient.get().report().log(Status.INFO, "Selected Program - Teacher");
	        }
	        Thread.sleep(2000);
	        
    }
    
    public void selectProgramTeacherProjectResource() throws Exception {
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectresourse);
		Thread.sleep(2000);
	        if(getEnvironmentValue().contains("diksha")) {
	            ShikshaLokamClient.get().report().log(Status.INFO, "NO Resource");	
	        } else if(getEnvironmentValue().contains("preprod")) {
	    	        ShikshaLokamClient.get().report().log(Status.INFO, "NO Resource");
	        } else {
	        	js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.impProjTeacher);
				 ShikshaLokamClient.get().gestures().click(programDashboardObjects.impProjTeacher);
			         ShikshaLokamClient.get().report().log(Status.INFO, "Selected Improvement Project - Teacher");   
	        }
	        Thread.sleep(2000);
	        
	    }
    
    public void selectProgramTeacherObsWithRubricsResource() throws Exception {
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectresoursedropdown);
		Thread.sleep(2000);
	        if(getEnvironmentValue().contains("diksha")) {
	            ShikshaLokamClient.get().report().log(Status.INFO, "NO Resource");	
	        } else if(getEnvironmentValue().contains("preprod")) {
	    	        ShikshaLokamClient.get().report().log(Status.INFO, "NO Resource");
	        } else {
	        	js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.obsWithRubricsReacher);
				 ShikshaLokamClient.get().gestures().click(programDashboardObjects.obsWithRubricsReacher);
			         ShikshaLokamClient.get().report().log(Status.INFO, "Selected obs with rubrics Teacher");   
	        }
	        Thread.sleep(2000);
	        
	    }
    
    public void selectProgramTeacherObsWithoutRubricsResource() throws Exception {
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectresoursedropdown);
		Thread.sleep(2000);
	        if(getEnvironmentValue().contains("diksha")) {
	            ShikshaLokamClient.get().report().log(Status.INFO, "NO Resource");	
	        } else if(getEnvironmentValue().contains("preprod")) {
	    	        ShikshaLokamClient.get().report().log(Status.INFO, "NO Resource");
	        } else {
	        	js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.obsWithoutRubricsTeacher);
				 ShikshaLokamClient.get().gestures().click(programDashboardObjects.obsWithoutRubricsTeacher);
			         ShikshaLokamClient.get().report().log(Status.INFO, "Selected Observation without Rubrics Teacher");   
	        }
	        Thread.sleep(2000);

	        
	    }
    
    public void selectProgramHTandOfficialsSurveyHTResource() throws Exception {
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectresourse);
		Thread.sleep(2000);
	        if(getEnvironmentValue().contains("diksha")) {
	            ShikshaLokamClient.get().report().log(Status.INFO, "NO Resource");	
	        } else if(getEnvironmentValue().contains("preprod")) {
	    	        ShikshaLokamClient.get().report().log(Status.INFO, "NO Resource");
	        } else {
	        	js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.surveyHT);
				 ShikshaLokamClient.get().gestures().click(programDashboardObjects.surveyHT);
			         ShikshaLokamClient.get().report().log(Status.INFO, "Selected Survey HT ");   
	        }
	        Thread.sleep(2000);    
	    }
    
    public void verifySelectReportisNotClickable() throws Exception {
    Assert.assertFalse(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.selectReportDropdown),"Select Report button is Clickable .");
	 Logger.logAndReportPass("Select Report Dropdown is not Clickable , therefore No Reports Available");
}
    
    public void verifyByDefaultOnProgramDatasetsTab() throws Exception {
        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.detailedReportHeader),"Detailed Report Section is not present - therefore User Did not land on Program Datasets Tab");
		Logger.logAndReportPass("Detailed Report Section is present - therefore User landed on Program Datasets Tab  by Default");
	}
    
    public void verifyByDefaultNoResouceIsSelected() throws Exception {
        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.selectresourse),"Select Resource Placeholder is not Displayed - therefore Resource is selected under Datasets by Default");
		Logger.logAndReportPass("Select Resource Placeholder is Displayed - therefore Resource is not selected under Datasets by Default ");
	}
    
    public void verifySelectedProgramHTandOfficialsOnPopupIsByDefaultSelected() throws Exception {
    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.programHtandOfficials) ,"Same Program is not selected under Datasets Tab");
	 Logger.logAndReportPass("Same Program is selected under Datasets Tab by Default");
    }
    
    public void verifyImprovementProjectTableColumnsOfBlockWiseStatusTab() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(programDashboardObjects.blockWiseTableHeader);
         Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.programNameColumn),"Program Name - column is not Present.");
    	 Logger.logAndReportPass("Program Name - column is Present.");
    	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.improvementProjectNameColumn),"Improvement Project Name - column is not Present.");
    	 Logger.logAndReportPass("Improvement Project Name - column is Present.");
    	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.districtNameColumn),"District Name - column is not Present.");
    	 Logger.logAndReportPass("District Name - column is Present.");
    	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.blockNameColumn),"Block Name - column is not Present.");
    	 Logger.logAndReportPass("Block Name - column is Present.");
    	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.organizationNameColumn),"Organisation Name - column is not Present.");
    	 Logger.logAndReportPass("Organisation Name  - column is Present.");
    	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.startedColumn),"Started - column is not Present.");
    	 Logger.logAndReportPass("Started - column is Present.");
    	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.inprogressColumn),"In-Progress - column is not Present.");
    	 Logger.logAndReportPass("In-Progress  - column is Present.");
    	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.inprogressProjectWithEvidenceColumn),"In progress projects with evidence - column is not Present.");
    	 Logger.logAndReportPass("In progress projects with evidence  - column is Present.");
    	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.submittedColumn),"Submitted - column is not Present.");
    	 Logger.logAndReportPass("Submitted  - column is Present.");
    	 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.submittedProjectWithEvidenceColumn),"Submitted projects with evidence - column is not Present.");
    	 Logger.logAndReportPass("Submitted projects with evidence  - column is Present.");

   
    }
    
    public void verifyTableViewNotAvailableFotThisReportUnderBlockWiseStatusTabForSurveyResource() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(programDashboardObjects.tableViewIsNotAvailable);
         Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.tableViewIsNotAvailable),"Table view is not available for this report - error message is not Displayed.");
    	 Logger.logAndReportPass("Table view is not available for this report - error message is Displayed.");
    }
    
    public void verifyObservationsTableColumnsOfBlockWiseStatusTab() throws Exception {
    	ShikshaLokamClient.get().gestures().waitForElementToAppear(programDashboardObjects.blockWiseTableHeader);
    	Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.programNameColumn),"Program Name - column is not Present.");
   	    Logger.logAndReportPass("Program Name - column is Present.");

   	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.observationNameColumn),"Observation Name - column is not Present.");
   	    Logger.logAndReportPass("Observation Name - column is Present.");
   	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.organizationNameColumn),"Organisation Name - column is not Present.");
	    Logger.logAndReportPass("Organisation Name  - column is Present.");
	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.districtColumn),"District - column is not Present.");
   	    Logger.logAndReportPass("District - column is Present.");
   	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.blockColumn),"Block - column is not Present.");
   	    Logger.logAndReportPass("Block - column is Present.");
   	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.noOfUsersStartedColumn),"No. of users (started) - column is not Present.");
	    Logger.logAndReportPass("No. of users (started) - column is Present.");
	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.noOfUsersSubmittedColumn),"No. of users (submitted) - column is not Present.");
	    Logger.logAndReportPass("No. of users (submitted) - column is Present.");
	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.totalSubmissionsColumn),"Total Submissions - column is not Present.");
	    Logger.logAndReportPass("Total Submissions - column is Present.");
	    Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.entitiesObservedColumn),"Entities Observed - column is not Present.");
	    Logger.logAndReportPass("Entities Observed - column is Present.");

    }
    
    public void clickOnDistrictDropdown() throws Exception {
	         ShikshaLokamClient.get().gestures().click(programDashboardObjects.districtDropdown);
	      ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on District Dropdown");
	      Thread.sleep(2000);
    }
    
    public void selectDistrictUdr() throws Exception {
	      if(getEnvironmentValue().contains("diksha")) {
           ShikshaLokamClient.get().report().log(Status.INFO, "No District");	
       } else if(getEnvironmentValue().contains("preprod")) {
            
             ShikshaLokamClient.get().report().log(Status.INFO, "No District");
       } else {
    	   ShikshaLokamClient.get().gestures().scrollToElement(programDashboardObjects.Anantapurdistrict);
             ShikshaLokamClient.get().gestures().click(programDashboardObjects.Anantapurdistrict);
             ShikshaLokamClient.get().report().log(Status.INFO, "Selected Ananthapuram District");
       }
   }
    
    public void selectBlock() throws Exception {
	      if(getEnvironmentValue().contains("diksha")) {
         ShikshaLokamClient.get().report().log(Status.INFO, "NO Block");	
     } else if(getEnvironmentValue().contains("preprod")) {
           
           ShikshaLokamClient.get().report().log(Status.INFO, "No Block");
     } else {
    	 ShikshaLokamClient.get().gestures().scrollToElement(programDashboardObjects.amadagurBlock);
           ShikshaLokamClient.get().gestures().click(programDashboardObjects.amadagurBlock);
           ShikshaLokamClient.get().report().log(Status.INFO, "Selected Amadagur Block");
           ShikshaLokamClient.get().gestures().PressEsc();
     }
 }
    public void selectMultipleBlocks() throws Exception {
	      if(getEnvironmentValue().contains("diksha")) {
       ShikshaLokamClient.get().report().log(Status.INFO, "NO Block");	
   } else if(getEnvironmentValue().contains("preprod")) {
         
         ShikshaLokamClient.get().report().log(Status.INFO, "No Block");
   } else {
  	 ShikshaLokamClient.get().gestures().scrollToElement(programDashboardObjects.amadagurBlock);
         ShikshaLokamClient.get().gestures().click(programDashboardObjects.amadagurBlock);
         ShikshaLokamClient.get().report().log(Status.INFO, "Selected Amadagur Block");
         ShikshaLokamClient.get().gestures().scrollToElement(programDashboardObjects.amarapuramBlock);
         ShikshaLokamClient.get().gestures().click(programDashboardObjects.amarapuramBlock);
         ShikshaLokamClient.get().report().log(Status.INFO, "Selected Amarapuram Block");
         ShikshaLokamClient.get().report().log(Status.INFO, "Selected Multiple Blocks");
         ShikshaLokamClient.get().gestures().PressEsc();
   }
}
    
    public void VerifyMultiSelectedBlocks() throws Exception {
           Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.multipleBlockSelected),"Selected Amadurga and Anatapur, is Not Displayed in Block Filter ");
   		Logger.logAndReportPass("Selected Amadurga and Anatapur Block, is Displayed in Block Filter ");
   		Thread.sleep(2000);
   	}
    
}





