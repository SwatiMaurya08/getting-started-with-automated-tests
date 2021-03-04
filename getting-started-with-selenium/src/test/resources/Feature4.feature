Feature: Welcome to the Vistara flight.

  Scenario: Book Flights and Check In Online.
    Given user opens "https://www.airvistara.com/in/en"
    When user clicks on modal footer done button
    When user clicks on close and continue button
    When user scroll down to the bottom
    Then user sees the heading extras
    * user sees the different image icons bar
    * user sees the heading list in folds section
    * user sees the heading "Club Vistara"
    * user sees the heading "Deals & Offers"
    * user sees the heading "Destinations"
    * user sees the heading "Media Centre"
    * user sees the heading "Vistara Experience"
