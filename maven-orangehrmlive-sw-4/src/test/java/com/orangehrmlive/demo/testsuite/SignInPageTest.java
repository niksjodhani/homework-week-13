package com.orangehrmlive.demo.testsuite;

import com.orangehrmlive.demo.pages.ForgotPasswordPage;
import com.orangehrmlive.demo.pages.LoginPage;
import com.orangehrmlive.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInPageTest extends TestBase {

    LoginPage login = new LoginPage();
    ForgotPasswordPage forgot = new ForgotPasswordPage();

    @Test
    public void login() throws InterruptedException {
        login.enterEmailId("Admin");
        login.enterPassword("admin123");
        login.clickOnLoginButton();

        String expectedMessage = "Welcome";

        String actualMessage = login.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");

    }

    @Test
    public void userShouldNavigateToForgotPasswordPageSuccessfully() throws InterruptedException {
        forgot.clickOnForgotlink();
        String expectedMessage = "Forgot Your Password?";
        String actualMessage = login.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "not found page");

    }
}