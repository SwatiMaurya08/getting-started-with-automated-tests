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
public class Feature_6 {
    @When("the Maker starts a game")
    public void theMakerStartsAGame() {
        System.out.println("the Maker starts a game");
    }

    @Then("the Maker waits for a Breaker to join")
    public void theMakerWaitsForABreakerToJoin() {
        System.out.println("the Maker waits for a Breaker to join");
    }

    @Given("the Maker has started a game with the word {string}")
    public void theMakerHasStartedAGameWithTheWord(String str) {
        System.out.println(str);
    }

    @When("the Breaker joins the Maker's game")
    public void theBreakerJoinsTheMakerSGame() {
        System.out.println("the Breaker joins the Maker's game");

    }

    @Then("the Breaker must guess a word with {int} characters")
    public void theBreakerMustGuessAWordWithCharacters(int number) {
        System.out.println(number);
    }
}
