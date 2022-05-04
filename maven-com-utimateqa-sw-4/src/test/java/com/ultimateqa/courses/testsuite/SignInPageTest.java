package com.ultimateqa.courses.testsuite;

import com.ultimateqa.courses.pages.HomePage;
import com.ultimateqa.courses.pages.SignInPage;
import com.ultimateqa.courses.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignInPageTest extends TestBase {

    HomePage homePage = new HomePage();
    SignInPage sign = new SignInPage();

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {

        homePage.clickOnSignLink();
        String expectedMessage = "Welcome Back!";
        String actualMessage = homePage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void verifyTheErrorMessage() {
        homePage.clickOnSignLink();
        sign.enterEmailId("abc@gmail.com");
        sign.enterPassword( "abc@gmail.com");
        sign.clickOnLoginButton();
        String expectedMessage = "Invalid email or password.";
        String actualMessage = sign.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Error occured");


    }

}