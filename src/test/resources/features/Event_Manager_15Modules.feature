Feature: Event Manager 15 modules functionality

  @EventManager
  Scenario: As a Event Manager can select 15 modules
    When Event Manager is on the home page
    Then Event Manager can select "Discuss" modules
    Then Event Manager can see 'Congratulations, your inbox is empty' message on the Discuss page