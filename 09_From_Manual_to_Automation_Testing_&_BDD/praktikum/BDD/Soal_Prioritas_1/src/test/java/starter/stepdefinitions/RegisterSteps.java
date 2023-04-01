package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.register.Register;

public class RegisterSteps {
    @Steps
    Register register;
    @Given("I am on the register page")
    public void onTheRegisterPage(){
        register.onTheRegisterPage();
    }
    @When("I am enter my email and password correctly")
    public void enterEmailAndPassword(){
        register.enterEmailAndPassword();
    }
    @And("I click register button")
    public void clickRegisterButton(){
        register.clickRegisterButton();
    }
    @Then("I am on the loginn page")
    public void onTheLoginnPage(){
        register.onTheLoginnPage();
    }
}