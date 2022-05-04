package com.orangehrmlive.demo.pages;

import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;

public class ForgotPasswordPage extends Utility {
    By forgotlink = By.xpath("//a[contains(text(),'Forgot your password?')]");
    By errorMessage = By.tagName("h1");

    public void clickOnForgotlink() {

        clickOnElement(forgotlink);
    }
    public String getErrorMessage() {
        return getTextFromElement(errorMessage);
    }
}
