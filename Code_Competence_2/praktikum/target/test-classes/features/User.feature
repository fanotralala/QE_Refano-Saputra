Feature: User
    As a user
    I want to view my account information
    So that I can update my profile and view my orders

    Scenario: View number 1 user information
        Given I set GET user api endpoints
        When I send a GET request to the user API endpoint
        Then I receive valid HTTP response code 200
        And I receive valid data of the user

    Scenario: View user with invalid API endpoint
        Given I set invalid GET user api endpoints
        When I send a GET user request to an invalid API endpoint
        Then I receive valid HTTP response code 200
        And I receive empty content