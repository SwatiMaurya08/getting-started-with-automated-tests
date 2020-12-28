package com.softhinkers.selenium.common;


import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.selenium.common
 * @date 12/26/2020
 */
public class BaseTest {
    private static WebDriver driver;
    private static final String webDriverLocation = "C:/Users/SWATI/Downloads/chromedriver_win32/chromedriver.exe";
    private static final String baseUrl = "http://www.softhinkers.com/";


    @BeforeClass
    public static void setup() {
        System.out.println("Inside Before class");
        System.setProperty("webdriver.chrome.driver", webDriverLocation);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);

    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Inside After class");
        driver.close();
        driver.quit();
    }


    public WebDriver getDriver() {
        return driver;
    }
}
