Feature: Checkout

    Scenario: User cannot checkout without providing postal code
        Given I am on the shopping cart page
        When I click on checkout button
        And I do not provide postal code
        And I click on continue button
        Then I should see an error message for missing postal code