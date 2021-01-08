@project
Feature: Project

  Scenario: To validate weather project page content is present
    Given user opens "http://softhinkers.com"
    When user clicks on "Projects" button
    Then user navigates to "projects" page
    Then user clicks on "Android" button
    Then user navigates to "android" page
    Then user clicks on "Phone silencer" link
    Then user navigates to "Phone silencer" page
    Then user sees the heading "Phone Silencer"
    Then user clicks on "Back to project" link


  Scenario: To validate weather project page content is present
    Given user opens "http://softhinkers.com"
    When user clicks on "Projects" button
    Then user navigates to "projects" page
    Then user clicks on "Android" button
    Then user navigates to "android" page
    Then user clicks on "Ghost Blaster" link
    Then user navigates to "Ghost Blaster" page
    Then user sees the heading "Ghost Blaster"
    Then user clicks on "Back to project" link


  Scenario: To validate weather project page content is present
    Given user opens "http://softhinkers.com"
    When user clicks on "Projects" button
    Then user navigates to "projects" page
    Then user clicks on "Android" button
    Then user navigates to "android" page
    Then user scroll down to the bottom
    Then user clicks on "Mini Soccer" link
    Then user navigates to "Mini Soccer" page
    Then user sees the heading "Mini Soccer"
    Then user clicks on "Back to project" link




