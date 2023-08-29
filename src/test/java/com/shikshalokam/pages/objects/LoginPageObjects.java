package com.shikshalokam.pages.objects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import com.aventstack.extentreports.Status;
import com.shikshalokam.client.ShikshaLokamClient;

import io.appium.java_client.MobileElement;

public class LoginPageObjects {


    @FindBy(xpath = "(//button[contains(text(),'Explore DIKSHA')])[1]")
    public WebElement exploreDiksha;

    @FindBy(xpath = "//a[contains(.,'Login')]")
    public WebElement login;
    
    @FindBy(xpath = "//li[normalize-space()='Logout']")
	public WebElement logout;

    @FindBy(xpath = "//a[contains(.,'Observations')]")
    public WebElement observations;

    @FindBy(xpath = "//li[@class='list-item'][contains(.,'Help')]")
    public WebElement help;

    @FindBy(xpath = "//span[contains(.,'Switch to classic theme')]")
    public WebElement switchToClassicTheme;

    @FindBy(xpath = "//li[contains(.,'Profile')]")
    public WebElement profile;
   
    @FindBy(xpath = "//p[@class='subtitle']")
    public WebElement loginScreen;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement userName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement Password;

    @FindBy(xpath = "//button[@id='login']")
    public WebElement loginButton;

    @FindBy(xpath = "//span[contains(@id,'signup')]")
    public WebElement registerHere;

    @FindBy(xpath = "//div[contains(@id,'fgtPortalFlow')]")
    public WebElement forgetPassword;

    @FindBy(xpath = "//i[contains(@class,'dropdown icon')]")
    public WebElement YearDropDown;

    @FindBy(xpath = "//input[contains(@id,'signup-form-name')]")
    public WebElement registerer;

    @FindBy(xpath = "//label[contains(@id,'emailLbl')]")
    public WebElement registererEmailAddress;

    @FindBy(xpath = "//input[@id='signup-form-phone']")
    public WebElement registererPhNumber;

    @FindBy(xpath = "//input[@id='signup-form-password']")
    public WebElement registererPassword;

    @FindBy(xpath = "//input[@id='signup-form-confirmPassword']")
    public WebElement registererConfirmpassword;

    @FindBy(xpath = "//input[@id='tncAccepted']")
    public WebElement AcceptClickMark;

    @FindBy(xpath = "//button[contains(.,'Register')]")
    public WebElement registerButton;


    @FindBy(xpath = "//*[@aria-label=\"School head OR Officials Selected\"]")
    public WebElement schoolHeadOfficials;

    @FindBy(xpath = "//*[@type=\"submit\"] //continue")
    public WebElement continueIn;


    @FindBy(xpath = "//*[@id=\"board\"]")
    public WebElement boardDropdown;


    @FindBy(xpath = "//*[@id='gradeLevel']")
    public WebElement gradeLevelDropdown;


    @FindBy(xpath = "//*[@id=\"medium\"]")
    public WebElement mediumDropdown;


//(//*[@class="menu transition hidden"]//sui-select-option)[2]

    @FindBy(xpath = "//span[contains(.,'IGOT-Health')]")
    public WebElement IGOT_Health;


    @FindBy(xpath = "//span[contains(.,'English')]")
    public WebElement english;

    //

    @FindBy(xpath = "//div[@aria-label='Select Class']")
    public WebElement  selectClass;

    @FindBy(xpath = "(//div[contains(text(),'School head OR Officials')])[1]")
    public WebElement  schoolHeadOROfficial;

    @FindBy(xpath = "//div[contains(@aria-label, 'Select State')]")
    public WebElement  selectState;

    @FindBy(xpath = "(//div[contains(@tabindex,'0')])[9]")
    public WebElement  andamanNicobarIsland;

    @FindBy(xpath ="(//div[contains(@tabindex,'0')])[44])")
    public WebElement uttarPradesh;		
    
    @FindBy(xpath = "//div[contains(@aria-label, 'Select District')]")
    public WebElement  selectDistrict;

    @FindBy(xpath = "(//div[@tabindex='0'])[88]")
    public WebElement  firstDistrict;

    @FindBy(xpath = "//div[@tabindex='0']//span[text()='AGRA']")
    public WebElement  agraDistrict;
    
    @FindBy(xpath = "//div[@tabindex='0']//span[text()='Ananthapuram']")
    public WebElement ananthpurDistrict;
    
    @FindBy(xpath = "//div[@tabindex='0']//span[text()='Alappuzha']")
    public WebElement alappuzhaDistrict;
    
    @FindBy(xpath = "//button[contains(.,'Submit')]")
    public WebElement  courseWindowSubmitButton;

    @FindBy(xpath = "//button[contains(.,'Submit')]")
    public WebElement  LocationWindowSubmitButton;
    
    @FindBy(xpath = "//button[contains(.,'Clear')]")
    public WebElement  clear;

    @FindBy(xpath = "//input[@placeholder='Enter Name']")
    public WebElement  EnterName;

   // New xpaths
    //@FindBy(xpath="//a[@class='profile-avtar p-0'][1]")
    @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/app-header[1]/div[1]/div[1]/div[1]/header[1]/div[1]/div[3]/div[1]/a[2]/div[1]/sb-avatar[1]/div[1]/div[1]/div[1]/span[1]")
    public WebElement guestIcon;
 //   (//div[contains(@class,'avatar') and text()=' G '])[2]")
    @FindBy(xpath="//h1[contains(text(),'Welcome to')]")
    public WebElement welcomeTitle;
    
    @FindBy(xpath="//div[contains(text(),'Teacher')]")
    public WebElement teacherIcon;
    
    @FindBy(xpath="//div[contains(text(),'Student')]")
    public WebElement studentIcon;
    
    @FindBy(xpath="//div[contains(text(),'Parent')]")
    public WebElement parentIcon;

    @FindBy(xpath="//div[contains(text(),'School head OR Officials')]")
    public WebElement schoolHeadIcon;
    
    @FindBy(xpath="//button[.=' Continue ']")
    public WebElement continueButton;
    
    @FindBy(xpath = "//div[@class='title']")
    public WebElement BMCWindowTitle;
    
    @FindBy(xpath="//span[contains(text(),'CBSE')]")
    public WebElement cbseNcertOption;
  
    @FindBy(xpath="//span[contains(text(),'NCF')]")
    public WebElement ncfOption;
    
    @FindBy(xpath="(//span[contains(text(),'English')])[2]")
    public WebElement englishOption;
    
    @FindBy(xpath="//mat-option[@aria-label=\"Class 1\"]")
    public WebElement class1Option;
    

    
    @FindBy(xpath=" (//span[contains(text(),'Uttar Pradesh')])")        // (//span[contains(text(),'Uttar Pradesh')])  //(//span[contains(text(),'Uttar Pradesh')])[2]
    public WebElement uttarPradeshSate;
    
    @FindBy(xpath="(//span[contains(text(),'Andhra Pradesh')])")
    public WebElement andhraPradeshSate;
    
    @FindBy(xpath="(//span[contains(text(),'Kerala')])")   //(//span[contains(text(),'Kerala')])   //(//span[contains(text(),'Kerala')])[2]"
    public WebElement keralaState;
    
    @FindBy(xpath="//a[text()=' Home ']")
    public WebElement homeButton;
    
    @FindBy(xpath = "//h5[contains(text(),' Register on')]")
    public WebElement registerTitle;
    
    @FindBy(xpath="//div[@id='error-summary']")
    public WebElement loginErorMessage;
    
    @FindBy(xpath ="//p[contains(text(),'Hi')]")
    public WebElement loginSuccess;
    
    @FindBy(xpath="//div[@id='fgtPortalFlow']")
    public WebElement forgotPasswordButton;
    
    @FindBy(xpath = "//div[text()='Recover Account']")
    public WebElement forgotPasswordTitle;
    
    @FindBy(xpath = "//button[@id='googleSignInBtn']")
    public WebElement signInWithGoogle;
    
    @FindBy(xpath = "//input[@type='email']")
    public WebElement emailIdToLogin;
    
    @FindBy(xpath = "//input[@type='password']")
    public WebElement emailPasswordToLogin;
    
    @FindBy(xpath = "//button[@id='stateButton']")
    public WebElement signInStateSystem;
    
    @FindBy(xpath = "//div[text()='Select your State']")
    public WebElement selectYourStateTitle;
    
    @FindBy(xpath = "//div[contains(@id,'select')]")
    ////div[@aria-label='Select State']
    public WebElement selectStateDropDownForLogin;
    
    @FindBy(xpath = "//span[text()='TN Staging SSO']")
    public WebElement TNStateForStateLogin;
    
    @FindBy(xpath="//span[text()='Preprod Client']")
    public WebElement preprodclientStateLogin;
    
    @FindBy(xpath = "//button[text()='Submit']")
    public WebElement submitButtonOnStateLogin;
    
    @FindBy(xpath = "//h2[text()='Diksha UAT SSO Login']")
    public WebElement dikshaUATLoginTitle;
    
    @FindBy(xpath = "//span[text()='Next']")
    public WebElement nextButton;
    
   // @FindBy(xpath = "//a[text()=' Home ']")
  //  public WebElement homeButton;
    
    @FindBy(xpath = "//input[@id='name']")
    public WebElement nameFieldOnLocationWindow;
    
    @FindBy(xpath = "(//div[contains(@class,'avatar')])[2]")
    public WebElement userProfileIcon;
    
    @FindBy(xpath = "//label[contains(@class,'sb-member__name')]")
    public WebElement userNameOnProfile;
    
    @FindBy(xpath = "//input[@title='Search or enter QR code']")
    public WebElement searchInputBox;
    
    @FindBy(xpath = "//button[text()='Search']")
    public WebElement serachButton;
    
    @FindBy(xpath = "//div[text()='Observation']")
    public WebElement serachedObservationTitle;
    
    @FindBy(xpath = "//div[@class='training-info']")
    public WebElement ObservationTitle;
    
    @FindBy(xpath = "////h4[@class='mb-4']")
    public WebElement Ot;
    
    @FindBy(xpath = "//p[.='Your Location']")
    public WebElement YourLocationPopUp;
    
    @FindBy(xpath = "//button[.='Clear ']")
    public WebElement click;
    
    @FindBy(xpath = "//div[@aria-label='undefined, selected ,Select State']")
    public WebElement stateDropdown;
    
    @FindBy(xpath = "(//button[.='Edit'])[1]")
    public WebElement edit;
    
    @FindBy(xpath = "(//sb-caret-down[@class='cfe-multiselect-field-caret caret-down ng-star-inserted'])[3]")
    public WebElement subroleDropdown;
    
    @FindBy(xpath = "//span[.='DEO']")
    public WebElement DEOsubrole;
    
    
    @FindBy(xpath = "//div[@aria-label='DEO, selected ,Select Subrole']")
    public WebElement DEOsubroleselectedbydefault;
  //div[@aria-label='DEO, selected ,Select Subrole']
    
    @FindBy(xpath = "//sb-caret-up[@class='cfe-multiselect-field-caret caret-down ng-star-inserted']")
    public WebElement subroleDropdownup;
  //sb-caret-up[@class='cfe-multiselect-field-caret caret-down ng-star-inserted']
    
    
  /*  @FindBy(xpath = "(//span[@class='cfe-multiselect-field-label ng-star-inserted'])[3]")
    public WebElement DEOsubrolealreadyselected;
  //.....##########nooo 
    public void abc() throws Exception {
    String deoselected = DEOsubrolealreadyselected.getText();
    if(deoselected.contains(" DEO"))
    	SikshaLokamClient.get().report().log(Status.INFO, "Already Selected DEO as Subrole");
    else
    	 SikshaLokamClient.get().gestures().click(subroleDropdown);
    JavascriptExecutor js = (JavascriptExecutor) SikshaLokamClient.get().driver();
    js.executeScript("arguments[0].scrollIntoView(true);", DEOsubrole);
	 SikshaLokamClient.get().gestures().click(DEOsubrole);
       SikshaLokamClient.get().report().log(Status.INFO, "Selected DEO as Subrole");
    }  */
 
    
    @FindBy(xpath = "//button[.='Submit ']")            ////button[.='Submit ']   //(//button[@type='submit'])[3]
    public WebElement submitbuttonpersonadetailspage;
    
    @FindBy(xpath = "//button[@aria-label='Back']")
    public WebElement backButton;
    
    @FindBy(xpath = "//div[@aria-label='Select Block']")
    public WebElement blockDropdown;
    
    @FindBy(xpath = "//span[.='ACHHNERA']")
    public WebElement AchhneraBlock;
    
    @FindBy(xpath = "//span[.='AGALI']")
    public WebElement AgaliBlock;
    
    
    //////////////
  
    
  
 
    
    ///html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/ng-component[1]/div[2]/div[1]/div[1]/section[2]/div[1]/div[4]/button[1]
}//span[.='AGALI']

