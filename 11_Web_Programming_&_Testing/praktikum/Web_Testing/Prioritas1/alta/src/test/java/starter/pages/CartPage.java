package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

import org.openqa.selenium.By;

public class CartPage extends PageObject {

    private By cartTitle() {
        return By.className("title");
    }

    private By checkoutButton() {
        return By.id("checkout");
    }

    private By firstNameField() {
        return By.id("first-name");
    }

    private By lastNameField() {
        return By.id("last-name");
    }

    private By PostalCodeField() {
        return By.id("postal-code");
    }

    private By continueButton() {
        return By.id("continue");
    }

    private By errorMessage() {
        return By.className("error-button");
    }

    private By orderSuccessTitle() {
        return By.className("complete-header");
    }

    private By backHome() {
        return By.id("back-to-products");
    }

    @Step
    public boolean validateOnCartPage() {
        return $(cartTitle()).isDisplayed();
    }

    @Step
    public void clickCheckoutButton() {
        $(checkoutButton()).click();
    }

    @Step
    public void inputFirstName(String firstName) {
        $(firstNameField()).type(firstName);
    }

    @Step
    public void inputLastName(String lastName) {
        $(lastNameField()).type(lastName);
    }

    @Step
    public void inputPostalCode(String postalCode) {
        $(PostalCodeField()).type(postalCode);
    }

    @Step
    public void clickContinueButton() {
        $(continueButton()).click();
    }

    @Step
    public void errorMessageDisplayed() {
        $(errorMessage()).isDisplayed();
    }

    @Step
    public void clickBackHome() {
        $(backHome()).click();
    }

    @Step
    public void validateCompleteCheckout(){
        $(orderSuccessTitle()).isDisplayed();
    }

}
