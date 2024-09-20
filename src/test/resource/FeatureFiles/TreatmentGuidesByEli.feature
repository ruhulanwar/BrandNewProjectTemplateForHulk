@regression 
Feature: Treatment Guides functionality 
Background: 

	Given:The user is on the Drugs.com homepage. 

  Scenario:  The User searches for cancer information
	When clicks on treatment guides link
	And enter cancer in the textbox
	And click on search button
	Then all information about cancer should be displayed
	
	
	
