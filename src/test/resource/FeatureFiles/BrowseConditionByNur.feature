@regression
Feature: Drug Browse Condition

Background: Given: The user is on drugs.com homepage.

Scenario: The user browses  condition
When  User clicks on Browse Conditions on the homepage
And User clicks on Alphabet A below the condition
And Clicks on Abdominal Pain under Common heading
Then user should get all information realted to abdominal pain