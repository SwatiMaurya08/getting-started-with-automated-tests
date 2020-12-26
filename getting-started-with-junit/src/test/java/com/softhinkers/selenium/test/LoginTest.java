package com.softhinkers.selenium.test;

import com.softhinkers.selenium.common.BaseTest;
import com.softhinkers.selenium.page.AdminPage;
import com.softhinkers.selenium.page.HomePage;
import com.softhinkers.selenium.page.LoginPage;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class LoginTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    public LoginTest() {
        loginPage = new LoginPage(getDriver());
        homePage = new HomePage(getDriver());

    }

    @Test
    public void login() {
        homePage.clickOnLoginButton();

        loginPage.inputUsername("xxxx");
        loginPage.inputPassword("xxxx");
        loginPage.clickOnSubmitButton();
    }
}
