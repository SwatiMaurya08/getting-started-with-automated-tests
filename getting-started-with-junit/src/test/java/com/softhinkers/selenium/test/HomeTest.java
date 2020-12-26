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
public class HomeTest {
    HomePage homePage;


    private WebDriver driver;
    private final String baseUrl = "http://www.softhinkers.com/";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/SWATI/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        homePage = PageFactory.initElements(driver, HomePage.class);
        driver.get(baseUrl);
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }


    @Test
    public void verifyHeadingLists() {
        List<String> expectedList = new ArrayList<String>();
        List<String> actualList = new ArrayList<String>();
        expectedList.add("SOFTHINKERS");
        expectedList.add("Home");
        expectedList.add("Projects");
        expectedList.add("Blog");
        expectedList.add("Download");
        expectedList.add("Contact");
        expectedList.add("Login");
        expectedList.add("Register");
        actualList.addAll(homePage.getTextFromHeadingList());
        Assert.assertEquals("Actual Outcome Does not match with Expexted", expectedList, actualList);

    }
}
