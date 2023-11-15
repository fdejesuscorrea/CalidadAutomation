package co.edu.udea.certificacion.calidad.stepdefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
public class FindHomePageStepDefinition {

    @Managed(driver="chrome")
    public WebDriver driver;
    public Actor estudiante = Actor.named("felipe");

    @Before
    public void preStage(){
        driver.manage().window().maximize();
        estudiante.can(BrowseTheWeb.with(driver));
    }

    @Given("que me encuentro en la pagina principal de google")
    public void queMeEncuentroPaginaPrincipal(){
        estudiante.can(BrowseTheWeb.with(driver));
    }
    @When("escripa la palabra U de A")
    public  void  escribaLaPalabraUdeA(){

    }
    @Then("puedo ver el link de la pagina oficial")
    public void puedoVerElLinkOficial(){

    }
}
