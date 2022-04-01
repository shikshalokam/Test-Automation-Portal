package com.sikshalokam.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageObjects {


    @FindBy(xpath = "(//button[contains(.,'Explore Diksha')])[1]")
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
    public WebElement gradeLevel;


    @FindBy(xpath = "//*[@id=\"medium\"]")
    public WebElement medium;


//(//*[@class="menu transition hidden"]//sui-select-option)[2]

    @FindBy(xpath = "//span[contains(.,'IGOT-Health')]")
    public WebElement IGOT_Health;


    @FindBy(xpath = "//span[contains(.,'English')]")
    public WebElement english;

    //

    @FindBy(xpath = "//div[@aria-label='Select Class']")
    public WebElement  selectClass;

    @FindBy(xpath = "(//span[contains(.,'School head OR Officials')])[1]")
    public WebElement  schoolHeadOROfficial;

    @FindBy(xpath = "//div[@aria-label='Select State']")
    public WebElement  selectState;

    @FindBy(xpath = "(//div[contains(@tabindex,'0')])[9]")
    public WebElement  andamanNicobarIsland;

    @FindBy(xpath = "//div[@aria-label='Select District']")
    public WebElement  selectDistrict;

    @FindBy(xpath = "(//div[@tabindex='0'])[88]")
    public WebElement  firstDistrict;

    @FindBy(xpath = "//button[contains(.,'Submit')]")
    public WebElement  submit;

    @FindBy(xpath = "//button[contains(.,'Clear')]")
    public WebElement  clear;

    @FindBy(xpath = "//input[@placeholder='Enter Name']")
    public WebElement  EnterName;



}