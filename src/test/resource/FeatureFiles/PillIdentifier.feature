Feature: Pill Identifier functionality on drugs.com 

Background: 
	Given The user is on drugs.com Homepage. 
	
Scenario: User can search for a specific pill using pill identifier functionality. 
	Given browse to drugs.com
	When Click on the Pill Identifier
	And Click on the "Agree and Continue"
	And Search for the "Aspirin" Drug
	Then All items related to aspirin should display