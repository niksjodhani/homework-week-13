package com.saucedemo.pages;

import com.saucedemo.utility.Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {

   By product= By.className("inventory_item");


    public int getVerifyProducts() {
        List<WebElement> item = driver.findElements(product);
        int actualresult = item.size();
        return actualresult;

    }}