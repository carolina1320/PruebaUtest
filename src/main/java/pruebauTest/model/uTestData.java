package pruebauTest.model;

import java.util.List;

public class uTestData {
    public uTestData(String strEmail, String strPassword) {
        this.strEmail = strEmail;
        this.strPassword = strPassword;
    }

    public String getStrEmail() {
        return strEmail;
    }

    public void setStrEmail(String strEmail) {
        this.strEmail = strEmail;
    }

    public String getStrPassword() {
        return strPassword;
    }

    public void setStrPassword(String strPassword) {
        this.strPassword = strPassword;
    }

    public String getStrSingIn() {
        return strLogin;
    }

    public void setStrSingIn(String strSingIn) {
        this.strLogin = strLogin;
    }

    private String strEmail;
    private String strPassword;
    private String strLogin;

    @Given("^than Carolina wants to create a new user$")
    public void thanCarolinaWantsToCreateANewUser()  {
        OnStage.theActorCalled( requiredActor ("Carolina").wasAbleTo(OpenUp.thePage(), Login.OnThePage()));
    }
    @When("^she click the button (.*) to continue with the registration$")
    public void sheClickTheButtonToContinueWithTheRegistration(String registry) {
        OnStage.theActorlnTheSpotlight().attemptsTo(Fill.the(registry));
    }

        @Then("^she enters the data and clicks the Next: Location button (.*)$")
        public void sheEntersTheDataAndClicksTheNextLocationButton(String.Location) {
            OnStage.theActorlnTheSpotlight().uTestData(GivenWhenThen.seeThat(Answer.toThe(question)));
        }

    }