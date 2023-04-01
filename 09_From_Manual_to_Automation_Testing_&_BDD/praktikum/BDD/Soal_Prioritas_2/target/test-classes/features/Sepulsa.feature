Feature: Sepulsa Login and Top Up

  As a user
  I want to access some feature on sepulsa.com
  So that I can topup balance

  Scenario: User successfully logged in and top up balance

    Given User is on Sepulsa homepage
    When User clicks on Login button
    And User enters valid email and password
    And User clicks on Login button
    Then User should be redirected to Sepulsa dashboard
    When User clicks on Top Up button
    And User selects a product
    And User selects payment method
    And User completes the payment process
    Then User should receive a successful top up message