package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]");
    By email = By.id("Email");
    By password = By.id("Password");
    By clickLogInbutton = By.xpath("//button[@class='button-1 login-button']");
    By clickLogOutbutton = By.xpath("//div[@class='header-links']//a[@href='/logout']");
    By loginVerify = By.xpath("//div[@class='header-links']//a[@href='/logout']");

    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public String verifyLogin() {
        return getTextFromElement(loginVerify);
    }

    public void enteremail(String text) {
        sendTextToElement(email, text);
    }

    public void enterpassword(String text) {
        sendTextToElement(password, text);
    }

    public void clickonLoginbutton() {
        clickOnElement(clickLogInbutton);
    }

    public void clickonLogOutbutton() {
        clickOnElement(clickLogOutbutton);
    }
}