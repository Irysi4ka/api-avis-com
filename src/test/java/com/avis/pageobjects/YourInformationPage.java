package com.avis.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class YourInformationPage extends BasePage {

    @FindBy(id = "firstname")
    private WebElement inputFirstName;

    @FindBy(id = "lastname")
    private WebElement inputLastName;

    @FindBy(id = "email")
    private WebElement inputEmail;

    @FindBy(id = "phone")
    private WebElement inputNumberPhone;

    @FindBy(id = "submit_button")
    private WebElement buttonReserve;

    @FindBy(xpath = "//input[@message-id='errTermsCheck']")
    private WebElement buttonCheckBoxAgree;

    public YourInformationPage fillFormYourInformation(String firstName, String lastName, String email, String numberPhone) {
        inputFirstName.sendKeys(firstName);
        inputLastName.sendKeys(lastName);
        inputEmail.sendKeys(email);
        inputNumberPhone.sendKeys(numberPhone);
        buttonCheckBoxAgree.click();
        //buttonReserve.click();
        return this;
    }

}
