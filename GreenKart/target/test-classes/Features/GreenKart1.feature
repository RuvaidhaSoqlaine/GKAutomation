Feature: To verify the functionality of GreenKart Application

Scenario: Validation of Selected Items

Given Open Browser and Enter url of the website
When Click on search bar and enter product to be searched and click on search button
Then Click on increment
Then click on add to cart button
Then click on cart icon
Then validate the selected items is present in the cart
Then validate the price of selected item is calculated accordingly
