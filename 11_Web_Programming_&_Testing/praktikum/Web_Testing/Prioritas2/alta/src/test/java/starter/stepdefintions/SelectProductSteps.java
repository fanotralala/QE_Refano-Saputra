package starter.stepdefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.IsipulsaPage;
import starter.pages.LoginPage;

public class SelectProductSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    IsipulsaPage IsipulsaPage;

    @Steps
    HomePage homePage;

    //// positive

    @Given("I am on the home page")
    public void onTheHomePage() {
        loginPage.openPage();
    }

    @When("I click Isi Pulsa product")
    public void clickIsiPulsa() {
        homePage.clickProductItem();
    }

    @And("I enter correct nomor handphone")
    public void inputNomorHandphone() {
        IsipulsaPage.inputNomorHandphone("081906037547");
    }

    @Then("I should be redirected to select nominal")
    public void validateOnSelectNominal() {
        IsipulsaPage.validateOnSelectNominal();
    }

    //// negative

    @And("I enter invalid nomor handphone")
    public void inputIncorrectNomorHandphone() {
        IsipulsaPage.inputNomorHandphone("081906037");
    }

    @Then("I should see the warning message")
    public void validateWarningMessage() {
        IsipulsaPage.validateWarningMessage();
    }

}
