@regression 
Feature: Side Effects functionality 
Background: 

	Given:The user is on the Drugs.com homepage. 

 Scenario: The User searches Side Effects for Adderall
	When the user clicks on Side Effects
	And enters the drug name 
	And clicks on the search button 
    Then the Side Effects is provided. 
	