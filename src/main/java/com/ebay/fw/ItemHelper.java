package com.ebay.fw;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ItemHelper extends BaseHelper {
    public ItemHelper(WebDriver driver) {
        super(driver);
    }

    public String getItemName(String number) {
        return driver.findElement(By.cssSelector(".s-item:nth-child(" + number + ") h3")).getText();
    }

    public void fillSearchBar(String item) {
        type(By.id("gh-ac"),item);
        click(By.id("gh-btn"));
    }

    public String getFirstItemName(String firstItem) {
        return driver.findElement(By.xpath("//ul/li/div/div["+firstItem+"]/a/div/span")).getText();
    }
}

