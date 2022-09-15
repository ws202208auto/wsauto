package co.com.eribank.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@CucumberOptions(
        features = "src/test/resources/features/login_eribak_app.feature"
        ,tags = {"@IngresoExitoso"}
        ,snippets = SnippetType.CAMELCASE
        ,glue = "co.com.eribank.definitions")

@RunWith(CucumberWithSerenity.class)
public class LoginEribankAppRunner {
}