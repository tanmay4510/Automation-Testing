Feature: Complete End-to-End Flow in OrangeHRM

  Scenario: Login, Add Employee, and Add User

    Given user is logged into OrangeHRM
    
     When user adds a new user in Admin module
    
    When user adds a new employee in PIM module
    Then employee should be created successfully

   
    
