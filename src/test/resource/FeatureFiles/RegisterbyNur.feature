@regression
Feature: User Registration

Background:
Given: The user is on the Drugs.com homepage

Scenario: Successful registration with valid details
When The user clicks on the Register on the top of the page
And Enters the email address on the textbox
And Clicks on Continue with email button
And Clicks on I Do not consent button
Then Health Privacy Consent and go back button should be displayed 