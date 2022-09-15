#language:es
@Test
  Característica: Ingreso a la App Eribank
    Como ususario
    Quiero ingresar exitosamente
    A la App Eribank

  @IngresoExitoso
  Escenario: Logueo exitoso en la App Eribank
    Dado que Yeison quiere ingresar a Eribank
    Cuando el ingresa el usuario company y la clave company
    Entonces el ve el mensaje Your balance is