package com.cicekSepeti.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void checkSifremiUnuttum() throws InterruptedException {
        driver.findElement(By.xpath("//a[@class='login__forgot-password js-forgot-password']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@class='form-control js-placeholder js-password-recovery-input']")).sendKeys("deneme@deneme.com");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary form-password-recovery__btn js-password-recovery-button']")).click();
        Thread.sleep(1000);
        Assert.assertTrue("",driver.findElement(By.xpath("//div[@class='password-recovery-result js-password-recovery-result is-hidden is-visible']")).isDisplayed());

    }
}
