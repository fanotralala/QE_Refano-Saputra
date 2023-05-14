Feature: User
    
    As an admin
    I want to see list of post
    So that I can create new post 

Scenario: POST - As admin I have be able to create new post
    Given I set POST api endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new post
    
Scenario: POST - As admin I haven't be able to create new post
    Given I set typo POST api endpoints
    When I send typo POST HTTP request
    Then I receive valid HTTP response code 201