Feature: Customer Info

  Scenario Outline:
    Given User in the Telecome homepagess
    And user should click on Add Customerss
    When User should be fill all the field with valid datass"<fname>","<lname>","<email>","<address>","<mobno>"
    And user should click on submit buttonss
    Then Customer ID should be displayedss  
    
    Examples:
     |fname|lname|email       |address    |mobno     |
     |Sri  |Ram  |sr@gmail.com|Kumbakonam |1234567890|
     |Kumar|Ram  |kr@gmail.com|Chidambaram|1234567890|
     |Ram  |Kumar|rk@gmail.com|madurai    |1234567890|
     |Ashok|Kumar|ak@gmail.com|Nellai     |1234567890|