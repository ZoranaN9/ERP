Feature: POS manager access

  User Story:
  As a POS manager, I should be able to access to the main modules.

  Scenario: Verify the POS managers access to 22 modules.

    Given POS manager is on the log in page
    When the POS manager enters username "posmanager50@info.com"
    And the POS manager enter password "posmanager"
    And the POS manager clicks the log in button
    Then account holder's name should be "POSManager50"

