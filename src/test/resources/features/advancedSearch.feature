Scenario Outline: user fill out more filter option in the advanced search page
  Given user is in advanced search page
  When user clicks more filters and selects all stars host
  And user selects vehicle type and selects "<Vehicle Make>"
  And user adjusts vehicle years range
  And user selects the transmission and click on view results
  Then user click close button
  Examples:
  | Vehicle Make |
  | Mercedes     |