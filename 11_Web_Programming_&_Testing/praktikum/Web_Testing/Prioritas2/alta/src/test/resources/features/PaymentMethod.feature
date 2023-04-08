Feature: Select Payment Method

    Scenario: Select Payment Method Dana After Choosing Product
        Given I am on the Isi Pulsa Page
        When I am input nomor handphone
        And I choose the Nominal of Pulsa
        Then I select the payment method with DANA

    Scenario: Not choosing a Payment Method After Selecting a Product
        Given I already login with correct account sned go to the Isi Pulsa Page
        When I am input nomor handphone
        And I choose the Nominal of Pulsa
        When I do not select any payment method and click Bayar Sekarang button
        Then I should see a reminder message