package com.softhinkers.project_page;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import javax.xml.bind.SchemaOutputResolver;

/**
 * @author Swati Maurya
 * @company Softhinkers
 * @package com.softhinkers.project_page
 * @date 12/17/2020
 */
public class Feature_2 {
    @Given("a blog post named {string} with Markdown body")
    public void aBlogPostNamedWithMarkdownBody(String random, String args) {
        System.out.println(random);
        System.out.println(args);
    }

    @Given("user navigates to the website javatpoint.com")
    public void userNavigatesToTheWebsiteJavatpointCom() {
        System.out.println("Welcome to Given Syntax");
    }

    @And("there user logs in through Login Window by using Username as {string} and Password as {string}")
    public void thereUserLogsInThroughLoginWindowByUsingUsernameAsAndPasswordAs(String arg0, String arg1) {
        System.out.println("Welcome to And Syntax");
    }

    @Then("login must be successful.")
    public void loginMustBeSuccessful(String args) {
        System.out.println(args);
    }
}
