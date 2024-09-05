@regression 
Feature: Drugs A-Z

Background: 

	Given: Browse to drugs.com

  Scenario:  User searches for Tylenol using advanced search
  
	When Click on Advanced Search
	And Enter Tylenol on textbox
	And Select Exact Phrase from dropdown
	And Click on Clear all selections
	And Click on Search button
  Then User should get all Tylenol related information as a result
	