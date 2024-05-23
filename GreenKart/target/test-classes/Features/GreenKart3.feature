Feature: To verify the fuctionality of the GreenKart Application

Scenario: Validation of selected Items

Given Open Browser and enter url
When Select multiple products and add to the cart
Then click on cart logo
Then verify selected items are present in cart
Then click cancel for third and sixth item
Then click on proceed to checkout button
Then click on place oreder button
Then click on select country list and select as India
Then check mark on Agree to the terms and conditions checkbox
Then click on proceed to checkout
And validate whether user is displayed with Thank you message
