@regression 
Feature: Contact Us functionality on drugs.com 

Background: 
	Given The user is on drugs.com Homepage. 
	
Scenario: User can fill out the form through contact us button on the homepage. 

	When  The user clicks on the Contact Us button 
	And  Clicks on the contact form 
	And Selects the app feedback/suggestion from the drop down. 
	And Fills out the Name,Email address and Message 
	And Selects the checkbox to accept the policy 
	And Clicks on the Submit button 
	Then Validates the Message Sent on the Page 
