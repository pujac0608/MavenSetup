Feature: This is Login Test

  Scenario: Successful login with valid credentials
  
    Given User is on login page
    When User enters valid userid and password
    And User cicks on Login button
    Then User can be able to login successfully