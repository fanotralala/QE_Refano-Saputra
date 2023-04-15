package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.user.Delete;
import starter.user.Get;
import starter.user.Post;
import starter.user.Put;


public class UserSteps {
    @Steps
    Get get;

    @Steps
    Post post;

    @Steps
    Put put;

    @Steps
    Delete delete;
    ////////////////////////////////////////////////////////GET////////////////////////////////////////////////////////////
    @Given("I set GET api endpoints")
    public void setGetApiEndpoints(){
        get.setApiEndpoint();

    }
    @When("I send GET HTTP request")
    public void setGetHttpRequest(){
        get.setGetHttpRequest();

    }

    @Then("I receive valid HTTP response code 200")
    public void receiveValidHttpResponse(){
        get.validateHttpResponseCode();

    }

    @Given("I set typo GET api endpoints")
    public void setGetTypoApiEndpoints(){
        get.setTypoApiEndpoint();

    }
    @When("I send typo GET HTTP request")
    public void setGetTypoHttpRequest(){
        get.setGetTypoHttpRequest();

    }

    @Then("I receive valid HTTP response code 404")
    public void receiveValidHttpResponse404(){
        get.validateHttpResponseCode404();

    }

    @And("I receive valid data for detail post")
    public void validateDataDetailPost(){
        get.validateDataDetailPost();
    }
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
    ////////////////////////////////////////////////////////GET by ID////////////////////////////////////////////////////////////
    @Given("I set GET api endpoints by id")
    public void setGetApiEndpointsById(){
        get.setApiEndpointById();

    }
    @When("I send GET HTTP request by id")
    public void setGetHttpRequestById(){
        get.setGetHttpRequestById();

    }

    @And("I receive valid data for detail post by id")
    public void receiveValidDataForDetailPostById(){
        get.validateDataDetailPostById();
    }

    @Given("I set typo GET api endpoints by id")
    public void setGetTypoApiEndpointsById(){
        get.setTypoApiEndpointById();

    }
    @When("I send typo GET HTTP request by id")
    public void setGetTypoHttpRequestById(){
        get.setGetTypoHttpRequestById();

    }

    ////////////////////////////////////////////////////////PUT////////////////////////////////////////////////////////////
    @Given("I set PUT api endpoints")
    public void setPutApiEndpoints(){
        put.setPutApiEndpoints();

    }

    @When("I send PUT HTTP request")
    public void sendPutHttpRequest(){
        put.sendPutHttpRequest();

    }

    @And("I receive valid data for update post")
    public void validateUpdatePost(){
        put.validateUpdatePost();

    }

    @Given("I set typo PUT api endpoints")
    public void setTypoPutApiEndpoints(){
        put.setTypoPutApiEndpoints();

    }

    @When("I send typo PUT HTTP request")
    public void sendTypoPutHttpRequest(){
        put.sendTypoPutHttpRequest();

    }
    ////////////////////////////////////////////////////////DELETE////////////////////////////////////////////////////////////
    @Given("I set DELETE api endpoints")
    public void setDeleteApiEndpoints() {
        delete.setDeleteApiEndpoints();
    }

    @When("I send DELETE HTTP request")
    public void sendDeleteApiEndpoints() {
        delete.sendDeleteApiEndpointsRequest();
    }

    @Given("I set DELETE to invalid api endpoints")
    public void setDeleteInvalidApiEndpoints() {
        delete.setDeleteInvalidApiEndpoints();
    }

    @When("I receive nothing from the page")
    public void receiveNothingFromPage() {
        delete.receiveNothing();
    }
}