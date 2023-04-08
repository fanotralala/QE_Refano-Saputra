Feature: Select Product ListrikPLN

    Scenario: Input correct nomor meter and correct nomor handphone
        Given I am on the home page
        When I click Isi Pulsa product
        And I enter correct nomor handphone
        Then I should be redirected to select nominal

    Scenario: Input invalid nomor handphone
        Given I click Isi Pulsa product
        And I enter invalid nomor handphone
        When I click nominal pulsa
        Then I should see the warning message