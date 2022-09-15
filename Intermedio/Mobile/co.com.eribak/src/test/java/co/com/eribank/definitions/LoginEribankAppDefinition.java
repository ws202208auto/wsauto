package co.com.eribank.definitions;

import co.com.eribank.steps.LoginEribankAppSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

public class LoginEribankAppDefinition {
    @Steps
    LoginEribankAppSteps loginEribankAppSteps;

    @Dado("^que Yeison quiere ingresar a Eribank$")
    public void queYeisonQuiereIngresarAEribank() {
        loginEribankAppSteps.abrirApp();

    }

    @Cuando("^el ingresa el usuario (.*) y la clave (.*)$")
    public void elIngresaElUsuarioCompanyYLaClaveCompany(String usuario, String clave)  {
        loginEribankAppSteps.loginEnLaApp(usuario, clave);
    }

    @Entonces("^el ve el mensaje (.*)$")
    public void elVeElMensajeYourBalanceIs(String mensaje) {
        loginEribankAppSteps.verificarAcceso(mensaje);
    }
}
