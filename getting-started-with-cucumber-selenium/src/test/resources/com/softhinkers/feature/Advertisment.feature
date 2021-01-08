Feature: Advertisment
  Scenario: Verify Advertisment is present or not
    Given user opens "http://softhinkers.com"
    When user scroll down to the bottom
    Then user sees the Advertisment
