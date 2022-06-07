package com.avis.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SelectCarPage extends BasePage {

    @FindBy(xpath = "//div[@class='col-sm-6 col-md-4 source']//div[@class='location-info']")
    private WebElement titleStartLocation;

    @FindBy(xpath = "//div[@class='col-sm-6 col-md-4 source']//div[@class='day-time-info']")
    private WebElement titleStartDayAndTime;

    @FindBy(xpath = "//div[@class='col-sm-6 col-md-4 destination hidden-xs']//div[@class='location-info']")
    private WebElement titleFinishLocation;

    @FindBy(xpath = "//div[@class='col-sm-6 col-md-4 destination hidden-xs']//div[@class='day-time-info']")
    private WebElement titleFinishDayAndTime;

    @FindBy(xpath = "(//a[@id='res-vehicles-pay-later'])[1]")
    private WebElement buttonPayLater;

    @FindBy(xpath = "//button[@class='btn btn-primary-avis pull-right']")
    private WebElement buttonProceedToCheckout;

    @FindBy(xpath = "//a[@id='Step3-Protections & Coverages']")
    private WebElement menuProtectionsAndCoverages;

    @FindBy(xpath = "//div[@class='list-item-right']//input[@id='ALIchk']")
    private WebElement buttonCheckBox;

    WebElement dynamicElement;

    public String getTitleStartLocation() {
        return titleStartLocation.getText();
    }

    public String getTitleStartDayAndTime() {
        return titleStartDayAndTime.getText();
    }

    public String getTitleFinishLocation() {
        return titleFinishLocation.getText();
    }

    public String getTitleFinishDayAndTime() {
        return titleFinishDayAndTime.getText();
    }

    public SelectCarPage clickButtonPayLater() {
        buttonPayLater.click();
        return this;
    }

    public SelectCarPage clickMenuProtectionsAndCoverages() {
        menuProtectionsAndCoverages.click();
        return this;
    }

    public SelectCarPage clickButtonCheckBox() {
        buttonCheckBox.click();
        return this;
    }

    public SelectCarPage clickButtonProceedToCheckout() {
        buttonProceedToCheckout.click();
        return this;
    }

}
