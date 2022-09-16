#language:es
@Feature
  Característica: Registro en AutomationDemo
    Como usuario
    Quiero registrarme
    En la Pagina AutomationDemo

  @Registro
  Esquema del escenario: Diligenciar formulario Exitoso
    Dado que Yeison quiere registrarse en Automation Demo
    Cuando el diligencia el formulario
    |fisrtName|lastName|address|email|phone|gender|hobbies|languages|skills|country|selectConuntry|birthYear|birthMonth|birthday|password|confirmpassword|
    |<fisrtName>|<lastName>|<address>|<email>|<phone>|<gender>|<hobbies>|<languages>|<skills>|<country>|<selectConuntry>|<birthYear>|<birthMonth>|<birthday>|<password>|<confirmpassword>|
    Entonces el verifica el mensaje
    |mensaje|
    |<mensaje>|
    Ejemplos:
      |fisrtName|lastName|address|email|phone|gender|hobbies|languages|skills|country|selectConuntry|birthYear|birthMonth|birthday|password|confirmpassword|
    ##@externaldata@D:/WS 202208/Intermedio/AutomationDemoSite/co.com.automationdemo/src/test/resources/datadriven/datos.xlsx@Hoja1
   |yeison      |arias      |calle 2 # 3 4   |correo@correo.com   |3002558987   |Male   |Cricket;Movies   |Arabic;Catalan   |C++   |Japan   |Japan   |1990   |January   |5   |Password*   |Password*|
