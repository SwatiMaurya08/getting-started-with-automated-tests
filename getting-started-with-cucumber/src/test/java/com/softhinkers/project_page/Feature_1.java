package com.softhinkers.project_page;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.project_page
 * @date 12/16/2020
 */
public class Feature_1 {

    @Given("User is on the main page of {string}")
    public void userIsOnTheMainPageOf(String website) {
        System.out.println(Thread.currentThread().getId() + "  " + website);
        System.out.println(website);
    }

    @When("User navigates to {string}")
    public void userNavigatesTo(String pages) {
        System.out.println(Thread.currentThread().getId() + "  " + pages);
       System.out.println(pages);
    }

    @Then("User should see lists of projects")
    public void userShouldSeeListsOfProjects() {
        System.out.println("users sees list of project");
    }
}
