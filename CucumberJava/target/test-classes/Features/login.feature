@SmokeFeature
Feature: feature to test login functionality
  @smoketest
  Scenario: Check login is successfull with valid credentials
    Given user is on login page
    When user enters login and password
    And clicks on login button
    Then user is navigated to home page
