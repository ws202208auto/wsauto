#language:es
@Regresión
Característica: Logueo en Banca Personas
    Como Cliente
    Quiero acceder a la Banca personas
    Para realizar Transacciones

  Antecedentes: Logueo APP
    Dado que el CLiente Abre La App

  @Escenario1
  Escenario: Logueo Exitoso banca Personas
    Cuando él ingresas las credenciales correctas
    Entonces él ve el mensaje Bienvenido a la Banca Personas

  @Escenario2
  Escenario: Logueo Fallido banca Personas
    Cuando él ingresas las credenciales incorrectas
    Entonces él ve el mensaje Credenciales Erroneas

  @Escenario3
  Esquema del escenario: Login en Banca Personas
    Cuando él ingresar el <usuario> y la <clave>
    Entonces él verifica el <mensaje>
    Ejemplos:
    |usuario        |clave        |mensaje                              |
    |correcto       |correcta     |Bienvenido a la Banca Personas       |
    |erroneo        |erronea      |Error con el usuario y/o clave       |
    |               |erronea      |Debe ingresar un nombre de usuario   |
    |correcto       |             |Debe ingresar una clave              |

  @Escenario4
  Escenario: Login en Banca Personas
    Cuando él ingresar el <usuario> y la <clave>
    |correcto       |correcta        |
    |correcto       |correcta        |
    |correcto       |correcta        |
    |correcto       |correcta        |
    |correcto       |correcta        |
    |correcto       |correcta        |
    Entonces él verifica el <mensaje>
    |Bienvenido a la App Personas    |

