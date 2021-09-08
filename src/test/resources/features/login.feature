Feature: User will login


  Scenario: Login with valid credentials
    Given User is on the VyTrack login page
    When User enters correct "username" and "password"
    And User clicks Log In button
    Then User will be on the VyTrack homepage



