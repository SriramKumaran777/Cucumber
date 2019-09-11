Feature: Add Tariff Plan in two dimensional

  Scenario:
     Given  user should be in the Telecome homepages
    And user should be click on Add Tariffs
    When User should be fill all the field with valid dataa
    And user should be click on submit buttons
    Then Add Tariff should be displayedd
    
 Scenario:
     Given  user should be in the Telecome homepages
    And user should be click on Add Tariffs
    When User should be fill all the field with valid dataas
    |100|100|100|100|100|100|1|
    |130|100|100|100|100|100|2|
    |150|100|100|100|100|100|3|
    |170|100|100|100|100|100|4|
    |200|100|100|100|100|100|5|
    And user should be click on submit buttons
    Then Add Tariff should be displayedd
   
    Scenario:
     Given  user should be in the Telecome homepages
    And user should be click on Add Tariffs
    When User should be fill all the field with valid dataas.
    |a  |b  |c  |d  |e  |f  |g|
    |100|100|100|100|100|100|1|
    |130|100|100|100|100|100|2|
    |150|100|100|100|100|100|3|
    |170|100|100|100|100|100|4|
    |200|100|100|100|100|100|5|
    And user should be click on submit buttons
    Then Add Tariff should be displayedd
     