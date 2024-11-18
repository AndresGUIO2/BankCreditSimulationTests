Feature: Free Investment Simulator
  As a potential investor
  I want to simulate a free investment loan
  So that I can identify my capabilities

  Background:
    Given Pedro is on the Banco de Bogota homepage
    And he navigates to the free investment section

Scenario: Simulate free investment loan with a lower amount
  Given he is in the free investment loan simulator section
  When he enters an amount of 30000
  Then he should see a message of "El valor mínimo es de 400.000 pesos"


Scenario Outline: Simulate free investment loan with different amounts and different deadlines

  When he enters amount:
    | amount |
    | <amount> |
  And he selects deadline:
    | deadline |
    | <deadline> |
  Then he should see the monthly_fee

  Examples:
  | amount   | deadline |
  | 99999999 | 12       |
  | 1000000  | 12       |
  | 400000   | 12       |
  | 99999999 | 24       |
  | 1000000  | 24       |
  | 400000   | 24       |
  | 99999999 | 36       |
  | 1000000  | 36       |
  | 400000   | 36       |
  | 99999999 | 48       |
  | 1000000  | 48       |
  | 400000   | 48       |
  | 99999999 | 60       |
  | 1000000  | 60       |
  | 400000   | 60       |
  | 99999999 | 72       |
  | 1000000  | 72       |
  | 400000   | 72       |
