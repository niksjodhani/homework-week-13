package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {

    By welcomeText = By.xpath("//h1[contains(text(),'Register')]");
    By genderMale = By.xpath("//input[@id='gender-male']");
    By genderFeMale = By.xpath("//input[@id='gender-female']");
    By firstName = By.id("FirstName");
    By lastName = By.id("LastName");
    By dateOfBirthDay = By.xpath("//select[@name='DateOfBirthDay']");
    By dateOfBirthMonth = By.xpath("//select[@name='DateOfBirthMonth']");
    By DateOfBirthYear = By.xpath("//select[@name='DateOfBirthYear']");
    By email = By.id("Email");
    By company = By.id("Company");
    By password = By.id("Password");
    By confirmPassword = By.id("ConfirmPassword");
    By clickregisterbutton = By.xpath("//button[@id='register-button']");


    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void clickongendermale() {
        clickOnElement(genderMale);
    }

    public void clickongenderFeMale() {
        clickOnElement(genderFeMale);
    }

    public void enterfirstName(String text) {
        sendTextToElement(firstName, text);
    }

    public void enterlastName(String text) {
        sendTextToElement(lastName, text);
    }

    public void enterdateOfBirthDay(String text) {
        sendTextToElement(dateOfBirthDay, text);
    }

    public void enterdateOfBirthMonth(String text) {
        sendTextToElement(dateOfBirthMonth, text);
    }

    public void enterDateOfBirthYear(String text) {
        sendTextToElement(DateOfBirthYear, text);
    }

    public void enteremail(String text) {
        sendTextToElement(email, text);
    }

    public void entercompany(String text) {
        sendTextToElement(company, text);
    }

    public void enterpassword(String text) {
        sendTextToElement(password, text);
    }

    public void enterconfirmPassword(String text) {
        sendTextToElement(confirmPassword, text);
    }

    public void clickregisterbutton() {
        clickOnElement(clickregisterbutton);
    }
}