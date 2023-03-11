@wip_HA
Feature: POS manager access

  User Story:
  As a POS manager, I should be able to access to the main modules.
  @wip_HA
  Scenario: Verify the POS managers can access to 22 modules.

    Given the POS manager is on the log in page
    When the POS manager enters username "posmanager.username"
    And the POS manager enter password "posmanager.password"
    And the POS manager clicks the log in button
    Then account holder's name should be "POSManager50"

  #@wip_HA
  #Scenario: Verify the POS manager can access to 22 modules as he/she is already logged in

    When the POS manager clicks Discuss
    Then the POS manager has access to Discuss module

    When the POS manager clicks Calendar
    Then the POS manager has access to Calendar module

    When the POS manager clicks Notes
    Then the POS manager has access to Notes module

    When the POS manager clicks Contacts
    Then the POS manager has access to Contacts module

    When the POS manager clicks CRM
    Then the POS manager has access to CRM module

    When the POS manager clicks Sales
    Then the POS manager has access to Sales module

    When the POS manager clicks Website
    Then the POS manager has access to Website module

    When the POS manager clicks Point Of Sale
    Then the POS manager has access to Point Of Sale module

    When the POS manager clicks Purchases
    Then the POS manager has access to Purchases module

    When the POS manager clicks Inventory
    Then the POS manager has access to Inventory module

    When the POS manager clicks Manufacturing
    Then the POS manager has access to Manufacturing module

    When the POS manager clicks Repairs
    Then the POS manager has access to Repairs module

    When the POS manager clicks Project
    Then the POS manager has access to Project module

    When the POS manager clicks Events
    Then the POS manager has access to Events module

    When the POS manager clicks Surveys
    Then the POS manager has access to Surveys module

    When the POS manager clicks Employees
    Then the POS manager has access to Employees module

    When the POS manager clicks Attendances
    Then the POS manager has access to Attendances module

    When the POS manager clicks Leaves
    Then the POS manager has access to Leaves module

    When the POS manager clicks Expenses
    Then the POS manager has access to Expenses module

    When the POS manager clicks Maintenance
    Then the POS manager has access to Maintenance module

    When the POS manager clicks Fleet
    Then the POS manager has access to Fleet module

    When the POS manager clicks Dashboards
    Then the POS manager has access to Dashboards module
