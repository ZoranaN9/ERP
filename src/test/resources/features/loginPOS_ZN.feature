@zoka
Feature: User valid login
  User Story: As a POS and event CRM manager, I should be able to Login with valid credentials.

@pos
  Scenario: Login with POS valid credential
    Given posManager is on the log in page
    When the user enter username
    And the user enter password
    And the user clicks the log in button
    Then account holder name should be "POSManager55"




