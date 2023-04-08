package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CartPage;

public class CartSteps {

    @Steps
    CartPage cartPage;

    @Given("I am on the shopping cart page")
    public void onTheCartPage() {
        cartPage.validateOnCartPage();
    }

    @When("I click on checkout button")
    public void clickCheckoutButton() {
        cartPage.clickCheckoutButton();
    }

    @And("I do not provide postal code")
    public void inputMyInformation() {
        cartPage.inputFirstName("Andira");
        cartPage.inputLastName("MS");
        cartPage.inputPostalCode("");
    }

    @And("I click on continue button")
    public void clickContinueButton() {
        cartPage.clickContinueButton();
    }

    @Then("I should see an error message for missing postal code")
    public void errorMessageDisplayed() {
        cartPage.errorMessageDisplayed();
    }

}
