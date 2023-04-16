Feature: User
    
    As an admin
    I want to see list of post
    So that I can get post

Scenario: GET - As admin I have be able to get detail post
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail post

Scenario: GET - As admin I haven't be able to get detail post
    Given I set typo GET api endpoints
    When I send typo GET HTTP request
    Then I receive valid HTTP response code 404

Scenario: GET - As admin I have be able to get detail post by id
    Given I set GET api endpoints by id
    When I send GET HTTP request by id
    Then I receive valid HTTP response code 200
    And I receive valid data for detail post by id

Scenario: GET - As admin I haven't be able to get detail post by id
    Given I set typo GET api endpoints by id
    When I send typo GET HTTP request by id
    Then I receive valid HTTP response code 404