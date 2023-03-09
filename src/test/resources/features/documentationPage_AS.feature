Feature: Accessing documentation page

  Scenario: Verify Odoo documentation

    Given User is on the Home page
    When User is able to click on account holder name
    And  User is able to click on Documentation button
    Then User is able to see 4 main documentation topics

