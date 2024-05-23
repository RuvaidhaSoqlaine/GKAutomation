Feature: To verify the fuctionality of the Flight Booking Application

Scenario: Verify whether user can navigate to flight booking pageand try to book a filght.

Given Open browser and enter url
When click on flight booking link
Then Enter text on country text and select the country from picklist
Then click on fligts title
Then check mark on round trip radio button
Then under FROM click on departure city and select city
Then under TO click on arrival city and select city
Then click on departure date picklist and select the date
Then click on return date picklist and select the date
Then click on passengers dropdown button and click adult twice and child once and infant once and click done button
Then click on dropdown button under currency and select INR
Then click on family and friends radio button
Then click on search button
Then validate the pop up is displayed with text
And click on OK button in the pop up 

 













