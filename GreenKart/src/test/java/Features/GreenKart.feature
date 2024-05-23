Feature: To verify the functionality of GreenKart Application

Scenario: Validation of Selected Items

Given Open Browser and Enter the url
When User should select the 10th item and click add to cart button
Then Click on cart button
Then validate selected item is present in cart
Then validate the price of selected item
And user quit the browser

