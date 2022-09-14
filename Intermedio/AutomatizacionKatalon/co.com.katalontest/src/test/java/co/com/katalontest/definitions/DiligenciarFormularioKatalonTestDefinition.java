package co.com.katalontest.definitions;

import co.com.katalontest.models.KatalonTestData;
import co.com.katalontest.steps.DiligenciarFormularioKatalonTestSteps;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class DiligenciarFormularioKatalonTestDefinition {
    @Steps
    DiligenciarFormularioKatalonTestSteps diligenciarFormularioKatalonTestSteps;

    @Dado("^que Yeison quiere verificar el formulario de Katalon Test$")
    public void queYeisonQuiereVerificarElFormularioDeKatalonTest() {
        diligenciarFormularioKatalonTestSteps.abrirLaPagina();
    }

    @Cuando("^el diligencia el mismo de manera exitosa$")
    public void elDiligenciaElMismoDeManeraExitosa(List<KatalonTestData> datos) throws InterruptedException {
        diligenciarFormularioKatalonTestSteps.diligenciarFormulario(datos);
    }

    @Entonces("^el verifica el mensaje$")
    public void elVerificaElMensaje(List<KatalonTestData> data) {
        diligenciarFormularioKatalonTestSteps.verificarMensaje(data);
    }
}
