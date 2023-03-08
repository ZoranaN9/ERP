Feature: Login functionality test


  Scenario Outline: Login with valid credential
    Given the user is on the log in page
   When the user enter email "<email>"
   And the user enter pass "<pass>"
   And the user clicks the log in button
   Then user should see account holder "<name>"

    Examples:
      | email                       | pass             | name               |
      | posmanager55@info.com       | posmanager       | POSManager55       |
      | eventscrmmanager55@info.com | eventscrmmanager | EventsCRMManager55 |