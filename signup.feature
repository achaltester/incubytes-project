Feature: User Signup

  Scenario: Successful Signup with valid credentials
    Given user is on the signup page
    When user enters valid first name, last name, email and password
    And user submits the signup form
    Then user should be registered successfully