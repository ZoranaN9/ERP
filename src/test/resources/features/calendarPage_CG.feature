Feature: Calendar page functionality
  Agile Story: As a user, I want to access to the calendar page
@chris
  Scenario: As a users I see time list by default from 0:00 — to 23:00
    Given User is on the login page enters username and password and clicks login button
    When User clicks Calendar option
    Then User should sees below time list by default
      | 0:00  |

      #| 1:00  |
      #| 2:00  |
      #| 3:00  |
      #| 4:00  |
      #| 5:00  |
      #| 6:00  |
      #| 7:00  |
      #| 8:00  |
      #| 9:00  |
      #| 10:00 |
      #| 11:00 |
      #| 12:00 |
      #| 13:00 |
      #| 14:00 |
      #| 15:00 |
      #| 16:00 |
      #| 17:00 |
      #| 18:00 |
      #| 19:00 |
      #| 20:00 |
      #| 21:00 |
      #| 22:00 |
      #| 23:00 |


  Scenario: As a users I see time list increase by one our each time.
    Given User is on the login page enters username and password and clicks login button
    When User clicks Calendar option
    Then User sees time list increase by one our each time.