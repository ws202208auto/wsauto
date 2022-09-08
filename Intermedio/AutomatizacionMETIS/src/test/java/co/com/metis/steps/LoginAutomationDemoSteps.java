package co.com.metis.steps;

import co.com.metis.pageobjects.LoginAutomationDemoPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class LoginAutomationDemoSteps {
    LoginAutomationDemoPage loginAutomationDemoPage;

    @Step
    public void abrirLaPagina() {
        loginAutomationDemoPage.open();
    }

    @Step
    public void login(List<String> data) {
        loginAutomationDemoPage.loginEnLaPagina(data);
    }

    @Step
    public void verificarMensaje(String mensaje) {
        loginAutomationDemoPage.mensajeExitoso(mensaje);
    }
}
