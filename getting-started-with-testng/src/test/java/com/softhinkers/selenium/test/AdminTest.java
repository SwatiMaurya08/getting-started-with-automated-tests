package com.softhinkers.selenium.test;

import com.softhinkers.selenium.common.BaseTest;
import com.softhinkers.selenium.page.AdminPage;
import com.softhinkers.selenium.page.HomePage;
import com.softhinkers.selenium.page.LoginPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;
import static com.softhinkers.selenium.common.Constant.PASSWORD;
import static com.softhinkers.selenium.common.Constant.USERNAME;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.selenium.test
 * @date 12/24/2020
 */
public class AdminTest extends BaseTest {
    AdminPage adminPage;
    LoginPage loginPage;
    HomePage homePage;


    public AdminTest() {
        super();
        adminPage = new AdminPage(getDriver());
        loginPage = new LoginPage(getDriver());
        homePage = new HomePage(getDriver());
    }
    @BeforeTest
    public void login() {
        homePage.clickOnLoginButton();
        loginPage.inputUsername(USERNAME);
        loginPage.inputPassword(PASSWORD);
        loginPage.clickOnSubmitButton();
    }

    //@Test
    public void verifyAdminHeader() {
        String adminHeaderExpected = "Softhinkers Admin Panel";
        String adminHeaderActual = adminPage.getTextFromAdminHeader();
        Assert.assertEquals(adminHeaderActual,adminHeaderExpected, "Expected Text does not Match to Actual Text");
    }

    @Test
    public void verifyAdminHeaderOptions() {
        List<String> expectedList = new ArrayList<String>();
        List<String> actualList = new ArrayList<String>();
        expectedList.add("Home");
        expectedList.add("About");
        expectedList.add("Projects");
        expectedList.add("Blog");
        expectedList.add("Download");
        expectedList.add("Contact");
        expectedList.add("Users");
        expectedList.add("View Website");
        expectedList.add("Logout");
        actualList.addAll(adminPage.getTextFromHeaders());
        Assert.assertEquals(actualList,expectedList,"Expected Text does not Match to Actual Text");

    }


}