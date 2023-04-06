package co.com.despegar.certification.stepdefinitions;

import co.com.despegar.certification.userinterfaces.OpenUpPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.despegar.certification.utils.Constans.ACTOR_1;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FlightsSearchStepDefinition {

    OpenUpPage url;
    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled(ACTOR_1);
}
    @Given("^go to  website$")
    public void goToWebsite() {
        theActorInTheSpotlight().wasAbleTo(Open.browserOn(url));
    }

}
