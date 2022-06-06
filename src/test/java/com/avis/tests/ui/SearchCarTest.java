package com.avis.tests.ui;

import com.avis.pageobjects.MainPage;
import com.avis.pageobjects.SearchPanelPage;
import org.testng.annotations.Test;

public class SearchCarTest extends AbstractTest {
    MainPage mainPage;
    SearchPanelPage searchPanelPage;

    @Test
    public void testCalendar() throws InterruptedException {
        mainPage = new MainPage().openPage();
        searchPanelPage = new SearchPanelPage()
                .fillPanelStartLocation()
                .fillPanelFinishLocation()
                .clickButtonSelectMyCar()
                .clickButtonSelectThisLocation();
        Thread.sleep(15000);
    }

}
