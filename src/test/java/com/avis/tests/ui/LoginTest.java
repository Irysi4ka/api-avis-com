package com.avis.tests.ui;

import com.avis.pageobjects.LoginPage;
import com.avis.pageobjects.MainPage;
import com.avis.utils.DefaultUser;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LoginTest extends AbstractTest {
    LoginPage loginPage;
    MainPage mainPage;

    @Ignore
    @Test(priority = 8)
    public void testLogin() throws InterruptedException {
        mainPage = new MainPage().openPage().clickButtonLogin();

        loginPage = new LoginPage()
                .typeUserNameAndPassword(DefaultUser.USER_NAME, DefaultUser.USER_PASSWORD)
                .clickButtonLogIn();
        Thread.sleep(30000);
        loginPage.clickButtonVerification();
        System.out.println("Name: " + loginPage.getTitleName());
        Assert.assertEquals(loginPage.getTitleName(), "WELCOME, " + DefaultUser.NAME_PROFILE);
        Thread.sleep(5000);
    }
}

