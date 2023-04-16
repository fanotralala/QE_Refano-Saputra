Feature: User
    
    As an admin
    I want to see list of post
    So that I can delete post

Scenario: DELETE - As admin I have be able to delete existing post
    Given I set DELETE api endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200

Scenario: DELETE - As admin I haven't be able to delete existing post
    Given I set DELETE to invalid api endpoints
    When I receive nothing from the page