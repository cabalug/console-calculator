```gherkin

Feature: Ingresar valor
  como estudiante de sistemas
  quiero ingresar un valor al sistema
  para calcular la suma de dos números enteros

  Scenario: Ingresar un número entero positivo
    Given Juan ingreso al sistema
    When ingresa un número entero positivo
    Then el número es ingresado
    And Juan puede ingresar otro número

  Scenario: Ingresar un número entero negativo
    Given Juan ingreso al sistema
    When ingresa un número entero negativo
    Then el número es ingresado
    And Juan puede ingresar otro número

  Scenario: Ingresar un número decimal
    Given Juan ingreso al sistema
    When ingresa un número decimal
    Then Juan es informado que: "El número debe ser entero"
    And Juan puede ingresar otro número

  Scenario: Ingresar letras
    Given Juan ingreso al sistema
    When ingresa una letra
    Then Juan es informado que: "El número debe ser entero"
    And Juan puede ingresar otro número

  Scenario: Ingresar caracteres especiales
    Given Juan ingreso al sistema
    When ingresa caracteres especiales
    Then Juan es informado que: "El número debe ser entero"
    And Juan puede ingresar otro número
```