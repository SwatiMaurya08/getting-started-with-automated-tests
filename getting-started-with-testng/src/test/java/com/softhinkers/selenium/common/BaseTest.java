package com.softhinkers.selenium.common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;

import java.sql.Driver;

import static com.softhinkers.selenium.common.Constant.BASEURL;
import static com.softhinkers.selenium.common.Constant.WEBDRIVERLOCATION;


/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.selenium.common
 * @date 12/26/2020
 */
public class BaseTest {
    private WebDriver driver = null;

    public BaseTest() {
        setup("chrome");
    }

    public void setup(String sBrowserType) {
        if (driver == null) {
            try {
                if (sBrowserType.equalsIgnoreCase("chrome")) {
                    System.setProperty("webdriver.chrome.driver", WEBDRIVERLOCATION);
                    driver = new ChromeDriver();
                } else if (sBrowserType.equalsIgnoreCase("firefox")) {
                    driver = new FirefoxDriver();
                } else if (sBrowserType.equalsIgnoreCase("ie")) {
                    System.setProperty("wedriver.ie.driver", WEBDRIVERLOCATION);
                    driver = new InternetExplorerDriver();
                }
            } catch (WebDriverException e) {

                System.out.println("Browser not found" + e.getMessage());

            }
            driver.manage().window().maximize();
            driver.get(BASEURL);
        }
    }

    @AfterClass
    public void tearDown() {
        driver.manage().deleteAllCookies();
        driver.close();
        driver.quit();

    }


    public WebDriver getDriver() {
        return driver;
    }
}
