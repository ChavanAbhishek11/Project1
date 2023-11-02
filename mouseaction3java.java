import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseaction3java {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://demoqa.com/elements");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//span[@class='text'])[5]")).click();
		Actions mouse = new Actions(driver);
		mouse.doubleClick(driver.findElement(By.xpath("(//button[@class='btn btn-primary'])[1]"))).build().perform();
		
		

	}

}
