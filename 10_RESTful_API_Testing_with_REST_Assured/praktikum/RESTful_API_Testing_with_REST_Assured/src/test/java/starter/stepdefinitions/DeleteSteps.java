package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Delete;

public class DeleteSteps {
    
    @Steps
    Delete delete;
    ////////////////////////////////////////////////////////DELETE////////////////////////////////////////////////////////////
    @Given("I set DELETE api endpoints")
    public void setDeleteApiEndpoints() {
        delete.setDeleteApiEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void sendDeleteApiEndpoints() {
        delete.sendDeleteApiEndpointsRequest();
    }

    @Given("I set DELETE to invalid api endpoints")
    public void setDeleteInvalidApiEndpoints() {
        delete.setDeleteInvalidApiEndpoints();
    }

    @When("I receive nothing from the page")
    public void receiveNothingFromPage() {
        delete.receiveNothing();
    }
}
