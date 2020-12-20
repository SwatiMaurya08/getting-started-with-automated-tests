@feature_1
Feature: Different pages should contain different contents
@scenario_1
  Scenario: When user navigates to project page, user should see the content

    Given User is on the main page of "www.softhinkers.com"
    When User navigates to "project page"
    Then User should see lists of projects

  Scenario: When user navigates to blog page, user should see the content

    Given User is on the main page of "www.softhinkers.com"
    When User navigates to "blog page"
    Then User should see lists of projects