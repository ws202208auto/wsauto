package co.com.metis.steps;

import co.com.metis.pageobjects.LoginMetisPage;
import net.thucydides.core.annotations.Step;

public class LoginMetisSteps {
    LoginMetisPage loginMetisPage;

    @Step
    public void abrirLaPagina() {
        loginMetisPage.open();
    }
    @Step
    public void realizarLaAutenticacion(String usuario, String password) {
        loginMetisPage.autenticarme(usuario,password);
    }

    @Step
    public void verificarElAccesoExitoso(String titulo) {
        loginMetisPage.verificarTitulo(titulo);
    }

}
