package co.com.automationdemo.steps;

import co.com.automationdemo.pageobjects.RegistroAutomationDemoPage;
import net.thucydides.core.annotations.Step;

public class RegistroAutomationDemoSteps {
    RegistroAutomationDemoPage registroAutomationDemoPage;

    @Step
    public void abrirLaPagina() {
        registroAutomationDemoPage.open();
    }
}
