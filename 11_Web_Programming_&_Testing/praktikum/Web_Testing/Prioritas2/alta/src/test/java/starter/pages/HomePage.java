package starter.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.Step;

public class HomePage extends PageObject {

    private By productItem() {
        return By.id("product_type_0");
    }

    @Step
    public boolean validateOnHomePage() {
        return $(productItem()).isDisplayed();
    }

    @Step
    public void clickProductItem(){
        $(productItem()).click();
    }

}
