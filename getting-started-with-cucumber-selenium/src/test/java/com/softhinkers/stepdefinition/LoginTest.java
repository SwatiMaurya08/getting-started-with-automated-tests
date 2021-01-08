package com.softhinkers.stepdefinition;

import com.softhinkers.common.BaseTest;
import com.softhinkers.common.Button;
import com.softhinkers.pages.HomePage;
import com.softhinkers.pages.LoginPage;
import com.softhinkers.pages.ProjectPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static com.softhinkers.common.Button.*;
import static com.softhinkers.common.Constant.*;


/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.stepdefinition
 * @date 12/30/2020
 */
public class LoginTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    ProjectPage projectPage;

    public LoginTest() {
        homePage = new HomePage(getDriver());
        loginPage = new LoginPage(getDriver());
        projectPage = new ProjectPage(getDriver());
    }

    @Given("user opens {string}")
    public void userOpens(String url) {
        getDriver().get(url);
    }

    @When("user clicks on {string} button")
    public void userClicksOnButton(String button) {
        Button buttonEnum = getButtonEnum(button.toLowerCase());
        if (null != buttonEnum) {
            switch (buttonEnum) {
                case LOGIN: {
                    homePage.clickOnLoginButton();
                    break;
                }
                case SUBMIT: {
                    loginPage.submitButton();
                    break;
                }
                case PROJECTS: {
                    projectPage.getProjectButton();
                    break;
                }
                case ANDROID: {
                    projectPage.getAndroidButton();
                    break;
                }
                default: {
                    Assert.fail("Button cannot be found");
                    break;
                }
            }
        } else {
            Assert.fail(button + " button cannot be empty or null");
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
                String expected = "Please Log In or Sign Up";
                Assert.assertEquals("Actual Text does not match to Expected Text ", expected, actual);
                break;
            }
            case "admin": {
                String actualUrl = getDriver().getCurrentUrl();
                String expectedUrl = "http://softhinkers.com/admin/index.php";
                Assert.assertEquals("Actual Url does not match to Expected Url", expectedUrl, actualUrl);
                break;
            }
            case "projects": {
                String actualUrl = getDriver().getCurrentUrl();
                String expectedUrl = "http://softhinkers.com/projects.php";
                Assert.assertEquals("Actual Url does not match to Expected Url", expectedUrl, actualUrl);
                break;
            }
            case "android": {
                String actualUrl = getDriver().getCurrentUrl();
                String expectedUrl = "http://softhinkers.com/s-android";
                Assert.assertEquals("Actual Url does not match to Expected Url", expectedUrl, actualUrl);
                break;
            }
            case "phone silencer": {
                String actualUrl = getDriver().getCurrentUrl();
                String expectedUrl = "http://softhinkers.com/p-phone-silencer";
                Assert.assertEquals("Actual Url does not match to Expected Url", expectedUrl, actualUrl);
                break;
            }
            case "ghost blaster": {
                String actualUrl = getDriver().getCurrentUrl();
                String expectedUrl = "http://softhinkers.com/p-ghost-blasters";
                Assert.assertEquals("Actual Url does not match to Expected Url", expectedUrl, actualUrl);
                break;
            }
            case "mini soccer": {
                String actualUrl = getDriver().getCurrentUrl();
                String expectedUrl = "http://softhinkers.com/p-mini-soccer";
                Assert.assertEquals("Actual Url does not match to Expected Url", expectedUrl, actualUrl);
                break;
            }
            default: {
                Assert.fail(page + " does not exist");
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
