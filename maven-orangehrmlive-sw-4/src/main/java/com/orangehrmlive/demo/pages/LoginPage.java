package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;

import dev.failsafe.internal.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[@class='page__heading']");
    By emailField = By.id("txtUsername");
    By passwordField = By.name("txtPassword");
    By loginButton = By.xpath("//input[@class='button']");
    By errorMessage = By.id("welcome");


    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterEmailId(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
    }

    public String getErrorMessage() {

        WebElement actualText1 = driver.findElement(errorMessage);
        String actualText = actualText1.getText();
        String actualTextFinal = actualText.substring(0, 7);
        return actualTextFinal;
    }
}