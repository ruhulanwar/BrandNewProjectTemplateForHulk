@regression 
Feature: Side Effects functionality 
Background: 

	Given:The user is on the Drugs.com homepage. 

  Scenario: User searches Side Effects for Adderall
	When the user clicks on Side Effects
	And enters Adderall in the search box 
	And clicks on the search
    Then the  Adderall Side Effects is provided