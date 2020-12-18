package com.softhinkers.project_page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.project_page
 * @date 12/18/2020
 */
public class Feature_5 {
    @Given("I am out shopping")
    public void iAmOutShopping() {
        System.out.println("I am out shopping");
    }

    @When("I check my list")
    public void iCheckMyList() {
        System.out.println("I check my list");
    }

    @Then("I don't need anything")
    public void iDonTNeedAnything() {
        System.out.println("I don't need anything");
    }

    @Given("I have eggs")
    public void i_have_eggs() {
        System.out.println("I have eggs");

    }

    @Given("I have milk")
    public void i_have_milk() {
        System.out.println("I have milk");

    }

    @Given("I have butter")
    public void i_have_butter() {
        System.out.println("I Have butter");
    }


    @And("I click on {string} name")
    public void iClickOnName(String buttonName) {
        switch (buttonName.toLowerCase()) {
            case "register":
                System.out.println("Click on Register button");
                break;
            case "user":
                System.out.println("Click on User button");
                break;
            case "email":
                System.out.println("Click on Email button");
                break;

        }


    }


    @And("I type a valid {string}")
    public void iTypeAValid(String validInput) {
        switch (validInput.toLowerCase()) {
            case "username":
                System.out.println("Type a valid username");
                break;
            case "email":
                System.out.println("Type a valid email");
                break;

        }
    }
}