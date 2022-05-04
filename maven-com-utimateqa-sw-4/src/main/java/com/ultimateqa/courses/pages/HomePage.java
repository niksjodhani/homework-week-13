package com.ultimateqa.courses.pages;

import com.ultimateqa.courses.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By signIn = By.linkText("Sign In");
    By errorMessage = By.xpath("//h1[@class='page__heading']");


    public void clickOnSignLink() {

        clickOnElement(signIn);
    }

    public String getErrorMessage() {
        return getTextFromElement(errorMessage);


    }
}
