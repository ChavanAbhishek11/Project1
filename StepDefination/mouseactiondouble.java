package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class mouseactiondouble {
	WebDriver driver = new ChromeDriver();
	@Given("Open Demoaqs URL")
	public void open_demoaqs_url() {
		driver.get("https://demoqa.com/elements");
		
	   
	}

	@When("I click on button")
	public void i_click_on_button() {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//span[contains(text(),'Buttons')]")).click();
		Actions mouse = new Actions(driver);
		mouse.doubleClick();
		
	    
	}

}
