Feature: Ultimatix login Feature

Scenario Outline: Ultimatix test scenario 

Given user is already on login Page
When title of login page
Then user enters "<username>" and "<password>"
Then User clicks on login button
Then user is on home page
Then close the browser

Examples:
	| username | password    |
	| 313308   | test        |

