#language:es
@Feature
Característica: Acceder al aplicativo Automation Demo Site
  Como usuario
  Quiero Autenticarme en Automation Demo Site
  Para tener acceso a la App

  Antecedentes: Login
    Dado que Yeison quiere ingresar a AUtomation Demo Site

  @LoginExitosoDataDriven
  Escenario: Login Exitoso En Automation Demo Site
    Cuando  el escribe las credenciales
    |user                 |pass       |
    |yfarias101@gmail.com |Yfac9781*  |
    Entonces el verifica el mensaje de login Hello yfarias101


  @LoginFallidoOutLine
  Esquema del escenario: Login Fallido En Automation Demo Site
    Cuando  el escribe las credenciales de acceso
      |user                 |pass       |
      |<user>               |<pass>     |
    Entonces el verifica el mensaje de login
    |mensaje  |
    |<mensaje>|
  Ejemplos:
    |user     |pass     |mensaje                                                              |
    |demo1    |demo1    |Error: the password you entered for the username demo1 is incorrect  |
    |demo2    |demo2    |Error: the password you entered for the username demo2 is incorrect  |
    |demo3    |demo3    |Error: the password you entered for the username demo3 is incorrect  |