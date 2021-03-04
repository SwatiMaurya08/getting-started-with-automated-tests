package com.softhinkers.stepdefinition;

import com.softhinkers.common.BaseTest;
import com.softhinkers.pages.Page4;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.stepdefinition
 * @date 2/24/2021
 */
public class StepDefinition4 extends BaseTest {

    Page4 page4;

    public StepDefinition4() {
        page4 = new Page4(getDriver());
    }


    @When("user scroll down to the bottom")
    public void userScrollDownToTheBottom() {
        JavascriptExecutor js = (JavascriptExecutor) getDriver();
        js.executeScript("scroll(0, 750);");
    }

    @Then("user sees the heading extras")
    public void userSeesTheHeadingExtras() {
        String actual = page4.getExtraHeading();
        String expected = "Extras";
        Assert.assertEquals("Actual does not meet Expected", expected, actual);

    }

    @Then("user sees the different image icons bar")
    public void userSeesTheDifferentImageIconsBar() {
        Boolean actual = page4.getImageIcon();
        Boolean expected = true;
        Assert.assertEquals("Actual does not meet Expected", expected, actual);

    }

    @Then("user sees the heading list in folds section")
    public void userSeesTheHeadingListInFoldsSection() {
        Boolean actual = page4.getFoldSection();
        Boolean expected = true;
        Assert.assertEquals("Actual does not meet Expected", expected, actual);

    }

    @Then("user sees the heading {string}")
    public void userSeesTheHeading(String heading) {
        switch (heading) {
            case "Club Vistara": {
                String actualText = page4.getClubVistara();
                Assert.assertEquals("Actual does not match with expected", heading, actualText);
                break;
            }
            case "Deals & Offers": {
                String actualText = page4.getDealsAndOffers();
                Assert.assertEquals("Actual does not match with expected", heading, actualText);
                break;
            }
            case "Destinations": {
                String actualText = page4.getdestinations();
                Assert.assertEquals("Actual does not match with expected", heading, actualText);
                break;
            }
            case "Media Centre": {
                String actualText = page4.getMediaCentre();
                Assert.assertEquals("Actual does not match with expected", heading, actualText);
                break;
            }
            case "Vistara Experience": {
                String actualText = page4.getVistaraExperience();
                Assert.assertEquals("Actual does not match with expected", heading, actualText);
                break;
            }
        }

    }
}
