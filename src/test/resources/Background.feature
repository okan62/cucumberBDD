Feature: explain how background is works

  Background: : User navigates to orange HRM dashboard
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard

    Scenario: User wants to add employee
    Then The user wants to go to PIM page
    Then The user wants to see add employee page
    Then The user wants to add user name as "Okan"
    Then The user wants to add last name as "Sezgin"
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"


  Scenario: Add new personal
    Then The user wants to go to PIM page
    Then The User wants to see add employee page
      |FirstName|Tomy1231553  |
      |LastName |Jerrry123169123|
    Then The user wants to add login details
      |User Name   |Serrkanozclk123|
      |Password    |Errkans!123  |
      |Status      |Disabled   |
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"