package com.softhinkers.selenium.test;

import com.softhinkers.selenium.common.BaseTest;
import com.softhinkers.selenium.page.HomePage;
import com.softhinkers.selenium.page.LoginPage;
import org.testng.Reporter;
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
        Reporter.log("This test verifies the current selenium is in LoginTest Class");
        Reporter.log("Launching Google Chrome Driver for this test");

        System.out.println("The current thread ID  Chrome for LoginTest " + Thread.currentThread().getId());
        System.out.println("The name of thread ID  Chrome for LoginTest " + Thread.currentThread().getName());
        System.out.println("The prioritiy of thread ID  Chrome for LoginTest " + Thread.currentThread().getPriority());
        homePage.clickOnLoginButton();

        loginPage.inputUsername(USERNAME);
        loginPage.inputPassword(PASSWORD);
        loginPage.clickOnSubmitButton();
    }
}
