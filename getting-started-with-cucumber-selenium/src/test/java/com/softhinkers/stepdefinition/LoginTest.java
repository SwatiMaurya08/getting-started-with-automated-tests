package com.softhinkers.stepdefinition;

import com.softhinkers.common.BaseTest;
import com.softhinkers.pages.HomePage;
import com.softhinkers.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static com.softhinkers.common.Constant.*;
import static com.softhinkers.common.Constant.BASE_URL;


/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.stepdefinition
 * @date 12/30/2020
 */
public class LoginTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;

    private WebDriver driver = null;

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


    @After
    public void tearDown() {
        getDriver().close();
        getDriver().quit();
    }

    public LoginTest() {
        homePage = new HomePage(getDriver());
        loginPage = new LoginPage(getDriver());
    }

    @Given("user opens {string}")
    public void userOpens(String url) {
        System.out.println("Inside @Given");
//        getDriver().get(url);
    }

    @When("user clicks on {string} button")
    public void userClicksOnButton(String button) {
        switch (button) {
            case "login": {
                homePage.clickOnLoginButton();
                break;
            }
            case "submit": {
                loginPage.submitButton();
                break;
            }
            default: {
                Assert.fail("Button cannot be found");
                break;
            }
        }

    }

    @Then("user navigates to {string} page")
    public void userNavigatesToPage(String page) {
        String tempPage = page.toLowerCase();
        switch (tempPage) {
            case "login": {
                String actualUrl = getDriver().getCurrentUrl();
                String expectedUrl = "http://softhinkers.com/login.php";
                Assert.assertEquals("Actual Url does not match to Expected Url", expectedUrl, actualUrl);

                String actual = loginPage.getPleaseLoginText().trim();
                String expected = "Please Log In or";
                Assert.assertEquals("Actual Text does not match to Expected Text ", expected, actual);
                break;
            }
            case "admin": {
                //todo
                break;
            }
            default: {
                Assert.fail(page + " Does not exist");
            }
        }


    }

    @And("user enters {string}")
    public void userEnters(String credentials) {
        String tempCredentials = credentials.toLowerCase();
        switch (tempCredentials) {
            case "username": {
                loginPage.inputUsername(USERNAME);
                break;
            }
            case "password": {
                loginPage.inputPassword(PASSWORD);
                break;
            }
            default: {
                Assert.fail("Input Fields cannot be found");
                break;
            }
        }
    }
}
