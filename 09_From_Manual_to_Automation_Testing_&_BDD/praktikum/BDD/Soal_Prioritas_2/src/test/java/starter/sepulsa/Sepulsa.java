package starter.sepulsa;

import net.thucydides.core.annotations.Step;

public class Sepulsa {
    @Step("User is on Sepulsa homepage")
    public void sepulsa1(){
        System.out.println("User is on Sepulsa homepage");
    }
    @Step("User clicks on Login button")
    public void sepulsa2(){
        System.out.println("User clicks on Login button");
    }
    @Step("User enters valid email and password")
    public void sepulsa3(){
        System.out.println("User enters valid email and password");
    }
    @Step("User clicks on Loginn button")
    public void sepulsa4(){
        System.out.println("User clicks on Loginn button");
    }
    @Step("User should be redirected to Sepulsa dashboard")
    public void sepulsa5(){
        System.out.println("User should be redirected to Sepulsa dashboard");
    }
    @Step("User clicks on Top Up button")
    public void sepulsa6(){
        System.out.println("User clicks on Top Up button");
    }
    @Step("User selects a product")
    public void sepulsa7(){
        System.out.println("User selects a product");
    }
    @Step("User selects payment method")
    public void sepulsa8(){
        System.out.println("User selects payment method");
    }
    @Step("User completes the payment process")
    public void sepulsa9(){
        System.out.println("User completes the payment process");
    }
    @Step("I am on the home page")
    public void sepulsa10(){
        System.out.println("User should receive a successful top up message");
    }

}