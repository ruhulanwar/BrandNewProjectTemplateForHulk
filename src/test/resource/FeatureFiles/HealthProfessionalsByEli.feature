@regression 
Feature: Treatment Guides functionality 
Background: 

	Given:The user is on the Drugs.com homepage. 

  Scenario:  The User searches for insulin information
	When clicks on Health Professionals link
  And enter Insulin in the textbox
  And click on search button
  Then all information about insulin should be displayed
	
	
	
