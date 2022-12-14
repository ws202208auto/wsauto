package co.com.metis.definitions;

import co.com.metis.steps.LoginAutomationDemoSteps;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class LoginAutomationDemoDefinition {
    @Steps
    LoginAutomationDemoSteps loginAutomationDemoSteps;

    @Dado("^que Yeison quiere ingresar a AUtomation Demo Site$")
    public void queYeisonQuiereIngresarAAUtomationDemoSite() {
        loginAutomationDemoSteps.abrirLaPagina();
    }

    @Cuando("^el escribe las credenciales$")
    public void elEscribeLasCredenciales(DataTable LoginData) {
        List<List<String>> data = LoginData.asLists(String.class);
        for(int i=1 ; i< data.size(); i++){
            loginAutomationDemoSteps.login(data.get(i));
        }
    }

    @Entonces("^el verifica el mensaje de login (.*)$")
    public void elVerificaElMensajeDeLogin(String mensaje) {
        loginAutomationDemoSteps.verificarMensaje(mensaje);
    }


    @Cuando("^el escribe las credenciales de acceso$")
    public void elEscribeLasCredencialesDeAcceso(DataTable data) {
        List<List<String>> data2 = data.asLists(String.class);
        loginAutomationDemoSteps.login(data2.get(1));
    }

    @Entonces("^el verifica el mensaje de login$")
    public void elVerificaElMensajeDeLogin(DataTable data) {
        List<List<String>> data3 = data.asLists(String.class);
        loginAutomationDemoSteps.verificarMensajeMultiples(data3.get(1));

    }

}
