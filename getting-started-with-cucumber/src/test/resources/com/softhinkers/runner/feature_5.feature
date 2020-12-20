Feature:Grocery Shop
  Scenario: All done
    Given I am out shopping
    * I have eggs
    * I have milk
    * I have butter
    When I check my list
    Then I don't need anything

    Scenario: Visit Softhinkers
      Given User is on the main page of "www.softhinkers.com"
      And I click on "Register" name
      And I click on "User" name
      And I type a valid "username"
      And I click on "Email" name
      And I type a valid "Email"
      And I click on "terms and conditions" name
      And I click on "register" name

