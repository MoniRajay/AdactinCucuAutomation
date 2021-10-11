Feature: Validting the booking of hotel in Adactin Web Application

Scenario: Validate the room booking in adactin
Given User is in Adactin Web page
When user enters username and password
And clicks on login
Then validate it is in search hotel page

When user enters location, hotel, roomtype
And clicks on submit button
Then validate it is in select hotel page

When user clicks on radio button and continue button
Then validate it is in book hotel page

When user enters firstname, lastname, address and creditcardnum
When user slects creditcardtype, expmonth, expyear and enters cvvnum
And clicks on book hotel button
Then validate the order id is displayed


