package com.softhinkers.common;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.softhinkers.common.Constant.BASE_URL;
import static com.softhinkers.common.Constant.WEBDRIVER_LOCATION;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.common
 * @date 12/31/2020
 */
public class BaseTest {
    private WebDriver driver = null;

    public BaseTest(){
        setUp();
    }

    public void setUp() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", WEBDRIVER_LOCATION);
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get(BASE_URL);
        }
    }

    public WebDriver getDriver() {
        return driver;
    }
}
