Feature: TestCase001
  Scenario: Add product to a basket
    Given I open shop website
    When I open first category
    And I choose second product
    And I click Add to cart button
    And I click check cart
    Then I see my product in cart