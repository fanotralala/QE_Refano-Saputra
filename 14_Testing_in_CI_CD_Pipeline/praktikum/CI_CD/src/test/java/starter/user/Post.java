package starter.user;

import net.serenitybdd.core.Serenity;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

public class Post {
    
    protected String url = "https://jsonplaceholder.typicode.com/";
    
    @Step("I set POST api endpoints")
    public String setPostApiEndpoint(){
        return url + "posts";
}

    @Step("I send POST HTTP request")
    public void sendPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId" , 10);
        requestBody.put("id" , 101);
        requestBody.put("title" ,"marmut merah jambu");
        requestBody.put("body" ,"pada suatu hari hiduplah seekor singa yang tampan dan rupawan dengan bangganya beliau makan sapi");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());

    }

    @Step("I receive valid HTTP response code 201")
    public void receiveHttpResponseCode201(){
        restAssuredThat(response -> response.statusCode(201));

    }

    @Step("I receive valid data for new post")
    public void validateDatanewPost(){
        restAssuredThat(response -> response.body("'userId'", equalTo(10)));
        restAssuredThat(response -> response.body("'id'", equalTo(101)));
        restAssuredThat(response -> response.body("'title'", equalTo("marmut merah jambu")));
        restAssuredThat(response -> response.body("'body'", equalTo("pada suatu hari hiduplah seekor singa yang tampan dan rupawan dengan bangganya beliau makan sapi")));
    

	}

    @Step("I set typo POST api endpoints")
    public String setTypoPostApiEndpoint(){
        return url + "posts";
}

    @Step("I send typo POST HTTP request")
    public void sendTypoPostHttpRequest() {
        JSONObject requestBody = new JSONObject();
        requestBody.put("userId" , 0010);
        requestBody.put("id" , 10986);
        requestBody.put("title" ,"ADASDASDASDas");
        requestBody.put("body" ,"SADASDASDASDASDAS");

        SerenityRest.given().header("Content-Type", "application/json").body(requestBody.toJSONString()).post(setPostApiEndpoint());

    }
}
