Feature: Promotion feature for eMAG client
  Background:
    Given I have navigated to eMAG home page
    And I accept site cookies
    And I go to the eMAG offers


  Scenario: Search for the offer of the day
    Then I should see the offers page

  Scenario: Search for the resealed offer
    When I click on the resealed offers
    Then I should see the resealed offers page
