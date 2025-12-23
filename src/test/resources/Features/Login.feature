Feature: Verifying OMRBranch login 
Scenario Outline: Verifying Valid Credentials
Given User is on the OMRBranch page
When User enter "<userName>" and "<password>"
And User clicks the login button
Then User should verify after login success message

Examples:
   |userName|password|
   |m.sarathkumar1403@gmail.com|Sarath@2003|
   
