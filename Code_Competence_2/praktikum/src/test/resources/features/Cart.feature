Feature: Cart
    As a user
    I want to view all the products in my cart
    So that I can review my order and make changes

    Scenario: View cart that id number is 1
        Given I set GET cart api endpoints
        When I send a GET request to the cart API endpoint
        Then I should receive a response with status code 200
        And I receive valid data of the cart

    Scenario: View cart with invalid API endpoint
        Given I set invalid GET cart api endpoints
        When I send a GET cart request to an invalid API endpoint
        Then I receive valid HTTP response code 200
        And I receive empty content