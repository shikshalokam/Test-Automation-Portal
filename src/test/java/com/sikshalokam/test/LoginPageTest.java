package com.sikshalokam.test;

import com.sikshalokam.annotation.Author;
import com.sikshalokam.pages.actions.LoginPageAction;
import com.sikshalokam.utils.gSheet.TestData;
import org.testng.annotations.Test;

import java.util.Map;

public class LoginPageTest {


    Map<String, String> loginTestData;

    public LoginPageAction getLoginPageActions() throws Exception {
        return new LoginPageAction();
    }

    @Test(description = "login to application with valid Credentials")
    @Author(name = "Sunil H N")
    public void loginToApplication() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        getLoginPageActions().clickOnExploreDiksha();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
    }

    @Test(description = "login to application with Invalid Credentials")
    @Author(name = "Sunil H N")
    public void loginToWithInvalidCredentails() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        getLoginPageActions().clickOnExploreDiksha();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("InValidPassword"));
        getLoginPageActions().clickOnLoginButton();
    }


    @Test(description = "Register An User")
    @Author(name = "Sunil H N")
    public void registerToAnApplication() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        getLoginPageActions().clickOnExploreDiksha();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().clickOnRegister();

    }


    @Test(description = "Verify Teacher Role")
    @Author(name = "Sunil H N")
    public void verifyTeacherRoleForLogin() throws Exception {
        getLoginPageActions().clickOnExploreDiksha();
        getLoginPageActions().selectTeacher();
        getLoginPageActions().selectBoard();
        getLoginPageActions().selectMedium();
        getLoginPageActions().selectClass();
        getLoginPageActions().clickOnSubmit();
        getLoginPageActions().enterName("");
        getLoginPageActions().selectState();
        getLoginPageActions().selectDistrict();
        getLoginPageActions().clickOnSubmit2();
        getLoginPageActions().clickOnUserIcon();


    }


    @Test(description = "Verify Observation Tile")
    @Author(name = "Sunil H N")
    public void VerifyObservationTile() throws Exception {
        getLoginPageActions().clickOnProfileIcon();
        getLoginPageActions().selectProfile();
        getLoginPageActions().selectRoleHTAndOffical();
        getLoginPageActions().clickOnSubmit();
        getLoginPageActions().clickOnProfileIcon();
        getLoginPageActions().selectTeacher();
        getLoginPageActions().ClickOnSubmit();
        getLoginPageActions().verifyObservationTile();
    }


}