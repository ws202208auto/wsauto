package co.com.eribank.steps;

import co.com.eribank.pageobjects.MakePaymentEribankPage;
import net.thucydides.core.annotations.Step;

import java.util.List;

public class MakePaymentEribankSteps {
    MakePaymentEribankPage makePaymentEribankPage;

    @Step
    public void diligenciarDatosPago(List<List<String>> data) {
        makePaymentEribankPage.ingresarDatosDelPago(data.get(1));
    }
}
