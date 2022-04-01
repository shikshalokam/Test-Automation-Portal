package com.sikshalokam.pages.actions;

import com.aventstack.extentreports.Status;
import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.objects.LoginPageObjects;
import org.openqa.selenium.support.PageFactory;

public class LoginPageAction {


    LoginPageObjects loginPageObjects;

    public LoginPageAction() throws Exception {
        loginPageObjects = PageFactory.initElements(SikshaLokamClient.get().driver(), LoginPageObjects.class);
    }

    // switch to webview for inspect elements
    public void switchToWebView() throws Exception {
        Thread.sleep(5000);

    }

    public void clickOnGuest() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.profile);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Guest");
    }

    public void clickOnLogin() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.login);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Login");
    }

    public void clickOnRegister() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.registerButton);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Register");
    }

    // enter user name to field.
    public void enterUserName(String userName) throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.userName);
        SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects.userName, userName);
    }

    // enter password to field.
    public void enterPassword(String password) throws Exception {
        // SikshaLokamClient.get().gestures().click(loginPageObjects.);
        //     SikshaLokamClient.get().gestures().sendValueToTextBox(loginPageObjects., password);
    }

    public void clickOnLoginButton() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.loginButton);

    }

    public void verifyHomePage() throws Exception {
        //     SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.welcomeTitle);
    }


    public void clickOnHeadTeacherOption() throws Exception {
        //    SikshaLokamClient.get().gestures().click(loginPageObjects.headTeacherOption);
        SikshaLokamClient.get().report().log(Status.FAIL, "");
    }

    public void clickOnLoginWithDikshaOption() throws Exception {
        //  SikshaLokamClient.get().gestures().click(loginPageObjects.loginWithDiksha);

    }

    public void clickOnExploreDiksha() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.exploreDiksha);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Explore Diksha");
    }

    public void selectTeacher() throws Exception {
        SikshaLokamClient.get().report().log(Status.INFO, "Select Teacher");
    }

    public void selectBoard() throws Exception {
        SikshaLokamClient.get().report().log(Status.INFO, "Select Board");
    }

    public void selectMedium() throws Exception {
        SikshaLokamClient.get().report().log(Status.INFO, "Select Medium");
    }

    public void selectClass() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.selectClass);
        SikshaLokamClient.get().report().log(Status.INFO, "Select Class");
    }

    public void clickOnSubmit() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.submit);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Submit");
    }

    public void enterName(String name) throws Exception {
        SikshaLokamClient.get().report().log(Status.INFO, "Entered Name as " + name);
    }

    public void selectState() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.selectState);
        SikshaLokamClient.get().gestures().click(loginPageObjects.firstDistrict);
        SikshaLokamClient.get().report().log(Status.INFO, "Select State");
    }

    public void selectDistrict() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.selectDistrict);
        SikshaLokamClient.get().gestures().click(loginPageObjects.firstDistrict);
        SikshaLokamClient.get().report().log(Status.INFO, "Select District");
    }

    public void clickOnSubmit2() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.submit);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Submit");
    }

    public void clickOnUserIcon() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.profile);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on User Icon");
    }

    public void clickOnProfileIcon() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.profile);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on User Icon");

    }

    public void ClickOnSubmit() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.submit);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Submit");
    }

    public void selectProfile() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.profile);
        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on User Icon");

    }

    public void selectRoleHTAndOffical() throws Exception {
        SikshaLokamClient.get().gestures().click(loginPageObjects.schoolHeadOROfficial);
        SikshaLokamClient.get().report().log(Status.INFO, "select Role as HT & Official");
    }

    public void verifyObservationTile() {
        SikshaLokamClient.get().gestures().isDisplayed(loginPageObjects.observations);
    }
}
