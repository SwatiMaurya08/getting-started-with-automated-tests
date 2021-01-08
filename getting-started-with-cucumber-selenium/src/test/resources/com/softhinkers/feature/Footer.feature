Feature: Footer
  Scenario: Verify weather footer is present
    Given user opens "http://softhinkers.com"
    When user scroll down to the bottom
    Then user sees the footer
