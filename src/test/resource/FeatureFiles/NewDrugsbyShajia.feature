@regression 
Feature: New Drugs functionality 
Background: 

	Given:The user is on the Drugs.com homepage. 

 Scenario: The User searches for New Drugs
	When the user clicks on new drugs
    Then user should get all new drugs related information