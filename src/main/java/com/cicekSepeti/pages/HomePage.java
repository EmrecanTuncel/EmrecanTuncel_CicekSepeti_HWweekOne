package com.cicekSepeti.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class HomePage {

    By searchBox = (By.className("js-product-search-input"));
    By infoBox1 = (By.className("js-subheader-close"));
    By infoBox2 = (By.className("js-policy-close"));

    WebDriver driver;
    public HomePage (WebDriver driver)  {this.driver = driver;}
    public void closeInfoBoxes(){
        driver.findElement(infoBox1).click();
        driver.findElement(infoBox2).click();
    }
    public ResultPage searchItem(){
        driver.findElement(searchBox).sendKeys("saksı", Keys.ENTER);
        return new ResultPage(driver);
    }
}
