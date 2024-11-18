Feature: Home Loan Simulator
  As a potential home buyer
  I want to simulate a home loan
  So that I can understand my borrowing capacity

  Background:
    Given Juan is on the Banco de Bogota homepage
    And he navigates to the home loan section

  Scenario Outline: Simulate home loan with different incomes and ages
    When he enters monthly income:
      | initial_income |
      | <initial_income>|
    And he enters age:
      | initial_age |
      | <initial_age>|
    And he enters simulation details:
      | monthly_income   | age   | term   |
      | <sim_income>     | <sim_age> | <years> |
    Then he should see loan information:
      | loan_amount   | monthly_payment   | interest_rate   | initial_fee   |
      | <amount>      | <payment>         | <rate>         | <fee>         |

    Examples:
      | initial_income | initial_age | sim_income | sim_age | years | amount        | payment     | rate    | fee         |
      | 8000000       | 20          | 15000000   | 25      | 20    | 156.000.000  | 1.750.698  | 12.28%  | 9.000.000  |
      | 10000000      | 30          | 18000000   | 35      | 15    | 180.000.000  | 2.100.500 |12.28%   | 9.000.000  |