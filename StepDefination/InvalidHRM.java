package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InvalidHRM {
	WebDriver driver = new ChromeDriver();
	SoftAssert softassert = new SoftAssert();

@Given("open orange HRM URL")
public void open_orange_hrm_url() {
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    
}

@When("user enter valid username and wrong password")
public void user_enter_valid_username_and_wrong_password() throws InterruptedException {
	Thread.sleep(1000);
	driver.findElement(By.name("username")).sendKeys("Admin");
	driver.findElement(By.name("password")).sendKeys("admin123456");
	driver.findElement(By.xpath("//button[@type='submit']")).click();
    
}

@Then("user will give error message")
public void user_will_give_error_message() {
	
	String actualmessage = "wrong password";
	String expectedmessage = "Error come in password";
	softassert.assertEquals(actualmessage, expectedmessage);
	
    
}



}
