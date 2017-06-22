Feature: Register
  In order to use barter
  As a Customer
  I want to register for an account

  Scenario: New customers should be able to register for an account
    Given I am new customer
    When I register for an account
#    Then