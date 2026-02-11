Feature: Add User

  Scenario: Add new user
    Given user is logged into OrangeHRM
    When user adds a new user in Admin module
    Then user should be added successfully
