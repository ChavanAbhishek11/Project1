package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class facebook2 {
	WebDriver driver = new ChromeDriver();
	@Given("User is on facebook page")
	public void user_is_on_facebook_page() {
		driver.get("https://www.facebook.com");
		
	    
	}

	@When("user enter valid  email id and valid password")
	public void user_enter_valid_email_id_and_valid_password() {
		driver.findElement(By.name("email")).sendKeys("100027998746741");
		driver.findElement(By.name("pass")).sendKeys("pratik*123");
	    
	}

	@Then("User click on login button")
	public void user_click_on_login_button() {
		driver.findElement(By.xpath("//button[@value='1']")).click();
	    
	}

	@Then("User will navigate to next page")
	public void user_will_navigate_to_next_page() {
	    
	}
	

}
