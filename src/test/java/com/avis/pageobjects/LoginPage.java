package com.avis.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//input[@id='username']")
    public WebElement inputUserName;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[@id='res-login-profile']")
    public WebElement buttonLogIn;

    @FindBy(id = "otp_submit")
    public WebElement buttonVerification;

    public LoginPage typeUserNameAndPassword(String userName, String password) {
        inputUserName.clear();
        inputUserName.sendKeys(userName);
        inputPassword.clear();
        inputPassword.sendKeys(password);
        return this;
    }

    public LoginPage clickButtonLogIn() {
        buttonLogIn.click();
        return this;
    }

    public LoginPage clickButtonVerification(){
        buttonVerification.click();
        return this;
    }

}
