import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouserightactionjava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	driver.get("https://demoqa.com/elements");
	driver.findElement(By.xpath("(//span[@class='text'])[5]")).click();
	Actions mouse  = new Actions(driver);
	mouse.contextClick(driver .findElement(By.id("rightClickBtn"))).build().perform();
	

	}

}
