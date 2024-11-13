Feature: features to test login functionality

  Scenario: Check login is sucessful with valid credentials
    Given user is on login page
    When user enter username and password
    And clicks on login button
    Then user is navigated  to the home  page