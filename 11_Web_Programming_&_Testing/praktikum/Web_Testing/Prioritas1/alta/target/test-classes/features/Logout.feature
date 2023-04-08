Feature: Logout after checkout
    As a user
    I want to be able to logout after completing my purchase
    So that my session is securely closed

    Scenario: Logout after completing checkout
        Given I am on the checkout page
        When I have completed the checkout process
        And I click on the Back Home button
        And I click on the Menu button
        And I click on the Logout button
        Then I should be logged out of my account and redirected to the login page