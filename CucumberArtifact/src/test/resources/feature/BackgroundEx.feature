Feature: Sample Feature 

Background:
      Given Url for home Page
      
      @First
      Scenario:First Sceanario
      When Correct username and password 
      Then Login Successful
      
      @Second
      Scenario:Second cenario 
      When blank username 
      Then Login Failed