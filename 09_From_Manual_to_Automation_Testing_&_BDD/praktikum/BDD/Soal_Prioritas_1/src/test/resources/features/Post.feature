Feature: Post

  As a user
  I want to post something
  So that I can share my achievement

  Scenario: As a user i have to able to post on main page
    Given I am on the main page
    When I am enter my status correctly
    And I click post button
    Then I can see the post