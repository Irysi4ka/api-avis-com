package com.avis.pageobjects;

import com.avis.utils.DateFromAndTo;
import com.avis.utils.LocationCars;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class SearchPanelPage extends BasePage {

    @FindBy(xpath = "//div[@class='col-lg-12 res-inputFldFst']//input[@id='PicLoc_value']")
    private WebElement inputStartLocation;

    @FindBy(xpath = "//div[@class='col-xs-12 res-inputFldFst']//input[@id='DropLoc_value']")
    private WebElement inputFinishLocation;

    @FindBy(xpath = "//div[@class='col-xs-3 res-inputFld dateImg']//input[@id='from']")
    private WebElement inputDateFrom;

    @FindBy(xpath = "//div[@class='col-xs-3 res-inputFld dateImg']//input[@id='to']")
    private WebElement inputDateTo;

    @FindBy(xpath = "//div[@class='col-xs-3 res-inputFld res-hideSelect']//select[@name='reservationModel.pickUpTime']")
    private WebElement inputStartTime;

    @FindBy(xpath = "//div[@class='col-xs-3 res-inputFld res-hideSelect']//select[@name='reservationModel.dropTime']")
    private WebElement inputFinishTime;

    @FindBy(xpath = "//div[@class='col-lg-12 res-inputFldFst']//option[@label='9:00 AM']")
    private WebElement selectStartTime;

    @FindBy(xpath = "//div[@class='col-xs-12 res-inputFldFst']//option[@label='10:00 AM']")
    private WebElement selectFinishTime;

    @FindBy(id = "res-home-select-car")
    private WebElement buttonSelectMyCar;

    @FindBy(xpath = "(//a[@class='btn btn-red'])[1]")
    private WebElement buttonSelectThisLocation;

    public SearchPanelPage fillPanelStartLocation() {
        inputStartLocation.clear();
        inputStartLocation.sendKeys(LocationCars.locationOne);
        inputDateFrom.clear();
        inputDateFrom.sendKeys(DateFromAndTo.dateFrom);
        inputStartTime.click();
        selectStartTime.click();
        return this;
    }

    public SearchPanelPage fillPanelFinishLocation() {
        inputFinishLocation.clear();
        inputFinishLocation.sendKeys(LocationCars.locationOne);
        inputDateTo.clear();
        inputDateTo.sendKeys(DateFromAndTo.dateTo);
        inputFinishTime.click();
        selectFinishTime.click();
        return this;
    }

    public SearchPanelPage clickButtonSelectMyCar(){
        buttonSelectMyCar.click();
        return this;
    }

    public SearchPanelPage clickButtonSelectThisLocation(){
        buttonSelectThisLocation.click();
        return this;
    }

}
