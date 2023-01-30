Feature: Calculation

  @test
  Scenario: Minus calculation
    When user calculates 5 "minus" 2
    Then user sees result is 3

  @test1
  Scenario: Verify negative
    And user verifies -3 is "negative"
    And user verifies 1 is "positive"