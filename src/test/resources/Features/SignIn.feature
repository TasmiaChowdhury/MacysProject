Feature: Sign in functionality test

  Scenario: User should be able to sign in with a valid userName and passward
    Given user is on sign in page
    When user enters user email
    And user enter user passward
    And user click on submit button
    Then user is navigated to Macys home page
