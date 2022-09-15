package co.com.eribank.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@CucumberOptions(
        features = "src/test/resources/features/make_payment_eribank.feature"
        ,tags = {"@PagoExitoso"}
        ,snippets = SnippetType.CAMELCASE
        ,glue = "co.com.eribank.definitions")

@RunWith(CucumberWithSerenity.class)
public class MakePaymentEribankRunner {
}