Feature: Search feature for eMAG client

  Scenario Outline: Search for TV products
    Given I have navigated to eMAG home page
    And I accept site cookies
    And I search for the following TV <manufacture>
    Examples:
      | manufacture |
      | Samsung     |

  Scenario Outline: Search for Mobile Phone products
    Given I have navigated to eMAG home page
    And I accept site cookies
    And I search for the following Phone <manufacture>
    Examples:
      | manufacture |
      | Apple       |