package com.cicekSepeti.tests;

import com.cicekSepeti.pages.HomePage;
import com.cicekSepeti.pages.ResultPage;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import java.nio.file.Watchable;

public class TestCasesTwo extends BaseTest {
    @Test
    public void newPageLoaded() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.closeInfoBoxes();// Pop-Up'ların kapatılması
        ResultPage resultPage = homePage.searchItem(); // Ürün arama
        resultPage.checkControlPageLoaded(); // yeteri kadar scroll yaıldığında 2. sayfa yükleniyor ve URL de gözüküyor mu?
    }

}
