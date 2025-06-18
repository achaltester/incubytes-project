Feature: User Login

  Scenario: Successful Login with valid credentials
    Given user is on the login page
    When user enters correct email and password
    And user clicks on login button
    Then user should be redirected to the dashboard