
Feature: User valid login
  User Story: As a POS manager, I should be able to Login with valid credentials.


  Scenario: Login with POS valid credential
    Given posManager is on the log in page
    When the user enter username and password and click
    And the user clicks the log in button
    Then User should see the top bar


