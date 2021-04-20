Feature: verify the turo homepage
  Scenario: verify the website homepage url and title
    Given user is on landing page
    When verify the "https://turo.com/"
    And verify the page "Turo | The world's largest car sharing marketplace"
    Then verify the logo

  Scenario: fill out the search option
    Given user is on landing page
    When user enter location in where text box
    And user select date from and date until
    Then user clicks search button

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