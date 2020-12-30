package com.softhinkers.selenium.test;

import com.softhinkers.selenium.common.BaseTest;
import com.softhinkers.selenium.page.HomePage;
import com.softhinkers.selenium.page.LoginPage;
import org.testng.annotations.Test;

import static com.softhinkers.selenium.common.Constant.PASSWORD;
import static com.softhinkers.selenium.common.Constant.USERNAME;


public class LoginTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    public LoginTest() {
        super();
        loginPage = new LoginPage(getDriver());
        homePage = new HomePage(getDriver());

    }

    @Test
    public void login() {
        homePage.clickOnLoginButton();

        loginPage.inputUsername(USERNAME);
        loginPage.inputPassword(PASSWORD);
        loginPage.clickOnSubmitButton();
    }
}
