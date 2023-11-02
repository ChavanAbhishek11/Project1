package StepDefination;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class mouseaction {
	WebDriver driver = new ChromeDriver();
	@Given("Open jqueryui url")
	public void open_jqueryui_url() {
		driver.get("https://jqueryui.com/");
		
	    
	}

	@When("I click on the link {string}")
	public void i_click_on_the_link(String string) {
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Draggable")).click();
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		Actions mouse = new Actions(driver);
		mouse.dragAndDropBy(driver.findElement(By.id("draggable")), 100, 100).build().perform();
		
	   
	}


}
