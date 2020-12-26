package com.softhinkers.selenium.test;

import com.softhinkers.selenium.page.AdminPage;
import com.softhinkers.selenium.page.HomePage;
import com.softhinkers.selenium.page.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.selenium.test
 * @date 12/24/2020
 */
public class AdminTest {
    AdminPage adminPage;
    LoginPage loginPage;
    HomePage homePage;


    private WebDriver driver;
    private final String baseUrl = "http://www.softhinkers.com/";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/SWATI/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage = PageFactory.initElements(driver, HomePage.class);
        adminPage = PageFactory.initElements(driver, AdminPage.class);
        driver.get(baseUrl);
        homePage.clickOnLoginButton();
        loginPage.inputUsername("Softhinker.com");
        loginPage.inputPassword("Life4fun");
        loginPage.clickOnSubmitButton();

    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    // @Test
    public void verifyAdminHeader() {
        String adminHeaderExpected = "Softhinkers Admin Panel";
        String adminHeaderActual = adminPage.getTextFromAdminHeader();
        Assert.assertEquals("Expected admin header title does not matched", adminHeaderExpected, adminHeaderActual);
    }

    // @Test
    public void verifyAdminHome() {
        String adminHomeExpected = "Home";
        String adminHomeActual = adminPage.getTextFromHome();
        Assert.assertEquals("Expected admin Home title does not matched", adminHomeExpected, adminHomeActual);
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
        Assert.assertEquals("Text Does not Matched", expectedList, actualList);

    }



}