@Task2 @android
Feature: list page

  Scenario: Long press on lit menu
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu
    And user do long press on list menu

  @test @tapMultiple
  Scenario: Tap multiple time on list menu
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user go to list menu
    And user do tap multiple time on text

  @Addition
  Scenario: User addition 2 number
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user on to calculator page
    And user input Angka Satu as  "5"
    And user input Angka Dua "5"
    And user click dropdown
    And user click arithmetic operation addition
    Then user click button equal
    And user successfuly addition

  @Division
  Scenario: User divison 2 number
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user on to calculator page
    And user input Angka Satu as  "10"
    And user input Angka Dua "2"
    And user click dropdown
    And user click arithmetic operation division
    Then user click button equal
    And user successfuly division

  @multiplication
  Scenario: User multiplication 2 number
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user on to calculator page
    And user input Angka Satu as  "2"
    And user input Angka Dua "2"
    And user click dropdown
    And user click arithmetic operation multiplication
    Then user click button equal
    And user successfuly multiplication

  @Subtraction
  Scenario: User subtraction 2 number
    Given user is on login page
    When user input username "admin"
    When user input password "admin"
    When user click button login
    Then user successfully login
    When user on to calculator page
    And user input Angka Satu as  "10"
    And user input Angka Dua "5"
    And user click dropdown
    And user click arithmetic operation subtraction
    Then user click button equal
    And user successfuly subtraction