
Feature: Repairs page functionality
  Agile Story: As a POS  & sales manager, I want to access the Repairs page.

  @wipjavad
  Scenario: As a user, I see 6 table columns on the Repairs Page
    Given posManager is on the home page
    When posManager can click Repairs option
    Then posManager sees 6 table columns



