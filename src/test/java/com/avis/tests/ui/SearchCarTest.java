package com.avis.tests.ui;

import com.avis.pageobjects.MainPage;
import com.avis.pageobjects.SearchPanelPage;
import com.avis.pageobjects.SelectCarPage;
import com.avis.utils.LocationCars;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchCarTest extends AbstractTest {
    MainPage mainPage = new MainPage();
    SearchPanelPage searchPanelPage = new SearchPanelPage();
    SelectCarPage selectCarPage = new SelectCarPage();

    @Test(priority = 4)
    public void testSearchCar() {
        mainPage.openPage();
        searchPanelPage
                .fillPanelStartLocation()
                .fillPanelFinishLocation()
                .clickButtonSelectMyCar();
    }

    @Test(priority = 5)
    public void testPickUpAndReturn() {
        System.out.println("Pick-Up: \n" + selectCarPage.getTitleStartLocation() + "\n" + selectCarPage.getTitleStartDayAndTime());
        Assert.assertEquals(selectCarPage.getTitleStartLocation(), LocationCars.locationStart);
        Assert.assertEquals(selectCarPage.getTitleStartDayAndTime(), LocationCars.dayStart);

        System.out.println("Return: \n" + selectCarPage.getTitleFinishLocation() + "\n" + selectCarPage.getTitleFinishDayAndTime());
        Assert.assertEquals(selectCarPage.getTitleFinishLocation(), LocationCars.locationFinish);
        Assert.assertEquals(selectCarPage.getTitleFinishDayAndTime(), LocationCars.dayFinish);
    }

    @Test(priority = 6)
    public void testChooseCarAndRentalOption() throws InterruptedException {
        selectCarPage.clickButtonPayLater();
        selectCarPage.chooseOptionAndClickButton();
        Thread.sleep(15000);
    }

}
