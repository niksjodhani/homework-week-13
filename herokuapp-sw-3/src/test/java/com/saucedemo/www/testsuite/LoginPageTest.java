package com.saucedemo.www.testsuite;

import com.saucedemo.www.pages.pages.LoginPage;
import com.saucedemo.www.pages.pages.ProductPage;
import com.saucedemo.www.tastbase.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class LoginPageTest extends TestBase {


    LoginPage loginPage = new LoginPage();



    @Test
    public void verifyErrorMessageWithInvalidCredentials(){

        loginPage.enterEmailId("standard_user1");
        loginPage.enterPassword("secret_sauce1");
        loginPage.clickOnLoginButton();
        String expectedErrorMessage = "Epic sadface: Username and password do not match any user in this service";

        String actualErrorMessage = loginPage.getWrongErrorMessage();
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Error message not displayed");

    }
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {


        sendTextToElement(By.id("user-name"), "standard_user");
        sendTextToElement(By.id("password"), "secret_sauce");
        clickOnElement(By.id("login-button"));
       // asserties(By.xpath("//span[@class = 'title']"), "PRODUCTS", "error occurs");
        String expectedErrorMessage = "PRODUCTS";

        String actualErrorMessage = loginPage.getErrorMessage();
        Assert.assertEquals( expectedErrorMessage, actualErrorMessage,"Error message not displayed");
    }
    @Test
    public void verifyThatSixProductsAreDisplayedOnPage() {
        ProductPage Productspage=new ProductPage();
        sendTextToElement(By.id("user-name"), "standard_user");
        sendTextToElement(By.id("password"), "secret_sauce");
        clickOnElement(By.id("login-button"));
        int expectedResult =6;
        int actualResult = Productspage.getVerifyProducts();
        Assert.assertEquals(actualResult,expectedResult,"error");
    }

}