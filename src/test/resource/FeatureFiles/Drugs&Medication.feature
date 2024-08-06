@regression 
Feature: Drug & Medication functionality 
Background: 

	Given:The user is on the Drugs.com homepage. 

 Scenario: The User searches for Metformin information
	When the user clicks on Drugs & Medication 
	And enters the drug name 
	And clicks on the search button 
    Then the drug information is provided. 
	
	
	
