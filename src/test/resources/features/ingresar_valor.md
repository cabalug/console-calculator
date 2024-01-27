```gherkin

Feature: Ingresar valor
  como estudiante de sistemas
  quiero ingresar un valor al sistema
  para calcular la suma de dos numeros enteros

  Scenario: Ingresar un numero entero positivo
    Given Juan ingreso al sistema
    When ingresa un numero entero positivo
    Then el numero es ingresado
    And Juan puede ingresar otro numero

  Scenario: Ingresar un numero entero negativo
    Given Juan ingreso al sistema
    When ingresa un numero entero negativo
    Then el numero es ingresado
    And Juan puede ingresar otro numero

  Scenario: Ingresar un numero decimal
    Given Juan ingreso al sistema
    When ingresa un numero decimal
    Then Juan es informado que: "El numero debe ser entero"
    And Juan puede ingresar otro numero

  Scenario: Ingresar letras
    Given Juan ingreso al sistema
    When ingresa una letra
    Then Juan es informado que: "El numero debe ser entero"
    And Juan puede ingresar otro numero

  Scenario: Ingresar caracteres especiales
    Given Juan ingreso al sistema
    When ingresa caracteres especiales
    Then Juan es informado que: "El numero debe ser entero"
    And Juan puede ingresar otro numero
```