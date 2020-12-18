Feature: Calculator
  As a user
  I want to use a calculator to add numbers
  So that I don't need to add myself
  Scenario: Scenario Outline Syntax
  Scenario Outline: eating
    Given there are <start> cucumbers
    When I eat <eat> cucumbers
    Then I should have <left> cucumbers
    Examples:
      | start | eat | left |
      |    12 |   5 |    7 |
      |    20 |   5 |   15 |

  Scenario Outline: Check if String is Palindrome
    Given I entered word <wordToTest>
    When I test it for Palindrome
    Then the output should be <output>
    Examples:
      | wordToTest | output  |
      | "Refer"    | "true"  |
      | "Coin"     | "false" |
      | "Space"    | "false" |
      | "racecar"  | "true"  |





