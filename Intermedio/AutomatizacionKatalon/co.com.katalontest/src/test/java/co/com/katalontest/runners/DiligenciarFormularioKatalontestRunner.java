package co.com.katalontest.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

public class DiligenciarFormularioKatalontestRunner {
    @Before
    public void test(){
        switch (SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.driver")){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                break;
        }
    }

    @Test
    public void testRunner(){
        JUnitCore.runClasses(CRunnerPedido.class);
    }

    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(features = "src/test/resources/features/diligenciar_formulario_katalontest.feature",
            tags = "@DiligenciamientoExitoso",
            glue = "co.com.katalontest.definitions",
            snippets = SnippetType.CAMELCASE)

    public class CRunnerPedido{

    }
}

