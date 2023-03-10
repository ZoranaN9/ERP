Feature: Repairs page functionality
  Agile Story: As a POS  & sales manager, I want to access the Repairs page.


  Scenario: As a user1, I see 6 table columns on the Repairs Page
    Given posManager1 is on the home page
    When posManager1 can click Repairs option
    Then posManager1 sees 6 table columns