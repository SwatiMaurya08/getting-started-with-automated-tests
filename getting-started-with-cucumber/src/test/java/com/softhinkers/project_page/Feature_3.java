package com.softhinkers.project_page;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.project_page
 * @date 12/17/2020
 */
public class Feature_3 {
    @Given("the following users exist:")
    public void theFollowingUsersExist(DataTable table) {
        System.out.println(Thread.currentThread().getId() + "  " + table);
        System.out.println(table.asList());
        System.out.println(table.column(1));
        System.out.println(table.cell(1, 1));
        System.out.println(table.height());
    }

    @Given("I have the following books in the store")
    public void iHaveTheFollowingBooksInTheStore(DataTable table) {
        System.out.println(Thread.currentThread().getId() + "  " + table);
        System.out.println(table.height());
        System.out.println(table.asMaps());
        System.out.println(table.hashCode());
        System.out.println(table.row(2));
    }

    @When("I search for books by author Erik Larson")
    public void iSearchForBooksByAuthorErikLarson() {

    }

    @Then("I find {int} books")
    public void iFindBooks(int arg0) {
    }
}
