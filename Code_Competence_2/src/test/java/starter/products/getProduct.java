package starter.products;

import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import net.thucydides.core.annotations.Step;

public class getProduct {

    protected static String url = "https://fakestoreapi.com/";

    //// Positive

    @Step("I set GET products api endpoints")
    public String setApiEndpoint() {
        return url + "products/1";
    }

    @Step("I send a GET request to the products API endpoint")
    public void setGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data of the post")
    public void validateDataDetailPost() {
        restAssuredThat(response -> response.body("id", equalTo(1)));
        restAssuredThat(
                response -> response.body("title", equalTo("Fjallraven - Foldsack No. 1 Backpack, Fits 15 Laptops")));
        restAssuredThat(response -> response.body("price", equalTo(109.95F)));
    }

    //// Negative

    @Step("I set invalid GET products api endpoints")
    public String setInvalidApiEndpoint() {
        return url + "products/21";
    }

    @Step("I send a GET request to an invalid API endpoint")
    public void setInvalidGetHttpRequest() {
        SerenityRest.given().get(setInvalidApiEndpoint());
    }

    @Step("I receive empty content")
    public void receiveNothing() {
        restAssuredThat(response -> response.noRootPath());
    }

}