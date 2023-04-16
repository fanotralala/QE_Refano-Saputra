Feature: Login
    As a user
    I want to login to the application
    So that I can access my account

    Scenario: Successful login with valid credentials
        Given I set valid POST api endpoints
        When I send POST HTTP request
        Then I receive valid HTTP response code 200

    Scenario: Failed to login with invalid credentials
        Given I set valid POST api endpoints
        When I send invalid password POST HTTP request
        Then I receive invalid HTTP response code 401
