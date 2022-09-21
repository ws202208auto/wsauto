package co.com.automationdemo.steps;

import co.com.automationdemo.models.RegistroData;
import co.com.automationdemo.pageobjects.RegistroAutomationDemoPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class RegistroAutomationDemoSteps {
    RegistroAutomationDemoPage registroAutomationDemoPage;

    @Step
    public void abrirLaPagina() {
        registroAutomationDemoPage.open();
    }

    @Step
    public void diligenciaDatos(List<RegistroData> registroData) {
        registroAutomationDemoPage.diligenciarPantalla(registroData.get(0));
    }

    public void verificarMensaje() {
    }
}
