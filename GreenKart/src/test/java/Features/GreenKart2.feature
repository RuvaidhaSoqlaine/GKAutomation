Feature: To verify the functionality of GreenKart Application

Scenario: Validation of Selected Items

Given Open Browser and Enter the website URL
When Select multiple product and add to cart
Then Click on cart icon
Then verify whether selected item is present in cart
Then Click cancel for third item
Then Click on proceed to checkout
Then without promo code click on apply button
Then with promo code click on apply button
And validate whether applied promo code is valid or not