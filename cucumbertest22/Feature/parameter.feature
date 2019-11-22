Feature: Login Action

Scenario Outline: Successful Login with Valid Credentials
	Given User is open the application
	When user clicks on to Login link
	And User enters "<username>" and "<password>"
	Then  Message displayed login Successfully
	
	Examples:
	|username|password|
	|aishwaryamusale123@gmail.com|Aish12|
	|aravindkumarguggilla@gmail.com|Aravind@123|
	
