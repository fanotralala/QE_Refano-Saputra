Feature: User
    
    As an admin
    I want to see list of user
    So that I can create new user

Scenario: GET - As admin I have be able to get detail post
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for detail post

Scenario: GET - As admin I haven't be able to get detail post
    Given I set typo GET api endpoints
    When I send typo GET HTTP request
    Then I receive valid HTTP response code 404

Scenario: POST - As admin I have be able to create new post
    Given I set POST api endpoints
    When I send POST HTTP request
    Then I receive valid HTTP response code 201
    And I receive valid data for new post
    
Scenario: POST - As admin I haven't be able to create new post
    Given I set typo POST api endpoints
    When I send typo POST HTTP request
    Then I receive valid HTTP response code 201

Scenario: GET - As admin I have be able to get detail post by id
    Given I set GET api endpoints by id
    When I send GET HTTP request by id
    Then I receive valid HTTP response code 200
    And I receive valid data for detail post by id

Scenario: GET - As admin I haven't be able to get detail post by id
    Given I set typo GET api endpoints by id
    When I send typo GET HTTP request by id
    Then I receive valid HTTP response code 404

Scenario: PUT - As admin I have be able to update existing post
    Given I set PUT api endpoints
    When I send PUT HTTP request
    Then I receive valid HTTP response code 200
    And I receive valid data for update post

Scenario: PUT - As admin I haven't be able to update existing post
    Given I set typo PUT api endpoints
    When I send typo PUT HTTP request
    Then I receive valid HTTP response code 200

Scenario: DELETE - As admin I have be able to delete existing post
    Given I set DELETE api endpoints
    When I send DELETE HTTP request
    Then I receive valid HTTP response code 200

Scenario: DELETE - As admin I haven't be able to delete existing post
    Given I set DELETE to invalid api endpoints
    When I receive nothing from the page