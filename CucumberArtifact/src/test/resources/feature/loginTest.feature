Feature: Test login functonality 

Scenario Outline: Check login is successfull 
Given  chrome browser is open
And user is on login page
When user enters <username> and <password> 
And user clicks on login 
Then user is navigated to the page 


Examples:
    |username|password|
    |standard_user |secret_sauce|
    |locked_out_user|secret_sauce|
    