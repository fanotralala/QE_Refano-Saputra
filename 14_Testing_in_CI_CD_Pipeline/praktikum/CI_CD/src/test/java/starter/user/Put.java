package starter.user;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.json.simple.JSONObject; 
import net.serenitybdd.core.Serenity;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Put {
    
    protected String url = "https://jsonplaceholder.typicode.com/";
    
    @Step("I set PUT api endpoints")
        public String setPutApiEndpoints(){
        return url + "posts/1";

    }
    
    @Step("I send PUT HTTP request")
        public void sendPutHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("body" ,"pada suatu hari hiduplah seekor singa yang tampan dan rupawan dengan bangganya beliau makan kerbau");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutApiEndpoints());
    }

    @Step("I receive valid data for update post")
        public void validateUpdatePost(){
        restAssuredThat(response -> response.body("'body'", equalTo("pada suatu hari hiduplah seekor singa yang tampan dan rupawan dengan bangganya beliau makan kerbau")));
    }

    @Step("I set typo PUT api endpoints")
    public String setTypoPutApiEndpoints(){
    return url + "posts/1";

    }

    @Step("I send typo PUT HTTP request")
        public void sendTypoPutHttpRequest(){
        JSONObject requestBody = new JSONObject();
        requestBody.put("number" ,"pada suatu hari hiduplah seekor singa yang tampan dan rupawan dengan bangganya beliau makan kerbau");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).put(setPutApiEndpoints());
    }

}
