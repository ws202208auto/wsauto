#language:es
@Feature
Característica: Acceder al aplicativo METIS
  Como usuario
  Quiero Autenticarme en Metis
  Para tener acceso a la App

  @LoginExitoso
  Escenario: Login Exitoso En Metis
    Dado que Yeison quiere ingresar a Metis
    Cuando  el escribe el usuario papa y la clave padadasfsddfsdfsdf*
    Entonces el ve el mensaje Bootstrap-Admin-Template

