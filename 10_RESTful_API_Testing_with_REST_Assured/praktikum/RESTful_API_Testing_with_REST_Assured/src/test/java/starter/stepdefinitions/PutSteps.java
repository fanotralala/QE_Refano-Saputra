package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Put;

public class PutSteps {
    
    @Steps
    Put put;
    ////////////////////////////////////////////////////////PUT////////////////////////////////////////////////////////////
    @Given("I set PUT api endpoints")
    public void setPutApiEndpoints(){
        put.setPutApiEndpoints();

    }

    @When("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        put.sendPutHttpRequest();

    }

    @And("I receive valid data for update post")
    public void validateUpdatePost(){
        put.validateUpdatePost();

    }

    @Given("I set typo PUT api endpoints")
    public void setTypoPutApiEndpoints(){
        put.setTypoPutApiEndpoints();

    }

    @When("I send typo PUT HTTP request")
    public void sendTypoPutHttpRequest(){
        put.sendTypoPutHttpRequest();

    }
}
