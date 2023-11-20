Feature: Hari Libur Page
#TCC.HW.019
Scenario: Add Hari Libur
  Given User go to menu hari libur
  When User click button add form holiday
  And User input date holiday
  And User input description holiday
  And User click button add holiday
  Then User get text add holiday success

  #TCC.HW.020
  Scenario: Cancel Form Add Hari Libur
    Given User click button add form holiday
    Then User click cancel form add holiday

  #TCC.HW.021
    Scenario: Empty Form Add Holiday
      Given User click button add form holiday
      When User click button add holiday
      Then User get text fail

  #TCC.HW.022
  Scenario: Test Without Input Description Holiday
    Given User click button add form holiday
    When User input date holiday
    And User not input description holiday
    And User click button add holiday
    Then User get text please fill out this field

    #TCC.HW.023
  Scenario: Test Without Input Date Holiday
    Given User click button add form holiday
    When User not input date holiday
    And User input description holiday
    And User click button add holiday
    Then User get text fail

    #TCC.HW.024
  Scenario: Input Invalid Date Holiday
    Given User click button add form holiday
    When User input invalid date holiday
    And User input description holiday
    And User click button add holiday
    Then User get text fail add holiday









