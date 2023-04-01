package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.post.Post;

public class PostSteps {
    @Steps
    Post post;
    @Given("I am on the main page")
    public void onTheMainPage(){
        post.onTheMainPage();
    }
    @When("I am enter my status correctly")
    public void enterEmailAndPassword(){
        post.enterStatus();
    }
    @And("I click post button")
    public void clickRegisterButton(){
        post.clickPostButton();
    }
    @Then("I can see the post")
    public void onTheMainnPage(){
        post.onTheMainnPage();
    }
}