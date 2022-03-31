Feature: Orange HRM functionality scenarios

  @smoke @LoginWithoutParam @regression
  Scenario: Login to Orange HRM
  Given The user wants to go to orangeHRM application
  When The user wants to enter username and password
  Then The user wants to click login
  And The user should be able to navigate dashboard

  @TC100
  Scenario: Add new personal
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to PIM page
    Then The user wants to see add employee page
    Then The user wants to add user name as "Okan"
    Then The user wants to add last name as "Sezgin"
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"

  @TC200
  Scenario: Add new personal
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard
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

  @TC300
  Scenario: Add new personal
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to PIM page
    Then The user wants to see add employee page
    Then The user wants to add an employee in a list way
      |Tommm123| Jerryyyyy|
    Then The user wants to add login details in a list way
      |renastech0 | RenasTech2021 |Disabled|
      |renastech1 | RenasTech2022 |Disabled|
      |OkanSezgin | Dersim621992  |Disabled|
      |renastech3 | RenasTech2024 |Disabled|
    Then The user wants to save the information
    Then The user should be able to see "Personal Details"

  @Scenario_Outline
  Scenario Outline:Add new nationalities to Nationalities page in Orange HRM Project
    Given The user wants to go to orangeHRM application
    When The user wants to enter username and password
    Then The user wants to click login
    And The user should be able to navigate dashboard
    Then The user wants to go to Admin page
    And The user wants to go to Nationalities section
    Then The user wants to add new nationalities
    Then The user wants to add nationalities as "<Nationalities>"

    Examples:
      |Nationalities  |
      |Aramaic        |
      |Spartan        |
