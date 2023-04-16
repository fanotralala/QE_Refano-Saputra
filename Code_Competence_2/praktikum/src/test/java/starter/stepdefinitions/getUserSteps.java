package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.getUser;

public class getUserSteps {
    @Steps
    getUser getUser;

    //// Positive

    @Given("I set GET user api endpoints")
    public void setGetApiEndpoints() {
        getUser.setApiEndpoint();
    }

    @When("I send a GET request to the user API endpoint")
    public void setGetHttpRequest() {
        getUser.setGetHttpRequest();
    }

    @And("I receive valid data of the user")
    public void receiveValidDataForDetailUser() {
        getUser.validateDataDetailUser();
    }

    //// Negative

    @Given("I set invalid GET user api endpoints")
    public void setInvaliApiEndpoints() {
        getUser.setInvalidApiEndpoint();
    }

    @When("I send a GET user request to an invalid API endpoint")
    public void setInvalidGetUserHttpRequest() {
        getUser.setInvalidGetUserHttpRequest();
    }

}
