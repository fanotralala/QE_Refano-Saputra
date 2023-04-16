package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.products.getProduct;

public class getProductSteps {

    @Steps
    getProduct getProduct;

    //// Positive

    @Given("I set GET products api endpoints")
    public void setGetApiEndpoints() {
        getProduct.setApiEndpoint();
    }

    @When("I send a GET request to the products API endpoint")
    public void setGetHttpRequest() {
        getProduct.setGetHttpRequest();
    }

    @And("I receive valid data of the post")
    public void receiveValidDataForDetailPost() {
        getProduct.validateDataDetailPost();
    }

    //// Negative

    @Given("I set invalid GET products api endpoints")
    public void setInvaliApiEndpoints() {
        getProduct.setInvalidApiEndpoint();
    }

    @When("I send a GET request to an invalid API endpoint")
    public void setInvalidGetHttpRequest() {
        getProduct.setInvalidGetHttpRequest();
    }

    @And("I receive empty content")
    public void receiveNothing() {
        getProduct.receiveNothing();
    }

}
