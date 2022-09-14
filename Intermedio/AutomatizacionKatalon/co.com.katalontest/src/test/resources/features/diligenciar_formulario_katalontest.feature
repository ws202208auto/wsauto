#language:es
@Feature
  Característica: Diligenciar Fomulario de Katalon Test
    Como usuario
    Quiero ingresar los datos
    Al formulario de Katalon Tets

  @DiligenciamientoExitoso
  Esquema del escenario: Diligenciar formulario Exitoso
    Dado que Yeison quiere verificar el formulario de Katalon Test
    Cuando el diligencia el mismo de manera exitosa
    |fisrtName|lastName|gender|dateOfBirth|address|email|password|company|role|jobExpectation|waysDevelopment|comment|
    |<fisrtName>|<lastName>|<gender>|<dateOfBirth>|<address>|<email>|<password>|<company>|<role>|<jobExpectation>|<waysDevelopment>|<comment>|
    Entonces el verifica el mensaje
    |mensaje|
    |<mensaje>|
    Ejemplos:
      |fisrtName|lastName|gender|dateOfBirth|address        |email                 |password      |company        |role         |jobExpectation |waysDevelopment|comment|mensaje                  |
    ##@externaldata@D:/WS 202208/Intermedio/AutomatizacionKatalon/co.com.katalontest/src/test/resources/datadriven/datos.xlsx@Hoja1@1,3,5
   |yeison      |arias      |M        |36282   |CL 1 # 3-4        |correo1@gmail.com   |12345   |Personal          |Developer       |High salary       |Read books        |Ninguno   |Successfully submitted!  |
   |andres   |prada   |M        |36282   |CL 1 # 3-4        |correo1@gmail.com   |12345   |Personal          |Developer       |High salary       |Read books        |Ninguno   |Successfully submitted!  |
   |pedro   |arias      |M        |36282   |CL 1 # 3-4        |correo1@gmail.com   |12345   |Personal          |Developer       |High salary       |Read books        |Ninguno   |Successfully submitted!  |
