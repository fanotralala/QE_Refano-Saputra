package starter.post;

import net.thucydides.core.annotations.Step;

public class Post {
    @Step("I am on the main page")
    public void onTheMainPage(){
        System.out.println("I am on the main page");
    }
    @Step("When I am enter my status correctly")
    public void enterStatus(){
        System.out.println("When I am enter my status correctly");
    }
    @Step("I click post button")
    public void clickPostButton(){
        System.out.println("I click post button");
    }
    @Step("I can see the post")
    public void onTheMainnPage(){
        System.out.println("I can see the post");
    }
}