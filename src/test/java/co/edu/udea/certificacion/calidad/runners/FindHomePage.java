package co.edu.udea.certificacion.calidad.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/find_udea_homepage.feature",
        glue = "co.edu.udea.certificacion.calidad.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class FindHomePage {

}
