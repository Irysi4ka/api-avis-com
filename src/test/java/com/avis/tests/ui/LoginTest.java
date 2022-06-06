package com.avis.tests.ui;

import com.avis.pageobjects.LoginPage;
import com.avis.pageobjects.MainPage;
import com.avis.utils.DefaultUser;
import org.testng.annotations.Test;

public class LoginTest extends AbstractTest{
    LoginPage loginPage;
    MainPage mainPage;

    @Test
    public void testLogin() throws InterruptedException {
        mainPage = new MainPage().openPage().clickButtonLogin();

        loginPage = new LoginPage()
                .typeUserNameAndPassword(DefaultUser.USER_NAME, DefaultUser.USER_PASSWORD)
                .clickButtonLogIn();
        Thread.sleep(25000);
        loginPage.clickButtonVerification();
        Thread.sleep(10000);
    }
}
