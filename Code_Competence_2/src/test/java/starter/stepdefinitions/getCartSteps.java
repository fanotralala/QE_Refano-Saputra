package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.cart.getCart;

public class getCartSteps {

    @Steps
    getCart getCart;

    //// Positive

    @Given("I set GET cart api endpoints")
    public void setGetApiEndpoints() {
        getCart.setApiEndpoint();
    }

    @When("I send a GET request to the cart API endpoint")
    public void setGetHttpRequest() {
        getCart.setGetHttpRequest();
    }

    @And("I should receive a response with status code 200")
    public void receiveValidHttp200() {
        getCart.validateHttpResponseCode200();
    }

    @And("I receive valid data of the cart")
    public void receiveValidDataForDetailCart() {
        getCart.validateDataDetailCart();
    }

    //// Negative

    @Given("I set invalid GET cart api endpoints")
    public void setInvaliApiEndpoints() {
        getCart.setInvalidApiEndpoint();
    }

    @When("I send a GET cart request to an invalid API endpoint")
    public void setInvalidGetCartHttpRequest() {
        getCart.setInvalidGetCartHttpRequest();
    }
}
