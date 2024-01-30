```gherkin

Feature: Ingresar valor
  como estudiante de sistemas
  quiero ingresar un valor al sistema
  para calcular la suma de dos números enteros

  Background:
    Given Juan ingresó al sistema

  Scenario Outline: Ingresar un número entero
    When cuando ingresa un número: <valor>
    Then el número es ingresado
    And Juan puede ingresar otro número
    Examples:
      | valor           |
      | Entero positivo |
      | Entero negativo |

  Scenario Outline: Ingresar valores inválidos
    When ingresa un valor: <valor>
    Then Juan es informado que: "El número debe ser entero"
    And Juan puede ingresar otro número
    Examples:
      | valor             |
      | carácter especial |
      | número decimal    |
      | letra             |
```