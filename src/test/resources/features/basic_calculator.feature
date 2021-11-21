Feature: calculator operations

  @Test
  Scenario Outline: calculator operations successfully
    Given the user enters main page
    When the user performs the operations on the calculator
      | build   | first_number   | second_number   | operation   |
      | <build> | <first_number> | <second_number> | <operation> |
    Then the user makes the calculation successfully
      | answer   |
      | <answer> |

    Examples:
      | build     | first_number | second_number | operation   | answer    |
          ##@externaldata@./src/test/resources/datadriven/test.xlsx@endtoend@
      | 1         | 5            | 5             | Add         | 10        |
      | Prototype | 10           | 2             | Subtract    | 8         |
      | Prototype | -3           | 10            | Add         | 7         |
      | Prototype | 5            | 2             | Multiply    | 11        |
      | 1         | 8            | 4             | Divide      | 2         |
      | 1         | Hola         | Mundo         | Concatenate | HolaMundo |
