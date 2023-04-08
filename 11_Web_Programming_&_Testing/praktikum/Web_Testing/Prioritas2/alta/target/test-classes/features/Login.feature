Feature: Login to Sepulsa Account

    Scenario: Login with correct credentials
        Given I am on the Sepulsa login page
        When I click login button
        And I enter correct email
        And I enter correct password
        When I click on the submit button
        Then I should be redirected to my Sepulsa account dashboard

    Scenario: Login with incorrect password
        Given I am on the Sepulsa login page
        When I click login button
        And I enter correct email
        And I enter incorrect password
        When I click on the submit button
        Then I should see the error message
