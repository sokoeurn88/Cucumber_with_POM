Feature: Techfios Application Test

Scenario: Validate Free CRM Home Page Test

	Given User opens browser
	When User is on Login Page
	Then User enters username and password
	Then User clicks on Login Button
	Then Home Page is displayed
	