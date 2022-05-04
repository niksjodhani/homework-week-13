package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    By navigatetoRegister = By.linkText("Register");
    By navigatetologin = By.linkText("Log in");
    By navigateToComputerPage = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/computers']");
    By navigateToElectronicsPage = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/electronics']");
    By navigateToApparelPage = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/apparel']");
    By navigateToDigitaldownloadsPage = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/digital-downloads']");
    By navigateToBooksPage = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/books']");
    By navigateToJewelryPage = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/jewelry']");
    By navigateToGiftCardsPage = By.xpath("//ul[@class='top-menu notmobile']//a[@href='/gift-cards']");
    By errorMessage = By.xpath("//div[@class='page-title']");


    public void clickOnRegisterLink() {

        clickOnElement(navigatetoRegister);
    }

    public void clickOnnavigatetologin() {

        clickOnElement(navigatetologin);
    }

    public void clickOnnavigateToElectronicsPage() {

        clickOnElement(navigateToElectronicsPage);
    }

    public void clickOnnavigateToApparelPage() {

        clickOnElement(navigateToApparelPage);
    }

    public void clickOnnavigateToDigitaldownloadsPage() {

        clickOnElement(navigateToDigitaldownloadsPage);
    }

    public void  clickOnavigateToBooksPage() {

        clickOnElement(navigateToBooksPage);
    }

    public void clickOnnavigateToJewelryPage() {

        clickOnElement(navigateToJewelryPage);
    }

    public void clickOnnavigateToGiftCardsPage() {

        clickOnElement(navigateToGiftCardsPage);
    }

    public void clickOnnavigateToComputerPage() {

        clickOnElement(navigateToComputerPage);
    }


    public String getErrorMessage() {
        return getTextFromElement(errorMessage);


    }
}
