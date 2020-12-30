package com.softhinkers.selenium.common;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

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
        setup();
    }


    public void setup() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", WEBDRIVERLOCATION);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(BASEURL);
        }
    }

    @AfterClass
    public void tearDown() {
        driver.close();
        driver.quit();
    }


    public WebDriver getDriver() {
        return driver;
    }
}
