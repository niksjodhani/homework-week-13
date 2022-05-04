package com.parasoft.parabank.testsuite;


import com.parasoft.parabank.pages.HomePage;
import com.parasoft.parabank.pages.RegisterPage;
import com.parasoft.parabank.pages.SignInPage;
import com.parasoft.parabank.testbase.TestBase;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPage extends TestBase {

    HomePage homePage = new HomePage();
    SignInPage sign = new SignInPage();
    RegisterPage ragister = new RegisterPage();

    @Test
    public void verifyThatSigningUpPageDisplay() {
        homePage.enterEmailId("Ramesh123");
        homePage.enterPassword("123456");
        homePage.clickOnLoginButton();
        String expectedMessage = "Customer Login";
        String actualMessage = homePage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "not found it means you are not log in");

        // Verify the ‘Accounts Overview’ text is display
        //  asserties(By.xpath("//a[contains(text(),'Accounts Overview')]"), "Accounts Overview", "not found it means you are not log in");

    }

    @Test
    public void verifyTheErrorMessage() {
        homePage.enterEmailId("Ramesh123");
        homePage.enterPassword("123456");
        homePage.clickOnLoginButton();
        String expectedMessage = "The username and password could not be verified.";
        String actualMessage = homePage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "not found it means you are not log in");
    }

    @Test
    public void verifyTheEmptyfieldErrorMessage() {
        homePage.enterEmailId("Ramesh123");
        homePage.enterPassword("");
        homePage.clickOnLoginButton();
        String expectedMessage = "Please enter a username and password.";
        String actualMessage = homePage.getEmptyErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "not found it means you are not log in");


    }

    @Test
    public void userShouldRegisterAccountSuccessfully() {
        homePage.clickOnRagister();
        String expectedMessage = "Signing up is easy!";
        String actualMessage = ragister.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "not found it means you are not in Registerpage");

        ragister.enterfirstname("Ramesh");
        ragister.enterlastName("kothari");
        ragister.enteraddress("wembley");
        //  Enter City
        ragister.enterstate("london");
        //	* Enter State
        ragister.enterstate("United kingdom");
        //	* Enter Zip Code
        ragister.enterzipCode("HA96KC");
        //  * Enter Phone
        ragister.enterphoneNumber("07777788888");
        //  * Enter SSN
        ragister.enterssn("123456789");
        //  * Enter Username

        ragister.enterusernameId("Ramesh123");
        // * Enter Password

        ragister.enterpassword("123456");
        //  * Enter Confirm

        ragister.enterconfirmpassword("123456");

        ragister.clickOnRegisterButton();
        //  * Click on REGISTER button
//        String expectedMessage1= "Welcome";
//
//        String actualMessage1 = ragister.getWellcomeErrorMessage();
//        Assert.assertEquals(expectedMessage1, actualMessage1, "Login page not displayed");
//        //  * Verify the text 'Your account was created successfully. You are now logged in.’


    }


    }

