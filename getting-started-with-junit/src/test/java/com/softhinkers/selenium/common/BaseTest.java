package com.softhinkers.selenium.common;

import com.softhinkers.selenium.page.AdminPage;
import com.softhinkers.selenium.page.HomePage;
import com.softhinkers.selenium.page.LoginPage;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.selenium.common
 * @date 12/26/2020
 */
public class BaseTest {
    private WebDriver driver;
    private final String webDriverLocation = "C:/Users/SWATI/Downloads/chromedriver_win32/chromedriver.exe";
    private final String baseUrl = "http://www.softhinkers.com/";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", webDriverLocation);
        driver = new ChromeDriver();
        driver.get(baseUrl);
    }

    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
