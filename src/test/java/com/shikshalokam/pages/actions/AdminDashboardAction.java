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
	    
	   /* public void verifyDatasetstab() throws Exception {
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isDisplayed(adminDashboardObjects.datasetsTab),"Datasets tab is not displayed.");
			Logger.logAndReportPass("Datasets tab is displayed.");
		} */

		
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
	        
	        public void searchAndSelectProjectReports() throws Exception {
	   	         
	   	      if(getEnvironmentValue().contains("diksha")) {
		            ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
		        } else if(getEnvironmentValue().contains("preprod")) {
		        	 ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.globalSearchFilter,"New Improvement Projects Report Beta");
		 	    	
		 	        Logger.logAndReportInfo("Searched for New Improvement Projects Report Beta ");
		 	        Thread.sleep(2000);
		 	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.impProjectReportPreprod);
		 	        Logger.logAndReportInfo("Clicked on Improvement Project Report"); 
		        } else {
		        	
		        	 ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.globalSearchFilter,"Unique User Improvement Project Report");
		        	 //System.out.println(Clock.SYSTEM);
		 	        Logger.logAndReportInfo("Searched for Unique User Improvement Project Report ");
		 	        Thread.sleep(2000);
		 	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.impProjectReportStaging);
		 	       //System.out.println(Clock.SYSTEM);
		 	        Logger.logAndReportInfo("Clicked on Improvement Project Report"); 
		        }
	    }
	    
	      
	        public void searchAndSelectObservationReports() throws Exception {
	   	         
		   	      if(getEnvironmentValue().contains("diksha")) {
			            ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
			        } else if(getEnvironmentValue().contains("preprod")) {
			        	 ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.globalSearchFilter,"Unique User Observation Report");
			 	    	
			 	        Logger.logAndReportInfo("Searched for Unique User Observation Report ");
			 	        //Thread.sleep(2000);
			 	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.observationReport);
			 	        Logger.logAndReportInfo("Clicked on Unique User Observation Report"); 
			        } else {
                          ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.globalSearchFilter,"Unique User Observation Report");
			 	    	
			 	        Logger.logAndReportInfo("Searched for Unique User Observation Report ");
			 	        //Thread.sleep(2000);
			 	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.observationReport);
			 	        Logger.logAndReportInfo("Clicked on Unique User Observation Report"); 
			        }
		    }
	        
	        
	        public void searchAndSelectSurveyReports() throws Exception {
	   	         
		   	      if(getEnvironmentValue().contains("diksha")) {
			            ShikshaLokamClient.get().report().log(Status.INFO, "NO ");	
			        } else if(getEnvironmentValue().contains("preprod")) {
			        	 ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.globalSearchFilter,"Unique User Survey Report");
			 	    	
			 	        Logger.logAndReportInfo("Searched for Unique User Survey Report ");
			 	        //Thread.sleep(2000);
			 	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.surveyReport);
			 	        Logger.logAndReportInfo("Clicked on Unique User Survey Report"); 
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
	    	ShikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.localSearchFilter,"up");
	        Logger.logAndReportInfo("Searched for up");
	        Thread.sleep(2000);
	        ShikshaLokamClient.get().gestures().click(adminDashboardObjects.upPararmeter);
	        Logger.logAndReportInfo("Clicked on up Parameter");     
	    }
	    
	    public void verifyGraphsTab() throws Exception {
	        Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.graphsTab),"Graphs tab is not displayed.");
			Logger.logAndReportPass("Graphs tab is is displayed.");
		
		}
	    
	    public void selectProjectFilters() throws Exception {
			ShikshaLokamClient.get().gestures().click(adminDashboardObjects.selectProgramFilter);
     ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Program Filter"); 
    // Thread.sleep(2000);
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox1);
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox2);
     ShikshaLokamClient.get().report().log(Status.INFO, " Selected multiple filters"); 
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
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox2);
     ShikshaLokamClient.get().report().log(Status.INFO, "Selected multiple filters");
     //Thread.sleep(2000);
/*     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.selectOrganisationFilter);
     ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Organisation Filter"); 
     //Thread.sleep(2000);
     ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox1);
    // ShikshaLokamClient.get().gestures().click(adminDashboardObjects.filterCheckBox2);
     ShikshaLokamClient.get().report().log(Status.INFO,  "Selected multiple filters");   */
     
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
	    

}
