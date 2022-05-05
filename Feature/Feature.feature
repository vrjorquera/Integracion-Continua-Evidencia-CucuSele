Feature: Realizacion de casos ingresando nombre de usuario y contraseña
Scenario: verificando de ingreso de sesión
Given Abrir Chrome
When ingresa Username "victor" y Password "1234"
Then inicia sesion