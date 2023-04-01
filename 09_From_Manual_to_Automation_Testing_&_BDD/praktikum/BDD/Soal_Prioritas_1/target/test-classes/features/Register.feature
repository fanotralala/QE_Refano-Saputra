Feature: Register

  As a user
  I want to create an account
  So that I can login into linkedin homepage

  Scenario: As a user i have to able to success register
    Given I am on the register page
    When I am enter my email and password correctly
    And I click register button
    Then I am on the login page