Feature: User valid login


  @scenarioOutline
  Scenario Outline: Verify user information<email>
    Given the user is on the login page
    When the user enter username "<email>"
    And the user enter password "<password>"
    And the user clicks the log in button
    And the user should be able to log in
    Then account holder name should be "<name>"

    @pos
    Examples:
      | email                 | password   | name         |
      |posmanager55@info.com  | posmanager | POSManager55 |
      |posmanager67@info.com  | posmanager | POSManager67 |
      |posmanager89@info.com  | posmanager | POSManager89 |

    @crm
    Examples:
      | email                      | password         | name               |
      |eventscrmmanager55@info.com | eventscrmmanager | EventsCRMManager55 |
      |eventscrmmanager67@info.com | eventscrmmanager | EventsCRMManager67 |
      |eventscrmmanager89@info.com | eventscrmmanager | EventsCRMManager89 |
