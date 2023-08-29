package com.shikshalokam.pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.objects.LoginPageObjects;
import com.shikshalokam.pages.objects.ProgramDashboardObjects;
import com.shikshalokam.utils.logger.Logger;
import com.shikshalokam.utils.prop.PropUtlis;

public class ProgramDashboardAction {
	
	ProgramDashboardObjects programDashboardObjects;
	
	 public ProgramDashboardAction() throws Exception {
		 programDashboardObjects = PageFactory.initElements(ShikshaLokamClient.get().driver(), ProgramDashboardObjects.class);
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

	
	 public void clickOnProfileIcon() throws Exception {
				ShikshaLokamClient.get().gestures().click(programDashboardObjects.guestIcon);
	        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on User Icon");
	    }
	 
	 public void clickOnprogramdashboard() throws Exception {
			ShikshaLokamClient.get().gestures().click(programDashboardObjects.programdashboard);
     ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Program Dashboard");
	 }
	
	 public void clickOnGraphsTab() throws Exception {
			ShikshaLokamClient.get().gestures().click(programDashboardObjects.Graphs);
  ShikshaLokamClient.get().report().log(Status.INFO, "Clicked Graphs Tab");
	 }
	 
	 public void clickOnProgramDatasetsTab() throws Exception {
			ShikshaLokamClient.get().gestures().click(programDashboardObjects.Programdatasets);
ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Program Datasets Tab");
	 }
	
	
	 

		public void verifyselectProgramPopup() throws Exception {
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.selectProgramPopup),"Select Program Pop-up is not displayed.");
			Logger.logAndReportPass("Select Program is displayed. succesfully");
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
		        
		    }
		 public void selectNewProgram() throws Exception {
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
			   Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.confirmbuttonOnSelectprogramPopup),"Confirm Button got Enabled on Program Resource Pop-up.");
			   Logger.logAndReportPass("Confirm Button got Enabled on Program Resource Pop-up.");
		    	ShikshaLokamClient.get().gestures().click(programDashboardObjects.confirmbuttonOnSelectprogramPopup);
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
   	            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.SelectResourceMessage),"*Please select the resource name to get data message doesn't shows up.");
   	    		Logger.logAndReportInfo("*Please select the resource name to get data message shows up.");
   	    	}
   	    	
   	    	//selecting district and organisation in staging
   	    	public void selectDistrictandOrgPD() throws Exception {
   	    		selectDistrictPD();
   	    		selectOrgPD();
   		 }
   	    	public void selectDistrictPD() throws Exception {
   	         ShikshaLokamClient.get().gestures().click(programDashboardObjects.districtDropdown);
		      Thread.sleep(2000);
   	      if(getEnvironmentValue().contains("diksha")) {
	            ShikshaLokamClient.get().report().log(Status.INFO, "NO Resource");	
	        } else if(getEnvironmentValue().contains("preprod")) {
	        	ShikshaLokamClient.get().gestures().click(programDashboardObjects.Ambedkarnagardistrict);
	              ShikshaLokamClient.get().report().log(Status.INFO, "Selected Ambedkarnagar District");
	              Thread.sleep(3000);
	              ShikshaLokamClient.get().gestures().click(programDashboardObjects.districtDropdown);
	              ShikshaLokamClient.get().gestures().click(programDashboardObjects.Agradistrict);
	              ShikshaLokamClient.get().report().log(Status.INFO, "Reselected Agra District");
	        
	        } else {
			      ShikshaLokamClient.get().gestures().click(programDashboardObjects.Anantapurdistrict);
	              ShikshaLokamClient.get().report().log(Status.INFO, "Selected Ananthapur District");
	              Thread.sleep(3000);
	              ShikshaLokamClient.get().gestures().click(programDashboardObjects.districtDropdown);
	              ShikshaLokamClient.get().gestures().click(programDashboardObjects.Chittordistrict);
	              ShikshaLokamClient.get().report().log(Status.INFO, "Reselected Chittor District");
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
   	    	//dateinput 
		 
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
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportPasswordPopup),"Request Report Password Pop-up is not Displayed");
		 Logger.logAndReportPass("Request Report Password Pop-up is Displayed");
		 ShikshaLokamClient.get().gestures().sendValueToTextBox(programDashboardObjects.enterPassword,"Test1234");
		 Logger.logAndReportInfo("Entered password as : Test1234");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.yesbutton),"Yes button is not Enabled.");
		 Logger.logAndReportPass("Yes button is Enabled.");
		 //********
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
		 Thread.sleep(2000);
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
  	
  	
	public void requestStatusreportYES() throws Exception {	
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
		 Logger.logAndReportPass("Your Report Has Been Requested Pop-up is Displayed");
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.okButtonOnReportRequestedPopup);
		 Logger.logAndReportInfo("Clicked on OK button on Report Requested Popup");
 	}
   	  // verify Project status filters
   	public void verifyProjectstatusfilters() throws Exception {	
		 
		 softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.selectstatusDropdown),"Select Status Dropdown is not Displayed");
		 Logger.logAndReportPass("Select Status Dropdown is Displayed");
		 softAssert.assertTrue(ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectstatusDropdown),"Select Status Dropdown is not Displayed");
		 Logger.logAndReportInfo("Clicked on Select Status Dropdown.");
		 
		 //*****************@#$%^&@#$%^
		 softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.startedStatus),"Started Status is not Present.");
    	 Logger.logAndReportInfo("Started Status is Present.");
    	 softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.submittedStatus),"Submitted Status is not Present.");
	     Logger.logAndReportInfo("Submitted Status is Present.");
	     softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.inprogressStatus),"Inprogress Status is not Present.");
		 Logger.logAndReportInfo("Inprogress Status is Present.");
		 //softAssert.assertAll();
		 Thread.sleep(2000);
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
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportPasswordPopup),"Request Report Password Pop-up is not Displayed");
		 Logger.logAndReportPass("Request Report Password Pop-up is Displayed");
		 ShikshaLokamClient.get().gestures().sendValueToTextBox(programDashboardObjects.enterPassword,"Test1234");
		 Logger.logAndReportInfo("Entered password as : Test1234");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.yesbutton),"Yes button is not Enabled.");
		 Logger.logAndReportPass("Yes button is Enabled.");
		 //********
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
		 Thread.sleep(2000);
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
    //request status report and verify obs with rubric status filters
	public void requestobswithrubricStatusreport() throws Exception {	
	   	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
		 
	   		ShikshaLokamClient.get().gestures().click(programDashboardObjects.statusReport);
	   	 Logger.logAndReportPass("Selected Status Report .");
	   		Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
			 Logger.logAndReportPass("Request Report button is Enabled.");
			 
			 softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.selectstatusDropdown),"Select Status Dropdown is not Displayed");
			 Logger.logAndReportPass("Select Status Dropdown is Displayed");
			 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectstatusDropdown);
			 Logger.logAndReportInfo("Clicked on Select Status Dropdown.");
			 
			 //*****************@#$%^&@#$%^
			 softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.startedStatus),"Started Status is not Present.");
	    	 Logger.logAndReportInfo("Started Status is Present.");
	    	 softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.completedStatus),"completed Status is not Present.");
		     Logger.logAndReportInfo("Completed Status is Present.");
		     softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.inprogressStatus),"Inprogress Status is not Present.");
			 Logger.logAndReportInfo("Inprogress Status is Present.");
			// softAssert.assertAll();
			 Thread.sleep(2000);
			 ShikshaLokamClient.get().gestures().PressEsc(); 
			 
			 
			 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
			 Logger.logAndReportInfo("Clicked on Request Report.");
			 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportYesNoPopup),"Request Report Yes No Pop-up is not Displayed");
			 Logger.logAndReportPass("Request Report Yes No Pop-up is Displayed");
			 //***********
			Thread.sleep(2000);
			 ShikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
	     	 
	     	  } 
    
	//request status report and verify obs without rubric status filters
	public void requestobswithoutrubricStatusreport() throws Exception {	
	   	 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
		 
	   		ShikshaLokamClient.get().gestures().click(programDashboardObjects.statusReport);
	   	 Logger.logAndReportPass("Selected Status Report .");
	   		Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
			 Logger.logAndReportPass("Request Report button is Enabled.");
			 
			 softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.selectstatusDropdown),"Select Status Dropdown is not Displayed");
			 Logger.logAndReportPass("Select Status Dropdown is Displayed");
			 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectstatusDropdown);
			 Logger.logAndReportInfo("Clicked on Select Status Dropdown.");
			 
			 //*****************@#$%^&@#$%^
			 softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.startedStatus),"Started Status is not Present.");
	    	 Logger.logAndReportInfo("Started Status is Present.");
	    	 softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.completedStatus),"completed Status is not Present.");
		     Logger.logAndReportInfo("Completed Status is Present.");
		   
			 //softAssert.assertAll();
			 Thread.sleep(2000);
			 ShikshaLokamClient.get().gestures().PressEsc(); 
			 
			 
			 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
			 Logger.logAndReportInfo("Clicked on Request Report.");
			 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportYesNoPopup),"Request Report Yes No Pop-up is not Displayed");
			 Logger.logAndReportPass("Request Report Yes No Pop-up is Displayed");
			 //***********
			Thread.sleep(2000);
			 ShikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
	     	 
	     	  } 
    
    
    public void requestQuestionreport() throws Exception {
  		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.questionReport);
  		 Logger.logAndReportPass("Selected Question Report .");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
		 Logger.logAndReportPass("Request Report button is Enabled.");
		
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportPasswordPopup),"Request Report Password Pop-up is not Displayed");
		 Logger.logAndReportPass("Request Report Password Pop-up is Displayed");
		 ShikshaLokamClient.get().gestures().sendValueToTextBox(programDashboardObjects.enterPassword,"Test1234");
		 Logger.logAndReportInfo("Entered password as : Test1234");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.yesbutton),"Yes button is not Enabled.");
		 Logger.logAndReportPass("Yes button is Enabled.");
		 //********
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
		 Thread.sleep(2000);
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
    
    public void verifyPmUdrReport() throws Exception {
	    	 Thread.sleep(2000);
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
		 Logger.logAndReportInfo("Clicked on Select Report Dropdown");
		 Thread.sleep(2000);
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.udrReport),"User Detail Report type is not Present.");
   	 Logger.logAndReportInfo("User Detail Report type  is Present ."); 
    }
    
    public void requestUDRreport() throws Exception {
  		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.udrReport);
  		 Logger.logAndReportPass("Selected User Detail Report .");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
		 Logger.logAndReportPass("Request Report button is Enabled.");
		
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportPasswordPopup),"Request Report Password Pop-up is not Displayed");
		 Logger.logAndReportPass("Request Report Password Pop-up is Displayed");
		 ShikshaLokamClient.get().gestures().sendValueToTextBox(programDashboardObjects.enterPassword,"Test1234");
		 Logger.logAndReportInfo("Entered password as : Test1234");
		 Assert.assertTrue(ShikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.yesbutton),"Yes button is not Enabled.");
		 Logger.logAndReportPass("Yes button is Enabled.");
		 //********
		 ShikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
		 Thread.sleep(2000);
  	  } 
    
    
    
    }





