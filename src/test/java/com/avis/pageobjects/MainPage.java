package com.avis.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//li[@class='mob-nav-menu']/a[@id='res-login-profile']")
    private WebElement buttonLogin;

    public MainPage openPage() {
        driver.get(BASE_URL);
        return this;
    }

    public MainPage clickButtonLogin() {
        buttonLogin.click();
        return this;
    }

}
