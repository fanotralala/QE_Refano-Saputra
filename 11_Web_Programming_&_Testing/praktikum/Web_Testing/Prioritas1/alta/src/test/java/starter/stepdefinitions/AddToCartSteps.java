package starter.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.LoginPage;
import starter.pages.ProductPage;

public class AddToCartSteps {

    @Steps
    LoginPage loginPage;

    @Steps
    ProductPage productPage;

    @Given("I am on the Saucedemo login page")
    public void onTheLoginPage() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }

    @When("I log in with valid credentials")
    public void loginWithValid() {
        loginPage.inputUserName("standard_user");
        loginPage.inputPassword("secret_sauce");
        loginPage.clickLoginButton();
    }

    @And("I navigate to the products page")
    public void onTheProductPage() {
        productPage.validateOnProductPage();
    }

    @And("I select a product to add to my cart")
    public void selectProduct() {
        productPage.clickTheProduct();
    }

    @And("I click Add to Cart button")
    public void AddToCart() {
        productPage.clickAddToCart();
    }

    @And("I check my cart")
    public void checkMyCart() {
        productPage.clickCartIcon();
    }

    @Then("the item should be added to my cart")
    public void validateTheProductHasBeenAdded() {
        productPage.clickCartIcon();
    }

}
