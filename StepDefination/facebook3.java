package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class facebook3 {
	WebDriver driver = new ChromeDriver();

@Given("Open facebook url")
public void open_facebook_url() {
	driver.get("https://www.facebook.com");
	
	
    
}

@When("I enter valid email id and valid password")
public void i_enter_valid_email_id_and_valid_password() {
	driver.findElement(By.name("email")).sendKeys("100027998746741");
	driver.findElement(By.name("pass")).sendKeys("pratik*123");
   
}

@When("I click on login button")
public void i_click_on_login_button() {
	driver.findElement(By.xpath("//button[@value='1']")).click();
   
}



}
