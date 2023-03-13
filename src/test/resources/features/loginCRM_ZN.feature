
Feature: User valid login
  User Story: As a POS and event CRM manager, I should be able to Login with valid credentials.

  @regression @crm
  Scenario: Login with valid credential
    Given crmManager is on the log in page
    When the user enter username "eventscrmmanager55@info.com"
    And the user enter password "eventscrmmanager"
    And the user clicks the log in button
    Then account holder name should be "EventsCRMManager55"