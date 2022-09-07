#language:es
@Feature
Característica: Acceder al aplicativo METIS
  Como usuario
  Quiero Autenticarme en Metis
  Para tener acceso a la App

  @LoginExitoso
  Escenario: Login Exitoso En Metis
    Dado que Yeison quiere ingresar a Metis
    Cuando  el escribe el usuario ejercicio y la clave ejercicio
    Entonces el ve el mensaje Bootstrap-Admin-Template

  @LoginExitoso2
  Escenario: Login Exitoso En Metis
    Dado que Yeison quiere ingresar a Metisq
    Cuando  el escribe el usuario ejercicio y la clave ejercicioq
    Entonces el ve el mensaje Bootstrap-Admin-Templateq
