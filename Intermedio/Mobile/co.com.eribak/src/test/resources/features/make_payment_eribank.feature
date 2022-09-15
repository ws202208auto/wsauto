#language:es
@Test
Característica: Realizar un pago a traves de la App Eribank
  Como ususario
  Quiero relizar un pago
  A traves de la App Eribank

  @PagoExitoso
  Escenario: Pago Exitoso en la App Eribank
    Dado que Yeison quiere realizar un pago en la app Eribank
    |usuario  |clave  |
    |company  |company|
    Cuando el diligencia los datos de la transacción
    |phone          |name         |country        |
    |3000001544     |Yeison A     |Colombia       |
    Entonces el ve el mensaje Your balance is