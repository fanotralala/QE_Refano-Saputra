package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.login.Login;

public class LoginSteps {

    @Steps
    Login login;

    // Login
    //// Positive

    @Given("I set valid POST api endpoints")
    public void setPostApiEndpoints() {
        login.setPostApiEndpoint();
    }

    @When("I send POST HTTP request")
    public void sendPostHttpRequest() {
        login.sendPostHttpRequest();
    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttp200() {
        login.validateHttpResponseCode200();
    }

    // Login
    //// Negative

    @When("I send invalid password POST HTTP request")
    public void sendInvalidPostHttpRequest() {
        login.sendInvalidPostHttpRequest();
    }

    @Then("I receive invalid HTTP response code 401")
    public void validateHttpResponseCode401() {
        login.validateHttpResponseCode401();
    }

}
