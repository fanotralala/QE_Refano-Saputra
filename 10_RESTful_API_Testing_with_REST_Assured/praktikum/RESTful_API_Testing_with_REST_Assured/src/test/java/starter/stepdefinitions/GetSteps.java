package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Get;


public class GetSteps {
    @Steps
    Get get;
    ////////////////////////////////////////////////////////GET////////////////////////////////////////////////////////////
    @Given("I set GET api endpoints")
    public void setGetApiEndpoints(){
        get.setApiEndpoint();

    }
    @When("I send GET HTTP request")
    public void setGetHttpRequest(){
        get.setGetHttpRequest();

    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponse(){
        get.validateHttpResponseCode();

    }

    @Given("I set typo GET api endpoints")
    public void setGetTypoApiEndpoints(){
        get.setTypoApiEndpoint();

    }
    @When("I send typo GET HTTP request")
    public void setGetTypoHttpRequest(){
        get.setGetTypoHttpRequest();

    }

    @Then("I receive valid HTTP response code 404")
    public void receiveValidHttpResponse404(){
        get.validateHttpResponseCode404();

    }

    @And("I receive valid data for detail post")
    public void validateDataDetailPost(){
        get.validateDataDetailPost();
    }
    
    ////////////////////////////////////////////////////////GET by ID////////////////////////////////////////////////////////////
    @Given("I set GET api endpoints by id")
    public void setGetApiEndpointsById(){
        get.setApiEndpointById();

    }
    @When("I send GET HTTP request by id")
    public void setGetHttpRequestById(){
        get.setGetHttpRequestById();

    }

    @And("I receive valid data for detail post by id")
    public void receiveValidDataForDetailPostById(){
        get.validateDataDetailPostById();
    }

    @Given("I set typo GET api endpoints by id")
    public void setGetTypoApiEndpointsById(){
        get.setTypoApiEndpointById();

    }
    @When("I send typo GET HTTP request by id")
    public void setGetTypoHttpRequestById(){
        get.setGetTypoHttpRequestById();

    }
}