package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class SignInPage extends Utility {

    By welcomeText = By.xpath("//h1[@class='page__heading']");
    By emailField = By.id("user[email]");
    By passwordField = By.name("user[password]");
    By loginButton = By.xpath("//input[@type='submit']");
    By errorMessage = By.xpath("//li[@class='form-error__list-item']");


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
        return getTextFromElement(errorMessage);
    }

}