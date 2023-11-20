Feature: Laporan Semua Page
  #TCC.HW.032
  Scenario: Search With Input Name
    Given User go to menu laporan semua
    When User input name
    And User click button search
    Then User get data name

    #TCC.HW.033
  Scenario: Search With Filter
    Given User click button filter
    When User input job department
    Then User click button terapkan

    #TCC.HW.034
  Scenario:Search With Calendar
    Given User click icon calendar
    When User click start date
    And User click end date
    And User click button save calendar
    And User click button search
    Then User get data calendar

    #TCC.HW.035
  Scenario: Test Button Reset Calendar
    Given User click button reset
    Then User get text success reset calendar

    #TCC.HW.036
  Scenario: Test Invalid Search Input Name
    Given User input invalid name
    When User click button search
    Then User did not get data
