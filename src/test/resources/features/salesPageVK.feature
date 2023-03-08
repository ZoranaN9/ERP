@vicky
Feature: Sales page functionality
  Agile Story: As a manager, I should be able to get correct information on the Sales page.

  @smoke
  Scenario: As a POS manager I see 6 table columns on the Sales Page
    Given posManager is on the login page enters username and password and clicks login button
    When posManager clicks Sales option
    Then posManager sees 6 table columns with quotations

  @regression
    Scenario: As a Sales manager I see 6 table columns on the Sales Page
      Given salesManager is on the login page enters username and password and clicks login button
      When salesManager clicks Sales option
      Then salesManager sees 6 table columns with quotations
