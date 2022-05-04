
package com.saucedemo.www.pages.pages;


import com.saucedemo.www.utility.Utility;
import org.openqa.selenium.By;


public class LoginPage extends Utility {

    By welcomeText = By.xpath("//body/div[@id='root']/div[1]/div[1]");
    By emailField = By.xpath("//input[@id='user-name']");
    By passwordField = By.xpath("//input[@id='password']");
    By loginButton = By.xpath("//input[@id='login-button']");
    By wrongerrorMessage = By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]");
    By errorMessage = By.xpath("//span[@class = 'title']");


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

    public String getWrongErrorMessage() {
        return getTextFromElement(wrongerrorMessage);
    }

}