Feature: Search functionality on drugs.com 

Background: 
	Given The user is on drugs.com Homepage. 
	
Scenario: User can search for Vitamin. 
	Given browse to drugs.com
	When Search for vitamin
	Then Item list should have only vitamin related products