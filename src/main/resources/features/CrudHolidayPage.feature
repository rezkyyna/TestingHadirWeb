    #TCC.HW.025
    Scenario: Edit Data Holiday
    Given User go to menu edit holiday
    When User input edit date holiday
    And User input edit description holiday
    And User click button save data holiday
    Then User get text edit data holiday success

    #TCC.HW.026
    Scenario: Cancel Edit Data Holiday
    Given User go to menu edit holiday
    Then User click button cancel form edit holiday

    #TCC.HW.027
    Scenario: Test Without Input Description Edit
    Given User click menu edit holiday
    When User delete description
    And User click button save data holiday
    Then User get text please fill out this field

    #TCC.HW.028
    Scenario: Test Invalid Date Edit
    Given User click menu edit holiday
    When User input invalid date holiday
    And User click button save data holiday
    Then User get text fail edit data holiday

    #TCC.HW.029
    Scenario: Delete Data Holiday
    Given User click menu delete holiday
    Then User click button yes delete holiday

     #TCC.HW.030
    Scenario: Cancel Delete Data Holiday
    Given User click menu delete holiday
    Then User click button no delete holiday
