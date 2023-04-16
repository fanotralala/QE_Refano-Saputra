package starter.login;

import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

import org.json.simple.JSONObject;

import net.thucydides.core.annotations.Step;

public class Login {

    protected static String url = "https://fakestoreapi.com/";

    //// Positive

    @Step("I set valid POST api endpoints")
    public String setPostApiEndpoint() {
        return url + "auth/login";
    }

    @Step("I send POST HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "mor_2314");
        requestBody.put("password", "83r5^_");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode200() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //// Negative

    @Step("I send invalid password POST HTTP request")
    public void sendInvalidPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("username", "mor_2314");
        requestBody.put("password", "83r5^");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString())
                .post(setPostApiEndpoint());
    }

    @Step("I receive invalid HTTP response code 401")
    public void validateHttpResponseCode401() {
        restAssuredThat(response -> response.statusCode(401));
    }

}