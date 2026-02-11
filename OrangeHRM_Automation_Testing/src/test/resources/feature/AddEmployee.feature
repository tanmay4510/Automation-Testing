Feature: Add Employee

  Scenario: Add new employee
    Given user is logged into OrangeHRM
    When user adds a new employee in PIM module
    Then employee should be created successfully
