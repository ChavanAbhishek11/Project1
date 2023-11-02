package StepDefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {

@Given("user is on login page")
public void user_is_on_login_page() {
	System.out.println("Inside Steps user is on login page");
    
    
}

@When("user will enter valid credential id and password")
public void user_will_enter_valid_credential_id_and_password() {
	System.out.println("Inside steps user will enter valid credential");
    
    
}

@When("user click on login button")
public void user_click_on_login_button() {
	System.out.println("Inside steps user click on login button");
    
    
}

@Then("user navigate to next page")
public void user_navigate_to_next_page() {
    
    System.out.println("Inside steps user navigate to page");
}

}
