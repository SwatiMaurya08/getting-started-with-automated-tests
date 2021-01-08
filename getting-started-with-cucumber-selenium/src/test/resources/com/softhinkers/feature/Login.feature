Feature: Login

  Scenario: Verify valid login
    Given user opens "http://softhinkers.com"
    When user clicks on "login" button
    Then user navigates to "login" page
    And user enters "username"
    And user enters "password"
    And user clicks on "submit" button
    Then user navigates to "Admin" page



