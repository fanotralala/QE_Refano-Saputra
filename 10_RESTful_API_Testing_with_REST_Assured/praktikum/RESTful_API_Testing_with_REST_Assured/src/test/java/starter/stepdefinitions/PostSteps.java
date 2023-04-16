package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Post;

public class PostSteps {
    
    @Steps
    Post post;
    ////////////////////////////////////////////////////////POST////////////////////////////////////////////////////////////
    @Given("I set POST api endpoints")
    public void setPostApiEndpoints(){
        post.setPostApiEndpoint();

    }
    @When("I send POST HTTP request")
    public void sendPostHttpRequest(){
        post.sendPostHttpRequest();

    }

    @Then("I receive valid HTTP response code 201")
    public void receiveValidHttp201(){
        post.receiveHttpResponseCode201();

    }

    @And("I receive valid data for new post")
    public void validateDatanewPost(){
        post.validateDatanewPost();    

    }

    @Given("I set typo POST api endpoints")
    public void setTypoPostApiEndpoints(){
        post.setTypoPostApiEndpoint();

    }
    @When("I send typo POST HTTP request")
    public void sendTypoPostHttpRequest(){
        post.sendTypoPostHttpRequest();

    }
}
