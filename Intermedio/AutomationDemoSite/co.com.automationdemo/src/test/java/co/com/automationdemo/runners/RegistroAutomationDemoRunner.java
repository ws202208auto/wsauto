package co.com.automationdemo.runners;

import cucumber.api.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import net.thucydides.core.util.SystemEnvironmentVariables;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;

import java.io.IOException;

import static co.com.automationdemo.utils.datatofeature.DataToFeature.*;

//@RunWith(RunnerPersonalizado.class)
//@RunWith(CucumberWithSerenity.class)
public class RegistroAutomationDemoRunner {

    @Before
    public void test() throws IOException, InvalidFormatException {
        switch (SystemEnvironmentVariables.createEnvironmentVariables().getProperty("webdriver.driver")) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                break;
            case "ie":
            case "iexplorer":
                WebDriverManager.iedriver().setup();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                break;
        }
        //actualizacion de datos en features
        overrideFeatureFiles("./src/test/resources/features/registro_automation_demo.feature");
    }

    @Test
    public void testRunner() {
        JUnitCore.runClasses(CRunnerPedido.class);
    }

    @RunWith(CucumberWithSerenity.class)
    @CucumberOptions(features = "src/test/resources/features/registro_automation_demo.feature",
            tags =  "@Registro",
            glue = "co.com.automationdemo.definitions")

    public class CRunnerPedido {
    }

}

