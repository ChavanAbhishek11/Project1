package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Robot {
	WebDriver driver = new ChromeDriver();
 Robot robot = new Robot();

@Given("Open Facebook Url")
public void open_facebook_url() {
	driver.get("https://www.facebook.com/");
    
}

@When("I enter  valid email id and valid password")
public void i_enter_valid_email_id_and_valid_password() {
	driver.findElement(By.name("email")).sendKeys("100027998746741");
	driver.findElement(By.name("pass")).sendKeys("pratik*123");
    
}

@When("I press enter")
public void i_press_enter() {
	
	
	
    
}

@Then("user go to next page")
public void user_go_to_next_page() {
   
}

}
