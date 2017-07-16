@Register
Feature: Register
  In order to use barter
  As a Customer
  I want to register for an account

  @newUser
  Scenario: New customers should be able to register for an account
    Given I am on the register page
    When I register for an account
#    Then