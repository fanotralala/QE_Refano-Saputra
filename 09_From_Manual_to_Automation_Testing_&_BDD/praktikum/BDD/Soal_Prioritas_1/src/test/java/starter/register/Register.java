package starter.register;

import net.thucydides.core.annotations.Step;

public class Register {
    @Step("I am on the register page")
    public void onTheRegisterPage(){
        System.out.println("I am on the register page");
    }
    @Step("I am enter my email and password correctly")
    public void enterEmailAndPassword(){
        System.out.println("I enter my email and password correctly");
    }
    @Step("I click register button")
    public void clickRegisterButton(){
        System.out.println("I click register button");
    }
    @Step("I am on the loginn page")
    public void onTheLoginnPage(){
        System.out.println("I am on the login page");
    }
}