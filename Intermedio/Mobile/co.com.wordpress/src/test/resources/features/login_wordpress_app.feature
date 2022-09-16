#language:es
@Test
  Característica: Ingreso a la App WordPress
    Como ususario
    Quiero ingresar exitosamente
    A la App WordPress

  @IngresoExitoso
  Escenario: Logueo exitoso en la App WordPress
    Dado que Yeison quiere ingresar a WordPress
    Cuando el ingresa el ingresa las credenciales
    |correo                         |clave          |
    |gloria.ulloa@macroproyectos.com|L;2vT;STpb6qKDu|
    Entonces el ve el mensaje
    |mensaje    |
    |gloriaulloa|