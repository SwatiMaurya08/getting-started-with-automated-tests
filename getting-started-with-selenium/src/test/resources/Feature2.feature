Feature:  Welcome to the Vistara flight.
  Scenario: Book Flights and Check In Online.
    Given user opens "https://www.airvistara.com/in/en"
    When user clicks on modal footer done button
    When user clicks on close and continue button
    Then user sees the region header navbar
    Then user sees the image icon on navbar
    Then user sees the navbar containing titles
