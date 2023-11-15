#Author: fdejesuscorrea
  Feature: Consultar la pagina principal de la U de A
    Como estudiante de la U de A necesito buscar el homepage de la U
    en google para ingresar al sitio oficial

  Scenario: Buscar la pagina oficial de la UdeA en el motor de busqueda
    Given que me encuentro en la pagina principal de google
    When escripa la palabra U de A
    Then puedo ver el link de la pagina oficial