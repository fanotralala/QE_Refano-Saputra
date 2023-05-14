package starter.user;

import net.serenitybdd.rest.SerenityRest;
import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;
import net.thucydides.core.annotations.Step;

public class Get {

    protected static String url = "https://jsonplaceholder.typicode.com/";

    @Step("I set GET api endpoints")
    public String setApiEndpoint(){
        return url + "posts/2";
    }

    @Step("I send GET HTTP request")
    public void setGetHttpRequest(){
        SerenityRest.given().get(setApiEndpoint());
    }

    @Step("I receive valid HTTP response code 200")
    public void validateHttpResponseCode(){
        restAssuredThat(response -> response.statusCode(200));
    }

    @Step("I receive valid data for detail post")
    public void validateDataDetailPost(){
        restAssuredThat(response -> response.body("userId", equalTo(1)));
        restAssuredThat(response -> response.body("id", equalTo(2)));
        restAssuredThat(response -> response.body("title", equalTo("qui est esse")));
        restAssuredThat(response -> response.body("body", equalTo("est rerum tempore vitae\nsequi sint nihil reprehenderit dolor beatae ea dolores neque\nfugiat blanditiis voluptate porro vel nihil molestiae ut reiciendis\nqui aperiam non debitis possimus qui neque nisi nulla")));
    }

    @Step("I set typo GET api endpoints")
    public String setTypoApiEndpoint(){
        return url + "post";
    }

    @Step("I send typo GET HTTP request")
    public void setGetTypoHttpRequest(){
        SerenityRest.given().get(setTypoApiEndpoint());
    }

    @Step("I receive valid HTTP response code 404")
    public void validateHttpResponseCode404(){
        restAssuredThat(response -> response.statusCode(404));
    }
    //////////////////////////////////////////////////GET by Id///////////////////////////////////////////////////////////
    @Step("I set GET api endpoints by id")
    public String setApiEndpointById(){
        return url + "posts/1";
    }

    @Step("I send GET HTTP request by id")
    public void setGetHttpRequestById(){
        SerenityRest.given().get(setApiEndpointById());
    }

    @Step("I receive valid data for detail post by id")
    public void validateDataDetailPostById(){
        restAssuredThat(response -> response.body("userId", equalTo(1)));
        restAssuredThat(response -> response.body("id", equalTo(1)));
        restAssuredThat(response -> response.body("title", equalTo("sunt aut facere repellat provident occaecati excepturi optio reprehenderit")));
        restAssuredThat(response -> response.body("body", equalTo("quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto")));
    }

    @Step("I set typo GET api endpoints by id")
    public String setTypoApiEndpointById(){
        return url + "post/&^";
    }

    @Step("I send typo GET HTTP request by id")
    public void setGetTypoHttpRequestById(){
        SerenityRest.given().get(setTypoApiEndpointById());
    }

}
