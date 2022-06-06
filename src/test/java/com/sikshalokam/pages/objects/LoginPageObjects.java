package com.sikshalokam.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;

public class LoginPageObjects {


    @FindBy(xpath = "(//button[contains(text(),'Explore DIKSHA')])[1]")
    public WebElement exploreDiksha;

    @FindBy(xpath = "//a[contains(.,'Login')]")
    public WebElement login;

    @FindBy(xpath = "//a[contains(.,'Observations')]")
    public WebElement observations;

    @FindBy(xpath = "//li[@class='list-item'][contains(.,'Help')]")
    public WebElement help;

    @FindBy(xpath = "//span[contains(.,'Switch to classic theme')]")
    public WebElement switchToClassicTheme;

    @FindBy(xpath = "//li[contains(.,'Profile')]")
    public WebElement profile;

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
    
    @FindBy(xpath = "//div[@tabindex='0']//span[text()='Anantapur']")
    public WebElement ananthpurDistrict;
    
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
    @FindBy(xpath="(//div[contains(@class,'avatar') and text()=' G '])[2]")
    public WebElement guestIcon;
    
    @FindBy(xpath="//h1[contains(text(),'Welcome to sunbird')]")
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
    
    @FindBy(xpath="(//span[contains(text(),'English')])[2]")
    public WebElement englishOption;
    
    @FindBy(xpath="//span[contains(text(),'Class1')]")
    public WebElement class1Option;
    
    @FindBy(xpath = "//div[@aria-label='Select State']")
    public WebElement  selectStateDropdown;
    
    @FindBy(xpath="//span[contains(text(),'Uttar Pradesh')]")
    public WebElement uttarPradeshSate;
    
    @FindBy(xpath="//span[contains(text(),'Andhra Pradesh')]")
    public WebElement andhraPradeshSate;
    
    @FindBy(xpath="//a[text()=' Home ']")
    public WebElement homeButton;
    
    @FindBy(xpath = "//h2[contains(text(),' Register on')]")
    public WebElement registerTitle;
    
    @FindBy(xpath="//div[@id='error-summary']")
    public WebElement loginErorMessage;
    
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
    
}

