Feature: Welcome to the Vistara flight.

  Scenario: Book Flights and Check In Online.
    Given user opens "https://www.airvistara.com/in/en"
    When user clicks on modal footer done button
    When user clicks on close and continue button
    When user scroll down to the bottom
    Then user clicks on the flights tab.
    Then user select pay by cash option.
    Then user select round trip option.
    Then user than enters the "Origin".
    Then user selects the entered "Origin"
    Then user than enters the "Destination".
    Then user selects the entered "Destination"
    Then user clicks on depart date drop down.
    Then user sees the depart and return date selection popup window
    Then user sees the "Depart Date" tab.
    Then user selects the "Year" for depart date
    Then user selects the "Month" for depart date
    Then user selects the "Day" for depart date
    Then user sees the "Return Date" tab.
    Then user selects the "Year" for return date
    Then user selects the "Month" for return date
    Then user selects the "Day" for return date
    Then user clicks on passengers.
    Then  user sees the passenger details popup window
    Then user selects the passenger detail "Adult"
    Then user selects the travel type "Economy"
    Then user clicks on the done button
    Then user clicks in  search flights button.



#  class=" ui-datepicker-week-end ui-datepicker-other-month ui-datepicker-unselectable ui-state-disabled "-weekwnd not selected date
#  class=" ui-datepicker-week-end "   "data-handler="selectDay" - weekend selected date

#  class=" ui-datepicker-other-month ui-datepicker-unselectable ui-state-disabled " - weekdays not selected dates
#  class=" " data-handler="selectDay"  - weekdays selected date



#  //div[@id="discSenior"]//span[@class='checkmark']
#  //div[@id="discArmed"]//span[@class='checkmark']
#  //div[@id="discStudent"]//span[@class='checkmark']