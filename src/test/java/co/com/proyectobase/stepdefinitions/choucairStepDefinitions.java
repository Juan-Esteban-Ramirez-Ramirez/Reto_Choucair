package co.com.proyectobase.stepdefinitions;

import co.com.proyectobase.questions.Questio;
import co.com.proyectobase.tasks.Abrir;
import co.com.proyectobase.tasks.Login;
import co.com.proyectobase.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

public class choucairStepDefinitions {

    @Before
    public void setStage(){ OnStage.setTheStage(new OnlineCast());
    }


    @Given("^than Juan wants to learn automatizacion Bancolombia on the choucair academy platform$")
    public void thanJuanWantsToLearnAutomatizacionBancolombiaOnTheChoucairAcademyPlatform() {
        OnStage.theActorCalled("Juan").wasAbleTo(Abrir.pagina(), (Login.onThePage()));
    }

    @When("^he search for the course (.*) on the choucair academy platform$")
    public void heSearchForTheCourseRecursosAutomatizacionBancolombiaOnTheChoucairAcademyPlatform(String course) {
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }

    @Then("^he finds the course called resources Recursos Automatizacion Bancolombia$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Questio.validar(), Matchers.equalTo("Workshop de Automatización")));
    }
}
