package com.softhinkers.project_page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.project_page
 * @date 12/18/2020
 */


public class Feature_4 {
    @Given("there are {int} cucumbers")
    public void thereAreStartCucumbers(int start) {
        System.out.println(start);
    }

    @When("I eat {int} cucumbers")
    public void iEatEatCucumbers(int eat) {
        System.out.println(eat);
    }

    @Then("I should have {int} cucumbers")
    public void iShouldHaveLeftCucumbers(int left) {
        System.out.println(left);
    }


    @Given("I entered word {string}")
    public void i_entered_word(String wordToTest) {
        System.out.println(wordToTest);
    }

    @When("I test it for Palindrome")
    public void iTestItForPalindrome() {

    }

    @Then("the output should be {string}")
    public void the_output_should_be(String output) {
        System.out.println(output);

    }
}
