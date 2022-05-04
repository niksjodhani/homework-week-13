package com.parasoft.parabank.pages;

import com.parasoft.parabank.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterPage extends Utility {
    By welcomeText = By.xpath("//h1[contains(text(),'Signing up is easy!')]");
    By firstname = By.id("customer.firstName");
    By lastName = By.id("customer.lastName");
    By address = By.id("customer.address.street");
    By city = By.id("customer.address.city");
    By state = By.id("customer.firstName");
    By zipCode = By.id("customer.address.zipCode");
    By phoneNum = By.id("customer.phoneNumber");
    By ssn = By.id("customer.ssn");
    By username = By.id("customer.username");
    By password = By.id("customer.password");
    By confirm = By.id("repeatedPassword");
    By clickragister = By.xpath("//table[@class='form2']//input[@type='submit']");
    By welcomeregisterpage = By.xpath("//h1[@class='title']");
   // By errorMessage = By.xpath("//p[contains(text(),'An internal error has occurred and has been logged')]");


    public String getWelcomeText() {
        return getTextFromElement(welcomeText);
    }

    public void enterfirstname(String name) {
        sendTextToElement(firstname, name);
    }

    public void enterlastName(String name) {
        sendTextToElement(lastName, name);
    }

    public void enteraddress(String add) {
        sendTextToElement(address, add);
    }

    public void entercity(String cityname) {
        sendTextToElement(city, cityname);
    }

    public void enterstate(String statename) {
        sendTextToElement(state, statename);
    }

    public void enterzipCode(String zipCodenumber) {
        sendTextToElement(zipCode, zipCodenumber);
    }

    public void enterphoneNumber(String phoneNumber) {
        sendTextToElement(phoneNum, phoneNumber);
    }

    public void enterssn(String ssnnumber) {
        sendTextToElement(ssn, ssnnumber);
    }

    public void enterusernameId(String useridname) {
        sendTextToElement(username, useridname);
    }

    public void enterpassword(String pass) {
        sendTextToElement(password, pass);
    }

    public void enterconfirmpassword(String password) {
        sendTextToElement(confirm, password);
    }

    public void clickOnRegisterButton() {
        clickOnElement(clickragister);
    }


    public String getWellcomeErrorMessage() {

        WebElement actualText1 = driver.findElement(welcomeregisterpage);
        String actualText = actualText1.getText();
        String actualTextFinal = actualText.substring(0, 7);
        return actualTextFinal;
    }

}
