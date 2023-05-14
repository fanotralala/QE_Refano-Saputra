package test.automation.pages;

import io.appium.java_client.MobileBy;
import net.thucydides.core.annotations.Step;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import test.automation.pageobject.BasePageObject;
import com.github.javafaker.Faker;

public class RegisterScreen extends BasePageObject {

    public String name = createRandomName();
    
    By textRegister(){ 
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }

    By fieldFullName(){ 
        return MobileBy.xpath("//android.view.View/android.widget.EditText[1]");
    }

    By fieldEmail(){ 
        return MobileBy.xpath("//android.view.View/android.widget.EditText[2]");
    }

    By fieldPassword() { 
        return MobileBy.xpath("//android.view.View/android.widget.EditText[3]");
    }

    By buttonRegister() { 
        return MobileBy.xpath("//android.widget.Button[@content-desc=\"Register\"]");
    }

    By fieldAlertFullname(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"fullname can not empty\"]");
    }

    By fieldAlertEmail(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"email can not empty\"]");
    }

    By fieldAlertPassword(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"password can not empty\"]");
    }
    
    By buttonAlert(){ 
        return MobileBy.xpath("//android.view.View[@content-desc=\"Gagal :(\"]");
    }

    public void clickTextRegister(){ 
        click(textRegister());
    }

    public void inputFieldFullName(String fullname) {
        Faker faker = new Faker();
        name = faker.name().fullName();
        click(fieldFullName());
        clear(fieldFullName());
        onType(fieldFullName(), createRandomName());
    }

    public void inputEmptyFullName(String fullname) {
        click(fieldFullName());
        clear(fieldFullName());
        sendKeys(fieldFullName(),fullname);
    }

    public void inputEmail(String email){
        click(fieldEmail());
        clear(fieldEmail());
        onType(fieldEmail(), createRandomName() + "@gmail.com");
    }

    public void inputEmptyEmail(String email){
        click(fieldEmail());
        clear(fieldEmail());
        sendKeys(fieldEmail(),email);
    }

    public void inputPassword(String password){
        click(fieldPassword());
        clear(fieldPassword());
        sendKeys(fieldPassword(),password);
    }

    public void inputEmptyPassword(String password){
        click(fieldPassword());
        clear(fieldPassword());
        sendKeys(fieldPassword(),password);
    }

    public void clickButtonRegister(){ 
        click(buttonRegister());
    }

    public void verifyAlertFullname(){ 
        Assertions.assertTrue(find(fieldAlertFullname()).isDisplayed());
    }

    public void verifyAlertEmail(){ 
        Assertions.assertTrue(find(fieldAlertEmail()).isDisplayed());
    }

    public void verifyAlertPassword(){ 
        Assertions.assertTrue(find(fieldAlertPassword()).isDisplayed());
    }

    public void verifyAlertButton() { 
        Assertions.assertTrue(find(buttonAlert()).isDisplayed());
    }

    public String createRandomName(){
        Faker faker = new Faker();
        return faker.name().firstName();
    }
}
