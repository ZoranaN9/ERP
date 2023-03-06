Feature: Sales page functionality
  Agile Story: As a manager, I should be able to get correct information on the Sales page.

  Scenario: As a POS manager I see 6 table columns on the Sales Page
    Given posManager is on the login page
    When posManager enters username and password and clicks login button
    And posManager clicks Sales option
    Then posManager sees 6 table columns with quotations

    Scenario: As a Sales manager I see 6 table columns on the Sales Page
      Given salesManager is on the login page
      When salesManager enters username and password and clicks login button
      And salesManager clicks Sales option
      Then salesManager sees 6 table columns with quotations
