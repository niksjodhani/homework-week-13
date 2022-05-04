package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DesktopPage extends Utility {

    By zToA = By.id("products-orderby");
    By zToAText = By.xpath("//select[@id='products-orderby']//option[3]");
    By aToZ = By.id("products-orderby");
    By buildYourComputer = By.xpath("//button[@onclick='return AjaxCart.addproducttocart_catalog" +
            "(\"/addproducttocart/catalog/1/1/1\"),!1']");


    public void selectZtoA(){
        selectByVisibleTextFromDropDown(zToA, "Price: Low to High");
    }

    public String getZtoAText(){
        return getTextFromElement(zToAText);
    }

    public void selectAtoZ(){
        selectByVisibleTextFromDropDown(aToZ, "Name: A to Z");
    }

    public void selectBuildYourComputer() {
        mouseHoverToElementAndClick(buildYourComputer);
    }
}