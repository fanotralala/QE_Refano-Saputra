package starter.stepdefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.LoginPage;

public class LoginSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    HomePage homePage;

    ////positive

    @Given("I am on the Sepulsa login page")
    public void onTheLoginPage() {
        loginPage.openPage();
        loginPage.validateOnLoginPage();
    }

    @When("I click login button")
    public void clickLoginButton() {
        loginPage.clickLoginButton();
    }

    @And("I enter correct email")
    public void inputEmail() {
        loginPage.inputEmail("velgo.refa@gmail.com");
    }

    @And("I enter correct password")
    public void inputPassword() {
        loginPage.inputPassword("Refalicious123");
    }

    @And("I click on the submit button")
    public void clickSubmitButton() {
        loginPage.clickSubmitButton();
    }

    @Then("I should be redirected to my Sepulsa account dashboard")
    public void validateLoginSuccess() {
        loginPage.validateLoginSuccess();
    }

    ////negative

    @And("I enter incorrect password")
    public void inputIncorrectPassword() {
        loginPage.inputPassword("Refalicious");
    }

    @Then("I should see the error message")
    public void credentialAlert() {
        loginPage.incorrectCredentialAlert();
    }

}
