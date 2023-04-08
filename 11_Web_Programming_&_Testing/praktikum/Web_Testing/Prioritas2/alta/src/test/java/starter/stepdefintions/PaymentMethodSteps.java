package starter.stepdefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.pages.HomePage;
import starter.pages.IsipulsaPage;
import starter.pages.LoginPage;

public class PaymentMethodSteps {
    @Steps
    LoginPage loginPage;

    @Steps
    IsipulsaPage listrikplnPage;

    @Steps
    HomePage homePage;

    @Steps
    SelectProductSteps selectProductSteps;

    //// Positive

    @Given("I am on the Isi Pulsa Page")
    public void onTheIsiPulsaPage() {
        loginPage.openPage();
        loginPage.clickLoginButton();
        loginPage.inputEmail("averilprimayuda@gmail.com");
        loginPage.inputPassword("Saidentident-123");
        loginPage.clickSubmitButton();
    }

    @When("I am input nomor handphone")
    public void proceedsToCheckout() {
        homePage.clickProductItem();
        selectProductSteps.inputNomorHandphone();
    }

    @And("I choose the Nominal of Pulsa")
    public void chooseNominal() {
        listrikplnPage.chooseNominal();
    }

    @Then("I select the payment method with DANA")
    public void selectPaymentMethod() {
        listrikplnPage.choosePaymentMethod();
    }

    //// Negative

    @Given("I already login with correct account send go to the Isi Pulsa Page")
    public void AlreadySignInPage() {
        loginPage.openPage();
        loginPage.clickLoginButton();
        loginPage.inputEmail("andiramahendra13@gmail.com");
        loginPage.inputPassword("mahendra13");
        loginPage.clickSubmitButton();
    }

    @When("I do not select any payment method and click Bayar Sekarang button")
    public void clickBayarSekarang() {
        listrikplnPage.clickBayarSekarang();
    }

    @Then("I should see a reminder message")
    public void validateReminderMessage() {
        listrikplnPage.validateReminderMessage();
    }
}
