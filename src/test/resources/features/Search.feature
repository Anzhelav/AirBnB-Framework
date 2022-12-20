Feature: This feature allows to test Search functionality

  Background:
    Given user opens website
    When user closes the pop up


  Scenario Outline: Verify user can add destination in search functionality
    When user clicks on search icon
    And user inputs "<where>" field
    And user clicks on search button
    Then verify search results are displayed
    Examples:
      | where       |
      | Miami       |
      | Los Angeles |

  Scenario: Verify user can add quests in search functionality
    When user clicks on add guests button
    And user clicks on plus button two times
    And user click on search button
    Then verify search results for two guests are displayed

    Scenario: Verify user can select lakefront icon