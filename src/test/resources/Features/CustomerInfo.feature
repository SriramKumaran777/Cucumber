
Feature: AddCustomerDetails
 

  Scenario: 
    Given User in the Telecome homepage
    And user should click on Add Customer
    When User should fill all the field with valid data
    And user should click on submit button
    Then Customer ID should be displayed
    
    Scenario: Title of your scenario
     Given User in the Telecome homepage
    And user should click on Add Customer
    When User should fill all the field with valid datas
    |Sriram|Kumaran|sriram.k5@cognizant.com|Kumbakonam|8883080622|
    And user should click on submit button
    Then Customer ID should be displayed
    
  Scenario: Title of your scenario
     Given User in the Telecome homepage
    And user should click on Add Customer
    When User should fill all the field with valid datas.
    |fname|Sriram | 
    |lname|Kumaran| 
    |email|sriram.k5@cognizant.com|
    |address|Kumbakonam|   
    |mobno|8883080622|
    And user should click on submit button
    Then Customer ID should be displayed

