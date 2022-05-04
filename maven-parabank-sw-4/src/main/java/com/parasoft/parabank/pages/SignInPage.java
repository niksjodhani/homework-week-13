package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;

import org.openqa.selenium.By;

public class SignInPage extends Utility {

    By signIn = By.linkText("Sign In");
    By errorMessage = By.xpath("//h1[@class='page__heading']");


    public void clickOnSignLink() {

        clickOnElement(signIn);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);


    }
}