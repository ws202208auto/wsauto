package co.com.wordpress.runners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@CucumberOptions(
        features = "src/test/resources/features/login_wordpress_app.feature"
        ,tags = {"@IngresoExitoso"}
        ,snippets = SnippetType.CAMELCASE
        ,glue = "co.com.wordpress.definitions")

@RunWith(CucumberWithSerenity.class)
public class LoginWordPressAppRunner {
}