package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class webtable {
	WebDriver driver = new ChromeDriver();

@Given("open browser url")
public void open_browser_url() {
	driver.get("file:///C:/Users/chava/Downloads/WebTable.html");
	String value = driver.findElement(By.xpath("//tr[3]/td[3]")).getText();
	System.out.println("value is " +value);
   
}


}
