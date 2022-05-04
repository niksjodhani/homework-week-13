package com.saucedemo.testsuite;

import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.ProductPage;
import com.saucedemo.testbase.TestBase;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testsuite extends TestBase {

    HomePage homePage = new HomePage();
    ProductPage product = new ProductPage();


    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {

        homePage.enterUserName("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.clickOnlogin();
        String expectedMessage = "PRODUCTS";
        String actualMessage = homePage.getErrorMessage();
        Assert.assertEquals(expectedMessage, actualMessage, "Error occured");


    }

    @Test

    public void veryfyProduct() {
        homePage.enterUserName("standard_user");
        homePage.enterPassword("secret_sauce");
        homePage.clickOnlogin();
        int expectedResult = 6;
        int actualResult = product.getVerifyProducts();
        Assert.assertEquals(actualResult, expectedResult, "error");
    }
}