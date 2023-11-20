Feature: Event Date Page
  #TCC.HW.001
  Scenario: Event Date
    Given User go to menu event date
    When User click button add event
    And User input name event
    And User input date event
    And User input start date event
    And User input end date event
    And User click button add
    Then User get text add event date success

    #TCC.HW.002
  Scenario: Close Form Event Date
    Given User click button add event
    Then User click button cancel form add

      #TCC.HW.003
  Scenario: Test Without Event Name
    Given User click button add event
    When User not input name event
    And User input date event
    And User input start date event
    And User input end date event
    And User click button add
    Then User get text Please fill out this field

     #TCC.HW.004
  Scenario: Test Without Event Date
    Given User click button add event
    When User input name event
    And User not input date event
    And User input start date event
    And User input end date event
    And User click button add
    Then User get text Please fill out this field

     #TCC.HW.005
  Scenario: Test Without Start Date
    Given User click button add event
    When User input name event
    And User input date event
    And User not input start date event
    And User input end date event
    And User click button add
    Then User get text Please fill out this field

     #TCC.HW.006
  Scenario: Test Without End Date
    Given User click button add event
    When User input name event
    And User input date event
    And User input start date event
    And User not input end date event
    And User click button add
    Then User get text Please fill out this field

 #TCC.HW.007
  Scenario: Test Empty Form Add Event Date
    Given User click button add event
    When User not input name event
    And User not input date event
    And User not input start date event
    And User not input end date event
    And User click button add
    Then User get text Please fill out this field

     #TCC.HW.008
  Scenario: Test Wrong Year Start Date
    Given User click button add event
    When User input name event
    And User input date event
    And User input wrong start date event
    And User input end date event
    And User click button add
    Then User get text fail add event date

    #TCC.HW.009
  Scenario: Test Wrong Year End Date
    Given User click button add event
    When User input name event
    And User input date event
    And User input start date event
    And User input wrong end date event
    And User click button add
    Then User get text fail add event date

    #TCC.HW.010
  Scenario: Test Wrong Year End Date
    Given User click button add event
    When User input name event
    And User input date event
    And User input wrong start date event
    And User input wrong end date event
    And User click button add
    Then User get text fail add event date

    #TCC.HW.011
  Scenario: Test Invalid Date Event
    Given User click button add event
    When User input name event
    And User input date event
    And User input invalid start date event
    And User input invalid end date event
    And User click button add
    Then User get text add event date fail

    #TCC.HW.012
  Scenario: Test Edit Event Date
    Given User go to menu edit
    When User clear name event
    And User clear date event
    And user input edit name event
    And User input edit date event
    And User click button save
    Then User get text edit event date success


    #TCC.HW.013
  Scenario: Test Cancel Form Edit Event Date
    Given User go to menu edit
    When User clear name event
    And User clear date event
    And user input edit name event
    And User input edit date event
    Then User click button cancel form edit


    #TCC.HW.014
  Scenario: Test Empty Date Edit Event
    Given User click menu edit
    When User clear name event
    And User clear date event
    And user input edit name event
    And User not input edit date Event
    And User click button save
    Then User get text Please fill out this field

    #TCC.HW.015
  Scenario: Test Empty Form Edit Event
    Given User click menu edit
    When User clear name event
    And User clear date event
    And User click button save
    Then User get text Please fill out this field

    #TCC.HW.016
  Scenario: Test Cancel Delete Event Date
    Given User click menu delete
    Then User click button no

     #TCC.HW.017
  Scenario: Test Delete Event Date
    Given User click menu delete
    Then User click button yes

    #TCC.HW.018
  Scenario: Test Show Page Event Date
    Given User click button show page
    When User click button show page two
    Then User get data event date













