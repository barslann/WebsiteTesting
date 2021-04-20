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

