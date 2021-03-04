package com.softhinkers.stepdefinition;

import com.softhinkers.common.BaseTest;
import com.softhinkers.pages.Page3;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import static org.junit.Assert.fail;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.stepdefinition
 * @date 2/24/2021
 */
public class StepDefinition3 extends BaseTest {

    Page3 page3;

    public StepDefinition3() {
        page3 = new Page3(getDriver());
    }

    @Then("user clicks on the flights tab.")
    public void userClicksOnTheFlightsTab() {
        page3.getFlightsTab();
    }

    @Then("user select pay by cash option.")
    public void userSelectPayByCashOption() {
        page3.getcashRadioButton(getDriver());
    }

    @Then("user select round trip option.")
    public void userSelectRoundTripOption() {
        page3.getRoundTrip();
    }

    @Then("user than enters the {string}.")
    public void userThanEntersThe(String places) {
        switch (places) {
            case "Origin": {
                page3.getOrigin("Pune");
                break;
            }
            case "Destination": {
                page3.getDestination("Delhi");
                break;
            }
            default: {
                fail("Input Fields cannot be blank");
                break;
            }
        }
    }

    @Then("user clicks on depart date drop down.")
    public void userClicksOnDepartDateDropDown() {
        page3.getDepartDate();
    }

    @Then("user sees the depart and return date selection popup window")
    public void userSeesTheDepartAndReturnDateSelectionPopupWindow() {
        boolean actual = page3.getDateSelectionPopUp(getDriver());
        boolean expected = true;
        Assert.assertEquals("Actual result does not meets expected result", expected, actual);
    }

    @Then("user sees the {string} tab.")
    public void userSeesTheTab(String datetab) {
        switch (datetab) {
            case "Depart Date": {
                boolean actual = page3.getDepartDateTab();
                boolean expected = true;
                Assert.assertEquals("Actual result does not meets expected result", expected, actual);
                page3.clickDepartDateTab();
                return;
            }
            case "Return Date": {
                boolean actual = page3.getReturnDateTab();
                boolean expected = true;
                Assert.assertEquals("Actual result does not meets expected result", expected, actual);
                page3.clickReturnDateTab();
            }
        }
    }

    @Then("user selects the {string} for depart date")
    public void userSelectsTheForDepartDate(String departDate) {
        switch (departDate) {
            case "Year": {
                page3.getDepartDateYear();
                return;
            }
            case "Month": {
                page3.getDepartDateMonth();
                return;
            }
            case "Day": {
                page3.getDepartDateDay();
                return;
            }
            default: {
                fail(departDate + " no such options");
            }
        }

    }

    @Then("user selects the {string} for return date")
    public void userSelectsTheForReturnDate(String returnDate) {
        switch (returnDate) {
            case "Year": {
                page3.getReturnDateYear();
                return;
            }
            case "Month": {
                page3.getReturnDateMonth();
                return;
            }
            case "Day": {
                page3.getReturnDateDay();
                return;
            }
            default: {
                fail(returnDate + " no such options");
            }
        }
    }

    @Then("user clicks on passengers.")
    public void userClicksOnPassengers() {
        page3.getPassenger(getDriver());
    }

    @Then("user sees the passenger details popup window")
    public void userSeesThePassengerDetailsPopupWindow() {
        boolean actual = page3.getPassengerPopUp(getDriver());
        boolean expected = true;
        Assert.assertEquals("Actual result does not meets expected result", expected, actual);
    }


    @Then("user selects the passenger detail {string}")
    public void userSelectsThePassengerDetail(String passenger) {
        switch (passenger) {
            case "Adult": {
                page3.getPassengerAdult();
                return;

            }
        }
    }

    @Then("user selects the travel type {string}")
    public void userSelectsTheTravelType(String travelType) {
        switch (travelType) {
            case "Economy": {
                page3.getTravelTypeEconomy();
                return;

            }
        }
    }

    @Then("user clicks on the done button")
    public void userClicksOnTheDoneButton() {
        page3.getDoneButton();
    }

    @Then("user clicks in  search flights button.")
    public void userClicksInSearchFlightsButton() {
        page3.getSearchFlightButton();
    }


    @Then("user selects the entered {string}")
    public void userSelectsTheEntered(String originDestination) {
        switch (originDestination) {
            case "Origin": {

                page3.getOriginSelected(getDriver());
                break;
            }
            case "Destination": {
                page3.getDestinationSelected(getDriver());
                break;
            }
            default: {
                fail("This value is not acceptable : " + originDestination);
                break;
            }
        }
    }
}
