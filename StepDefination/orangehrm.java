package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class orangehrm {
	WebDriver driver = new ChromeDriver();
	@Given("User is on orange HRM URL")
	public void user_is_on_orange_hrm_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}


}
