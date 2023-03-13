
Feature: Point of sale page functionality
  Agile story: POS manager at Point of sale page, should be click on orders

  Scenario: As a POS manager, I should be able to view the order list on the Point of Sale page.
    Given POS manager clicks orders option on side bar
    When click the checkbox
    Then all the orders should be checked





    Scenario: After order reference box checked, Action dropdown button should appear
      Given POS manager clicks orders option on side bar
      When click the checkbox
      And all the orders should be checked
     When POS manager clicks Action dropdown
     Then the Action drop down should have two options :  Export, Delete



