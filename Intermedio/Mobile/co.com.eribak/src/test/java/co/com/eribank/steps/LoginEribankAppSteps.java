package co.com.eribank.steps;

import co.com.eribank.pageobjects.LoginEribankAppPage;
import net.thucydides.core.annotations.Step;

public class LoginEribankAppSteps {
    LoginEribankAppPage loginEribankAppPage;

    @Step
    public void abrirApp() {
    }

    @Step
    public void loginEnLaApp(String usuario, String clave) {
        loginEribankAppPage.realizarAutenticacion(usuario,clave);
    }

    @Step
    public void verificarAcceso(String mensaje) {
        loginEribankAppPage.verificarAccesoExitoso(mensaje);
    }
}
