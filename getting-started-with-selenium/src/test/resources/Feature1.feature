Feature: Welcome to the Vistara flight.

  Scenario:  Book Flights and Check In Online.
    Given user opens "https://www.airvistara.com/in/en"
    When user clicks on modal footer done button
    When user clicks on close and continue button
    When  user sees the navbar containing title "Plan Travel"
    Then  user sees the navbar containing title "Travel Information"
    Then  user sees the navbar containing title "Club Vistara"
    Then  user sees the navbar containing title "Login"
    Then  user sees the navbar containing title "Enroll"










