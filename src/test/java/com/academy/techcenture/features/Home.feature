@test
Feature: Testing scenarios related to art home page
         User refers to the person interacting with the website
  Scenario: 1 The user clicks the lustre paper and select scilly peak print
    Given the user is on the home page
    When the user clicks the lustre paper collection
    And the lustre paper collection is displayed
    Then the user clicks the scilly peak print