package pruebauTest.stepdefinitions;

import uTestStepDefintions.tasks.Login;
import uTestStepDefintions.tasks.FillForm;
import uTestStepDefintions.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenwhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pruebauTest.Answer;

public class uTestStepDefintions {

    @Before
    public void setStage() { OnStage.setTheStage(new OnlineCast());}

    @Given("^than Carolina wants to create a new user$")
    public void thanCarolinaWantsToCreateANewUser()  {
        OnStage.theActorCalled( requiredActor: "Carolina").wasAbleTo(OpenUp.thePage(), Login.OnThePage()));
    }
    @When("^she click the button (.*) to continue with the registration$")
    public void sheClickTheButtonToContinueWithTheRegistration(String registry) {
        OnStage.theActorlnTheSpotlight().attemptsTo(Fill.the(registry));


    @Then("^she enters the data and clicks the Next: Location button (.*)$")
    public void sheEntersTheDataAndClicksTheNextLocationButton(String.Location) {
        OnStage.theActorlnTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));


    }
}

