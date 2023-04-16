Feature: User
    
    As an admin
    I want to see list of post
    So that I can update post

Scenario: PUT - As admin I have be able to update existing post
    Given I set PUT api endpoints
    When I send PUT HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for update post

Scenario: PUT - As admin I haven't be able to update existing post
    Given I set typo PUT api endpoints
    When I send typo PUT HTTP request
    Then I receive valid HTTP response code 200