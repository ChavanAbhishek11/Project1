package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Assertio {
	WebDriver driver = new ChromeDriver();
	SoftAssert softassert = new SoftAssert();
	@Given("open orange hrm url")
	public void open_orange_hrm_url() {
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	@When("user enter valid username and valid password")
	public void user_enter_valid_username_and_valid_password() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String actualresult= "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		String expectedresult ="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		softassert .assertEquals(actualresult, expectedresult);
		softassert.assertAll();
		driver.close();
		
	    
	}


}
