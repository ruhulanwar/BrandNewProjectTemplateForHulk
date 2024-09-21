@regression 
Feature: Drugs A-Z

Background: 

	Given: Browse to drugs.com

  Scenario:  User searches for drugs starting with Ab
  
	When Click on Drugs A-Z
	And Click on alphabet A
	And Click on letter Ab
  Then User should get all drugs starting with Ab as a result
	