Feature: Add to Cart
    As a user
    I want to add items to my cart
    So that I can purchase them later

    Scenario: User Successfully add item to cart
        Given I am on the Saucedemo login page
        When I log in with valid credentials
        And I navigate to the products page
        And I select a product to add to my cart
        And I click Add to Cart button
        And I check my cart
        Then the item should be added to my cart