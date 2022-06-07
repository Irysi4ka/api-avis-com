package com.avis.tests.ui;

import com.avis.pageobjects.MainPage;
import com.avis.pageobjects.SearchPanelPage;
import com.avis.pageobjects.SelectCarPage;
import com.avis.pageobjects.YourInformationPage;
import com.avis.utils.LocationCars;
import com.avis.utils.UserInformationReserve;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchCarTest extends AbstractTest {
    MainPage mainPage = new MainPage();
    SearchPanelPage searchPanelPage = new SearchPanelPage();
    SelectCarPage selectCarPage = new SelectCarPage();
    YourInformationPage yourInformationPage = new YourInformationPage();

    @Test(priority = 1)
    public void testSearchCar() {
        mainPage.openPage();
        searchPanelPage
                .fillPanelStartLocation()
                .fillPanelFinishLocation()
                .clickButtonSelectMyCar();
    }

    @Test(priority = 2)
    public void testPickUpAndReturn() {
        System.out.println("Pick-Up: \n" + selectCarPage.getTitleStartLocation() + "\n" + selectCarPage.getTitleStartDayAndTime());
        Assert.assertEquals(selectCarPage.getTitleStartLocation(), LocationCars.locationStart);
        Assert.assertEquals(selectCarPage.getTitleStartDayAndTime(), LocationCars.dayStart);

        System.out.println("Return: \n" + selectCarPage.getTitleFinishLocation() + "\n" + selectCarPage.getTitleFinishDayAndTime());
        Assert.assertEquals(selectCarPage.getTitleFinishLocation(), LocationCars.locationFinish);
        Assert.assertEquals(selectCarPage.getTitleFinishDayAndTime(), LocationCars.dayFinish);
    }

    @Test(priority = 3)
    public void testChooseCarAndRentalOption() throws InterruptedException {
        selectCarPage.clickButtonPayLater();
        selectCarPage.clickMenuProtectionsAndCoverages();
        selectCarPage.clickButtonCheckBox();
        Thread.sleep(5000);
        selectCarPage.clickButtonProceedToCheckout();
    }

    @Test(priority = 4)
    public void testReserve() throws InterruptedException {
        yourInformationPage.fillFormYourInformation(UserInformationReserve.FIRST_NAME,
                UserInformationReserve.LAST_NAME,
                UserInformationReserve.EMAIL,
                UserInformationReserve.NUMBER_PHONE);
        Thread.sleep(5000);
    }

}
