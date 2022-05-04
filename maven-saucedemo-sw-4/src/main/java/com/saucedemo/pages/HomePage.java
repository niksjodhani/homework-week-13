package com.saucedemo.pages;


import com.saucedemo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By username = By.id("user-name");
    By passwords = By.id("password");
    By signIn = By.id("login-button");
    By errorMessage = By.xpath("//span[@class = 'title']");


    public void clickOnlogin() {

        clickOnElement(signIn);
    }

    public void enterUserName(String name) {
        sendTextToElement(username, name);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwords, password);
    }


    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }


    }

