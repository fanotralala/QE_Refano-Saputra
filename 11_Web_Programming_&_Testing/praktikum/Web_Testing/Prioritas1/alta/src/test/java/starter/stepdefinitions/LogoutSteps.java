package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.CartPage;
import starter.pages.LoginPage;
import starter.pages.ProductPage;

public class LogoutSteps {
    @Steps
    CartPage cartPage;

    @Steps
    ProductPage productPage;

    @Steps
    LoginPage loginPage;

    @Given("I am on the checkout page")
    public void onTheCartPage() {
        cartPage.validateOnCartPage();
    }

    @When("I have completed the checkout process")
    public void validateCompleteCheckout() {
        cartPage.validateCompleteCheckout();
    }

    @And("I click on the Back Home button")
    public void clickBackHome() {
        cartPage.clickBackHome();
    }

    @And("I click on the Menu button")
    public void clickMenuButton() {
        productPage.clickMenuButton();
    }

    @And("I click on the Logout button")
    public void clickLogoutButton() {
        productPage.clickLogoutButton();
    }

    @Then("I should be logged out of my account and redirected to the login page")
    public void validateOnLoginPage() {
        loginPage.validateOnLoginPage();
    }
}
