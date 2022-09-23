package co.com.automationdemo.runners;

import co.com.automationdemo.utils.datatofeature.BeforeSuite;
import co.com.automationdemo.utils.datatofeature.RunnerPersonalizado;
import io.cucumber.junit.CucumberOptions;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.junit.runner.RunWith;
import java.io.IOException;
import static co.com.automationdemo.utils.datatofeature.DataToFeature.overrideFeatureFiles;

@CucumberOptions (features = "src/test/resources/features/registro_automation_demo.feature"
                ,tags= "@Registro"
                ,glue = "co.com.automationdemo.definitions"
                ,snippets= CucumberOptions.SnippetType.CAMELCASE)


@RunWith(RunnerPersonalizado.class)
public class RunnerTags {
    @BeforeSuite
    public static void test() throws IOException, InvalidFormatException {
        overrideFeatureFiles("./src/test/resources/features/registro_automation_demo.feature");
    }
}
