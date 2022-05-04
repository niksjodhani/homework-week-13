package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.RegisterPage;
import com.nopcommerce.demo.testbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSuite extends TestBase {

    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    LoginPage loginpage = new LoginPage();

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {

        homePage.clickOnnavigateToComputerPage();
        String expectedMessage = "Computers";
        String actualMessage = homePage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {

        homePage.clickOnnavigateToElectronicsPage();
        String expectedMessage = "Electronics";
        String actualMessage = homePage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {

        homePage.clickOnnavigateToApparelPage();
        String expectedMessage = "Apparel";
        String actualMessage = homePage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void userShouldNavigateToDigitaldownloadsPageSuccessfully() {

        homePage.clickOnnavigateToDigitaldownloadsPage();
        String expectedMessage = "Digital downloads";
        String actualMessage = homePage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {

        homePage.clickOnavigateToBooksPage();
        String expectedMessage = "Books";
        String actualMessage = homePage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {

        homePage.clickOnnavigateToJewelryPage();
        String expectedMessage = "Jewelry";
        String actualMessage = homePage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {

        homePage.clickOnnavigateToGiftCardsPage();
        String expectedMessage = "Gift Cards";
        String actualMessage = homePage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void userRegisterverification() {
        homePage.clickOnRegisterLink();
        String expectedMessage = "Register";
        String actualMessage = registerPage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "register page not displayed");
        registerPage.clickongendermale();
        registerPage.enterfirstName("prime");
        registerPage.enterlastName("Testing");
        registerPage.enterdateOfBirthDay("28");
        registerPage.enterdateOfBirthMonth("08");
        registerPage.enterDateOfBirthYear("1990");
        registerPage.enteremail("prime123456@gmail.com");
        registerPage.entercompany("primetesting");
        registerPage.enterpassword("123456@");
        registerPage.enterconfirmPassword("123456@");
        registerPage.clickregisterbutton();

    }

    @Test
    public void navigateToLogin() {
        homePage.clickOnnavigatetologin();
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = loginpage.getWelcomeText();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");
    }

    @Test
    public void loginverify() {
        homePage.clickOnnavigatetologin();
        loginpage.enteremail("prime123456@gmail.com");
        loginpage.enterpassword("123456@");
        loginpage.clickonLoginbutton();
        String expectedMessage = "Log out";
        String actualMessage = loginpage.verifyLogin();
        Assert.assertEquals(expectedMessage, actualMessage, "Login page not displayed");


    }

    @Test
    public void logout() {
        homePage.clickOnnavigatetologin();
        loginpage.enteremail("prime123456@gmail.com");
        loginpage.enterpassword("123456@");
        loginpage.clickonLoginbutton();
        loginpage.clickonLogOutbutton();
       

    }
}





