package com.softhinkers.stepdefinition;

import com.softhinkers.common.BaseTest;
import com.softhinkers.pages.FooterPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.stepdefinition
 * @date 1/6/2021
 */
public class FooterTest extends BaseTest {
    FooterPage footerPage;

    public FooterTest() {
        footerPage = new FooterPage(getDriver());

    }

    @Then("user sees the footer")
    public void userSeesTheFooter() {
        String actual = footerPage.getFooter();
        String expected = "© SOFTHINKERS 2013-18 All Rights Reserved. Privacy policy";
        Assert.assertEquals("Actual result does not matched to expected result", expected, actual);
    }
}
