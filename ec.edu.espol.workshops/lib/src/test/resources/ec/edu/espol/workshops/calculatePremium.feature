Feature: Calculate the insurance prime for a customer

  # First test scenario
  Scenario: The customer is a 40 years old married man with a license
    Given the customer is 40 years old 
    And the customer is married
    And the customer is a man
    And the customer has a license
    When calculate the premium
    Then show 300