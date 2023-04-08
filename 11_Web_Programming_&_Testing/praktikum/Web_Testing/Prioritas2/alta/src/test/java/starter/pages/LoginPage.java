package starter.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class LoginPage extends PageObject {

    private By loginButton() {
        return By.className("MuiButton-label");
    }

    private By emailField() {
        return By.id("email");
    }

    private By passwordField() {
        return By.id("password");
    }

    private By submitButton() {
        return By.id("submit_login");
    }

    private By alertNotification() {
        return By.id("alert_description");
    }

    @Step
    public void openPage() {
        open();
    }

    @Step
    public boolean validateOnLoginPage() {
        return $(loginButton()).isDisplayed();
    }

    @Step
    public void clickLoginButton() {
        $(loginButton()).click();
    }

    @Step
    public void inputEmail(String email) {
        $(emailField()).type(email);
    }

    @Step
    public void inputPassword(String password) {
        $(passwordField()).type(password);
    }

    @Step
    public void clickSubmitButton() {
        $(submitButton()).click();
    }

    @Step
    public boolean validateLoginSuccess() {
        return $(loginButton()).isDisplayed();
    }

    @Step
    public boolean incorrectCredentialAlert() {
        return $(alertNotification()).isDisplayed();
    }

}
