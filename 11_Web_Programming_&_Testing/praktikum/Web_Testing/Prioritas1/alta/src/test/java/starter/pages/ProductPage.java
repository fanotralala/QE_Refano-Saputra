package starter.pages;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;

public class ProductPage extends PageObject {

    private By theProduct() {
        return By.id("item_5_title_link");
    }

    private By addToCart() {
        return By.id("add-to-cart-sauce-labs-fleece-jacket");
    }

    private By cartIcon() {
        return By.className("shopping_cart_link");
    }

    private By titleProducts() {
        return By.className("title");
    }

    private By menuButton(){
        return By.id("react-burger-menu-btn");
    }

    private By logoutButton(){
        return By.id("logout_sidebar_link");
    }

    @Step
    public boolean validateOnProductPage() {
        return $(titleProducts()).isDisplayed();
    }

    @Step
    public void clickTheProduct() {
        $(theProduct()).click();
    }

    @Step
    public void clickAddToCart() {
        $(addToCart()).click();
    }

    @Step
    public void clickCartIcon() {
        $(cartIcon()).click();
    }

    @Step
    public boolean validateTheProductHasBeenAdded() {
        return $(titleProducts()).isDisplayed();
    }

    @Step
    public void clickMenuButton(){
        $(menuButton()).click();
    }

    @Step
    public void clickLogoutButton(){
        $(logoutButton()).click();
    }

}
