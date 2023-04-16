package starter.cart;

import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import net.thucydides.core.annotations.Step;

public class getCart {

    protected static String url = "https://fakestoreapi.com/";

    //// Positive

    @Step("I set GET cart api endpoints")
    public String setApiEndpoint() {
        return url + "carts/1";
    }

    @Step("I send a GET request to the cart API endpoint")
    public void setGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data of the cart")
    public void validateDataDetailCart() {
        restAssuredThat(response -> response.body("id", equalTo(1)));
        restAssuredThat(
                response -> response.body("userId", equalTo(1)));
        restAssuredThat(response -> response.body("date", equalTo("2020-03-02T00:00:00.000Z")));
    }

    //// Negative

    @Step("I set invalid GET cart api endpoints")
    public String setInvalidApiEndpoint() {
        return url + "carts/8";
    }

    @Step("I send a GET cart request to an invalid API endpoint")
    public void setInvalidGetCartHttpRequest() {
        SerenityRest.given().get(setInvalidApiEndpoint());
    }

    @Step("I receive empty content")
    public void receiveNothing() {
        restAssuredThat(response -> response.noRootPath());
    }

}