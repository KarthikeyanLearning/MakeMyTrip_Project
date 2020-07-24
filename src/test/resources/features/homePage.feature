@HomePageTest 
Feature: Flight Booking portal feature validation 
Scenario: As a User, I should get the fares for entered Source and Destination 


	Given open browser and enter url 
	Then verify title of the page 
	Then enter the Source as "Delhi" and Destination as "Mumbai" 
