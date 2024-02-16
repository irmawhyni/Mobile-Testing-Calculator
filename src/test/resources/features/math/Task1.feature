@Task2 @android
Feature: Subtraction number

  Scenario: User subtraction 2 number
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user on to calculator page
    And user input Angka Satu as  "20"
    And user input Angka Dua "10"
    And user click dropdown
    And user click arithmetic operation subtraction
    Then user click button equal
    And user successfuly subtraction