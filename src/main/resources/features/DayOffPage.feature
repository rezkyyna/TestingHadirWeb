Feature: Day Off Page
#TCC.HW.031
  Scenario: Show Day Off Page
    Given User enter URL Hadir
    When User login
    And User go to menu management
    And User go to menu day off
    Then User get text data of day off