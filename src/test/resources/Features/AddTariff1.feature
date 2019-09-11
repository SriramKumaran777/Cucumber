Feature: Add Tariff

  Scenario:
     Given  user should be in the Telecome homepage
    And user should be click on Add Tariff
    When User should be fill all the field with valid data
    And user should be click on submit button
    Then Add Tariff should be displayed
    
    Scenario:
     Given  user should be in the Telecome homepage
    And user should be click on Add Tariff
    When User should be fill all the field with valid datas
    |100|100|100|100|100|100|1|
    And user should be click on submit button
    Then Add Tariff should be displayed
    
    Scenario:
     Given  user should be in the Telecome homepage
    And user should be click on Add Tariff
    When User should be fill all the field with valid datas.
    |a|100|
    |b|100|
    |c|100|
    |d|100|
    |e|100|
    |f|100|
    |g|1|
    And user should be click on submit button
    Then Add Tariff should be displayed