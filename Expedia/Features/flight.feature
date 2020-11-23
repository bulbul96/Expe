Feature: Expedia flightbooking 
Scenario: Flightbooking functionality test
Given user is on the Expedia homepage
When user clicks on flight
And User clicks on roundtrip
And User chooses economic class
And user enters departure airport
And User enters arrival airport
And User chooses departure date and month
And User chooses returning date and month
And User clicks on search button
Then User gets some search results

