Feature: This feature allows to test Airbnb your home functionality

  Background:
    Given user opens website
    When user closes the pop up

    Scenario: Verify user can open homes page
      When user clicks on airbnb your home button
      Then verify homes page is displayed

