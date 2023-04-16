Feature: Products
    As a user
    I want to view all the products on the website
    So that I can browse and purchase products

    Scenario: View product that id number is 1
        Given I set GET products api endpoints
        When I send a GET request to the products API endpoint
        Then I receive valid HTTP response code 200
        And I receive valid data of the post

    Scenario: View products with invalid API endpoint
        Given I set invalid GET products api endpoints
        When I send a GET request to an invalid API endpoint
        Then I receive valid HTTP response code 200
        And I receive empty content