package com.softhinkers.stepdefinition;

import com.softhinkers.common.BaseTest;
import com.softhinkers.pages.AdvertismentPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;


/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.stepdefinition
 * @date 1/5/2021
 */
public class AdvertismentTest extends BaseTest {
    AdvertismentPage advertismentPage;

    public AdvertismentTest() {
        advertismentPage = new AdvertismentPage(getDriver());
    }

    @When("user scroll down to the bottom")
    public void userScrollDownToTheBottom() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    @Then("user sees the Advertisment")
    public void userSeesTheAdvertisment() {
        boolean actual = advertismentPage.getAdvertisment();
        boolean expected = true;
        Assert.assertEquals("Actual result does not meets expected result", expected, actual);
    }


}
