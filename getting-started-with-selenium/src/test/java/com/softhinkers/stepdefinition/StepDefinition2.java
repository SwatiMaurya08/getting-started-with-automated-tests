package com.softhinkers.stepdefinition;

import com.softhinkers.common.BaseTest;
import com.softhinkers.pages.Page2;
import io.cucumber.java.en.Then;
import org.junit.Assert;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.stepdefinition
 * @date 2/23/2021
 */
public class StepDefinition2 extends BaseTest {
    Page2 page2;

    public StepDefinition2() {
        page2 = new Page2(getDriver());

    }

    @Then("user sees the region header navbar")
    public void userSeesTheRegionHeaderNavbar() {
        boolean actual = page2.getregionHeader();
        boolean expected = true;
        Assert.assertEquals("Actual result does not meets expected result", expected, actual);
    }

    @Then("user sees the image icon on navbar")
    public void userSeesTheImageIconOnNavbar() {
        boolean actual = page2.getimageIcon();
        boolean expected = true;
        Assert.assertEquals("Actual result does not meets expected result", expected, actual);
    }

    @Then("user sees the navbar containing titles")
    public void userSeesTheNavbarContainingTitles() {
        boolean actual = page2.gettitlesNavbar();
        boolean expected = true;
        Assert.assertEquals("Actual result does not meets expected result", expected, actual);
    }
}
