package starter.java;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import org.apache.commons.lang3.RandomStringUtils;
import org.json.simple.JSONObject;

public class Register {

    protected String url = "https://altashop-api.fly.dev/api/";

    @Step("I set POST api endpoints register")
    public String setPostApiEndpointRegister() {
        return url + "auth/register";
    }

    ///POSITIF
    @Step("I send POST HTTP request register")
    public void sendPostHttpRequestRegister() {
        JSONObject requestBody = new JSONObject();
        int length = 15;
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-.";
        String email = "";
        String temp = RandomStringUtils.random(length, allowedChars);
        email = temp.substring(0, temp.length() - 9) + "@mail.com";
        requestBody.put("email", email);
        requestBody.put("password", "123456");
        requestBody.put("fullname", "StevenJatmiko");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }


    ///NEGATIFFF
    @Step("I send POST HTTP request register2")
    public void sendPostHttpRequestRegister2() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "stevenjatmiko@gmail.com");
        requestBody.put("password", "123456");
        requestBody.put("fullname", "");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }

    @Step("I send POST HTTP request register3")
    public void sendPostHttpRequestRegister3() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "");
        requestBody.put("password", "123456");
        requestBody.put("fullname", "Steven Jatmiko");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }

    @Step("I send POST HTTP request register4")
    public void sendPostHttpRequestRegister4() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "stevenjatmiko@gmail.com");
        requestBody.put("password", "");
        requestBody.put("fullname", "Steven Jatmiko");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }

    @Step("I send POST HTTP request register5")
    public void sendPostHttpRequestRegister5() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("email", "stevenmiko@gmail.com");
        requestBody.put("password", "steven123");
        requestBody.put("fullname", "steven");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
    }
//
//    ///GANTI SETIAP RUN
//    @Step("I send POST HTTP request register6")
//    public void sendPostHttpRequestRegister6() {
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("email", "stevennnngmail.com");
//        requestBody.put("password", "steven123");
//        requestBody.put("fullname", "steven");
//
//        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
//    }
//
//    ///GANTI SETIAP RUN
//    @Step("I send POST HTTP request register7")
//    public void sendPostHttpRequestRegister7() {
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("email", "stevennnnn@gmail.com");
//        requestBody.put("password", " ");
//        requestBody.put("fullname", "steven");
//
//        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
//    }
//
//    ///GANTI SETIAP RUN
//    @Step("I send POST HTTP request register8")
//    public void sendPostHttpRequestRegister8() {
//        JSONObject requestBody = new JSONObject();
//        requestBody.put("email", "stevennn@gmail.com");
//        requestBody.put("password", "steven123");
//        requestBody.put("fullname", " ");
//
//        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpointRegister());
//    }

    @Step("I receive valid HTTP response code 200 register")
    public void receiveValidHttp200Register() {
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid HTTP response code 400 register")
    public void receiveValidHttp400Register() {
        restAssuredThat(response -> response.statusCode(400));
    }
}