package com.softhinkers.stepdefinition;

import com.softhinkers.common.BaseTest;
import com.softhinkers.pages.Page1;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.stepdefinition
 * @date 2/22/2021
 */
public class StepDefinition1 extends BaseTest {
    Page1 page1;

    public StepDefinition1() {
        page1 = new Page1(getDriver());
    }

    @Given("user opens {string}")
    public void userOpens(String url) {
        getDriver().get(url);

    }

    @When("user sees the navbar containing title {string}")
    public void userSeesTheNavbarContainingTitle(String titles) {

        switch (titles) {
            case "Plan Travel": {
                String actualText = page1.getTextPlanTravel();
                Assert.assertEquals("Actual does not match with expected", titles, actualText);
                break;
            }
            case "Travel Information": {
                String actualText = page1.getTextTravelInformation();
                Assert.assertEquals("Actual does not match with expected", titles, actualText);
                break;
            }
            case "Club Vistara": {
                String actualText = page1.getTextClubVistara();
                Assert.assertEquals("Actual does not match with expected", titles, actualText);
                break;
            }
            case "Login": {
                String actualText = page1.getTextLogin();
                Assert.assertEquals("Actual does not match with expected", titles, actualText);
                break;
            }
            case "Enrol": {
                String actualText = page1.getTextEnrol();
                Assert.assertEquals("Actual does not match with expected", titles, actualText);
                break;
            }
        }
    }

    @When("user clicks on modal footer done button")
    public void userClicksOnModalFooterDoneButton() {
        page1.getPopUpDoneButton();
    }

    @When("user clicks on close and continue button")
    public void userClicksOnCloseAndContinueButton() {
        page1.getCloseAndContinueButton(getDriver());
    }


}
