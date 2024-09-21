@regression @api
Feature: Store API Testing

Scenario: Store CRUD API
	
	Given Create store
	Then Get store
	Then Delete store