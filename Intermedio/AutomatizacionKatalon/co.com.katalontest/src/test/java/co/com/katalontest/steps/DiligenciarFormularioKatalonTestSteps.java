package co.com.katalontest.steps;

import co.com.katalontest.models.KatalonTestData;
import co.com.katalontest.pageobjects.DiligenciarFormularioKatalonTestPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class DiligenciarFormularioKatalonTestSteps {
    DiligenciarFormularioKatalonTestPage diligenciarFormularioKatalonTestPage;
    @Step
    public void abrirLaPagina() {
        diligenciarFormularioKatalonTestPage.open();
    }

    @Step
    public void diligenciarFormulario(List<KatalonTestData> data) {
        diligenciarFormularioKatalonTestPage.escribirDatos(data.get(0));
    }

    @Step
    public void verificarMensaje(List<KatalonTestData> data) {
        diligenciarFormularioKatalonTestPage.mensaje(data.get(0));
    }
}
