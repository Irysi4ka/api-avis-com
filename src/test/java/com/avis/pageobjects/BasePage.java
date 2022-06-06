package com.avis.pageobjects;

import com.avis.driver.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected final static String BASE_URL = "https://www.avis.com";
    public WebDriver driver;

    public BasePage() {
        this.driver = DriverSingleton.getDriver();
        PageFactory.initElements(this.driver, this);
    }
}
