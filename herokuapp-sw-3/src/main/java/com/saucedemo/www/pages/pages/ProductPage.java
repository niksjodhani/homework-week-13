package com.saucedemo.www.pages.pages;

import com.saucedemo.www.utility.Utility;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ProductPage extends Utility {


    public int getVerifyProducts() {
        List<WebElement> item = driver.findElements(By.className("inventory_item"));
        int actualresult = item.size();
        return actualresult;

    }

    }

