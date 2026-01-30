#Author: Tanmay 

Feature: Searching On Browser and Test login functonality 
@run
Scenario: Validating Search is workinn

Given Browser is open1
And Cursor is in text box1
When user write some text to search1
Then User will get search results1 



@run2
Scenario Outline: Check login is successfull 
Given  chrome browser is open1
And user is on login page1
When user1 enters <username> and <password>
And user clicks on login1
Then user is navigated to the page1 


Examples:
    |username|password|
    |standard_user |secret_sauce|
    |locked_out_user|secret_sauce|
    

