package in.reqres.runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "in.reqres.stepdefinitions",
        tags = "@PostLogin",
        snippets = CucumberOptions.SnippetType.CAMELCASE)
public class Runner {
}
