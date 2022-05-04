package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By emailField = By.xpath("//div[@class='login']//input[@name='username']");
    By passwordField = By.xpath("//div[@class='login']//input[@name='password']");
    By loginButton = By.xpath("//input[@class='button']");
    By errorMessage = By.xpath("//h2[contains(text(),'Customer Login')]");
    By emptyerrorMessge = By.xpath("//p[contains(text(),'Please enter a username and password.')]");
    By ragisterclick = By.xpath("//a[contains(text(),'Register')]");


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

    public String getEmptyErrorMessage() {
        return getTextFromElement(emptyerrorMessge);
    }

    public void clickOnRagister() {
        clickOnElement(ragisterclick);
    }

}


