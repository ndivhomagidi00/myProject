Feature: Add to Cart

  Scenario: Login to demo store and add item to cart
    Given i am on login page
    When i enter "standard_user" as username and "secret_sauce" as password
    When i click login button
    Then i should see Products displayed
    Then i navigate to cart
    Then i enter  "Ndivho" as firstname and "Magidi" as last name
    Then i enter "0173" as zip code
    Then i click the continue button
    And i validate my cart item name "Sauce Labs Backpack"
    Then i validate the success message "Thank you for your order!"
