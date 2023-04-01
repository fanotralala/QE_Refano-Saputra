package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.sepulsa.Sepulsa;

public class SepulsaSteps {
    @Steps
    Sepulsa sepulsa;

    @Given("User is on Sepulsa homepage")
    public void sepulsa11() {
        sepulsa.sepulsa1();
    }

    @When("User clicks on Login button")
    public void sepulsa12() {
        sepulsa.sepulsa2();
    }

    @And("User enters valid email and password")
    public void sepulsa13() {
        sepulsa.sepulsa3();
    }

    @And("User clicks on Loginn button")
    public void sepulsa14() {
        sepulsa.sepulsa4();
    }

    @Then("User should be redirected to Sepulsa dashboard")
    public void sepulsa15() {
        sepulsa.sepulsa5();
    }

    @When("User clicks on Top Up button")
    public void sepulsa16() {
        sepulsa.sepulsa6();
    }

    @And("User selects a product")
    public void sepulsa17() {
        sepulsa.sepulsa7();
    }

    @And("User selects payment method")
    public void sepulsa18() {
        sepulsa.sepulsa8();
    }

    @And("User completes the payment process")
    public void sepulsa19() {
        sepulsa.sepulsa9();
    }

    @Then("User should receive a successful top up message")
    public void sepulsa20() {
        sepulsa.sepulsa10();
    }
}