package starter.user;

import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import net.thucydides.core.annotations.Step;

public class getUser {

    protected static String url = "https://fakestoreapi.com/";

    //// Positive

    @Step("I set GET user api endpoints")
    public String setApiEndpoint() {
        return url + "users/1";
    }

    @Step("I send a GET request to the user API endpoint")
    public void setGetHttpRequest() {
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data of the user")
    public void validateDataDetailUser() {
        restAssuredThat(response -> response.body("id", equalTo(1)));
        restAssuredThat(
                response -> response.body("email", equalTo("john@gmail.com")));
        restAssuredThat(response -> response.body("username", equalTo("johnd")));
        restAssuredThat(response -> response.body("phone", equalTo("1-570-236-7033")));
    }

    //// Negative

    @Step("I set invalid GET user api endpoints")
    public String setInvalidApiEndpoint() {
        return url + "users/11";
    }

    @Step("I send a GET user request to an invalid API endpoint")
    public void setInvalidGetUserHttpRequest() {
        SerenityRest.given().get(setInvalidApiEndpoint());
    }

    @Step("I receive empty content")
    public void receiveNothing() {
        restAssuredThat(response -> response.noRootPath());
    }

}