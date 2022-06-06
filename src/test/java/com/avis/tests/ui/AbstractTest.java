package com.avis.tests.ui;

import com.avis.driver.DriverSingleton;
import org.testng.annotations.AfterTest;

public class AbstractTest {

    @AfterTest
    public void tearDown() {
        DriverSingleton.closeDriver();
    }
}
