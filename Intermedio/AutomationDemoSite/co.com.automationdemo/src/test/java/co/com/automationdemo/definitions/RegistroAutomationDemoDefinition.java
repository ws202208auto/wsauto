package co.com.automationdemo.definitions;

import co.com.automationdemo.models.RegistroData;
import co.com.automationdemo.steps.RegistroAutomationDemoSteps;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class RegistroAutomationDemoDefinition {
    @Steps
    RegistroAutomationDemoSteps registroAutomationDemoSteps;


    @Dado("^que Yeison quiere registrarse en Automation Demo$")
    public void que_Yeison_quiere_registrarse_en_Automation_Demo() {
        registroAutomationDemoSteps.abrirLaPagina();
    }


    @Cuando("^el diligencia el formulario$")
    public void el_diligencia_el_formulario(DataTable dataTable) {
        registroAutomationDemoSteps.diligenciaDatos(RegistroData.setData(dataTable));
    }

    @Entonces("^el verifica el mensaje$")
    public void el_verifica_el_mensaje() {
        registroAutomationDemoSteps.verificarMensaje();
    }
}
