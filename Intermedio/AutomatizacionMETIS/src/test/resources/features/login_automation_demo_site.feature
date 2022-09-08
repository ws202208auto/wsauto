#language:es
@Feature
Característica: Acceder al aplicativo Automation Demo Site
  Como usuario
  Quiero Autenticarme en Automation Demo Site
  Para tener acceso a la App

@LoginExitosoDataDriven
  Escenario: Login Exitoso En Automation Demo Site
    Dado que Yeison quiere ingresar a AUtomation Demo Site
    Cuando  el escribe las credenciales
    |user                 |pass       |
    |yfarias101@gmail.com |Yfac9781*  |
    Entonces el verifica el mensaje de login Hello yfarias101
