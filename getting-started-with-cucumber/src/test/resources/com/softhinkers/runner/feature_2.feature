@feature_2
Feature: This is feature_2 info
  Syntax about the Docs String used in Gherkin

  Scenario: Docs String Syntax

    Given a blog post named "Random" with Markdown body
    """
    Helloo....Hi
    I am Swati Maurya
    """


  Scenario: Login Functionality
    Given user navigates to the website javatpoint.com
    And there user logs in through Login Window by using Username as "USER" and Password as "PASSWORD"
    Then login must be successful.
    """
    The user has logged in successfully to the javapoint website.
    Welcome to the Java Tutorial
    """



