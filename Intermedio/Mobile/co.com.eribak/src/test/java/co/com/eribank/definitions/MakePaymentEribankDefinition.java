package co.com.eribank.definitions;

import co.com.eribank.steps.LoginEribankAppSteps;
import co.com.eribank.steps.MakePaymentEribankSteps;
import cucumber.api.DataTable;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.thucydides.core.annotations.Steps;

import java.util.List;

public class MakePaymentEribankDefinition {
    @Steps
    LoginEribankAppSteps loginEribankAppSteps;
    @Steps
    MakePaymentEribankSteps makePaymentEribankSteps;

    @Dado("^que Yeison quiere realizar un pago en la app Eribank$")
    public void queYeisonQuiereRealizarUnPagoEnLaAppEribank(DataTable loginData) {
        List<List<String>> data = loginData.asLists(String.class);
        loginEribankAppSteps.abrirApp();
        loginEribankAppSteps.loginEnLaApp(data.get(1).get(0),data.get(1).get(1));
    }

    @Cuando("^el diligencia los datos de la transacción$")
    public void elDiligenciaLosDatosDeLaTransacción(DataTable paymentData) {
        List<List<String>> data = paymentData.asLists(String.class);
        makePaymentEribankSteps.diligenciarDatosPago(data);
    }



}
